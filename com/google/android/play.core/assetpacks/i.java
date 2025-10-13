package com.google.android.play.core.assetpacks;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class i extends e.c.b.d.a.b.g {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ e.c.b.d.a.f.p f12031f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ o f12032g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(o oVar, e.c.b.d.a.f.p pVar, e.c.b.d.a.f.p pVar2) {
        super(pVar);
        this.f12032g = oVar;
        this.f12031f = pVar2;
    }

    @Override // e.c.b.d.a.b.g
    protected final void a() {
        try {
            ((e.c.b.d.a.b.o0) this.f12032g.f12106f.c()).B1(this.f12032g.f12103c, o.j(), new m(this.f12032g, this.f12031f));
        } catch (RemoteException e2) {
            o.a.c(e2, "keepAlive", new Object[0]);
        }
    }
}