/*
 * generated by Xtext 2.12.0
 */
package org.aedit.tests

import com.google.inject.Inject
import java.util.ArrayList
import java.util.List
import java.util.Map
import javax.inject.Provider
import org.aedit.generator.AeditGenerator
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.generator.GeneratorContext
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.util.StringInputStream
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import avroclipse.avroIDL.AvroIDLFile
import avroclipse.avroIDL.BooleanValue
import avroclipse.avroIDL.CustomTypeLink
import avroclipse.avroIDL.EnumType
import avroclipse.avroIDL.FieldType
import avroclipse.avroIDL.FloatValue
import avroclipse.avroIDL.IntValue
import avroclipse.avroIDL.PrimativeTypeLink
import avroclipse.avroIDL.RecordType
import avroclipse.avroIDL.StringValue
import avroclipse.avroIDL.TypeDef
import avroclipse.avroIDL.Value
import avroclipse.avroIDL.ErrorType
import avroclipse.avroIDL.AnnotatedTypeLink
import avroclipse.avroIDL.ArrayFieldType
import avroclipse.avroIDL.Array
import avroclipse.avroIDL.Annotation

@RunWith(XtextRunner)
@InjectWith(AvroclipseProvider)
class AeditAnnotationGeneratorTest {

	@Inject AeditGenerator generator
	@Inject Provider<ResourceSet> rsp;

	@Test
	def testGetElements() {
		val InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();

		val resourceSet = rsp.get => [
			createResource(URI.createFileURI("/Main.aedit")) => [
				load(new StringInputStream('''
					feature FeatureOne {
						RuleSet1
					}
					
					use FeatureOne;
				''', "UTF-8"), null)
			]
			createResource(URI.createFileURI("/Other.aedit")) => [
				load(new StringInputStream('''
					rule Rule1 {
						
					}
					
					ruleset RuleSet1 {
						Rule1
					}
				''', "UTF-8"), null)
			]
			createResource(URI.createFileURI("/Other.avdl")) => [
				load(new StringInputStream('''
				@namespace('NSRadar')
				protocol NSRadar{
					record Radar{
						int num;
					}
					
					enum Measures{
						Foo
					}
					
					error Err{
						int Foo;	
					}
				}''', "UTF-8"), null)
			]
		]

		val GeneratorContext context = new GeneratorContext();
		context.setCancelIndicator(CancelIndicator.NullImpl);

		generator.doGenerate(resourceSet.resources.get(0), fsa, context);
		val elements = getElements(generator.protocols)

		Assert.assertTrue(elements.contains("NSRadar.Radar"))
		Assert.assertTrue(elements.contains("NSRadar.Radar.num"))
		Assert.assertTrue(elements.contains("NSRadar.Measures"))
		Assert.assertTrue(elements.contains("NSRadar.Measures.Foo"))
		Assert.assertTrue(elements.contains("NSRadar.Err"))
		Assert.assertTrue(elements.contains("NSRadar.Err.Foo"))

	}

	@Test
	def testAddAnnotationToSchema__Record() {

		val protocolName = "NSRadar"
		val recordName = "Record"

		val InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
		val resourceSet = rsp.get => [
			createResource(URI.createFileURI("/Main.aedit")) => [
				load(new StringInputStream('''
					feature FeatureOne {
						RuleSet1
					}
					
					use FeatureOne;
				''', "UTF-8"), null)
			]
			createResource(URI.createFileURI("/Other.aedit")) => [
				load(new StringInputStream('''
					rule Rule1 {
						add.annot record «protocolName».«recordName» => @foo(foo);
						add.annot record «protocolName».«recordName» => @foo1(foo1);
					}
					
					ruleset RuleSet1 {
						Rule1
					}
				''', "UTF-8"), null)
			]
			createResource(URI.createFileURI("/Other.avdl")) => [
				load(new StringInputStream('''
				@namespace('NSRadar')
				protocol NSRadar{
					
					record Record{
						int num;
						string name;
					}
					
				}''', "UTF-8"), null)
			]
		]

		val GeneratorContext context = new GeneratorContext();
		context.setCancelIndicator(CancelIndicator.NullImpl);

		generator.doGenerate(resourceSet.resources.get(0), fsa, context);
		
		val addedAnnotations = newArrayList('@foo', '@foo1')
		
		//Assert that all annotations are added to the field
		Assert.assertArrayEquals(addedAnnotations, getSchemaAnnotations(generator.protocols.get(protocolName), recordName))
		//Assert that the annotations have the correct values
		Assert.assertTrue(getSchemaAnnotationValue(generator.protocols.get(protocolName), recordName, "@foo").equals("foo"))
		Assert.assertTrue(getSchemaAnnotationValue(generator.protocols.get(protocolName), recordName, "@foo1").equals("foo1"))

	}
	
