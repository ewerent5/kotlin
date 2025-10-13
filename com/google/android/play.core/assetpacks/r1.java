package com.google.android.play.core.assetpacks;

import java.io.File;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class r1 {
    private final v a;

    /* renamed from: b, reason: collision with root package name */
    private final e.c.b.d.a.b.e0<s2> f12125b;

    /* renamed from: c, reason: collision with root package name */
    private final a1 f12126c;

    /* renamed from: d, reason: collision with root package name */
    private final e.c.b.d.a.b.e0<Executor> f12127d;

    /* renamed from: e, reason: collision with root package name */
    private final o0 f12128e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.android.play.core.common.c f12129f;

    r1(v vVar, e.c.b.d.a.b.e0<s2> e0Var, a1 a1Var, e.c.b.d.a.b.e0<Executor> e0Var2, o0 o0Var, com.google.android.play.core.common.c cVar) {
        this.a = vVar;
        this.f12125b = e0Var;
        this.f12126c = a1Var;
        this.f12127d = e0Var2;
        this.f12128e = o0Var;
        this.f12129f = cVar;
    }

    public final void a(final o1 o1Var) {
        Executor executorA;
        Runnable runnableA;
        File fileX = this.a.x(o1Var.f11951b, o1Var.f12108c, o1Var.f12109d);
        File fileD = this.a.D(o1Var.f11951b, o1Var.f12108c, o1Var.f12109d);
        if (!fileX.exists() || !fileD.exists()) {
            throw new k0(String.format("Cannot find pack files to move for pack %s.", o1Var.f11951b), o1Var.a);
        }
        File fileT = this.a.t(o1Var.f11951b, o1Var.f12108c, o1Var.f12109d);
        fileT.mkdirs();
        if (!fileX.renameTo(fileT)) {
            throw new k0("Cannot move merged pack files to final location.", o1Var.a);
        }
        new File(this.a.t(o1Var.f11951b, o1Var.f12108c, o1Var.f12109d), "merge.tmp").delete();
        File fileU = this.a.u(o1Var.f11951b, o1Var.f12108c, o1Var.f12109d);
        fileU.mkdirs();
        if (!fileD.renameTo(fileU)) {
            throw new k0("Cannot move metadata files to final location.", o1Var.a);
        }
        if (this.f12129f.a()) {
            executorA = this.f12127d.a();
            runnableA = new Runnable(this, o1Var) { // from class: com.google.android.play.core.assetpacks.p1

                /* renamed from: e, reason: collision with root package name */
                private final r1 f12112e;

                /* renamed from: f, reason: collision with root package name */
                private final o1 f12113f;

                {
                    this.f12112e = this;
                    this.f12113f = o1Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f12112e.b(this.f12113f);
                }
            };
        } else {
            executorA = this.f12127d.a();
            v vVar = this.a;
            vVar.getClass();
            runnableA = q1.a(vVar);
        }
        executorA.execute(runnableA);
        this.f12126c.f(o1Var.f11951b, o1Var.f12108c, o1Var.f12109d);
        this.f12128e.a(o1Var.f11951b);
        this.f12125b.a().d(o1Var.a, o1Var.f11951b);
    }

    final /* synthetic */ void b(o1 o1Var) {
        this.a.E(o1Var.f11951b, o1Var.f12108c, o1Var.f12109d);
    }
}