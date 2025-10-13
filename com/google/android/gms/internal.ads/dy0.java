package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.zzs;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class dy0 implements mo2<g52<String>> {
    private final wo2<st1> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Context> f5539b;

    public dy0(wo2<st1> wo2Var, wo2<Context> wo2Var2) {
        this.a = wo2Var;
        this.f5539b = wo2Var2;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        st1 st1VarZzb = this.a.zzb();
        final CookieManager cookieManagerZzk = zzs.zze().zzk(this.f5539b.zzb());
        return ct1.b(new Callable(cookieManagerZzk) { // from class: com.google.android.gms.internal.ads.zx0
            private final CookieManager a;

            {
                this.a = cookieManagerZzk;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager cookieManager = this.a;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) c.c().b(w3.z0));
            }
        }, lt1.WEBVIEW_COOKIE, st1VarZzb).h(1L, TimeUnit.SECONDS).f(Exception.class, ay0.a).i();
    }
}