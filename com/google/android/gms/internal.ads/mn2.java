package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public enum mn2 implements gj2 {
    AD_RESOURCE_UNKNOWN(0),
    AD_RESOURCE_CREATIVE(1),
    AD_RESOURCE_POST_CLICK(2),
    AD_RESOURCE_AUTO_CLICK_DESTINATION(3);


    /* renamed from: i, reason: collision with root package name */
    private static final hj2<mn2> f7514i = new hj2<mn2>() { // from class: com.google.android.gms.internal.ads.kn2
    };

    /* renamed from: k, reason: collision with root package name */
    private final int f7516k;

    mn2(int i2) {
        this.f7516k = i2;
    }

    public static mn2 a(int i2) {
        if (i2 == 0) {
            return AD_RESOURCE_UNKNOWN;
        }
        if (i2 == 1) {
            return AD_RESOURCE_CREATIVE;
        }
        if (i2 == 2) {
            return AD_RESOURCE_POST_CLICK;
        }
        if (i2 != 3) {
            return null;
        }
        return AD_RESOURCE_AUTO_CLICK_DESTINATION;
    }

    public static ij2 b() {
        return ln2.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + mn2.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f7516k + " name=" + name() + '>';
    }

    public final int zza() {
        return this.f7516k;
    }
}