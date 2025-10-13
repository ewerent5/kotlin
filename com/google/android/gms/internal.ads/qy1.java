package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public enum qy1 implements gj2 {
    EVENT_TYPE_UNKNOWN(0),
    BLOCKED_IMPRESSION(1);


    /* renamed from: g, reason: collision with root package name */
    private static final hj2<qy1> f8533g = new hj2<qy1>() { // from class: com.google.android.gms.internal.ads.oy1
    };

    /* renamed from: i, reason: collision with root package name */
    private final int f8535i;

    qy1(int i2) {
        this.f8535i = i2;
    }

    public static qy1 a(int i2) {
        if (i2 == 0) {
            return EVENT_TYPE_UNKNOWN;
        }
        if (i2 != 1) {
            return null;
        }
        return BLOCKED_IMPRESSION;
    }

    public static ij2 b() {
        return py1.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + qy1.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f8535i + " name=" + name() + '>';
    }

    public final int zza() {
        return this.f8535i;
    }
}