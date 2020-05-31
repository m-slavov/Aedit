package HelperClass

//import org.xtext.example.mydsl.myAvdl.AvroIDLFactory
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.ObjectInputStream
import java.io.ObjectOutputStream
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import org.aedit.aedit.BooleanValue
import org.aedit.aedit.Field
import org.aedit.aedit.FloatValue
import org.aedit.aedit.IntValue
import org.aedit.aedit.StringValue
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.EcoreUtil2
import avroclipse.avroIDL.AvroIDLFactory
import avroclipse.avroIDL.AvroIDLFile
import avroclipse.avroIDL.EnumType
import avroclipse.avroIDL.RecordType
import avroclipse.avroIDL.TypeDef
import avroclipse.avroIDL.Value
import org.aedit.aedit.PrimitiveTypeField
import org.aedit.aedit.CustomTypeField

class HelperClass {

	private final static String AVROCLIPSE_GRAMMAR_EXTENSION = "avdl"

	def static createField(Field field) {

		if (field instanceof PrimitiveTypeField) {
			return createPrimitiveTypeField(field)
		} else if (field instanceof CustomTypeField) {
			return createCustomTypeField(field)
		}

	}

	def private static createPrimitiveTypeField(PrimitiveTypeField field) {
		var newField = AvroIDLFactory.eINSTANCE.createField => [
			name = field.varName
			type = AvroIDLFactory.eINSTANCE.createPrimativeTypeLink => [
				target = field.type
			]

			if (field.value !== null) {

				var Value defValue;
				switch (field.type) {
					case 'int':
						defValue = AvroIDLFactory.eINSTANCE.createIntValue => [
							^val = (field.value as IntValue).^val
						]
					case 'double':
						defValue = AvroIDLFactory.eINSTANCE.createFloatValue => [
							^val = (field.value as FloatValue).^val
						]
					case 'string':
						defValue = AvroIDLFactory.eINSTANCE.createStringValue => [
							^val = (field.value as StringValue).^val
						]
					case 'long':
						defValue = AvroIDLFactory.eINSTANCE.createIntValue => [
							^val = (field.value as IntValue).^val
						]
					case 'float':
						defValue = AvroIDLFactory.eINSTANCE.createFloatValue => [
							^val = (field.value as FloatValue).^val
						]
					case 'boolean':
						defValue = AvroIDLFactory.eINSTANCE.createBooleanValue => [
							^val = (field.value as BooleanValue).^val
						]
				}
				^default = defValue
			}
		]

		return newField
	}

	def private static createCustomTypeField(CustomTypeField field) {
		var newField = AvroIDLFactory.eINSTANCE.createField => [
			name = field.varName
			type = AvroIDLFactory.eINSTANCE.createCustomTypeLink => [
				target = field.type
			]
		]

		return newField
	}

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
