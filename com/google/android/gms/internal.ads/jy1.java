package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public enum jy1 implements gj2 {
    BLOCKED_REASON_UNKNOWN(1),
    BLOCKED_REASON_BACKGROUND(2);


    /* renamed from: g, reason: collision with root package name */
    private static final hj2<jy1> f6888g = new hj2<jy1>() { // from class: com.google.android.gms.internal.ads.hy1
    };

    /* renamed from: i, reason: collision with root package name */
    private final int f6890i;

    jy1(int i2) {
        this.f6890i = i2;
    }

    public static jy1 a(int i2) {
        if (i2 == 1) {
            return BLOCKED_REASON_UNKNOWN;
        }
        if (i2 != 2) {
            return null;
        }
        return BLOCKED_REASON_BACKGROUND;
    }

    public static ij2 b() {
        return iy1.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + jy1.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f6890i + " name=" + name() + '>';
    }

    public final int zza() {
        return this.f6890i;
    }
}