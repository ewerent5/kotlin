package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class r23 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ View f8571e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ v23 f8572f;

    r23(v23 v23Var, View view) {
        this.f8572f = v23Var;
        this.f8571e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8572f.b(this.f8571e);
    }
}