package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import ch.qos.logback.core.joran.action.Action;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class x91 extends vh {

    /* renamed from: e, reason: collision with root package name */
    private final String f10144e;

    /* renamed from: f, reason: collision with root package name */
    private final th f10145f;

    /* renamed from: g, reason: collision with root package name */
    private final wr<JSONObject> f10146g;

    /* renamed from: h, reason: collision with root package name */
    private final JSONObject f10147h;

    /* renamed from: i, reason: collision with root package name */
    @GuardedBy("this")
    private boolean f10148i;

    public x91(String str, th thVar, wr<JSONObject> wrVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        this.f10147h = jSONObject;
        this.f10148i = false;
        this.f10146g = wrVar;
        this.f10144e = str;
        this.f10145f = thVar;
        try {
            jSONObject.put("adapter_version", thVar.zzf().toString());
            jSONObject.put("sdk_version", thVar.zzg().toString());
            jSONObject.put(Action.NAME_ATTRIBUTE, str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.wh
    public final synchronized void b(String str) {
        if (this.f10148i) {
            return;
        }
        try {
            this.f10147h.put("signal_error", str);
        } catch (JSONException unused) {
        }
        this.f10146g.zzc(this.f10147h);
        this.f10148i = true;
    }

    @Override // com.google.android.gms.internal.ads.wh
    public final synchronized void e(g93 g93Var) {
        if (this.f10148i) {
            return;
        }
        try {
            this.f10147h.put("signal_error", g93Var.f6092f);
        } catch (JSONException unused) {
        }
        this.f10146g.zzc(this.f10147h);
        this.f10148i = true;
    }

    @Override // com.google.android.gms.internal.ads.wh
    public final synchronized void zze(String str) {
        if (this.f10148i) {
            return;
        }
        if (str == null) {
            b("Adapter returned null signals");
            return;
        }
        try {
            this.f10147h.put("signals", str);
        } catch (JSONException unused) {
        }
        this.f10146g.zzc(this.f10147h);
        this.f10148i = true;
    }
}