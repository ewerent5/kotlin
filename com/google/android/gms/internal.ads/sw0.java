package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zzs;
import java.io.ByteArrayOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class sw0 {
    private final Context a;

    /* renamed from: b */
    private final ApplicationInfo f9002b;

    /* renamed from: e */
    private String f9005e = "";

    /* renamed from: c */
    private final int f9003c = ((Integer) c.c().b(w3.c6)).intValue();

    /* renamed from: d */
    private final int f9004d = ((Integer) c.c().b(w3.d6)).intValue();

    public sw0(Context context) {
        this.a = context;
        this.f9002b = context.getApplicationInfo();
    }

    public final JSONObject a() throws JSONException {
        Drawable drawable;
        String strEncodeToString;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Action.NAME_ATTRIBUTE, com.google.android.gms.common.p.c.a(this.a).d(this.f9002b.packageName));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", this.f9002b.packageName);
        zzs.zzc();
        jSONObject.put("adMobAppId", zzr.zzv(this.a));
        if (this.f9005e.isEmpty()) {
            try {
                drawable = com.google.android.gms.common.p.c.a(this.a).e(this.f9002b.packageName).f3105b;
            } catch (PackageManager.NameNotFoundException unused2) {
                drawable = null;
            }
            if (drawable == null) {
                strEncodeToString = "";
            } else {
                drawable.setBounds(0, 0, this.f9003c, this.f9004d);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f9003c, this.f9004d, Bitmap.Config.ARGB_8888);
                drawable.draw(new Canvas(bitmapCreateBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.f9005e = strEncodeToString;
        }
        if (!this.f9005e.isEmpty()) {
            jSONObject.put("icon", this.f9005e);
            jSONObject.put("iconWidthPx", this.f9003c);
            jSONObject.put("iconHeightPx", this.f9004d);
        }
        return jSONObject;
    }
}