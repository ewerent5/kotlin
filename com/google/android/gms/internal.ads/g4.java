package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class g4 {
    private final AtomicInteger a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<d1<?>> f6031b;

    /* renamed from: c, reason: collision with root package name */
    private final PriorityBlockingQueue<d1<?>> f6032c;

    /* renamed from: d, reason: collision with root package name */
    private final PriorityBlockingQueue<d1<?>> f6033d;

    /* renamed from: e, reason: collision with root package name */
    private final hw2 f6034e;

    /* renamed from: f, reason: collision with root package name */
    private final q53 f6035f;

    /* renamed from: g, reason: collision with root package name */
    private final r63[] f6036g;

    /* renamed from: h, reason: collision with root package name */
    private jy2 f6037h;

    /* renamed from: i, reason: collision with root package name */
    private final List<f3> f6038i;

    /* renamed from: j, reason: collision with root package name */
    private final List<e2> f6039j;

    /* renamed from: k, reason: collision with root package name */
    private final o33 f6040k;

    public g4(hw2 hw2Var, q53 q53Var, int i2) {
        o33 o33Var = new o33(new Handler(Looper.getMainLooper()));
        this.a = new AtomicInteger();
        this.f6031b = new HashSet();
        this.f6032c = new PriorityBlockingQueue<>();
        this.f6033d = new PriorityBlockingQueue<>();
        this.f6038i = new ArrayList();
        this.f6039j = new ArrayList();
        this.f6034e = hw2Var;
        this.f6035f = q53Var;
        this.f6036g = new r63[4];
        this.f6040k = o33Var;
    }

    public final void a() {
        jy2 jy2Var = this.f6037h;
        if (jy2Var != null) {
            jy2Var.a();
        }
        r63[] r63VarArr = this.f6036g;
        for (int i2 = 0; i2 < 4; i2++) {
            r63 r63Var = r63VarArr[i2];
            if (r63Var != null) {
                r63Var.a();
            }
        }
        jy2 jy2Var2 = new jy2(this.f6032c, this.f6033d, this.f6034e, this.f6040k, null);
        this.f6037h = jy2Var2;
        jy2Var2.start();
        for (int i3 = 0; i3 < 4; i3++) {
            r63 r63Var2 = new r63(this.f6033d, this.f6035f, this.f6034e, this.f6040k, null);
            this.f6036g[i3] = r63Var2;
            r63Var2.start();
        }
    }

    public final <T> d1<T> b(d1<T> d1Var) {
        d1Var.zzf(this);
        synchronized (this.f6031b) {
            this.f6031b.add(d1Var);
        }
        d1Var.zzg(this.a.incrementAndGet());
        d1Var.zzc("add-to-queue");
        d(d1Var, 0);
        this.f6032c.add(d1Var);
        return d1Var;
    }

    final <T> void c(d1<T> d1Var) {
        synchronized (this.f6031b) {
            this.f6031b.remove(d1Var);
        }
        synchronized (this.f6038i) {
            Iterator<f3> it = this.f6038i.iterator();
            while (it.hasNext()) {
                it.next().zza();
            }
        }
        d(d1Var, 5);
    }

    final void d(d1<?> d1Var, int i2) {
        synchronized (this.f6039j) {
            Iterator<e2> it = this.f6039j.iterator();
            while (it.hasNext()) {
                it.next().zza();
            }
        }
    }
}