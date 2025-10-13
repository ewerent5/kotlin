package com.google.android.play.core.review;

import android.content.Context;
import android.content.Intent;
import e.c.b.d.a.b.p;
import e.c.b.d.a.b.t;

/* loaded from: classes.dex */
public final class k {
    private static final e.c.b.d.a.b.f a = new e.c.b.d.a.b.f("ReviewService");

    /* renamed from: b, reason: collision with root package name */
    p<e.c.b.d.a.b.c> f12229b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12230c;

    public k(Context context) {
        this.f12230c = context.getPackageName();
        if (t.a(context)) {
            this.f12229b = new p<>(context, a, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), f.a);
        }
    }

    public final e.c.b.d.a.f.e<ReviewInfo> a() {
        e.c.b.d.a.b.f fVar = a;
        fVar.d("requestInAppReview (%s)", this.f12230c);
        if (this.f12229b == null) {
            fVar.b("Play Store app is either not installed or not the official version", new Object[0]);
            return e.c.b.d.a.f.g.c(new g());
        }
        e.c.b.d.a.f.p pVar = new e.c.b.d.a.f.p();
        this.f12229b.a(new h(this, pVar, pVar));
        return pVar.c();
    }
}