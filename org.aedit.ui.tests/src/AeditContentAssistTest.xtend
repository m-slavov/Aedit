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

@RunWith(XtextRunner)
@InjectWith(AeditUiInjectorProvider)
class AeditContentAssistTest extends AbstractContentAssistTest {
	
	@Inject Provider<ResourceSet> rsp;
	
	
	@Test def void testEmptyProgram() {
		
	}
}
