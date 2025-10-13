package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class x3 {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f11327b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f11328c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ v3 f11329d;

    x3(v3 v3Var, int i2, boolean z, boolean z2) {
        this.f11329d = v3Var;
        this.a = i2;
        this.f11327b = z;
        this.f11328c = z2;
    }

    public final void a(String str) {
        this.f11329d.w(this.a, this.f11327b, this.f11328c, str, null, null, null);
    }

    public final void b(String str, Object obj) {
        this.f11329d.w(this.a, this.f11327b, this.f11328c, str, obj, null, null);
    }

    public final void c(String str, Object obj, Object obj2) {
        this.f11329d.w(this.a, this.f11327b, this.f11328c, str, obj, obj2, null);
    }

    public final void d(String str, Object obj, Object obj2, Object obj3) {
        this.f11329d.w(this.a, this.f11327b, this.f11328c, str, obj, obj2, obj3);
    }
}