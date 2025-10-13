package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.h5.H5AdsRequestHandler;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class gb extends ta {
    public static final /* synthetic */ int a = 0;

    /* renamed from: b, reason: collision with root package name */
    private WebViewClient f6096b;

    /* renamed from: c, reason: collision with root package name */
    private final H5AdsRequestHandler f6097c;

    /* renamed from: d, reason: collision with root package name */
    private final WebView f6098d;

    public gb(Context context, final WebView webView) {
        Objects.requireNonNull(context);
        Objects.requireNonNull(webView);
        h12.a(webView.getSettings().getJavaScriptEnabled(), "JavaScript must be enabled on the WebView.");
        this.f6098d = webView;
        this.f6097c = new H5AdsRequestHandler(context, new OnH5AdsEventListener(webView) { // from class: com.google.android.gms.internal.ads.fb
            private final WebView a;

            {
                this.a = webView;
            }

            @Override // com.google.android.gms.ads.h5.OnH5AdsEventListener
            public final void onH5AdsEvent(String str) {
                WebView webView2 = this.a;
                int i2 = gb.a;
                webView2.evaluateJavascript(str, null);
            }
        });
    }

    private final boolean c(WebView webView) {
        if (this.f6098d.equals(webView)) {
            return true;
        }
        er.zzf("H5AdsWebViewClient must be attached to the same WebVew which was passed in the constructor.");
        return false;
    }

    public final void a() {
        this.f6097c.clearAdObjects();
    }

    public final void b(WebViewClient webViewClient) {
        h12.a(webViewClient != this, "Delegate cannot be itself.");
        this.f6096b = webViewClient;
    }

    @Override // com.google.android.gms.internal.ads.ta
    public final WebViewClient getDelegate() {
        return this.f6096b;
    }

    @Override // com.google.android.gms.internal.ads.ta, android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        if (c(webView) && !this.f6097c.handleH5AdsRequest(str)) {
            super.onLoadResource(webView, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.ta, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (!c(this.f6098d)) {
            return false;
        }
        if (this.f6097c.handleH5AdsRequest(webResourceRequest.getUrl().toString())) {
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // com.google.android.gms.internal.ads.ta, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!c(webView)) {
            return false;
        }
        if (this.f6097c.handleH5AdsRequest(str)) {
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}