package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public enum jn2 implements gj2 {
    UNKNOWN(0),
    URL_PHISHING(1),
    URL_MALWARE(2),
    URL_UNWANTED(3),
    CLIENT_SIDE_PHISHING_URL(4),
    CLIENT_SIDE_MALWARE_URL(5),
    DANGEROUS_DOWNLOAD_RECOVERY(6),
    DANGEROUS_DOWNLOAD_WARNING(7),
    OCTAGON_AD(8),
    OCTAGON_AD_SB_MATCH(9);

    private static final hj2<jn2> o = new hj2<jn2>() { // from class: com.google.android.gms.internal.ads.hn2
    };
    private final int q;

    jn2(int i2) {
        this.q = i2;
    }

    public static jn2 a(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN;
            case 1:
                return URL_PHISHING;
            case 2:
                return URL_MALWARE;
            case 3:
                return URL_UNWANTED;
            case 4:
                return CLIENT_SIDE_PHISHING_URL;
            case 5:
                return CLIENT_SIDE_MALWARE_URL;
            case 6:
                return DANGEROUS_DOWNLOAD_RECOVERY;
            case 7:
                return DANGEROUS_DOWNLOAD_WARNING;
            case 8:
                return OCTAGON_AD;
            case 9:
                return OCTAGON_AD_SB_MATCH;
            default:
                return null;
        }
    }

    public static ij2 b() {
        return in2.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + jn2.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.q + " name=" + name() + '>';
    }

    public final int zza() {
        return this.q;
    }
}