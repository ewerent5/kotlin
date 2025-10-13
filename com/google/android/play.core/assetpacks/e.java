package com.google.android.play.core.assetpacks;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class e extends e.c.b.d.a.b.g {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f11968f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f11969g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ String f11970h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f11971i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ e.c.b.d.a.f.p f11972j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ o f11973k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(o oVar, e.c.b.d.a.f.p pVar, int i2, String str, String str2, int i3, e.c.b.d.a.f.p pVar2) {
        super(pVar);
        this.f11973k = oVar;
        this.f11968f = i2;
        this.f11969g = str;
        this.f11970h = str2;
        this.f11971i = i3;
        this.f11972j = pVar2;
    }

    @Override // e.c.b.d.a.b.g
    protected final void a() {
        try {
            ((e.c.b.d.a.b.o0) this.f11973k.f12105e.c()).l4(this.f11973k.f12103c, o.q(this.f11968f, this.f11969g, this.f11970h, this.f11971i), o.j(), new j(this.f11973k, this.f11972j, (char[]) null));
        } catch (RemoteException e2) {
            o.a.c(e2, "notifyChunkTransferred", new Object[0]);
        }
    }
}