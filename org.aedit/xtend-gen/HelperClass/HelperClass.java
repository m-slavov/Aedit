package HelperClass;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.example.mydsl.myAvdl.AvroIDLFile;
import org.xtext.example.mydsl.myAvdl.Field;
import org.xtext.example.mydsl.myAvdl.FloatValue;
import org.xtext.example.mydsl.myAvdl.IntValue;
import org.xtext.example.mydsl.myAvdl.MyAvdlFactory;
import org.xtext.example.mydsl.myAvdl.PrimativeTypeLink;
import org.xtext.example.mydsl.myAvdl.StringValue;
import org.xtext.example.mydsl.myAvdl.Value;

@SuppressWarnings("all")
public class HelperClass {
  public static Field createField(final org.aedit.aedit.Field field) {
    Field _createField = MyAvdlFactory.eINSTANCE.createField();
    final Procedure1<Field> _function = (Field it) -> {
      it.setName(field.getVarName());
      PrimativeTypeLink _createPrimativeTypeLink = MyAvdlFactory.eINSTANCE.createPrimativeTypeLink();
      final Procedure1<PrimativeTypeLink> _function_1 = (PrimativeTypeLink it_1) -> {
        it_1.setTarget(field.getType());
      };
      PrimativeTypeLink _doubleArrow = ObjectExtensions.<PrimativeTypeLink>operator_doubleArrow(_createPrimativeTypeLink, _function_1);
      it.setType(_doubleArrow);
      Value defValue = null;
      String _type = field.getType();
      if (_type != null) {
        switch (_type) {
          case "int":
            IntValue _createIntValue = MyAvdlFactory.eINSTANCE.createIntValue();
            final Procedure1<IntValue> _function_2 = (IntValue it_1) -> {
              org.aedit.aedit.Value _value = field.getValue();
              it_1.setVal(((org.aedit.aedit.IntValue) _value).getVal());
            };
            IntValue _doubleArrow_1 = ObjectExtensions.<IntValue>operator_doubleArrow(_createIntValue, _function_2);
            defValue = _doubleArrow_1;
            break;
          case "double":
            FloatValue _createFloatValue = MyAvdlFactory.eINSTANCE.createFloatValue();
            final Procedure1<FloatValue> _function_3 = (FloatValue it_1) -> {
              org.aedit.aedit.Value _value = field.getValue();
              it_1.setVal(((org.aedit.aedit.FloatValue) _value).getVal());
            };
            FloatValue _doubleArrow_2 = ObjectExtensions.<FloatValue>operator_doubleArrow(_createFloatValue, _function_3);
            defValue = _doubleArrow_2;
            break;
          case "string":
            StringValue _createStringValue = MyAvdlFactory.eINSTANCE.createStringValue();
            final Procedure1<StringValue> _function_4 = (StringValue it_1) -> {
              org.aedit.aedit.Value _value = field.getValue();
              it_1.setVal(((org.aedit.aedit.StringValue) _value).getVal());
            };
            StringValue _doubleArrow_3 = ObjectExtensions.<StringValue>operator_doubleArrow(_createStringValue, _function_4);
            defValue = _doubleArrow_3;
            break;
          case "long":
            IntValue _createIntValue_1 = MyAvdlFactory.eINSTANCE.createIntValue();
            final Procedure1<IntValue> _function_5 = (IntValue it_1) -> {
              org.aedit.aedit.Value _value = field.getValue();
              it_1.setVal(((org.aedit.aedit.IntValue) _value).getVal());
            };
            IntValue _doubleArrow_4 = ObjectExtensions.<IntValue>operator_doubleArrow(_createIntValue_1, _function_5);
            defValue = _doubleArrow_4;
            break;
        }
      }
      it.setDefault(defValue);
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
        final Exception exception = (Exception)_t;
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
        final Exception exception = (Exception)_t;
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
        final Exception exception = (Exception)_t;
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
  
  private static String filePath = "D:\\School\\runtime-EclipseXtext\\Testbench\\src\\avdl";
  
  public static Map<String, AvroIDLFile> getAvroFiles(final Resource resource) {
    final File dir = new File(HelperClass.filePath);
    final File[] directoryListing = dir.listFiles();
    if (((List<File>)Conversions.doWrapArray(directoryListing))!=null) {
      final Consumer<File> _function = (File file) -> {
        String _name = file.getName();
        String _plus = ("platform:/resource/Testbench/src/avdl/" + _name);
        AvroIDLFile avroIDLFile = HelperClass.loadAvroIDLFile(URI.createURI(_plus), resource);
        HelperClass.protocols.put(avroIDLFile.getName(), avroIDLFile);
      };
      ((List<File>)Conversions.doWrapArray(directoryListing)).forEach(_function);
    }
    return HelperClass.protocols;
  }
  
  private static AvroIDLFile loadAvroIDLFile(final URI uri, final Resource resource) {
    final Resource res = resource.getResourceSet().getResource(uri, true);
    EObject _get = res.getContents().get(0);
    final AvroIDLFile originalAvroFile = ((AvroIDLFile) _get);
    final AvroIDLFile copyAvroFile = EcoreUtil2.<AvroIDLFile>copy(originalAvroFile);
    return copyAvroFile;
  }
}
