package com.google.android.play.core.assetpacks;

import android.os.Bundle;

/* loaded from: classes.dex */
final /* synthetic */ class q implements Runnable {

    /* renamed from: e */
    private final s f12114e;

    /* renamed from: f */
    private final Bundle f12115f;

    /* renamed from: g */
    private final AssetPackState f12116g;

    q(s sVar, Bundle bundle, AssetPackState assetPackState) {
        this.f12114e = sVar;
        this.f12115f = bundle;
        this.f12116g = assetPackState;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12114e.h(this.f12115f, this.f12116g);
    }
}