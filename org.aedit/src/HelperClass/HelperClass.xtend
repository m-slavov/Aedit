package HelperClass

//import org.xtext.example.mydsl.myAvdl.AvdlClipseFactory
import org.xtext.example.org.xtext.example.avdlclipse.avdlClipse.AvdlClipseFactory
import org.aedit.aedit.Field
//import org.xtext.example.mydsl.myAvdl.Value
import org.xtext.example.org.xtext.example.avdlclipse.avdlClipse.Value
import java.io.ByteArrayOutputStream
import java.io.ObjectOutputStream
import java.io.ByteArrayInputStream
import java.io.ObjectInputStream
import java.io.File
import java.util.Map
//import org.xtext.example.mydsl.myAvdl.AvroIDLFile
import org.xtext.example.org.xtext.example.avdlclipse.avdlClipse.AvroIDLFile
import java.util.HashMap
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.EcoreUtil2
import org.aedit.aedit.IntValue
import org.aedit.aedit.StringValue
import org.aedit.aedit.FloatValue
import java.util.List
import com.google.common.io.Files
import org.eclipse.emf.ecore.resource.ResourceSet
import org.xtext.example.org.xtext.example.avdlclipse.avdlClipse.TypeDef
import org.xtext.example.org.xtext.example.avdlclipse.avdlClipse.EnumType
import org.xtext.example.org.xtext.example.avdlclipse.avdlClipse.RecordType
import java.util.ArrayList

class HelperClass {

	private final static String AVROCLIPSE_GRAMMAR_EXTENSION = "avdlclipse"

	def static createField(Field field) {

		var newField = AvdlClipseFactory.eINSTANCE.createField => [
			name = field.varName
			type = AvdlClipseFactory.eINSTANCE.createPrimativeTypeLink => [
				target = field.type
			]
			
			if (field.value !== null){
				
			var Value defValue;
				switch (field.type) {
					case 'int':
						defValue = AvdlClipseFactory.eINSTANCE.createIntValue => [
							^val = (field.value as IntValue).^val
						]
					case 'double':
						defValue = AvdlClipseFactory.eINSTANCE.createFloatValue => [
							^val = (field.value as FloatValue).^val
						]
					case 'string':
						defValue = AvdlClipseFactory.eINSTANCE.createStringValue => [
							^val = (field.value as StringValue).^val
						]
					case 'long':
						defValue = AvdlClipseFactory.eINSTANCE.createIntValue => [
							^val = (field.value as IntValue).^val
						]
				}
				^default = defValue
			}
		]

		return newField
	}

//	def static Object getValue(org.aedit.aedit.Value value){
//		if (value.string !== null){
//			value.string
//		} else if (value.float !== 0.0){
//			value.float
//		} else if (value.int !== 0){
//			value.int
//		} else {
//			value.float
//		}
//	}
	def static boolean tryParseInt(String value) {
		try {
			Integer.parseInt(value)
			return true;
		} catch (Exception exception) {
			return false;
		}
	}

	def static boolean tryParseFloat(String value) {
		try {
			Float.parseFloat(value)
			return true;
		} catch (Exception exception) {
			return false;
		}
	}

	def static boolean tryParseLong(String value) {
		try {
			Long.parseLong(value)
			return true;
		} catch (Exception exception) {
			return false;
		}
	}

	def static Object deepCopy(Object object) {
		try {
			var ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			var ObjectOutputStream outputStrm = new ObjectOutputStream(outputStream);
			outputStrm.writeObject(object)
			var ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
			var ObjectInputStream objInputStream = new ObjectInputStream(inputStream);
			return objInputStream.readObject();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	private static Map<String, AvroIDLFile> protocols = new HashMap<String, AvroIDLFile>();
//	private static String filePath = "D:\\School\\runtime-EclipseXtext\\Testbench\\src\\avdl\\";
	private static String filePath = "D:\\School\\runtime-EclipseXtext\\Testbench\\src\\avdl\\";

	def static getAvroFiles(Resource resource) {

		for (res : resource.resourceSet.resources) {

			var fileExtension = res.URI.fileExtension

			if (fileExtension !== null && fileExtension.equals(AVROCLIPSE_GRAMMAR_EXTENSION)) {
				if (!res.contents.isEmpty) {
					var avdlModel = EcoreUtil2.copy(res.contents.get(0) as AvroIDLFile)
					protocols.put(avdlModel.name, avdlModel)
				}
			}
		}

		return protocols
	}

	// Helper methods for importing avdl files
	def private static loadAvroIDLFile(URI uri, Resource resource) {

		// Load the model from the original file
		val res = resource.resourceSet.getResource(uri, true)
		val originalAvroFile = res.contents.get(0) as AvroIDLFile

		// Create a copy, otherwise cross references can be messed up during the editing
		val copyAvroFile = EcoreUtil2.copy(originalAvroFile)

		return copyAvroFile
	}

	def private static getFiles(String directoryName, Resource resource) {
		val directory = new File(directoryName);

		// Get all files from a directory.
		val File[] fList = directory.listFiles();
		if (fList !== null)
			for (File file : fList) {
				if (file.isFile()) {

					if (Files.getFileExtension(file.getPath()).equals("avdlclipse")) {
						var avroIDLFile = loadAvroIDLFile(URI.createFileURI(file.path), resource)
						protocols.put(avroIDLFile.name, avroIDLFile);
					}

				} else if (file.isDirectory()) {
					getFiles(file.getAbsolutePath(), resource);
				}
			}
	}

	def static getSchemasAndFields(AvroIDLFile file) {
		val List<String> existingVariables = new ArrayList<String>()

		for (typeDef : file.elements.filter(TypeDef)) {
			var currentSchema = typeDef.type

			if (currentSchema instanceof EnumType) {
				existingVariables.add(file.name + '.' + currentSchema.name)
				for (literal : currentSchema.literals) {
					existingVariables.add(file.name + '.' + currentSchema.name + '.' + literal)
				}
			} else if (currentSchema instanceof RecordType) {
				existingVariables.add(file.name + '.' + currentSchema.name)
				for (field : currentSchema.fields) {
					existingVariables.add(file.name + '.' + currentSchema.name + '.' + field.name)
				}
			}

		}

		return existingVariables
	}

}
