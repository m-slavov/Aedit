package HelperClass;

import avroclipse.avroIDL.Annotation;
import avroclipse.avroIDL.AvroIDLFile;
import avroclipse.avroIDL.BooleanValue;
import avroclipse.avroIDL.EnumType;
import avroclipse.avroIDL.ErrorType;
import avroclipse.avroIDL.Field;
import avroclipse.avroIDL.FloatValue;
import avroclipse.avroIDL.IntValue;
import avroclipse.avroIDL.RecordType;
import avroclipse.avroIDL.StringValue;
import avroclipse.avroIDL.Type;
import avroclipse.avroIDL.TypeDef;
import avroclipse.avroIDL.Value;
import com.google.common.collect.Iterables;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.aedit.aedit.ComplexTypeField;
import org.aedit.aedit.CustomTypeField;
import org.aedit.aedit.PrimitiveTypeField;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class HelperClass {
  private static final String AVROCLIPSE_GRAMMAR_EXTENSION = "avdl";
  
  private static final String ENUM = "enum";
  
  private static final String ERROR = "error";
  
  private static final String RECORD = "record";
  
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
  
  public static List<String> getSchemasAndFields(final AvroIDLFile file, final List<String> annotations, final List<String> nameAnnotations) {
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
              {
                String _name_6 = file.getName();
                String _plus_8 = (_name_6 + ".");
                String _name_7 = ((RecordType)currentSchema).getName();
                String _plus_9 = (_plus_8 + _name_7);
                String _plus_10 = (_plus_9 + ".");
                String _name_8 = field.getName();
                String _plus_11 = (_plus_10 + _name_8);
                existingVariables.add(_plus_11);
                EList<Annotation> _annotations = field.getAnnotations();
                for (final Annotation annotation : _annotations) {
                  String _name_9 = file.getName();
                  String _plus_12 = (_name_9 + ".");
                  String _name_10 = ((RecordType)currentSchema).getName();
                  String _plus_13 = (_plus_12 + _name_10);
                  String _plus_14 = (_plus_13 + ".");
                  String _name_11 = field.getName();
                  String _plus_15 = (_plus_14 + _name_11);
                  String _plus_16 = (_plus_15 + ".");
                  String _name_12 = annotation.getName();
                  String _plus_17 = (_plus_16 + _name_12);
                  annotations.add(_plus_17);
                }
                EList<Annotation> _nameAnnotations = field.getNameAnnotations();
                for (final Annotation nameAnnotation : _nameAnnotations) {
                  String _name_13 = file.getName();
                  String _plus_18 = (_name_13 + ".");
                  String _name_14 = ((RecordType)currentSchema).getName();
                  String _plus_19 = (_plus_18 + _name_14);
                  String _plus_20 = (_plus_19 + ".");
                  String _name_15 = field.getName();
                  String _plus_21 = (_plus_20 + _name_15);
                  String _plus_22 = (_plus_21 + ".");
                  String _name_16 = nameAnnotation.getName();
                  String _plus_23 = (_plus_22 + _name_16);
                  nameAnnotations.add(_plus_23);
                }
              }
            }
          } else {
            if ((currentSchema instanceof ErrorType)) {
              String _name_6 = file.getName();
              String _plus_8 = (_name_6 + ".");
              String _name_7 = ((ErrorType)currentSchema).getName();
              String _plus_9 = (_plus_8 + _name_7);
              existingVariables.add(_plus_9);
              EList<Field> _fields_1 = ((ErrorType)currentSchema).getFields();
              for (final Field field_1 : _fields_1) {
                {
                  String _name_8 = file.getName();
                  String _plus_10 = (_name_8 + ".");
                  String _name_9 = ((ErrorType)currentSchema).getName();
                  String _plus_11 = (_plus_10 + _name_9);
                  String _plus_12 = (_plus_11 + ".");
                  String _name_10 = field_1.getName();
                  String _plus_13 = (_plus_12 + _name_10);
                  existingVariables.add(_plus_13);
                  EList<Annotation> _annotations = field_1.getAnnotations();
                  for (final Annotation annotation : _annotations) {
                    String _name_11 = file.getName();
                    String _plus_14 = (_name_11 + ".");
                    String _name_12 = ((ErrorType)currentSchema).getName();
                    String _plus_15 = (_plus_14 + _name_12);
                    String _plus_16 = (_plus_15 + ".");
                    String _name_13 = field_1.getName();
                    String _plus_17 = (_plus_16 + _name_13);
                    String _plus_18 = (_plus_17 + ".");
                    String _name_14 = annotation.getName();
                    String _plus_19 = (_plus_18 + _name_14);
                    annotations.add(_plus_19);
                  }
                  EList<Annotation> _nameAnnotations = field_1.getNameAnnotations();
                  for (final Annotation nameAnnotation : _nameAnnotations) {
                    String _name_15 = file.getName();
                    String _plus_20 = (_name_15 + ".");
                    String _name_16 = ((ErrorType)currentSchema).getName();
                    String _plus_21 = (_plus_20 + _name_16);
                    String _plus_22 = (_plus_21 + ".");
                    String _name_17 = field_1.getName();
                    String _plus_23 = (_plus_22 + _name_17);
                    String _plus_24 = (_plus_23 + ".");
                    String _name_18 = nameAnnotation.getName();
                    String _plus_25 = (_plus_24 + _name_18);
                    nameAnnotations.add(_plus_25);
                  }
                }
              }
            }
          }
        }
      }
    }
    return existingVariables;
  }
  
  public static boolean removeAnnotationFromSchema(final TypeDef typeDef, final Annotation annotationToRemove) {
    boolean _xblockexpression = false;
    {
      final List<Annotation> found = new ArrayList<Annotation>();
      EList<Annotation> _annotations = typeDef.getAnnotations();
      for (final Annotation annotation : _annotations) {
        boolean _equals = annotation.getName().equals(annotationToRemove.getName());
        if (_equals) {
          found.add(annotation);
        }
      }
      _xblockexpression = typeDef.getAnnotations().removeAll(found);
    }
    return _xblockexpression;
  }
  
  public static boolean removeAnnotationFromField(final Field field, final Annotation annotationToRemove) {
    boolean _xblockexpression = false;
    {
      final List<Annotation> found = new ArrayList<Annotation>();
      EList<Annotation> _annotations = field.getAnnotations();
      for (final Annotation annotation : _annotations) {
        boolean _equals = annotation.getName().equals(annotationToRemove.getName());
        if (_equals) {
          found.add(annotation);
        }
      }
      _xblockexpression = field.getAnnotations().removeAll(found);
    }
    return _xblockexpression;
  }
  
  public static boolean removeNameAnnotationFromField(final Field field, final Annotation annotationToRemove) {
    boolean _xblockexpression = false;
    {
      final List<Annotation> found = new ArrayList<Annotation>();
      EList<Annotation> _nameAnnotations = field.getNameAnnotations();
      for (final Annotation annotation : _nameAnnotations) {
        boolean _equals = annotation.getName().equals(annotationToRemove.getName());
        if (_equals) {
          found.add(annotation);
        }
      }
      _xblockexpression = field.getNameAnnotations().removeAll(found);
    }
    return _xblockexpression;
  }
  
  public static Field getField(final String protocolName, final String schemaName, final String fieldName, final Map<String, AvroIDLFile> avdlFiles) {
    final List<TypeDef> typeDefs = IterableExtensions.<TypeDef>toList(Iterables.<TypeDef>filter(avdlFiles.get(protocolName).getElements(), TypeDef.class));
    for (final TypeDef typeDef : typeDefs) {
      {
        final Type schema = typeDef.getType();
        if ((schema instanceof RecordType)) {
          boolean _equals = ((RecordType)schema).getName().equals(schemaName);
          if (_equals) {
            EList<Field> _fields = ((RecordType)schema).getFields();
            for (final Field field : _fields) {
              boolean _equals_1 = field.getName().equals(fieldName);
              if (_equals_1) {
                return field;
              }
            }
          }
        } else {
          if ((schema instanceof ErrorType)) {
            boolean _equals_2 = ((ErrorType)schema).getName().equals(schemaName);
            if (_equals_2) {
              EList<Field> _fields_1 = ((ErrorType)schema).getFields();
              for (final Field field_1 : _fields_1) {
                boolean _equals_3 = field_1.getName().equals(fieldName);
                if (_equals_3) {
                  return field_1;
                }
              }
            }
          }
        }
      }
    }
    return null;
  }
  
  public static Field getFieldFromSchema(final Type schema, final String fieldName) {
    if ((schema instanceof RecordType)) {
      EList<Field> _fields = ((RecordType)schema).getFields();
      for (final Field field : _fields) {
        boolean _equals = field.getName().equals(fieldName);
        if (_equals) {
          return field;
        }
      }
    } else {
      if ((schema instanceof ErrorType)) {
        EList<Field> _fields_1 = ((ErrorType)schema).getFields();
        for (final Field field_1 : _fields_1) {
          boolean _equals_1 = field_1.getName().equals(fieldName);
          if (_equals_1) {
            return field_1;
          }
        }
      }
    }
    return null;
  }
  
  public static Type getSchema(final String protocolName, final String schemaName, final Map<String, AvroIDLFile> avdlFiles) {
    final List<TypeDef> typeDefs = IterableExtensions.<TypeDef>toList(Iterables.<TypeDef>filter(avdlFiles.get(protocolName).getElements(), TypeDef.class));
    for (final TypeDef typeDef : typeDefs) {
      {
        final Type schema = typeDef.getType();
        if ((schema instanceof RecordType)) {
          boolean _equals = ((RecordType)schema).getName().equals(schemaName);
          if (_equals) {
            return schema;
          }
        } else {
          if ((schema instanceof ErrorType)) {
            boolean _equals_1 = ((ErrorType)schema).getName().equals(schemaName);
            if (_equals_1) {
              return schema;
            }
          }
        }
      }
    }
    return null;
  }
  
  public static Object getValue(final Value value) {
    Object _switchResult = null;
    boolean _matched = false;
    if (value instanceof StringValue) {
      _matched=true;
      _switchResult = ((StringValue)value).getVal();
    }
    if (!_matched) {
      if (value instanceof IntValue) {
        _matched=true;
        _switchResult = Integer.valueOf(((IntValue)value).getVal());
      }
    }
    if (!_matched) {
      if (value instanceof FloatValue) {
        _matched=true;
        _switchResult = Float.valueOf(((FloatValue)value).getVal());
      }
    }
    if (!_matched) {
      if (value instanceof BooleanValue) {
        _matched=true;
        _switchResult = Boolean.valueOf(((BooleanValue)value).isVal());
      }
    }
    if (!_matched) {
      _switchResult = "";
    }
    return _switchResult;
  }
  
  public static Object getValue(final org.aedit.aedit.Value value) {
    Object _switchResult = null;
    boolean _matched = false;
    if (value instanceof org.aedit.aedit.StringValue) {
      _matched=true;
      _switchResult = ((org.aedit.aedit.StringValue)value).getVal();
    }
    if (!_matched) {
      if (value instanceof org.aedit.aedit.IntValue) {
        _matched=true;
        _switchResult = Integer.valueOf(((org.aedit.aedit.IntValue)value).getVal());
      }
    }
    if (!_matched) {
      if (value instanceof org.aedit.aedit.FloatValue) {
        _matched=true;
        _switchResult = Float.valueOf(((org.aedit.aedit.FloatValue)value).getVal());
      }
    }
    if (!_matched) {
      if (value instanceof org.aedit.aedit.BooleanValue) {
        _matched=true;
        _switchResult = Boolean.valueOf(((org.aedit.aedit.BooleanValue)value).isVal());
      }
    }
    if (!_matched) {
      _switchResult = "";
    }
    return _switchResult;
  }
  
  public static String getFieldName(final org.aedit.aedit.Field field) {
    EObject fieldType = field.getFieldType();
    boolean _matched = false;
    if (fieldType instanceof PrimitiveTypeField) {
      _matched=true;
      return ((PrimitiveTypeField)fieldType).getVarName();
    }
    if (!_matched) {
      if (fieldType instanceof CustomTypeField) {
        _matched=true;
        return ((CustomTypeField)fieldType).getVarName();
      }
    }
    if (!_matched) {
      if (fieldType instanceof ComplexTypeField) {
        _matched=true;
        return ((ComplexTypeField)fieldType).getVarName();
      }
    }
    return null;
  }
  
  public static boolean checkIfTypeIsCorrect(final String type, final Type schemaType) {
    boolean _equals = type.equals(HelperClass.ENUM);
    if (_equals) {
      return (schemaType instanceof EnumType);
    } else {
      boolean _equals_1 = type.equals(HelperClass.ERROR);
      if (_equals_1) {
        return (schemaType instanceof ErrorType);
      } else {
        boolean _equals_2 = type.equals(HelperClass.RECORD);
        if (_equals_2) {
          return (schemaType instanceof RecordType);
        }
      }
    }
    return false;
  }
  
  public static String getAnnotationQualifiedName(final Annotation annotation) {
    String schemaName = null;
    String protocolName = null;
    final EObject annotationContainer = annotation.eContainer();
    if ((annotationContainer instanceof Field)) {
      final EObject fieldContainer = ((Field)annotationContainer).eContainer();
      if ((fieldContainer instanceof RecordType)) {
        schemaName = ((RecordType)fieldContainer).getName();
        EObject _eContainer = ((RecordType)fieldContainer).eContainer();
        final TypeDef schemaContainer = ((TypeDef) _eContainer);
        EObject _eContainer_1 = schemaContainer.eContainer();
        protocolName = ((AvroIDLFile) _eContainer_1).getName();
        String _name = ((Field)annotationContainer).getName();
        return ((((protocolName + ".") + schemaName) + ".") + _name);
      } else {
        if ((fieldContainer instanceof ErrorType)) {
          schemaName = ((ErrorType)fieldContainer).getName();
          EObject _eContainer_2 = ((ErrorType)fieldContainer).eContainer();
          final TypeDef schemaContainer_1 = ((TypeDef) _eContainer_2);
          EObject _eContainer_3 = schemaContainer_1.eContainer();
          protocolName = ((AvroIDLFile) _eContainer_3).getName();
          String _name_1 = ((Field)annotationContainer).getName();
          return ((((protocolName + ".") + schemaName) + ".") + _name_1);
        }
      }
    } else {
      if ((annotationContainer instanceof TypeDef)) {
        EObject _eContainer_4 = ((TypeDef)annotationContainer).eContainer();
        protocolName = ((AvroIDLFile) _eContainer_4).getName();
      }
    }
    return ((protocolName + ".") + schemaName);
  }
  
  public static String getFieldQualifiedName(final Field field) {
    String schemaName = null;
    String protocolName = null;
    final EObject fieldContainer = field.eContainer();
    if ((fieldContainer instanceof RecordType)) {
      schemaName = ((RecordType)fieldContainer).getName();
      EObject _eContainer = ((RecordType)fieldContainer).eContainer();
      final TypeDef schemaContainer = ((TypeDef) _eContainer);
      EObject _eContainer_1 = schemaContainer.eContainer();
      protocolName = ((AvroIDLFile) _eContainer_1).getName();
    } else {
      if ((fieldContainer instanceof ErrorType)) {
        schemaName = ((ErrorType)fieldContainer).getName();
        EObject _eContainer_2 = ((ErrorType)fieldContainer).eContainer();
        final TypeDef schemaContainer_1 = ((TypeDef) _eContainer_2);
        EObject _eContainer_3 = schemaContainer_1.eContainer();
        protocolName = ((AvroIDLFile) _eContainer_3).getName();
      }
    }
    return ((protocolName + ".") + schemaName);
  }
}
