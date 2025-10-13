package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class vv implements DialogInterface.OnCancelListener {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ JsResult f9789e;

    vv(JsResult jsResult) {
        this.f9789e = jsResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f9789e.cancel();
    }
}