package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public enum rg0 implements gj2 {
    UNKNOWN(0),
    ENABLED(1),
    DISABLED(2);


    /* renamed from: h, reason: collision with root package name */
    private static final hj2<rg0> f8644h = new hj2<rg0>() { // from class: com.google.android.gms.internal.ads.oe0
    };

    /* renamed from: j, reason: collision with root package name */
    private final int f8646j;

    rg0(int i2) {
        this.f8646j = i2;
    }

    public static rg0 a(int i2) {
        if (i2 == 0) {
            return UNKNOWN;
        }
        if (i2 == 1) {
            return ENABLED;
        }
        if (i2 != 2) {
            return null;
        }
        return DISABLED;
    }

    public static ij2 b() {
        return pf0.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + rg0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f8646j + " name=" + name() + '>';
    }

    public final int zza() {
        return this.f8646j;
    }
}