package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class sa implements ba<Object> {
    private final ra a;

    public sa(ra raVar) {
        this.a = raVar;
    }

    public static void b(ew ewVar, ra raVar) {
        ewVar.T("/reward", new sa(raVar));
    }

    @Override // com.google.android.gms.internal.ads.ba
    public final void a(Object obj, Map<String, String> map) throws NumberFormatException {
        String str = map.get("action");
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.a.zza();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    this.a.zzc();
                    return;
                }
                return;
            }
        }
        tm tmVar = null;
        try {
            int i2 = Integer.parseInt(map.get("amount"));
            String str2 = map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                tmVar = new tm(str2, i2);
            }
        } catch (NumberFormatException e2) {
            er.zzj("Unable to parse reward amount.", e2);
        }
        this.a.x(tmVar);
    }
}