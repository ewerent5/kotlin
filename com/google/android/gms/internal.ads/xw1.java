package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class xw1 implements bw1 {
    private static final xw1 a = new xw1();

    /* renamed from: b, reason: collision with root package name */
    private static final Handler f10290b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    private static Handler f10291c = null;

    /* renamed from: d, reason: collision with root package name */
    private static final Runnable f10292d = new tw1();

    /* renamed from: e, reason: collision with root package name */
    private static final Runnable f10293e = new uw1();

    /* renamed from: g, reason: collision with root package name */
    private int f10295g;

    /* renamed from: k, reason: collision with root package name */
    private long f10299k;

    /* renamed from: f, reason: collision with root package name */
    private final List<ww1> f10294f = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private final pw1 f10297i = new pw1();

    /* renamed from: h, reason: collision with root package name */
    private final dw1 f10296h = new dw1();

    /* renamed from: j, reason: collision with root package name */
    private final rw1 f10298j = new rw1(new ax1());

    xw1() {
    }

    public static xw1 b() {
        return a;
    }

    static /* synthetic */ void g(xw1 xw1Var) throws JSONException {
        xw1Var.f10295g = 0;
        xw1Var.f10299k = System.nanoTime();
        xw1Var.f10297i.d();
        long jNanoTime = System.nanoTime();
        cw1 cw1VarA = xw1Var.f10296h.a();
        if (xw1Var.f10297i.b().size() > 0) {
            Iterator<String> it = xw1Var.f10297i.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject jSONObjectB = kw1.b(0, 0, 0, 0);
                View viewH = xw1Var.f10297i.h(next);
                cw1 cw1VarB = xw1Var.f10296h.b();
                String strC = xw1Var.f10297i.c(next);
                if (strC != null) {
                    JSONObject jSONObjectZza = cw1VarB.zza(viewH);
                    kw1.d(jSONObjectZza, next);
                    kw1.e(jSONObjectZza, strC);
                    kw1.g(jSONObjectB, jSONObjectZza);
                }
                kw1.h(jSONObjectB);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                xw1Var.f10298j.b(jSONObjectB, hashSet, jNanoTime);
            }
        }
        if (xw1Var.f10297i.a().size() > 0) {
            JSONObject jSONObjectB2 = kw1.b(0, 0, 0, 0);
            xw1Var.k(null, cw1VarA, jSONObjectB2, 1);
            kw1.h(jSONObjectB2);
            xw1Var.f10298j.a(jSONObjectB2, xw1Var.f10297i.a(), jNanoTime);
        } else {
            xw1Var.f10298j.c();
        }
        xw1Var.f10297i.e();
        long jNanoTime2 = System.nanoTime() - xw1Var.f10299k;
        if (xw1Var.f10294f.size() > 0) {
            for (ww1 ww1Var : xw1Var.f10294f) {
                TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                ww1Var.zzb();
                if (ww1Var instanceof vw1) {
                    ((vw1) ww1Var).zza();
                }
            }
        }
    }

    private final void k(View view, cw1 cw1Var, JSONObject jSONObject, int i2) {
        cw1Var.a(view, jSONObject, this, i2 == 1);
    }

    private static final void l() {
        Handler handler = f10291c;
        if (handler != null) {
            handler.removeCallbacks(f10293e);
            f10291c = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.bw1
    public final void a(View view, cw1 cw1Var, JSONObject jSONObject) throws JSONException {
        int iJ;
        if (nw1.b(view) != null || (iJ = this.f10297i.j(view)) == 3) {
            return;
        }
        JSONObject jSONObjectZza = cw1Var.zza(view);
        kw1.g(jSONObject, jSONObjectZza);
        String strG = this.f10297i.g(view);
        if (strG != null) {
            kw1.d(jSONObjectZza, strG);
            this.f10297i.f();
        } else {
            ow1 ow1VarI = this.f10297i.i(view);
            if (ow1VarI != null) {
                kw1.f(jSONObjectZza, ow1VarI);
            }
            k(view, cw1Var, jSONObjectZza, iJ);
        }
        this.f10295g++;
    }

    public final void c() {
        if (f10291c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f10291c = handler;
            handler.post(f10292d);
            f10291c.postDelayed(f10293e, 200L);
        }
    }

    public final void d() {
        l();
        this.f10294f.clear();
        f10290b.post(new sw1(this));
    }

    public final void e() {
        l();
    }
}