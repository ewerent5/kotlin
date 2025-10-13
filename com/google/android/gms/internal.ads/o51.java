package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzs;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class o51 implements rj0 {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final kr f7903b;

    /* renamed from: c, reason: collision with root package name */
    private final g52<mi0> f7904c;

    /* renamed from: d, reason: collision with root package name */
    private final xo1 f7905d;

    /* renamed from: e, reason: collision with root package name */
    private final ew f7906e;

    /* renamed from: f, reason: collision with root package name */
    private final qp1 f7907f;

    /* renamed from: g, reason: collision with root package name */
    private final ea f7908g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f7909h;

    /* synthetic */ o51(Context context, kr krVar, g52 g52Var, xo1 xo1Var, ew ewVar, qp1 qp1Var, boolean z, ea eaVar, n51 n51Var) {
        this.a = context;
        this.f7903b = krVar;
        this.f7904c = g52Var;
        this.f7905d = xo1Var;
        this.f7906e = ewVar;
        this.f7907f = qp1Var;
        this.f7908g = eaVar;
        this.f7909h = z;
    }

    @Override // com.google.android.gms.internal.ads.rj0
    public final void a(boolean z, Context context) throws NumberFormatException {
        mi0 mi0Var = (mi0) y42.q(this.f7904c);
        this.f7906e.w0(true);
        boolean zC = this.f7909h ? this.f7908g.c(false) : false;
        zzs.zzc();
        zzj zzjVar = new zzj(zC, zzr.zzK(this.a), this.f7909h ? this.f7908g.d() : false, this.f7909h ? this.f7908g.e() : 0.0f, -1, z, this.f7905d.J, false);
        zzs.zzb();
        gj0 gj0VarJ = mi0Var.j();
        ew ewVar = this.f7906e;
        xo1 xo1Var = this.f7905d;
        int i2 = xo1Var.L;
        kr krVar = this.f7903b;
        String str = xo1Var.A;
        cp1 cp1Var = xo1Var.r;
        zzn.zza(context, new AdOverlayInfoParcel((c93) null, gj0VarJ, (zzw) null, ewVar, i2, krVar, str, zzjVar, cp1Var.f5346b, cp1Var.a, this.f7907f.f8429f), true);
    }
}