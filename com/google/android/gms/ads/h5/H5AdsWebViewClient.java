package com.google.android.gms.ads.h5;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.internal.ads.gb;
import com.google.android.gms.internal.ads.ta;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class H5AdsWebViewClient extends ta {
    private final gb zza;

    public H5AdsWebViewClient(@RecentlyNonNull Context context, @RecentlyNonNull WebView webView) {
        this.zza = new gb(context, webView);
    }

    public void clearAdObjects() {
        this.zza.a();
    }

    @Override // com.google.android.gms.internal.ads.ta
    @RecentlyNonNull
    protected WebViewClient getDelegate() {
        return this.zza;
    }

    @RecentlyNullable
    public WebViewClient getDelegateWebViewClient() {
        return this.zza.getDelegate();
    }

    public void setDelegateWebViewClient(WebViewClient webViewClient) {
        this.zza.b(webViewClient);
    }
}