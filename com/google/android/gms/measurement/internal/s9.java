package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
final class s9 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ aa f11214e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ t9 f11215f;

    s9(t9 t9Var, aa aaVar) {
        this.f11215f = t9Var;
        this.f11214e = aaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11215f.q(this.f11214e);
        this.f11215f.g();
    }
}