package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.util.zzad;
import com.google.android.gms.ads.internal.zzs;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class u20 implements ne<x20> {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final r13 f9357b;

    /* renamed from: c, reason: collision with root package name */
    private final PowerManager f9358c;

    public u20(Context context, r13 r13Var) {
        this.a = context;
        this.f9357b = r13Var;
        this.f9358c = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.ne
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject zzb(x20 x20Var) {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        u13 u13Var = x20Var.f10108f;
        if (u13Var == null) {
            jSONObject = new JSONObject();
        } else {
            if (this.f9357b.c() == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z = u13Var.a;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("afmaVersion", this.f9357b.b()).put("activeViewJSON", this.f9357b.c()).put("timestamp", x20Var.f10106d).put("adFormat", this.f9357b.a()).put("hashCode", this.f9357b.d()).put("isMraid", false).put("isStopped", false).put("isPaused", x20Var.f10104b).put("isNative", this.f9357b.e()).put("isScreenOn", Build.VERSION.SDK_INT >= 20 ? this.f9358c.isInteractive() : this.f9358c.isScreenOn()).put("appMuted", zzs.zzh().zzd()).put("appVolume", zzs.zzh().zzb()).put("deviceVolume", zzad.zze(this.a.getApplicationContext()));
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.a.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", u13Var.f9347b).put("isAttachedToWindow", z).put("viewBox", new JSONObject().put("top", u13Var.f9348c.top).put("bottom", u13Var.f9348c.bottom).put("left", u13Var.f9348c.left).put("right", u13Var.f9348c.right)).put("adBox", new JSONObject().put("top", u13Var.f9349d.top).put("bottom", u13Var.f9349d.bottom).put("left", u13Var.f9349d.left).put("right", u13Var.f9349d.right)).put("globalVisibleBox", new JSONObject().put("top", u13Var.f9350e.top).put("bottom", u13Var.f9350e.bottom).put("left", u13Var.f9350e.left).put("right", u13Var.f9350e.right)).put("globalVisibleBoxVisible", u13Var.f9351f).put("localVisibleBox", new JSONObject().put("top", u13Var.f9352g.top).put("bottom", u13Var.f9352g.bottom).put("left", u13Var.f9352g.left).put("right", u13Var.f9352g.right)).put("localVisibleBoxVisible", u13Var.f9353h).put("hitBox", new JSONObject().put("top", u13Var.f9354i.top).put("bottom", u13Var.f9354i.bottom).put("left", u13Var.f9354i.left).put("right", u13Var.f9354i.right)).put("screenDensity", this.a.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", x20Var.a);
            if (((Boolean) c.c().b(w3.T0)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = u13Var.f9356k;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(x20Var.f10107e)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}