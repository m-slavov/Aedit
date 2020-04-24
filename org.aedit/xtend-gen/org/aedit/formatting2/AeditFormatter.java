/**
 * generated by Xtext 2.12.0
 */
package org.aedit.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import org.aedit.aedit.Model;
import org.aedit.services.AeditGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class AeditFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private AeditGrammarAccess _aeditGrammarAccess;
  
  protected void _format(final Model model, @Extension final IFormattableDocument document) {
  }
  
  public void format(final Object model, final IFormattableDocument document) {
    if (model instanceof XtextResource) {
      _format((XtextResource)model, document);
      return;
    } else if (model instanceof Model) {
      _format((Model)model, document);
      return;
    } else if (model instanceof EObject) {
      _format((EObject)model, document);
      return;
    } else if (model == null) {
      _format((Void)null, document);
      return;
    } else if (model != null) {
      _format(model, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(model, document).toString());
    }
  }
}