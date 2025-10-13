package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class j7<T> {
    public final T a;

    /* renamed from: b, reason: collision with root package name */
    public final gv2 f6700b;

    /* renamed from: c, reason: collision with root package name */
    public final ma f6701c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6702d;

    private j7(ma maVar) {
        this.f6702d = false;
        this.a = null;
        this.f6700b = null;
        this.f6701c = maVar;
    }

    private j7(T t, gv2 gv2Var) {
        this.f6702d = false;
        this.a = t;
        this.f6700b = gv2Var;
        this.f6701c = null;
    }

    public static <T> j7<T> a(T t, gv2 gv2Var) {
        return new j7<>(t, gv2Var);
    }

    public static <T> j7<T> b(ma maVar) {
        return new j7<>(maVar);
    }

    public final boolean c() {
        return this.f6701c == null;
    }
}