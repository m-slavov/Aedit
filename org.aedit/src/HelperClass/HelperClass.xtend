package HelperClass

//import org.xtext.example.mydsl.myAvdl.AvroIDLFactory

import avroclipse.avroIDL.Annotation
import avroclipse.avroIDL.AvroIDLFile
import avroclipse.avroIDL.EnumType
import avroclipse.avroIDL.ErrorType
import avroclipse.avroIDL.Field
import avroclipse.avroIDL.RecordType
import avroclipse.avroIDL.Type
import avroclipse.avroIDL.TypeDef
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.ObjectInputStream
import java.io.ObjectOutputStream
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.EcoreUtil2

class HelperClass {

	final static String AVROCLIPSE_GRAMMAR_EXTENSION = "avdl"

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

	static Map<String, AvroIDLFile> protocols = new HashMap<String, AvroIDLFile>();

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

	def static removeAnnotationFromSchema(TypeDef typeDef, Annotation annotationToRemove) {
		val List<Annotation> found = new ArrayList<Annotation>()

		for (annotation : typeDef.annotations) {
			if (annotation.name.equals(annotationToRemove.name)) {
				found.add(annotation)
			}
		}

		typeDef.annotations.removeAll(found)
	}

	def static removeAnnotationFromField(Field field, Annotation annotationToRemove) {
		val List<Annotation> found = new ArrayList<Annotation>()

		for (annotation : field.annotations) {
			if (annotation.name.equals(annotationToRemove.name)) {
				found.add(annotation)
			}
		}

		field.annotations.removeAll(found)
	}

	def static removeNameAnnotationFromField(Field field, Annotation annotationToRemove) {
		val List<Annotation> found = new ArrayList<Annotation>()

		for (annotation : field.nameAnnotations) {
			if (annotation.name.equals(annotationToRemove.name)) {
				found.add(annotation)
			}
		}

		field.nameAnnotations.removeAll(found)
	}

	def static getField(String protocolName, String schemaName, String fieldName, Map<String, AvroIDLFile> avdlFiles) {
		val typeDefs = avdlFiles.get(protocolName).elements.filter(TypeDef).toList

		for (typeDef : typeDefs) {

			val schema = typeDef.type
			if (schema instanceof RecordType) {
				if (schema.name.equals(schemaName)) {
					for (field : schema.fields) {
						if (field.name.equals(fieldName)) {
							return field
						}
					}
				}
			} else if (schema instanceof ErrorType) {
				if (schema.name.equals(schemaName)) {
					for (field : schema.fields) {
						if (field.name.equals(fieldName)) {
							return field
						}
					}
				}
			}

		}
	}

	def static getFieldFromSchema(Type schema, String fieldName) {
		if (schema instanceof RecordType) {
			for (field : schema.fields) {
				if (field.name.equals(fieldName)) {
					return field
				}
			}
		} else if (schema instanceof ErrorType) {
			for (field : schema.fields) {
				if (field.name.equals(fieldName)) {
					return field
				}
			}
		}
	}

	def static getSchema(String protocolName, String schemaName, Map<String, AvroIDLFile> avdlFiles) {
		val typeDefs = avdlFiles.get(protocolName).elements.filter(TypeDef).toList

		for (typeDef : typeDefs) {

			val schema = typeDef.type
			if (schema instanceof RecordType) {
				if (schema.name.equals(schemaName)) {
					return schema
				}
			} else if (schema instanceof ErrorType) {
				if (schema.name.equals(schemaName)) {
					return schema
				}
			}

		}
	}

}
