package com.google.android.play.core.assetpacks;

import android.os.Bundle;

/* loaded from: classes.dex */
final /* synthetic */ class r implements Runnable {

    /* renamed from: e */
    private final s f12120e;

    /* renamed from: f */
    private final Bundle f12121f;

    r(s sVar, Bundle bundle) {
        this.f12120e = sVar;
        this.f12121f = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12120e.g(this.f12121f);
    }
}