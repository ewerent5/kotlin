package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import ch.qos.logback.classic.Level;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class wj2 implements zm2 {

    /* renamed from: e, reason: collision with root package name */
    private static wj2 f9976e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f9977f;

    /* renamed from: g, reason: collision with root package name */
    private final hz1 f9978g;

    /* renamed from: h, reason: collision with root package name */
    private final oz1 f9979h;

    /* renamed from: i, reason: collision with root package name */
    private final qz1 f9980i;

    /* renamed from: j, reason: collision with root package name */
    private final zp2 f9981j;

    /* renamed from: k, reason: collision with root package name */
    private final lx1 f9982k;

    /* renamed from: l, reason: collision with root package name */
    private final Executor f9983l;

    /* renamed from: m, reason: collision with root package name */
    private final sr2 f9984m;
    private final nz1 n;
    private volatile boolean q;
    volatile long o = 0;
    private final Object p = new Object();
    private volatile boolean r = false;

    wj2(Context context, lx1 lx1Var, hz1 hz1Var, oz1 oz1Var, qz1 qz1Var, zp2 zp2Var, Executor executor, hx1 hx1Var, sr2 sr2Var) {
        this.f9977f = context;
        this.f9982k = lx1Var;
        this.f9978g = hz1Var;
        this.f9979h = oz1Var;
        this.f9980i = qz1Var;
        this.f9981j = zp2Var;
        this.f9983l = executor;
        this.f9984m = sr2Var;
        this.n = new wh2(this, hx1Var);
    }

    public static synchronized wj2 a(String str, Context context, boolean z, boolean z2) {
        if (f9976e == null) {
            mx1 mx1VarD = nx1.d();
            mx1VarD.a(str);
            mx1VarD.b(z);
            nx1 nx1VarD = mx1VarD.d();
            ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
            wj2 wj2VarL = l(context, lx1.b(context, executorServiceNewCachedThreadPool, z2), nx1VarD, executorServiceNewCachedThreadPool);
            f9976e = wj2VarL;
            wj2VarL.d();
            f9976e.f();
        }
        return f9976e;
    }

    static wj2 b(Context context, lx1 lx1Var, nx1 nx1Var) {
        return l(context, lx1Var, nx1Var, Executors.newCachedThreadPool());
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
    
        if (r4.D().E().equals(r5.E()) != false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ void j(com.google.android.gms.internal.ads.wj2 r12) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wj2.j(com.google.android.gms.internal.ads.wj2):void");
    }

    private static wj2 l(Context context, lx1 lx1Var, nx1 nx1Var, Executor executor) {
        fy1 fy1VarA = fy1.a(context, executor, lx1Var, nx1Var);
        yp2 yp2Var = new yp2(context);
        zp2 zp2Var = new zp2(nx1Var, fy1VarA, new nq2(context, yp2Var), yp2Var);
        sr2 sr2VarB = uy1.b(context, lx1Var);
        hx1 hx1Var = new hx1();
        return new wj2(context, lx1Var, new hz1(context, sr2VarB), new oz1(context, sr2VarB, new vg2(lx1Var), ((Boolean) c.c().b(w3.q1)).booleanValue()), new qz1(context, zp2Var, lx1Var, hx1Var), zp2Var, executor, hx1Var, sr2VarB);
    }

    private final gz1 m(int i2) {
        if (uy1.a(this.f9984m)) {
            return ((Boolean) c.c().b(w3.o1)).booleanValue() ? this.f9979h.c(1) : this.f9978g.c(1);
        }
        return null;
    }

    public final synchronized boolean c() {
        return this.r;
    }

    final synchronized void d() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        gz1 gz1VarM = m(1);
        if (gz1VarM == null) {
            this.f9982k.c(4013, System.currentTimeMillis() - jCurrentTimeMillis);
        } else if (this.f9980i.a(gz1VarM)) {
            this.r = true;
        }
    }

    public final void e() {
        if (uy1.a(this.f9984m)) {
            this.f9983l.execute(new xi2(this));
        }
    }

    public final void f() {
        if (this.q) {
            return;
        }
        synchronized (this.p) {
            if (!this.q) {
                if ((System.currentTimeMillis() / 1000) - this.o < 3600) {
                    return;
                }
                gz1 gz1VarC = this.f9980i.c();
                if (gz1VarC == null || gz1VarC.e(3600L)) {
                    e();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zm2
    public final void zzf(MotionEvent motionEvent) {
        ox1 ox1VarB = this.f9980i.b();
        if (ox1VarB != null) {
            try {
                ox1VarB.b(null, motionEvent);
            } catch (pz1 e2) {
                this.f9982k.d(e2.a(), -1L, e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zm2
    public final void zzg(int i2, int i3, int i4) {
    }

    @Override // com.google.android.gms.internal.ads.zm2
    public final String zzh(Context context, String str, View view, Activity activity) {
        f();
        ox1 ox1VarB = this.f9980i.b();
        if (ox1VarB == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strA = ox1VarB.a(context, null, str, view, activity);
        this.f9982k.e(Level.TRACE_INT, System.currentTimeMillis() - jCurrentTimeMillis, strA, null);
        return strA;
    }

    @Override // com.google.android.gms.internal.ads.zm2
    public final String zzi(Context context, String str, View view) {
        return zzh(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zm2
    public final void zzj(View view) {
        this.f9981j.a(view);
    }

    @Override // com.google.android.gms.internal.ads.zm2
    public final String zzk(Context context, View view, Activity activity) {
        f();
        ox1 ox1VarB = this.f9980i.b();
        if (ox1VarB == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strD = ox1VarB.d(context, null, view, null);
        this.f9982k.e(5002, System.currentTimeMillis() - jCurrentTimeMillis, strD, null);
        return strD;
    }

    @Override // com.google.android.gms.internal.ads.zm2
    public final String zzl(Context context) {
        f();
        ox1 ox1VarB = this.f9980i.b();
        if (ox1VarB == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strC = ox1VarB.c(context, null);
        this.f9982k.e(5001, System.currentTimeMillis() - jCurrentTimeMillis, strC, null);
        return strC;
    }
}