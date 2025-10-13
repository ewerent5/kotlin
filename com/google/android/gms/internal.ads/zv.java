package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class zv implements DialogInterface.OnCancelListener {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ JsPromptResult f10646e;

    zv(JsPromptResult jsPromptResult) {
        this.f10646e = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f10646e.cancel();
    }
}