package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public enum pd2 implements gj2 {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);


    /* renamed from: k, reason: collision with root package name */
    private static final hj2<pd2> f8145k = new hj2<pd2>() { // from class: com.google.android.gms.internal.ads.od2
    };

    /* renamed from: m, reason: collision with root package name */
    private final int f8147m;

    pd2(int i2) {
        this.f8147m = i2;
    }

    public static pd2 a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_KEYMATERIAL;
        }
        if (i2 == 1) {
            return SYMMETRIC;
        }
        if (i2 == 2) {
            return ASYMMETRIC_PRIVATE;
        }
        if (i2 == 3) {
            return ASYMMETRIC_PUBLIC;
        }
        if (i2 != 4) {
            return null;
        }
        return REMOTE;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(pd2.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != UNRECOGNIZED) {
            sb.append(" number=");
            sb.append(zza());
        }
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }

    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f8147m;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}