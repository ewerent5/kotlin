package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public enum hn1 implements gj2 {
    UNKNOWN_PROTO(0),
    AFMA_SIGNALS(1),
    UNITY_SIGNALS(2),
    PARTNER_SIGNALS(3);


    /* renamed from: i, reason: collision with root package name */
    private static final hj2<hn1> f6354i = new hj2<hn1>() { // from class: com.google.android.gms.internal.ads.fl1
    };

    /* renamed from: k, reason: collision with root package name */
    private final int f6356k;

    hn1(int i2) {
        this.f6356k = i2;
    }

    public static hn1 a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_PROTO;
        }
        if (i2 == 1) {
            return AFMA_SIGNALS;
        }
        if (i2 == 2) {
            return UNITY_SIGNALS;
        }
        if (i2 != 3) {
            return null;
        }
        return PARTNER_SIGNALS;
    }

    public static ij2 b() {
        return gm1.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + hn1.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f6356k + " name=" + name() + '>';
    }
}