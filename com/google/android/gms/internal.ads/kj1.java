package com.google.android.gms.internal.ads;

import android.os.Build;
import com.google.android.gms.ads.internal.util.zzbx;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class kj1 implements Callable {
    static final Callable a = new kj1();

    private kj1() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        HashMap map = new HashMap();
        String str = (String) c.c().b(w3.F);
        if (str != null && !str.isEmpty()) {
            if (Build.VERSION.SDK_INT >= ((Integer) c.c().b(w3.G)).intValue()) {
                for (String str2 : str.split(",", -1)) {
                    map.put(str2, zzbx.zza(str2));
                }
            }
        }
        return new mj1(map);
    }
}