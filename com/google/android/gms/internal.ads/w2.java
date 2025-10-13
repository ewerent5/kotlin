package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class w2 extends g1 {

    /* renamed from: e, reason: collision with root package name */
    private final OnPaidEventListener f9855e;

    public w2(OnPaidEventListener onPaidEventListener) {
        this.f9855e = onPaidEventListener;
    }

    @Override // com.google.android.gms.internal.ads.h1
    public final void W2(t93 t93Var) {
        if (this.f9855e != null) {
            this.f9855e.onPaidEvent(AdValue.zza(t93Var.f9100f, t93Var.f9101g, t93Var.f9102h));
        }
    }
}