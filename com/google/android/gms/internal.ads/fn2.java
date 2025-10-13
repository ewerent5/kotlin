package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public enum fn2 implements gj2 {
    TYPE_UNKNOWN(0),
    TYPE_CREATIVE(1);


    /* renamed from: g, reason: collision with root package name */
    private static final hj2<fn2> f5906g = new hj2<fn2>() { // from class: com.google.android.gms.internal.ads.dn2
    };

    /* renamed from: i, reason: collision with root package name */
    private final int f5908i;

    fn2(int i2) {
        this.f5908i = i2;
    }

    public static fn2 a(int i2) {
        if (i2 == 0) {
            return TYPE_UNKNOWN;
        }
        if (i2 != 1) {
            return null;
        }
        return TYPE_CREATIVE;
    }

    public static ij2 b() {
        return en2.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + fn2.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f5908i + " name=" + name() + '>';
    }

    public final int zza() {
        return this.f5908i;
    }
}