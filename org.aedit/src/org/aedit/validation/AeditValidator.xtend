/*
 * generated by Xtext 2.12.0
 */
package org.aedit.validation

import HelperClass.HelperClass
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import org.aedit.aedit.AddEnumeration
import org.aedit.aedit.AddRecord
import org.aedit.aedit.AddVariable
import org.aedit.aedit.AeditPackage
import org.aedit.aedit.ChangeDefValue
import org.aedit.aedit.ChangeEnum
import org.aedit.aedit.ChangeSchema
import org.aedit.aedit.ChangeType
import org.aedit.aedit.Field
import org.aedit.aedit.GenericRule
import org.aedit.aedit.Model
import org.aedit.aedit.RemoveEnum
import org.aedit.aedit.RemoveSchema
import org.aedit.aedit.RemoveVariable
import org.aedit.aedit.RenameEnum
import org.aedit.aedit.RenameSchema
import org.aedit.aedit.RenameVariable
import org.aedit.aedit.RuleDeclaration
import org.aedit.aedit.RuleMap
import org.eclipse.xtext.validation.Check
import org.xtext.example.mydsl.myAvdl.AvroIDLFile
import org.xtext.example.mydsl.myAvdl.EnumType
import org.xtext.example.mydsl.myAvdl.PrimativeTypeLink
import org.xtext.example.mydsl.myAvdl.RecordType
import org.xtext.example.mydsl.myAvdl.TypeDef
import org.aedit.aedit.StringValue
import org.aedit.aedit.IntValue
import org.aedit.aedit.FloatValue

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class AeditValidator extends AbstractAeditValidator {

	private static Map<String, AvroIDLFile> protocols = new HashMap<String, AvroIDLFile>();
	private List<String> removedVariables = new ArrayList<String>()
	private List<String> newVariables = new ArrayList<String>()
	private List<String> existingVariables = new ArrayList<String>()

	private String currentSchema;
	private String currentProtocol;

	@Check
	def checkModel(Model model) {
		if (protocols.empty) {
			protocols = HelperClass.getAvroFiles(model.eResource)
			protocols.forEach [ p1, p2 |
				getAllSchemas(p2)
			]
		}
	}

	@Check
	def checkRuleDeclaration(RuleDeclaration ruleDeclaration) {

		removedVariables.clear
		newVariables.clear

	}

	@Check
	def checkChangeSchema(ChangeSchema changeSchema) {
		// Get name of the schema
		currentSchema = changeSchema.schema.name
		// Get name of the protocol
		var schemaContainer = changeSchema.schema.eContainer as TypeDef
		currentProtocol = (schemaContainer.eContainer as AvroIDLFile).name

		var fullName = currentProtocol + '.' + currentSchema

		if (removedVariables.contains(fullName)) {
			error("Variable has been deleted!", AeditPackage.Literals.CHANGE_SCHEMA__SCHEMA)
		}
	}

	@Check
	def checkChangeEnum(ChangeEnum changeEnum) {
		// Get name of the schema
		currentSchema = changeEnum.schema.name
		// Get name of the protocol
		var schemaContainer = changeEnum.schema.eContainer as TypeDef
		currentProtocol = (schemaContainer.eContainer as AvroIDLFile).name

		var fullName = currentProtocol + '.' + currentSchema

		if (removedVariables.contains(fullName)) {
			error("Variable has been deleted!", AeditPackage.Literals.CHANGE_ENUM__SCHEMA)
		}
	}

	@Check
	def checkRemoveVariable(RemoveVariable removeVariable) {

		var fullName = currentProtocol + '.' + currentSchema + '.' + removeVariable.variable.name

		if (removedVariables.contains(fullName)) {
			error("Variable has been deleted!", AeditPackage.Literals.REMOVE_VARIABLE__VARIABLE)
		} else {
			removedVariables.add(fullName)
		}

	}

	@Check
	def checkRenameVariable(RenameVariable renameVariable) {

		var oldVar = currentProtocol + '.' + currentSchema + '.' + renameVariable.variable.name
		var newVar = currentProtocol + '.' + currentSchema + '.' + renameVariable.newVarName

		if (removedVariables.contains(oldVar)) {
			error("Variable has been deleted!", AeditPackage.Literals.RENAME_VARIABLE__VARIABLE)
		}

		if (isUnique(newVar)) {
			error("Variable with that name already exists!", AeditPackage.Literals.RENAME_VARIABLE__NEW_VAR_NAME)
		} else {
			removedVariables.add(oldVar)
		}

	}

	@Check
	def checkRemoveSchema(RemoveSchema removeSchema) {
		// Get name of the schema
		val schemaName = removeSchema.schema.name
		// Get name of the protocol
		var schemaContainer = removeSchema.schema.eContainer as TypeDef
		val protocolName = (schemaContainer.eContainer as AvroIDLFile).name

		var fullName = protocolName + '.' + schemaName

		if (removedVariables.contains(fullName)) {
			error("Schema does not exist!", AeditPackage.Literals.REMOVE_SCHEMA__SCHEMA)
		} else {
			removedVariables.add(fullName)
		}
	}

	@Check
	def checkRenameSchema(RenameSchema RenameSchema) {
		// Get name of the schema
		val schemaName = RenameSchema.schema.name
		// Get name of the protocol
		var schemaContainer = RenameSchema.schema.eContainer as TypeDef
		val protocolName = (schemaContainer.eContainer as AvroIDLFile).name

		var fullName = protocolName + '.' + schemaName

		if (removedVariables.contains(fullName)) {
			error("Schema does not exist!", AeditPackage.Literals.RENAME_SCHEMA__SCHEMA)
		} else {
			removedVariables.add(fullName)
		}
	}

	@Check
	def checkRemoveEnum(RemoveEnum removeEnum) {

		var fullName = currentProtocol + '.' + currentSchema + '.' + removeEnum.varName

		if (removedVariables.contains(fullName)) {
			error("Variable is already deleted!", AeditPackage.Literals.REMOVE_ENUM__VAR_NAME)
		} else if (!existingVariables.contains(fullName)) {
			error("Variable does not exist!", AeditPackage.Literals.REMOVE_ENUM__VAR_NAME)
		} else {
			removedVariables.add(fullName)
		}

	}

	@Check
	def checkRenameEnum(RenameEnum renameEnum) {

		var oldEnum = currentProtocol + '.' + currentSchema + '.' + renameEnum.oldName
		var newEnum = currentProtocol + '.' + currentSchema + '.' + renameEnum.newEnumName

		if (removedVariables.contains(oldEnum)) {
			error("Variable has been deleted!", AeditPackage.Literals.RENAME_ENUM__OLD_NAME)
		} else if (!existingVariables.contains(oldEnum)) {
			error("Variable has been deleted!", AeditPackage.Literals.RENAME_ENUM__OLD_NAME)
		}

		if (isUnique(newEnum)) {
			error("Variable with that name already exists!", AeditPackage.Literals.RENAME_ENUM__NEW_ENUM_NAME)
		} else {
			removedVariables.add(oldEnum)
		}

	}

	@Check
	def checkChangeType(ChangeType changeType) {

		var fullName = currentProtocol + '.' + currentSchema + '.' + changeType.field.name

		if (removedVariables.contains(fullName)) {
			error("Variable does not exist!", AeditPackage.Literals.CHANGE_TYPE__FIELD)
		} else if (changeType.field.^default !== null) {

			var varType = changeType.field.type
			if (varType instanceof PrimativeTypeLink) {
				if (varType.target.equals('int')) {
					switch (changeType.newType) {
						case 'string':
							error("Cannot convert from int to string!", AeditPackage.Literals.CHANGE_TYPE__NEW_TYPE)
						case 'int':
							error("Variable is already of type int!", AeditPackage.Literals.CHANGE_TYPE__NEW_TYPE)
					}
				} else if (varType.target.equals('long')) {
					switch (changeType.newType) {
						case 'string':
							error("Cannot convert from long to string!", AeditPackage.Literals.CHANGE_TYPE__NEW_TYPE)
						case 'int':
							error("Cannot convert from long to int!", AeditPackage.Literals.CHANGE_TYPE__NEW_TYPE)
						case 'double':
							error("Cannot convert from long to double!", AeditPackage.Literals.CHANGE_TYPE__NEW_TYPE)
						case 'long':
							error("Variable is already of type long!", AeditPackage.Literals.CHANGE_TYPE__NEW_TYPE)
					}
				} else if (varType.target.equals('double')) {
					switch (changeType.newType) {
						case 'string':
							error("Cannot convert from double to string!", AeditPackage.Literals.CHANGE_TYPE__NEW_TYPE)
						case 'int':
							error("Cannot convert from double to int!", AeditPackage.Literals.CHANGE_TYPE__NEW_TYPE)
						case 'double':
							error("Variable is already of type double!", AeditPackage.Literals.CHANGE_TYPE__NEW_TYPE)
					}

				} else if (varType.target.equals('string')) {
					switch (changeType.newType) {
						case 'string':
							error("Variable is already of type string!", AeditPackage.Literals.CHANGE_TYPE__NEW_TYPE)
					}
				}
			}
		}

	}

	@Check
	def checkChangeDefValue(ChangeDefValue changeDefValue) {

		var fullName = currentProtocol + '.' + currentSchema + '.' + changeDefValue.field.name

		if (!removedVariables.contains(fullName)) {

			var varType = changeDefValue.field.type
			if (varType instanceof PrimativeTypeLink) {
				if (varType.target.equals('int')) {
					switch (changeDefValue.newVal) {
						case changeDefValue.newVal instanceof StringValue:
							error("Cannot assign string to int!", AeditPackage.Literals.CHANGE_DEF_VALUE__NEW_VAL)
					}
				} else if (varType.target.equals('long')) {
					switch (changeDefValue.newVal) {
						case changeDefValue.newVal instanceof StringValue:
							error("Cannot assign string to long!", AeditPackage.Literals.CHANGE_DEF_VALUE__NEW_VAL)
						case changeDefValue.newVal instanceof FloatValue:
							error("Cannot assign float to long!", AeditPackage.Literals.CHANGE_DEF_VALUE__NEW_VAL)
					}
				} else if (varType.target.equals('double')) {
					switch (changeDefValue.newVal) {
						case changeDefValue.newVal instanceof StringValue:
							error("Cannot assign string to double!", AeditPackage.Literals.CHANGE_DEF_VALUE__NEW_VAL)
						case changeDefValue.newVal instanceof IntValue:
							error("Cannot assign int to double!", AeditPackage.Literals.CHANGE_DEF_VALUE__NEW_VAL)
					}

				} else if (varType.target.equals('string')) {
					switch (changeDefValue.newVal) {
						case changeDefValue.newVal instanceof IntValue:
							error("Cannot assign integer to string!", AeditPackage.Literals.CHANGE_DEF_VALUE__NEW_VAL)
						case changeDefValue.newVal instanceof FloatValue:
							error("Cannot assign float to string!", AeditPackage.Literals.CHANGE_DEF_VALUE__NEW_VAL)
					}
				}
			}
		} else {
			error("Variable does not exist!", AeditPackage.Literals.CHANGE_DEF_VALUE__FIELD)
		}

	}

	@Check
	def checkAddRecord(AddRecord addRecord) {
		var recordName = addRecord.namespace.name + '.' + addRecord.recordName

		if (existingVariables.contains(recordName)) {
			error("Record with this name already exists in this namespace!",
				AeditPackage.Literals.ADD_RECORD__RECORD_NAME)
		} else {
			newVariables.add(recordName)

			for (field : addRecord.fields) {
				var varName = recordName + '.' + field.varName
				if (newVariables.contains(varName)) {
					error("Variable with this name already exists!", AeditPackage.Literals.ADD_RECORD__FIELDS,
						addRecord.fields.indexOf(field))
				} else {
					newVariables.add(varName)
				}
			}
		}

	}

	@Check
	def checkAddEnumeration(AddEnumeration addEnumeration) {
		var enumName = addEnumeration.namespace.name + '.' + addEnumeration.enumName

		if (existingVariables.contains(enumName)) {
			error("Enumeration with this name already exists in this namespace!",
				AeditPackage.Literals.ADD_ENUMERATION__ENUM_NAME)
		} else {

			newVariables.add(enumName)

			for (symbol : addEnumeration.symbols) {
				var symbolName = enumName + symbol
				if (newVariables.contains(symbol)) {
					error("Enum with this name already exists!", AeditPackage.Literals.ADD_ENUMERATION__SYMBOLS,
						addEnumeration.symbols.indexOf(symbol))
				} else {
					newVariables.add(symbolName)
				}
			}
		}

	}

	@Check
	def checkAddVariable(AddVariable addVariable) {
		// TODO: Add	
	}

	@Check
	def checkField(Field field) {
		if (field.type.equals("long")) {
			if (field.value as Object instanceof String) {
				error("Cannot assign string value to long!", AeditPackage.Literals.FIELD__VALUE)
			}
		} else if (field.type.equals("double")) {
			if (field.value as Object instanceof String) {
				error("Cannot assign string value to double!", AeditPackage.Literals.FIELD__VALUE)
			}
		} else if (field.type.equals("int")) {
			if (field.value as Object instanceof String) {
				error("Cannot assign string value to int!", AeditPackage.Literals.FIELD__VALUE)
			}
		}
	}

	@Check
	def checkForConflicts(RuleMap rm) {
		for (ruleDecl : rm.rules) {
			for (otherRuleDecl : rm.rules) {
				if (ruleDecl !== otherRuleDecl) {
					getDeleteConflicts(ruleDecl, otherRuleDecl, rm.rules.indexOf(ruleDecl))
					getSchemaEditConflicts(ruleDecl, otherRuleDecl, rm.rules.indexOf(ruleDecl))
					getEnumEditConflicts(ruleDecl, otherRuleDecl, rm.rules.indexOf(ruleDecl))
				}
			}
		}
	}

	def getDeleteConflicts(RuleDeclaration a, RuleDeclaration b, int index) {

		val aRules = a.eAllContents.toList.filter(RemoveSchema)
		val bRules = b.eAllContents.toList.filter(RemoveSchema)

//		val maxSize = if(aRules.length >= bRules.length) aRules.length else bRules.length
		for (var i = 0; i < aRules.length; i++) {

			val aSchemaName = aRules.get(i).schema.name
			val aSchemaContainer = aRules.get(i).schema.eContainer as TypeDef
			val aProtocolName = (aSchemaContainer.eContainer as AvroIDLFile).name

			for (var j = 0; j < bRules.length; j++) {

				val bSchemaName = bRules.get(j).schema.name
				val bSchemaContainer = bRules.get(j).schema.eContainer as TypeDef
				val bProtocolName = (bSchemaContainer.eContainer as AvroIDLFile).name

				if (aSchemaName.equals(bSchemaName) && aProtocolName.equals(bProtocolName)) {
					error(
						String.format("CONCURENT MODIFICATION ERROR: %s is deleted in %s and %s",
							aProtocolName + '.' + aSchemaName, a.name, b.name),
						AeditPackage.Literals.RULE_MAP__RULES,
						index
					)
				}
			}

		}

	}

	def getSchemaEditConflicts(RuleDeclaration a, RuleDeclaration b, int index) {

		val aRules = a.eAllContents.toList.filter(ChangeSchema)
		val bRules = b.eAllContents.toList.filter(ChangeSchema)

//		val maxSize = if(aRules.length >= bRules.length) aRules.length else bRules.length
		currentRuleIndex = index

		for (var i = 0; i < aRules.length; i++) {

			val aSchemaName = aRules.get(i).schema.name
			val aSchemaContainer = aRules.get(i).schema.eContainer as TypeDef
			val aProtocolName = (aSchemaContainer.eContainer as AvroIDLFile).name

			for (var j = 0; j < bRules.length; j++) {

				val bSchemaName = bRules.get(j).schema.name
				val bSchemaContainer = bRules.get(j).schema.eContainer as TypeDef
				val bProtocolName = (bSchemaContainer.eContainer as AvroIDLFile).name

				if (aSchemaName.equals(bSchemaName) && aProtocolName.equals(bProtocolName)) {
					warning(
						String.format("CONCURENT MODIFICATION ERROR: %s is edited in %s and %s",
							aProtocolName + '.' + aSchemaName, a.name, b.name),
						AeditPackage.Literals.RULE_MAP__RULES,
						index
					)

					getVarDeleteConflicts(aRules.get(i), bRules.get(j), a.name, b.name)
					getVarRenameConflicts(aRules.get(i), bRules.get(j), a.name, b.name)
					getVarSetTypeConflicts(aRules.get(i), bRules.get(j), a.name, b.name)
					getVarChangeDataConflicts(aRules.get(i), bRules.get(j), a.name, b.name)
				}
			}

		}

	}

	int currentRuleIndex;

	def getEnumEditConflicts(RuleDeclaration a, RuleDeclaration b, int index) {
		val aRules = a.eAllContents.toList.filter(ChangeEnum)
		val bRules = b.eAllContents.toList.filter(ChangeEnum)

//		val maxSize = if(aRules.length >= bRules.length) aRules.length else bRules.length
		currentRuleIndex = index

		for (var i = 0; i < aRules.length; i++) {

			val aSchemaName = aRules.get(i).schema.name
			val aSchemaContainer = aRules.get(i).schema.eContainer as TypeDef
			val aProtocolName = (aSchemaContainer.eContainer as AvroIDLFile).name

			for (var j = 0; j < bRules.length; j++) {

				val bSchemaName = bRules.get(j).schema.name
				val bSchemaContainer = bRules.get(j).schema.eContainer as TypeDef
				val bProtocolName = (bSchemaContainer.eContainer as AvroIDLFile).name

				if (aSchemaName.equals(bSchemaName) && aProtocolName.equals(bProtocolName)) {
					warning(
						String.format("CONCURENT MODIFICATION ERROR: %s is edited in %s and %s",
							aProtocolName + '.' + aSchemaName, a.name, b.name),
						AeditPackage.Literals.RULE_MAP__RULES,
						index
					)

					getVarDeleteConflicts(aRules.get(i), bRules.get(j), a.name, b.name)
					getVarRenameConflicts(aRules.get(i), bRules.get(j), a.name, b.name)

				}
			}

		}
	}

	// Helper methods
	def getAllSchemas(AvroIDLFile file) {
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
	}

	def isUnique(String fullName) {
		if (newVariables.contains(fullName) || existingVariables.contains(fullName)) {
			if (removedVariables.contains(fullName)) {
				return false
			}
			return true
		}
		return false
	}

	def getVarDeleteConflicts(GenericRule a, GenericRule b, String aName, String bName) {

		if (a instanceof ChangeEnum && b instanceof ChangeEnum) {

			checkConcurrentEnumDelete(a.eAllContents.toIterable.filter(RemoveEnum),
				b.eAllContents.toIterable.filter(RemoveEnum), aName, bName)

		} else if (a instanceof ChangeSchema && b instanceof ChangeSchema) {

			checkConcurrentVarDelete(a.eAllContents.toIterable.filter(RemoveVariable),
				b.eAllContents.toIterable.filter(RemoveVariable), aName, bName)

		}
	}

	def getVarRenameConflicts(GenericRule a, GenericRule b, String aName, String bName) {

		if (a instanceof ChangeEnum && b instanceof ChangeEnum) {

			checkConcurrentEnumRename(a.eAllContents.toIterable.filter(RenameEnum),
				b.eAllContents.toIterable.filter(RenameEnum), aName, bName)

		} else if (a instanceof ChangeSchema && b instanceof ChangeSchema) {

			checkConcurrentVarRename(a.eAllContents.toIterable.filter(RenameVariable),
				b.eAllContents.toIterable.filter(RenameVariable), aName, bName)

		}

	}

	def getVarSetTypeConflicts(GenericRule a, GenericRule b, String aName, String bName) {

		if (a instanceof ChangeSchema && b instanceof ChangeSchema) {

			checkConcurrentVarTypeChange(a.eAllContents.toIterable.filter(ChangeType),
				b.eAllContents.toIterable.filter(ChangeType), aName, bName)

		}

	}

	def getVarChangeDataConflicts(GenericRule a, GenericRule b, String aName, String bName) {

		if (a instanceof ChangeSchema && b instanceof ChangeSchema) {

			checkConcurrentVarValueChange(a.eAllContents.toIterable.filter(ChangeDefValue),
				b.eAllContents.toIterable.filter(ChangeDefValue), aName, bName)

		}

	}

	// Helper methods
	def checkConcurrentEnumDelete(Iterable<RemoveEnum> alist, Iterable<RemoveEnum> blist, String aRuleName,
		String bRuleName) {

		var List<String> deletedEnumsA = new ArrayList<String>();
		var List<String> deletedEnumsB = new ArrayList<String>();

		for (removeEnumRule : alist) {
			deletedEnumsA.add(removeEnumRule.varName)
		}

		for (removeEnumRule : blist) {
			deletedEnumsB.add(removeEnumRule.varName)
		}

		displayVarErrors(deletedEnumsA, deletedEnumsB, aRuleName, bRuleName, "deleted")

	}

	def checkConcurrentVarDelete(Iterable<RemoveVariable> alist, Iterable<RemoveVariable> blist, String aRuleName,
		String bRuleName) {

		var List<String> deletedVarsA = new ArrayList<String>();
		var List<String> deletedVarsB = new ArrayList<String>();

		for (removeVarRule : alist) {
			deletedVarsA.add(removeVarRule.variable.name)
		}

		for (removeVarRule : blist) {
			deletedVarsB.add(removeVarRule.variable.name)
		}

		displayVarErrors(deletedVarsA, deletedVarsB, aRuleName, bRuleName, "deleted")

	}

	def checkConcurrentEnumRename(Iterable<RenameEnum> alist, Iterable<RenameEnum> blist, String aRuleName,
		String bRuleName) {
		var List<String> renamedVarsA = new ArrayList<String>();
		var List<String> renamedVarsB = new ArrayList<String>();

		for (renameEnumRule : alist) {
			renamedVarsA.add(renameEnumRule.oldName)
		}

		for (renameEnumRule : blist) {
			renamedVarsB.add(renameEnumRule.oldName)
		}

		displayVarErrors(renamedVarsA, renamedVarsB, aRuleName, bRuleName, "renamed")
	}

	def checkConcurrentVarRename(Iterable<RenameVariable> alist, Iterable<RenameVariable> blist, String aRuleName,
		String bRuleName) {
		var List<String> renamedVarsA = new ArrayList<String>();
		var List<String> renamedVarsB = new ArrayList<String>();

		for (renameVarRule : alist) {
			renamedVarsA.add(renameVarRule.variable.name)
		}

		for (renameVarRule : blist) {
			renamedVarsB.add(renameVarRule.variable.name)
		}

		displayVarErrors(renamedVarsA, renamedVarsB, aRuleName, bRuleName, "renamed")
	}

	def checkConcurrentVarTypeChange(Iterable<ChangeType> alist, Iterable<ChangeType> blist, String aRuleName,
		String bRuleName) {

		var List<String> changedVarsA = new ArrayList<String>();
		var List<String> changedVarsB = new ArrayList<String>();

		for (changeTypeRule : alist) {
			changedVarsA.add(changeTypeRule.field.name)
		}

		for (changeTypeRule : blist) {
			changedVarsB.add(changeTypeRule.field.name)
		}

		displayVarErrors(changedVarsA, changedVarsB, aRuleName, bRuleName, "modified (set_type)")

	}

	def checkConcurrentVarValueChange(Iterable<ChangeDefValue> alist, Iterable<ChangeDefValue> blist, String aRuleName,
		String bRuleName) {

		var List<String> changedVarsA = new ArrayList<String>();
		var List<String> changedVarsB = new ArrayList<String>();

		for (changeValRule : alist) {
			changedVarsA.add(changeValRule.field.name)
		}

		for (changeValRule : blist) {
			changedVarsB.add(changeValRule.field.name)
		}

		displayVarErrors(changedVarsA, changedVarsB, aRuleName, bRuleName, "modified (set_val)")

	}

	def displayVarErrors(List<String> listA, List<String> listB, String aRuleName, String bRuleName,
		String errMessage) {

		if (listA.length >= listB.length) {
			listA.retainAll(listB)
			for (varName : listA) {
				error(
					String.format("CONCURRENT MODIFICATION ERROR: %s is %s in %s and %s", varName, errMessage,
						aRuleName, bRuleName), AeditPackage.Literals.RULE_MAP__RULES, currentRuleIndex)
			}
		} else {
			listB.retainAll(listA)
			for (varName : listB) {
				error(
					String.format("CONCURRENT MODIFICATION ERROR: %s is %s in %s and %s", varName, errMessage,
						aRuleName, bRuleName), AeditPackage.Literals.RULE_MAP__RULES, currentRuleIndex)
			}
		}

	}

}
