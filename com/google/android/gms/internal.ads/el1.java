package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class el1 implements u42<r40> {
    final /* synthetic */ lb1 a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p50 f5661b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ gl1 f5662c;

    el1(gl1 gl1Var, lb1 lb1Var, p50 p50Var) {
        this.f5662c = gl1Var;
        this.a = lb1Var;
        this.f5661b = p50Var;
    }

    @Override // com.google.android.gms.internal.ads.u42
    public final void zza(Throwable th) {
        final g93 g93VarG = this.f5661b.b().g(th);
        synchronized (this.f5662c) {
            gl1.j(this.f5662c, null);
            this.f5661b.a().B0(g93VarG);
            if (((Boolean) c.c().b(w3.o5)).booleanValue()) {
                this.f5662c.f6136b.execute(new Runnable(this, g93VarG) { // from class: com.google.android.gms.internal.ads.dl1

                    /* renamed from: e, reason: collision with root package name */
                    private final el1 f5488e;

                    /* renamed from: f, reason: collision with root package name */
                    private final g93 f5489f;

                    {
                        this.f5488e = this;
                        this.f5489f = g93VarG;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        el1 el1Var = this.f5488e;
                        el1Var.f5662c.f6138d.B0(this.f5489f);
                    }
                });
            }
            this.f5662c.f6142h.L0(60);
            gq1.a(g93VarG.f6091e, th, "BannerAdLoader.onFailure");
            this.a.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.u42
    public final /* bridge */ /* synthetic */ void zzb(r40 r40Var) {
        r40 r40Var2 = r40Var;
        synchronized (this.f5662c) {
            gl1.j(this.f5662c, null);
            this.f5662c.f6140f.removeAllViews();
            if (r40Var2.g() != null) {
                ViewParent parent = r40Var2.g().getParent();
                if (parent instanceof ViewGroup) {
                    String strZze = r40Var2.d() != null ? r40Var2.d().zze() : "";
                    StringBuilder sb = new StringBuilder(String.valueOf(strZze).length() + 78);
                    sb.append("Banner view provided from ");
                    sb.append(strZze);
                    sb.append(" already has a parent view. Removing its old parent.");
                    er.zzi(sb.toString());
                    ((ViewGroup) parent).removeView(r40Var2.g());
                }
            }
            o3<Boolean> o3Var = w3.o5;
            if (((Boolean) c.c().b(o3Var)).booleanValue()) {
                pe0 pe0VarF = r40Var2.f();
                pe0VarF.a(this.f5662c.f6138d);
                pe0VarF.b(this.f5662c.f6139e);
            }
            this.f5662c.f6140f.addView(r40Var2.g());
            this.a.zzb(r40Var2);
            if (((Boolean) c.c().b(o3Var)).booleanValue()) {
                Executor executor = this.f5662c.f6136b;
                wa1 wa1Var = this.f5662c.f6138d;
                wa1Var.getClass();
                executor.execute(cl1.a(wa1Var));
            }
            this.f5662c.f6142h.L0(r40Var2.l());
        }
    }
}