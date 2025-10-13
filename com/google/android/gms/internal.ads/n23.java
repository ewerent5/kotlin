package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class n23 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final d1 f7640e;

    /* renamed from: f, reason: collision with root package name */
    private final j7 f7641f;

    /* renamed from: g, reason: collision with root package name */
    private final Runnable f7642g;

    public n23(d1 d1Var, j7 j7Var, Runnable runnable) {
        this.f7640e = d1Var;
        this.f7641f = j7Var;
        this.f7642g = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7640e.zzl();
        if (this.f7641f.c()) {
            this.f7640e.zzs(this.f7641f.a);
        } else {
            this.f7640e.zzt(this.f7641f.f6701c);
        }
        if (this.f7641f.f6702d) {
            this.f7640e.zzc("intermediate-response");
        } else {
            this.f7640e.zzd("done");
        }
        Runnable runnable = this.f7642g;
        if (runnable != null) {
            runnable.run();
        }
    }
}