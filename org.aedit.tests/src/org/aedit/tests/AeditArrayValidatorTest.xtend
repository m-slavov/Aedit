/*
 * generated by Xtext 2.12.0
 */
package org.aedit.tests

import com.google.inject.Inject
import javax.inject.Provider
import org.aedit.aedit.AeditPackage
import org.aedit.aedit.Model
import org.aedit.validation.ErrorCodes
import org.aedit.validation.ErrorMessages
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.eclipse.xtext.util.StringInputStream
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(AvroclipseProvider)
class AeditArrayValidatorTest {

	@Inject extension ValidationTestHelper
	@Inject extension ParseHelper<Model>

	@Inject
	Provider<ResourceSet> rsp;

	// Test add value to array
	@Test
	def void testAddArrayValue__IncorrectField() {

		parse('''
			rule Rule1 {
					change record SRF.Burst_parameters {
						add_value.at(0) myArray1 => 1;
					}
				}
		''', URI.createFileURI("/Main.aedit"), rsp.get => [
			createResource(URI.createFileURI("/Other.avdl")) => [
				load(new StringInputStream('''
				@namespace('SRF')
				protocol SRF{
					record Burst_parameters{ 
						array <int> myArray = [1 , 0  ]; 
					}
					record Timing {
						array <int> myArray1 = [1 , 0  ]; 
					}
					
				}''', "UTF-8"), null)
			]
		]).assertMethod(AeditPackage.eINSTANCE.addValueToArray, ErrorCodes.ADD_ARRAY_VALUE,
			ErrorMessages.FIELD_NOT_IN_SCHEMA)

	}

	@Test
	def void testAddArrayValue__NoErrors() {

		parse('''
			rule Rule1 {
					change record SRF.Burst_parameters {
						add_value.at(0) myArray => 1;
					}
				}
		''', URI.createFileURI("/Main.aedit"), rsp.get => [
			createResource(URI.createFileURI("/Other.avdl")) => [
				load(new StringInputStream('''
				@namespace('SRF')
				protocol SRF{
					record Burst_parameters{ 
						array <int> myArray = [1 , 0  ]; 
					}
					record Timing {
						array <int> myArray1 = [1 , 0  ]; 
					}
					
				}''', "UTF-8"), null)
			]
		]).assertNoErrors

	}

//	@Test
//	def void testAddArrayValue__NotArray() {
//
//		parse('''
//			rule Rule1 {
//					change record SRF.Burst_parameters {
//						add_value.at(0) foo => 1;
//					}
//				}
//		''', URI.createFileURI("/Main.aedit"), rsp.get => [
//			createResource(URI.createFileURI("/Other.avdl")) => [
//				load(new StringInputStream('''
//				@namespace('SRF')
//				protocol SRF{
//					record Burst_parameters{ 
//						array <int> myArray = [1 , 0  ]; 
//						int foo;
//					}
//					
//				}''', "UTF-8"), null)
//			]
//		]).assertMethod(AeditPackage.eINSTANCE.addValueToArray, ErrorCodes.ADD_ARRAY_VALUE, ErrorMessages.NOT_ARRAY)
//
//	}

	@Test
	def void testAddArrayValue__DeletedArray() {

		parse('''
			rule Rule1 {
					change record SRF.Burst_parameters {
						remove myArray;
						add_value.at(0) myArray => 1;
					}
				}
		''', URI.createFileURI("/Main.aedit"), rsp.get => [
			createResource(URI.createFileURI("/Other.avdl")) => [
				load(new StringInputStream('''
				@namespace('SRF')
				protocol SRF{
					record Burst_parameters{ 
						array <int> myArray = [1 , 0  ]; 
						int foo;
					}
					
				}''', "UTF-8"), null)
			]
		]).assertMethod(AeditPackage.eINSTANCE.addValueToArray, ErrorCodes.ADD_ARRAY_VALUE, ErrorMessages.DELETED_FIELD)

	}

	@Test
	def void testAddArrayValue__IndexOutOfRange() {

		parse('''
			rule Rule1 {
					change record SRF.Burst_parameters {
						add_value.at(3) myArray => 1;
					}
				}
		''', URI.createFileURI("/Main.aedit"), rsp.get => [
			createResource(URI.createFileURI("/Other.avdl")) => [
				load(new StringInputStream('''
				@namespace('SRF')
				protocol SRF{
					record Burst_parameters{ 
						array <int> myArray = [1 , 0  ]; 
						int foo;
					}
					
				}''', "UTF-8"), null)
			]
		]).assertMethod(AeditPackage.eINSTANCE.addValueToArray, ErrorCodes.ADD_ARRAY_VALUE, ErrorMessages.INDEX_OUT_OF_RANGE)

	}
	
