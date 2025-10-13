package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class tl0 {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private n1 f9187b;

    /* renamed from: c, reason: collision with root package name */
    private l6 f9188c;

    /* renamed from: d, reason: collision with root package name */
    private View f9189d;

    /* renamed from: e, reason: collision with root package name */
    private List<?> f9190e;

    /* renamed from: g, reason: collision with root package name */
    private f2 f9192g;

    /* renamed from: h, reason: collision with root package name */
    private Bundle f9193h;

    /* renamed from: i, reason: collision with root package name */
    private ew f9194i;

    /* renamed from: j, reason: collision with root package name */
    private ew f9195j;

    /* renamed from: k, reason: collision with root package name */
    private e.c.b.b.b.b f9196k;

    /* renamed from: l, reason: collision with root package name */
    private View f9197l;

    /* renamed from: m, reason: collision with root package name */
    private e.c.b.b.b.b f9198m;
    private double n;
    private t6 o;
    private t6 p;
    private String q;
    private float t;
    private String u;
    private final c.e.g<String, c6> r = new c.e.g<>();
    private final c.e.g<String, String> s = new c.e.g<>();

    /* renamed from: f, reason: collision with root package name */
    private List<f2> f9191f = Collections.emptyList();

    public static tl0 B(fg fgVar) {
        try {
            return C(E(fgVar.Y(), null), fgVar.m4(), (View) D(fgVar.zzr()), fgVar.zze(), fgVar.zzf(), fgVar.zzg(), fgVar.U(), fgVar.zzi(), (View) D(fgVar.zzu()), fgVar.zzv(), null, null, -1.0d, fgVar.zzh(), fgVar.zzj(), 0.0f);
        } catch (RemoteException e2) {
            er.zzj("Failed to get native ad assets from content ad mapper", e2);
            return null;
        }
    }

    private static tl0 C(n1 n1Var, l6 l6Var, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, e.c.b.b.b.b bVar, String str4, String str5, double d2, t6 t6Var, String str6, float f2) {
        tl0 tl0Var = new tl0();
        tl0Var.a = 6;
        tl0Var.f9187b = n1Var;
        tl0Var.f9188c = l6Var;
        tl0Var.f9189d = view;
        tl0Var.S("headline", str);
        tl0Var.f9190e = list;
        tl0Var.S("body", str2);
        tl0Var.f9193h = bundle;
        tl0Var.S("call_to_action", str3);
        tl0Var.f9197l = view2;
        tl0Var.f9198m = bVar;
        tl0Var.S("store", str4);
        tl0Var.S("price", str5);
        tl0Var.n = d2;
        tl0Var.o = t6Var;
        tl0Var.S("advertiser", str6);
        tl0Var.U(f2);
        return tl0Var;
    }

    private static <T> T D(e.c.b.b.b.b bVar) {
        if (bVar == null) {
            return null;
        }
        return (T) e.c.b.b.b.d.Y(bVar);
    }

    private static sl0 E(n1 n1Var, ig igVar) {
        if (n1Var == null) {
            return null;
        }
        return new sl0(n1Var, igVar);
    }

    public static tl0 w(ig igVar) {
        try {
            return C(E(igVar.zzn(), igVar), igVar.a(), (View) D(igVar.zzp()), igVar.zze(), igVar.zzf(), igVar.zzg(), igVar.zzs(), igVar.zzi(), (View) D(igVar.zzq()), igVar.zzr(), igVar.zzl(), igVar.zzm(), igVar.zzk(), igVar.zzh(), igVar.zzj(), igVar.f());
        } catch (RemoteException e2) {
            er.zzj("Failed to get native ad assets from unified ad mapper", e2);
            return null;
        }
    }

    public static tl0 x(fg fgVar) {
        try {
            sl0 sl0VarE = E(fgVar.Y(), null);
            l6 l6VarM4 = fgVar.m4();
            View view = (View) D(fgVar.zzr());
            String strZze = fgVar.zze();
            List<?> listZzf = fgVar.zzf();
            String strZzg = fgVar.zzg();
            Bundle bundleU = fgVar.U();
            String strZzi = fgVar.zzi();
            View view2 = (View) D(fgVar.zzu());
            e.c.b.b.b.b bVarZzv = fgVar.zzv();
            String strZzj = fgVar.zzj();
            t6 t6VarZzh = fgVar.zzh();
            tl0 tl0Var = new tl0();
            tl0Var.a = 1;
            tl0Var.f9187b = sl0VarE;
            tl0Var.f9188c = l6VarM4;
            tl0Var.f9189d = view;
            tl0Var.S("headline", strZze);
            tl0Var.f9190e = listZzf;
            tl0Var.S("body", strZzg);
            tl0Var.f9193h = bundleU;
            tl0Var.S("call_to_action", strZzi);
            tl0Var.f9197l = view2;
            tl0Var.f9198m = bVarZzv;
            tl0Var.S("advertiser", strZzj);
            tl0Var.p = t6VarZzh;
            return tl0Var;
        } catch (RemoteException e2) {
            er.zzj("Failed to get native ad from content ad mapper", e2);
            return null;
        }
    }

    public static tl0 y(eg egVar) {
        try {
            sl0 sl0VarE = E(egVar.m4(), null);
            l6 l6VarI4 = egVar.I4();
            View view = (View) D(egVar.zzu());
            String strZze = egVar.zze();
            List<?> listZzf = egVar.zzf();
            String strZzg = egVar.zzg();
            Bundle bundleU = egVar.U();
            String strZzi = egVar.zzi();
            View view2 = (View) D(egVar.J4());
            e.c.b.b.b.b bVarK4 = egVar.K4();
            String strZzk = egVar.zzk();
            String strZzl = egVar.zzl();
            double dR = egVar.R();
            t6 t6VarZzh = egVar.zzh();
            tl0 tl0Var = new tl0();
            tl0Var.a = 2;
            tl0Var.f9187b = sl0VarE;
            tl0Var.f9188c = l6VarI4;
            tl0Var.f9189d = view;
            tl0Var.S("headline", strZze);
            tl0Var.f9190e = listZzf;
            tl0Var.S("body", strZzg);
            tl0Var.f9193h = bundleU;
            tl0Var.S("call_to_action", strZzi);
            tl0Var.f9197l = view2;
            tl0Var.f9198m = bVarK4;
            tl0Var.S("store", strZzk);
            tl0Var.S("price", strZzl);
            tl0Var.n = dR;
            tl0Var.o = t6VarZzh;
            return tl0Var;
        } catch (RemoteException e2) {
            er.zzj("Failed to get native ad from app install ad mapper", e2);
            return null;
        }
    }

    public static tl0 z(eg egVar) {
        try {
            return C(E(egVar.m4(), null), egVar.I4(), (View) D(egVar.zzu()), egVar.zze(), egVar.zzf(), egVar.zzg(), egVar.U(), egVar.zzi(), (View) D(egVar.J4()), egVar.K4(), egVar.zzk(), egVar.zzl(), egVar.R(), egVar.zzh(), null, 0.0f);
        } catch (RemoteException e2) {
            er.zzj("Failed to get native ad assets from app install ad mapper", e2);
            return null;
        }
    }

    public final synchronized void A(int i2) {
        this.a = i2;
    }

    public final synchronized void F(n1 n1Var) {
        this.f9187b = n1Var;
    }

    public final synchronized void G(l6 l6Var) {
        this.f9188c = l6Var;
    }

    public final synchronized void H(List<c6> list) {
        this.f9190e = list;
    }

    public final synchronized void I(List<f2> list) {
        this.f9191f = list;
    }

    public final synchronized void J(f2 f2Var) {
        this.f9192g = f2Var;
    }

    public final synchronized void K(View view) {
        this.f9197l = view;
    }

    public final synchronized void L(double d2) {
        this.n = d2;
    }

    public final synchronized void M(t6 t6Var) {
        this.o = t6Var;
    }

    public final synchronized void N(t6 t6Var) {
        this.p = t6Var;
    }

    public final synchronized void O(String str) {
        this.q = str;
    }

    public final synchronized void P(ew ewVar) {
        this.f9194i = ewVar;
    }

    public final synchronized void Q(ew ewVar) {
        this.f9195j = ewVar;
    }

    public final synchronized void R(e.c.b.b.b.b bVar) {
        this.f9196k = bVar;
    }

    public final synchronized void S(String str, String str2) {
        if (str2 == null) {
            this.s.remove(str);
        } else {
            this.s.put(str, str2);
        }
    }

    public final synchronized void T(String str, c6 c6Var) {
        if (c6Var == null) {
            this.r.remove(str);
        } else {
            this.r.put(str, c6Var);
        }
    }

    public final synchronized void U(float f2) {
        this.t = f2;
    }

    public final synchronized void V(String str) {
        this.u = str;
    }

    public final synchronized String W(String str) {
        return this.s.get(str);
    }

    public final synchronized int X() {
        return this.a;
    }

    public final synchronized n1 Y() {
        return this.f9187b;
    }

    public final synchronized l6 Z() {
        return this.f9188c;
    }

    public final synchronized List<f2> a() {
        return this.f9191f;
    }

    public final synchronized View a0() {
        return this.f9189d;
    }

    public final synchronized f2 b() {
        return this.f9192g;
    }

    public final synchronized String b0() {
        return W("headline");
    }

    public final synchronized String c() {
        return W("body");
    }

    public final synchronized List<?> c0() {
        return this.f9190e;
    }

    public final synchronized Bundle d() {
        if (this.f9193h == null) {
            this.f9193h = new Bundle();
        }
        return this.f9193h;
    }

    public final t6 d0() {
        List<?> list = this.f9190e;
        if (list != null && list.size() != 0) {
            Object obj = this.f9190e.get(0);
            if (obj instanceof IBinder) {
                return s6.I4((IBinder) obj);
            }
        }
        return null;
    }

    public final synchronized String e() {
        return W("call_to_action");
    }

    public final synchronized View f() {
        return this.f9197l;
    }

    public final synchronized e.c.b.b.b.b g() {
        return this.f9198m;
    }

    public final synchronized String h() {
        return W("store");
    }

    public final synchronized String i() {
        return W("price");
    }

    public final synchronized double j() {
        return this.n;
    }

    public final synchronized t6 k() {
        return this.o;
    }

    public final synchronized String l() {
        return W("advertiser");
    }

    public final synchronized t6 m() {
        return this.p;
    }

    public final synchronized String n() {
        return this.q;
    }

    public final synchronized ew o() {
        return this.f9194i;
    }

    public final synchronized ew p() {
        return this.f9195j;
    }

    public final synchronized e.c.b.b.b.b q() {
        return this.f9196k;
    }

    public final synchronized c.e.g<String, c6> r() {
        return this.r;
    }

    public final synchronized float s() {
        return this.t;
    }

    public final synchronized String t() {
        return this.u;
    }

    public final synchronized c.e.g<String, String> u() {
        return this.s;
    }

    public final synchronized void v() {
        ew ewVar = this.f9194i;
        if (ewVar != null) {
            ewVar.destroy();
            this.f9194i = null;
        }
        ew ewVar2 = this.f9195j;
        if (ewVar2 != null) {
            ewVar2.destroy();
            this.f9195j = null;
        }
        this.f9196k = null;
        this.r.clear();
        this.s.clear();
        this.f9187b = null;
        this.f9188c = null;
        this.f9189d = null;
        this.f9190e = null;
        this.f9193h = null;
        this.f9197l = null;
        this.f9198m = null;
        this.o = null;
        this.p = null;
        this.q = null;
    }
}