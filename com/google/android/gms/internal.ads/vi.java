package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public class vi {
    private final ew a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9707b;

    public vi(ew ewVar, String str) {
        this.a = ewVar;
        this.f9707b = str;
    }

    public final void b(String str) throws JSONException {
        try {
            JSONObject jSONObjectPut = new JSONObject().put("message", str).put("action", this.f9707b);
            ew ewVar = this.a;
            if (ewVar != null) {
                ewVar.a("onError", jSONObjectPut);
            }
        } catch (JSONException e2) {
            er.zzg("Error occurred while dispatching error event.", e2);
        }
    }

    public final void c(String str) throws JSONException {
        try {
            this.a.a("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e2) {
            er.zzg("Error occurred while dispatching ready Event.", e2);
        }
    }

    public final void d(int i2, int i3, int i4, int i5) throws JSONException {
        try {
            this.a.a("onSizeChanged", new JSONObject().put("x", i2).put("y", i3).put("width", i4).put("height", i5));
        } catch (JSONException e2) {
            er.zzg("Error occurred while dispatching size change.", e2);
        }
    }

    public final void e(int i2, int i3, int i4, int i5) throws JSONException {
        try {
            this.a.a("onDefaultPositionReceived", new JSONObject().put("x", i2).put("y", i3).put("width", i4).put("height", i5));
        } catch (JSONException e2) {
            er.zzg("Error occurred while dispatching default position.", e2);
        }
    }

    public final void f(String str) throws JSONException {
        try {
            this.a.a("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e2) {
            er.zzg("Error occurred while dispatching state change.", e2);
        }
    }

    public final void g(int i2, int i3, int i4, int i5, float f2, int i6) throws JSONException {
        try {
            this.a.a("onScreenInfoChanged", new JSONObject().put("width", i2).put("height", i3).put("maxSizeWidth", i4).put("maxSizeHeight", i5).put("density", f2).put("rotation", i6));
        } catch (JSONException e2) {
            er.zzg("Error occurred while obtaining screen information.", e2);
        }
    }
}