package com.google.android.gms.internal.ads;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.zzb;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@TargetApi(11)
/* loaded from: classes.dex */
public final class dw extends WebChromeClient {
    private final ew a;

    public dw(ew ewVar) {
        this.a = ewVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Context b(WebView webView) {
        if (!(webView instanceof ew)) {
            return webView.getContext();
        }
        ew ewVar = (ew) webView;
        Activity activityZzj = ewVar.zzj();
        return activityZzj != null ? activityZzj : ewVar.getContext();
    }

    protected final boolean a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        ew ewVar;
        zzb zzbVarZzb;
        try {
            ewVar = this.a;
        } catch (WindowManager.BadTokenException e2) {
            er.zzj("Fail to display Dialog.", e2);
        }
        if (ewVar != null && ewVar.E0() != null && this.a.E0().zzb() != null && (zzbVarZzb = this.a.E0().zzb()) != null && !zzbVarZzb.zzb()) {
            StringBuilder sb = new StringBuilder(str.length() + 11 + String.valueOf(str3).length());
            sb.append("window.");
            sb.append(str);
            sb.append("('");
            sb.append(str3);
            sb.append("')");
            zzbVarZzb.zzc(sb.toString());
            return false;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(str2);
        if (z) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(str3);
            EditText editText = new EditText(context);
            editText.setText(str4);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            builder.setView(linearLayout).setPositiveButton(R.string.ok, new bw(jsPromptResult, editText)).setNegativeButton(R.string.cancel, new aw(jsPromptResult)).setOnCancelListener(new zv(jsPromptResult)).create().show();
        } else {
            builder.setMessage(str3).setPositiveButton(R.string.ok, new xv(jsResult)).setNegativeButton(R.string.cancel, new wv(jsResult)).setOnCancelListener(new vv(jsResult)).create().show();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof ew)) {
            er.zzi("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        zzm zzmVarP = ((ew) webView).p();
        if (zzmVarP == null) {
            er.zzi("Tried to close an AdWebView not associated with an overlay.");
        } else {
            zzmVarP.zzb();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String strMessage = consoleMessage.message();
        String strSourceId = consoleMessage.sourceId();
        int iLineNumber = consoleMessage.lineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(strMessage).length() + 19 + String.valueOf(strSourceId).length());
        sb.append("JS: ");
        sb.append(strMessage);
        sb.append(" (");
        sb.append(strSourceId);
        sb.append(":");
        sb.append(iLineNumber);
        sb.append(")");
        String string = sb.toString();
        if (string.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i2 = cw.a[consoleMessage.messageLevel().ordinal()];
        if (i2 == 1) {
            er.zzf(string);
        } else if (i2 == 2) {
            er.zzi(string);
        } else if (i2 == 3 || i2 == 4 || i2 != 5) {
            er.zzh(string);
        } else {
            er.zzd(string);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.a.f0() != null) {
            webView2.setWebViewClient(this.a.f0());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j2, long j3, long j4, WebStorage.QuotaUpdater quotaUpdater) {
        long j5 = 5242880 - j4;
        if (j5 <= 0) {
            quotaUpdater.updateQuota(j2);
            return;
        }
        if (j2 == 0) {
            if (j3 > j5 || j3 > 1048576) {
                j3 = 0;
            }
        } else if (j3 == 0) {
            j3 = Math.min(j2 + Math.min(131072L, j5), 1048576L);
        } else {
            if (j3 <= Math.min(1048576 - j2, j5)) {
                j2 += j3;
            }
            j3 = j2;
        }
        quotaUpdater.updateQuota(j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onGeolocationPermissionsShowPrompt(java.lang.String r4, android.webkit.GeolocationPermissions.Callback r5) {
        /*
            r3 = this;
            if (r5 == 0) goto L2c
            com.google.android.gms.ads.internal.zzs.zzc()
            com.google.android.gms.internal.ads.ew r0 = r3.a
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r0 = com.google.android.gms.ads.internal.util.zzr.zzD(r0, r1)
            r1 = 1
            if (r0 != 0) goto L28
            com.google.android.gms.ads.internal.zzs.zzc()
            com.google.android.gms.internal.ads.ew r0 = r3.a
            android.content.Context r0 = r0.getContext()
            java.lang.String r2 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r0 = com.google.android.gms.ads.internal.util.zzr.zzD(r0, r2)
            if (r0 == 0) goto L26
            goto L28
        L26:
            r0 = 0
            goto L29
        L28:
            r0 = 1
        L29:
            r5.invoke(r4, r0, r1)
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dw.onGeolocationPermissionsShowPrompt(java.lang.String, android.webkit.GeolocationPermissions$Callback):void");
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        zzm zzmVarP = this.a.p();
        if (zzmVarP == null) {
            er.zzi("Could not get ad overlay when hiding custom view.");
        } else {
            zzmVarP.zzc();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return a(b(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    public final void onReachedMaxAppCacheSize(long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = j2 + 131072;
        if (5242880 - j3 < j4) {
            quotaUpdater.updateQuota(0L);
        } else {
            quotaUpdater.updateQuota(j4);
        }
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onShowCustomView(View view, int i2, WebChromeClient.CustomViewCallback customViewCallback) {
        zzm zzmVarP = this.a.p();
        if (zzmVarP == null) {
            er.zzi("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
        } else {
            zzmVarP.zzx(view, customViewCallback);
            zzmVarP.zzw(i2);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}