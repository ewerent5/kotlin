package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class wq2 implements Callable {
    private final gq2 a;

    /* renamed from: b, reason: collision with root package name */
    private final eu0 f10018b;

    public wq2(gq2 gq2Var, eu0 eu0Var) {
        this.a = gq2Var;
        this.f10018b = eu0Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws ExecutionException, InterruptedException {
        if (this.a.n() != null) {
            this.a.n().get();
        }
        u91 u91VarM = this.a.m();
        if (u91VarM == null) {
            return null;
        }
        try {
            synchronized (this.f10018b) {
                eu0 eu0Var = this.f10018b;
                byte[] bArrI = u91VarM.i();
                eu0Var.p(bArrI, 0, bArrI.length, qi2.a());
            }
            return null;
        } catch (qj2 | NullPointerException unused) {
            return null;
        }
    }
}