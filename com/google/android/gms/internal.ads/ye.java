package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class ye implements pa {
    private final ae a;

    /* renamed from: b, reason: collision with root package name */
    private final wr f10407b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ze f10408c;

    public ye(ze zeVar, ae aeVar, wr wrVar) {
        this.f10408c = zeVar;
        this.a = aeVar;
        this.f10407b = wrVar;
    }

    @Override // com.google.android.gms.internal.ads.pa
    public final void c(String str) {
        ae aeVar;
        try {
            if (str == null) {
                this.f10407b.zzd(new je());
            } else {
                this.f10407b.zzd(new je(str));
            }
            aeVar = this.a;
        } catch (IllegalStateException unused) {
            aeVar = this.a;
        } catch (Throwable th) {
            this.a.f();
            throw th;
        }
        aeVar.f();
    }

    @Override // com.google.android.gms.internal.ads.pa
    public final void d(JSONObject jSONObject) {
        ae aeVar;
        try {
            try {
                this.f10407b.zzc(this.f10408c.a.d(jSONObject));
                aeVar = this.a;
            } catch (IllegalStateException unused) {
                aeVar = this.a;
            } catch (JSONException e2) {
                this.f10407b.zzd(e2);
                aeVar = this.a;
            }
            aeVar.f();
        } catch (Throwable th) {
            this.a.f();
            throw th;
        }
    }
}