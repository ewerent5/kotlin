package com.google.android.gms.ads.internal.util;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.internal.ads.er;
import com.google.android.gms.internal.ads.ew;
import com.google.android.gms.internal.ads.kx;
import com.google.android.gms.internal.ads.lw;
import com.google.android.gms.internal.ads.w43;
import java.io.InputStream;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@TargetApi(21)
/* loaded from: classes.dex */
public class zzx extends zzw {
    @Override // com.google.android.gms.ads.internal.util.zzac
    public final CookieManager zzk(Context context) {
        if (!zzac.zzu()) {
            try {
                return CookieManager.getInstance();
            } catch (Throwable th) {
                er.zzg("Failed to obtain CookieManager.", th);
                com.google.android.gms.ads.internal.zzs.zzg().g(th, "ApiLevelUtil.getCookieManager");
            }
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.util.zzac
    public final lw zzl(ew ewVar, w43 w43Var, boolean z) {
        return new kx(ewVar, w43Var, z);
    }

    @Override // com.google.android.gms.ads.internal.util.zzac
    public final int zzm() {
        return R.style.Theme.Material.Dialog.Alert;
    }

    @Override // com.google.android.gms.ads.internal.util.zzac
    public final WebResourceResponse zzn(String str, String str2, int i2, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i2, str3, map, inputStream);
    }
}