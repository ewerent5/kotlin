package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public enum c73 implements gj2 {
    CELLULAR_NETWORK_TYPE_UNSPECIFIED(0),
    TWO_G(1),
    THREE_G(2),
    LTE(4);


    /* renamed from: i, reason: collision with root package name */
    private static final hj2<c73> f5283i = new hj2<c73>() { // from class: com.google.android.gms.internal.ads.a73
    };

    /* renamed from: k, reason: collision with root package name */
    private final int f5285k;

    c73(int i2) {
        this.f5285k = i2;
    }

    public static c73 a(int i2) {
        if (i2 == 0) {
            return CELLULAR_NETWORK_TYPE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return TWO_G;
        }
        if (i2 == 2) {
            return THREE_G;
        }
        if (i2 != 4) {
            return null;
        }
        return LTE;
    }

    public static ij2 b() {
        return b73.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + c73.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f5285k + " name=" + name() + '>';
    }

    public final int zza() {
        return this.f5285k;
    }
}