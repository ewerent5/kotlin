package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zzs;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class tb1 implements mb1<s60> {

    @GuardedBy("this")
    private final pp1 a;

    /* renamed from: b, reason: collision with root package name */
    private final cy f9110b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f9111c;

    /* renamed from: d, reason: collision with root package name */
    private final jb1 f9112d;

    /* renamed from: e, reason: collision with root package name */
    @GuardedBy("this")
    private g70 f9113e;

    public tb1(cy cyVar, Context context, jb1 jb1Var, pp1 pp1Var) {
        this.f9110b = cyVar;
        this.f9111c = context;
        this.f9112d = jb1Var;
        this.a = pp1Var;
        pp1Var.H(jb1Var.c());
    }

    @Override // com.google.android.gms.internal.ads.mb1
    public final boolean a(m93 m93Var, String str, kb1 kb1Var, lb1<? super s60> lb1Var) {
        zzs.zzc();
        if (zzr.zzJ(this.f9111c) && m93Var.w == null) {
            er.zzf("Failed to load the ad because app ID is missing.");
            this.f9110b.h().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.ob1

                /* renamed from: e, reason: collision with root package name */
                private final tb1 f7933e;

                {
                    this.f7933e = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f7933e.c();
                }
            });
            return false;
        }
        if (str == null) {
            er.zzf("Ad unit ID should not be null for NativeAdLoader.");
            this.f9110b.h().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.pb1

                /* renamed from: e, reason: collision with root package name */
                private final tb1 f8133e;

                {
                    this.f8133e = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f8133e.b();
                }
            });
            return false;
        }
        gq1.b(this.f9111c, m93Var.f7448j);
        if (((Boolean) c.c().b(w3.P5)).booleanValue() && m93Var.f7448j) {
            this.f9110b.B().b(true);
        }
        int i2 = ((nb1) kb1Var).a;
        pp1 pp1Var = this.a;
        pp1Var.p(m93Var);
        pp1Var.z(i2);
        qp1 qp1VarJ = pp1Var.J();
        if (qp1VarJ.n != null) {
            this.f9112d.c().x(qp1VarJ.n);
        }
        fk0 fk0VarU = this.f9110b.u();
        aa0 aa0Var = new aa0();
        aa0Var.a(this.f9111c);
        aa0Var.b(qp1VarJ);
        fk0VarU.f(aa0Var.d());
        uf0 uf0Var = new uf0();
        uf0Var.f(this.f9112d.c(), this.f9110b.h());
        fk0VarU.p(uf0Var.n());
        fk0VarU.e(this.f9112d.b());
        fk0VarU.o(new o40(null));
        gk0 gk0VarZza = fk0VarU.zza();
        this.f9110b.A().a(1);
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        ScheduledExecutorService scheduledExecutorServiceI = this.f9110b.i();
        w70<z60> w70VarA = gk0VarZza.a();
        g70 g70Var = new g70(h52Var, scheduledExecutorServiceI, w70VarA.c(w70VarA.b()));
        this.f9113e = g70Var;
        g70Var.a(new sb1(this, lb1Var, gk0VarZza));
        return true;
    }

    final /* synthetic */ void b() {
        this.f9112d.e().B0(mq1.d(6, null, null));
    }

    final /* synthetic */ void c() {
        this.f9112d.e().B0(mq1.d(4, null, null));
    }

    @Override // com.google.android.gms.internal.ads.mb1
    public final boolean zzb() {
        g70 g70Var = this.f9113e;
        return g70Var != null && g70Var.b();
    }
}