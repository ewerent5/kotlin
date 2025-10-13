package com.google.android.play.core.assetpacks;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class h extends e.c.b.d.a.b.g {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f11997f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f11998g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ String f11999h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f12000i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ e.c.b.d.a.f.p f12001j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ o f12002k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(o oVar, e.c.b.d.a.f.p pVar, int i2, String str, String str2, int i3, e.c.b.d.a.f.p pVar2) {
        super(pVar);
        this.f12002k = oVar;
        this.f11997f = i2;
        this.f11998g = str;
        this.f11999h = str2;
        this.f12000i = i3;
        this.f12001j = pVar2;
    }

    @Override // e.c.b.d.a.b.g
    protected final void a() {
        try {
            ((e.c.b.d.a.b.o0) this.f12002k.f12105e.c()).C1(this.f12002k.f12103c, o.q(this.f11997f, this.f11998g, this.f11999h, this.f12000i), o.j(), new k(this.f12002k, this.f12001j));
        } catch (RemoteException e2) {
            o.a.b("getChunkFileDescriptor(%s, %s, %d, session=%d)", this.f11998g, this.f11999h, Integer.valueOf(this.f12000i), Integer.valueOf(this.f11997f));
            this.f12001j.d(new RuntimeException(e2));
        }
    }
}