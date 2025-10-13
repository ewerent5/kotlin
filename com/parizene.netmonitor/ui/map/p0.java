package com.parizene.netmonitor.ui.map;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import java.util.ArrayList;
import java.util.List;
import k.c.g.g.b;
import k.c.g.g.f;

/* compiled from: Osm.java */
/* loaded from: classes3.dex */
public class p0 implements a0<r0> {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final k.c.g.d f13971b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f13972c;

    /* renamed from: d, reason: collision with root package name */
    private y f13973d;

    /* renamed from: e, reason: collision with root package name */
    private k.c.g.g.j.d f13974e;

    /* renamed from: f, reason: collision with root package name */
    private q0<k.c.g.g.f> f13975f;

    /* renamed from: g, reason: collision with root package name */
    private final k.c.c.a f13976g = new a();

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f13977h = new Runnable() { // from class: com.parizene.netmonitor.ui.map.q
        @Override // java.lang.Runnable
        public final void run() {
            this.f13978e.l();
        }
    };

    /* compiled from: Osm.java */
    class a implements k.c.c.a {
        a() {
        }

        @Override // k.c.c.a
        public boolean a(k.c.c.c cVar) {
            p0.this.f13972c.removeCallbacks(p0.this.f13977h);
            p0.this.f13972c.postDelayed(p0.this.f13977h, 400L);
            return false;
        }

        @Override // k.c.c.a
        public boolean b(k.c.c.b bVar) {
            p0.this.f13972c.removeCallbacks(p0.this.f13977h);
            p0.this.f13972c.postDelayed(p0.this.f13977h, 400L);
            return false;
        }
    }

    /* compiled from: Osm.java */
    class b implements b.d<k.c.g.g.f> {
        b() {
        }

        @Override // k.c.g.g.b.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean a(int i2, k.c.g.g.f fVar) {
            return false;
        }

        @Override // k.c.g.g.b.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(int i2, k.c.g.g.f fVar) {
            return false;
        }
    }

    public p0(Context context, k.c.g.d dVar, Handler handler) {
        this.a = context;
        this.f13971b = dVar;
        this.f13972c = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void l() {
        y yVar = this.f13973d;
        if (yVar != null) {
            yVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void n() {
        g0 g0VarA = A();
        if (g0VarA != null) {
            e(g0VarA);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void p() {
        this.f13972c.post(new Runnable() { // from class: com.parizene.netmonitor.ui.map.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f13970e.n();
            }
        });
    }

    @Override // com.parizene.netmonitor.ui.map.a0
    public g0 A() {
        k.c.f.e eVarB = this.f13974e.B();
        if (eVarB != null) {
            return new g0(eVarB);
        }
        return null;
    }

    @Override // com.parizene.netmonitor.ui.map.a0
    public h0 L() {
        return new h0(this.f13971b.getProjection().h());
    }

    @Override // com.parizene.netmonitor.ui.map.a0
    public void c(g0 g0Var) {
        this.f13971b.getController().b(g0Var.c());
    }

    @Override // com.parizene.netmonitor.ui.map.a0
    public void destroy() {
        this.f13972c.removeCallbacks(this.f13977h);
        this.f13971b.C(this.f13976g);
        this.f13973d = null;
    }

    @Override // com.parizene.netmonitor.ui.map.a0
    public void e(g0 g0Var) {
        this.f13971b.getController().g(17.0d);
        this.f13971b.getController().b(g0Var.c());
    }

    @Override // com.parizene.netmonitor.ui.map.a0
    public void f(y yVar) {
        this.f13973d = yVar;
        this.f13971b.setBuiltInZoomControls(true);
        this.f13971b.setMultiTouchControls(true);
        this.f13971b.m(this.f13976g);
        q0<k.c.g.g.f> q0Var = new q0<>(this.a, new ArrayList(), new b());
        this.f13975f = q0Var;
        q0Var.S(true);
        this.f13971b.getOverlays().add(this.f13975f);
    }

    @Override // com.parizene.netmonitor.ui.map.a0
    public void g(List<r0> list) {
        this.f13975f.V();
        this.f13975f.J();
    }

    @Override // com.parizene.netmonitor.ui.map.a0
    public void i(s sVar, s sVar2, long j2, int i2, boolean z, f0 f0Var, g0 g0Var) {
        ((r0) sVar.f13981c).b(this.f13975f);
        String strI = sVar2.i(g0Var, i2, z);
        String strH = sVar2.h();
        g0 g0VarF = sVar2.f();
        f0Var.g(sVar2.f13980b);
        sVar.f13981c = h(strI, strH, g0VarF, f0Var.f(sVar2.e(i2, z)), sVar2.b());
        sVar.f13980b = sVar2.f13980b;
    }

    @Override // com.parizene.netmonitor.ui.map.a0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public r0 h(String str, String str2, g0 g0Var, Bitmap bitmap, int i2) {
        k.c.g.g.f fVar = new k.c.g.g.f(str, str2, g0Var.c());
        fVar.f(new BitmapDrawable(this.a.getResources(), bitmap));
        fVar.g(f.a.CENTER);
        this.f13975f.G(fVar);
        return new r0(fVar);
    }

    @Override // com.parizene.netmonitor.ui.map.a0
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void b(r0 r0Var) {
        this.f13975f.V();
        r0Var.b(this.f13975f);
    }

    @Override // com.parizene.netmonitor.ui.map.a0
    public /* synthetic */ void s(int i2) {
        z.a(this, i2);
    }

    @Override // com.parizene.netmonitor.ui.map.a0
    public void y(boolean z) {
        if (z) {
            this.f13974e = new k.c.g.g.j.d(new k.c.g.g.j.a(this.a), this.f13971b);
            this.f13971b.getOverlays().add(this.f13974e);
            this.f13974e.z();
            this.f13974e.E(new Runnable() { // from class: com.parizene.netmonitor.ui.map.r
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13979e.p();
                }
            });
            return;
        }
        k.c.g.g.j.d dVar = this.f13974e;
        if (dVar != null) {
            dVar.x();
            this.f13971b.getOverlays().remove(this.f13974e);
            this.f13974e = null;
        }
    }
}