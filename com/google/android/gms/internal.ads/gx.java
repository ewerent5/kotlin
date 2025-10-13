package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.internal.ads.hx;
import com.google.android.gms.internal.ads.ox;
import com.google.android.gms.internal.ads.qx;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@TargetApi(17)
/* loaded from: classes.dex */
public final class gx<WebViewT extends hx & ox & qx> {
    private final fx a;

    /* renamed from: b, reason: collision with root package name */
    private final WebViewT f6215b;

    public gx(WebViewT webviewt, fx fxVar) {
        this.a = fxVar;
        this.f6215b = webviewt;
    }

    final /* synthetic */ void a(String str) {
        this.a.a(Uri.parse(str));
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            zze.zza("Click string is empty, not proceeding.");
            return "";
        }
        ip2 ip2VarG = this.f6215b.g();
        if (ip2VarG == null) {
            zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zm2 zm2VarB = ip2VarG.b();
        if (zm2VarB == null) {
            zze.zza("Signals object is empty, ignoring.");
            return "";
        }
        if (this.f6215b.getContext() == null) {
            zze.zza("Context is null, ignoring.");
            return "";
        }
        Context context = this.f6215b.getContext();
        WebViewT webviewt = this.f6215b;
        return zm2VarB.zzh(context, str, (View) webviewt, webviewt.zzj());
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (TextUtils.isEmpty(str)) {
            er.zzi("URL is empty, ignoring message");
        } else {
            zzr.zza.post(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.ex

                /* renamed from: e, reason: collision with root package name */
                private final gx f5733e;

                /* renamed from: f, reason: collision with root package name */
                private final String f5734f;

                {
                    this.f5733e = this;
                    this.f5734f = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f5733e.a(this.f5734f);
                }
            });
        }
    }
}