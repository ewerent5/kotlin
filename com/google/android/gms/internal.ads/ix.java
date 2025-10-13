package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@TargetApi(11)
/* loaded from: classes.dex */
public final class ix extends jx {
    public ix(ew ewVar, w43 w43Var, boolean z) {
        super(ewVar, w43Var, z);
    }

    @Override // com.google.android.gms.internal.ads.lw, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return K0(webView, str, null);
    }
}