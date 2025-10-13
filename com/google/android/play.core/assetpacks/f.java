package com.google.android.play.core.assetpacks;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class f extends e.c.b.d.a.b.g {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f11977f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f11978g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ e.c.b.d.a.f.p f11979h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f11980i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ o f11981j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(o oVar, e.c.b.d.a.f.p pVar, int i2, String str, e.c.b.d.a.f.p pVar2, int i3) {
        super(pVar);
        this.f11981j = oVar;
        this.f11977f = i2;
        this.f11978g = str;
        this.f11979h = pVar2;
        this.f11980i = i3;
    }

    @Override // e.c.b.d.a.b.g
    protected final void a() {
        try {
            ((e.c.b.d.a.b.o0) this.f11981j.f12105e.c()).u0(this.f11981j.f12103c, o.h(this.f11977f, this.f11978g), o.j(), new n(this.f11981j, this.f11979h, this.f11977f, this.f11978g, this.f11980i));
        } catch (RemoteException e2) {
            o.a.c(e2, "notifyModuleCompleted", new Object[0]);
        }
    }
}