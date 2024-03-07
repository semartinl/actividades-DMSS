/*
 * generated by Xtext 2.33.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

}

@parser::members {

 	private MyDslGrammarAccess grammarAccess;

    public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Root";
   	}

   	@Override
   	protected MyDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleRoot
entryRuleRoot returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRootRule()); }
	iv_ruleRoot=ruleRoot
	{ $current=$iv_ruleRoot.current; }
	EOF;

// Rule Root
ruleRoot returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getRootAccess().getRootAction_0(),
					$current);
			}
		)
		otherlv_1='Root'
		{
			newLeafNode(otherlv_1, grammarAccess.getRootAccess().getRootKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getRootAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='conectores'
			{
				newLeafNode(otherlv_3, grammarAccess.getRootAccess().getConectoresKeyword_3_0());
			}
			otherlv_4='{'
			{
				newLeafNode(otherlv_4, grammarAccess.getRootAccess().getLeftCurlyBracketKeyword_3_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRootAccess().getConectoresConectorParserRuleCall_3_2_0());
					}
					lv_conectores_5_0=ruleConector
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRootRule());
						}
						add(
							$current,
							"conectores",
							lv_conectores_5_0,
							"org.xtext.example.mydsl.MyDsl.Conector");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_6=','
				{
					newLeafNode(otherlv_6, grammarAccess.getRootAccess().getCommaKeyword_3_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getRootAccess().getConectoresConectorParserRuleCall_3_3_1_0());
						}
						lv_conectores_7_0=ruleConector
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getRootRule());
							}
							add(
								$current,
								"conectores",
								lv_conectores_7_0,
								"org.xtext.example.mydsl.MyDsl.Conector");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_8='}'
			{
				newLeafNode(otherlv_8, grammarAccess.getRootAccess().getRightCurlyBracketKeyword_3_4());
			}
		)?
		(
			otherlv_9='componentes'
			{
				newLeafNode(otherlv_9, grammarAccess.getRootAccess().getComponentesKeyword_4_0());
			}
			otherlv_10='{'
			{
				newLeafNode(otherlv_10, grammarAccess.getRootAccess().getLeftCurlyBracketKeyword_4_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRootAccess().getComponentesComponenteParserRuleCall_4_2_0());
					}
					lv_componentes_11_0=ruleComponente
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRootRule());
						}
						add(
							$current,
							"componentes",
							lv_componentes_11_0,
							"org.xtext.example.mydsl.MyDsl.Componente");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_12=','
				{
					newLeafNode(otherlv_12, grammarAccess.getRootAccess().getCommaKeyword_4_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getRootAccess().getComponentesComponenteParserRuleCall_4_3_1_0());
						}
						lv_componentes_13_0=ruleComponente
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getRootRule());
							}
							add(
								$current,
								"componentes",
								lv_componentes_13_0,
								"org.xtext.example.mydsl.MyDsl.Componente");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_14='}'
			{
				newLeafNode(otherlv_14, grammarAccess.getRootAccess().getRightCurlyBracketKeyword_4_4());
			}
		)?
		otherlv_15='}'
		{
			newLeafNode(otherlv_15, grammarAccess.getRootAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleConector
entryRuleConector returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConectorRule()); }
	iv_ruleConector=ruleConector
	{ $current=$iv_ruleConector.current; }
	EOF;

// Rule Conector
ruleConector returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Conector'
		{
			newLeafNode(otherlv_0, grammarAccess.getConectorAccess().getConectorKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConectorAccess().getNombreEStringParserRuleCall_1_0());
				}
				lv_nombre_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConectorRule());
					}
					set(
						$current,
						"nombre",
						lv_nombre_1_0,
						"org.xtext.example.mydsl.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getConectorAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='origen'
		{
			newLeafNode(otherlv_3, grammarAccess.getConectorAccess().getOrigenKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConectorRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getConectorAccess().getOrigenComponenteCrossReference_4_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='destino'
		{
			newLeafNode(otherlv_5, grammarAccess.getConectorAccess().getDestinoKeyword_5());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConectorRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getConectorAccess().getDestinoComponenteCrossReference_6_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getConectorAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleComponente
entryRuleComponente returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponenteRule()); }
	iv_ruleComponente=ruleComponente
	{ $current=$iv_ruleComponente.current; }
	EOF;

// Rule Componente
ruleComponente returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getComponenteAccess().getComponenteAction_0(),
					$current);
			}
		)
		otherlv_1='Componente'
		{
			newLeafNode(otherlv_1, grammarAccess.getComponenteAccess().getComponenteKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getComponenteAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_Name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponenteRule());
					}
					set(
						$current,
						"Name",
						lv_Name_2_0,
						"org.xtext.example.mydsl.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
