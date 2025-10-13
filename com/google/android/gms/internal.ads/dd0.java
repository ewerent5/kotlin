package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class dd0 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final WeakReference<ed0> f5465e;

    /* synthetic */ dd0(ed0 ed0Var, cd0 cd0Var) {
        this.f5465e = new WeakReference<>(ed0Var);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ed0 ed0Var = this.f5465e.get();
        if (ed0Var != null) {
            ed0Var.J0(bd0.a);
        }
    }
}