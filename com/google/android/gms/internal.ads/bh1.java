package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public enum bh1 implements gj2 {
    UNKNOWN_ENCRYPTION_METHOD(0),
    BITSLICER(1),
    TINK_HYBRID(2),
    UNENCRYPTED(3),
    DG(4),
    DG_XTEA(5);


    /* renamed from: k, reason: collision with root package name */
    private static final hj2<bh1> f5111k = new hj2<bh1>() { // from class: com.google.android.gms.internal.ads.ze1
    };

    /* renamed from: m, reason: collision with root package name */
    private final int f5113m;

    bh1(int i2) {
        this.f5113m = i2;
    }

    public static bh1 a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_ENCRYPTION_METHOD;
        }
        if (i2 == 1) {
            return BITSLICER;
        }
        if (i2 == 2) {
            return TINK_HYBRID;
        }
        if (i2 == 3) {
            return UNENCRYPTED;
        }
        if (i2 == 4) {
            return DG;
        }
        if (i2 != 5) {
            return null;
        }
        return DG_XTEA;
    }

    public static ij2 b() {
        return ag1.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + bh1.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f5113m + " name=" + name() + '>';
    }

    public final int zza() {
        return this.f5113m;
    }
}