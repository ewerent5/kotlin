package com.google.android.gms.measurement.internal;

import android.content.Context;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class w4 extends w5 {

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicLong f11303c = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: d, reason: collision with root package name */
    private a5 f11304d;

    /* renamed from: e, reason: collision with root package name */
    private a5 f11305e;

    /* renamed from: f, reason: collision with root package name */
    private final PriorityBlockingQueue<x4<?>> f11306f;

    /* renamed from: g, reason: collision with root package name */
    private final BlockingQueue<x4<?>> f11307g;

    /* renamed from: h, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f11308h;

    /* renamed from: i, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f11309i;

    /* renamed from: j, reason: collision with root package name */
    private final Object f11310j;

    /* renamed from: k, reason: collision with root package name */
    private final Semaphore f11311k;

    /* renamed from: l, reason: collision with root package name */
    private volatile boolean f11312l;

    w4(z4 z4Var) {
        super(z4Var);
        this.f11310j = new Object();
        this.f11311k = new Semaphore(2);
        this.f11306f = new PriorityBlockingQueue<>();
        this.f11307g = new LinkedBlockingQueue();
        this.f11308h = new y4(this, "Thread death: Uncaught exception on worker thread");
        this.f11309i = new y4(this, "Thread death: Uncaught exception on network thread");
    }

    static /* synthetic */ a5 p(w4 w4Var, a5 a5Var) {
        w4Var.f11304d = null;
        return null;
    }

    private final void t(x4<?> x4Var) {
        synchronized (this.f11310j) {
            this.f11306f.add(x4Var);
            a5 a5Var = this.f11304d;
            if (a5Var == null) {
                a5 a5Var2 = new a5(this, "Measurement Worker", this.f11306f);
                this.f11304d = a5Var2;
                a5Var2.setUncaughtExceptionHandler(this.f11308h);
                this.f11304d.start();
            } else {
                a5Var.a();
            }
        }
    }

    static /* synthetic */ a5 v(w4 w4Var, a5 a5Var) {
        w4Var.f11305e = null;
        return null;
    }

    public final void A(Runnable runnable) {
        l();
        com.google.android.gms.common.internal.p.j(runnable);
        x4<?> x4Var = new x4<>(this, runnable, false, "Task exception on network thread");
        synchronized (this.f11310j) {
            this.f11307g.add(x4Var);
            a5 a5Var = this.f11305e;
            if (a5Var == null) {
                a5 a5Var2 = new a5(this, "Measurement Network", this.f11307g);
                this.f11305e = a5Var2;
                a5Var2.setUncaughtExceptionHandler(this.f11309i);
                this.f11305e.start();
            } else {
                a5Var.a();
            }
        }
    }

    public final boolean D() {
        return Thread.currentThread() == this.f11304d;
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final void c() {
        if (Thread.currentThread() != this.f11305e) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final void d() {
        if (Thread.currentThread() != this.f11304d) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ l e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ t3 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ da g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ i4 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ c i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.w5
    protected final boolean o() {
        return false;
    }

    final <T> T q(AtomicReference<T> atomicReference, long j2, String str, Runnable runnable) {
        synchronized (atomicReference) {
            zzp().u(runnable);
            try {
                atomicReference.wait(j2);
            } catch (InterruptedException unused) {
                x3 x3VarD = zzq().D();
                String strValueOf = String.valueOf(str);
                x3VarD.a(strValueOf.length() != 0 ? "Interrupted waiting for ".concat(strValueOf) : new String("Interrupted waiting for "));
                return null;
            }
        }
        T t = atomicReference.get();
        if (t == null) {
            x3 x3VarD2 = zzq().D();
            String strValueOf2 = String.valueOf(str);
            x3VarD2.a(strValueOf2.length() != 0 ? "Timed out waiting for ".concat(strValueOf2) : new String("Timed out waiting for "));
        }
        return t;
    }

    public final <V> Future<V> r(Callable<V> callable) {
        l();
        com.google.android.gms.common.internal.p.j(callable);
        x4<?> x4Var = new x4<>(this, (Callable<?>) callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f11304d) {
            if (!this.f11306f.isEmpty()) {
                zzq().D().a("Callable skipped the worker queue.");
            }
            x4Var.run();
        } else {
            t(x4Var);
        }
        return x4Var;
    }

    public final void u(Runnable runnable) {
        l();
        com.google.android.gms.common.internal.p.j(runnable);
        t(new x4<>(this, runnable, false, "Task exception on worker thread"));
    }

    public final <V> Future<V> w(Callable<V> callable) {
        l();
        com.google.android.gms.common.internal.p.j(callable);
        x4<?> x4Var = new x4<>(this, (Callable<?>) callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f11304d) {
            x4Var.run();
        } else {
            t(x4Var);
        }
        return x4Var;
    }

    public final void x(Runnable runnable) {
        l();
        com.google.android.gms.common.internal.p.j(runnable);
        t(new x4<>(this, runnable, true, "Task exception on worker thread"));
    }

    @Override // com.google.android.gms.measurement.internal.x5, com.google.android.gms.measurement.internal.z5
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.f zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.x5, com.google.android.gms.measurement.internal.z5
    public final /* bridge */ /* synthetic */ Context zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.x5, com.google.android.gms.measurement.internal.z5
    public final /* bridge */ /* synthetic */ w4 zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.x5, com.google.android.gms.measurement.internal.z5
    public final /* bridge */ /* synthetic */ v3 zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.x5, com.google.android.gms.measurement.internal.z5
    public final /* bridge */ /* synthetic */ ta zzt() {
        return super.zzt();
    }
}