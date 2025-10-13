package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class hk2 {
    private static final gk2 a;

    /* renamed from: b, reason: collision with root package name */
    private static final gk2 f6341b;

    static {
        gk2 gk2Var;
        try {
            gk2Var = (gk2) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            gk2Var = null;
        }
        a = gk2Var;
        f6341b = new gk2();
    }

    static gk2 a() {
        return a;
    }

    static gk2 b() {
        return f6341b;
    }
}