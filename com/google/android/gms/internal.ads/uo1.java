package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class uo1 extends im {

    /* renamed from: e, reason: collision with root package name */
    private final ko1 f9520e;

    /* renamed from: f, reason: collision with root package name */
    private final ao1 f9521f;

    /* renamed from: g, reason: collision with root package name */
    private final lp1 f9522g;

    /* renamed from: h, reason: collision with root package name */
    @GuardedBy("this")
    private xq0 f9523h;

    /* renamed from: i, reason: collision with root package name */
    @GuardedBy("this")
    private boolean f9524i = false;

    public uo1(ko1 ko1Var, ao1 ao1Var, lp1 lp1Var) {
        this.f9520e = ko1Var;
        this.f9521f = ao1Var;
        this.f9522g = lp1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized boolean zzx() {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.xq0 r0 = r1.f9523h     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto Le
            boolean r0 = r0.j()     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto Le
            r0 = 1
        Lc:
            monitor-exit(r1)
            return r0
        Le:
            r0 = 0
            goto Lc
        L10:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.uo1.zzx():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031 A[Catch: all -> 0x0063, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0019, B:12:0x0022, B:13:0x002b, B:15:0x0031, B:19:0x0045), top: B:25:0x0001, inners: #1 }] */
    @Override // com.google.android.gms.internal.ads.jm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void P1(com.google.android.gms.internal.ads.nm r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.p.e(r0)     // Catch: java.lang.Throwable -> L63
            java.lang.String r0 = r5.f7742f     // Catch: java.lang.Throwable -> L63
            com.google.android.gms.internal.ads.o3<java.lang.String> r1 = com.google.android.gms.internal.ads.w3.B3     // Catch: java.lang.Throwable -> L63
            com.google.android.gms.internal.ads.u3 r2 = com.google.android.gms.internal.ads.c.c()     // Catch: java.lang.Throwable -> L63
            java.lang.Object r1 = r2.b(r1)     // Catch: java.lang.Throwable -> L63
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L63
            if (r1 == 0) goto L2b
            if (r0 != 0) goto L19
            goto L2b
        L19:
            boolean r0 = java.util.regex.Pattern.matches(r1, r0)     // Catch: java.lang.RuntimeException -> L21 java.lang.Throwable -> L63
            if (r0 == 0) goto L2b
            monitor-exit(r4)
            return
        L21:
            r0 = move-exception
            com.google.android.gms.internal.ads.oq r1 = com.google.android.gms.ads.internal.zzs.zzg()     // Catch: java.lang.Throwable -> L63
            java.lang.String r2 = "NonagonUtil.isPatternMatched"
            r1.g(r0, r2)     // Catch: java.lang.Throwable -> L63
        L2b:
            boolean r0 = r4.zzx()     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L45
            com.google.android.gms.internal.ads.o3<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.w3.D3     // Catch: java.lang.Throwable -> L63
            com.google.android.gms.internal.ads.u3 r1 = com.google.android.gms.internal.ads.c.c()     // Catch: java.lang.Throwable -> L63
            java.lang.Object r0 = r1.b(r0)     // Catch: java.lang.Throwable -> L63
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L63
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L63
            if (r0 != 0) goto L45
            monitor-exit(r4)
            return
        L45:
            com.google.android.gms.internal.ads.co1 r0 = new com.google.android.gms.internal.ads.co1     // Catch: java.lang.Throwable -> L63
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L63
            r4.f9523h = r1     // Catch: java.lang.Throwable -> L63
            com.google.android.gms.internal.ads.ko1 r1 = r4.f9520e     // Catch: java.lang.Throwable -> L63
            r2 = 1
            r1.h(r2)     // Catch: java.lang.Throwable -> L63
            com.google.android.gms.internal.ads.ko1 r1 = r4.f9520e     // Catch: java.lang.Throwable -> L63
            com.google.android.gms.internal.ads.m93 r2 = r5.f7741e     // Catch: java.lang.Throwable -> L63
            java.lang.String r5 = r5.f7742f     // Catch: java.lang.Throwable -> L63
            com.google.android.gms.internal.ads.so1 r3 = new com.google.android.gms.internal.ads.so1     // Catch: java.lang.Throwable -> L63
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L63
            r1.a(r2, r5, r0, r3)     // Catch: java.lang.Throwable -> L63
            monitor-exit(r4)
            return
        L63:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.uo1.P1(com.google.android.gms.internal.ads.nm):void");
    }

    @Override // com.google.android.gms.internal.ads.jm
    public final synchronized void Q(e.c.b.b.b.b bVar) {
        com.google.android.gms.common.internal.p.e("destroy must be called on the main UI thread.");
        Context context = null;
        this.f9521f.x(null);
        if (this.f9523h != null) {
            if (bVar != null) {
                context = (Context) e.c.b.b.b.d.Y(bVar);
            }
            this.f9523h.c().M0(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.jm
    public final void S0(a0 a0Var) {
        com.google.android.gms.common.internal.p.e("setAdMetadataListener can only be called from the UI thread.");
        if (a0Var == null) {
            this.f9521f.x(null);
        } else {
            this.f9521f.x(new to1(this, a0Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.jm
    public final Bundle a() {
        com.google.android.gms.common.internal.p.e("getAdMetadata can only be called from the UI thread.");
        xq0 xq0Var = this.f9523h;
        return xq0Var != null ? xq0Var.l() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.jm
    public final synchronized void a2(e.c.b.b.b.b bVar) {
        com.google.android.gms.common.internal.p.e("showAd must be called on the main UI thread.");
        if (this.f9523h != null) {
            Activity activity = null;
            if (bVar != null) {
                Object objY = e.c.b.b.b.d.Y(bVar);
                if (objY instanceof Activity) {
                    activity = (Activity) objY;
                }
            }
            this.f9523h.g(this.f9524i, activity);
        }
    }

    @Override // com.google.android.gms.internal.ads.jm
    public final synchronized void f4(String str) {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.: setCustomData");
        this.f9522g.f7291b = str;
    }

    @Override // com.google.android.gms.internal.ads.jm
    public final synchronized void m(e.c.b.b.b.b bVar) {
        com.google.android.gms.common.internal.p.e("pause must be called on the main UI thread.");
        if (this.f9523h != null) {
            this.f9523h.c().K0(bVar == null ? null : (Context) e.c.b.b.b.d.Y(bVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.jm
    public final void n1(mm mmVar) {
        com.google.android.gms.common.internal.p.e("setRewardedVideoAdListener can only be called from the UI thread.");
        this.f9521f.A(mmVar);
    }

    @Override // com.google.android.gms.internal.ads.jm
    public final void w4(hm hmVar) {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.f9521f.R(hmVar);
    }

    @Override // com.google.android.gms.internal.ads.jm
    public final synchronized void zzc() {
        a2(null);
    }

    @Override // com.google.android.gms.internal.ads.jm
    public final boolean zze() {
        com.google.android.gms.common.internal.p.e("isLoaded must be called on the main UI thread.");
        return zzx();
    }

    @Override // com.google.android.gms.internal.ads.jm
    public final void zzf() {
        m(null);
    }

    @Override // com.google.android.gms.internal.ads.jm
    public final void zzg() {
        zzj(null);
    }

    @Override // com.google.android.gms.internal.ads.jm
    public final void zzh() {
        Q(null);
    }

    @Override // com.google.android.gms.internal.ads.jm
    public final synchronized void zzj(e.c.b.b.b.b bVar) {
        com.google.android.gms.common.internal.p.e("resume must be called on the main UI thread.");
        if (this.f9523h != null) {
            this.f9523h.c().L0(bVar == null ? null : (Context) e.c.b.b.b.d.Y(bVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.jm
    public final synchronized String zzl() {
        xq0 xq0Var = this.f9523h;
        if (xq0Var == null || xq0Var.d() == null) {
            return null;
        }
        return this.f9523h.d().zze();
    }

    @Override // com.google.android.gms.internal.ads.jm
    public final synchronized void zzm(String str) {
        com.google.android.gms.common.internal.p.e("setUserId must be called on the main UI thread.");
        this.f9522g.a = str;
    }

    @Override // com.google.android.gms.internal.ads.jm
    public final synchronized void zzr(boolean z) {
        com.google.android.gms.common.internal.p.e("setImmersiveMode must be called on the main UI thread.");
        this.f9524i = z;
    }

    @Override // com.google.android.gms.internal.ads.jm
    public final boolean zzs() {
        xq0 xq0Var = this.f9523h;
        return xq0Var != null && xq0Var.k();
    }

    @Override // com.google.android.gms.internal.ads.jm
    public final synchronized k1 zzt() {
        if (!((Boolean) c.c().b(w3.P4)).booleanValue()) {
            return null;
        }
        xq0 xq0Var = this.f9523h;
        if (xq0Var == null) {
            return null;
        }
        return xq0Var.d();
    }
}