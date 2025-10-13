package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class iw1 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final WebView f6625e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ jw1 f6626f;

    iw1(jw1 jw1Var) {
        this.f6626f = jw1Var;
        this.f6625e = jw1Var.f6870d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6625e.destroy();
    }
}