	@Test
	def testAddAnnotationToSchema__Enum() {

		val protocolName = "NSRadar"
		val recordName = "Record"

		val InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
		val resourceSet = rsp.get => [
			createResource(URI.createFileURI("/Main.aedit")) => [
				load(new StringInputStream('''
					feature FeatureOne {
						RuleSet1
					}
					
					use FeatureOne;
				''', "UTF-8"), null)
			]
			createResource(URI.createFileURI("/Other.aedit")) => [
				load(new StringInputStream('''
					rule Rule1 {
						add.annot enum «protocolName».«recordName» => @foo(foo);
						add.annot enum «protocolName».«recordName» => @foo1(foo1);
					}
					
					ruleset RuleSet1 {
						Rule1
					}
				''', "UTF-8"), null)
			]
			createResource(URI.createFileURI("/Other.avdl")) => [
				load(new StringInputStream('''
				@namespace('NSRadar')
				protocol NSRadar{
					
					enum Record{
						NUM
					}
					
				}''', "UTF-8"), null)
			]
		]

		val GeneratorContext context = new GeneratorContext();
		context.setCancelIndicator(CancelIndicator.NullImpl);

		generator.doGenerate(resourceSet.resources.get(0), fsa, context);
		
		val addedAnnotations = newArrayList('@foo', '@foo1')
		
		//Assert that all annotations are added to the field
		Assert.assertArrayEquals(addedAnnotations, getSchemaAnnotations(generator.protocols.get(protocolName), recordName))
		//Assert that the annotations have the correct values
		Assert.assertTrue(getSchemaAnnotationValue(generator.protocols.get(protocolName), recordName, "@foo").equals("foo"))
		Assert.assertTrue(getSchemaAnnotationValue(generator.protocols.get(protocolName), recordName, "@foo1").equals("foo1"))

	}
	
	@Test
	def testAddAnnotationToSchema__Error() {

		val protocolName = "NSRadar"
		val recordName = "Record"

		val InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
		val resourceSet = rsp.get => [
			createResource(URI.createFileURI("/Main.aedit")) => [
				load(new StringInputStream('''
					feature FeatureOne {
						RuleSet1
					}
					
					use FeatureOne;
				''', "UTF-8"), null)
			]
			createResource(URI.createFileURI("/Other.aedit")) => [
				load(new StringInputStream('''
					rule Rule1 {
						add.annot error «protocolName».«recordName» => @foo(foo);
						add.annot error «protocolName».«recordName» => @foo1(foo1);
					}
					
					ruleset RuleSet1 {
						Rule1
					}
				''', "UTF-8"), null)
			]
			createResource(URI.createFileURI("/Other.avdl")) => [
				load(new StringInputStream('''
				@namespace('NSRadar')
				protocol NSRadar{
					
					error Record{
						int num;
					}
					
				}''', "UTF-8"), null)
			]
		]

		val GeneratorContext context = new GeneratorContext();
		context.setCancelIndicator(CancelIndicator.NullImpl);

		generator.doGenerate(resourceSet.resources.get(0), fsa, context);
		
		val addedAnnotations = newArrayList('@foo', '@foo1')
		
		//Assert that all annotations are added to the field
		Assert.assertArrayEquals(addedAnnotations, getSchemaAnnotations(generator.protocols.get(protocolName), recordName))
		//Assert that the annotations have the correct values
		Assert.assertTrue(getSchemaAnnotationValue(generator.protocols.get(protocolName), recordName, "@foo").equals("foo"))
		Assert.assertTrue(getSchemaAnnotationValue(generator.protocols.get(protocolName), recordName, "@foo1").equals("foo1"))

	}
	
