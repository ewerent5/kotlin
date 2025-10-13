package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public enum k01 implements gj2 {
    DEVICE_IDENTIFIER_NO_ID(0),
    DEVICE_IDENTIFIER_APP_SPECIFIC_ID(1),
    DEVICE_IDENTIFIER_GLOBAL_ID(2),
    DEVICE_IDENTIFIER_ADVERTISER_ID(3),
    DEVICE_IDENTIFIER_ADVERTISER_ID_UNHASHED(4),
    DEVICE_IDENTIFIER_ANDROID_AD_ID(5),
    DEVICE_IDENTIFIER_GFIBER_ADVERTISING_ID(6),
    DEVICE_IDENTIFIER_PER_APP_ID(7);


    /* renamed from: m, reason: collision with root package name */
    private static final hj2<k01> f6921m = new hj2<k01>() { // from class: com.google.android.gms.internal.ads.iy0
    };
    private final int o;

    k01(int i2) {
        this.o = i2;
    }

    public static k01 a(int i2) {
        switch (i2) {
            case 0:
                return DEVICE_IDENTIFIER_NO_ID;
            case 1:
                return DEVICE_IDENTIFIER_APP_SPECIFIC_ID;
            case 2:
                return DEVICE_IDENTIFIER_GLOBAL_ID;
            case 3:
                return DEVICE_IDENTIFIER_ADVERTISER_ID;
            case 4:
                return DEVICE_IDENTIFIER_ADVERTISER_ID_UNHASHED;
            case 5:
                return DEVICE_IDENTIFIER_ANDROID_AD_ID;
            case 6:
                return DEVICE_IDENTIFIER_GFIBER_ADVERTISING_ID;
            case 7:
                return DEVICE_IDENTIFIER_PER_APP_ID;
            default:
                return null;
        }
    }

    public static ij2 b() {
        return jz0.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + k01.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.o + " name=" + name() + '>';
    }

    public final int zza() {
        return this.o;
    }
}