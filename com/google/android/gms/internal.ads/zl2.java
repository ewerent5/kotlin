package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class zl2 extends bm2 {
    zl2(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.bm2
    public final void a(Object obj, long j2, byte b2) {
        if (cm2.f5340i) {
            cm2.d(obj, j2, b2);
        } else {
            cm2.e(obj, j2, b2);
        }
    }

    @Override // com.google.android.gms.internal.ads.bm2
    public final boolean b(Object obj, long j2) {
        return cm2.f5340i ? cm2.A(obj, j2) : cm2.B(obj, j2);
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.ads.cm2.C(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.ads.cm2.D(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z' boolean)' in method call: com.google.android.gms.internal.ads.cm2.C(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z' boolean)' in method call: com.google.android.gms.internal.ads.cm2.D(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.ads.bm2
    public final void c(Object obj, long j2, boolean z) {
        if (cm2.f5340i) {
            cm2.C(obj, j2, z);
        } else {
            cm2.D(obj, j2, z);
        }
    }

    @Override // com.google.android.gms.internal.ads.bm2
    public final float d(Object obj, long j2) {
        return Float.intBitsToFloat(k(obj, j2));
    }

    @Override // com.google.android.gms.internal.ads.bm2
    public final void e(Object obj, long j2, float f2) {
        l(obj, j2, Float.floatToIntBits(f2));
    }

    @Override // com.google.android.gms.internal.ads.bm2
    public final double f(Object obj, long j2) {
        return Double.longBitsToDouble(m(obj, j2));
    }

    @Override // com.google.android.gms.internal.ads.bm2
    public final void g(Object obj, long j2, double d2) {
        n(obj, j2, Double.doubleToLongBits(d2));
    }
}