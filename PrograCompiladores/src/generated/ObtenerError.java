package generated;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNState;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.RuleTransition;
import org.antlr.v4.runtime.misc.IntervalSet;
import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayList;

/**
 * Created by Bryan on 28/3/2017.
 */
public class ObtenerError extends DefaultErrorStrategy{
    protected boolean errorRecoveryMode = false;
    protected int lastErrorIndex = -1;
    protected IntervalSet lastErrorStates;
    private static ArrayList<String> listaConErrores = new ArrayList<String>();;
    public ObtenerError() {
    }

    public ArrayList<String> obtenerListaErrores() {
        return listaConErrores;
    }

    public void limpiarListaErrores() {
        listaConErrores.clear();
    }

    public void reset(Parser recognizer) {
        this.endErrorCondition(recognizer);
    }

    protected void beginErrorCondition(Parser recognizer) {
        this.errorRecoveryMode = true;
    }

    public boolean inErrorRecoveryMode(Parser recognizer) {
        return this.errorRecoveryMode;
    }

    protected void endErrorCondition(Parser recognizer) {
        this.errorRecoveryMode = false;
        this.lastErrorStates = null;
        this.lastErrorIndex = -1;
    }

    public void reportMatch(Parser recognizer) {
        this.endErrorCondition(recognizer);
    }

    public void reportError(Parser recognizer, RecognitionException e) {
        if(!this.inErrorRecoveryMode(recognizer)) {
            this.beginErrorCondition(recognizer);
            if(e instanceof NoViableAltException) {
                this.reportNoViableAlternative(recognizer, (NoViableAltException)e);
            } else if(e instanceof InputMismatchException) {
                this.reportInputMismatch(recognizer, (InputMismatchException)e);
            } else if(e instanceof FailedPredicateException) {
                this.reportFailedPredicate(recognizer, (FailedPredicateException)e);
            } else {
                System.err.println("Tipo de error de reconocimiento desconocido: " + e.getClass().getName());
                recognizer.notifyErrorListeners(e.getOffendingToken(), e.getMessage(), e);
            }
        }
    }

    public void recover(Parser recognizer, RecognitionException e) {
        if(this.lastErrorIndex == recognizer.getInputStream().index() && this.lastErrorStates != null && this.lastErrorStates.contains(recognizer.getState())) {
            recognizer.consume();
        }

        this.lastErrorIndex = recognizer.getInputStream().index();
        if(this.lastErrorStates == null) {
            this.lastErrorStates = new IntervalSet(new int[0]);
        }

        this.lastErrorStates.add(recognizer.getState());
        IntervalSet followSet = this.getErrorRecoverySet(recognizer);
        this.consumeUntil(recognizer, followSet);
    }

    public void sync(Parser recognizer) throws RecognitionException {
        ATNState s = (ATNState)((ParserATNSimulator)recognizer.getInterpreter()).atn.states.get(recognizer.getState());
        if(!this.inErrorRecoveryMode(recognizer)) {
            TokenStream tokens = recognizer.getInputStream();
            int la = tokens.LA(1);
            if(!recognizer.getATN().nextTokens(s).contains(la) && la != -1) {
                if(!recognizer.isExpectedToken(la)) {
                    switch(s.getStateType()) {
                        case 3:
                        case 4:
                        case 5:
                        case 10:
                            if(this.singleTokenDeletion(recognizer) != null) {
                                return;
                            }

                            throw new InputMismatchException(recognizer);
                        case 9:
                        case 11:
                            this.reportUnwantedToken(recognizer);
                            IntervalSet expecting = recognizer.getExpectedTokens();
                            IntervalSet whatFollowsLoopIterationOrRule = expecting.or(this.getErrorRecoverySet(recognizer));
                            this.consumeUntil(recognizer, whatFollowsLoopIterationOrRule);
                        case 6:
                        case 7:
                        case 8:
                        default:
                    }
                }
            }
        }
    }

