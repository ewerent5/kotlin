package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public abstract class jt1<E> {
    private static final g52<?> a = y42.a(null);

    /* renamed from: b, reason: collision with root package name */
    private final h52 f6842b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f6843c;

    /* renamed from: d, reason: collision with root package name */
    private final kt1<E> f6844d;

    public jt1(h52 h52Var, ScheduledExecutorService scheduledExecutorService, kt1<E> kt1Var) {
        this.f6842b = h52Var;
        this.f6843c = scheduledExecutorService;
        this.f6844d = kt1Var;
    }

    public final <I> it1<I> a(E e2, g52<I> g52Var) {
        return new it1<>(this, e2, g52Var, Collections.singletonList(g52Var), g52Var);
    }

    public final at1 b(E e2, g52<?>... g52VarArr) {
        return new at1(this, e2, Arrays.asList(g52VarArr), null);
    }

    protected abstract String c(E e2);
}