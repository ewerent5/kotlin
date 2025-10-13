package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public enum aq0 implements gj2 {
    ENUM_SIGNAL_SOURCE_UNKNOWN(0),
    ENUM_SIGNAL_SOURCE_DISABLE(1),
    ENUM_SIGNAL_SOURCE_ADSHIELD(2),
    ENUM_SIGNAL_SOURCE_GASS(3),
    ENUM_SIGNAL_SOURCE_CALLER_PROVIDED(4);


    /* renamed from: j, reason: collision with root package name */
    private static final hj2<aq0> f4979j = new hj2<aq0>() { // from class: com.google.android.gms.internal.ads.yn0
    };

    /* renamed from: l, reason: collision with root package name */
    private final int f4981l;

    aq0(int i2) {
        this.f4981l = i2;
    }

    public static aq0 a(int i2) {
        if (i2 == 0) {
            return ENUM_SIGNAL_SOURCE_UNKNOWN;
        }
        if (i2 == 1) {
            return ENUM_SIGNAL_SOURCE_DISABLE;
        }
        if (i2 == 2) {
            return ENUM_SIGNAL_SOURCE_ADSHIELD;
        }
        if (i2 == 3) {
            return ENUM_SIGNAL_SOURCE_GASS;
        }
        if (i2 != 4) {
            return null;
        }
        return ENUM_SIGNAL_SOURCE_CALLER_PROVIDED;
    }

    public static ij2 b() {
        return zo0.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + aq0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f4981l + " name=" + name() + '>';
    }
}