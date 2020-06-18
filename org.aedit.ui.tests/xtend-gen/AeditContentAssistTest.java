import com.google.inject.Inject;
import java.io.InputStream;
import javax.inject.Provider;
import org.aedit.ui.tests.AeditUiInjectorProvider;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.ui.testing.AbstractContentAssistTest;
import org.eclipse.xtext.ui.testing.ContentAssistProcessorTestBuilder;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(AeditUiInjectorProvider.class)
@SuppressWarnings("all")
public class AeditContentAssistTest extends AbstractContentAssistTest {
  @Inject
  @Extension
  private Provider<XtextResourceSet> _provider;
  
  private static String projectFullPath;
  
  @Test
  public void testEmptyProgram() {
    try {
      ContentAssistProcessorTestBuilder _newBuilder = this.newBuilder();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("rule RuleOne { remove record ");
      _builder.newLine();
      _newBuilder.append(_builder.toString()).assertText("house.Garage");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
  public XtextResource getResourceFor(final InputStream stream) {
    return null;
  }
}
