package okhttp3;

import i.y.d.l;
import okhttp3.Interceptor;

/* compiled from: OkHttpClient.kt */
/* loaded from: classes3.dex */
public final class OkHttpClient$Builder$addInterceptor$2 implements Interceptor {
    public OkHttpClient$Builder$addInterceptor$2() {
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        l.d(chain, "chain");
        return (Response) lVar.invoke(chain);
    }
}