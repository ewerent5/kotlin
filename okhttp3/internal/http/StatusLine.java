package okhttp3.internal.http;

import i.d0.p;
import i.y.d.g;
import i.y.d.l;
import java.net.ProtocolException;
import okhttp3.Protocol;
import okhttp3.Response;

/* compiled from: StatusLine.kt */
/* loaded from: classes3.dex */
public final class StatusLine {
    public static final Companion Companion = new Companion(null);
    public static final int HTTP_CONTINUE = 100;
    public static final int HTTP_MISDIRECTED_REQUEST = 421;
    public static final int HTTP_PERM_REDIRECT = 308;
    public static final int HTTP_TEMP_REDIRECT = 307;
    public final int code;
    public final String message;
    public final Protocol protocol;

    /* compiled from: StatusLine.kt */
    public static final class Companion {
        private Companion() {
        }

        public final StatusLine get(Response response) {
            l.d(response, "response");
            return new StatusLine(response.protocol(), response.code(), response.message());
        }

        public final StatusLine parse(String str) throws ProtocolException, NumberFormatException {
            Protocol protocol;
            String strSubstring;
            l.d(str, "statusLine");
            int i2 = 9;
            if (p.B(str, "HTTP/1.", false, 2, null)) {
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                int iCharAt = str.charAt(7) - '0';
                if (iCharAt == 0) {
                    protocol = Protocol.HTTP_1_0;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException("Unexpected status line: " + str);
                    }
                    protocol = Protocol.HTTP_1_1;
                }
            } else {
                if (!p.B(str, "ICY ", false, 2, null)) {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                protocol = Protocol.HTTP_1_0;
                i2 = 4;
            }
            int i3 = i2 + 3;
            if (str.length() < i3) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            try {
                String strSubstring2 = str.substring(i2, i3);
                l.c(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                int i4 = Integer.parseInt(strSubstring2);
                if (str.length() <= i3) {
                    strSubstring = "";
                } else {
                    if (str.charAt(i3) != ' ') {
                        throw new ProtocolException("Unexpected status line: " + str);
                    }
                    strSubstring = str.substring(i2 + 4);
                    l.c(strSubstring, "(this as java.lang.String).substring(startIndex)");
                }
                return new StatusLine(protocol, i4, strSubstring);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public StatusLine(Protocol protocol, int i2, String str) {
        l.d(protocol, "protocol");
        l.d(str, "message");
        this.protocol = protocol;
        this.code = i2;
        this.message = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.protocol == Protocol.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.code);
        sb.append(' ');
        sb.append(this.message);
        String string = sb.toString();
        l.c(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}