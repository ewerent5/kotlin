package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzak;
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zzs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class y00 extends n0 {

    /* renamed from: e, reason: collision with root package name */
    private final Context f10318e;

    /* renamed from: f, reason: collision with root package name */
    private final kr f10319f;

    /* renamed from: g, reason: collision with root package name */
    private final js0 f10320g;

    /* renamed from: h, reason: collision with root package name */
    private final l31<hq1, i51> f10321h;

    /* renamed from: i, reason: collision with root package name */
    private final t91 f10322i;

    /* renamed from: j, reason: collision with root package name */
    private final qw0 f10323j;

    /* renamed from: k, reason: collision with root package name */
    private final kp f10324k;

    /* renamed from: l, reason: collision with root package name */
    private final os0 f10325l;

    /* renamed from: m, reason: collision with root package name */
    private final gx0 f10326m;

    @GuardedBy("this")
    private boolean n = false;

    y00(Context context, kr krVar, js0 js0Var, l31<hq1, i51> l31Var, t91 t91Var, qw0 qw0Var, kp kpVar, os0 os0Var, gx0 gx0Var) {
        this.f10318e = context;
        this.f10319f = krVar;
        this.f10320g = js0Var;
        this.f10321h = l31Var;
        this.f10322i = t91Var;
        this.f10323j = qw0Var;
        this.f10324k = kpVar;
        this.f10325l = os0Var;
        this.f10326m = gx0Var;
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final void D0(ec ecVar) {
        this.f10323j.b(ecVar);
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final void F1(x2 x2Var) {
        this.f10324k.h(this.f10318e, x2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void I4(Runnable runnable) {
        com.google.android.gms.common.internal.p.e("Adapters must be initialized on the main thread.");
        Map<String, nf> mapF = zzs.zzg().l().zzn().f();
        if (mapF.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                er.zzj("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (this.f10320g.d()) {
            HashMap map = new HashMap();
            Iterator<nf> it = mapF.values().iterator();
            while (it.hasNext()) {
                for (mf mfVar : it.next().a) {
                    String str = mfVar.f7473k;
                    for (String str2 : mfVar.f7465c) {
                        if (!map.containsKey(str2)) {
                            map.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((Collection) map.get(str2)).add(str);
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    m31<hq1, ListenerT> m31VarA = this.f10321h.a(str3, jSONObject);
                    if (m31VarA != 0) {
                        hq1 hq1Var = (hq1) m31VarA.f7412b;
                        if (!hq1Var.q() && hq1Var.t()) {
                            hq1Var.u(this.f10318e, (i51) m31VarA.f7413c, (List) entry.getValue());
                            String strValueOf = String.valueOf(str3);
                            er.zzd(strValueOf.length() != 0 ? "Initialized rewarded video mediation adapter ".concat(strValueOf) : new String("Initialized rewarded video mediation adapter "));
                        }
                    }
                } catch (vp1 e2) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 56);
                    sb.append("Failed to initialize rewarded video mediation adapter \"");
                    sb.append(str3);
                    sb.append("\"");
                    er.zzj(sb.toString(), e2);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final void J(String str) {
        this.f10322i.c(str);
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final void L2(tf tfVar) {
        this.f10320g.a(tfVar);
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final synchronized void P(boolean z) {
        zzs.zzh().zzc(z);
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final void U0(e.c.b.b.b.b bVar, String str) {
        if (bVar == null) {
            er.zzf("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) e.c.b.b.b.d.Y(bVar);
        if (context == null) {
            er.zzf("Context is null. Failed to open debug menu.");
            return;
        }
        zzak zzakVar = new zzak(context);
        zzakVar.zzc(str);
        zzakVar.zzd(this.f10319f.f7054e);
        zzakVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final synchronized void V0(float f2) {
        zzs.zzh().zza(f2);
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final void Z0(String str, e.c.b.b.b.b bVar) throws JSONException {
        String strZzv;
        Runnable runnable;
        w3.a(this.f10318e);
        if (((Boolean) c.c().b(w3.l2)).booleanValue()) {
            zzs.zzc();
            strZzv = zzr.zzv(this.f10318e);
        } else {
            strZzv = "";
        }
        boolean z = true;
        if (true != TextUtils.isEmpty(strZzv)) {
            str = strZzv;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean zBooleanValue = ((Boolean) c.c().b(w3.i2)).booleanValue();
        o3<Boolean> o3Var = w3.B0;
        boolean zBooleanValue2 = zBooleanValue | ((Boolean) c.c().b(o3Var)).booleanValue();
        if (((Boolean) c.c().b(o3Var)).booleanValue()) {
            final Runnable runnable2 = (Runnable) e.c.b.b.b.d.Y(bVar);
            runnable = new Runnable(this, runnable2) { // from class: com.google.android.gms.internal.ads.w00

                /* renamed from: e, reason: collision with root package name */
                private final y00 f9823e;

                /* renamed from: f, reason: collision with root package name */
                private final Runnable f9824f;

                {
                    this.f9823e = this;
                    this.f9824f = runnable2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    final y00 y00Var = this.f9823e;
                    final Runnable runnable3 = this.f9824f;
                    qr.f8450e.execute(new Runnable(y00Var, runnable3) { // from class: com.google.android.gms.internal.ads.x00

                        /* renamed from: e, reason: collision with root package name */
                        private final y00 f10094e;

                        /* renamed from: f, reason: collision with root package name */
                        private final Runnable f10095f;

                        {
                            this.f10094e = y00Var;
                            this.f10095f = runnable3;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f10094e.I4(this.f10095f);
                        }
                    });
                }
            };
        } else {
            z = zBooleanValue2;
            runnable = null;
        }
        if (z) {
            zzs.zzk().zza(this.f10318e, this.f10319f, str, runnable);
        }
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final void k4(a1 a1Var) {
        this.f10326m.h(a1Var);
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final synchronized void u(String str) {
        w3.a(this.f10318e);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) c.c().b(w3.i2)).booleanValue()) {
                zzs.zzk().zza(this.f10318e, this.f10319f, str, null);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final synchronized void zze() {
        if (this.n) {
            er.zzi("Mobile ads is initialized already.");
            return;
        }
        w3.a(this.f10318e);
        zzs.zzg().e(this.f10318e, this.f10319f);
        zzs.zzi().a(this.f10318e);
        this.n = true;
        this.f10323j.c();
        this.f10322i.a();
        if (((Boolean) c.c().b(w3.j2)).booleanValue()) {
            this.f10325l.a();
        }
        this.f10326m.a();
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final synchronized float zzk() {
        return zzs.zzh().zzb();
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final synchronized boolean zzl() {
        return zzs.zzh().zzd();
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final String zzm() {
        return this.f10319f.f7054e;
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final List<xb> zzq() {
        return this.f10323j.d();
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final void zzs() {
        this.f10323j.a();
    }
}