	/**
	 * Check if the size of an array increases dynamically after a value is added.
	 */
	@Test
	def void testAddArrayValue__DynamicIndex(){
			parse('''
			rule Rule1 {
					change record SRF.Burst_parameters {
						add_value.at(2) myArray => 1;
						add_value.at(3) myArray => 1;
					}
				}
		''', URI.createFileURI("/Main.aedit"), rsp.get => [
			createResource(URI.createFileURI("/Other.avdl")) => [
				load(new StringInputStream('''
				@namespace('SRF')
				protocol SRF{
					record Burst_parameters{ 
						array <int> myArray = [1 , 0  ]; 
						int foo;
					}
					
				}''', "UTF-8"), null)
			]
		]).assertNoErrors
	}
	
	@Test
	def void testAddArrayValue__IndexOutOfRangeAfterAddition(){
			parse('''
			rule Rule1 {
					change record SRF.Burst_parameters {
						add_value.at(2) myArray => 1;
						add_value.at(4) myArray => 1;
					}
				}
		''', URI.createFileURI("/Main.aedit"), rsp.get => [
			createResource(URI.createFileURI("/Other.avdl")) => [
				load(new StringInputStream('''
				@namespace('SRF')
				protocol SRF{
					record Burst_parameters{ 
						array <int> myArray = [1 , 0  ]; 
						int foo;
					}
					
				}''', "UTF-8"), null)
			]
		]).assertMethod(AeditPackage.eINSTANCE.addValueToArray, ErrorCodes.ADD_ARRAY_VALUE, ErrorMessages.INDEX_OUT_OF_RANGE)
	}
	
	//Test remove array value at index
	
	@Test
	def void testRemoveArrayValueAtIndex__IncorrectField(){
			parse('''
			rule Rule1 {
					change record SRF.Burst_parameters {
						remove_value.at(0) myArray1;
					}
				}
		''', URI.createFileURI("/Main.aedit"), rsp.get => [
			createResource(URI.createFileURI("/Other.avdl")) => [
				load(new StringInputStream('''
				@namespace('SRF')
				protocol SRF{
					record Burst_parameters{ 
						array <int> myArray = [1 , 0  ]; 
					}
					
					record Foo{ 
						array <int> myArray1 = [1 , 0  ]; 
					}
					
				}''', "UTF-8"), null)
			]
		]).assertMethod(AeditPackage.eINSTANCE.removeArrayValueAtIndex, ErrorCodes.REMOVE_ARRAY_VALUE_AT_INDEX, ErrorMessages.FIELD_NOT_IN_SCHEMA)
	}
	
	@Test
	def void testRemoveArrayValueAtIndex__NoErrors(){
			parse('''
			rule Rule1 {
					change record SRF.Burst_parameters {
						remove_value.at(1) myArray;
					}
				}
		''', URI.createFileURI("/Main.aedit"), rsp.get => [
			createResource(URI.createFileURI("/Other.avdl")) => [
				load(new StringInputStream('''
				@namespace('SRF')
				protocol SRF{
					record Burst_parameters{ 
						array <int> myArray = [1 , 0  ]; 
					}
					
					record Foo{ 
						array <int> myArray1 = [1 , 0  ]; 
					}
					
				}''', "UTF-8"), null)
			]
		]).assertNoErrors
	}
	
//	@Test
//	def void testRemoveArrayValueAtIndex__NotArray(){
//			parse('''
//			rule Rule1 {
//					change record SRF.Burst_parameters {
//						remove_value.at(1) foo;
//					}
//				}
//		''', URI.createFileURI("/Main.aedit"), rsp.get => [
//			createResource(URI.createFileURI("/Other.avdl")) => [
//				load(new StringInputStream('''
//				@namespace('SRF')
//				protocol SRF{
//					record Burst_parameters{ 
//						array <int> myArray = [1 , 0  ]; 
//						int foo;
//					}
//					
//				}''', "UTF-8"), null)
//			]
//		]).assertMethod(AeditPackage.eINSTANCE.removeArrayValueAtIndex, ErrorCodes.REMOVE_ARRAY_VALUE_AT_INDEX, ErrorMessages.NOT_ARRAY)
//	}
	
