package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zzs;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class p9 implements ba<ew> {
    p9() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.ba
    public final /* bridge */ /* synthetic */ void a(ew ewVar, Map map) {
        ew ewVar2 = ewVar;
        WindowManager windowManager = (WindowManager) ewVar2.getContext().getSystemService("window");
        zzs.zzc();
        DisplayMetrics displayMetricsZzy = zzr.zzy(windowManager);
        int i2 = displayMetricsZzy.widthPixels;
        int i3 = displayMetricsZzy.heightPixels;
        int[] iArr = new int[2];
        HashMap map2 = new HashMap();
        ((View) ewVar2).getLocationInWindow(iArr);
        map2.put("xInPixels", Integer.valueOf(iArr[0]));
        map2.put("yInPixels", Integer.valueOf(iArr[1]));
        map2.put("windowWidthInPixels", Integer.valueOf(i2));
        map2.put("windowHeightInPixels", Integer.valueOf(i3));
        ewVar2.e0("locationReady", map2);
        er.zzi("GET LOCATION COMPILED");
    }
}