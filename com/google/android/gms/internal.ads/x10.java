package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzg;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class x10 implements t10 {
    private final zzg a;

    public x10(zzg zzgVar) {
        this.a = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.t10
    public final void a(Map<String, String> map) {
        this.a.zzg(Boolean.parseBoolean(map.get("content_vertical_opted_out")));
    }
}