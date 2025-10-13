package com.google.android.play.core.review;

import android.os.RemoteException;
import e.c.b.d.a.f.p;

/* loaded from: classes.dex */
final class h extends e.c.b.d.a.b.g {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ p f12224f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ k f12225g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(k kVar, p pVar, p pVar2) {
        super(pVar);
        this.f12225g = kVar;
        this.f12224f = pVar2;
    }

    @Override // e.c.b.d.a.b.g
    protected final void a() {
        try {
            ((e.c.b.d.a.b.c) this.f12225g.f12229b.c()).k3(this.f12225g.f12230c, com.google.android.play.core.common.b.b("review"), new j(this.f12225g, this.f12224f));
        } catch (RemoteException e2) {
            k.a.c(e2, "error requesting in-app review for %s", this.f12225g.f12230c);
            this.f12224f.d(new RuntimeException(e2));
        }
    }
}