package com.google.android.play.core.assetpacks;

import android.os.Bundle;

/* loaded from: classes.dex */
final class m extends j<Void> {

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ o f12076g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(o oVar, e.c.b.d.a.f.p<Void> pVar) {
        super(oVar, pVar);
        this.f12076g = oVar;
    }

    @Override // com.google.android.play.core.assetpacks.j, e.c.b.d.a.b.q0
    public final void m3(Bundle bundle, Bundle bundle2) {
        super.m3(bundle, bundle2);
        if (!this.f12076g.f12107g.compareAndSet(true, false)) {
            o.a.e("Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            this.f12076g.a();
        }
    }
}