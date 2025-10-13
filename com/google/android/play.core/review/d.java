package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import e.c.b.d.a.f.p;

/* loaded from: classes.dex */
final class d extends ResultReceiver {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ p f12222e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(Handler handler, p pVar) {
        super(handler);
        this.f12222e = pVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i2, Bundle bundle) {
        this.f12222e.e(null);
    }
}