package HelperClass;

import avroclipse.avroIDL.AvroIDLFactory;
import avroclipse.avroIDL.AvroIDLFile;
import avroclipse.avroIDL.BooleanValue;
import avroclipse.avroIDL.CustomTypeLink;
import avroclipse.avroIDL.EnumType;
import avroclipse.avroIDL.Field;
import avroclipse.avroIDL.FloatValue;
import avroclipse.avroIDL.IntValue;
import avroclipse.avroIDL.PrimativeTypeLink;
import avroclipse.avroIDL.RecordType;
import avroclipse.avroIDL.StringValue;
import avroclipse.avroIDL.Type;
import avroclipse.avroIDL.TypeDef;
import com.google.common.collect.Iterables;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.aedit.aedit.CustomTypeField;
import org.aedit.aedit.PrimitiveTypeField;
import org.aedit.aedit.Value;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class HelperClass {
  private static final String AVROCLIPSE_GRAMMAR_EXTENSION = "avdl";
  
  public static Field createField(final org.aedit.aedit.Field field) {
    if ((field instanceof PrimitiveTypeField)) {
      return HelperClass.createPrimitiveTypeField(((PrimitiveTypeField)field));
    } else {
      if ((field instanceof CustomTypeField)) {
        return HelperClass.createCustomTypeField(((CustomTypeField)field));
      }
    }
    return null;
  }
  
  private static Field createPrimitiveTypeField(final PrimitiveTypeField field) {
    Field _createField = AvroIDLFactory.eINSTANCE.createField();
    final Procedure1<Field> _function = (Field it) -> {
      it.setName(field.getVarName());
      PrimativeTypeLink _createPrimativeTypeLink = AvroIDLFactory.eINSTANCE.createPrimativeTypeLink();
      final Procedure1<PrimativeTypeLink> _function_1 = (PrimativeTypeLink it_1) -> {
        it_1.setTarget(field.getType());
      };
      PrimativeTypeLink _doubleArrow = ObjectExtensions.<PrimativeTypeLink>operator_doubleArrow(_createPrimativeTypeLink, _function_1);
      it.setType(_doubleArrow);
      Value _value = field.getValue();
      boolean _tripleNotEquals = (_value != null);
      if (_tripleNotEquals) {
        avroclipse.avroIDL.Value defValue = null;
        String _type = field.getType();
        if (_type != null) {
          switch (_type) {
            case "int":
              IntValue _createIntValue = AvroIDLFactory.eINSTANCE.createIntValue();
              final Procedure1<IntValue> _function_2 = (IntValue it_1) -> {
                Value _value_1 = field.getValue();
                it_1.setVal(((org.aedit.aedit.IntValue) _value_1).getVal());
              };
              IntValue _doubleArrow_1 = ObjectExtensions.<IntValue>operator_doubleArrow(_createIntValue, _function_2);
              defValue = _doubleArrow_1;
              break;
            case "double":
              FloatValue _createFloatValue = AvroIDLFactory.eINSTANCE.createFloatValue();
              final Procedure1<FloatValue> _function_3 = (FloatValue it_1) -> {
                Value _value_1 = field.getValue();
                it_1.setVal(((org.aedit.aedit.FloatValue) _value_1).getVal());
              };
              FloatValue _doubleArrow_2 = ObjectExtensions.<FloatValue>operator_doubleArrow(_createFloatValue, _function_3);
              defValue = _doubleArrow_2;
              break;
            case "string":
              StringValue _createStringValue = AvroIDLFactory.eINSTANCE.createStringValue();
              final Procedure1<StringValue> _function_4 = (StringValue it_1) -> {
                Value _value_1 = field.getValue();
                it_1.setVal(((org.aedit.aedit.StringValue) _value_1).getVal());
              };
              StringValue _doubleArrow_3 = ObjectExtensions.<StringValue>operator_doubleArrow(_createStringValue, _function_4);
              defValue = _doubleArrow_3;
              break;
            case "long":
              IntValue _createIntValue_1 = AvroIDLFactory.eINSTANCE.createIntValue();
              final Procedure1<IntValue> _function_5 = (IntValue it_1) -> {
                Value _value_1 = field.getValue();
                it_1.setVal(((org.aedit.aedit.IntValue) _value_1).getVal());
              };
              IntValue _doubleArrow_4 = ObjectExtensions.<IntValue>operator_doubleArrow(_createIntValue_1, _function_5);
              defValue = _doubleArrow_4;
              break;
            case "float":
              FloatValue _createFloatValue_1 = AvroIDLFactory.eINSTANCE.createFloatValue();
              final Procedure1<FloatValue> _function_6 = (FloatValue it_1) -> {
                Value _value_1 = field.getValue();
                it_1.setVal(((org.aedit.aedit.FloatValue) _value_1).getVal());
              };
              FloatValue _doubleArrow_5 = ObjectExtensions.<FloatValue>operator_doubleArrow(_createFloatValue_1, _function_6);
              defValue = _doubleArrow_5;
              break;
            case "boolean":
              BooleanValue _createBooleanValue = AvroIDLFactory.eINSTANCE.createBooleanValue();
              final Procedure1<BooleanValue> _function_7 = (BooleanValue it_1) -> {
                Value _value_1 = field.getValue();
                it_1.setVal(((org.aedit.aedit.BooleanValue) _value_1).isVal());
              };
              BooleanValue _doubleArrow_6 = ObjectExtensions.<BooleanValue>operator_doubleArrow(_createBooleanValue, _function_7);
              defValue = _doubleArrow_6;
              break;
          }
        }
        it.setDefault(defValue);
      }
    };
    Field newField = ObjectExtensions.<Field>operator_doubleArrow(_createField, _function);
    return newField;
  }
  
  private static Field createCustomTypeField(final CustomTypeField field) {
    Field _createField = AvroIDLFactory.eINSTANCE.createField();
    final Procedure1<Field> _function = (Field it) -> {
      it.setName(field.getVarName());
      CustomTypeLink _createCustomTypeLink = AvroIDLFactory.eINSTANCE.createCustomTypeLink();
      final Procedure1<CustomTypeLink> _function_1 = (CustomTypeLink it_1) -> {
        it_1.setTarget(field.getType());
      };
      CustomTypeLink _doubleArrow = ObjectExtensions.<CustomTypeLink>operator_doubleArrow(_createCustomTypeLink, _function_1);
      it.setType(_doubleArrow);
    };
    Field newField = ObjectExtensions.<Field>operator_doubleArrow(_createField, _function);
    return newField;
  }
  
  public static boolean tryParseInt(final String value) {
    try {
      Integer.parseInt(value);
      return true;
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        return false;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public static boolean tryParseFloat(final String value) {
    try {
      Float.parseFloat(value);
      return true;
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        return false;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public static boolean tryParseLong(final String value) {
    try {
      Long.parseLong(value);
      return true;
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        return false;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public static Object deepCopy(final Object object) {
    try {
      ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
      ObjectOutputStream outputStrm = new ObjectOutputStream(outputStream);
      outputStrm.writeObject(object);
      byte[] _byteArray = outputStream.toByteArray();
      ByteArrayInputStream inputStream = new ByteArrayInputStream(_byteArray);
      ObjectInputStream objInputStream = new ObjectInputStream(inputStream);
      return objInputStream.readObject();
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        e.printStackTrace();
        return null;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  private static Map<String, AvroIDLFile> protocols = new HashMap<String, AvroIDLFile>();
  
  public static Map<String, AvroIDLFile> getAvroFiles(final Resource resource) {
    EList<Resource> _resources = resource.getResourceSet().getResources();
    for (final Resource res : _resources) {
      {
        String fileExtension = res.getURI().fileExtension();
        if (((fileExtension != null) && fileExtension.equals(HelperClass.AVROCLIPSE_GRAMMAR_EXTENSION))) {
          boolean _isEmpty = res.getContents().isEmpty();
          boolean _not = (!_isEmpty);
          if (_not) {
            EObject _get = res.getContents().get(0);
            AvroIDLFile avdlModel = EcoreUtil2.<AvroIDLFile>copy(((AvroIDLFile) _get));
            HelperClass.protocols.put(avdlModel.getName(), avdlModel);
          }
        }
      }
    }
    return HelperClass.protocols;
  }
  
  public static List<String> getSchemasAndFields(final AvroIDLFile file) {
    final List<String> existingVariables = new ArrayList<String>();
    Iterable<TypeDef> _filter = Iterables.<TypeDef>filter(file.getElements(), TypeDef.class);
    for (final TypeDef typeDef : _filter) {
      {
        Type currentSchema = typeDef.getType();
        if ((currentSchema instanceof EnumType)) {
          String _name = file.getName();
          String _plus = (_name + ".");
          String _name_1 = ((EnumType)currentSchema).getName();
          String _plus_1 = (_plus + _name_1);
          existingVariables.add(_plus_1);
          EList<String> _literals = ((EnumType)currentSchema).getLiterals();
          for (final String literal : _literals) {
            String _name_2 = file.getName();
            String _plus_2 = (_name_2 + ".");
            String _name_3 = ((EnumType)currentSchema).getName();
            String _plus_3 = (_plus_2 + _name_3);
            String _plus_4 = (_plus_3 + ".");
            String _plus_5 = (_plus_4 + literal);
            existingVariables.add(_plus_5);
          }
        } else {
          if ((currentSchema instanceof RecordType)) {
            String _name_4 = file.getName();
            String _plus_6 = (_name_4 + ".");
            String _name_5 = ((RecordType)currentSchema).getName();
            String _plus_7 = (_plus_6 + _name_5);
            existingVariables.add(_plus_7);
            EList<Field> _fields = ((RecordType)currentSchema).getFields();
            for (final Field field : _fields) {
              String _name_6 = file.getName();
              String _plus_8 = (_name_6 + ".");
              String _name_7 = ((RecordType)currentSchema).getName();
              String _plus_9 = (_plus_8 + _name_7);
              String _plus_10 = (_plus_9 + ".");
              String _name_8 = field.getName();
              String _plus_11 = (_plus_10 + _name_8);
              existingVariables.add(_plus_11);
            }
          }
        }
      }
    }
    return existingVariables;
  }
}
