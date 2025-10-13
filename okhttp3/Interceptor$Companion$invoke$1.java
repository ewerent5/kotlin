package okhttp3;

import i.y.d.l;
import okhttp3.Interceptor;

/* compiled from: Interceptor.kt */
/* loaded from: classes3.dex */
public final class Interceptor$Companion$invoke$1 implements Interceptor {
    public Interceptor$Companion$invoke$1() {
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        l.d(chain, "it");
        return (Response) lVar.invoke(chain);
    }
}