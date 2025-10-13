package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zzs;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class n20 implements qa0, dc0, ib0, c93, eb0 {

    /* renamed from: e, reason: collision with root package name */
    private final Context f7628e;

    /* renamed from: f, reason: collision with root package name */
    private final Executor f7629f;

    /* renamed from: g, reason: collision with root package name */
    private final ScheduledExecutorService f7630g;

    /* renamed from: h, reason: collision with root package name */
    private final kp1 f7631h;

    /* renamed from: i, reason: collision with root package name */
    private final xo1 f7632i;

    /* renamed from: j, reason: collision with root package name */
    private final su1 f7633j;

    /* renamed from: k, reason: collision with root package name */
    private final aq1 f7634k;

    /* renamed from: l, reason: collision with root package name */
    private final ip2 f7635l;

    /* renamed from: m, reason: collision with root package name */
    private final w4 f7636m;
    private final WeakReference<View> n;

    @GuardedBy("this")
    private boolean o;

    @GuardedBy("this")
    private boolean p;
    private final y4 q;

    public n20(Context context, Executor executor, ScheduledExecutorService scheduledExecutorService, kp1 kp1Var, xo1 xo1Var, su1 su1Var, aq1 aq1Var, View view, ip2 ip2Var, w4 w4Var, y4 y4Var, byte[] bArr) {
        this.f7628e = context;
        this.f7629f = executor;
        this.f7630g = scheduledExecutorService;
        this.f7631h = kp1Var;
        this.f7632i = xo1Var;
        this.f7633j = su1Var;
        this.f7634k = aq1Var;
        this.f7635l = ip2Var;
        this.n = new WeakReference<>(view);
        this.f7636m = w4Var;
        this.q = y4Var;
    }

    @Override // com.google.android.gms.internal.ads.eb0
    public final void I(g93 g93Var) {
        if (((Boolean) c.c().b(w3.Z0)).booleanValue()) {
            this.f7634k.a(this.f7633j.a(this.f7631h, this.f7632i, su1.d(2, g93Var.f6091e, this.f7632i.n)));
        }
    }

    @Override // com.google.android.gms.internal.ads.ib0
    public final synchronized void b() {
        if (this.p) {
            return;
        }
        String strZzk = ((Boolean) c.c().b(w3.S1)).booleanValue() ? this.f7635l.b().zzk(this.f7628e, this.n.get(), null) : null;
        if (!(((Boolean) c.c().b(w3.i0)).booleanValue() && this.f7631h.f7035b.f6562b.f4972g) && k5.f6962g.e().booleanValue()) {
            y42.o((p42) y42.g(p42.D(y42.a(null)), ((Long) c.c().b(w3.G0)).longValue(), TimeUnit.MILLISECONDS, this.f7630g), new m20(this, strZzk), this.f7629f);
            this.p = true;
            return;
        }
        aq1 aq1Var = this.f7634k;
        su1 su1Var = this.f7633j;
        kp1 kp1Var = this.f7631h;
        xo1 xo1Var = this.f7632i;
        aq1Var.a(su1Var.b(kp1Var, xo1Var, false, strZzk, null, xo1Var.f10199d));
        this.p = true;
    }

    @Override // com.google.android.gms.internal.ads.dc0
    public final synchronized void b0() {
        if (this.o) {
            ArrayList arrayList = new ArrayList(this.f7632i.f10199d);
            arrayList.addAll(this.f7632i.f10201f);
            this.f7634k.a(this.f7633j.b(this.f7631h, this.f7632i, true, null, null, arrayList));
        } else {
            aq1 aq1Var = this.f7634k;
            su1 su1Var = this.f7633j;
            kp1 kp1Var = this.f7631h;
            xo1 xo1Var = this.f7632i;
            aq1Var.a(su1Var.a(kp1Var, xo1Var, xo1Var.f10208m));
            aq1 aq1Var2 = this.f7634k;
            su1 su1Var2 = this.f7633j;
            kp1 kp1Var2 = this.f7631h;
            xo1 xo1Var2 = this.f7632i;
            aq1Var2.a(su1Var2.a(kp1Var2, xo1Var2, xo1Var2.f10201f));
        }
        this.o = true;
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void d(gm gmVar, String str, String str2) {
        aq1 aq1Var = this.f7634k;
        su1 su1Var = this.f7633j;
        xo1 xo1Var = this.f7632i;
        aq1Var.a(su1Var.c(xo1Var, xo1Var.f10203h, gmVar));
    }

    @Override // com.google.android.gms.internal.ads.c93
    public final void onAdClicked() {
        if (!(((Boolean) c.c().b(w3.i0)).booleanValue() && this.f7631h.f7035b.f6562b.f4972g) && k5.f6959d.e().booleanValue()) {
            y42.o(y42.e(p42.D(this.f7636m.b()), Throwable.class, k20.a, qr.f8451f), new l20(this), this.f7629f);
            return;
        }
        aq1 aq1Var = this.f7634k;
        su1 su1Var = this.f7633j;
        kp1 kp1Var = this.f7631h;
        xo1 xo1Var = this.f7632i;
        List<String> listA = su1Var.a(kp1Var, xo1Var, xo1Var.f10198c);
        zzs.zzc();
        aq1Var.b(listA, true == zzr.zzH(this.f7628e) ? 2 : 1);
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void zzd() {
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void zzg() {
        aq1 aq1Var = this.f7634k;
        su1 su1Var = this.f7633j;
        kp1 kp1Var = this.f7631h;
        xo1 xo1Var = this.f7632i;
        aq1Var.a(su1Var.a(kp1Var, xo1Var, xo1Var.f10202g));
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void zzh() {
        aq1 aq1Var = this.f7634k;
        su1 su1Var = this.f7633j;
        kp1 kp1Var = this.f7631h;
        xo1 xo1Var = this.f7632i;
        aq1Var.a(su1Var.a(kp1Var, xo1Var, xo1Var.f10204i));
    }
}