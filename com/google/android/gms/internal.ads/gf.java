package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class gf implements pa {
    private final wr a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ hf f6112b;

    public gf(hf hfVar, wr wrVar) {
        this.f6112b = hfVar;
        this.a = wrVar;
    }

    @Override // com.google.android.gms.internal.ads.pa
    public final void c(String str) {
        try {
            if (str == null) {
                this.a.zzd(new je());
            } else {
                this.a.zzd(new je(str));
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.pa
    public final void d(JSONObject jSONObject) {
        try {
            this.a.zzc(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e2) {
            this.a.zzd(e2);
        }
    }
}