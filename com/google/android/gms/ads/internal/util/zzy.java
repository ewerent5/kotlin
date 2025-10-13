package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.internal.ads.c;
import com.google.android.gms.internal.ads.ta3;
import com.google.android.gms.internal.ads.w3;
import com.google.android.gms.internal.ads.xq;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@TargetApi(SyslogConstants.LOG_DAEMON)
/* loaded from: classes.dex */
public class zzy extends zzx {
    static final boolean zzp(int i2, int i3, int i4) {
        return Math.abs(i2 - i3) <= i4;
    }

    @Override // com.google.android.gms.ads.internal.util.zzac
    public final boolean zzo(Activity activity, Configuration configuration) {
        if (!((Boolean) c.c().b(w3.Y2)).booleanValue()) {
            return false;
        }
        if (((Boolean) c.c().b(w3.a3)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        ta3.a();
        int iS = xq.s(activity, configuration.screenHeightDp);
        int iS2 = xq.s(activity, configuration.screenWidthDp);
        WindowManager windowManager = (WindowManager) activity.getApplicationContext().getSystemService("window");
        com.google.android.gms.ads.internal.zzs.zzc();
        DisplayMetrics displayMetricsZzy = zzr.zzy(windowManager);
        int i2 = displayMetricsZzy.heightPixels;
        int i3 = displayMetricsZzy.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int iRound = ((int) Math.round(activity.getResources().getDisplayMetrics().density + 0.5d)) * ((Integer) c.c().b(w3.W2)).intValue();
        return (zzp(i2, iS + dimensionPixelSize, iRound) && zzp(i3, iS2, iRound)) ? false : true;
    }
}