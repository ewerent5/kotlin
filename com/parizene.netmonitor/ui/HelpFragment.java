package com.parizene.netmonitor.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import com.parizene.netmonitor.R;

/* compiled from: HelpFragment.kt */
/* loaded from: classes3.dex */
public final class HelpFragment extends Fragment {
    public static final a b0 = new a(null);
    private static final String c0 = "file:///android_asset/help/";
    private static final String d0 = i.y.d.l.i("file:///android_asset/help/", "help_gsm_ru.html");
    private static final String e0 = i.y.d.l.i("file:///android_asset/help/", "help_gsm.html");
    private static final String f0 = i.y.d.l.i("file:///android_asset/help/", "help_cdma_ru.html");
    private static final String g0 = i.y.d.l.i("file:///android_asset/help/", "help_cdma.html");
    public com.parizene.netmonitor.x h0;

    /* compiled from: HelpFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i.y.d.g gVar) {
            this();
        }
    }

    public final com.parizene.netmonitor.x I2() {
        com.parizene.netmonitor.x xVar = this.h0;
        if (xVar != null) {
            return xVar;
        }
        i.y.d.l.m("netmonitorManager");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void i1(Context context) {
        i.y.d.l.d(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        f.b.f.a.b(this);
        super.i1(context);
    }

    @Override // androidx.fragment.app.Fragment
    public View p1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i.y.d.l.d(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_help, viewGroup, false);
        WebView webView = (WebView) viewInflate.findViewById(R.id.webkit);
        WebSettings settings = webView.getSettings();
        i.y.d.l.c(settings, "webView.settings");
        settings.setSavePassword(false);
        settings.setSaveFormData(false);
        settings.setJavaScriptEnabled(false);
        settings.setSupportZoom(false);
        String language = com.parizene.netmonitor.h0.c(m2()).getLanguage();
        boolean z = i.y.d.l.a("ru", language) || i.y.d.l.a("be", language);
        if (I2().l()) {
            if (z) {
                webView.loadUrl(d0);
            } else {
                webView.loadUrl(e0);
            }
        } else if (I2().k()) {
            if (z) {
                webView.loadUrl(f0);
            } else {
                webView.loadUrl(g0);
            }
        }
        return viewInflate;
    }
}