	@Test
	def testRemoveAnnotationFromSchema__Record() {

		val protocolName = "NSRadar"
		val recordName = "Record"

		val InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
		val resourceSet = rsp.get => [
			createResource(URI.createFileURI("/Main.aedit")) => [
				load(new StringInputStream('''
					feature FeatureOne {
						RuleSet1
					}
					
					use FeatureOne;
				''', "UTF-8"), null)
			]
			createResource(URI.createFileURI("/Other.aedit")) => [
				load(new StringInputStream('''
					rule Rule1 {
						remove.annot record «protocolName».«recordName» => foo;
						remove.annot record «protocolName».«recordName» => foo1;
					}
					
					ruleset RuleSet1 {
						Rule1
					}
				''', "UTF-8"), null)
			]
			createResource(URI.createFileURI("/Other.avdl")) => [
				load(new StringInputStream('''
				@namespace('NSRadar')
				protocol NSRadar{
					
					@foo("foo")
					@foo1("foo1")
					record Record{
						int num;
						string name;
					}
					
				}''', "UTF-8"), null)
			]
		]

		val GeneratorContext context = new GeneratorContext();
		context.setCancelIndicator(CancelIndicator.NullImpl);

		generator.doGenerate(resourceSet.resources.get(0), fsa, context);
				
		//Assert that all annotations are removed from the field
		Assert.assertTrue(!getSchemaAnnotations(generator.protocols.get(protocolName), recordName).contains("@foo"))
		Assert.assertTrue(!getSchemaAnnotations(generator.protocols.get(protocolName), recordName).contains("@foo1"))
		
	}
	
	@Test
	def testRemoveAnnotationFromSchema__Enum() {

		val protocolName = "NSRadar"
		val recordName = "Record"

		val InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
		val resourceSet = rsp.get => [
			createResource(URI.createFileURI("/Main.aedit")) => [
				load(new StringInputStream('''
					feature FeatureOne {
						RuleSet1
					}
					
					use FeatureOne;
				''', "UTF-8"), null)
			]
			createResource(URI.createFileURI("/Other.aedit")) => [
				load(new StringInputStream('''
					rule Rule1 {
						remove.annot enum «protocolName».«recordName» => foo;
						remove.annot enum «protocolName».«recordName» => foo1;
					}
					
					ruleset RuleSet1 {
						Rule1
					}
				''', "UTF-8"), null)
			]
			createResource(URI.createFileURI("/Other.avdl")) => [
				load(new StringInputStream('''
				@namespace('NSRadar')
				protocol NSRadar{
					
					@foo("foo")
					@foo1("foo1")
					enum Record{
						NUM
					}
					
				}''', "UTF-8"), null)
			]
		]

		val GeneratorContext context = new GeneratorContext();
		context.setCancelIndicator(CancelIndicator.NullImpl);

		generator.doGenerate(resourceSet.resources.get(0), fsa, context);
				
		//Assert that all annotations are removed from the field
		Assert.assertTrue(!getSchemaAnnotations(generator.protocols.get(protocolName), recordName).contains("@foo"))
		Assert.assertTrue(!getSchemaAnnotations(generator.protocols.get(protocolName), recordName).contains("@foo1"))
		
	}
	
