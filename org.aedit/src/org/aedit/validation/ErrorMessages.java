package org.aedit.validation;

public class ErrorMessages {

	public static String TYPE_MISSMATCH = "ERROR: Type missmatch!";
	public static String DUPLICATE_ANNOTATION = "ERROR: Annotation with this name already exists!";
	public static String DUPLICATE_SCHEMA = "ERROR: Schema with this name already exists!";
	public static String DUPLICATE_FIELD = "ERROR: Field with this name already exists!";
	public static String FIELD_NOT_IN_SCHEMA = "ERROR: Field is not contained in current schema!";
	public static String ANNOTATION_NOT_IN_FIELD = "ERROR: Field does not contain such annotation!";
	public static String ANNOTATION_NOT_IN_SCHEMA = "ERROR: Schema does not contain such annotation!";
	public static String DELETED_ANNOTATION = "ERROR: Annotation has already been deleted!";
	public static String NOT_ARRAY = "ERROR: Field is not an array!";
	public static String INDEX_OUT_OF_RANGE = "ERROR: Index out of range!";
	public static String DELETED_FIELD = "ERROR: Field has been deleted!";
	public static String EMPTY_ARRAY = "ERROR: EmptyArray";
	public static String VALUE_DOES_NOT_EXIST_IN_ARRAY = "ERROR: Value does not exist in array!";
	public static String DELETED_SCHEMA = "ERROR: Schema has been deleted!" ;
	public static String DUPLICATE_ENUM_CONST = "ERROR: Constant already exists!";
	public static String NON_EXISTENT_ENUM_CONST = "ERROR: Constant does not exist!";
	public static String REMOVED_ENUM_CONST = "ERROR: Constant has been reemoved!";
	public static String INVALID_NAME = "ERROR: Cannot use this name. Please select one from the list!";
	public static String DUPLICATE_NAME = "ERROR: Cannot use this name. Please select one from the list!";
	public static String DUPLICATE_RULE = "ERROR: Rule with this name already exists!";
	
	public static String STRING_TO_INT = "ERROR: Cannot assign string to int!";
	public static String FLOAT_TO_INT = "ERROR: Cannot assign float to int!";
	
	public static String STRING_TO_LONG = "ERROR: Cannot assign string to long!";
	public static String FLOAT_TO_LONG = "ERROR: Cannot assign float to long!";
	
	public static String STRING_TO_DOUBLE = "ERROR: Cannot assign string to double!";
	public static String STRING_TO_FLOAT = "ERROR: Cannot assign string to float!";
	
	public static String INTEGER_TO_STRING = "ERROR: Cannot assign integer to string!";
	public static String FLOAT_TO_STRING = "ERROR: Cannot assign float to integer!";
	
	public static String FLOAT_TO_BOOL = "ERROR: Cannot assign float to boolean!";
	public static String INTEGER_TO_BOOL = "ERROR: Cannot assign integer to boolean!";

	public static String CONVERT_INT_TO_STRING = "ERROR: Cannot convert integer to string!";
	public static String CONVERT_INT_TO_INT = "ERROR: Cannot convert integer to integer!";
	public static String CONVERT_INT_TO_BOOL = "ERROR: Cannot convert integer to boolean!";

	public static String CONVERT_LONG_TO_STRING = "ERROR: Cannot convert long to string!";
	public static String CONVERT_LONG_TO_INT = "ERROR: Cannot convert long to integer!";
	public static String CONVERT_LONG_TO_DOUBLE = "ERROR: Cannot convert long to double!";
	public static String CONVERT_LONG_TO_LONG = "ERROR: Cannot convert long to long!";
	public static String CONVERT_LONG_TO_BOOL = "ERROR: Cannot convert long to boolean!";
	
	public static String CONVERT_DOUBLE_TO_STRING = "ERROR: Cannot convert double to string!";
	public static String CONVERT_DOUBLE_TO_INT = "ERROR: Cannot convert double to integer!";
	public static String CONVERT_DOUBLE_TO_DOUBLE = "ERROR: Cannot convert double to double!";
	public static String CONVERT_DOUBLE_TO_BOOL = "ERROR: Cannot convert double to boolean!";
}
