package com.google.android.play.core.assetpacks;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class g extends e.c.b.d.a.b.g {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f11982f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ e.c.b.d.a.f.p f11983g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ o f11984h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(o oVar, e.c.b.d.a.f.p pVar, int i2, e.c.b.d.a.f.p pVar2) {
        super(pVar);
        this.f11984h = oVar;
        this.f11982f = i2;
        this.f11983g = pVar2;
    }

    @Override // e.c.b.d.a.b.g
    protected final void a() {
        try {
            ((e.c.b.d.a.b.o0) this.f11984h.f12105e.c()).P0(this.f11984h.f12103c, o.i(this.f11982f), o.j(), new j(this.f11984h, this.f11983g, (int[]) null));
        } catch (RemoteException e2) {
            o.a.c(e2, "notifySessionFailed", new Object[0]);
        }
    }
}