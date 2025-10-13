package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
final class u5 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f11270e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f11271f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ String f11272g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ long f11273h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ e5 f11274i;

    u5(e5 e5Var, String str, String str2, String str3, long j2) {
        this.f11274i = e5Var;
        this.f11270e = str;
        this.f11271f = str2;
        this.f11272g = str3;
        this.f11273h = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f11270e;
        if (str == null) {
            this.f11274i.f10830e.h0().J().M(this.f11271f, null);
        } else {
            this.f11274i.f10830e.h0().J().M(this.f11271f, new q7(this.f11272g, str, this.f11273h));
        }
    }
}