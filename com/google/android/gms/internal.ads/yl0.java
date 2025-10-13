package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzbk;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class yl0 extends zl0 {

    /* renamed from: b, reason: collision with root package name */
    private final JSONObject f10442b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f10443c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f10444d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f10445e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f10446f;

    public yl0(xo1 xo1Var, JSONObject jSONObject) {
        super(xo1Var);
        this.f10442b = zzbk.zzh(jSONObject, "tracking_urls_and_actions", "active_view");
        this.f10443c = zzbk.zzi(false, jSONObject, "allow_pub_owned_ad_view");
        this.f10444d = zzbk.zzi(false, jSONObject, "attribution", "allow_pub_rendering");
        this.f10445e = zzbk.zzi(false, jSONObject, "enable_omid");
        this.f10446f = jSONObject.optJSONObject("overlay") != null;
    }

    @Override // com.google.android.gms.internal.ads.zl0
    public final JSONObject a() {
        JSONObject jSONObject = this.f10442b;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.a.y);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zl0
    public final boolean b() {
        return this.f10446f;
    }

    @Override // com.google.android.gms.internal.ads.zl0
    public final boolean c() {
        return this.f10443c;
    }

    @Override // com.google.android.gms.internal.ads.zl0
    public final boolean d() {
        return this.f10445e;
    }

    @Override // com.google.android.gms.internal.ads.zl0
    public final boolean e() {
        return this.f10444d;
    }
}