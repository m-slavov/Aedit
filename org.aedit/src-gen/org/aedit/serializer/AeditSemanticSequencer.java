/*
 * generated by Xtext 2.21.0
 */
package org.aedit.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.aedit.aedit.AddEnum;
import org.aedit.aedit.AddEnumeration;
import org.aedit.aedit.AddRecord;
import org.aedit.aedit.AddVariable;
import org.aedit.aedit.AeditPackage;
import org.aedit.aedit.BooleanValue;
import org.aedit.aedit.ChangeDefValue;
import org.aedit.aedit.ChangeEnum;
import org.aedit.aedit.ChangeSchema;
import org.aedit.aedit.ChangeType;
import org.aedit.aedit.CustomTypeField;
import org.aedit.aedit.Feature;
import org.aedit.aedit.FeatureMap;
import org.aedit.aedit.FloatValue;
import org.aedit.aedit.IntValue;
import org.aedit.aedit.Model;
import org.aedit.aedit.Null;
import org.aedit.aedit.PrimitiveTypeField;
import org.aedit.aedit.RemoveEnum;
import org.aedit.aedit.RemoveSchema;
import org.aedit.aedit.RemoveVariable;
import org.aedit.aedit.RenameEnum;
import org.aedit.aedit.RenameSchema;
import org.aedit.aedit.RenameVariable;
import org.aedit.aedit.RuleDeclaration;
import org.aedit.aedit.RuleMap;
import org.aedit.aedit.StringValue;
import org.aedit.services.AeditGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class AeditSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AeditGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == AeditPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case AeditPackage.ADD_ENUM:
				sequence_AddEnum(context, (AddEnum) semanticObject); 
				return; 
			case AeditPackage.ADD_ENUMERATION:
				sequence_AddEnumeration(context, (AddEnumeration) semanticObject); 
				return; 
			case AeditPackage.ADD_RECORD:
				sequence_AddRecord(context, (AddRecord) semanticObject); 
				return; 
			case AeditPackage.ADD_VARIABLE:
				sequence_AddVariable(context, (AddVariable) semanticObject); 
				return; 
			case AeditPackage.BOOLEAN_VALUE:
				sequence_BooleanValue(context, (BooleanValue) semanticObject); 
				return; 
			case AeditPackage.CHANGE_DEF_VALUE:
				sequence_ChangeDefValue(context, (ChangeDefValue) semanticObject); 
				return; 
			case AeditPackage.CHANGE_ENUM:
				sequence_ChangeEnum(context, (ChangeEnum) semanticObject); 
				return; 
			case AeditPackage.CHANGE_SCHEMA:
				sequence_ChangeSchema(context, (ChangeSchema) semanticObject); 
				return; 
			case AeditPackage.CHANGE_TYPE:
				sequence_ChangeType(context, (ChangeType) semanticObject); 
				return; 
			case AeditPackage.CUSTOM_TYPE_FIELD:
				sequence_CustomTypeField(context, (CustomTypeField) semanticObject); 
				return; 
			case AeditPackage.FEATURE:
				sequence_Feature(context, (Feature) semanticObject); 
				return; 
			case AeditPackage.FEATURE_MAP:
				sequence_FeatureMap(context, (FeatureMap) semanticObject); 
				return; 
			case AeditPackage.FLOAT_VALUE:
				sequence_FloatValue(context, (FloatValue) semanticObject); 
				return; 
			case AeditPackage.INT_VALUE:
				sequence_IntValue(context, (IntValue) semanticObject); 
				return; 
			case AeditPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case AeditPackage.NULL:
				sequence_Null(context, (Null) semanticObject); 
				return; 
			case AeditPackage.PRIMITIVE_TYPE_FIELD:
				sequence_PrimitiveTypeField(context, (PrimitiveTypeField) semanticObject); 
				return; 
			case AeditPackage.REMOVE_ENUM:
				sequence_RemoveEnum(context, (RemoveEnum) semanticObject); 
				return; 
			case AeditPackage.REMOVE_SCHEMA:
				sequence_RemoveSchema(context, (RemoveSchema) semanticObject); 
				return; 
			case AeditPackage.REMOVE_VARIABLE:
				sequence_RemoveVariable(context, (RemoveVariable) semanticObject); 
				return; 
			case AeditPackage.RENAME_ENUM:
				sequence_RenameEnum(context, (RenameEnum) semanticObject); 
				return; 
			case AeditPackage.RENAME_SCHEMA:
				sequence_RenameSchema(context, (RenameSchema) semanticObject); 
				return; 
			case AeditPackage.RENAME_VARIABLE:
				sequence_RenameVariable(context, (RenameVariable) semanticObject); 
				return; 
			case AeditPackage.RULE_DECLARATION:
				sequence_RuleDeclaration(context, (RuleDeclaration) semanticObject); 
				return; 
			case AeditPackage.RULE_MAP:
				sequence_RuleMap(context, (RuleMap) semanticObject); 
				return; 
			case AeditPackage.STRING_VALUE:
				sequence_StringValue(context, (StringValue) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     EnumRule returns AddEnum
	 *     AddEnum returns AddEnum
	 *
	 * Constraint:
	 *     (index=INT varName=ID)
	 */
	protected void sequence_AddEnum(ISerializationContext context, AddEnum semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AeditPackage.Literals.ADD_ENUM__INDEX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AeditPackage.Literals.ADD_ENUM__INDEX));
			if (transientValues.isValueTransient(semanticObject, AeditPackage.Literals.ADD_ENUM__VAR_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AeditPackage.Literals.ADD_ENUM__VAR_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAddEnumAccess().getIndexINTTerminalRuleCall_2_0(), semanticObject.getIndex());
		feeder.accept(grammarAccess.getAddEnumAccess().getVarNameIDTerminalRuleCall_4_0(), semanticObject.getVarName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GenericRule returns AddEnumeration
	 *     Add returns AddEnumeration
	 *     AddEnumeration returns AddEnumeration
	 *
	 * Constraint:
	 *     (index=INT namespace=[AvroIDLFile|ID] enumName=ID symbols+=ID symbols+=ID*)
	 */
	protected void sequence_AddEnumeration(ISerializationContext context, AddEnumeration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GenericRule returns AddRecord
	 *     Add returns AddRecord
	 *     AddRecord returns AddRecord
	 *
	 * Constraint:
	 *     (index=INT namespace=[AvroIDLFile|ID] recordName=ID fields+=Field*)
	 */
	protected void sequence_AddRecord(ISerializationContext context, AddRecord semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SchemaRule returns AddVariable
	 *     AddVariable returns AddVariable
	 *
	 * Constraint:
	 *     (index=INT newVar=Field)
	 */
	protected void sequence_AddVariable(ISerializationContext context, AddVariable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AeditPackage.Literals.ADD_VARIABLE__INDEX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AeditPackage.Literals.ADD_VARIABLE__INDEX));
			if (transientValues.isValueTransient(semanticObject, AeditPackage.Literals.ADD_VARIABLE__NEW_VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AeditPackage.Literals.ADD_VARIABLE__NEW_VAR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAddVariableAccess().getIndexINTTerminalRuleCall_2_0(), semanticObject.getIndex());
		feeder.accept(grammarAccess.getAddVariableAccess().getNewVarFieldParserRuleCall_4_0(), semanticObject.getNewVar());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Value returns BooleanValue
	 *     BooleanValue returns BooleanValue
	 *
	 * Constraint:
	 *     val=Boolean
	 */
	protected void sequence_BooleanValue(ISerializationContext context, BooleanValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AeditPackage.Literals.BOOLEAN_VALUE__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AeditPackage.Literals.BOOLEAN_VALUE__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBooleanValueAccess().getValBooleanParserRuleCall_0(), semanticObject.isVal());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SchemaRule returns ChangeDefValue
	 *     ChangeDefValue returns ChangeDefValue
	 *
	 * Constraint:
	 *     (field=[Field|QN] newVal=Value)
	 */
	protected void sequence_ChangeDefValue(ISerializationContext context, ChangeDefValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AeditPackage.Literals.CHANGE_DEF_VALUE__FIELD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AeditPackage.Literals.CHANGE_DEF_VALUE__FIELD));
			if (transientValues.isValueTransient(semanticObject, AeditPackage.Literals.CHANGE_DEF_VALUE__NEW_VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AeditPackage.Literals.CHANGE_DEF_VALUE__NEW_VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getChangeDefValueAccess().getFieldFieldQNParserRuleCall_1_0_1(), semanticObject.eGet(AeditPackage.Literals.CHANGE_DEF_VALUE__FIELD, false));
		feeder.accept(grammarAccess.getChangeDefValueAccess().getNewValValueParserRuleCall_3_0(), semanticObject.getNewVal());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GenericRule returns ChangeEnum
	 *     ChangeEnum returns ChangeEnum
	 *
	 * Constraint:
	 *     (schema=[EnumType|QN] rules+=EnumRule*)
	 */
	protected void sequence_ChangeEnum(ISerializationContext context, ChangeEnum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GenericRule returns ChangeSchema
	 *     ChangeSchema returns ChangeSchema
	 *
	 * Constraint:
	 *     (schema=[Type|QN] rules+=SchemaRule*)
	 */
	protected void sequence_ChangeSchema(ISerializationContext context, ChangeSchema semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SchemaRule returns ChangeType
	 *     ChangeType returns ChangeType
	 *
	 * Constraint:
	 *     (field=[Field|QN] newType=VARIABLE_TYPE)
	 */
	protected void sequence_ChangeType(ISerializationContext context, ChangeType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AeditPackage.Literals.CHANGE_TYPE__FIELD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AeditPackage.Literals.CHANGE_TYPE__FIELD));
			if (transientValues.isValueTransient(semanticObject, AeditPackage.Literals.CHANGE_TYPE__NEW_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AeditPackage.Literals.CHANGE_TYPE__NEW_TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getChangeTypeAccess().getFieldFieldQNParserRuleCall_1_0_1(), semanticObject.eGet(AeditPackage.Literals.CHANGE_TYPE__FIELD, false));
		feeder.accept(grammarAccess.getChangeTypeAccess().getNewTypeVARIABLE_TYPEParserRuleCall_3_0(), semanticObject.getNewType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Field returns CustomTypeField
	 *     CustomTypeField returns CustomTypeField
	 *
	 * Constraint:
	 *     (type=[Type|QN] varName=ID)
	 */
	protected void sequence_CustomTypeField(ISerializationContext context, CustomTypeField semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AeditPackage.Literals.CUSTOM_TYPE_FIELD__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AeditPackage.Literals.CUSTOM_TYPE_FIELD__TYPE));
			if (transientValues.isValueTransient(semanticObject, AeditPackage.Literals.FIELD__VAR_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AeditPackage.Literals.FIELD__VAR_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCustomTypeFieldAccess().getTypeTypeQNParserRuleCall_0_0_1(), semanticObject.eGet(AeditPackage.Literals.CUSTOM_TYPE_FIELD__TYPE, false));
		feeder.accept(grammarAccess.getCustomTypeFieldAccess().getVarNameIDTerminalRuleCall_1_0(), semanticObject.getVarName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FeatureMap returns FeatureMap
	 *
	 * Constraint:
	 *     name=[Feature|ID]
	 */
	protected void sequence_FeatureMap(ISerializationContext context, FeatureMap semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AeditPackage.Literals.FEATURE_MAP__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AeditPackage.Literals.FEATURE_MAP__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFeatureMapAccess().getNameFeatureIDTerminalRuleCall_1_0_1(), semanticObject.eGet(AeditPackage.Literals.FEATURE_MAP__NAME, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Feature returns Feature
	 *
	 * Constraint:
	 *     (name=ID extend=[Feature|ID]? ruleMaps+=[RuleMap|ID]*)
	 */
	protected void sequence_Feature(ISerializationContext context, Feature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Value returns FloatValue
	 *     FloatValue returns FloatValue
	 *
	 * Constraint:
	 *     val=Real
	 */
	protected void sequence_FloatValue(ISerializationContext context, FloatValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AeditPackage.Literals.FLOAT_VALUE__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AeditPackage.Literals.FLOAT_VALUE__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFloatValueAccess().getValRealParserRuleCall_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Value returns IntValue
	 *     IntValue returns IntValue
	 *
	 * Constraint:
	 *     val=INT
	 */
	protected void sequence_IntValue(ISerializationContext context, IntValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AeditPackage.Literals.INT_VALUE__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AeditPackage.Literals.INT_VALUE__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIntValueAccess().getValINTTerminalRuleCall_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (
	 *         (ruleDeclarations+=RuleDeclaration+ ((ruleMaps+=RuleMap+ featureMaps+=FeatureMap+) | featureMaps+=FeatureMap+)) | 
	 *         (((ruleDeclarations+=RuleDeclaration+ ruleMaps+=RuleMap+) | ruleMaps+=RuleMap+)? features+=Feature+ featureMaps+=FeatureMap+) | 
	 *         (ruleMaps+=RuleMap+ featureMaps+=FeatureMap+) | 
	 *         featureMaps+=FeatureMap+
	 *     )?
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Value returns Null
	 *     Null returns Null
	 *
	 * Constraint:
	 *     val='null'
	 */
	protected void sequence_Null(ISerializationContext context, Null semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AeditPackage.Literals.NULL__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AeditPackage.Literals.NULL__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNullAccess().getValNullKeyword_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Field returns PrimitiveTypeField
	 *     PrimitiveTypeField returns PrimitiveTypeField
	 *
	 * Constraint:
	 *     (type=VARIABLE_TYPE varName=ID value=Value?)
	 */
	protected void sequence_PrimitiveTypeField(ISerializationContext context, PrimitiveTypeField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EnumRule returns RemoveEnum
	 *     RemoveEnum returns RemoveEnum
	 *
	 * Constraint:
	 *     varName=ID
	 */
	protected void sequence_RemoveEnum(ISerializationContext context, RemoveEnum semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AeditPackage.Literals.REMOVE_ENUM__VAR_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AeditPackage.Literals.REMOVE_ENUM__VAR_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRemoveEnumAccess().getVarNameIDTerminalRuleCall_1_0(), semanticObject.getVarName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GenericRule returns RemoveSchema
	 *     RemoveSchema returns RemoveSchema
	 *
	 * Constraint:
	 *     (schemaType=SCHEMA_TYPE schema=[Type|QN])
	 */
	protected void sequence_RemoveSchema(ISerializationContext context, RemoveSchema semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AeditPackage.Literals.REMOVE_SCHEMA__SCHEMA_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AeditPackage.Literals.REMOVE_SCHEMA__SCHEMA_TYPE));
			if (transientValues.isValueTransient(semanticObject, AeditPackage.Literals.REMOVE_SCHEMA__SCHEMA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AeditPackage.Literals.REMOVE_SCHEMA__SCHEMA));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRemoveSchemaAccess().getSchemaTypeSCHEMA_TYPEParserRuleCall_1_0(), semanticObject.getSchemaType());
		feeder.accept(grammarAccess.getRemoveSchemaAccess().getSchemaTypeQNParserRuleCall_2_0_1(), semanticObject.eGet(AeditPackage.Literals.REMOVE_SCHEMA__SCHEMA, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SchemaRule returns RemoveVariable
	 *     RemoveVariable returns RemoveVariable
	 *
	 * Constraint:
	 *     variable=[Field|QN]
	 */
	protected void sequence_RemoveVariable(ISerializationContext context, RemoveVariable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AeditPackage.Literals.REMOVE_VARIABLE__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AeditPackage.Literals.REMOVE_VARIABLE__VARIABLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRemoveVariableAccess().getVariableFieldQNParserRuleCall_1_0_1(), semanticObject.eGet(AeditPackage.Literals.REMOVE_VARIABLE__VARIABLE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EnumRule returns RenameEnum
	 *     RenameEnum returns RenameEnum
	 *
	 * Constraint:
	 *     (oldName=ID newEnumName=ID)
	 */
	protected void sequence_RenameEnum(ISerializationContext context, RenameEnum semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AeditPackage.Literals.RENAME_ENUM__OLD_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AeditPackage.Literals.RENAME_ENUM__OLD_NAME));
			if (transientValues.isValueTransient(semanticObject, AeditPackage.Literals.RENAME_ENUM__NEW_ENUM_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AeditPackage.Literals.RENAME_ENUM__NEW_ENUM_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRenameEnumAccess().getOldNameIDTerminalRuleCall_1_0(), semanticObject.getOldName());
		feeder.accept(grammarAccess.getRenameEnumAccess().getNewEnumNameIDTerminalRuleCall_3_0(), semanticObject.getNewEnumName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GenericRule returns RenameSchema
	 *     RenameSchema returns RenameSchema
	 *
	 * Constraint:
	 *     (schemaType=SCHEMA_TYPE schema=[Type|QN] newSchName=ID)
	 */
	protected void sequence_RenameSchema(ISerializationContext context, RenameSchema semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AeditPackage.Literals.RENAME_SCHEMA__SCHEMA_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AeditPackage.Literals.RENAME_SCHEMA__SCHEMA_TYPE));
			if (transientValues.isValueTransient(semanticObject, AeditPackage.Literals.RENAME_SCHEMA__SCHEMA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AeditPackage.Literals.RENAME_SCHEMA__SCHEMA));
			if (transientValues.isValueTransient(semanticObject, AeditPackage.Literals.RENAME_SCHEMA__NEW_SCH_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AeditPackage.Literals.RENAME_SCHEMA__NEW_SCH_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRenameSchemaAccess().getSchemaTypeSCHEMA_TYPEParserRuleCall_1_0(), semanticObject.getSchemaType());
		feeder.accept(grammarAccess.getRenameSchemaAccess().getSchemaTypeQNParserRuleCall_2_0_1(), semanticObject.eGet(AeditPackage.Literals.RENAME_SCHEMA__SCHEMA, false));
		feeder.accept(grammarAccess.getRenameSchemaAccess().getNewSchNameIDTerminalRuleCall_4_0(), semanticObject.getNewSchName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SchemaRule returns RenameVariable
	 *     RenameVariable returns RenameVariable
	 *
	 * Constraint:
	 *     (variable=[Field|QN] newVarName=ID)
	 */
	protected void sequence_RenameVariable(ISerializationContext context, RenameVariable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AeditPackage.Literals.RENAME_VARIABLE__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AeditPackage.Literals.RENAME_VARIABLE__VARIABLE));
			if (transientValues.isValueTransient(semanticObject, AeditPackage.Literals.RENAME_VARIABLE__NEW_VAR_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AeditPackage.Literals.RENAME_VARIABLE__NEW_VAR_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRenameVariableAccess().getVariableFieldQNParserRuleCall_1_0_1(), semanticObject.eGet(AeditPackage.Literals.RENAME_VARIABLE__VARIABLE, false));
		feeder.accept(grammarAccess.getRenameVariableAccess().getNewVarNameIDTerminalRuleCall_3_0(), semanticObject.getNewVarName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RuleDeclaration returns RuleDeclaration
	 *
	 * Constraint:
	 *     (name=ID rules+=GenericRule*)
	 */
	protected void sequence_RuleDeclaration(ISerializationContext context, RuleDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RuleMap returns RuleMap
	 *
	 * Constraint:
	 *     (name=ID rules+=[RuleDeclaration|ID]*)
	 */
	protected void sequence_RuleMap(ISerializationContext context, RuleMap semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Value returns StringValue
	 *     StringValue returns StringValue
	 *
	 * Constraint:
	 *     val=ID
	 */
	protected void sequence_StringValue(ISerializationContext context, StringValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AeditPackage.Literals.STRING_VALUE__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AeditPackage.Literals.STRING_VALUE__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStringValueAccess().getValIDTerminalRuleCall_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
}
