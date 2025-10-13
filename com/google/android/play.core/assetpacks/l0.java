package com.google.android.play.core.assetpacks;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
final class l0 {
    private static final e.c.b.d.a.b.f a = new e.c.b.d.a.b.f("ExtractorLooper");

    /* renamed from: b */
    private final a1 f12063b;

    /* renamed from: c */
    private final j0 f12064c;

    /* renamed from: d */
    private final b2 f12065d;

    /* renamed from: e */
    private final m1 f12066e;

    /* renamed from: f */
    private final r1 f12067f;

    /* renamed from: g */
    private final v1 f12068g;

    /* renamed from: h */
    private final e.c.b.d.a.b.e0<s2> f12069h;

    /* renamed from: i */
    private final d1 f12070i;

    /* renamed from: j */
    private final AtomicBoolean f12071j = new AtomicBoolean(false);

    l0(a1 a1Var, e.c.b.d.a.b.e0<s2> e0Var, j0 j0Var, b2 b2Var, m1 m1Var, r1 r1Var, v1 v1Var, d1 d1Var) {
        this.f12063b = a1Var;
        this.f12069h = e0Var;
        this.f12064c = j0Var;
        this.f12065d = b2Var;
        this.f12066e = m1Var;
        this.f12067f = r1Var;
        this.f12068g = v1Var;
        this.f12070i = d1Var;
    }

    private final void b(int i2, Exception exc) {
        try {
            this.f12063b.o(i2);
            this.f12063b.g(i2);
        } catch (k0 unused) {
            a.b("Error during error handling: %s", exc.getMessage());
        }
    }

    final void a() {
        e.c.b.d.a.b.f fVar = a;
        fVar.a("Run extractor loop", new Object[0]);
        if (!this.f12071j.compareAndSet(false, true)) {
            fVar.e("runLoop already looping; return", new Object[0]);
            return;
        }
        while (true) {
            c1 c1VarA = null;
            try {
                c1VarA = this.f12070i.a();
            } catch (k0 e2) {
                a.b("Error while getting next extraction task: %s", e2.getMessage());
                if (e2.f12053e >= 0) {
                    this.f12069h.a().b(e2.f12053e);
                    b(e2.f12053e, e2);
                }
            }
            if (c1VarA == null) {
                this.f12071j.set(false);
                return;
            }
            try {
                if (c1VarA instanceof i0) {
                    this.f12064c.a((i0) c1VarA);
                } else if (c1VarA instanceof a2) {
                    this.f12065d.a((a2) c1VarA);
                } else if (c1VarA instanceof l1) {
                    this.f12066e.a((l1) c1VarA);
                } else if (c1VarA instanceof o1) {
                    this.f12067f.a((o1) c1VarA);
                } else if (c1VarA instanceof u1) {
                    this.f12068g.a((u1) c1VarA);
                } else {
                    a.b("Unknown task type: %s", c1VarA.getClass().getName());
                }
            } catch (Exception e3) {
                a.b("Error during extraction task: %s", e3.getMessage());
                this.f12069h.a().b(c1VarA.a);
                b(c1VarA.a, e3);
            }
        }
    }
}