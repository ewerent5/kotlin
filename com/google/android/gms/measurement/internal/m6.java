package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class m6 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ boolean f11030e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ i6 f11031f;

    m6(i6 i6Var, boolean z) {
        this.f11031f = i6Var;
        this.f11030e = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zK = this.f11031f.a.k();
        boolean zO = this.f11031f.a.O();
        this.f11031f.a.j(this.f11030e);
        if (zO == this.f11030e) {
            this.f11031f.a.zzq().I().b("Default data collection state already set to", Boolean.valueOf(this.f11030e));
        }
        if (this.f11031f.a.k() == zK || this.f11031f.a.k() != this.f11031f.a.O()) {
            this.f11031f.a.zzq().F().c("Default data collection is different than actual status", Boolean.valueOf(this.f11030e), Boolean.valueOf(zK));
        }
        this.f11031f.i0();
    }
}