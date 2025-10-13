package okhttp3;

import i.y.c.l;
import java.util.concurrent.TimeUnit;
import okhttp3.Interceptor;

/* compiled from: Interceptor.kt */
/* loaded from: classes3.dex */
public interface Interceptor {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: Interceptor.kt */
    public interface Chain {
        Call call();

        int connectTimeoutMillis();

        Connection connection();

        Response proceed(Request request);

        int readTimeoutMillis();

        Request request();

        Chain withConnectTimeout(int i2, TimeUnit timeUnit);

        Chain withReadTimeout(int i2, TimeUnit timeUnit);

        Chain withWriteTimeout(int i2, TimeUnit timeUnit);

        int writeTimeoutMillis();
    }

    /* compiled from: Interceptor.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final Interceptor invoke(final l<? super Chain, Response> lVar) {
            i.y.d.l.d(lVar, "block");
            return new Interceptor() { // from class: okhttp3.Interceptor$Companion$invoke$1
                @Override // okhttp3.Interceptor
                public final Response intercept(Interceptor.Chain chain) {
                    i.y.d.l.d(chain, "it");
                    return (Response) lVar.invoke(chain);
                }
            };
        }
    }

    Response intercept(Chain chain);
}