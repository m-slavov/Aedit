import com.google.inject.Inject;
import javax.inject.Provider;
import org.aedit.ui.tests.AeditUiInjectorProvider;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.ui.testing.AbstractContentAssistTest;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(AeditUiInjectorProvider.class)
@SuppressWarnings("all")
public class AeditContentAssistTest extends AbstractContentAssistTest {
  @Inject
  private Provider<ResourceSet> rsp;
  
  @Test
  public void testEmptyProgram() {
  }
}
