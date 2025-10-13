package com.google.android.gms.internal.ads;

import ch.qos.logback.core.CoreConstants;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public enum p63 implements gj2 {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_UNKNOWN(CoreConstants.MILLIS_IN_ONE_SECOND);


    /* renamed from: h, reason: collision with root package name */
    private static final hj2<p63> f8092h = new hj2<p63>() { // from class: com.google.android.gms.internal.ads.n63
    };

    /* renamed from: j, reason: collision with root package name */
    private final int f8094j;

    p63(int i2) {
        this.f8094j = i2;
    }

    public static p63 a(int i2) {
        if (i2 == 0) {
            return ENUM_FALSE;
        }
        if (i2 == 1) {
            return ENUM_TRUE;
        }
        if (i2 != 1000) {
            return null;
        }
        return ENUM_UNKNOWN;
    }

    public static ij2 b() {
        return o63.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + p63.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f8094j + " name=" + name() + '>';
    }

    public final int zza() {
        return this.f8094j;
    }
}