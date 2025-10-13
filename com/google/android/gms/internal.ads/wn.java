package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class wn implements Runnable {

    /* renamed from: e */
    private final bo f9998e;

    /* renamed from: f */
    private final Bitmap f9999f;

    wn(bo boVar, Bitmap bitmap) {
        this.f9998e = boVar;
        this.f9999f = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9998e.e(this.f9999f);
    }
}