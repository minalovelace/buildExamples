package org.learning.example.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.learning.example.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'('", "')'", "'='", "'+'", "'interface'", "'class'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "CompilationUnit";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCompilationUnit"
    // InternalMyDsl.g:65:1: entryRuleCompilationUnit returns [EObject current=null] : iv_ruleCompilationUnit= ruleCompilationUnit EOF ;
    public final EObject entryRuleCompilationUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompilationUnit = null;


        try {
            // InternalMyDsl.g:65:56: (iv_ruleCompilationUnit= ruleCompilationUnit EOF )
            // InternalMyDsl.g:66:2: iv_ruleCompilationUnit= ruleCompilationUnit EOF
            {
             newCompositeNode(grammarAccess.getCompilationUnitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompilationUnit=ruleCompilationUnit();

            state._fsp--;

             current =iv_ruleCompilationUnit; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompilationUnit"


    // $ANTLR start "ruleCompilationUnit"
    // InternalMyDsl.g:72:1: ruleCompilationUnit returns [EObject current=null] : ( (lv_type_0_0= ruleTypeDeclaration ) )* ;
    public final EObject ruleCompilationUnit() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( ( (lv_type_0_0= ruleTypeDeclaration ) )* )
            // InternalMyDsl.g:79:2: ( (lv_type_0_0= ruleTypeDeclaration ) )*
            {
            // InternalMyDsl.g:79:2: ( (lv_type_0_0= ruleTypeDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=17 && LA1_0<=18)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:80:3: (lv_type_0_0= ruleTypeDeclaration )
            	    {
            	    // InternalMyDsl.g:80:3: (lv_type_0_0= ruleTypeDeclaration )
            	    // InternalMyDsl.g:81:4: lv_type_0_0= ruleTypeDeclaration
            	    {

            	    				newCompositeNode(grammarAccess.getCompilationUnitAccess().getTypeTypeDeclarationParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_type_0_0=ruleTypeDeclaration();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getCompilationUnitRule());
            	    				}
            	    				add(
            	    					current,
            	    					"type",
            	    					lv_type_0_0,
            	    					"org.learning.example.MyDsl.TypeDeclaration");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompilationUnit"


    // $ANTLR start "entryRuleTypeDeclaration"
    // InternalMyDsl.g:101:1: entryRuleTypeDeclaration returns [EObject current=null] : iv_ruleTypeDeclaration= ruleTypeDeclaration EOF ;
    public final EObject entryRuleTypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDeclaration = null;


        try {
            // InternalMyDsl.g:101:56: (iv_ruleTypeDeclaration= ruleTypeDeclaration EOF )
            // InternalMyDsl.g:102:2: iv_ruleTypeDeclaration= ruleTypeDeclaration EOF
            {
             newCompositeNode(grammarAccess.getTypeDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeDeclaration=ruleTypeDeclaration();

            state._fsp--;

             current =iv_ruleTypeDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeDeclaration"


    // $ANTLR start "ruleTypeDeclaration"
    // InternalMyDsl.g:108:1: ruleTypeDeclaration returns [EObject current=null] : ( ( (lv_kind_0_0= ruleTypeKinds ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleNamedElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleTypeDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_kind_0_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:114:2: ( ( ( (lv_kind_0_0= ruleTypeKinds ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleNamedElement ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:115:2: ( ( (lv_kind_0_0= ruleTypeKinds ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleNamedElement ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:115:2: ( ( (lv_kind_0_0= ruleTypeKinds ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleNamedElement ) )* otherlv_4= '}' )
            // InternalMyDsl.g:116:3: ( (lv_kind_0_0= ruleTypeKinds ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleNamedElement ) )* otherlv_4= '}'
            {
            // InternalMyDsl.g:116:3: ( (lv_kind_0_0= ruleTypeKinds ) )
            // InternalMyDsl.g:117:4: (lv_kind_0_0= ruleTypeKinds )
            {
            // InternalMyDsl.g:117:4: (lv_kind_0_0= ruleTypeKinds )
            // InternalMyDsl.g:118:5: lv_kind_0_0= ruleTypeKinds
            {

            					newCompositeNode(grammarAccess.getTypeDeclarationAccess().getKindTypeKindsEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_kind_0_0=ruleTypeKinds();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeDeclarationRule());
            					}
            					set(
            						current,
            						"kind",
            						lv_kind_0_0,
            						"org.learning.example.MyDsl.TypeKinds");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:135:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:136:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:136:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:137:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTypeDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getTypeDeclarationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:157:3: ( (lv_elements_3_0= ruleNamedElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:158:4: (lv_elements_3_0= ruleNamedElement )
            	    {
            	    // InternalMyDsl.g:158:4: (lv_elements_3_0= ruleNamedElement )
            	    // InternalMyDsl.g:159:5: lv_elements_3_0= ruleNamedElement
            	    {

            	    					newCompositeNode(grammarAccess.getTypeDeclarationAccess().getElementsNamedElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_elements_3_0=ruleNamedElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTypeDeclarationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"org.learning.example.MyDsl.NamedElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTypeDeclarationAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeDeclaration"


    // $ANTLR start "entryRuleNamedElement"
    // InternalMyDsl.g:184:1: entryRuleNamedElement returns [EObject current=null] : iv_ruleNamedElement= ruleNamedElement EOF ;
    public final EObject entryRuleNamedElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedElement = null;


        try {
            // InternalMyDsl.g:184:53: (iv_ruleNamedElement= ruleNamedElement EOF )
            // InternalMyDsl.g:185:2: iv_ruleNamedElement= ruleNamedElement EOF
            {
             newCompositeNode(grammarAccess.getNamedElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamedElement=ruleNamedElement();

            state._fsp--;

             current =iv_ruleNamedElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamedElement"


    // $ANTLR start "ruleNamedElement"
    // InternalMyDsl.g:191:1: ruleNamedElement returns [EObject current=null] : (this_Attribute_0= ruleAttribute | this_Method_1= ruleMethod ) ;
    public final EObject ruleNamedElement() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_0 = null;

        EObject this_Method_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:197:2: ( (this_Attribute_0= ruleAttribute | this_Method_1= ruleMethod ) )
            // InternalMyDsl.g:198:2: (this_Attribute_0= ruleAttribute | this_Method_1= ruleMethod )
            {
            // InternalMyDsl.g:198:2: (this_Attribute_0= ruleAttribute | this_Method_1= ruleMethod )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_ID) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==EOF||LA3_2==RULE_ID||LA3_2==12) ) {
                        alt3=1;
                    }
                    else if ( (LA3_2==13) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:199:3: this_Attribute_0= ruleAttribute
                    {

                    			newCompositeNode(grammarAccess.getNamedElementAccess().getAttributeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Attribute_0=ruleAttribute();

                    state._fsp--;


                    			current = this_Attribute_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:208:3: this_Method_1= ruleMethod
                    {

                    			newCompositeNode(grammarAccess.getNamedElementAccess().getMethodParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Method_1=ruleMethod();

                    state._fsp--;


                    			current = this_Method_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamedElement"


    // $ANTLR start "entryRuleAttribute"
    // InternalMyDsl.g:220:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalMyDsl.g:220:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalMyDsl.g:221:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalMyDsl.g:227:1: ruleAttribute returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:233:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:234:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:234:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:235:3: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalMyDsl.g:235:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyDsl.g:236:4: (otherlv_0= RULE_ID )
            {
            // InternalMyDsl.g:236:4: (otherlv_0= RULE_ID )
            // InternalMyDsl.g:237:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getTypeTypeDeclarationCrossReference_0_0());
            				

            }


            }

            // InternalMyDsl.g:248:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:249:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:249:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:250:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleMethod"
    // InternalMyDsl.g:270:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalMyDsl.g:270:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalMyDsl.g:271:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalMyDsl.g:277:1: ruleMethod returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '=' ruleExpression ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:283:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '=' ruleExpression ) )
            // InternalMyDsl.g:284:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '=' ruleExpression )
            {
            // InternalMyDsl.g:284:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '=' ruleExpression )
            // InternalMyDsl.g:285:3: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '=' ruleExpression
            {
            // InternalMyDsl.g:285:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyDsl.g:286:4: (otherlv_0= RULE_ID )
            {
            // InternalMyDsl.g:286:4: (otherlv_0= RULE_ID )
            // InternalMyDsl.g:287:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_0, grammarAccess.getMethodAccess().getTypeTypeDeclarationCrossReference_0_0());
            				

            }


            }

            // InternalMyDsl.g:298:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:299:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:299:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:300:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getEqualsSignKeyword_4());
            		

            			newCompositeNode(grammarAccess.getMethodAccess().getExpressionParserRuleCall_5());
            		
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:339:1: entryRuleExpression returns [String current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final String entryRuleExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpression = null;


        try {
            // InternalMyDsl.g:339:50: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyDsl.g:340:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMyDsl.g:346:1: ruleExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING kw= '+' this_STRING_2= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token kw=null;
        Token this_STRING_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:352:2: ( (this_STRING_0= RULE_STRING kw= '+' this_STRING_2= RULE_STRING ) )
            // InternalMyDsl.g:353:2: (this_STRING_0= RULE_STRING kw= '+' this_STRING_2= RULE_STRING )
            {
            // InternalMyDsl.g:353:2: (this_STRING_0= RULE_STRING kw= '+' this_STRING_2= RULE_STRING )
            // InternalMyDsl.g:354:3: this_STRING_0= RULE_STRING kw= '+' this_STRING_2= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            			current.merge(this_STRING_0);
            		

            			newLeafNode(this_STRING_0, grammarAccess.getExpressionAccess().getSTRINGTerminalRuleCall_0());
            		
            kw=(Token)match(input,16,FOLLOW_10); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getExpressionAccess().getPlusSignKeyword_1());
            		
            this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			current.merge(this_STRING_2);
            		

            			newLeafNode(this_STRING_2, grammarAccess.getExpressionAccess().getSTRINGTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "ruleTypeKinds"
    // InternalMyDsl.g:377:1: ruleTypeKinds returns [Enumerator current=null] : ( (enumLiteral_0= 'interface' ) | (enumLiteral_1= 'class' ) ) ;
    public final Enumerator ruleTypeKinds() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:383:2: ( ( (enumLiteral_0= 'interface' ) | (enumLiteral_1= 'class' ) ) )
            // InternalMyDsl.g:384:2: ( (enumLiteral_0= 'interface' ) | (enumLiteral_1= 'class' ) )
            {
            // InternalMyDsl.g:384:2: ( (enumLiteral_0= 'interface' ) | (enumLiteral_1= 'class' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            else if ( (LA4_0==18) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:385:3: (enumLiteral_0= 'interface' )
                    {
                    // InternalMyDsl.g:385:3: (enumLiteral_0= 'interface' )
                    // InternalMyDsl.g:386:4: enumLiteral_0= 'interface'
                    {
                    enumLiteral_0=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getTypeKindsAccess().getINTERFACEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeKindsAccess().getINTERFACEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:393:3: (enumLiteral_1= 'class' )
                    {
                    // InternalMyDsl.g:393:3: (enumLiteral_1= 'class' )
                    // InternalMyDsl.g:394:4: enumLiteral_1= 'class'
                    {
                    enumLiteral_1=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getTypeKindsAccess().getCLASSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeKindsAccess().getCLASSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeKinds"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});

}