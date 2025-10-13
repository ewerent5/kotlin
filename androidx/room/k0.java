package androidx.room;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.room.q0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: QueryInterceptorDatabase.java */
/* loaded from: classes.dex */
final class k0 implements c.r.a.b {

    /* renamed from: e, reason: collision with root package name */
    private final c.r.a.b f1886e;

    /* renamed from: f, reason: collision with root package name */
    private final q0.f f1887f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f1888g;

    k0(c.r.a.b bVar, q0.f fVar, Executor executor) {
        this.f1886e = bVar;
        this.f1887f = fVar;
        this.f1888g = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void C(c.r.a.e eVar, n0 n0Var) {
        this.f1887f.a(eVar.b(), n0Var.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void K(c.r.a.e eVar, n0 n0Var) {
        this.f1887f.a(eVar.b(), n0Var.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void T() {
        this.f1887f.a("TRANSACTION SUCCESSFUL", Collections.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void c() {
        this.f1887f.a("BEGIN EXCLUSIVE TRANSACTION", Collections.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void g() {
        this.f1887f.a("BEGIN DEFERRED TRANSACTION", Collections.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void j() {
        this.f1887f.a("END TRANSACTION", Collections.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void s(String str) {
        this.f1887f.a(str, new ArrayList(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void A(String str) {
        this.f1887f.a(str, Collections.emptyList());
    }

    @Override // c.r.a.b
    public boolean E0() {
        return this.f1886e.E0();
    }

    @Override // c.r.a.b
    public Cursor J(final c.r.a.e eVar, CancellationSignal cancellationSignal) {
        final n0 n0Var = new n0();
        eVar.c(n0Var);
        this.f1888g.execute(new Runnable() { // from class: androidx.room.m
            @Override // java.lang.Runnable
            public final void run() {
                this.f1894e.K(eVar, n0Var);
            }
        });
        return this.f1886e.s0(eVar);
    }

    @Override // c.r.a.b
    public void S() {
        this.f1888g.execute(new Runnable() { // from class: androidx.room.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f1841e.T();
            }
        });
        this.f1886e.S();
    }

    @Override // c.r.a.b
    public void U() {
        this.f1888g.execute(new Runnable() { // from class: androidx.room.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f1839e.g();
            }
        });
        this.f1886e.U();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f1886e.close();
    }

    @Override // c.r.a.b
    public Cursor d0(final String str) {
        this.f1888g.execute(new Runnable() { // from class: androidx.room.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f1889e.A(str);
            }
        });
        return this.f1886e.d0(str);
    }

    @Override // c.r.a.b
    public String getPath() {
        return this.f1886e.getPath();
    }

    @Override // c.r.a.b
    public void i0() {
        this.f1888g.execute(new Runnable() { // from class: androidx.room.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f1836e.j();
            }
        });
        this.f1886e.i0();
    }

    @Override // c.r.a.b
    public boolean isOpen() {
        return this.f1886e.isOpen();
    }

    @Override // c.r.a.b
    public void k() {
        this.f1888g.execute(new Runnable() { // from class: androidx.room.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f1899e.c();
            }
        });
        this.f1886e.k();
    }

    @Override // c.r.a.b
    public List<Pair<String, String>> n() {
        return this.f1886e.n();
    }

    @Override // c.r.a.b
    public void p(final String str) {
        this.f1888g.execute(new Runnable() { // from class: androidx.room.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f1864e.s(str);
            }
        });
        this.f1886e.p(str);
    }

    @Override // c.r.a.b
    public Cursor s0(final c.r.a.e eVar) {
        final n0 n0Var = new n0();
        eVar.c(n0Var);
        this.f1888g.execute(new Runnable() { // from class: androidx.room.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f1883e.C(eVar, n0Var);
            }
        });
        return this.f1886e.s0(eVar);
    }

    @Override // c.r.a.b
    public c.r.a.f x(String str) {
        return new o0(this.f1886e.x(str), this.f1887f, str, this.f1888g);
    }

    @Override // c.r.a.b
    public boolean x0() {
        return this.f1886e.x0();
    }
}