	@Test
	def testRemoveAnnotationFromSchema__Error() {

		val protocolName = "NSRadar"
		val recordName = "Record"

		val InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
		val resourceSet = rsp.get => [
			createResource(URI.createFileURI("/Main.aedit")) => [
				load(new StringInputStream('''
					feature FeatureOne {
						RuleSet1
					}
					
					use FeatureOne;
				''', "UTF-8"), null)
			]
			createResource(URI.createFileURI("/Other.aedit")) => [
				load(new StringInputStream('''
					rule Rule1 {
						remove.annot error «protocolName».«recordName» => foo;
						remove.annot error «protocolName».«recordName» => foo1;
					}
					
					ruleset RuleSet1 {
						Rule1
					}
				''', "UTF-8"), null)
			]
			createResource(URI.createFileURI("/Other.avdl")) => [
				load(new StringInputStream('''
				@namespace('NSRadar')
				protocol NSRadar{
					
					@foo("foo")
					@foo1("foo1")
					error Record{
						int num;
					}
					
				}''', "UTF-8"), null)
			]
		]

		val GeneratorContext context = new GeneratorContext();
		context.setCancelIndicator(CancelIndicator.NullImpl);

		generator.doGenerate(resourceSet.resources.get(0), fsa, context);
				
		//Assert that all annotations are removed from the field
		Assert.assertTrue(!getSchemaAnnotations(generator.protocols.get(protocolName), recordName).contains("@foo"))
		Assert.assertTrue(!getSchemaAnnotations(generator.protocols.get(protocolName), recordName).contains("@foo1"))
		
	}
	
	
	@Test
	def testAddAnnotationToField__AnnotationWithValue() {

		val protocolName = "NSRadar"
		val recordName = "Record"

		val InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
		val resourceSet = rsp.get => [
			createResource(URI.createFileURI("/Main.aedit")) => [
				load(new StringInputStream('''
					feature FeatureOne {
						RuleSet1
					}
					
					use FeatureOne;
				''', "UTF-8"), null)
			]
			createResource(URI.createFileURI("/Other.aedit")) => [
				load(new StringInputStream('''
					rule Rule1 {
						change record «protocolName».«recordName» {
								add.annot num  => @foo(foo);
								add.annot name => @foo1(foo1);
							}
					}
					
					ruleset RuleSet1 {
						Rule1
					}
				''', "UTF-8"), null)
			]
			createResource(URI.createFileURI("/Other.avdl")) => [
				load(new StringInputStream('''
				@namespace('NSRadar')
				protocol NSRadar{
					
					record Record{
						int num;
						string name;
					}
					
				}''', "UTF-8"), null)
			]
		]

		val GeneratorContext context = new GeneratorContext();
		context.setCancelIndicator(CancelIndicator.NullImpl);

		generator.doGenerate(resourceSet.resources.get(0), fsa, context);
				
		//Assert that all annotations are added to the field
		Assert.assertArrayEquals(newArrayList('@foo'), getFieldAnnotationNames(generator.protocols.get(protocolName), recordName, "num"))
		Assert.assertArrayEquals(newArrayList('@foo1'), getFieldAnnotationNames(generator.protocols.get(protocolName), recordName, "name"))
		
		//Assert that the annotations have the correct values
		Assert.assertTrue(getFieldAnnotationValue(generator.protocols.get(protocolName), recordName, "num","@foo").equals("foo"))
		Assert.assertTrue(getFieldAnnotationValue(generator.protocols.get(protocolName), recordName, "name","@foo1").equals("foo1"))

	}
	
	@Test
	def testAddNameAnnotationToField__AnnotationWithValue() {

		val protocolName = "NSRadar"
		val recordName = "Record"

		val InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
		val resourceSet = rsp.get => [
			createResource(URI.createFileURI("/Main.aedit")) => [
				load(new StringInputStream('''
					feature FeatureOne {
						RuleSet1
					}
					
					use FeatureOne;
				''', "UTF-8"), null)
			]
			createResource(URI.createFileURI("/Other.aedit")) => [
				load(new StringInputStream('''
					rule Rule1 {
						change record «protocolName».«recordName» {
								add.name_annot num  => @foo(foo);
								add.name_annot name => @foo1(foo1);
							}
					}
					
					ruleset RuleSet1 {
						Rule1
					}
				''', "UTF-8"), null)
			]
			createResource(URI.createFileURI("/Other.avdl")) => [
				load(new StringInputStream('''
				@namespace('NSRadar')
				protocol NSRadar{
					
					record Record{
						int num;
						string name;
					}
					
				}''', "UTF-8"), null)
			]
		]

		val GeneratorContext context = new GeneratorContext();
		context.setCancelIndicator(CancelIndicator.NullImpl);

		generator.doGenerate(resourceSet.resources.get(0), fsa, context);
				
		//Assert that all annotations are added to the field
		Assert.assertArrayEquals(newArrayList('@foo'), getFieldNameAnnotationNames(generator.protocols.get(protocolName), recordName, "num"))
		Assert.assertArrayEquals(newArrayList('@foo1'), getFieldNameAnnotationNames(generator.protocols.get(protocolName), recordName, "name"))
		
		//Assert that the annotations have the correct values
		Assert.assertTrue(getFieldNameAnnotationValue(generator.protocols.get(protocolName), recordName, "num","@foo").equals("foo"))
		Assert.assertTrue(getFieldNameAnnotationValue(generator.protocols.get(protocolName), recordName, "name","@foo1").equals("foo1"))

	}
	
