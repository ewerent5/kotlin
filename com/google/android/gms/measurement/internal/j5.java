package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
final class j5 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ wa f10964e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ e5 f10965f;

    j5(e5 e5Var, wa waVar) {
        this.f10965f = e5Var;
        this.f10964e = waVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10965f.f10830e.f0();
        if (this.f10964e.f11320g.c() == null) {
            this.f10965f.f10830e.O(this.f10964e);
        } else {
            this.f10965f.f10830e.t(this.f10964e);
        }
    }
}