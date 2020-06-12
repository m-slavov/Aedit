package org.aedit.validation;

public class ErrorCodes {
	
	protected static String ISSUE_CODE_PREFIX = "org.aedit.";
	
	public static String CHANGE_SCHEMA = ISSUE_CODE_PREFIX + "ChangeSchema";
	public static String CHANGE_ENUM = ISSUE_CODE_PREFIX + "ChangeEnum";
	public static String RENAME_VARIABLE = ISSUE_CODE_PREFIX + "RenameVariable";
	public static String REMOVE_SCHEMA = ISSUE_CODE_PREFIX + "RemoveSchema";
	public static String RENAME_SCHEMA = ISSUE_CODE_PREFIX + "RenameSchema";
	public static String REMOVE_VARIABLE = ISSUE_CODE_PREFIX + "RemoveVariable";
	public static String REMOVE_ENUM_CONST = ISSUE_CODE_PREFIX + "RemoveEnumConst";
	public static String CHANGE_TYPE = ISSUE_CODE_PREFIX + "ChangeType";
	public static String CHANGE_DEF_VALUE = ISSUE_CODE_PREFIX + "ChangeDefValue";
	public static String DUPLICATE_FIELD = ISSUE_CODE_PREFIX + "DuplicateField";
	public static String ADD_RECORD = ISSUE_CODE_PREFIX + "AddRecord";
	public static String ADD_VARIABLE = ISSUE_CODE_PREFIX + "AddVariable";
	public static String ADD_ENUM_CONST = ISSUE_CODE_PREFIX + "AddEnumConst";
	public static String ADD_ANNOTATION_TO_SCHEMA = ISSUE_CODE_PREFIX + "AddAnnotationToSchema";
	public static String REMOVE_ANNOTATION_FROM_SCHEMA = ISSUE_CODE_PREFIX + "RemoveAnnotationFromSchema";
	public static String ADD_ANNOTATION_TO_FIELD = ISSUE_CODE_PREFIX + "AddAnnotationToField";
	public static String ADD_NAME_ANNOTATION_TO_FIELD = ISSUE_CODE_PREFIX + "AddNameAnnotationToField";
	public static String REMOVE_ANNOTATION_FROM_FIELD = ISSUE_CODE_PREFIX + "RemoveAnnotationFromField";
	public static String REMOVE_NAME_ANNOTATION_FROM_FIELD = ISSUE_CODE_PREFIX + "RemoveNameAnnotationFromField";
	public static String REMOVE_ARRAY_VALUE = ISSUE_CODE_PREFIX + "RemoveArrayValue";
	public static String REMOVE_ARRAY_VALUE_AT_INDEX = ISSUE_CODE_PREFIX + "RemoveArrayValueAtIndex";
	public static String ADD_ARRAY_VALUE = ISSUE_CODE_PREFIX + "AddArrayValue";
			
}
