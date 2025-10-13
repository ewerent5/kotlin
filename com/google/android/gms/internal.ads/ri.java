package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class ri implements DialogInterface.OnClickListener {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ si f8652e;

    ri(si siVar) {
        this.f8652e = siVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) throws JSONException {
        this.f8652e.b("User canceled the download.");
    }
}