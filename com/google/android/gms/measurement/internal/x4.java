package com.google.android.gms.measurement.internal;

import e.c.b.b.c.e.sb;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class x4<V> extends FutureTask<V> implements Comparable<x4<V>> {

    /* renamed from: e, reason: collision with root package name */
    private final long f11330e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f11331f;

    /* renamed from: g, reason: collision with root package name */
    private final String f11332g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ w4 f11333h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x4(w4 w4Var, Callable<V> callable, boolean z, String str) {
        super(sb.a().a(callable));
        this.f11333h = w4Var;
        com.google.android.gms.common.internal.p.j(str);
        long andIncrement = w4.f11303c.getAndIncrement();
        this.f11330e = andIncrement;
        this.f11332g = str;
        this.f11331f = z;
        if (andIncrement == Long.MAX_VALUE) {
            w4Var.zzq().A().a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        x4 x4Var = (x4) obj;
        boolean z = this.f11331f;
        if (z != x4Var.f11331f) {
            return z ? -1 : 1;
        }
        long j2 = this.f11330e;
        long j3 = x4Var.f11330e;
        if (j2 < j3) {
            return -1;
        }
        if (j2 > j3) {
            return 1;
        }
        this.f11333h.zzq().B().b("Two tasks share the same index. index", Long.valueOf(this.f11330e));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        this.f11333h.zzq().A().b(this.f11332g, th);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x4(w4 w4Var, Runnable runnable, boolean z, String str) {
        super(sb.a().c(runnable), null);
        this.f11333h = w4Var;
        com.google.android.gms.common.internal.p.j(str);
        long andIncrement = w4.f11303c.getAndIncrement();
        this.f11330e = andIncrement;
        this.f11332g = str;
        this.f11331f = z;
        if (andIncrement == Long.MAX_VALUE) {
            w4Var.zzq().A().a("Tasks index overflow");
        }
    }
}