package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import com.google.android.gms.internal.ads.c;
import com.google.android.gms.internal.ads.er;
import com.google.android.gms.internal.ads.ew;
import com.google.android.gms.internal.ads.ix;
import com.google.android.gms.internal.ads.lw;
import com.google.android.gms.internal.ads.p63;
import com.google.android.gms.internal.ads.w3;
import com.google.android.gms.internal.ads.w43;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@TargetApi(16)
/* loaded from: classes.dex */
public class zzac {
    private zzac() {
    }

    /* synthetic */ zzac(zzt zztVar) {
    }

    public static zzac zzt(int i2) {
        return i2 >= 28 ? new zzab() : i2 >= 26 ? new zzz() : i2 >= 24 ? new zzy() : i2 >= 21 ? new zzx() : i2 >= 19 ? new zzw() : i2 >= 18 ? new zzv() : i2 >= 17 ? new zzu() : new zzac();
    }

    public static final boolean zzu() {
        int iMyUid = Process.myUid();
        return iMyUid == 0 || iMyUid == 1000;
    }

    public boolean zza(final Context context, final WebSettings webSettings) {
        zzbr.zza(context, new Callable(context, webSettings) { // from class: com.google.android.gms.ads.internal.util.zzs
            private final Context zza;
            private final WebSettings zzb;

            {
                this.zza = context;
                this.zzb = webSettings;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = this.zza;
                WebSettings webSettings2 = this.zzb;
                if (context2.getCacheDir() != null) {
                    webSettings2.setAppCachePath(context2.getCacheDir().getAbsolutePath());
                    webSettings2.setAppCacheMaxSize(0L);
                    webSettings2.setAppCacheEnabled(true);
                }
                webSettings2.setDatabasePath(context2.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
                webSettings2.setDatabaseEnabled(true);
                webSettings2.setDomStorageEnabled(true);
                webSettings2.setDisplayZoomControls(false);
                webSettings2.setBuiltInZoomControls(true);
                webSettings2.setSupportZoom(true);
                if (((Boolean) c.c().b(w3.w0)).booleanValue()) {
                    webSettings2.setTextZoom(100);
                }
                webSettings2.setAllowContentAccess(false);
                return Boolean.TRUE;
            }
        });
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
        return true;
    }

    public String zzb(Context context) {
        return "";
    }

    public void zzc(Context context) {
    }

    public Drawable zzd(Context context, Bitmap bitmap, boolean z, float f2) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    public int zze(ContentResolver contentResolver) {
        return Settings.System.getInt(contentResolver, "wifi_on", 0);
    }

    public int zzf(ContentResolver contentResolver) {
        return Settings.System.getInt(contentResolver, "airplane_mode_on", 0);
    }

    public boolean zzg(View view) {
        return (view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true;
    }

    public int zzh() {
        return 5;
    }

    public long zzi() {
        return -1L;
    }

    public ViewGroup.LayoutParams zzj() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    public CookieManager zzk(Context context) {
        if (!zzu()) {
            try {
                CookieSyncManager.createInstance(context);
                return CookieManager.getInstance();
            } catch (Throwable th) {
                er.zzg("Failed to obtain CookieManager.", th);
                com.google.android.gms.ads.internal.zzs.zzg().g(th, "ApiLevelUtil.getCookieManager");
            }
        }
        return null;
    }

    public lw zzl(ew ewVar, w43 w43Var, boolean z) {
        return new ix(ewVar, w43Var, z);
    }

    public int zzm() {
        return 1;
    }

    public WebResourceResponse zzn(String str, String str2, int i2, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    public boolean zzo(Activity activity, Configuration configuration) {
        return false;
    }

    public p63 zzq(Context context, TelephonyManager telephonyManager) {
        return p63.ENUM_UNKNOWN;
    }

    public void zzr(Activity activity) {
    }
}