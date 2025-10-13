package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.ads.internal.util.zze;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class y20 implements v13, jb0, zzp, ib0 {

    /* renamed from: e, reason: collision with root package name */
    private final t20 f10340e;

    /* renamed from: f, reason: collision with root package name */
    private final u20 f10341f;

    /* renamed from: h, reason: collision with root package name */
    private final hf<JSONObject, JSONObject> f10343h;

    /* renamed from: i, reason: collision with root package name */
    private final Executor f10344i;

    /* renamed from: j, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f10345j;

    /* renamed from: g, reason: collision with root package name */
    private final Set<ew> f10342g = new HashSet();

    /* renamed from: k, reason: collision with root package name */
    private final AtomicBoolean f10346k = new AtomicBoolean(false);

    /* renamed from: l, reason: collision with root package name */
    @GuardedBy("this")
    private final x20 f10347l = new x20();

    /* renamed from: m, reason: collision with root package name */
    private boolean f10348m = false;
    private WeakReference<?> n = new WeakReference<>(this);

    public y20(ef efVar, u20 u20Var, Executor executor, t20 t20Var, com.google.android.gms.common.util.f fVar) {
        this.f10340e = t20Var;
        oe<JSONObject> oeVar = se.f8855b;
        this.f10343h = efVar.a("google.afma.activeView.handleUpdate", oeVar, oeVar);
        this.f10341f = u20Var;
        this.f10344i = executor;
        this.f10345j = fVar;
    }

    private final void o() {
        Iterator<ew> it = this.f10342g.iterator();
        while (it.hasNext()) {
            this.f10340e.c(it.next());
        }
        this.f10340e.d();
    }

    public final synchronized void a() {
        if (this.n.get() == null) {
            d();
            return;
        }
        if (this.f10348m || !this.f10346k.get()) {
            return;
        }
        try {
            this.f10347l.f10106d = this.f10345j.c();
            final JSONObject jSONObjectA = this.f10341f.zzb(this.f10347l);
            for (final ew ewVar : this.f10342g) {
                this.f10344i.execute(new Runnable(ewVar, jSONObjectA) { // from class: com.google.android.gms.internal.ads.w20

                    /* renamed from: e, reason: collision with root package name */
                    private final ew f9856e;

                    /* renamed from: f, reason: collision with root package name */
                    private final JSONObject f9857f;

                    {
                        this.f9856e = ewVar;
                        this.f9857f = jSONObjectA;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9856e.j0("AFMA_updateActiveView", this.f9857f);
                    }
                });
            }
            tr.b(this.f10343h.zzb(jSONObjectA), "ActiveViewListener.callActiveViewJs");
        } catch (Exception e2) {
            zze.zzb("Failed to call ActiveViewJS", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.ib0
    public final synchronized void b() {
        if (this.f10346k.compareAndSet(false, true)) {
            this.f10340e.a(this);
            a();
        }
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final synchronized void c(Context context) {
        this.f10347l.f10104b = true;
        a();
    }

    @Override // com.google.android.gms.internal.ads.v13
    public final synchronized void c0(u13 u13Var) {
        x20 x20Var = this.f10347l;
        x20Var.a = u13Var.f9355j;
        x20Var.f10108f = u13Var;
        a();
    }

    public final synchronized void d() {
        o();
        this.f10348m = true;
    }

    public final synchronized void f(ew ewVar) {
        this.f10342g.add(ewVar);
        this.f10340e.b(ewVar);
    }

    public final void m(Object obj) {
        this.n = new WeakReference<>(obj);
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final synchronized void u(Context context) {
        this.f10347l.f10107e = "u";
        a();
        o();
        this.f10348m = true;
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final synchronized void x(Context context) {
        this.f10347l.f10104b = false;
        a();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzbJ() {
        this.f10347l.f10104b = false;
        a();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzbs() {
        this.f10347l.f10104b = true;
        a();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbt(int i2) {
    }
}