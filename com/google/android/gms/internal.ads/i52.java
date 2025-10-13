package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class i52 implements Executor {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Executor f6485e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ f32 f6486f;

    i52(Executor executor, f32 f32Var) {
        this.f6485e = executor;
        this.f6486f = f32Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.f6485e.execute(runnable);
        } catch (RejectedExecutionException e2) {
            this.f6486f.m(e2);
        }
    }
}