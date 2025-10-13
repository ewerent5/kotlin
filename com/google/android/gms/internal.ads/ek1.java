package com.google.android.gms.internal.ads;

import ch.qos.logback.core.CoreConstants;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public enum ek1 implements gj2 {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_FAILURE(2),
    ENUM_UNKNOWN(CoreConstants.MILLIS_IN_ONE_SECOND);


    /* renamed from: i, reason: collision with root package name */
    private static final hj2<ek1> f5655i = new hj2<ek1>() { // from class: com.google.android.gms.internal.ads.ci1
    };

    /* renamed from: k, reason: collision with root package name */
    private final int f5657k;

    ek1(int i2) {
        this.f5657k = i2;
    }

    public static ek1 a(int i2) {
        if (i2 == 0) {
            return ENUM_FALSE;
        }
        if (i2 == 1) {
            return ENUM_TRUE;
        }
        if (i2 == 2) {
            return ENUM_FAILURE;
        }
        if (i2 != 1000) {
            return null;
        }
        return ENUM_UNKNOWN;
    }

    public static ij2 b() {
        return dj1.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + ek1.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f5657k + " name=" + name() + '>';
    }

    public final int zza() {
        return this.f5657k;
    }
}