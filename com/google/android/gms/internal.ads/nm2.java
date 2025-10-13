package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public enum nm2 implements gj2 {
    SAFE(0),
    DANGEROUS(1),
    UNKNOWN(2),
    POTENTIALLY_UNWANTED(3),
    DANGEROUS_HOST(4);


    /* renamed from: j, reason: collision with root package name */
    private static final hj2<nm2> f7755j = new hj2<nm2>() { // from class: com.google.android.gms.internal.ads.lm2
    };

    /* renamed from: l, reason: collision with root package name */
    private final int f7757l;

    nm2(int i2) {
        this.f7757l = i2;
    }

    public static nm2 a(int i2) {
        if (i2 == 0) {
            return SAFE;
        }
        if (i2 == 1) {
            return DANGEROUS;
        }
        if (i2 == 2) {
            return UNKNOWN;
        }
        if (i2 == 3) {
            return POTENTIALLY_UNWANTED;
        }
        if (i2 != 4) {
            return null;
        }
        return DANGEROUS_HOST;
    }

    public static ij2 b() {
        return mm2.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + nm2.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f7757l + " name=" + name() + '>';
    }
}