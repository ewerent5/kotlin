package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class m13 implements Executor {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Handler f7398e;

    m13(o33 o33Var, Handler handler) {
        this.f7398e = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f7398e.post(runnable);
    }
}