	@Test
	def testRemoveAnnotationFromField() {

		val protocolName = "NSRadar"
		val recordName = "Record"

		val InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
		val resourceSet = rsp.get => [
			createResource(URI.createFileURI("/Main.aedit")) => [
				load(new StringInputStream('''
					feature FeatureOne {
						RuleSet1
					}
					
					use FeatureOne;
				''', "UTF-8"), null)
			]
			createResource(URI.createFileURI("/Other.aedit")) => [
				load(new StringInputStream('''
					rule Rule1 {
						change record «protocolName».«recordName» {
								remove.annot num  => foo;
								remove.annot name => foo1;
							}
					}
					
					ruleset RuleSet1 {
						Rule1
					}
				''', "UTF-8"), null)
			]
			createResource(URI.createFileURI("/Other.avdl")) => [
				load(new StringInputStream('''
				@namespace('NSRadar')
				protocol NSRadar{
					
					record Record{
						@foo("foo") int num;
						@foo1("foo1") string name;
					}
					
				}''', "UTF-8"), null)
			]
		]

		val GeneratorContext context = new GeneratorContext();
		context.setCancelIndicator(CancelIndicator.NullImpl);

		generator.doGenerate(resourceSet.resources.get(0), fsa, context);
				
		//Assert that all annotations are added to the field
		Assert.assertTrue(!getFieldAnnotationNames(generator.protocols.get(protocolName), recordName, "num").contains("@foo"))
		Assert.assertTrue(!getFieldAnnotationNames(generator.protocols.get(protocolName), recordName, "name").contains("@foo1"))
		
		//Assert that the annotations have the correct values
		Assert.assertTrue(!getFieldAnnotationValue(generator.protocols.get(protocolName), recordName, "num","@foo").equals("foo"))
		Assert.assertTrue(!getFieldAnnotationValue(generator.protocols.get(protocolName), recordName, "name","@foo1").equals("foo1"))

	}
	
	@Test
	def testRemoveNameAnnotationFromField() {

		val protocolName = "NSRadar"
		val recordName = "Record"

		val InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
		val resourceSet = rsp.get => [
			createResource(URI.createFileURI("/Main.aedit")) => [
				load(new StringInputStream('''
					feature FeatureOne {
						RuleSet1
					}
					
					use FeatureOne;
				''', "UTF-8"), null)
			]
			createResource(URI.createFileURI("/Other.aedit")) => [
				load(new StringInputStream('''
					rule Rule1 {
						change record «protocolName».«recordName» {
								remove.name_annot num  => foo;
								remove.name_annot name => foo1;
							}
					}
					
					ruleset RuleSet1 {
						Rule1
					}
				''', "UTF-8"), null)
			]
			createResource(URI.createFileURI("/Other.avdl")) => [
				load(new StringInputStream('''
				@namespace('NSRadar')
				protocol NSRadar{
					
					record Record{
						int @foo("foo") num;
						string @foo1("foo1") name;
					}
					
				}''', "UTF-8"), null)
			]
		]

		val GeneratorContext context = new GeneratorContext();
		context.setCancelIndicator(CancelIndicator.NullImpl);

		generator.doGenerate(resourceSet.resources.get(0), fsa, context);
				
		//Assert that all annotations are added to the field
		Assert.assertTrue(!getFieldNameAnnotationNames(generator.protocols.get(protocolName), recordName, "num").contains("@foo"))
		Assert.assertTrue(!getFieldAnnotationNames(generator.protocols.get(protocolName), recordName, "name").contains("@foo1"))
		
		//Assert that the annotations have the correct values
		Assert.assertTrue(!getFieldNameAnnotationValue(generator.protocols.get(protocolName), recordName, "num","@foo").equals("foo"))
		Assert.assertTrue(!getFieldNameAnnotationValue(generator.protocols.get(protocolName), recordName, "name","@foo1").equals("foo1"))

	}
	

