package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
final class o9 extends j {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ t9 f11094e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ p9 f11095f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o9(p9 p9Var, z5 z5Var, t9 t9Var) {
        super(z5Var);
        this.f11095f = p9Var;
        this.f11094e = t9Var;
    }

    @Override // com.google.android.gms.measurement.internal.j
    public final void b() {
        this.f11095f.t();
        this.f11095f.zzq().I().a("Starting upload from DelayedRunnable");
        this.f11094e.e0();
    }
}