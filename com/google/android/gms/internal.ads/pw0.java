package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzs;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class pw0 extends ac {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Object f8272e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f8273f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ long f8274g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ wr f8275h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ qw0 f8276i;

    pw0(qw0 qw0Var, Object obj, String str, long j2, wr wrVar) {
        this.f8276i = qw0Var;
        this.f8272e = obj;
        this.f8273f = str;
        this.f8274g = j2;
        this.f8275h = wrVar;
    }

    @Override // com.google.android.gms.internal.ads.bc
    public final void b(String str) {
        synchronized (this.f8272e) {
            this.f8276i.u(this.f8273f, false, str, (int) (zzs.zzj().c() - this.f8274g));
            this.f8276i.f8510l.c(this.f8273f, "error");
            this.f8276i.o.j0(this.f8273f, "error");
            this.f8275h.zzc(Boolean.FALSE);
        }
    }

    @Override // com.google.android.gms.internal.ads.bc
    public final void zze() {
        synchronized (this.f8272e) {
            this.f8276i.u(this.f8273f, true, "", (int) (zzs.zzj().c() - this.f8274g));
            this.f8276i.f8510l.b(this.f8273f);
            this.f8276i.o.c(this.f8273f);
            this.f8275h.zzc(Boolean.TRUE);
        }
    }
}