	@Test
	def void testRemoveArrayValueAtIndex__DeletedArray(){
			parse('''
			rule Rule1 {
					change record SRF.Burst_parameters {
						remove myArray;
						remove_value.at(1) myArray;
					}
				}
		''', URI.createFileURI("/Main.aedit"), rsp.get => [
			createResource(URI.createFileURI("/Other.avdl")) => [
				load(new StringInputStream('''
				@namespace('SRF')
				protocol SRF{
					record Burst_parameters{ 
						array <int> myArray = [1 , 0  ]; 
					}
					
				}''', "UTF-8"), null)
			]
		]).assertMethod(AeditPackage.eINSTANCE.removeArrayValueAtIndex, ErrorCodes.REMOVE_ARRAY_VALUE_AT_INDEX, ErrorMessages.DELETED_FIELD)
	}
	
	@Test
	def void testRemoveArrayValueAtIndex__EmptyArray(){
			parse('''
			rule Rule1 {
					change record SRF.Burst_parameters {
						remove_value.at(1) myArray;
					}
				}
		''', URI.createFileURI("/Main.aedit"), rsp.get => [
			createResource(URI.createFileURI("/Other.avdl")) => [
				load(new StringInputStream('''
				@namespace('SRF')
				protocol SRF{
					record Burst_parameters{ 
						array <int> myArray; 
					}
					
				}''', "UTF-8"), null)
			]
		]).assertMethod(AeditPackage.eINSTANCE.removeArrayValueAtIndex, ErrorCodes.REMOVE_ARRAY_VALUE_AT_INDEX, ErrorMessages.EMPTY_ARRAY)
	}
	
	@Test
	def void testRemoveArrayValueAtIndex__IndexOutOfRange(){
			parse('''
			rule Rule1 {
					change record SRF.Burst_parameters {
						remove_value.at(4) myArray;
					}
				}
		''', URI.createFileURI("/Main.aedit"), rsp.get => [
			createResource(URI.createFileURI("/Other.avdl")) => [
				load(new StringInputStream('''
				@namespace('SRF')
				protocol SRF{
					record Burst_parameters{ 
						array <int> myArray = [1,2]; 
					}
					
				}''', "UTF-8"), null)
			]
		]).assertMethod(AeditPackage.eINSTANCE.removeArrayValueAtIndex, ErrorCodes.REMOVE_ARRAY_VALUE_AT_INDEX, ErrorMessages.INDEX_OUT_OF_RANGE)
	}
	
	@Test
	def void testRemoveArrayValueAtIndex__DynamicIndexError(){
			parse('''
			rule Rule1 {
					change record SRF.Burst_parameters {
						remove_value.at(1) myArray;
						remove_value.at(1) myArray;
					}
				}
		''', URI.createFileURI("/Main.aedit"), rsp.get => [
			createResource(URI.createFileURI("/Other.avdl")) => [
				load(new StringInputStream('''
				@namespace('SRF')
				protocol SRF{
					record Burst_parameters{ 
						array <int> myArray = [1,2]; 
					}
					
				}''', "UTF-8"), null)
			]
		]).assertMethod(AeditPackage.eINSTANCE.removeArrayValueAtIndex, ErrorCodes.REMOVE_ARRAY_VALUE_AT_INDEX, ErrorMessages.INDEX_OUT_OF_RANGE)
	}
	
	@Test
	def void testRemoveArrayValueAtIndex__DynamicIndexNoError(){
			parse('''
			rule Rule1 {
					change record SRF.Burst_parameters {
						remove_value.at(1) myArray;
						remove_value.at(0) myArray;
					}
				}
		''', URI.createFileURI("/Main.aedit"), rsp.get => [
			createResource(URI.createFileURI("/Other.avdl")) => [
				load(new StringInputStream('''
				@namespace('SRF')
				protocol SRF{
					record Burst_parameters{ 
						array <int> myArray = [1,2]; 
					}
					
				}''', "UTF-8"), null)
			]
		]).assertNoErrors
	}
	
	//Test remove array value
	
