package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zzs;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class k40 extends s60 {

    /* renamed from: i */
    private final ew f6950i;

    /* renamed from: j */
    private final int f6951j;

    /* renamed from: k */
    private final Context f6952k;

    /* renamed from: l */
    private final r30 f6953l;

    /* renamed from: m */
    private final rj0 f6954m;
    private boolean n;

    k40(r60 r60Var, Context context, ew ewVar, int i2, r30 r30Var, rj0 rj0Var) {
        super(r60Var);
        this.n = false;
        this.f6950i = ewVar;
        this.f6952k = context;
        this.f6951j = i2;
        this.f6953l = r30Var;
        this.f6954m = rj0Var;
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void b() {
        super.b();
        ew ewVar = this.f6950i;
        if (ewVar != null) {
            ewVar.destroy();
        }
    }

    public final void g(j33 j33Var) {
        ew ewVar = this.f6950i;
        if (ewVar != null) {
            ewVar.o0(j33Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [android.content.Context] */
    public final void h(Activity activity, x33 x33Var, boolean z) {
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.f6952k;
        }
        if (((Boolean) c.c().b(w3.r0)).booleanValue()) {
            zzs.zzc();
            if (zzr.zzI(activity2)) {
                er.zzi("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                x33Var.F(mq1.d(11, null, null));
                if (((Boolean) c.c().b(w3.s0)).booleanValue()) {
                    new xx1(activity2.getApplicationContext(), zzs.zzq().zza()).a(this.a.f7035b.f6562b.f4967b);
                    return;
                }
                return;
            }
        }
        if (this.n) {
            er.zzi("App open interstitial ad is already visible.");
        }
        if (this.n) {
            return;
        }
        try {
            this.f6954m.a(z, activity2);
            this.n = true;
        } catch (qj0 e2) {
            x33Var.F(mq1.a(e2));
        }
    }

    public final int i() {
        return this.f6951j;
    }

    public final void j(long j2, int i2) {
        this.f6953l.a(j2, i2);
    }
}