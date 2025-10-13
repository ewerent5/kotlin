package com.google.android.play.core.assetpacks;

import java.util.List;

/* loaded from: classes.dex */
final /* synthetic */ class e2 implements e.c.b.d.a.f.c {
    private final v a;

    private e2(v vVar) {
        this.a = vVar;
    }

    static e.c.b.d.a.f.c a(v vVar) {
        return new e2(vVar);
    }

    @Override // e.c.b.d.a.f.c
    public final void onSuccess(Object obj) {
        this.a.a((List) obj);
    }
}