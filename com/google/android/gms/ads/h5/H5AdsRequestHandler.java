package com.google.android.gms.ads.h5;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.eb;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class H5AdsRequestHandler {
    private final eb zza;

    public H5AdsRequestHandler(@RecentlyNonNull Context context, @RecentlyNonNull OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = new eb(context, onH5AdsEventListener);
    }

    public void clearAdObjects() {
        this.zza.b();
    }

    public boolean handleH5AdsRequest(@RecentlyNonNull String str) {
        return this.zza.a(str);
    }

    public boolean shouldInterceptRequest(@RecentlyNonNull String str) {
        return eb.c(str);
    }
}