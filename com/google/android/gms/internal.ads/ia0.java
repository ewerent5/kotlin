package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzs;
import java.util.List;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ia0 extends j1 {

    /* renamed from: e, reason: collision with root package name */
    private final String f6506e;

    /* renamed from: f, reason: collision with root package name */
    private final String f6507f;

    /* renamed from: g, reason: collision with root package name */
    private final List<w93> f6508g;

    /* renamed from: h, reason: collision with root package name */
    private final long f6509h;

    public ia0(xo1 xo1Var, String str, p31 p31Var) throws JSONException {
        String string = null;
        this.f6507f = xo1Var == null ? null : xo1Var.V;
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                string = xo1Var.u.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.f6506e = string != null ? string : str;
        this.f6508g = p31Var.d();
        this.f6509h = zzs.zzj().a() / 1000;
    }

    public final long J4() {
        return this.f6509h;
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final String zze() {
        return this.f6506e;
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final String zzf() {
        return this.f6507f;
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final List<w93> zzg() {
        if (((Boolean) c.c().b(w3.x5)).booleanValue()) {
            return this.f6508g;
        }
        return null;
    }
}