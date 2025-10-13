package com.google.android.gms.ads;

import android.content.Context;
import android.webkit.WebView;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.internal.ads.c2;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public class MobileAds {

    @RecentlyNonNull
    public static final String ERROR_DOMAIN = "com.google.android.gms.ads";

    private MobileAds() {
    }

    public static void disableMediationAdapterInitialization(@RecentlyNonNull Context context) {
        c2.a().k(context);
    }

    @RecentlyNullable
    public static InitializationStatus getInitializationStatus() {
        return c2.a().j();
    }

    public static RequestConfiguration getRequestConfiguration() {
        return c2.a().m();
    }

    @RecentlyNonNull
    public static String getVersionString() {
        return c2.a().h();
    }

    public static void initialize(@RecentlyNonNull Context context) {
        c2.a().b(context, null, null);
    }

    public static void openAdInspector(@RecentlyNonNull Context context, @RecentlyNonNull OnAdInspectorClosedListener onAdInspectorClosedListener) {
        c2.a().l(context, onAdInspectorClosedListener);
    }

    public static void openDebugMenu(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        c2.a().g(context, str);
    }

    public static void registerRtbAdapter(@RecentlyNonNull Class<? extends RtbAdapter> cls) {
        c2.a().i(cls);
    }

    public static void registerWebView(@RecentlyNonNull WebView webView) {
        c2.a().o(webView);
    }

    public static void setAppMuted(boolean z) {
        c2.a().e(z);
    }

    public static void setAppVolume(float f2) {
        c2.a().c(f2);
    }

    public static void setRequestConfiguration(@RecentlyNonNull RequestConfiguration requestConfiguration) {
        c2.a().n(requestConfiguration);
    }

    public static void initialize(@RecentlyNonNull Context context, @RecentlyNonNull OnInitializationCompleteListener onInitializationCompleteListener) {
        c2.a().b(context, null, onInitializationCompleteListener);
    }
}