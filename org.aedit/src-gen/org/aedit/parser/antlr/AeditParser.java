/*
 * generated by Xtext 2.12.0
 */
package org.aedit.parser.antlr;

import com.google.inject.Inject;
import org.aedit.parser.antlr.internal.InternalAeditParser;
import org.aedit.services.AeditGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class AeditParser extends AbstractAntlrParser {

	@Inject
	private AeditGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalAeditParser createParser(XtextTokenStream stream) {
		return new InternalAeditParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public AeditGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AeditGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
