package com.google.android.play.core.assetpacks;

/* loaded from: classes.dex */
final /* synthetic */ class s0 implements z0 {
    private final a1 a;

    /* renamed from: b, reason: collision with root package name */
    private final int f12137b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f12138c = 0;

    s0(a1 a1Var, int i2) {
        this.a = a1Var;
        this.f12137b = i2;
    }

    s0(a1 a1Var, int i2, byte[] bArr) {
        this.a = a1Var;
        this.f12137b = i2;
    }

    @Override // com.google.android.play.core.assetpacks.z0
    public final Object a() {
        if (this.f12138c != 0) {
            this.a.m(this.f12137b);
            return null;
        }
        this.a.n(this.f12137b);
        return null;
    }
}