	// Helper methods
	def getElements(Map<String, AvroIDLFile> protocols) {
		val List<String> schemasAndFields = new ArrayList<String>()
		protocols.forEach [ p1, p2 |
			for (typeDef : p2.elements.filter(TypeDef)) {
				var currentSchema = typeDef.type

				if (currentSchema instanceof EnumType) {
					schemasAndFields.add(p2.name + '.' + currentSchema.name)
					for (literal : currentSchema.literals) {
						schemasAndFields.add(p2.name + '.' + currentSchema.name + '.' + literal)
					}
				} else if (currentSchema instanceof RecordType) {
					schemasAndFields.add(p2.name + '.' + currentSchema.name)
					for (field : currentSchema.fields) {
						schemasAndFields.add(p2.name + '.' + currentSchema.name + '.' + field.name)
					}
				} else if (currentSchema instanceof ErrorType) {
					schemasAndFields.add(p2.name + '.' + currentSchema.name)
					for (field : currentSchema.fields) {
						schemasAndFields.add(p2.name + '.' + currentSchema.name + '.' + field.name)
					}
				}

			}
		]

		return schemasAndFields
	}

	def getSchemaPosition(AvroIDLFile avdl, String schemaName) {
		for (typeDef : avdl.elements.filter(TypeDef)) {
			var currentSchema = typeDef.type
			if (currentSchema.name.equals(schemaName)) {
				return avdl.elements.indexOf(typeDef)
			}
		}
	}

	def getSchemaType(AvroIDLFile avdl, String schemaName) {
		for (typeDef : avdl.elements.filter(TypeDef)) {
			var currentSchema = typeDef.type
			if (currentSchema.name.equals(schemaName)) {
				return currentSchema
			}
		}
	}
	
	def getSchemaAnnotations(AvroIDLFile avdl, String schemaName){
		for (typeDef : avdl.elements.filter(TypeDef)) {
			var currentSchema = typeDef.type
			if (currentSchema.name.equals(schemaName)) {
				var annotationNamesList = new ArrayList<String>
				for (annotation : typeDef.annotations){
					annotationNamesList.add(annotation.name)
				}
				return annotationNamesList
			}
		}
	}
	
	def getSchemaAnnotationValue(AvroIDLFile avdl, String schemaName, String annotationName){
		for (typeDef : avdl.elements.filter(TypeDef)) {
			var currentSchema = typeDef.type
			if (currentSchema.name.equals(schemaName)) {
				
				for (annotation : typeDef.annotations){
					if (annotation.name.equals(annotationName)){
						//Return the first value
						return getDefValue(annotation.values.value.get(0))
					}
				}
				
			}
		}
	}
	
	def getFieldAnnotationNames(AvroIDLFile avdl, String schemaName, String fieldName){
		for (typeDef : avdl.elements.filter(TypeDef)) {
			var currentSchema = typeDef.type
			if (currentSchema.name.equals(schemaName)) {

				if (currentSchema instanceof ErrorType) {
					for (field : currentSchema.fields) {
						if (field.name.equals(fieldName)) {
							val annotaitonList = new ArrayList<String>
							for (annotation : field.annotations){
								annotaitonList.add(annotation.name)
							}
							return annotaitonList
						}
					}
				} else if (currentSchema instanceof RecordType) {
					for (field : currentSchema.fields) {
						if (field.name.equals(fieldName)) {
							val annotaitonList = new ArrayList<String>
							for (annotation : field.annotations){
								annotaitonList.add(annotation.name)
							}
							return annotaitonList
						}
					}
				}
			}
		}
	}
	
