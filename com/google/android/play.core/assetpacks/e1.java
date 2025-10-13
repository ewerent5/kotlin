package com.google.android.play.core.assetpacks;

/* loaded from: classes.dex */
final /* synthetic */ class e1 implements Runnable {

    /* renamed from: e */
    private final h1 f11974e;

    /* renamed from: f */
    private final int f11975f;

    /* renamed from: g */
    private final String f11976g;

    e1(h1 h1Var, int i2, String str) {
        this.f11974e = h1Var;
        this.f11975f = i2;
        this.f11976g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11974e.j(this.f11975f, this.f11976g);
    }
}