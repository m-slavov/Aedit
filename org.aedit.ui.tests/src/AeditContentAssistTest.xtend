import org.aedit.ui.tests.AeditUiInjectorProvider
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.ui.testing.AbstractContentAssistTest
import org.junit.runner.RunWith
import org.junit.Test
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.eclipse.emf.ecore.resource.ResourceSet
import javax.inject.Provider
import com.google.inject.Inject
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.util.StringInputStream
import java.io.InputStream
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.resource.FileExtensionProvider
import org.eclipse.xtext.ui.refactoring.ui.SyncUtil
import avroclipse.AvroIDLStandaloneSetup
import avroclipse.avroIDL.AvroIDLFactory
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl

@RunWith(XtextRunner)
@InjectWith(AeditUiInjectorProvider)
class AeditContentAssistTest extends AbstractContentAssistTest {
	
	
	@Inject extension Provider<XtextResourceSet>


	static String projectFullPath
	
	
	@Test def void testEmptyProgram() {
//		new AvroIDLStandaloneSetup().createInjectorAndDoEMFRegistration
//		
//		val newAvroIDl = AvroIDLFactory.eINSTANCE.createAvroIDLFile
//		newAvroIDl.name = "house"
//		val recordType = AvroIDLFactory.eINSTANCE.createTypeDef
//		recordType.type = AvroIDLFactory.eINSTANCE.createRecordType =>[
//			name = "Garage"
//		]
//		newAvroIDl.elements.add(recordType)
//		
//		var Resource rs = new ResourceSetImpl().createResource(URI.createFileURI("asd"));
//		rs.getContents.add(newAvroIDl);
		
//		get.resources.add(rs)
		newBuilder.append('''
			rule RuleOne { remove record 
		''').assertText("house.Garage")
	}
	
	override getResourceFor(InputStream stream) {
		
	}
}
