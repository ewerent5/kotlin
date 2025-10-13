package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public enum l83 implements gj2 {
    VIDEO_ERROR_CODE_UNSPECIFIED(0),
    OPENGL_RENDERING_FAILED(1),
    CACHE_LOAD_FAILED(2),
    ANDROID_TARGET_API_TOO_LOW(3);


    /* renamed from: i, reason: collision with root package name */
    private static final hj2<l83> f7218i = new hj2<l83>() { // from class: com.google.android.gms.internal.ads.j83
    };

    /* renamed from: k, reason: collision with root package name */
    private final int f7220k;

    l83(int i2) {
        this.f7220k = i2;
    }

    public static l83 a(int i2) {
        if (i2 == 0) {
            return VIDEO_ERROR_CODE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return OPENGL_RENDERING_FAILED;
        }
        if (i2 == 2) {
            return CACHE_LOAD_FAILED;
        }
        if (i2 != 3) {
            return null;
        }
        return ANDROID_TARGET_API_TOO_LOW;
    }

    public static ij2 b() {
        return k83.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + l83.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f7220k + " name=" + name() + '>';
    }
}