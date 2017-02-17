package org.learning.example.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.learning.example.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'interface'", "'class'", "'{'", "'}'", "'('", "')'", "'='", "'+'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleCompilationUnit"
    // InternalMyDsl.g:53:1: entryRuleCompilationUnit : ruleCompilationUnit EOF ;
    public final void entryRuleCompilationUnit() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleCompilationUnit EOF )
            // InternalMyDsl.g:55:1: ruleCompilationUnit EOF
            {
             before(grammarAccess.getCompilationUnitRule()); 
            pushFollow(FOLLOW_1);
            ruleCompilationUnit();

            state._fsp--;

             after(grammarAccess.getCompilationUnitRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompilationUnit"


    // $ANTLR start "ruleCompilationUnit"
    // InternalMyDsl.g:62:1: ruleCompilationUnit : ( ( rule__CompilationUnit__TypeAssignment )* ) ;
    public final void ruleCompilationUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__CompilationUnit__TypeAssignment )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__CompilationUnit__TypeAssignment )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__CompilationUnit__TypeAssignment )* )
            // InternalMyDsl.g:68:3: ( rule__CompilationUnit__TypeAssignment )*
            {
             before(grammarAccess.getCompilationUnitAccess().getTypeAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__CompilationUnit__TypeAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__CompilationUnit__TypeAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__CompilationUnit__TypeAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getCompilationUnitAccess().getTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompilationUnit"


    // $ANTLR start "entryRuleTypeDeclaration"
    // InternalMyDsl.g:78:1: entryRuleTypeDeclaration : ruleTypeDeclaration EOF ;
    public final void entryRuleTypeDeclaration() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleTypeDeclaration EOF )
            // InternalMyDsl.g:80:1: ruleTypeDeclaration EOF
            {
             before(grammarAccess.getTypeDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeDeclaration();

            state._fsp--;

             after(grammarAccess.getTypeDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeDeclaration"


    // $ANTLR start "ruleTypeDeclaration"
    // InternalMyDsl.g:87:1: ruleTypeDeclaration : ( ( rule__TypeDeclaration__Group__0 ) ) ;
    public final void ruleTypeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__TypeDeclaration__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__TypeDeclaration__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__TypeDeclaration__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__TypeDeclaration__Group__0 )
            {
             before(grammarAccess.getTypeDeclarationAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__TypeDeclaration__Group__0 )
            // InternalMyDsl.g:94:4: rule__TypeDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeDeclaration"


    // $ANTLR start "entryRuleNamedElement"
    // InternalMyDsl.g:103:1: entryRuleNamedElement : ruleNamedElement EOF ;
    public final void entryRuleNamedElement() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleNamedElement EOF )
            // InternalMyDsl.g:105:1: ruleNamedElement EOF
            {
             before(grammarAccess.getNamedElementRule()); 
            pushFollow(FOLLOW_1);
            ruleNamedElement();

            state._fsp--;

             after(grammarAccess.getNamedElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNamedElement"


    // $ANTLR start "ruleNamedElement"
    // InternalMyDsl.g:112:1: ruleNamedElement : ( ( rule__NamedElement__Alternatives ) ) ;
    public final void ruleNamedElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__NamedElement__Alternatives ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__NamedElement__Alternatives ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__NamedElement__Alternatives ) )
            // InternalMyDsl.g:118:3: ( rule__NamedElement__Alternatives )
            {
             before(grammarAccess.getNamedElementAccess().getAlternatives()); 
            // InternalMyDsl.g:119:3: ( rule__NamedElement__Alternatives )
            // InternalMyDsl.g:119:4: rule__NamedElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NamedElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNamedElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamedElement"


    // $ANTLR start "entryRuleAttribute"
    // InternalMyDsl.g:128:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleAttribute EOF )
            // InternalMyDsl.g:130:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalMyDsl.g:137:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Attribute__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Attribute__Group__0 )
            // InternalMyDsl.g:144:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleMethod"
    // InternalMyDsl.g:153:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleMethod EOF )
            // InternalMyDsl.g:155:1: ruleMethod EOF
            {
             before(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMethodRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalMyDsl.g:162:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Method__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Method__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Method__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Method__Group__0 )
            // InternalMyDsl.g:169:4: rule__Method__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:178:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleExpression EOF )
            // InternalMyDsl.g:180:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMyDsl.g:187:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Expression__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Expression__Group__0 )
            // InternalMyDsl.g:194:4: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "ruleTypeKinds"
    // InternalMyDsl.g:203:1: ruleTypeKinds : ( ( rule__TypeKinds__Alternatives ) ) ;
    public final void ruleTypeKinds() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:207:1: ( ( ( rule__TypeKinds__Alternatives ) ) )
            // InternalMyDsl.g:208:2: ( ( rule__TypeKinds__Alternatives ) )
            {
            // InternalMyDsl.g:208:2: ( ( rule__TypeKinds__Alternatives ) )
            // InternalMyDsl.g:209:3: ( rule__TypeKinds__Alternatives )
            {
             before(grammarAccess.getTypeKindsAccess().getAlternatives()); 
            // InternalMyDsl.g:210:3: ( rule__TypeKinds__Alternatives )
            // InternalMyDsl.g:210:4: rule__TypeKinds__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TypeKinds__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeKindsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeKinds"


    // $ANTLR start "rule__NamedElement__Alternatives"
    // InternalMyDsl.g:218:1: rule__NamedElement__Alternatives : ( ( ruleAttribute ) | ( ruleMethod ) );
    public final void rule__NamedElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:222:1: ( ( ruleAttribute ) | ( ruleMethod ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_ID) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==EOF||LA2_2==RULE_ID||LA2_2==14) ) {
                        alt2=1;
                    }
                    else if ( (LA2_2==15) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:223:2: ( ruleAttribute )
                    {
                    // InternalMyDsl.g:223:2: ( ruleAttribute )
                    // InternalMyDsl.g:224:3: ruleAttribute
                    {
                     before(grammarAccess.getNamedElementAccess().getAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAttribute();

                    state._fsp--;

                     after(grammarAccess.getNamedElementAccess().getAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:229:2: ( ruleMethod )
                    {
                    // InternalMyDsl.g:229:2: ( ruleMethod )
                    // InternalMyDsl.g:230:3: ruleMethod
                    {
                     before(grammarAccess.getNamedElementAccess().getMethodParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMethod();

                    state._fsp--;

                     after(grammarAccess.getNamedElementAccess().getMethodParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedElement__Alternatives"


    // $ANTLR start "rule__TypeKinds__Alternatives"
    // InternalMyDsl.g:239:1: rule__TypeKinds__Alternatives : ( ( ( 'interface' ) ) | ( ( 'class' ) ) );
    public final void rule__TypeKinds__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:243:1: ( ( ( 'interface' ) ) | ( ( 'class' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:244:2: ( ( 'interface' ) )
                    {
                    // InternalMyDsl.g:244:2: ( ( 'interface' ) )
                    // InternalMyDsl.g:245:3: ( 'interface' )
                    {
                     before(grammarAccess.getTypeKindsAccess().getINTERFACEEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:246:3: ( 'interface' )
                    // InternalMyDsl.g:246:4: 'interface'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeKindsAccess().getINTERFACEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:250:2: ( ( 'class' ) )
                    {
                    // InternalMyDsl.g:250:2: ( ( 'class' ) )
                    // InternalMyDsl.g:251:3: ( 'class' )
                    {
                     before(grammarAccess.getTypeKindsAccess().getCLASSEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:252:3: ( 'class' )
                    // InternalMyDsl.g:252:4: 'class'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeKindsAccess().getCLASSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeKinds__Alternatives"


    // $ANTLR start "rule__TypeDeclaration__Group__0"
    // InternalMyDsl.g:260:1: rule__TypeDeclaration__Group__0 : rule__TypeDeclaration__Group__0__Impl rule__TypeDeclaration__Group__1 ;
    public final void rule__TypeDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:264:1: ( rule__TypeDeclaration__Group__0__Impl rule__TypeDeclaration__Group__1 )
            // InternalMyDsl.g:265:2: rule__TypeDeclaration__Group__0__Impl rule__TypeDeclaration__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TypeDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__Group__0"


    // $ANTLR start "rule__TypeDeclaration__Group__0__Impl"
    // InternalMyDsl.g:272:1: rule__TypeDeclaration__Group__0__Impl : ( ( rule__TypeDeclaration__KindAssignment_0 ) ) ;
    public final void rule__TypeDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:276:1: ( ( ( rule__TypeDeclaration__KindAssignment_0 ) ) )
            // InternalMyDsl.g:277:1: ( ( rule__TypeDeclaration__KindAssignment_0 ) )
            {
            // InternalMyDsl.g:277:1: ( ( rule__TypeDeclaration__KindAssignment_0 ) )
            // InternalMyDsl.g:278:2: ( rule__TypeDeclaration__KindAssignment_0 )
            {
             before(grammarAccess.getTypeDeclarationAccess().getKindAssignment_0()); 
            // InternalMyDsl.g:279:2: ( rule__TypeDeclaration__KindAssignment_0 )
            // InternalMyDsl.g:279:3: rule__TypeDeclaration__KindAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TypeDeclaration__KindAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeDeclarationAccess().getKindAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__Group__0__Impl"


    // $ANTLR start "rule__TypeDeclaration__Group__1"
    // InternalMyDsl.g:287:1: rule__TypeDeclaration__Group__1 : rule__TypeDeclaration__Group__1__Impl rule__TypeDeclaration__Group__2 ;
    public final void rule__TypeDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:1: ( rule__TypeDeclaration__Group__1__Impl rule__TypeDeclaration__Group__2 )
            // InternalMyDsl.g:292:2: rule__TypeDeclaration__Group__1__Impl rule__TypeDeclaration__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__TypeDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__Group__1"


    // $ANTLR start "rule__TypeDeclaration__Group__1__Impl"
    // InternalMyDsl.g:299:1: rule__TypeDeclaration__Group__1__Impl : ( ( rule__TypeDeclaration__NameAssignment_1 ) ) ;
    public final void rule__TypeDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:303:1: ( ( ( rule__TypeDeclaration__NameAssignment_1 ) ) )
            // InternalMyDsl.g:304:1: ( ( rule__TypeDeclaration__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:304:1: ( ( rule__TypeDeclaration__NameAssignment_1 ) )
            // InternalMyDsl.g:305:2: ( rule__TypeDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getTypeDeclarationAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:306:2: ( rule__TypeDeclaration__NameAssignment_1 )
            // InternalMyDsl.g:306:3: rule__TypeDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__Group__1__Impl"


    // $ANTLR start "rule__TypeDeclaration__Group__2"
    // InternalMyDsl.g:314:1: rule__TypeDeclaration__Group__2 : rule__TypeDeclaration__Group__2__Impl rule__TypeDeclaration__Group__3 ;
    public final void rule__TypeDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:318:1: ( rule__TypeDeclaration__Group__2__Impl rule__TypeDeclaration__Group__3 )
            // InternalMyDsl.g:319:2: rule__TypeDeclaration__Group__2__Impl rule__TypeDeclaration__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__TypeDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__Group__2"


    // $ANTLR start "rule__TypeDeclaration__Group__2__Impl"
    // InternalMyDsl.g:326:1: rule__TypeDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__TypeDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:330:1: ( ( '{' ) )
            // InternalMyDsl.g:331:1: ( '{' )
            {
            // InternalMyDsl.g:331:1: ( '{' )
            // InternalMyDsl.g:332:2: '{'
            {
             before(grammarAccess.getTypeDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTypeDeclarationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__Group__2__Impl"


    // $ANTLR start "rule__TypeDeclaration__Group__3"
    // InternalMyDsl.g:341:1: rule__TypeDeclaration__Group__3 : rule__TypeDeclaration__Group__3__Impl rule__TypeDeclaration__Group__4 ;
    public final void rule__TypeDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:345:1: ( rule__TypeDeclaration__Group__3__Impl rule__TypeDeclaration__Group__4 )
            // InternalMyDsl.g:346:2: rule__TypeDeclaration__Group__3__Impl rule__TypeDeclaration__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__TypeDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__Group__3"


    // $ANTLR start "rule__TypeDeclaration__Group__3__Impl"
    // InternalMyDsl.g:353:1: rule__TypeDeclaration__Group__3__Impl : ( ( rule__TypeDeclaration__ElementsAssignment_3 )* ) ;
    public final void rule__TypeDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:357:1: ( ( ( rule__TypeDeclaration__ElementsAssignment_3 )* ) )
            // InternalMyDsl.g:358:1: ( ( rule__TypeDeclaration__ElementsAssignment_3 )* )
            {
            // InternalMyDsl.g:358:1: ( ( rule__TypeDeclaration__ElementsAssignment_3 )* )
            // InternalMyDsl.g:359:2: ( rule__TypeDeclaration__ElementsAssignment_3 )*
            {
             before(grammarAccess.getTypeDeclarationAccess().getElementsAssignment_3()); 
            // InternalMyDsl.g:360:2: ( rule__TypeDeclaration__ElementsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:360:3: rule__TypeDeclaration__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__TypeDeclaration__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getTypeDeclarationAccess().getElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__Group__3__Impl"


    // $ANTLR start "rule__TypeDeclaration__Group__4"
    // InternalMyDsl.g:368:1: rule__TypeDeclaration__Group__4 : rule__TypeDeclaration__Group__4__Impl ;
    public final void rule__TypeDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:372:1: ( rule__TypeDeclaration__Group__4__Impl )
            // InternalMyDsl.g:373:2: rule__TypeDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeDeclaration__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__Group__4"


    // $ANTLR start "rule__TypeDeclaration__Group__4__Impl"
    // InternalMyDsl.g:379:1: rule__TypeDeclaration__Group__4__Impl : ( '}' ) ;
    public final void rule__TypeDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:383:1: ( ( '}' ) )
            // InternalMyDsl.g:384:1: ( '}' )
            {
            // InternalMyDsl.g:384:1: ( '}' )
            // InternalMyDsl.g:385:2: '}'
            {
             before(grammarAccess.getTypeDeclarationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTypeDeclarationAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalMyDsl.g:395:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:399:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalMyDsl.g:400:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalMyDsl.g:407:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__TypeAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:411:1: ( ( ( rule__Attribute__TypeAssignment_0 ) ) )
            // InternalMyDsl.g:412:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            {
            // InternalMyDsl.g:412:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            // InternalMyDsl.g:413:2: ( rule__Attribute__TypeAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_0()); 
            // InternalMyDsl.g:414:2: ( rule__Attribute__TypeAssignment_0 )
            // InternalMyDsl.g:414:3: rule__Attribute__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalMyDsl.g:422:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:426:1: ( rule__Attribute__Group__1__Impl )
            // InternalMyDsl.g:427:2: rule__Attribute__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalMyDsl.g:433:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:437:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalMyDsl.g:438:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:438:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalMyDsl.g:439:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:440:2: ( rule__Attribute__NameAssignment_1 )
            // InternalMyDsl.g:440:3: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Method__Group__0"
    // InternalMyDsl.g:449:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:453:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalMyDsl.g:454:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Method__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0"


    // $ANTLR start "rule__Method__Group__0__Impl"
    // InternalMyDsl.g:461:1: rule__Method__Group__0__Impl : ( ( rule__Method__TypeAssignment_0 ) ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:465:1: ( ( ( rule__Method__TypeAssignment_0 ) ) )
            // InternalMyDsl.g:466:1: ( ( rule__Method__TypeAssignment_0 ) )
            {
            // InternalMyDsl.g:466:1: ( ( rule__Method__TypeAssignment_0 ) )
            // InternalMyDsl.g:467:2: ( rule__Method__TypeAssignment_0 )
            {
             before(grammarAccess.getMethodAccess().getTypeAssignment_0()); 
            // InternalMyDsl.g:468:2: ( rule__Method__TypeAssignment_0 )
            // InternalMyDsl.g:468:3: rule__Method__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Method__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0__Impl"


    // $ANTLR start "rule__Method__Group__1"
    // InternalMyDsl.g:476:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:480:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalMyDsl.g:481:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Method__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1"


    // $ANTLR start "rule__Method__Group__1__Impl"
    // InternalMyDsl.g:488:1: rule__Method__Group__1__Impl : ( ( rule__Method__NameAssignment_1 ) ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:492:1: ( ( ( rule__Method__NameAssignment_1 ) ) )
            // InternalMyDsl.g:493:1: ( ( rule__Method__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:493:1: ( ( rule__Method__NameAssignment_1 ) )
            // InternalMyDsl.g:494:2: ( rule__Method__NameAssignment_1 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:495:2: ( rule__Method__NameAssignment_1 )
            // InternalMyDsl.g:495:3: rule__Method__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Method__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1__Impl"


    // $ANTLR start "rule__Method__Group__2"
    // InternalMyDsl.g:503:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:507:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalMyDsl.g:508:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Method__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__2"


    // $ANTLR start "rule__Method__Group__2__Impl"
    // InternalMyDsl.g:515:1: rule__Method__Group__2__Impl : ( '(' ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:519:1: ( ( '(' ) )
            // InternalMyDsl.g:520:1: ( '(' )
            {
            // InternalMyDsl.g:520:1: ( '(' )
            // InternalMyDsl.g:521:2: '('
            {
             before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__2__Impl"


    // $ANTLR start "rule__Method__Group__3"
    // InternalMyDsl.g:530:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:534:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // InternalMyDsl.g:535:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Method__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__3"


    // $ANTLR start "rule__Method__Group__3__Impl"
    // InternalMyDsl.g:542:1: rule__Method__Group__3__Impl : ( ')' ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:546:1: ( ( ')' ) )
            // InternalMyDsl.g:547:1: ( ')' )
            {
            // InternalMyDsl.g:547:1: ( ')' )
            // InternalMyDsl.g:548:2: ')'
            {
             before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__3__Impl"


    // $ANTLR start "rule__Method__Group__4"
    // InternalMyDsl.g:557:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:561:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // InternalMyDsl.g:562:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Method__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__4"


    // $ANTLR start "rule__Method__Group__4__Impl"
    // InternalMyDsl.g:569:1: rule__Method__Group__4__Impl : ( '=' ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:573:1: ( ( '=' ) )
            // InternalMyDsl.g:574:1: ( '=' )
            {
            // InternalMyDsl.g:574:1: ( '=' )
            // InternalMyDsl.g:575:2: '='
            {
             before(grammarAccess.getMethodAccess().getEqualsSignKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__4__Impl"


    // $ANTLR start "rule__Method__Group__5"
    // InternalMyDsl.g:584:1: rule__Method__Group__5 : rule__Method__Group__5__Impl ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:588:1: ( rule__Method__Group__5__Impl )
            // InternalMyDsl.g:589:2: rule__Method__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__5"


    // $ANTLR start "rule__Method__Group__5__Impl"
    // InternalMyDsl.g:595:1: rule__Method__Group__5__Impl : ( ruleExpression ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:599:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:600:1: ( ruleExpression )
            {
            // InternalMyDsl.g:600:1: ( ruleExpression )
            // InternalMyDsl.g:601:2: ruleExpression
            {
             before(grammarAccess.getMethodAccess().getExpressionParserRuleCall_5()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getExpressionParserRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__5__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // InternalMyDsl.g:611:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:615:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalMyDsl.g:616:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // InternalMyDsl.g:623:1: rule__Expression__Group__0__Impl : ( RULE_STRING ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:627:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:628:1: ( RULE_STRING )
            {
            // InternalMyDsl.g:628:1: ( RULE_STRING )
            // InternalMyDsl.g:629:2: RULE_STRING
            {
             before(grammarAccess.getExpressionAccess().getSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // InternalMyDsl.g:638:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl rule__Expression__Group__2 ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:642:1: ( rule__Expression__Group__1__Impl rule__Expression__Group__2 )
            // InternalMyDsl.g:643:2: rule__Expression__Group__1__Impl rule__Expression__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Expression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // InternalMyDsl.g:650:1: rule__Expression__Group__1__Impl : ( '+' ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:654:1: ( ( '+' ) )
            // InternalMyDsl.g:655:1: ( '+' )
            {
            // InternalMyDsl.g:655:1: ( '+' )
            // InternalMyDsl.g:656:2: '+'
            {
             before(grammarAccess.getExpressionAccess().getPlusSignKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getPlusSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group__2"
    // InternalMyDsl.g:665:1: rule__Expression__Group__2 : rule__Expression__Group__2__Impl ;
    public final void rule__Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:669:1: ( rule__Expression__Group__2__Impl )
            // InternalMyDsl.g:670:2: rule__Expression__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__2"


    // $ANTLR start "rule__Expression__Group__2__Impl"
    // InternalMyDsl.g:676:1: rule__Expression__Group__2__Impl : ( RULE_STRING ) ;
    public final void rule__Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:680:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:681:1: ( RULE_STRING )
            {
            // InternalMyDsl.g:681:1: ( RULE_STRING )
            // InternalMyDsl.g:682:2: RULE_STRING
            {
             before(grammarAccess.getExpressionAccess().getSTRINGTerminalRuleCall_2()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getSTRINGTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__2__Impl"


    // $ANTLR start "rule__CompilationUnit__TypeAssignment"
    // InternalMyDsl.g:692:1: rule__CompilationUnit__TypeAssignment : ( ruleTypeDeclaration ) ;
    public final void rule__CompilationUnit__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:696:1: ( ( ruleTypeDeclaration ) )
            // InternalMyDsl.g:697:2: ( ruleTypeDeclaration )
            {
            // InternalMyDsl.g:697:2: ( ruleTypeDeclaration )
            // InternalMyDsl.g:698:3: ruleTypeDeclaration
            {
             before(grammarAccess.getCompilationUnitAccess().getTypeTypeDeclarationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeDeclaration();

            state._fsp--;

             after(grammarAccess.getCompilationUnitAccess().getTypeTypeDeclarationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompilationUnit__TypeAssignment"


    // $ANTLR start "rule__TypeDeclaration__KindAssignment_0"
    // InternalMyDsl.g:707:1: rule__TypeDeclaration__KindAssignment_0 : ( ruleTypeKinds ) ;
    public final void rule__TypeDeclaration__KindAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:711:1: ( ( ruleTypeKinds ) )
            // InternalMyDsl.g:712:2: ( ruleTypeKinds )
            {
            // InternalMyDsl.g:712:2: ( ruleTypeKinds )
            // InternalMyDsl.g:713:3: ruleTypeKinds
            {
             before(grammarAccess.getTypeDeclarationAccess().getKindTypeKindsEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeKinds();

            state._fsp--;

             after(grammarAccess.getTypeDeclarationAccess().getKindTypeKindsEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__KindAssignment_0"


    // $ANTLR start "rule__TypeDeclaration__NameAssignment_1"
    // InternalMyDsl.g:722:1: rule__TypeDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TypeDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:726:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:727:2: ( RULE_ID )
            {
            // InternalMyDsl.g:727:2: ( RULE_ID )
            // InternalMyDsl.g:728:3: RULE_ID
            {
             before(grammarAccess.getTypeDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__NameAssignment_1"


    // $ANTLR start "rule__TypeDeclaration__ElementsAssignment_3"
    // InternalMyDsl.g:737:1: rule__TypeDeclaration__ElementsAssignment_3 : ( ruleNamedElement ) ;
    public final void rule__TypeDeclaration__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:741:1: ( ( ruleNamedElement ) )
            // InternalMyDsl.g:742:2: ( ruleNamedElement )
            {
            // InternalMyDsl.g:742:2: ( ruleNamedElement )
            // InternalMyDsl.g:743:3: ruleNamedElement
            {
             before(grammarAccess.getTypeDeclarationAccess().getElementsNamedElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNamedElement();

            state._fsp--;

             after(grammarAccess.getTypeDeclarationAccess().getElementsNamedElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__ElementsAssignment_3"


    // $ANTLR start "rule__Attribute__TypeAssignment_0"
    // InternalMyDsl.g:752:1: rule__Attribute__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Attribute__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:756:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:757:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:757:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:758:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeDeclarationCrossReference_0_0()); 
            // InternalMyDsl.g:759:3: ( RULE_ID )
            // InternalMyDsl.g:760:4: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeDeclarationIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getTypeTypeDeclarationIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().getTypeTypeDeclarationCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_0"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalMyDsl.g:771:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:775:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:776:2: ( RULE_ID )
            {
            // InternalMyDsl.g:776:2: ( RULE_ID )
            // InternalMyDsl.g:777:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Method__TypeAssignment_0"
    // InternalMyDsl.g:786:1: rule__Method__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Method__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:790:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:791:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:791:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:792:3: ( RULE_ID )
            {
             before(grammarAccess.getMethodAccess().getTypeTypeDeclarationCrossReference_0_0()); 
            // InternalMyDsl.g:793:3: ( RULE_ID )
            // InternalMyDsl.g:794:4: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getTypeTypeDeclarationIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getTypeTypeDeclarationIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getMethodAccess().getTypeTypeDeclarationCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__TypeAssignment_0"


    // $ANTLR start "rule__Method__NameAssignment_1"
    // InternalMyDsl.g:805:1: rule__Method__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:809:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:810:2: ( RULE_ID )
            {
            // InternalMyDsl.g:810:2: ( RULE_ID )
            // InternalMyDsl.g:811:3: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});

}