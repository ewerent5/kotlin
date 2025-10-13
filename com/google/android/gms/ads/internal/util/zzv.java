package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.os.Environment;
import android.os.StatFs;
import android.view.View;
import okhttp3.internal.ws.RealWebSocket;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@TargetApi(18)
/* loaded from: classes.dex */
public class zzv extends zzu {
    @Override // com.google.android.gms.ads.internal.util.zzac
    public boolean zzg(View view) {
        return super.zzg(view) || view.getWindowId() != null;
    }

    @Override // com.google.android.gms.ads.internal.util.zzac
    public final int zzh() {
        return 14;
    }

    @Override // com.google.android.gms.ads.internal.util.zzac
    public final long zzi() {
        return new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
    }
}