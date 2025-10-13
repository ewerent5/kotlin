package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class i51 extends rm implements zb0 {

    /* renamed from: e, reason: collision with root package name */
    @GuardedBy("this")
    private sm f6482e;

    /* renamed from: f, reason: collision with root package name */
    @GuardedBy("this")
    private yb0 f6483f;

    /* renamed from: g, reason: collision with root package name */
    @GuardedBy("this")
    private ci0 f6484g;

    @Override // com.google.android.gms.internal.ads.sm
    public final synchronized void C0(e.c.b.b.b.b bVar) {
        sm smVar = this.f6482e;
        if (smVar != null) {
            ((g81) smVar).f6084g.M0();
        }
    }

    @Override // com.google.android.gms.internal.ads.sm
    public final synchronized void H(e.c.b.b.b.b bVar) {
        sm smVar = this.f6482e;
        if (smVar != null) {
            ((g81) smVar).f6082e.zzbo();
        }
    }

    public final synchronized void J4(sm smVar) {
        this.f6482e = smVar;
    }

    public final synchronized void K4(ci0 ci0Var) {
        this.f6484g = ci0Var;
    }

    @Override // com.google.android.gms.internal.ads.sm
    public final synchronized void M(e.c.b.b.b.b bVar, int i2) {
        ci0 ci0Var = this.f6484g;
        if (ci0Var != null) {
            String strValueOf = String.valueOf(((f81) ci0Var).f5827c.a);
            er.zzi(strValueOf.length() != 0 ? "Fail to initialize adapter ".concat(strValueOf) : new String("Fail to initialize adapter "));
        }
    }

    @Override // com.google.android.gms.internal.ads.sm
    public final synchronized void i(e.c.b.b.b.b bVar) {
        ci0 ci0Var = this.f6484g;
        if (ci0Var != null) {
            Executor executor = ((f81) ci0Var).f5828d.f6308b;
            final kp1 kp1Var = ((f81) ci0Var).a;
            final xo1 xo1Var = ((f81) ci0Var).f5826b;
            final m31 m31Var = ((f81) ci0Var).f5827c;
            final f81 f81Var = (f81) ci0Var;
            executor.execute(new Runnable(f81Var, kp1Var, xo1Var, m31Var) { // from class: com.google.android.gms.internal.ads.e81

                /* renamed from: e, reason: collision with root package name */
                private final f81 f5595e;

                /* renamed from: f, reason: collision with root package name */
                private final kp1 f5596f;

                /* renamed from: g, reason: collision with root package name */
                private final xo1 f5597g;

                /* renamed from: h, reason: collision with root package name */
                private final m31 f5598h;

                {
                    this.f5595e = f81Var;
                    this.f5596f = kp1Var;
                    this.f5597g = xo1Var;
                    this.f5598h = m31Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    f81 f81Var2 = this.f5595e;
                    kp1 kp1Var2 = this.f5596f;
                    xo1 xo1Var2 = this.f5597g;
                    m31 m31Var2 = this.f5598h;
                    h81 h81Var = f81Var2.f5828d;
                    h81.e(kp1Var2, xo1Var2, m31Var2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.sm
    public final synchronized void j0(e.c.b.b.b.b bVar, tm tmVar) {
        sm smVar = this.f6482e;
        if (smVar != null) {
            ((g81) smVar).f6085h.x(tmVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.sm
    public final synchronized void m(e.c.b.b.b.b bVar) {
        sm smVar = this.f6482e;
        if (smVar != null) {
            ((g81) smVar).f6085h.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zb0
    public final synchronized void m4(yb0 yb0Var) {
        this.f6483f = yb0Var;
    }

    @Override // com.google.android.gms.internal.ads.sm
    public final synchronized void t4(e.c.b.b.b.b bVar) {
        sm smVar = this.f6482e;
        if (smVar != null) {
            ((g81) smVar).f6083f.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.sm
    public final synchronized void w1(e.c.b.b.b.b bVar, int i2) {
        yb0 yb0Var = this.f6483f;
        if (yb0Var != null) {
            yb0Var.zzb(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.sm
    public final synchronized void zzg(e.c.b.b.b.b bVar) {
        yb0 yb0Var = this.f6483f;
        if (yb0Var != null) {
            yb0Var.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.sm
    public final synchronized void zzj(e.c.b.b.b.b bVar) {
        sm smVar = this.f6482e;
        if (smVar != null) {
            smVar.zzj(bVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.sm
    public final synchronized void zzn(e.c.b.b.b.b bVar) {
        sm smVar = this.f6482e;
        if (smVar != null) {
            ((g81) smVar).f6084g.K0();
        }
    }
}