package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class hq {
    public final g52<AdvertisingIdClient.Info> a(Context context, int i2) {
        wr wrVar = new wr();
        ta3.a();
        if (xq.o(context)) {
            qr.a.execute(new gq(this, context, wrVar));
        }
        return wrVar;
    }
}