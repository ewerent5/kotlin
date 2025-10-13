package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzs;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class a20 implements t10 {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final zzg f4814b = zzs.zzg().l();

    public a20(Context context) {
        this.a = context;
    }

    @Override // com.google.android.gms.internal.ads.t10
    public final void a(Map<String, String> map) {
        if (map.isEmpty()) {
            return;
        }
        String str = map.get("gad_idless");
        if (str != null) {
            boolean z = Boolean.parseBoolean(str);
            map.remove("gad_idless");
            if (((Boolean) c.c().b(w3.o0)).booleanValue()) {
                this.f4814b.zzA(z);
                if (((Boolean) c.c().b(w3.o4)).booleanValue() && z) {
                    this.a.deleteDatabase("OfflineUpload.db");
                }
            }
        }
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        if (((Boolean) c.c().b(w3.j0)).booleanValue()) {
            zzs.zzA().j(bundle);
        }
    }
}