package com.google.android.play.core.assetpacks;

/* loaded from: classes.dex */
final /* synthetic */ class p implements Runnable {

    /* renamed from: e */
    private final s f12110e;

    /* renamed from: f */
    private final AssetPackState f12111f;

    p(s sVar, AssetPackState assetPackState) {
        this.f12110e = sVar;
        this.f12111f = assetPackState;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12110e.d(this.f12111f);
    }
}