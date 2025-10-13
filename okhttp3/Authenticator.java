package okhttp3;

import i.y.d.g;
import i.y.d.l;
import okhttp3.internal.authenticator.JavaNetAuthenticator;

/* compiled from: Authenticator.kt */
/* loaded from: classes3.dex */
public interface Authenticator {
    public static final Companion Companion = new Companion(null);
    public static final Authenticator NONE = new Companion.AuthenticatorNone();
    public static final Authenticator JAVA_NET_AUTHENTICATOR = new JavaNetAuthenticator(null, 1, null);

    /* compiled from: Authenticator.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;

        /* compiled from: Authenticator.kt */
        private static final class AuthenticatorNone implements Authenticator {
            @Override // okhttp3.Authenticator
            public Request authenticate(Route route, Response response) {
                l.d(response, "response");
                return null;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    Request authenticate(Route route, Response response);
}