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
import avroclipse.avroIDL.Value
import avroclipse.avroIDL.StringValue
import avroclipse.avroIDL.IntValue
import avroclipse.avroIDL.FloatValue
import avroclipse.avroIDL.BooleanValue
import org.aedit.aedit.PrimitiveTypeField
import org.aedit.aedit.CustomTypeField
import org.aedit.aedit.ComplexTypeField

class HelperClass {

	final static String AVROCLIPSE_GRAMMAR_EXTENSION = "avdl"
	final static String ENUM = 'enum'
	final static String ERROR = 'error'
	final static String RECORD = 'record'

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

	def static getSchemasAndFields(AvroIDLFile file, List<String> annotations, List<String> nameAnnotations) {
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

					for (annotation : field.annotations) {
						annotations.add(file.name + '.' + currentSchema.name + '.' + field.name + '.' + annotation.name)
					}

					for (nameAnnotation : field.nameAnnotations) {
						nameAnnotations.add(file.name + '.' + currentSchema.name + '.' + field.name + '.' +
							nameAnnotation.name)
					}

				}
			} else if (currentSchema instanceof ErrorType) {
				existingVariables.add(file.name + '.' + currentSchema.name)
				for (field : currentSchema.fields) {
					existingVariables.add(file.name + '.' + currentSchema.name + '.' + field.name)

					for (annotation : field.annotations) {
						annotations.add(file.name + '.' + currentSchema.name + '.' + field.name + '.' + annotation.name)
					}

					for (nameAnnotation : field.nameAnnotations) {
						nameAnnotations.add(file.name + '.' + currentSchema.name + '.' + field.name + '.' +
							nameAnnotation.name)
					}
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

	def static getValue(Value value) {
		switch (value) {
			StringValue: value.^val
			IntValue: value.^val
			FloatValue: value.^val
			BooleanValue: value.^val
			default: ""
		}
	}
	
	def static getValue(org.aedit.aedit.Value value) {
		switch (value) {
			org.aedit.aedit.StringValue: value.^val
			org.aedit.aedit.IntValue: value.^val
			org.aedit.aedit.FloatValue: value.^val
			org.aedit.aedit.BooleanValue: value.^val
			default: ""
		}
	}

	def static getFieldName(org.aedit.aedit.Field field) {
		var fieldType = field.fieldType
		switch (fieldType) {
			PrimitiveTypeField: return fieldType.varName
			CustomTypeField: return fieldType.varName
			ComplexTypeField: return fieldType.varName
		}
	}

	def static checkIfTypeIsCorrect(String type, Type schemaType) {
		if (type.equals(ENUM)) {
			return schemaType instanceof EnumType
		} else if (type.equals(ERROR)) {
			return schemaType instanceof ErrorType
		} else if (type.equals(RECORD)) {
			return schemaType instanceof RecordType
		}
	}

	def static getAnnotationQualifiedName(Annotation annotation) {

		var String schemaName
		var String protocolName

		val annotationContainer = annotation.eContainer

		if (annotationContainer instanceof Field) {
			val fieldContainer = annotationContainer.eContainer

			if (fieldContainer instanceof RecordType) {

				schemaName = fieldContainer.name
				val schemaContainer = fieldContainer.eContainer as TypeDef
				protocolName = (schemaContainer.eContainer as AvroIDLFile).name

				return protocolName + '.' + schemaName + '.' + annotationContainer.name

			} else if (fieldContainer instanceof ErrorType) {

				schemaName = fieldContainer.name
				val schemaContainer = fieldContainer.eContainer as TypeDef
				protocolName = (schemaContainer.eContainer as AvroIDLFile).name

				return protocolName + '.' + schemaName + '.' + annotationContainer.name

			}
		} else if (annotationContainer instanceof TypeDef) {
			protocolName = (annotationContainer.eContainer as AvroIDLFile).name
		}

		return protocolName + '.' + schemaName
	}

	def static getFieldQualifiedName(Field field) {
		var String schemaName
		var String protocolName
		
		val fieldContainer = field.eContainer

		if (fieldContainer instanceof RecordType) {

			schemaName = fieldContainer.name
			val schemaContainer = fieldContainer.eContainer as TypeDef
			protocolName = (schemaContainer.eContainer as AvroIDLFile).name

		} else if (fieldContainer instanceof ErrorType) {

			schemaName = fieldContainer.name
			val schemaContainer = fieldContainer.eContainer as TypeDef
			protocolName = (schemaContainer.eContainer as AvroIDLFile).name

		}
		
		return protocolName + '.' + schemaName
	}

}