	@Test
	def void testRemoveArrayValue__IncorrectField(){
			parse('''
			rule Rule1 {
					change record SRF.Burst_parameters {
						remove_value myArray1 => 1;
					}
				}
		''', URI.createFileURI("/Main.aedit"), rsp.get => [
			createResource(URI.createFileURI("/Other.avdl")) => [
				load(new StringInputStream('''
				@namespace('SRF')
				protocol SRF{
					record Burst_parameters{ 
						array <int> myArray = [1 , 0  ]; 
					}
					
					record Foo{ 
						array <int> myArray1 = [1 , 0  ]; 
					}
					
				}''', "UTF-8"), null)
			]
		]).assertMethod(AeditPackage.eINSTANCE.removeArrayValue, ErrorCodes.REMOVE_ARRAY_VALUE, ErrorMessages.FIELD_NOT_IN_SCHEMA)
	}
	
	@Test
	def void testRemoveArrayValue__NoErrors(){
			parse('''
			rule Rule1 {
					change record SRF.Burst_parameters {
						remove_value myArray => 1;
					}
				}
		''', URI.createFileURI("/Main.aedit"), rsp.get => [
			createResource(URI.createFileURI("/Other.avdl")) => [
				load(new StringInputStream('''
				@namespace('SRF')
				protocol SRF{
					record Burst_parameters{ 
						array <int> myArray = [1 , 0  ]; 
					}
					
				}''', "UTF-8"), null)
			]
		]).assertNoErrors
	}
	
//	@Test
//	def void testRemoveArrayValue__NotArray(){
//			parse('''
//			rule Rule1 {
//					change record SRF.Burst_parameters {
//						remove_value foo => 1;
//					}
//				}
//		''', URI.createFileURI("/Main.aedit"), rsp.get => [
//			createResource(URI.createFileURI("/Other.avdl")) => [
//				load(new StringInputStream('''
//				@namespace('SRF')
//				protocol SRF{
//					record Burst_parameters{ 
//						array <int> myArray = [1 , 0  ]; 
//						int foo;
//					}
//					
//				}''', "UTF-8"), null)
//			]
//		]).assertMethod(AeditPackage.eINSTANCE.removeArrayValue, ErrorCodes.REMOVE_ARRAY_VALUE, ErrorMessages.NOT_ARRAY)
//	}
	
	@Test
	def void testRemoveArrayValue__DeletedArray(){
			parse('''
			rule Rule1 {
					change record SRF.Burst_parameters {
						remove myArray;
						remove_value myArray => 1;
					}
				}
		''', URI.createFileURI("/Main.aedit"), rsp.get => [
			createResource(URI.createFileURI("/Other.avdl")) => [
				load(new StringInputStream('''
				@namespace('SRF')
				protocol SRF{
					record Burst_parameters{ 
						array <int> myArray = [1 , 0  ]; 
					}
					
				}''', "UTF-8"), null)
			]
		]).assertMethod(AeditPackage.eINSTANCE.removeArrayValue, ErrorCodes.REMOVE_ARRAY_VALUE, ErrorMessages.DELETED_FIELD)
	}
	
	@Test
	def void testRemoveArrayValue__EmptyArray(){
			parse('''
			rule Rule1 {
					change record SRF.Burst_parameters {
						remove_value myArray => 1;
					}
				}
		''', URI.createFileURI("/Main.aedit"), rsp.get => [
			createResource(URI.createFileURI("/Other.avdl")) => [
				load(new StringInputStream('''
				@namespace('SRF')
				protocol SRF{
					record Burst_parameters{ 
						array <int> myArray; 
					}
					
				}''', "UTF-8"), null)
			]
		]).assertMethod(AeditPackage.eINSTANCE.removeArrayValue, ErrorCodes.REMOVE_ARRAY_VALUE, ErrorMessages.EMPTY_ARRAY)
	}
	
//	@Test
//	def void testRemoveArrayValue__ValueNotInArray(){
//			parse('''
//			rule Rule1 {
//					change record SRF.Burst_parameters {
//						remove_value myArray => 5;
//					}
//				}
//		''', URI.createFileURI("/Main.aedit"), rsp.get => [
//			createResource(URI.createFileURI("/Other.avdl")) => [
//				load(new StringInputStream('''
//				@namespace('SRF')
//				protocol SRF{
//					record Burst_parameters{ 
//						array <int> myArray = [1 , 0 ]; 
//					}
//					
//				}''', "UTF-8"), null)
//			]
//		]).assertMethod(AeditPackage.eINSTANCE.removeArrayValue, ErrorCodes.REMOVE_ARRAY_VALUE, ErrorMessages.VALUE_DOES_NOT_EXIST_IN_ARRAY)
//	}
		

	def private assertMethod(Model m, EClass model, String code, String message) {
		m.assertError(
			model,
			code,
			message
		)
	}
}
