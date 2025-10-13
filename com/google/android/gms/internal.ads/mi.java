package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class mi implements DialogInterface.OnClickListener {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ni f7492e;

    mi(ni niVar) {
        this.f7492e = niVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) throws JSONException {
        this.f7492e.b("Operation denied by user.");
    }
}