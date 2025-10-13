package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.x02;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzi implements x02 {
    static final x02 zza = new zzi();

    private zzi() {
    }

    @Override // com.google.android.gms.internal.ads.x02
    public final Object apply(Object obj) {
        int i2 = zzp.zze;
        return ((JSONObject) obj).optString("nas");
    }
}