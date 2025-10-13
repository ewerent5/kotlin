package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class yv0 implements mv0 {
    private final long a;

    /* renamed from: b, reason: collision with root package name */
    private final eb1 f10493b;

    yv0(long j2, Context context, rv0 rv0Var, cy cyVar, String str) {
        this.a = j2;
        cn1 cn1VarT = cyVar.t();
        cn1VarT.a(context);
        cn1VarT.b(new r93());
        cn1VarT.d(str);
        eb1 eb1VarZza = cn1VarT.zza().zza();
        this.f10493b = eb1VarZza;
        eb1VarZza.zzh(new xv0(this, rv0Var));
    }

    @Override // com.google.android.gms.internal.ads.mv0
    public final void a(m93 m93Var) {
        this.f10493b.zze(m93Var);
    }

    @Override // com.google.android.gms.internal.ads.mv0
    public final void zzb() {
        this.f10493b.zzQ(e.c.b.b.b.d.m4(null));
    }

    @Override // com.google.android.gms.internal.ads.mv0
    public final void zzc() {
        this.f10493b.zzc();
    }
}