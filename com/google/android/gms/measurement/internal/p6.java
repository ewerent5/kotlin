package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class p6 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f11109e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f11110f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ Object f11111g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ long f11112h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ i6 f11113i;

    p6(i6 i6Var, String str, String str2, Object obj, long j2) {
        this.f11113i = i6Var;
        this.f11109e = str;
        this.f11110f = str2;
        this.f11111g = obj;
        this.f11112h = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11113i.U(this.f11109e, this.f11110f, this.f11111g, this.f11112h);
    }
}