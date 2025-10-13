package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public enum o53 implements gj2 {
    UNSPECIFIED(0),
    IN_MEMORY(1);


    /* renamed from: g, reason: collision with root package name */
    private static final hj2<o53> f7912g = new hj2<o53>() { // from class: com.google.android.gms.internal.ads.m53
    };

    /* renamed from: i, reason: collision with root package name */
    private final int f7914i;

    o53(int i2) {
        this.f7914i = i2;
    }

    public static o53 a(int i2) {
        if (i2 == 0) {
            return UNSPECIFIED;
        }
        if (i2 != 1) {
            return null;
        }
        return IN_MEMORY;
    }

    public static ij2 b() {
        return n53.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + o53.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f7914i + " name=" + name() + '>';
    }

    public final int zza() {
        return this.f7914i;
    }
}