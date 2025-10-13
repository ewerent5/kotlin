package okhttp3;

import ch.qos.logback.core.CoreConstants;
import i.y.d.l;
import j.i;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: Credentials.kt */
/* loaded from: classes3.dex */
public final class Credentials {
    public static final Credentials INSTANCE = new Credentials();

    private Credentials() {
    }

    public static final String basic(String str, String str2) {
        return basic$default(str, str2, null, 4, null);
    }

    public static final String basic(String str, String str2, Charset charset) {
        l.d(str, "username");
        l.d(str2, "password");
        l.d(charset, "charset");
        return "Basic " + i.f16464f.c(str + CoreConstants.COLON_CHAR + str2, charset).a();
    }

    public static /* synthetic */ String basic$default(String str, String str2, Charset charset, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            charset = StandardCharsets.ISO_8859_1;
            l.c(charset, "ISO_8859_1");
        }
        return basic(str, str2, charset);
    }
}