package ch.qos.logback.core.subst;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.spi.ScanException;
import ch.qos.logback.core.subst.Token;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class Tokenizer {
    final String pattern;
    final int patternLength;
    TokenizerState state = TokenizerState.LITERAL_STATE;
    int pointer = 0;

    /* renamed from: ch.qos.logback.core.subst.Tokenizer$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState;

        static {
            int[] iArr = new int[TokenizerState.values().length];
            $SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState = iArr;
            try {
                iArr[TokenizerState.LITERAL_STATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState[TokenizerState.START_STATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState[TokenizerState.DEFAULT_VAL_STATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    enum TokenizerState {
        LITERAL_STATE,
        START_STATE,
        DEFAULT_VAL_STATE
    }

    public Tokenizer(String str) {
        this.pattern = str;
        this.patternLength = str.length();
    }

    private void addLiteralToken(List<Token> list, StringBuilder sb) {
        if (sb.length() == 0) {
            return;
        }
        list.add(new Token(Token.Type.LITERAL, sb.toString()));
    }

    private void handleDefaultValueState(char c2, List<Token> list, StringBuilder sb) {
        TokenizerState tokenizerState;
        if (c2 != '$') {
            if (c2 != '-') {
                sb.append(CoreConstants.COLON_CHAR);
                sb.append(c2);
            } else {
                list.add(Token.DEFAULT_SEP_TOKEN);
            }
            tokenizerState = TokenizerState.LITERAL_STATE;
        } else {
            sb.append(CoreConstants.COLON_CHAR);
            addLiteralToken(list, sb);
            sb.setLength(0);
            tokenizerState = TokenizerState.START_STATE;
        }
        this.state = tokenizerState;
    }

    private void handleLiteralState(char c2, List<Token> list, StringBuilder sb) {
        Token token;
        TokenizerState tokenizerState;
        if (c2 == '$') {
            addLiteralToken(list, sb);
            sb.setLength(0);
            tokenizerState = TokenizerState.START_STATE;
        } else {
            if (c2 != ':') {
                if (c2 == '{') {
                    addLiteralToken(list, sb);
                    token = Token.CURLY_LEFT_TOKEN;
                } else if (c2 != '}') {
                    sb.append(c2);
                    return;
                } else {
                    addLiteralToken(list, sb);
                    token = Token.CURLY_RIGHT_TOKEN;
                }
                list.add(token);
                sb.setLength(0);
                return;
            }
            addLiteralToken(list, sb);
            sb.setLength(0);
            tokenizerState = TokenizerState.DEFAULT_VAL_STATE;
        }
        this.state = tokenizerState;
    }

    private void handleStartState(char c2, List<Token> list, StringBuilder sb) {
        if (c2 == '{') {
            list.add(Token.START_TOKEN);
        } else {
            sb.append(CoreConstants.DOLLAR);
            sb.append(c2);
        }
        this.state = TokenizerState.LITERAL_STATE;
    }

    List<Token> tokenize() throws ScanException {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i2 = this.pointer;
            if (i2 >= this.patternLength) {
                break;
            }
            char cCharAt = this.pattern.charAt(i2);
            this.pointer++;
            int i3 = AnonymousClass1.$SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState[this.state.ordinal()];
            if (i3 == 1) {
                handleLiteralState(cCharAt, arrayList, sb);
            } else if (i3 == 2) {
                handleStartState(cCharAt, arrayList, sb);
            } else if (i3 == 3) {
                handleDefaultValueState(cCharAt, arrayList, sb);
            }
        }
        int i4 = AnonymousClass1.$SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState[this.state.ordinal()];
        if (i4 == 1) {
            addLiteralToken(arrayList, sb);
        } else if (i4 == 2) {
            throw new ScanException("Unexpected end of pattern string");
        }
        return arrayList;
    }
}