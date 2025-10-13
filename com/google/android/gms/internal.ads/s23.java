package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class s23 implements ValueCallback<String> {
    final /* synthetic */ t23 a;

    s23(t23 t23Var) {
        this.a = t23Var;
    }

    @Override // android.webkit.ValueCallback
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void onReceiveValue(String str) {
        t23 t23Var = this.a;
        t23Var.f9073i.d(t23Var.f9070f, t23Var.f9071g, str, t23Var.f9072h);
    }
}