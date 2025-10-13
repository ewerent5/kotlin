package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public enum ad2 implements gj2 {
    UNKNOWN_CURVE(0),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    CURVE25519(5),
    UNRECOGNIZED(-1);


    /* renamed from: k, reason: collision with root package name */
    private static final hj2<ad2> f4898k = new hj2<ad2>() { // from class: com.google.android.gms.internal.ads.zc2
    };

    /* renamed from: m, reason: collision with root package name */
    private final int f4900m;

    ad2(int i2) {
        this.f4900m = i2;
    }

    public static ad2 a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_CURVE;
        }
        if (i2 == 2) {
            return NIST_P256;
        }
        if (i2 == 3) {
            return NIST_P384;
        }
        if (i2 == 4) {
            return NIST_P521;
        }
        if (i2 != 5) {
            return null;
        }
        return CURVE25519;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(ad2.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        ad2 ad2Var = UNRECOGNIZED;
        if (this != ad2Var) {
            sb.append(" number=");
            if (this == ad2Var) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            sb.append(this.f4900m);
        }
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }
}