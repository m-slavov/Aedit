package HelperClass

import org.xtext.example.mydsl.myAvdl.MyAvdlFactory
import org.aedit.aedit.Field
import org.xtext.example.mydsl.myAvdl.Value
import java.io.ByteArrayOutputStream
import java.io.ObjectOutputStream
import java.io.ByteArrayInputStream
import java.io.ObjectInputStream
import java.io.File
import java.util.Map
import org.xtext.example.mydsl.myAvdl.AvroIDLFile
import java.util.HashMap
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.EcoreUtil2
import org.aedit.aedit.IntValue
import org.aedit.aedit.StringValue
import org.aedit.aedit.FloatValue

class HelperClass {
	
	def static createField(Field field) {
		
		var newField = MyAvdlFactory.eINSTANCE.createField => [
			name = field.varName
			type = MyAvdlFactory.eINSTANCE.createPrimativeTypeLink => [
				target = field.type
			]

			var Value defValue;
			switch (field.type) {
				case 'int':
					defValue = MyAvdlFactory.eINSTANCE.createIntValue => [
						^val = (field.value as IntValue).^val
					]
				case 'double':
					defValue = MyAvdlFactory.eINSTANCE.createFloatValue => [
						^val = (field.value as FloatValue).^val
					]
				case 'string':
					defValue = MyAvdlFactory.eINSTANCE.createStringValue => [
						^val = (field.value as StringValue).^val
					]
				case 'long':
					defValue = MyAvdlFactory.eINSTANCE.createIntValue => [
						^val = (field.value as IntValue).^val
					]
			}
			^default = defValue
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
	   }
	   catch (Exception e) {
	     e.printStackTrace();
	     return null;
	   }
 	}
 	
 	private static Map<String, AvroIDLFile> protocols = new HashMap<String, AvroIDLFile>();
	private static String filePath = "D:\\School\\runtime-EclipseXtext\\Testbench\\src\\avdl";
 	
 	def static getAvroFiles(Resource resource){
 		val dir = new File(filePath)
		val directoryListing = dir.listFiles();
						
		// Load all avdl files from the folder
		directoryListing?.forEach [ file |
			var avroIDLFile = loadAvroIDLFile(URI.createURI("platform:/resource/Testbench/src/avdl/" + file.name),
				resource)
			protocols.put(avroIDLFile.name, avroIDLFile);
		]

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
	
}