    protected void reportNoViableAlternative(Parser recognizer, NoViableAltException e) {
        TokenStream tokens = recognizer.getInputStream();
        String input;
        if(tokens != null) {
            if(e.getStartToken().getType() == -1) {
                input = "<EOF>";
            } else {
                input = tokens.getText(e.getStartToken(), e.getOffendingToken());
            }
        } else {
            input = "<Entrada desconocida>";
        }

        String msg = "No hay alternativa viable en la entrada " + this.escapeWSAndQuote(input);
        recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);
        String posicion = e.getOffendingToken().toString();
        listaConErrores.add(posicion + ".    " + msg);
    }

    protected void reportInputMismatch(Parser recognizer, InputMismatchException e) {
        String msg = "Entrada desajustada: " + this.getTokenErrorDisplay(e.getOffendingToken()) + ", se esperaba: " + e.getExpectedTokens().toString(recognizer.getVocabulary());
        recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);
        String posicion = e.getOffendingToken().toString();
        listaConErrores.add(posicion + ".    " + msg);
    }


    protected void reportUnwantedToken(Parser recognizer) {
        if(!this.inErrorRecoveryMode(recognizer)) {
            this.beginErrorCondition(recognizer);
            Token t = recognizer.getCurrentToken();
            String tokenName = this.getTokenErrorDisplay(t);
            IntervalSet expecting = this.getExpectedTokens(recognizer);
            String msg = "Entrada ajena: " + tokenName + ", se esperaba: " + expecting.toString(recognizer.getVocabulary());
            recognizer.notifyErrorListeners(t, msg, (RecognitionException)null);
            String posicion = t.toString();
            System.out.println(t);
            listaConErrores.add(posicion + ".    " + msg);
        }
    }

    protected void reportMissingToken(Parser recognizer) {
        if(!this.inErrorRecoveryMode(recognizer)) {
            this.beginErrorCondition(recognizer);
            Token t = recognizer.getCurrentToken();
            IntervalSet expecting = this.getExpectedTokens(recognizer);
            String msg = "falta: " + expecting.toString(recognizer.getVocabulary()) + ", a: " + this.getTokenErrorDisplay(t);
            recognizer.notifyErrorListeners(t, msg, (RecognitionException)null);
            String posicion = t.toString();
            listaConErrores.add(posicion + ".    " + msg);
        }
    }

    public Token recoverInline(Parser recognizer) throws RecognitionException {
        Token matchedSymbol = this.singleTokenDeletion(recognizer);
        if(matchedSymbol != null) {
            recognizer.consume();
            return matchedSymbol;
        } else if(this.singleTokenInsertion(recognizer)) {
            return this.getMissingSymbol(recognizer);
        } else {
            throw new InputMismatchException(recognizer);
        }
    }


    protected Token singleTokenDeletion(Parser recognizer) {
        int nextTokenType = recognizer.getInputStream().LA(2);
        IntervalSet expecting = this.getExpectedTokens(recognizer);
        if(expecting.contains(nextTokenType)) {
            this.reportUnwantedToken(recognizer);
            recognizer.consume();
            Token matchedSymbol = recognizer.getCurrentToken();
            this.reportMatch(recognizer);
            return matchedSymbol;
        } else {
            return null;
        }
    }

    protected Token getMissingSymbol(Parser recognizer) {
        Token currentSymbol = recognizer.getCurrentToken();
        IntervalSet expecting = this.getExpectedTokens(recognizer);
        int expectedTokenType = expecting.getMinElement();
        String tokenText;

        if(expectedTokenType == -1) {
            tokenText = "<falta EOF>";
        } else {
            tokenText = "<falta: " + recognizer.getVocabulary().getDisplayName(expectedTokenType) + ">";
        }

        Token current = currentSymbol;
        Token lookback = recognizer.getInputStream().LT(-1);
        if(currentSymbol.getType() == -1 && lookback != null) {
            current = lookback;
        }

        return recognizer.getTokenFactory().create(new Pair(current.getTokenSource(), current.getTokenSource().getInputStream()), expectedTokenType, tokenText, 0, -1, -1, current.getLine(), current.getCharPositionInLine());
    }

    protected IntervalSet getExpectedTokens(Parser recognizer) {
        return recognizer.getExpectedTokens();
    }

    protected String getTokenErrorDisplay(Token t) {
        if(t == null) {
            return "<no token>";
        } else {
            String s = this.getSymbolText(t);
            if(s == null) {
                if(this.getSymbolType(t) == -1) {
                    s = "<EOF>";
                } else {
                    s = "<" + this.getSymbolType(t) + ">";
                }
            }

            return this.escapeWSAndQuote(s);
        }
    }

    protected String getSymbolText(Token symbol) {
        return symbol.getText();
    }

    protected int getSymbolType(Token symbol) {
        return symbol.getType();
    }

    protected String escapeWSAndQuote(String s) {
        s = s.replace("\n", "\\n");
        s = s.replace("\r", "\\r");
        s = s.replace("\t", "\\t");
        return "\'" + s + "\'";
    }


    protected void consumeUntil(Parser recognizer, IntervalSet set) {
        for(int ttype = recognizer.getInputStream().LA(1); ttype != -1 && !set.contains(ttype); ttype = recognizer.getInputStream().LA(1)) {
            recognizer.consume();
        }

    }
}
