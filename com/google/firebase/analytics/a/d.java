package com.google.firebase.analytics.a;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-measurement-api@@18.0.0 */
/* loaded from: classes.dex */
final /* synthetic */ class d implements Executor {

    /* renamed from: e, reason: collision with root package name */
    static final Executor f12249e = new d();

    private d() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}