package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class do0 implements x02<t83, Bitmap> {
    final /* synthetic */ double a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f5492b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ eo0 f5493c;

    do0(eo0 eo0Var, double d2, boolean z) {
        this.f5493c = eo0Var;
        this.a = d2;
        this.f5492b = z;
    }

    @Override // com.google.android.gms.internal.ads.x02
    public final /* bridge */ /* synthetic */ Bitmap apply(t83 t83Var) {
        return eo0.b(this.f5493c, t83Var.f9090b, this.a, this.f5492b);
    }
}