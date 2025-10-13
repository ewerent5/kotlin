package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class a60 extends r40 {

    /* renamed from: i, reason: collision with root package name */
    private final h8 f4847i;

    /* renamed from: j, reason: collision with root package name */
    private final Runnable f4848j;

    /* renamed from: k, reason: collision with root package name */
    private final Executor f4849k;

    public a60(r60 r60Var, h8 h8Var, Runnable runnable, Executor executor) {
        super(r60Var);
        this.f4847i = h8Var;
        this.f4848j = runnable;
        this.f4849k = executor;
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void a() {
        final AtomicReference atomicReference = new AtomicReference(this.f4848j);
        final Runnable runnable = new Runnable(atomicReference) { // from class: com.google.android.gms.internal.ads.y50

            /* renamed from: e, reason: collision with root package name */
            private final AtomicReference f10379e;

            {
                this.f10379e = atomicReference;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Runnable runnable2 = (Runnable) this.f10379e.getAndSet(null);
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        };
        this.f4849k.execute(new Runnable(this, runnable) { // from class: com.google.android.gms.internal.ads.z50

            /* renamed from: e, reason: collision with root package name */
            private final a60 f10564e;

            /* renamed from: f, reason: collision with root package name */
            private final Runnable f10565f;

            {
                this.f10564e = this;
                this.f10565f = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f10564e.n(this.f10565f);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final View g() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final void h(ViewGroup viewGroup, r93 r93Var) {
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final n1 i() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final yo1 j() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final yo1 k() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final int l() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final void m() {
    }

    final /* synthetic */ void n(Runnable runnable) {
        try {
            if (this.f4847i.k(e.c.b.b.b.d.m4(runnable))) {
                return;
            }
            runnable.run();
        } catch (RemoteException unused) {
            runnable.run();
        }
    }
}