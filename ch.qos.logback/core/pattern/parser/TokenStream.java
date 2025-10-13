package ch.qos.logback.core.pattern.parser;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.pattern.util.IEscapeUtil;
import ch.qos.logback.core.pattern.util.RegularEscapeUtil;
import ch.qos.logback.core.pattern.util.RestrictedEscapeUtil;
import ch.qos.logback.core.spi.ScanException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes.dex */
class TokenStream {
    final IEscapeUtil escapeUtil;
    final IEscapeUtil optionEscapeUtil;
    final String pattern;
    final int patternLength;
    int pointer;
    TokenizerState state;

    /* renamed from: ch.qos.logback.core.pattern.parser.TokenStream$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState;

        static {
            int[] iArr = new int[TokenizerState.values().length];
            $SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState = iArr;
            try {
                iArr[TokenizerState.LITERAL_STATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState[TokenizerState.FORMAT_MODIFIER_STATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState[TokenizerState.OPTION_STATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState[TokenizerState.KEYWORD_STATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState[TokenizerState.RIGHT_PARENTHESIS_STATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    enum TokenizerState {
        LITERAL_STATE,
        FORMAT_MODIFIER_STATE,
        KEYWORD_STATE,
        OPTION_STATE,
        RIGHT_PARENTHESIS_STATE
    }

    TokenStream(String str) {
        this(str, new RegularEscapeUtil());
    }

    TokenStream(String str, IEscapeUtil iEscapeUtil) {
        this.optionEscapeUtil = new RestrictedEscapeUtil();
        this.state = TokenizerState.LITERAL_STATE;
        this.pointer = 0;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("null or empty pattern string not allowed");
        }
        this.pattern = str;
        this.patternLength = str.length();
        this.escapeUtil = iEscapeUtil;
    }

    private void addValuedToken(int i2, StringBuffer stringBuffer, List<Token> list) {
        if (stringBuffer.length() > 0) {
            list.add(new Token(i2, stringBuffer.toString()));
            stringBuffer.setLength(0);
        }
    }

    private void handleFormatModifierState(char c2, List<Token> list, StringBuffer stringBuffer) {
        if (c2 == '(') {
            addValuedToken(1002, stringBuffer, list);
            list.add(Token.BARE_COMPOSITE_KEYWORD_TOKEN);
            this.state = TokenizerState.LITERAL_STATE;
        } else {
            if (Character.isJavaIdentifierStart(c2)) {
                addValuedToken(1002, stringBuffer, list);
                this.state = TokenizerState.KEYWORD_STATE;
            }
            stringBuffer.append(c2);
        }
    }

    private void handleKeywordState(char c2, List<Token> list, StringBuffer stringBuffer) {
        TokenizerState tokenizerState;
        if (Character.isJavaIdentifierPart(c2)) {
            stringBuffer.append(c2);
            return;
        }
        if (c2 == '{') {
            addValuedToken(1004, stringBuffer, list);
            tokenizerState = TokenizerState.OPTION_STATE;
        } else {
            if (c2 == '(') {
                addValuedToken(WebSocketProtocol.CLOSE_NO_STATUS_CODE, stringBuffer, list);
            } else if (c2 == '%') {
                addValuedToken(1004, stringBuffer, list);
                list.add(Token.PERCENT_TOKEN);
                tokenizerState = TokenizerState.FORMAT_MODIFIER_STATE;
            } else {
                addValuedToken(1004, stringBuffer, list);
                if (c2 == ')') {
                    tokenizerState = TokenizerState.RIGHT_PARENTHESIS_STATE;
                } else if (c2 == '\\') {
                    int i2 = this.pointer;
                    if (i2 < this.patternLength) {
                        String str = this.pattern;
                        this.pointer = i2 + 1;
                        this.escapeUtil.escape("%()", stringBuffer, str.charAt(i2), this.pointer);
                    }
                } else {
                    stringBuffer.append(c2);
                }
            }
            tokenizerState = TokenizerState.LITERAL_STATE;
        }
        this.state = tokenizerState;
    }

    private void handleLiteralState(char c2, List<Token> list, StringBuffer stringBuffer) {
        TokenizerState tokenizerState;
        if (c2 == '%') {
            addValuedToken(CoreConstants.MILLIS_IN_ONE_SECOND, stringBuffer, list);
            list.add(Token.PERCENT_TOKEN);
            tokenizerState = TokenizerState.FORMAT_MODIFIER_STATE;
        } else {
            if (c2 != ')') {
                if (c2 != '\\') {
                    stringBuffer.append(c2);
                    return;
                } else {
                    escape("%()", stringBuffer);
                    return;
                }
            }
            addValuedToken(CoreConstants.MILLIS_IN_ONE_SECOND, stringBuffer, list);
            tokenizerState = TokenizerState.RIGHT_PARENTHESIS_STATE;
        }
        this.state = tokenizerState;
    }

    private void handleRightParenthesisState(char c2, List<Token> list, StringBuffer stringBuffer) {
        TokenizerState tokenizerState;
        list.add(Token.RIGHT_PARENTHESIS_TOKEN);
        if (c2 != ')') {
            if (c2 == '\\') {
                escape("%{}", stringBuffer);
            } else {
                if (c2 == '{') {
                    tokenizerState = TokenizerState.OPTION_STATE;
                    this.state = tokenizerState;
                }
                stringBuffer.append(c2);
            }
            tokenizerState = TokenizerState.LITERAL_STATE;
            this.state = tokenizerState;
        }
    }

    private void processOption(char c2, List<Token> list, StringBuffer stringBuffer) throws ScanException {
        new OptionTokenizer(this).tokenize(c2, list);
    }

    void escape(String str, StringBuffer stringBuffer) {
        int i2 = this.pointer;
        if (i2 < this.patternLength) {
            String str2 = this.pattern;
            this.pointer = i2 + 1;
            this.escapeUtil.escape(str, stringBuffer, str2.charAt(i2), this.pointer);
        }
    }

    void optionEscape(String str, StringBuffer stringBuffer) {
        int i2 = this.pointer;
        if (i2 < this.patternLength) {
            String str2 = this.pattern;
            this.pointer = i2 + 1;
            this.optionEscapeUtil.escape(str, stringBuffer, str2.charAt(i2), this.pointer);
        }
    }

    List tokenize() throws ScanException {
        ArrayList arrayList = new ArrayList();
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            int i2 = this.pointer;
            if (i2 >= this.patternLength) {
                break;
            }
            char cCharAt = this.pattern.charAt(i2);
            this.pointer++;
            int i3 = AnonymousClass1.$SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState[this.state.ordinal()];
            if (i3 == 1) {
                handleLiteralState(cCharAt, arrayList, stringBuffer);
            } else if (i3 == 2) {
                handleFormatModifierState(cCharAt, arrayList, stringBuffer);
            } else if (i3 == 3) {
                processOption(cCharAt, arrayList, stringBuffer);
            } else if (i3 == 4) {
                handleKeywordState(cCharAt, arrayList, stringBuffer);
            } else if (i3 == 5) {
                handleRightParenthesisState(cCharAt, arrayList, stringBuffer);
            }
        }
        int i4 = AnonymousClass1.$SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState[this.state.ordinal()];
        if (i4 == 1) {
            addValuedToken(CoreConstants.MILLIS_IN_ONE_SECOND, stringBuffer, arrayList);
        } else {
            if (i4 == 2 || i4 == 3) {
                throw new ScanException("Unexpected end of pattern string");
            }
            if (i4 == 4) {
                arrayList.add(new Token(1004, stringBuffer.toString()));
            } else if (i4 == 5) {
                arrayList.add(Token.RIGHT_PARENTHESIS_TOKEN);
            }
        }
        return arrayList;
    }
}