package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zzs;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@TargetApi(11)
/* loaded from: classes.dex */
public class jx extends lw {
    public jx(ew ewVar, w43 w43Var, boolean z) {
        super(ewVar, w43Var, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final WebResourceResponse K0(WebView webView, String str, Map<String, String> map) {
        String str2;
        if (!(webView instanceof ew)) {
            er.zzi("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        ew ewVar = (ew) webView;
        ho hoVar = this.y;
        if (hoVar != null) {
            hoVar.b(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.I0(str, map);
        }
        if (ewVar.E0() != null) {
            ewVar.E0().zzA();
        }
        if (ewVar.e().g()) {
            str2 = (String) c.c().b(w3.J);
        } else if (ewVar.r()) {
            str2 = (String) c.c().b(w3.I);
        } else {
            str2 = (String) c.c().b(w3.H);
        }
        zzs.zzc();
        return zzr.zzA(ewVar.getContext(), ewVar.zzt().f7054e, str2);
    }
}