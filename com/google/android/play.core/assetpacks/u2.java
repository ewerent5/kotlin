package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import java.util.List;

/* loaded from: classes.dex */
final class u2 extends e.c.b.d.a.b.g {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ List f12163f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ e.c.b.d.a.f.p f12164g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ o f12165h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u2(o oVar, e.c.b.d.a.f.p pVar, List list, e.c.b.d.a.f.p pVar2) {
        super(pVar);
        this.f12165h = oVar;
        this.f12163f = list;
        this.f12164g = pVar2;
    }

    @Override // e.c.b.d.a.b.g
    protected final void a() {
        try {
            ((e.c.b.d.a.b.o0) this.f12165h.f12105e.c()).w0(this.f12165h.f12103c, o.k(this.f12163f), o.j(), new j(this.f12165h, this.f12164g, (byte[]) null));
        } catch (RemoteException e2) {
            o.a.c(e2, "cancelDownloads(%s)", this.f12163f);
        }
    }
}