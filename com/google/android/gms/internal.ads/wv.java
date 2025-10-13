package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class wv implements DialogInterface.OnClickListener {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ JsResult f10046e;

    wv(JsResult jsResult) {
        this.f10046e = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f10046e.cancel();
    }
}