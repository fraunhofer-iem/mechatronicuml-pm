/*
 * generated by Xtext
 */
package org.muml.pm.software.oslanguage.xtext.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.muml.pm.software.oslanguage.xtext.services.OperatingSystemLanguageGrammarAccess;

public class OperatingSystemLanguageParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private OperatingSystemLanguageGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.muml.pm.software.oslanguage.xtext.parser.antlr.internal.InternalOperatingSystemLanguageParser createParser(XtextTokenStream stream) {
		return new org.muml.pm.software.oslanguage.xtext.parser.antlr.internal.InternalOperatingSystemLanguageParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "OperatingSystem";
	}
	
	public OperatingSystemLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(OperatingSystemLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
