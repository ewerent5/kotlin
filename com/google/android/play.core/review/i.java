package com.google.android.play.core.review;

import android.os.Bundle;
import e.c.b.d.a.f.p;

/* loaded from: classes.dex */
class i<T> extends e.c.b.d.a.b.d {

    /* renamed from: e, reason: collision with root package name */
    final e.c.b.d.a.b.f f12226e;

    /* renamed from: f, reason: collision with root package name */
    final p<T> f12227f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ k f12228g;

    i(k kVar, e.c.b.d.a.b.f fVar, p<T> pVar) {
        this.f12228g = kVar;
        this.f12226e = fVar;
        this.f12227f = pVar;
    }

    @Override // e.c.b.d.a.b.e
    public void V1(Bundle bundle) {
        this.f12228g.f12229b.b();
        this.f12226e.d("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}