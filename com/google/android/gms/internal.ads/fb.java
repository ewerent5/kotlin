package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class fb implements OnH5AdsEventListener {
    private final WebView a;

    fb(WebView webView) {
        this.a = webView;
    }

    @Override // com.google.android.gms.ads.h5.OnH5AdsEventListener
    public final void onH5AdsEvent(String str) {
        WebView webView = this.a;
        int i2 = gb.a;
        webView.evaluateJavascript(str, null);
    }
}