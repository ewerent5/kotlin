package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class li0 extends s60 {

    /* renamed from: i */
    private final Context f7252i;

    /* renamed from: j */
    private final WeakReference<ew> f7253j;

    /* renamed from: k */
    private final eh0 f7254k;

    /* renamed from: l */
    private final rj0 f7255l;

    /* renamed from: m */
    private final n70 f7256m;
    private final xx1 n;
    private final bb0 o;
    private boolean p;

    li0(r60 r60Var, Context context, @Nullable ew ewVar, eh0 eh0Var, rj0 rj0Var, n70 n70Var, xx1 xx1Var, bb0 bb0Var) {
        super(r60Var);
        this.p = false;
        this.f7252i = context;
        this.f7253j = new WeakReference<>(ewVar);
        this.f7254k = eh0Var;
        this.f7255l = rj0Var;
        this.f7256m = n70Var;
        this.n = xx1Var;
        this.o = bb0Var;
    }

    public final void finalize() throws Throwable {
        try {
            ew ewVar = this.f7253j.get();
            if (((Boolean) c.c().b(w3.N4)).booleanValue()) {
                if (!this.p && ewVar != null) {
                    qr.f8450e.execute(ki0.a(ewVar));
                }
            } else if (ewVar != null) {
                ewVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0048  */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(boolean r3, @javax.annotation.Nullable android.app.Activity r4) {
        /*
            r2 = this;
            com.google.android.gms.internal.ads.o3<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.w3.r0
            com.google.android.gms.internal.ads.u3 r1 = com.google.android.gms.internal.ads.c.c()
            java.lang.Object r0 = r1.b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L48
            com.google.android.gms.ads.internal.zzs.zzc()
            android.content.Context r0 = r2.f7252i
            boolean r0 = com.google.android.gms.ads.internal.util.zzr.zzI(r0)
            if (r0 == 0) goto L48
            java.lang.String r3 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"
            com.google.android.gms.internal.ads.er.zzi(r3)
            com.google.android.gms.internal.ads.bb0 r3 = r2.o
            r3.zzd()
            com.google.android.gms.internal.ads.o3<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.w3.s0
            com.google.android.gms.internal.ads.u3 r4 = com.google.android.gms.internal.ads.c.c()
            java.lang.Object r3 = r4.b(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L69
            com.google.android.gms.internal.ads.xx1 r3 = r2.n
            com.google.android.gms.internal.ads.kp1 r4 = r2.a
            com.google.android.gms.internal.ads.ip1 r4 = r4.f7035b
            com.google.android.gms.internal.ads.ap1 r4 = r4.f6562b
            java.lang.String r4 = r4.f4967b
            r3.a(r4)
            goto L69
        L48:
            boolean r0 = r2.p
            if (r0 != 0) goto L69
            com.google.android.gms.internal.ads.eh0 r0 = r2.f7254k
            r0.zza()
            if (r4 != 0) goto L55
            android.content.Context r4 = r2.f7252i
        L55:
            com.google.android.gms.internal.ads.rj0 r0 = r2.f7255l     // Catch: com.google.android.gms.internal.ads.qj0 -> L63
            r0.a(r3, r4)     // Catch: com.google.android.gms.internal.ads.qj0 -> L63
            com.google.android.gms.internal.ads.eh0 r3 = r2.f7254k     // Catch: com.google.android.gms.internal.ads.qj0 -> L63
            r3.K0()     // Catch: com.google.android.gms.internal.ads.qj0 -> L63
            r3 = 1
            r2.p = r3
            return r3
        L63:
            r3 = move-exception
            com.google.android.gms.internal.ads.bb0 r4 = r2.o
            r4.r0(r3)
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.li0.g(boolean, android.app.Activity):boolean");
    }

    public final boolean h() {
        return this.f7256m.a();
    }
}