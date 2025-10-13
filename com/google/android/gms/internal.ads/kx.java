package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@TargetApi(21)
/* loaded from: classes.dex */
public final class kx extends jx {
    public kx(ew ewVar, w43 w43Var, boolean z) {
        super(ewVar, w43Var, z);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return K0(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}