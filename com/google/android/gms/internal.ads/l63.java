package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public enum l63 implements gj2 {
    PLATFORM_UNSPECIFIED(0),
    IOS(1),
    ANDROID(2);


    /* renamed from: h, reason: collision with root package name */
    private static final hj2<l63> f7206h = new hj2<l63>() { // from class: com.google.android.gms.internal.ads.j63
    };

    /* renamed from: j, reason: collision with root package name */
    private final int f7208j;

    l63(int i2) {
        this.f7208j = i2;
    }

    public static l63 a(int i2) {
        if (i2 == 0) {
            return PLATFORM_UNSPECIFIED;
        }
        if (i2 == 1) {
            return IOS;
        }
        if (i2 != 2) {
            return null;
        }
        return ANDROID;
    }

    public static ij2 b() {
        return k63.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + l63.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f7208j + " name=" + name() + '>';
    }
}