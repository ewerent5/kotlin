package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public enum cd2 implements gj2 {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    UNRECOGNIZED(-1);


    /* renamed from: k, reason: collision with root package name */
    private static final hj2<cd2> f5312k = new hj2<cd2>() { // from class: com.google.android.gms.internal.ads.bd2
    };

    /* renamed from: m, reason: collision with root package name */
    private final int f5314m;

    cd2(int i2) {
        this.f5314m = i2;
    }

    public static cd2 a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_HASH;
        }
        if (i2 == 1) {
            return SHA1;
        }
        if (i2 == 2) {
            return SHA384;
        }
        if (i2 == 3) {
            return SHA256;
        }
        if (i2 != 4) {
            return null;
        }
        return SHA512;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(cd2.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        cd2 cd2Var = UNRECOGNIZED;
        if (this != cd2Var) {
            sb.append(" number=");
            if (this == cd2Var) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            sb.append(this.f5314m);
        }
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }
}