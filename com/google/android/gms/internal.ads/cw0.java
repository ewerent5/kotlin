package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class cw0 implements mv0 {
    private final long a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5378b;

    /* renamed from: c, reason: collision with root package name */
    private final rv0 f5379c;

    /* renamed from: d, reason: collision with root package name */
    private final oo1 f5380d;

    cw0(long j2, Context context, rv0 rv0Var, cy cyVar, String str) {
        this.a = j2;
        this.f5378b = str;
        this.f5379c = rv0Var;
        qo1 qo1VarW = cyVar.w();
        qo1VarW.n(context);
        qo1VarW.c(str);
        this.f5380d = qo1VarW.zza().zzb();
    }

    @Override // com.google.android.gms.internal.ads.mv0
    public final void a(m93 m93Var) {
        try {
            this.f5380d.w2(m93Var, new aw0(this));
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.mv0
    public final void zzb() {
        try {
            this.f5380d.e3(new bw0(this));
            this.f5380d.k(e.c.b.b.b.d.m4(null));
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.mv0
    public final void zzc() {
    }
}