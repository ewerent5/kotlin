package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public enum f73 implements gj2 {
    NETWORKTYPE_UNSPECIFIED(0),
    CELL(1),
    WIFI(2);


    /* renamed from: h, reason: collision with root package name */
    private static final hj2<f73> f5821h = new hj2<f73>() { // from class: com.google.android.gms.internal.ads.d73
    };

    /* renamed from: j, reason: collision with root package name */
    private final int f5823j;

    f73(int i2) {
        this.f5823j = i2;
    }

    public static f73 a(int i2) {
        if (i2 == 0) {
            return NETWORKTYPE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return CELL;
        }
        if (i2 != 2) {
            return null;
        }
        return WIFI;
    }

    public static ij2 b() {
        return e73.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + f73.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f5823j + " name=" + name() + '>';
    }

    public final int zza() {
        return this.f5823j;
    }
}