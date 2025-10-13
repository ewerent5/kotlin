package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class qk0 implements ba<Object> {
    private final WeakReference<sk0> a;

    /* synthetic */ qk0(sk0 sk0Var, ok0 ok0Var) {
        this.a = new WeakReference<>(sk0Var);
    }

    @Override // com.google.android.gms.internal.ads.ba
    public final void a(Object obj, Map<String, String> map) {
        sk0 sk0Var = this.a.get();
        if (sk0Var == null) {
            return;
        }
        sk0Var.f8898h.onAdClicked();
    }
}