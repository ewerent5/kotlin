package com.google.android.play.core.assetpacks;

import android.os.Bundle;

/* loaded from: classes.dex */
final /* synthetic */ class q0 implements z0 {
    private final a1 a;

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f12117b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f12118c = 0;

    q0(a1 a1Var, Bundle bundle) {
        this.a = a1Var;
        this.f12117b = bundle;
    }

    q0(a1 a1Var, Bundle bundle, byte[] bArr) {
        this.a = a1Var;
        this.f12117b = bundle;
    }

    @Override // com.google.android.play.core.assetpacks.z0
    public final Object a() {
        return this.f12118c != 0 ? this.a.k(this.f12117b) : this.a.j(this.f12117b);
    }
}