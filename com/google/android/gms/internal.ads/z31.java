package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzs;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class z31 implements rj0 {
    private final kr a;

    /* renamed from: b, reason: collision with root package name */
    private final g52<b40> f10545b;

    /* renamed from: c, reason: collision with root package name */
    private final xo1 f10546c;

    /* renamed from: d, reason: collision with root package name */
    private final ew f10547d;

    /* renamed from: e, reason: collision with root package name */
    private final qp1 f10548e;

    /* renamed from: f, reason: collision with root package name */
    private final ea f10549f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f10550g;

    z31(kr krVar, g52<b40> g52Var, xo1 xo1Var, ew ewVar, qp1 qp1Var, boolean z, ea eaVar) {
        this.a = krVar;
        this.f10545b = g52Var;
        this.f10546c = xo1Var;
        this.f10547d = ewVar;
        this.f10548e = qp1Var;
        this.f10550g = z;
        this.f10549f = eaVar;
    }

    @Override // com.google.android.gms.internal.ads.rj0
    public final void a(boolean z, Context context) throws NumberFormatException {
        int i2;
        b40 b40Var = (b40) y42.q(this.f10545b);
        this.f10547d.w0(true);
        zzj zzjVar = new zzj(this.f10550g ? this.f10549f.c(true) : true, true, this.f10550g ? this.f10549f.d() : false, this.f10550g ? this.f10549f.e() : 0.0f, -1, z, this.f10546c.J, false);
        zzs.zzb();
        gj0 gj0VarJ = b40Var.j();
        ew ewVar = this.f10547d;
        int i3 = this.f10546c.L;
        if (i3 == -1) {
            y93 y93Var = this.f10548e.f8433j;
            if (y93Var != null) {
                int i4 = y93Var.f10399e;
                if (i4 == 1) {
                    i2 = 7;
                } else if (i4 == 2) {
                    i2 = 6;
                }
            }
            er.zzd("Error setting app open orientation; no targeting orientation available.");
            i3 = this.f10546c.L;
            i2 = i3;
        } else {
            i2 = i3;
        }
        kr krVar = this.a;
        xo1 xo1Var = this.f10546c;
        String str = xo1Var.A;
        cp1 cp1Var = xo1Var.r;
        zzn.zza(context, new AdOverlayInfoParcel((c93) null, gj0VarJ, (zzw) null, ewVar, i2, krVar, str, zzjVar, cp1Var.f5346b, cp1Var.a, this.f10548e.f8429f), true);
    }
}