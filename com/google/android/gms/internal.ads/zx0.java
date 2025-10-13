package com.google.android.gms.internal.ads;

import android.webkit.CookieManager;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zx0 implements Callable {
    private final CookieManager a;

    zx0(CookieManager cookieManager) {
        this.a = cookieManager;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        CookieManager cookieManager = this.a;
        if (cookieManager == null) {
            return "";
        }
        return cookieManager.getCookie((String) c.c().b(w3.z0));
    }
}