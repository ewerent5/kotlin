package com.google.android.gms.internal.ads;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class dx implements fx {
    private final ew a;

    dx(ew ewVar) {
        this.a = ewVar;
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void a(Uri uri) {
        lw lwVarL0 = ((xw) this.a).L0();
        if (lwVarL0 == null) {
            er.zzf("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            lwVarL0.J(uri);
        }
    }
}