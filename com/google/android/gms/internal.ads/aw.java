package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class aw implements DialogInterface.OnClickListener {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ JsPromptResult f5005e;

    aw(JsPromptResult jsPromptResult) {
        this.f5005e = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f5005e.cancel();
    }
}