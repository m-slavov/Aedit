package HelperClass;

import avroclipse.avroIDL.Annotation;
import avroclipse.avroIDL.AvroIDLFile;
import avroclipse.avroIDL.EnumType;
import avroclipse.avroIDL.ErrorType;
import avroclipse.avroIDL.Field;
import avroclipse.avroIDL.RecordType;
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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class HelperClass {
  private static final String AVROCLIPSE_GRAMMAR_EXTENSION = "avdl";
  
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
}
