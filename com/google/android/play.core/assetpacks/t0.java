package com.google.android.play.core.assetpacks;

import java.util.List;

/* loaded from: classes.dex */
final /* synthetic */ class t0 implements z0 {
    private final a1 a;

    /* renamed from: b */
    private final List f12145b;

    /* renamed from: c */
    private final /* synthetic */ int f12146c = 1;

    t0(a1 a1Var, List list, byte[] bArr) {
        this.a = a1Var;
        this.f12145b = list;
    }

    @Override // com.google.android.play.core.assetpacks.z0
    public final Object a() {
        return this.f12146c != 0 ? this.a.i(this.f12145b) : this.a.h(this.f12145b);
    }
}