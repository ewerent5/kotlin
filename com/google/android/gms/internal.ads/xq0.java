package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zzs;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class xq0 extends s60 {

    /* renamed from: i, reason: collision with root package name */
    private final Context f10224i;

    /* renamed from: j, reason: collision with root package name */
    private final WeakReference<ew> f10225j;

    /* renamed from: k, reason: collision with root package name */
    private final rj0 f10226k;

    /* renamed from: l, reason: collision with root package name */
    private final eh0 f10227l;

    /* renamed from: m, reason: collision with root package name */
    private final bb0 f10228m;
    private final jc0 n;
    private final n70 o;
    private final xm p;
    private final xx1 q;
    private boolean r;

    xq0(r60 r60Var, Context context, ew ewVar, rj0 rj0Var, eh0 eh0Var, bb0 bb0Var, jc0 jc0Var, n70 n70Var, xo1 xo1Var, xx1 xx1Var) {
        super(r60Var);
        this.r = false;
        this.f10224i = context;
        this.f10226k = rj0Var;
        this.f10225j = new WeakReference<>(ewVar);
        this.f10227l = eh0Var;
        this.f10228m = bb0Var;
        this.n = jc0Var;
        this.o = n70Var;
        this.q = xx1Var;
        tm tmVar = xo1Var.f10207l;
        this.p = new sn(tmVar != null ? tmVar.f9199e : "", tmVar != null ? tmVar.f9200f : 1);
    }

    public final void finalize() throws Throwable {
        try {
            ew ewVar = this.f10225j.get();
            if (((Boolean) c.c().b(w3.N4)).booleanValue()) {
                if (!this.r && ewVar != null) {
                    qr.f8450e.execute(wq0.a(ewVar));
                }
            } else if (ewVar != null) {
                ewVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.content.Context] */
    public final boolean g(boolean z, Activity activity) {
        if (((Boolean) c.c().b(w3.r0)).booleanValue()) {
            zzs.zzc();
            if (zzr.zzI(this.f10224i)) {
                er.zzi("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.f10228m.zzd();
                if (((Boolean) c.c().b(w3.s0)).booleanValue()) {
                    this.q.a(this.a.f7035b.f6562b.f4967b);
                }
                return false;
            }
        }
        if (this.r) {
            er.zzi("The rewarded ad have been showed.");
            this.f10228m.e0(mq1.d(10, null, null));
            return false;
        }
        this.r = true;
        this.f10227l.zza();
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.f10224i;
        }
        try {
            this.f10226k.a(z, activity2);
            this.f10227l.K0();
            return true;
        } catch (qj0 e2) {
            this.f10228m.r0(e2);
            return false;
        }
    }

    public final boolean h() {
        return this.r;
    }

    public final xm i() {
        return this.p;
    }

    public final boolean j() {
        return this.o.a();
    }

    public final boolean k() {
        ew ewVar = this.f10225j.get();
        return (ewVar == null || ewVar.a0()) ? false : true;
    }

    public final Bundle l() {
        return this.n.K0();
    }
}