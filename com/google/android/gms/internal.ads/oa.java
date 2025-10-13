package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class oa implements pa {
    final /* synthetic */ wr a;

    oa(qa qaVar, wr wrVar) {
        this.a = wrVar;
    }

    @Override // com.google.android.gms.internal.ads.pa
    public final void c(String str) {
        this.a.zzd(new je(str));
    }

    @Override // com.google.android.gms.internal.ads.pa
    public final void d(JSONObject jSONObject) {
        this.a.zzc(jSONObject);
    }
}