package com.google.android.play.core.review;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import e.c.b.d.a.f.p;

/* loaded from: classes.dex */
public final class e implements a {
    private final k a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f12223b = new Handler(Looper.getMainLooper());

    e(k kVar) {
        this.a = kVar;
    }

    @Override // com.google.android.play.core.review.a
    public final e.c.b.d.a.f.e<Void> a(Activity activity, ReviewInfo reviewInfo) {
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", reviewInfo.a());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        p pVar = new p();
        intent.putExtra("result_receiver", new d(this.f12223b, pVar));
        activity.startActivity(intent);
        return pVar.c();
    }

    @Override // com.google.android.play.core.review.a
    public final e.c.b.d.a.f.e<ReviewInfo> b() {
        return this.a.a();
    }
}