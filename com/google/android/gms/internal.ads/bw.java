package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class bw implements DialogInterface.OnClickListener {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ JsPromptResult f5197e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ EditText f5198f;

    bw(JsPromptResult jsPromptResult, EditText editText) {
        this.f5197e = jsPromptResult;
        this.f5198f = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f5197e.confirm(this.f5198f.getText().toString());
    }
}