package com.google.android.gms.internal.ads;

import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class gw implements Runnable {

    /* renamed from: e */
    private final lw f6212e;

    gw(lw lwVar) {
        this.f6212e = lwVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        this.f6212e.b();
    }
}