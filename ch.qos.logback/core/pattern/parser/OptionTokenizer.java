package ch.qos.logback.core.pattern.parser;

import ch.qos.logback.core.pattern.parser.TokenStream;
import ch.qos.logback.core.pattern.util.AsIsEscapeUtil;
import ch.qos.logback.core.pattern.util.IEscapeUtil;
import ch.qos.logback.core.spi.ScanException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class OptionTokenizer {
    private static final int EXPECTING_STATE = 0;
    private static final int QUOTED_COLLECTING_STATE = 2;
    private static final int RAW_COLLECTING_STATE = 1;
    final IEscapeUtil escapeUtil;
    final String pattern;
    final int patternLength;
    char quoteChar;
    int state;
    final TokenStream tokenStream;

    OptionTokenizer(TokenStream tokenStream) {
        this(tokenStream, new AsIsEscapeUtil());
    }

    OptionTokenizer(TokenStream tokenStream, IEscapeUtil iEscapeUtil) {
        this.state = 0;
        this.tokenStream = tokenStream;
        this.pattern = tokenStream.pattern;
        this.patternLength = tokenStream.patternLength;
        this.escapeUtil = iEscapeUtil;
    }

    void emitOptionToken(List<Token> list, List<String> list2) {
        list.add(new Token(1006, list2));
        this.tokenStream.state = TokenStream.TokenizerState.LITERAL_STATE;
    }

    void escape(String str, StringBuffer stringBuffer) {
        TokenStream tokenStream = this.tokenStream;
        int i2 = tokenStream.pointer;
        if (i2 < this.patternLength) {
            String str2 = this.pattern;
            tokenStream.pointer = i2 + 1;
            this.escapeUtil.escape(str, stringBuffer, str2.charAt(i2), this.tokenStream.pointer);
        }
    }

    void tokenize(char c2, List<Token> list) throws ScanException {
        String strTrim;
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList = new ArrayList();
        while (this.tokenStream.pointer < this.patternLength) {
            int i2 = this.state;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        char c3 = this.quoteChar;
                        if (c2 == c3) {
                            strTrim = stringBuffer.toString();
                            arrayList.add(strTrim);
                            stringBuffer.setLength(0);
                            this.state = 0;
                        } else if (c2 == '\\') {
                            escape(String.valueOf(c3), stringBuffer);
                        } else {
                            stringBuffer.append(c2);
                        }
                    }
                } else if (c2 != ',') {
                    if (c2 == '}') {
                        arrayList.add(stringBuffer.toString().trim());
                        emitOptionToken(list, arrayList);
                        return;
                    }
                    stringBuffer.append(c2);
                } else {
                    strTrim = stringBuffer.toString().trim();
                    arrayList.add(strTrim);
                    stringBuffer.setLength(0);
                    this.state = 0;
                }
            } else if (c2 != '\t' && c2 != '\n' && c2 != '\r' && c2 != ' ') {
                if (c2 == '\"' || c2 == '\'') {
                    this.state = 2;
                    this.quoteChar = c2;
                } else if (c2 == ',') {
                    continue;
                } else if (c2 == '}') {
                    emitOptionToken(list, arrayList);
                    return;
                } else {
                    stringBuffer.append(c2);
                    this.state = 1;
                }
            }
            c2 = this.pattern.charAt(this.tokenStream.pointer);
            this.tokenStream.pointer++;
        }
        if (c2 != '}') {
            throw new ScanException("Unexpected end of pattern string in OptionTokenizer");
        }
        int i3 = this.state;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new ScanException("Unexpected end of pattern string in OptionTokenizer");
            }
            arrayList.add(stringBuffer.toString().trim());
        }
        emitOptionToken(list, arrayList);
    }
}