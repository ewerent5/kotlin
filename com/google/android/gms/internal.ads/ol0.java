package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zzs;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ol0 extends s60 {
    private final ql0 A;
    private final za1 B;
    private final Map<String, Boolean> C;
    private final List<w13> D;
    private final x13 E;

    /* renamed from: i */
    private final Executor f7969i;

    /* renamed from: j */
    private final tl0 f7970j;

    /* renamed from: k */
    private final cm0 f7971k;

    /* renamed from: l */
    private final tm0 f7972l;

    /* renamed from: m */
    private final zl0 f7973m;
    private final fm0 n;
    private final go2<up0> o;
    private final go2<sp0> p;
    private final go2<zp0> q;
    private final go2<qp0> r;
    private final go2<xp0> s;
    private pn0 t;
    private boolean u;
    private boolean v;
    private final so w;
    private final ip2 x;
    private final kr y;
    private final Context z;

    public ol0(r60 r60Var, Executor executor, tl0 tl0Var, cm0 cm0Var, tm0 tm0Var, zl0 zl0Var, fm0 fm0Var, go2<up0> go2Var, go2<sp0> go2Var2, go2<zp0> go2Var3, go2<qp0> go2Var4, go2<xp0> go2Var5, so soVar, ip2 ip2Var, kr krVar, Context context, ql0 ql0Var, za1 za1Var, x13 x13Var) {
        super(r60Var);
        this.v = false;
        this.f7969i = executor;
        this.f7970j = tl0Var;
        this.f7971k = cm0Var;
        this.f7972l = tm0Var;
        this.f7973m = zl0Var;
        this.n = fm0Var;
        this.o = go2Var;
        this.p = go2Var2;
        this.q = go2Var3;
        this.r = go2Var4;
        this.s = go2Var5;
        this.w = soVar;
        this.x = ip2Var;
        this.y = krVar;
        this.z = context;
        this.A = ql0Var;
        this.B = za1Var;
        this.C = new HashMap();
        this.D = new ArrayList();
        this.E = x13Var;
    }

    public static boolean P(View view) {
        return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
    }

    /* renamed from: u */
    public final void p(pn0 pn0Var) {
        Iterator<String> itKeys;
        View view;
        zm2 zm2VarB;
        this.t = pn0Var;
        this.f7972l.a(pn0Var);
        this.f7971k.c(pn0Var.Y(), pn0Var.zzk(), pn0Var.zzl(), pn0Var, pn0Var);
        if (((Boolean) c.c().b(w3.D1)).booleanValue() && (zm2VarB = this.x.b()) != null) {
            zm2VarB.zzj(pn0Var.Y());
        }
        if (((Boolean) c.c().b(w3.f1)).booleanValue()) {
            xo1 xo1Var = this.f8822b;
            if (xo1Var.f0 && (itKeys = xo1Var.e0.keys()) != null) {
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    WeakReference<View> weakReference = this.t.zzj().get(next);
                    this.C.put(next, Boolean.FALSE);
                    if (weakReference != null && (view = weakReference.get()) != null) {
                        w13 w13Var = new w13(this.z, view);
                        this.D.add(w13Var);
                        w13Var.a(new nl0(this, next));
                    }
                }
            }
        }
        if (pn0Var.zzh() != null) {
            pn0Var.zzh().a(this.w);
        }
    }

    /* renamed from: v */
    public final void o(pn0 pn0Var) {
        this.f7971k.d(pn0Var.Y(), pn0Var.zzj());
        if (pn0Var.R() != null) {
            pn0Var.R().setClickable(false);
            pn0Var.R().removeAllViews();
        }
        if (pn0Var.zzh() != null) {
            pn0Var.zzh().b(this.w);
        }
        this.t = null;
    }

    public final synchronized void A(Bundle bundle) {
        this.f7971k.l(bundle);
    }

    public final synchronized void B(final pn0 pn0Var) {
        if (((Boolean) c.c().b(w3.e1)).booleanValue()) {
            zzr.zza.post(new Runnable(this, pn0Var) { // from class: com.google.android.gms.internal.ads.kl0

                /* renamed from: e, reason: collision with root package name */
                private final ol0 f7004e;

                /* renamed from: f, reason: collision with root package name */
                private final pn0 f7005f;

                {
                    this.f7004e = this;
                    this.f7005f = pn0Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f7004e.p(this.f7005f);
                }
            });
        } else {
            p(pn0Var);
        }
    }

    public final synchronized void C(final pn0 pn0Var) {
        if (((Boolean) c.c().b(w3.e1)).booleanValue()) {
            zzr.zza.post(new Runnable(this, pn0Var) { // from class: com.google.android.gms.internal.ads.ll0

                /* renamed from: e, reason: collision with root package name */
                private final ol0 f7262e;

                /* renamed from: f, reason: collision with root package name */
                private final pn0 f7263f;

                {
                    this.f7262e = this;
                    this.f7263f = pn0Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f7262e.o(this.f7263f);
                }
            });
        } else {
            o(pn0Var);
        }
    }

    public final synchronized void D(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        this.f7972l.b(this.t);
        this.f7971k.e(view, view2, map, map2, z);
        if (this.v) {
            if (((Boolean) c.c().b(w3.b2)).booleanValue() && this.f7970j.o() != null) {
                this.f7970j.o().e0("onSdkAdUserInteractionClick", new c.e.a());
            }
        }
    }

    public final synchronized void E(View view, MotionEvent motionEvent, View view2) {
        this.f7971k.a(view, motionEvent, view2);
    }

    public final synchronized void F(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (this.u) {
            return;
        }
        if (((Boolean) c.c().b(w3.f1)).booleanValue() && this.f8822b.f0) {
            Iterator<String> it = this.C.keySet().iterator();
            while (it.hasNext()) {
                if (!this.C.get(it.next()).booleanValue()) {
                    return;
                }
            }
        }
        if (z) {
            this.f7972l.c(this.t);
            this.f7971k.g(view, map, map2);
            this.u = true;
            return;
        }
        if (((Boolean) c.c().b(w3.g2)).booleanValue() && map != null) {
            Iterator<Map.Entry<String, WeakReference<View>>> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                View view2 = it2.next().getValue().get();
                if (view2 != null && P(view2)) {
                    this.f7972l.c(this.t);
                    this.f7971k.g(view, map, map2);
                    this.u = true;
                    return;
                }
            }
        }
    }

    public final synchronized JSONObject G(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        return this.f7971k.f(view, map, map2);
    }

    public final synchronized void H(View view) {
        this.f7971k.h(view);
    }

    public final synchronized void I(l8 l8Var) {
        this.f7971k.i(l8Var);
    }

    public final synchronized void J() {
        this.f7971k.zzp();
    }

    public final synchronized void K(w0 w0Var) {
        this.f7971k.m(w0Var);
    }

    public final synchronized void L(s0 s0Var) {
        this.f7971k.b(s0Var);
    }

    public final synchronized void M() {
        this.f7971k.zzg();
    }

    public final synchronized void N() {
        pn0 pn0Var = this.t;
        if (pn0Var == null) {
            er.zzd("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z = pn0Var instanceof nm0;
            this.f7969i.execute(new Runnable(this, z) { // from class: com.google.android.gms.internal.ads.ml0

                /* renamed from: e, reason: collision with root package name */
                private final ol0 f7504e;

                /* renamed from: f, reason: collision with root package name */
                private final boolean f7505f;

                {
                    this.f7504e = this;
                    this.f7505f = z;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f7504e.n(this.f7505f);
                }
            });
        }
    }

    public final synchronized boolean O() {
        return this.f7971k.zzh();
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void a() {
        this.f7969i.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.hl0

            /* renamed from: e, reason: collision with root package name */
            private final ol0 f6342e;

            {
                this.f6342e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f6342e.t();
            }
        });
        if (this.f7970j.X() != 7) {
            Executor executor = this.f7969i;
            cm0 cm0Var = this.f7971k;
            cm0Var.getClass();
            executor.execute(il0.a(cm0Var));
        }
        super.a();
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final synchronized void b() {
        this.f7969i.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.jl0

            /* renamed from: e, reason: collision with root package name */
            private final ol0 f6765e;

            {
                this.f6765e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f6765e.q();
            }
        });
        super.b();
    }

    public final boolean g() {
        return this.f7973m.c();
    }

    public final void h(String str, boolean z) {
        String str2;
        e.c.b.b.b.b bVarK;
        sj sjVar;
        tj tjVar;
        if (this.f7973m.d()) {
            ew ewVarP = this.f7970j.p();
            ew ewVarO = this.f7970j.o();
            if (ewVarP == null && ewVarO == null) {
                return;
            }
            if (ewVarP != null) {
                str2 = null;
            } else {
                str2 = "javascript";
                ewVarP = ewVarO;
            }
            String str3 = str2;
            if (!zzs.zzr().zza(this.z)) {
                er.zzi("Failed to initialize omid in InternalNativeAd");
                return;
            }
            kr krVar = this.y;
            int i2 = krVar.f7055f;
            int i3 = krVar.f7056g;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i2);
            sb.append(".");
            sb.append(i3);
            String string = sb.toString();
            if (((Boolean) c.c().b(w3.m3)).booleanValue()) {
                if (ewVarO != null) {
                    sjVar = sj.VIDEO;
                    tjVar = tj.DEFINED_BY_JAVASCRIPT;
                } else {
                    sjVar = sj.NATIVE_DISPLAY;
                    tjVar = this.f7970j.X() == 3 ? tj.UNSPECIFIED : tj.ONE_PIXEL;
                }
                bVarK = zzs.zzr().I(string, ewVarP.q(), "", "javascript", str3, str, tjVar, sjVar, this.f8822b.g0);
            } else {
                bVarK = zzs.zzr().K(string, ewVarP.q(), "", "javascript", str3, str);
            }
            if (bVarK == null) {
                er.zzi("Failed to create omid session in InternalNativeAd");
                return;
            }
            this.f7970j.R(bVarK);
            ewVarP.Y(bVarK);
            if (ewVarO != null) {
                zzs.zzr().N(bVarK, ewVarO.n());
                this.v = true;
            }
            if (z) {
                zzs.zzr().H(bVarK);
                if (((Boolean) c.c().b(w3.o3)).booleanValue()) {
                    ewVarP.e0("onSdkLoaded", new c.e.a());
                }
            }
        }
    }

    public final boolean i() {
        return this.f7973m.d();
    }

    public final void j(View view) {
        e.c.b.b.b.b bVarQ = this.f7970j.q();
        ew ewVarP = this.f7970j.p();
        if (!this.f7973m.d() || bVarQ == null || ewVarP == null || view == null) {
            return;
        }
        zzs.zzr().N(bVarQ, view);
    }

    public final void k(View view) {
        e.c.b.b.b.b bVarQ = this.f7970j.q();
        if (!this.f7973m.d() || bVarQ == null || view == null) {
            return;
        }
        zzs.zzr().M(bVarQ, view);
    }

    public final ql0 l() {
        return this.A;
    }

    public final synchronized void m(h1 h1Var) {
        this.B.a(h1Var);
    }

    final /* synthetic */ void n(boolean z) {
        this.f7971k.n(this.t.Y(), this.t.zzj(), this.t.zzk(), z);
    }

    final /* synthetic */ void q() {
        this.f7971k.zzw();
        this.f7970j.v();
    }

    final /* bridge */ /* synthetic */ void t() {
        try {
            int iX = this.f7970j.X();
            if (iX == 1) {
                if (this.n.a() != null) {
                    h("Google", true);
                    this.n.a().C4(this.o.zzb());
                    return;
                }
                return;
            }
            if (iX == 2) {
                if (this.n.b() != null) {
                    h("Google", true);
                    this.n.b().h0(this.p.zzb());
                    return;
                }
                return;
            }
            if (iX == 3) {
                if (this.n.f(this.f7970j.n()) != null) {
                    if (this.f7970j.o() != null) {
                        h("Google", true);
                    }
                    this.n.f(this.f7970j.n()).h4(this.s.zzb());
                    return;
                }
                return;
            }
            if (iX == 6) {
                if (this.n.c() != null) {
                    h("Google", true);
                    this.n.c().p4(this.q.zzb());
                    return;
                }
                return;
            }
            if (iX != 7) {
                er.zzf("Wrong native template id!");
            } else if (this.n.e() != null) {
                this.n.e().A2(this.r.zzb());
            }
        } catch (RemoteException e2) {
            er.zzg("RemoteException when notifyAdLoad is called", e2);
        }
    }

    public final synchronized void w(String str) {
        this.f7971k.O(str);
    }

    public final synchronized void x() {
        if (this.u) {
            return;
        }
        this.f7971k.zzm();
    }

    public final synchronized void y(Bundle bundle) {
        this.f7971k.k(bundle);
    }

    public final synchronized boolean z(Bundle bundle) {
        if (this.u) {
            return true;
        }
        boolean zJ = this.f7971k.j(bundle);
        this.u = zJ;
        return zJ;
    }
}