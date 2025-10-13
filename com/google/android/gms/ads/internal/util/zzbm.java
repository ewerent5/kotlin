package com.google.android.gms.ads.internal.util;

import android.graphics.Bitmap;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zzbm {
    final Map<Integer, Bitmap> zza = new ConcurrentHashMap();
    private final AtomicInteger zzb = new AtomicInteger(0);

    public final Bitmap zza(Integer num) {
        return this.zza.get(num);
    }
}