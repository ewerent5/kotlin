package com.google.android.play.core.assetpacks;

import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class g2 {
    private static final e.c.b.d.a.b.f a = new e.c.b.d.a.b.f("AssetPackManager");

    /* renamed from: b, reason: collision with root package name */
    private final v f11987b;

    /* renamed from: c, reason: collision with root package name */
    private final e.c.b.d.a.b.e0<s2> f11988c;

    /* renamed from: d, reason: collision with root package name */
    private final s f11989d;

    /* renamed from: e, reason: collision with root package name */
    private final e.c.b.d.a.e.a f11990e;

    /* renamed from: f, reason: collision with root package name */
    private final a1 f11991f;

    /* renamed from: g, reason: collision with root package name */
    private final o0 f11992g;

    /* renamed from: h, reason: collision with root package name */
    private final e0 f11993h;

    /* renamed from: i, reason: collision with root package name */
    private final e.c.b.d.a.b.e0<Executor> f11994i;

    /* renamed from: j, reason: collision with root package name */
    private final com.google.android.play.core.common.c f11995j;

    /* renamed from: k, reason: collision with root package name */
    private final Handler f11996k = new Handler(Looper.getMainLooper());

    g2(v vVar, e.c.b.d.a.b.e0<s2> e0Var, s sVar, e.c.b.d.a.e.a aVar, a1 a1Var, o0 o0Var, e0 e0Var2, e.c.b.d.a.b.e0<Executor> e0Var3, com.google.android.play.core.common.c cVar) {
        this.f11987b = vVar;
        this.f11988c = e0Var;
        this.f11989d = sVar;
        this.f11990e = aVar;
        this.f11991f = a1Var;
        this.f11992g = o0Var;
        this.f11993h = e0Var2;
        this.f11994i = e0Var3;
        this.f11995j = cVar;
    }

    private final void e() {
        final byte[] bArr = null;
        this.f11994i.a().execute(new Runnable(this, bArr) { // from class: com.google.android.play.core.assetpacks.d2

            /* renamed from: e, reason: collision with root package name */
            private final g2 f11966e;

            /* renamed from: f, reason: collision with root package name */
            private final /* synthetic */ int f11967f = 1;

            {
                this.f11966e = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws IOException {
                if (this.f11967f != 0) {
                    this.f11966e.c();
                } else {
                    this.f11966e.b();
                }
            }
        });
    }

    final void a(boolean z) {
        boolean zE = this.f11989d.e();
        this.f11989d.c(z);
        if (!z || zE) {
            return;
        }
        e();
    }

    final /* synthetic */ void b() throws IOException {
        this.f11987b.I();
        this.f11987b.F();
        this.f11987b.J();
    }

    final /* synthetic */ void c() {
        e.c.b.d.a.f.e<List<String>> eVarF = this.f11988c.a().f(this.f11987b.q());
        Executor executorA = this.f11994i.a();
        v vVar = this.f11987b;
        vVar.getClass();
        eVarF.c(executorA, e2.a(vVar));
        eVarF.b(this.f11994i.a(), f2.a);
    }
}