package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import e.c.b.b.c.e.ec;
import e.c.b.b.c.e.qd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
public final class e5 extends q3 {

    /* renamed from: e */
    private final t9 f10830e;

    /* renamed from: f */
    private Boolean f10831f;

    /* renamed from: g */
    private String f10832g;

    public e5(t9 t9Var) {
        this(t9Var, null);
    }

    private final void I4(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            this.f10830e.zzq().A().a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.f10831f == null) {
                    this.f10831f = Boolean.valueOf("com.google.android.gms".equals(this.f10832g) || com.google.android.gms.common.util.s.a(this.f10830e.zzm(), Binder.getCallingUid()) || com.google.android.gms.common.k.a(this.f10830e.zzm()).c(Binder.getCallingUid()));
                }
                if (this.f10831f.booleanValue()) {
                    return;
                }
            } catch (SecurityException e2) {
                this.f10830e.zzq().A().b("Measurement Service called with invalid calling package. appId", v3.s(str));
                throw e2;
            }
        }
        if (this.f10832g == null && com.google.android.gms.common.j.j(this.f10830e.zzm(), Binder.getCallingUid(), str)) {
            this.f10832g = str;
        }
        if (str.equals(this.f10832g)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    private final void K4(ka kaVar, boolean z) {
        com.google.android.gms.common.internal.p.j(kaVar);
        I4(kaVar.f10989e, false);
        this.f10830e.c0().e0(kaVar.f10990f, kaVar.v, kaVar.z);
    }

    private final void m4(Runnable runnable) {
        com.google.android.gms.common.internal.p.j(runnable);
        if (this.f10830e.zzp().D()) {
            runnable.run();
        } else {
            this.f10830e.zzp().u(runnable);
        }
    }

    @Override // com.google.android.gms.measurement.internal.n3
    public final void H0(r rVar, String str, String str2) {
        com.google.android.gms.common.internal.p.j(rVar);
        com.google.android.gms.common.internal.p.f(str);
        I4(str, true);
        m4(new r5(this, rVar, str));
    }

    @Override // com.google.android.gms.measurement.internal.n3
    public final void H1(long j2, String str, String str2, String str3) {
        m4(new u5(this, str2, str3, str, j2));
    }

    @Override // com.google.android.gms.measurement.internal.n3
    public final List<ca> I0(String str, String str2, String str3, boolean z) {
        I4(str, true);
        try {
            List<ea> list = (List) this.f10830e.zzp().r(new l5(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (ea eaVar : list) {
                if (z || !da.x0(eaVar.f10849c)) {
                    arrayList.add(new ca(eaVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e2) {
            this.f10830e.zzq().A().c("Failed to get user properties as. appId", v3.s(str), e2);
            return Collections.emptyList();
        }
    }

    final r J4(r rVar, ka kaVar) {
        q qVar;
        boolean z = false;
        if ("_cmp".equals(rVar.f11169e) && (qVar = rVar.f11170f) != null && qVar.c() != 0) {
            String strO = rVar.f11170f.O("_cis");
            if ("referrer broadcast".equals(strO) || "referrer API".equals(strO)) {
                z = true;
            }
        }
        if (!z) {
            return rVar;
        }
        this.f10830e.zzq().G().b("Event has been filtered ", rVar.toString());
        return new r("_cmpx", rVar.f11170f, rVar.f11171g, rVar.f11172h);
    }

    @Override // com.google.android.gms.measurement.internal.n3
    public final void L3(r rVar, ka kaVar) {
        com.google.android.gms.common.internal.p.j(rVar);
        K4(kaVar, false);
        m4(new o5(this, rVar, kaVar));
    }

    @Override // com.google.android.gms.measurement.internal.n3
    public final void M1(ka kaVar) {
        I4(kaVar.f10989e, false);
        m4(new m5(this, kaVar));
    }

    @Override // com.google.android.gms.measurement.internal.n3
    public final List<wa> N1(String str, String str2, String str3) {
        I4(str, true);
        try {
            return (List) this.f10830e.zzp().r(new n5(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e2) {
            this.f10830e.zzq().A().b("Failed to get conditional user properties as", e2);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.n3
    public final void P3(final Bundle bundle, final ka kaVar) {
        if (qd.a() && this.f10830e.G().o(t.C0)) {
            K4(kaVar, false);
            m4(new Runnable(this, kaVar, bundle) { // from class: com.google.android.gms.measurement.internal.d5

                /* renamed from: e, reason: collision with root package name */
                private final e5 f10807e;

                /* renamed from: f, reason: collision with root package name */
                private final ka f10808f;

                /* renamed from: g, reason: collision with root package name */
                private final Bundle f10809g;

                {
                    this.f10807e = this;
                    this.f10808f = kaVar;
                    this.f10809g = bundle;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f10807e.Y(this.f10808f, this.f10809g);
                }
            });
        }
    }

    @Override // com.google.android.gms.measurement.internal.n3
    public final List<wa> T1(String str, String str2, ka kaVar) {
        K4(kaVar, false);
        try {
            return (List) this.f10830e.zzp().r(new k5(this, kaVar, str, str2)).get();
        } catch (InterruptedException | ExecutionException e2) {
            this.f10830e.zzq().A().b("Failed to get conditional user properties", e2);
            return Collections.emptyList();
        }
    }

    final /* synthetic */ void Y(ka kaVar, Bundle bundle) {
        this.f10830e.V().V(kaVar.f10989e, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.n3
    public final void Z2(ka kaVar) {
        K4(kaVar, false);
        m4(new h5(this, kaVar));
    }

    @Override // com.google.android.gms.measurement.internal.n3
    public final void e2(wa waVar) {
        com.google.android.gms.common.internal.p.j(waVar);
        com.google.android.gms.common.internal.p.j(waVar.f11320g);
        I4(waVar.f11318e, true);
        m4(new j5(this, new wa(waVar)));
    }

    @Override // com.google.android.gms.measurement.internal.n3
    public final String h1(ka kaVar) {
        K4(kaVar, false);
        return this.f10830e.U(kaVar);
    }

    @Override // com.google.android.gms.measurement.internal.n3
    public final void i4(ca caVar, ka kaVar) {
        com.google.android.gms.common.internal.p.j(caVar);
        K4(kaVar, false);
        m4(new t5(this, caVar, kaVar));
    }

    @Override // com.google.android.gms.measurement.internal.n3
    public final byte[] m0(r rVar, String str) {
        com.google.android.gms.common.internal.p.f(str);
        com.google.android.gms.common.internal.p.j(rVar);
        I4(str, true);
        this.f10830e.zzq().H().b("Log and bundle. event", this.f10830e.b0().r(rVar.f11169e));
        long jNanoTime = this.f10830e.zzl().nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f10830e.zzp().w(new q5(this, rVar, str)).get();
            if (bArr == null) {
                this.f10830e.zzq().A().b("Log and bundle returned null. appId", v3.s(str));
                bArr = new byte[0];
            }
            this.f10830e.zzq().H().d("Log and bundle processed. event, size, time_ms", this.f10830e.b0().r(rVar.f11169e), Integer.valueOf(bArr.length), Long.valueOf((this.f10830e.zzl().nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e2) {
            this.f10830e.zzq().A().d("Failed to log and bundle. appId, event, error", v3.s(str), this.f10830e.b0().r(rVar.f11169e), e2);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.n3
    public final List<ca> n2(String str, String str2, boolean z, ka kaVar) {
        K4(kaVar, false);
        try {
            List<ea> list = (List) this.f10830e.zzp().r(new i5(this, kaVar, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (ea eaVar : list) {
                if (z || !da.x0(eaVar.f10849c)) {
                    arrayList.add(new ca(eaVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e2) {
            this.f10830e.zzq().A().c("Failed to query user properties. appId", v3.s(kaVar.f10989e), e2);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.n3
    public final List<ca> p2(ka kaVar, boolean z) {
        K4(kaVar, false);
        try {
            List<ea> list = (List) this.f10830e.zzp().r(new s5(this, kaVar)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (ea eaVar : list) {
                if (z || !da.x0(eaVar.f10849c)) {
                    arrayList.add(new ca(eaVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e2) {
            this.f10830e.zzq().A().c("Failed to get user properties. appId", v3.s(kaVar.f10989e), e2);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.n3
    public final void q4(wa waVar, ka kaVar) {
        com.google.android.gms.common.internal.p.j(waVar);
        com.google.android.gms.common.internal.p.j(waVar.f11320g);
        K4(kaVar, false);
        wa waVar2 = new wa(waVar);
        waVar2.f11318e = kaVar.f10989e;
        m4(new g5(this, waVar2, kaVar));
    }

    @Override // com.google.android.gms.measurement.internal.n3
    public final void r2(ka kaVar) {
        K4(kaVar, false);
        m4(new v5(this, kaVar));
    }

    @Override // com.google.android.gms.measurement.internal.n3
    public final void s0(ka kaVar) {
        if (ec.a() && this.f10830e.G().o(t.L0)) {
            com.google.android.gms.common.internal.p.f(kaVar.f10989e);
            com.google.android.gms.common.internal.p.j(kaVar.A);
            p5 p5Var = new p5(this, kaVar);
            com.google.android.gms.common.internal.p.j(p5Var);
            if (this.f10830e.zzp().D()) {
                p5Var.run();
            } else {
                this.f10830e.zzp().x(p5Var);
            }
        }
    }

    private e5(t9 t9Var, String str) {
        com.google.android.gms.common.internal.p.j(t9Var);
        this.f10830e = t9Var;
        this.f10832g = null;
    }
}