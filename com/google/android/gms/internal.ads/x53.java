package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public enum x53 implements gj2 {
    AD_FORMAT_TYPE_UNSPECIFIED(0),
    BANNER(1),
    INTERSTITIAL(2),
    NATIVE_EXPRESS(3),
    NATIVE_CONTENT(4),
    NATIVE_APP_INSTALL(5),
    NATIVE_CUSTOM_TEMPLATE(6),
    DFP_BANNER(7),
    DFP_INTERSTITIAL(8),
    REWARD_BASED_VIDEO_AD(9),
    BANNER_SEARCH_ADS(10);

    private static final hj2<x53> p = new hj2<x53>() { // from class: com.google.android.gms.internal.ads.v53
    };
    private final int r;

    x53(int i2) {
        this.r = i2;
    }

    public static x53 a(int i2) {
        switch (i2) {
            case 0:
                return AD_FORMAT_TYPE_UNSPECIFIED;
            case 1:
                return BANNER;
            case 2:
                return INTERSTITIAL;
            case 3:
                return NATIVE_EXPRESS;
            case 4:
                return NATIVE_CONTENT;
            case 5:
                return NATIVE_APP_INSTALL;
            case 6:
                return NATIVE_CUSTOM_TEMPLATE;
            case 7:
                return DFP_BANNER;
            case 8:
                return DFP_INTERSTITIAL;
            case 9:
                return REWARD_BASED_VIDEO_AD;
            case 10:
                return BANNER_SEARCH_ADS;
            default:
                return null;
        }
    }

    public static ij2 b() {
        return w53.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + x53.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.r + " name=" + name() + '>';
    }

    public final int zza() {
        return this.r;
    }
}