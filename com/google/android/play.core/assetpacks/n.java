package com.google.android.play.core.assetpacks;

import android.os.Bundle;

/* loaded from: classes.dex */
final class n extends j<Void> {

    /* renamed from: g, reason: collision with root package name */
    final int f12088g;

    /* renamed from: h, reason: collision with root package name */
    final String f12089h;

    /* renamed from: i, reason: collision with root package name */
    final int f12090i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ o f12091j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(o oVar, e.c.b.d.a.f.p<Void> pVar, int i2, String str, int i3) {
        super(oVar, pVar);
        this.f12091j = oVar;
        this.f12088g = i2;
        this.f12089h = str;
        this.f12090i = i3;
    }

    @Override // com.google.android.play.core.assetpacks.j, e.c.b.d.a.b.q0
    public final void N3(Bundle bundle) {
        this.f12091j.f12105e.b();
        o.a.b("onError(%d), retrying notifyModuleCompleted...", Integer.valueOf(bundle.getInt("error_code")));
        int i2 = this.f12090i;
        if (i2 > 0) {
            this.f12091j.x(this.f12088g, this.f12089h, i2 - 1);
        }
    }
}