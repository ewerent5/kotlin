package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzs;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class h11 implements bh0 {

    /* renamed from: g, reason: collision with root package name */
    private final String f6266g;

    /* renamed from: h, reason: collision with root package name */
    private final cu1 f6267h;

    /* renamed from: e, reason: collision with root package name */
    private boolean f6264e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f6265f = false;

    /* renamed from: i, reason: collision with root package name */
    private final zzg f6268i = zzs.zzg().l();

    public h11(String str, cu1 cu1Var) {
        this.f6266g = str;
        this.f6267h = cu1Var;
    }

    private final bu1 a(String str) {
        String str2 = this.f6268i.zzB() ? "" : this.f6266g;
        bu1 bu1VarA = bu1.a(str);
        bu1VarA.c("tms", Long.toString(zzs.zzj().c(), 10));
        bu1VarA.c("tid", str2);
        return bu1VarA;
    }

    @Override // com.google.android.gms.internal.ads.bh0
    public final void c(String str) {
        cu1 cu1Var = this.f6267h;
        bu1 bu1VarA = a("adapter_init_finished");
        bu1VarA.c("ancn", str);
        cu1Var.b(bu1VarA);
    }

    @Override // com.google.android.gms.internal.ads.bh0
    public final void j0(String str, String str2) {
        cu1 cu1Var = this.f6267h;
        bu1 bu1VarA = a("adapter_init_finished");
        bu1VarA.c("ancn", str);
        bu1VarA.c("rqe", str2);
        cu1Var.b(bu1VarA);
    }

    @Override // com.google.android.gms.internal.ads.bh0
    public final void zza(String str) {
        cu1 cu1Var = this.f6267h;
        bu1 bu1VarA = a("adapter_init_started");
        bu1VarA.c("ancn", str);
        cu1Var.b(bu1VarA);
    }

    @Override // com.google.android.gms.internal.ads.bh0
    public final synchronized void zzd() {
        if (this.f6264e) {
            return;
        }
        this.f6267h.b(a("init_started"));
        this.f6264e = true;
    }

    @Override // com.google.android.gms.internal.ads.bh0
    public final synchronized void zze() {
        if (this.f6265f) {
            return;
        }
        this.f6267h.b(a("init_finished"));
        this.f6265f = true;
    }
}