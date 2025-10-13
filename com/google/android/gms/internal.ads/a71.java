package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class a71 implements u42 {
    final /* synthetic */ long a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f4851b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ xo1 f4852c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ap1 f4853d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ b71 f4854e;

    a71(b71 b71Var, long j2, String str, xo1 xo1Var, ap1 ap1Var) {
        this.f4854e = b71Var;
        this.a = j2;
        this.f4851b = str;
        this.f4852c = xo1Var;
        this.f4853d = ap1Var;
    }

    @Override // com.google.android.gms.internal.ads.u42
    public final void zza(Throwable th) {
        g93 g93Var;
        long jC = this.f4854e.a.c() - this.a;
        int i2 = th instanceof TimeoutException ? 2 : th instanceof p61 ? 3 : th instanceof CancellationException ? 4 : th instanceof vp1 ? 5 : ((th instanceof tx0) && mq1.a(th).f6091e == 3) ? 1 : 6;
        b71.d(this.f4854e, this.f4851b, i2, jC, this.f4852c.a0);
        if (this.f4854e.f5081d) {
            this.f4854e.f5079b.a(this.f4853d, this.f4852c, i2, th instanceof o31 ? (o31) th : null, jC);
        }
        if (((Boolean) c.c().b(w3.x5)).booleanValue()) {
            g93 g93VarA = mq1.a(th);
            int i3 = g93VarA.f6091e;
            if ((i3 == 3 || i3 == 0) && (g93Var = g93VarA.f6094h) != null && !g93Var.f6093g.equals(MobileAds.ERROR_DOMAIN)) {
                g93VarA = mq1.a(new o31(13, g93VarA.f6094h));
            }
            this.f4854e.f5082e.b(this.f4852c, jC, g93VarA);
        }
    }

    @Override // com.google.android.gms.internal.ads.u42
    public final void zzb(Object obj) {
        long jC = this.f4854e.a.c() - this.a;
        b71.d(this.f4854e, this.f4851b, 0, jC, this.f4852c.a0);
        if (this.f4854e.f5081d) {
            this.f4854e.f5079b.a(this.f4853d, this.f4852c, 0, null, jC);
        }
        if (((Boolean) c.c().b(w3.x5)).booleanValue()) {
            this.f4854e.f5082e.b(this.f4852c, jC, null);
        }
    }
}