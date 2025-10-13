package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class iq1<T> {

    @GuardedBy("this")
    private final Deque<g52<T>> a = new LinkedBlockingDeque();

    /* renamed from: b, reason: collision with root package name */
    private final Callable<T> f6570b;

    /* renamed from: c, reason: collision with root package name */
    private final h52 f6571c;

    public iq1(Callable<T> callable, h52 h52Var) {
        this.f6570b = callable;
        this.f6571c = h52Var;
    }

    public final synchronized void a(int i2) {
        int size = i2 - this.a.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.a.add(this.f6571c.N(this.f6570b));
        }
    }

    public final synchronized g52<T> b() {
        a(1);
        return this.a.poll();
    }

    public final synchronized void c(g52<T> g52Var) {
        this.a.addFirst(g52Var);
    }
}