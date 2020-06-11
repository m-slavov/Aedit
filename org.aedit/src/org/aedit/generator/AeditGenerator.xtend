/*
 * generated by Xtext 2.12.0
 */
package org.aedit.generator

import HelperClass.HelperClass
import avroclipse.avroIDL.ArrayFieldType
import avroclipse.avroIDL.AvroIDLFactory
import avroclipse.avroIDL.AvroIDLFile
import avroclipse.avroIDL.EnumType
import avroclipse.avroIDL.ErrorType
import avroclipse.avroIDL.RecordType
import avroclipse.avroIDL.TypeDef
import avroclipse.avroIDL.Value
import avroclipse.avroIDL.Values
import java.util.HashMap
import java.util.Map
import org.aedit.aedit.Add
import org.aedit.aedit.AddAnnotationToField
import org.aedit.aedit.AddAnnotationToSchema
import org.aedit.aedit.AddEnum
import org.aedit.aedit.AddEnumeration
import org.aedit.aedit.AddError
import org.aedit.aedit.AddNameAnnotationToField
import org.aedit.aedit.AddRecord
import org.aedit.aedit.AddVariable
import org.aedit.aedit.AnnotatedTypes
import org.aedit.aedit.Annotation
import org.aedit.aedit.Array
import org.aedit.aedit.ArrayTypeField
import org.aedit.aedit.BooleanValue
import org.aedit.aedit.ChangeDefValue
import org.aedit.aedit.ChangeEnum
import org.aedit.aedit.ChangeSchema
import org.aedit.aedit.ChangeType
import org.aedit.aedit.ComplexTypeField
import org.aedit.aedit.CustomType
import org.aedit.aedit.CustomTypeField
import org.aedit.aedit.EnumRule
import org.aedit.aedit.Feature
import org.aedit.aedit.FeatureMap
import org.aedit.aedit.Field
import org.aedit.aedit.FloatValue
import org.aedit.aedit.GenericRule
import org.aedit.aedit.IntValue
import org.aedit.aedit.Null
import org.aedit.aedit.PrimitiveType
import org.aedit.aedit.PrimitiveTypeField
import org.aedit.aedit.RemoveAnnotationFromField
import org.aedit.aedit.RemoveAnnotationFromSchema
import org.aedit.aedit.RemoveEnum
import org.aedit.aedit.RemoveNameAnnotationFromField
import org.aedit.aedit.RemoveSchema
import org.aedit.aedit.RemoveVariable
import org.aedit.aedit.RenameEnum
import org.aedit.aedit.RenameSchema
import org.aedit.aedit.RenameVariable
import org.aedit.aedit.RuleDeclaration
import org.aedit.aedit.RuleMap
import org.aedit.aedit.SchemaRule
import org.aedit.aedit.StringValue
import org.aedit.aedit.Types
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class AeditGenerator extends AbstractGenerator {

	public Map<String, AvroIDLFile> protocols = new HashMap<String, AvroIDLFile>();

	String currentProtocol;
	String currentSchema;
	int index;

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {

		val workSpaceDir = Singleton.instance.workspaceDir

		protocols = HelperClass.getAvroFiles(resource)

		if (!resource.allContents.toIterable.filter(FeatureMap).empty) {

			// Traverse the AST
			for (e : resource.allContents.toIterable.filter(FeatureMap)) {
				e.compile
			}

			// Save the newly edited models
			protocols.forEach [ p1, p2 |
				if (!workSpaceDir.equals("undefined")) {
					saveAvroIDLFile(
						URI.createFileURI(workSpaceDir + "\\aedit-gen\\NEW" + p1 + ".avdl"),
						p2
					)
				}

			]

		}

	}

	// Helper methods for importing avdl files
	def loadAvroIDLFile(URI uri, Resource resource) {

		// Load the model from the original file
		val res = resource.resourceSet.getResource(uri, true)
		val originalAvroFile = res.contents.get(0) as AvroIDLFile

		// Create a copy, otherwise cross references can be messed up during the editing
		val copyAvroFile = EcoreUtil2.copy(originalAvroFile)

		return copyAvroFile
	}

	def saveAvroIDLFile(URI uri, AvroIDLFile newModel) {
		var Resource rs = new ResourceSetImpl().createResource(uri);
		rs.getContents.add(newModel);
		// val Map<Object, Object> saveOptions = new HashMap<Object, Object>();
		// Use formatter for pretty printing of the new .avdl files.
		rs.save(null)
	}

	def compile(FeatureMap featureMap) {
		featureMap.name.compile
	}

	def compile(Feature feature) {
		if (feature.extend !== null) {
			feature.extend.compile
		}
		for (ruleMap : feature.ruleMaps) {
			ruleMap.compile
		}
	}

	def compile(RuleMap ruleMap) {
		for (ruleDeclaration : ruleMap.rules) {
			ruleDeclaration.compile
		}
	}

	def compile(RuleDeclaration ruleDeclaration) {
		for (rule : ruleDeclaration.rules) {
			rule.compile
		}
	}

	def compile(GenericRule genRule) {
		switch (genRule) {
			RenameSchema: genRule.compile
			RemoveSchema: genRule.compile
			Add: genRule.compile
			ChangeSchema: genRule.compile
			ChangeEnum: genRule.compile
			AddAnnotationToSchema: genRule.compile
			RemoveAnnotationFromSchema: genRule.compile
		}
	}

	def compile(RenameSchema renameSchema) {

		// Get name of the schema
		val schemaName = renameSchema.schema.name
		// Get name of the protocol
		var schemaContainer = renameSchema.schema.eContainer as TypeDef
		val protocolName = (schemaContainer.eContainer as AvroIDLFile).name

		protocols.get(protocolName).elements.filter(TypeDef).forEach [ typeDef |
			if (typeDef.type instanceof RecordType) {
				if ((typeDef.type as RecordType).name.equals(schemaName)) {
					(typeDef.type as RecordType).name = renameSchema.newSchName
				}
			} else if (typeDef.type instanceof EnumType) {
				if ((typeDef.type as EnumType).name.equals(schemaName)) {
					(typeDef.type as EnumType).name = renameSchema.newSchName
				}
			} else if (typeDef.type instanceof ErrorType) {
				if ((typeDef.type as ErrorType).name.equals(schemaName)) {
					(typeDef.type as ErrorType).name = renameSchema.newSchName
				}
			}

		]

	}

	def compile(RemoveSchema removeSchema) {

		// Get name of the schema
		val schemaName = removeSchema.schema.name
		// Get name of the protocol
		var schemaContainer = removeSchema.schema.eContainer as TypeDef
		val protocolName = (schemaContainer.eContainer as AvroIDLFile).name
		protocols.get(protocolName).elements.filter(TypeDef).forEach [ typeDef |
			if (typeDef.type instanceof RecordType) {
				if ((typeDef.type as RecordType).name.equals(schemaName)) {
					index = protocols.get(protocolName).elements.indexOf(typeDef)
				}
			} else if (typeDef.type instanceof EnumType) {
				if ((typeDef.type as EnumType).name.equals(schemaName)) {
					index = protocols.get(protocolName).elements.indexOf(typeDef)
				}
			} else if (typeDef.type instanceof ErrorType) {
				if ((typeDef.type as ErrorType).name.equals(schemaName)) {
					index = protocols.get(protocolName).elements.indexOf(typeDef)
				}
			}
		]

		protocols.get(protocolName).elements.remove(index)
	}

	def compile(Add add) {
		switch (add) {
			AddRecord: add.compile
			AddEnumeration: add.compile
			AddError: add.compile
		}
	}

	def compile(AddRecord addRecord) {

		// Get name of the schema
		val schemaName = addRecord.recordName
		// Get name of the protocol
		val protocolName = addRecord.namespace.name

		val TypeDef newTypeDef = AvroIDLFactory.eINSTANCE.createTypeDef
		newTypeDef.type = AvroIDLFactory.eINSTANCE.createRecordType => [
			name = schemaName

			addRecord.fields.forEach [ field |
				fields.add(field.createField)
			]
		]

		protocols.get(protocolName).elements.add(addRecord.index, newTypeDef)
	}

	def compile(AddError addError) {
		// Get name of the schema
		val schemaName = addError.errorName
		// Get name of the protocol
		val protocolName = addError.namespace.name

		val TypeDef newTypeDef = AvroIDLFactory.eINSTANCE.createTypeDef
		newTypeDef.type = AvroIDLFactory.eINSTANCE.createErrorType => [
			name = schemaName

			addError.fields.forEach [ field |
				fields.add(field.createField)
			]
		]

		protocols.get(protocolName).elements.add(addError.index, newTypeDef)
	}

	def compile(AddEnumeration addEnumeration) {

		// Get name of the schema 
		val schemaName = addEnumeration.enumName
		// Get name of the protocol
		val protocolName = addEnumeration.namespace.name

		val TypeDef newTypeDef = AvroIDLFactory.eINSTANCE.createTypeDef
		newTypeDef.type = AvroIDLFactory.eINSTANCE.createEnumType => [
			name = schemaName

			addEnumeration.symbols.forEach [ symbol |
				literals.add(symbol)
			]
		]

		protocols.get(protocolName).elements.add(addEnumeration.index, newTypeDef)
	}

	def compile(ChangeSchema changeSchema) {

		// Get name of the schema
		currentSchema = changeSchema.schema.name
		// Get name of the protocol
		var schemaContainer = changeSchema.schema.eContainer as TypeDef
		currentProtocol = (schemaContainer.eContainer as AvroIDLFile).name

		for (rule : changeSchema.rules) {
			rule.compile
		}
	}

	def compile(SchemaRule schemaRule) {

		switch (schemaRule) {
			RemoveVariable: schemaRule.compile
			RenameVariable: schemaRule.compile
			AddVariable: schemaRule.compile
			ChangeDefValue: schemaRule.compile
			ChangeType: schemaRule.compile
			AddAnnotationToField: schemaRule.execute
			AddNameAnnotationToField: schemaRule.compile
			RemoveAnnotationFromField: schemaRule.execute
			RemoveNameAnnotationFromField: schemaRule.compile
		}

	}

	def compile(RemoveVariable removeVariable) {

		val schema = HelperClass.getSchema(currentProtocol, currentSchema, protocols)
		val field = HelperClass.getFieldFromSchema(schema, removeVariable.variable.name)

		switch (schema) {
			RecordType: schema.fields.remove(field)
			ErrorType: schema.fields.remove(field)
		}

	}

	def compile(RenameVariable renameVariable) {

		val schema = HelperClass.getSchema(currentProtocol, currentSchema, protocols)
		val field = HelperClass.getFieldFromSchema(schema, renameVariable.variable.name)

		field.name = renameVariable.newVarName

	}

	def compile(AddVariable addVariable) {

		val schema = HelperClass.getSchema(currentProtocol, currentSchema, protocols)

		switch (schema) {
			RecordType:
				schema.fields.add(addVariable.index, addVariable.newVar.createField)
			ErrorType:
				schema.fields.add(addVariable.index, addVariable.newVar.createField)
		}

	}

	def createField(Field field) {

		val fieldType = field.fieldType

		var avroclipse.avroIDL.Field newField

		if (fieldType instanceof PrimitiveTypeField) {

			newField = fieldType.compile

		} else if (fieldType instanceof CustomTypeField) {

			newField = fieldType.compile

		} else if (fieldType instanceof ComplexTypeField) {

			newField = fieldType.compile

		}

		for (annotation : field.annotations) {
			newField.annotations.add(annotation.createAnnotation)
		}

		return newField

	}

	def compile(PrimitiveTypeField primitiveTypeField) {

		var newField = AvroIDLFactory.eINSTANCE.createField => [
			name = primitiveTypeField.varName
			type = primitiveTypeField.type.compile

			if (primitiveTypeField.value !== null) {
				^default = primitiveTypeField.value.compile
			}
		]

		for (nameAnnotation : primitiveTypeField.nameAnnotations) {
			newField.nameAnnotations.add(nameAnnotation.createAnnotation)
		}

		return newField
	}

	def compile(CustomTypeField customTypeField) {

		var newField = AvroIDLFactory.eINSTANCE.createField => [
			name = customTypeField.varName
			type = customTypeField.type.compile
		]

		for (nameAnnotation : customTypeField.nameAnnotations) {
			newField.nameAnnotations.add(nameAnnotation.createAnnotation)
		}

		return newField

	}

	def compile(ComplexTypeField complexTypeField) {

		var newField = AvroIDLFactory.eINSTANCE.createField
		var fieldType = complexTypeField.type

		newField.name = complexTypeField.varName

		if (fieldType instanceof ArrayTypeField) {
			newField.type = fieldType.compile
		}

		if (complexTypeField.value !== null) {
			newField.^default = complexTypeField.value.compile
		}

		return newField
	}

	def compile(ArrayTypeField arrayTypeField) {

		var type = AvroIDLFactory.eINSTANCE.createArrayFieldType => [
			type = arrayTypeField.type.compile
		]

		return type
	}

	def compile(AnnotatedTypes annotatedTypes) {

		var newAnnotatedTypeLink = AvroIDLFactory.eINSTANCE.createAnnotatedTypeLink => [

			type = annotatedTypes.type.compile
		]
		
		for (annotation : annotatedTypes.annotataions){
			newAnnotatedTypeLink.annotations.add(annotation.createAnnotation)
		}

		return newAnnotatedTypeLink
	}

	def compile(Types types) {
		switch (types) {
			CustomType: return types.compile
			PrimitiveType: return types.compile
			ArrayTypeField: return types.compile as ArrayFieldType
		}
	}

	def compile(CustomType customType) {
		var type = AvroIDLFactory.eINSTANCE.createCustomTypeLink => [
			target = customType.target
		]

		return type
	}

	def compile(PrimitiveType primitiveType) {
		var type = AvroIDLFactory.eINSTANCE.createPrimativeTypeLink => [
			target = primitiveType.target
		]

		return type
	}

	def compile(ChangeDefValue changeDefValue) {

		val schema = HelperClass.getSchema(currentProtocol, currentSchema, protocols)
		val field = HelperClass.getFieldFromSchema(schema, changeDefValue.field.name)

		field.^default = changeDefValue.newVal.compile

	}

	def compile(ChangeType changeType) {

		val schema = HelperClass.getSchema(currentProtocol, currentSchema, protocols)
		val field = HelperClass.getFieldFromSchema(schema, changeType.field.name)

		field.type = AvroIDLFactory.eINSTANCE.createPrimativeTypeLink => [
			target = changeType.newType
		]

	}

	def compile(ChangeEnum changeEnum) {
		// Get name of the schema
		currentSchema = changeEnum.schema.name
		// Get name of the protocol
		var schemaContainer = changeEnum.schema.eContainer as TypeDef
		currentProtocol = (schemaContainer.eContainer as AvroIDLFile).name

		for (rule : changeEnum.rules) {
			rule.compile
		}
	}

	def compile(EnumRule enumRule) {
		switch (enumRule) {
			RemoveEnum: enumRule.compile
			RenameEnum: enumRule.compile
			AddEnum: enumRule.compile
		}
	}

	def compile(RemoveEnum removeEnum) {
		protocols.get(currentProtocol).elements.filter(TypeDef).forEach [ typeDef |
			if (typeDef.type instanceof EnumType) {
				if ((typeDef.type as EnumType).name.equals(currentSchema)) {
					(typeDef.type as EnumType).literals.removeIf[it.equals(removeEnum.varName)]
				}
			}

		]
	}

	def compile(RenameEnum renameEnum) {
		protocols.get(currentProtocol).elements.filter(TypeDef).forEach [ typeDef |
			if (typeDef.type instanceof EnumType) {
				if ((typeDef.type as EnumType).name.equals(currentSchema)) {
					(typeDef.type as EnumType).literals.set(
						(typeDef.type as EnumType).literals.indexOf(renameEnum.oldName), renameEnum.newEnumName)
				}
			}

		]
	}

	def compile(AddEnum addEnum) {
		protocols.get(currentProtocol).elements.filter(TypeDef).forEach [ typeDef |
			if (typeDef.type instanceof EnumType) {
				if (typeDef.type.name.equals(currentSchema)) {
					(typeDef.type as EnumType).literals.add(addEnum.index, addEnum.varName)
				}
			}
		]
	}

	def compile(AddAnnotationToSchema annotationToSchema) {

		// Get name of the schema
		val schemaName = annotationToSchema.schema.name
		// Get name of the protocol
		var schemaContainer = annotationToSchema.schema.eContainer as TypeDef
		val protocolName = (schemaContainer.eContainer as AvroIDLFile).name

		protocols.get(protocolName).elements.filter(TypeDef).forEach [ typeDef |
			if (typeDef.type instanceof RecordType) {

				if ((typeDef.type as RecordType).name.equals(schemaName)) {
					typeDef.annotations.add(annotationToSchema.annotation.createAnnotation)
				}

			} else if (typeDef.type instanceof EnumType) {

				if ((typeDef.type as EnumType).name.equals(schemaName)) {
					typeDef.annotations.add(annotationToSchema.annotation.createAnnotation)
				}

			} else if (typeDef.type instanceof ErrorType) {

				if ((typeDef.type as ErrorType).name.equals(schemaName)) {
					typeDef.annotations.add(annotationToSchema.annotation.createAnnotation)
				}

			}

		]
	}

	def compile(RemoveAnnotationFromSchema removeAnnotationFromSchema) {
		// Get name of the schema
		val schemaName = removeAnnotationFromSchema.schema.name
		// Get name of the protocol
		var schemaContainer = removeAnnotationFromSchema.schema.eContainer as TypeDef
		val protocolName = (schemaContainer.eContainer as AvroIDLFile).name

		protocols.get(protocolName).elements.filter(TypeDef).forEach [ typeDef |
			if (typeDef.type instanceof RecordType) {

				if ((typeDef.type as RecordType).name.equals(schemaName)) {
					HelperClass.removeAnnotationFromSchema(typeDef, removeAnnotationFromSchema.annotationToRemove)
				}

			} else if (typeDef.type instanceof EnumType) {

				if ((typeDef.type as EnumType).name.equals(schemaName)) {
					HelperClass.removeAnnotationFromSchema(typeDef, removeAnnotationFromSchema.annotationToRemove)
				}

			} else if (typeDef.type instanceof ErrorType) {

				if ((typeDef.type as ErrorType).name.equals(schemaName)) {
					HelperClass.removeAnnotationFromSchema(typeDef, removeAnnotationFromSchema.annotationToRemove)
				}

			}

		]
	}

	def execute(AddAnnotationToField addAnnotationToField) {
		val field = HelperClass.getField(currentProtocol, currentSchema, addAnnotationToField.variable.name, protocols)
		field.annotations.add(addAnnotationToField.annotation.createAnnotation)
	}

	def compile(AddNameAnnotationToField addNameAnnotationToField) {
		val field = HelperClass.getField(currentProtocol, currentSchema, addNameAnnotationToField.variable.name,
			protocols)
		field.nameAnnotations.add(addNameAnnotationToField.annotation.createAnnotation)
	}

	def execute(RemoveAnnotationFromField removeAnnotationFromField) {
		val field = HelperClass.getField(currentProtocol, currentSchema, removeAnnotationFromField.variable.name,
			protocols)
		HelperClass.removeAnnotationFromField(field, removeAnnotationFromField.annotationToRemove)
	}

	def compile(RemoveNameAnnotationFromField removeNameAnnotationFromField) {
		val field = HelperClass.getField(currentProtocol, currentSchema, removeNameAnnotationFromField.variable.name,
			protocols)
		HelperClass.removeNameAnnotationFromField(field, removeNameAnnotationFromField.annotationToRemove)
	}

	def compile(org.aedit.aedit.Values values) {

		val newAvroclipseValues = AvroIDLFactory.eINSTANCE.createValues

		for (value : values.value) {

			if (value instanceof Array) {
				newAvroclipseValues.value.add(value.compile as Value)
			} else if (value instanceof org.aedit.aedit.Value) {
				newAvroclipseValues.value.add(value.compile as Value)
			}

		}

		return newAvroclipseValues
	}

	def compile(Array array) {
		var newArray = AvroIDLFactory.eINSTANCE.createArray
		newArray.values = array.values.compile as Values

		return newArray
	}

	def compile(org.aedit.aedit.Value value) {
		switch (value) {
			FloatValue: return value.compile
			IntValue: return value.compile
			StringValue: return value.compile
			BooleanValue: return value.compile
			Null: return value.compile
		}
	}

	def compile(FloatValue floatValue) {
		val newAvroclipseFloatVal = AvroIDLFactory.eINSTANCE.createFloatValue => [
			^val = floatValue.^val
		]
		return newAvroclipseFloatVal
	}

	def compile(IntValue intValue) {
		val newAvroclipseIntVal = AvroIDLFactory.eINSTANCE.createIntValue => [
			^val = intValue.^val
		]
		return newAvroclipseIntVal
	}

	def compile(StringValue stringValue) {
		val newAvroclipseStringVal = AvroIDLFactory.eINSTANCE.createStringValue => [
			^val = stringValue.^val
		]
		return newAvroclipseStringVal
	}

	def compile(BooleanValue booleanValue) {
		val newAvroclipseBoolVal = AvroIDLFactory.eINSTANCE.createBooleanValue => [
			^val = booleanValue.^val
		]
		return newAvroclipseBoolVal

	}

	def compile(Null nullValue) {
		val newAvroclipseNullVal = AvroIDLFactory.eINSTANCE.createNull
		return newAvroclipseNullVal
	}

	def avroclipse.avroIDL.Annotation createAnnotation(Annotation annotation) {

		val newAvroclipseAnnotation = AvroIDLFactory.eINSTANCE.createAnnotation => [
			name = annotation.name
			values = annotation.values.compile as Values
		]

		return newAvroclipseAnnotation
	}
}