	def getFieldNameAnnotationNames(AvroIDLFile avdl, String schemaName, String fieldName){
		for (typeDef : avdl.elements.filter(TypeDef)) {
			var currentSchema = typeDef.type
			if (currentSchema.name.equals(schemaName)) {

				if (currentSchema instanceof ErrorType) {
					for (field : currentSchema.fields) {
						if (field.name.equals(fieldName)) {
							val annotaitonList = new ArrayList<String>
							for (annotation : field.nameAnnotations){
								annotaitonList.add(annotation.name)
							}
							return annotaitonList
						}
					}
				} else if (currentSchema instanceof RecordType) {
					for (field : currentSchema.fields) {
						if (field.name.equals(fieldName)) {
							val annotaitonList = new ArrayList<String>
							for (annotation : field.nameAnnotations){
								annotaitonList.add(annotation.name)
							}
							return annotaitonList
						}
					}
				}
			}
		}
	}
	
	def getFieldAnnotations(AvroIDLFile avdl, String schemaName, String fieldName){
		for (typeDef : avdl.elements.filter(TypeDef)) {
			var currentSchema = typeDef.type
			if (currentSchema.name.equals(schemaName)) {

				if (currentSchema instanceof ErrorType) {
					for (field : currentSchema.fields) {
						if (field.name.equals(fieldName)) {
							return field.annotations
						}
					}
				} else if (currentSchema instanceof RecordType) {
					for (field : currentSchema.fields) {
						if (field.name.equals(fieldName)) {
							return field.annotations
						}
					}
				}
			}
		}
	}
	
	def getFieldNameAnnotations(AvroIDLFile avdl, String schemaName, String fieldName){
		for (typeDef : avdl.elements.filter(TypeDef)) {
			var currentSchema = typeDef.type
			if (currentSchema.name.equals(schemaName)) {

				if (currentSchema instanceof ErrorType) {
					for (field : currentSchema.fields) {
						if (field.name.equals(fieldName)) {
							return field.nameAnnotations
						}
					}
				} else if (currentSchema instanceof RecordType) {
					for (field : currentSchema.fields) {
						if (field.name.equals(fieldName)) {
							return field.nameAnnotations
						}
					}
				}
			}
		}
	}
	
	def getFieldAnnotationValue(AvroIDLFile avdl, String schemaName, String fieldName, String annotationName){
		val annotationsList = getFieldAnnotations(avdl, schemaName, fieldName)
		for (annotation : annotationsList){
			if (annotation.name.equals(annotationName)){
				return getDefValue(annotation.values.value.get(0))
			}
		}
		return false;
	}
	
	def getFieldNameAnnotationValue(AvroIDLFile avdl, String schemaName, String fieldName, String annotationName){
		val annotationsList = getFieldNameAnnotations(avdl, schemaName, fieldName)
		for (annotation : annotationsList){
			if (annotation.name.equals(annotationName)){
				return getDefValue(annotation.values.value.get(0))
			}
		}
		return false;
	}

	def getType(FieldType fieldType) {
		if (fieldType instanceof PrimativeTypeLink) {
			return fieldType.target
		} else if (fieldType instanceof CustomTypeLink) {
			if (fieldType.target instanceof RecordType) {
				return (fieldType.target as RecordType).name
			} else if (fieldType.target instanceof EnumType) {
				return (fieldType.target as EnumType).name
			} else if (fieldType.target instanceof ErrorType) {
				return (fieldType.target as ErrorType).name
			}
		}
	}


	def getDefValue(Value value) {

		if (value instanceof IntValue) {
			return value.^val
		} else if (value instanceof StringValue) {
			return value.^val
		} else if (value instanceof BooleanValue) {
			return value.^val
		} else if (value instanceof FloatValue) {
			return value.^val
		} else if (value instanceof Array){
			val values = value.values.value
			
			val valList = new ArrayList<Object>
			
			for (arrVal : values){
				if (arrVal instanceof Value){
					valList.add(getDefValue(arrVal))
				}
			}
			
			return valList
		}

	}

}
