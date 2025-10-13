package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Bundle;
import e.c.b.d.a.f.p;

/* loaded from: classes.dex */
final class j extends i<ReviewInfo> {
    j(k kVar, p pVar) {
        super(kVar, new e.c.b.d.a.b.f("OnRequestInstallCallback"), pVar);
    }

    @Override // com.google.android.play.core.review.i, e.c.b.d.a.b.e
    public final void V1(Bundle bundle) {
        super.V1(bundle);
        this.f12227f.e(ReviewInfo.b((PendingIntent) bundle.get("confirmation_intent")));
    }
}