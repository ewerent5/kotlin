package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import java.util.Map;

/* loaded from: classes.dex */
final class v2 extends e.c.b.d.a.b.g {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Map f12172f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ e.c.b.d.a.f.p f12173g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ o f12174h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v2(o oVar, e.c.b.d.a.f.p pVar, Map map, e.c.b.d.a.f.p pVar2) {
        super(pVar);
        this.f12174h = oVar;
        this.f12172f = map;
        this.f12173g = pVar2;
    }

    @Override // e.c.b.d.a.b.g
    protected final void a() {
        try {
            ((e.c.b.d.a.b.o0) this.f12174h.f12105e.c()).W3(this.f12174h.f12103c, o.m(this.f12172f), new l(this.f12174h, this.f12173g));
        } catch (RemoteException e2) {
            o.a.c(e2, "syncPacks", new Object[0]);
            this.f12173g.d(new RuntimeException(e2));
        }
    }
}