package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class o33 {
    private final Executor a;

    public o33(Handler handler) {
        this.a = new m13(this, handler);
    }

    public final void a(d1<?> d1Var, j7<?> j7Var, Runnable runnable) {
        d1Var.zzp();
        d1Var.zzc("post-response");
        Executor executor = this.a;
        ((m13) executor).f7398e.post(new n23(d1Var, j7Var, runnable));
    }

    public final void b(d1<?> d1Var, ma maVar) {
        d1Var.zzc("post-error");
        j7 j7VarB = j7.b(maVar);
        Executor executor = this.a;
        ((m13) executor).f7398e.post(new n23(d1Var, j7VarB, null));
    }
}