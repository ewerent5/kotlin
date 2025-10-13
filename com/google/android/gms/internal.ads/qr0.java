package com.google.android.gms.internal.ads;

import android.graphics.Rect;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class qr0 implements v13 {

    /* renamed from: e */
    private final ew f8452e;

    qr0(ew ewVar) {
        this.f8452e = ewVar;
    }

    @Override // com.google.android.gms.internal.ads.v13
    public final void c0(u13 u13Var) {
        tx txVarE0 = this.f8452e.E0();
        Rect rect = u13Var.f9349d;
        txVarE0.g0(rect.left, rect.top, false);
    }
}