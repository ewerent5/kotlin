package com.google.android.play.core.assetpacks;

import android.content.Intent;

/* loaded from: classes.dex */
final /* synthetic */ class g1 implements Runnable {

    /* renamed from: e */
    private final h1 f11985e;

    /* renamed from: f */
    private final Intent f11986f;

    g1(h1 h1Var, Intent intent) {
        this.f11985e = h1Var;
        this.f11986f = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11985e.i(this.f11986f);
    }
}