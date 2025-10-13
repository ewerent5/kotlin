package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public enum p73 implements gj2 {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);


    /* renamed from: k, reason: collision with root package name */
    private static final hj2<p73> f8111k = new hj2<p73>() { // from class: com.google.android.gms.internal.ads.n73
    };

    /* renamed from: m, reason: collision with root package name */
    private final int f8113m;

    p73(int i2) {
        this.f8113m = i2;
    }

    public static p73 a(int i2) {
        if (i2 == 0) {
            return UNSPECIFIED;
        }
        if (i2 == 1) {
            return CONNECTING;
        }
        if (i2 == 2) {
            return CONNECTED;
        }
        if (i2 == 3) {
            return DISCONNECTING;
        }
        if (i2 == 4) {
            return DISCONNECTED;
        }
        if (i2 != 5) {
            return null;
        }
        return SUSPENDED;
    }

    public static ij2 b() {
        return o73.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + p73.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f8113m + " name=" + name() + '>';
    }

    public final int zza() {
        return this.f8113m;
    }
}