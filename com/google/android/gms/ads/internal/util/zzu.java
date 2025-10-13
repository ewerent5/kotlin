package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.common.j;
import com.google.android.gms.common.util.e;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@TargetApi(17)
/* loaded from: classes.dex */
public class zzu extends zzac {
    public zzu() {
        super(null);
    }

    @Override // com.google.android.gms.ads.internal.util.zzac
    public final boolean zza(Context context, WebSettings webSettings) {
        super.zza(context, webSettings);
        webSettings.setMediaPlaybackRequiresUserGesture(false);
        return true;
    }

    @Override // com.google.android.gms.ads.internal.util.zzac
    public final String zzb(Context context) {
        zzbu zzbuVarZza = zzbu.zza();
        if (TextUtils.isEmpty(zzbuVarZza.zza)) {
            zzbuVarZza.zza = e.a() ? (String) zzbr.zza(context, new zzbs(zzbuVarZza, context)) : (String) zzbr.zza(context, new zzbt(zzbuVarZza, j.c(context), context));
        }
        return zzbuVarZza.zza;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    @Override // com.google.android.gms.ads.internal.util.zzac
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzc(android.content.Context r8) {
        /*
            r7 = this;
            com.google.android.gms.ads.internal.util.zzbu r0 = com.google.android.gms.ads.internal.util.zzbu.zza()
            java.lang.String r1 = "Updating user agent."
            com.google.android.gms.ads.internal.util.zze.zza(r1)
            java.lang.String r1 = android.webkit.WebSettings.getDefaultUserAgent(r8)
            java.lang.String r2 = r0.zza
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L42
            android.content.Context r2 = com.google.android.gms.common.j.c(r8)
            boolean r3 = com.google.android.gms.common.util.e.a()
            if (r3 != 0) goto L22
            if (r2 != 0) goto L40
            r2 = 0
        L22:
            java.lang.String r3 = android.webkit.WebSettings.getDefaultUserAgent(r8)
            r4 = 0
            java.lang.String r5 = "admob_user_agent"
            android.content.SharedPreferences r4 = r8.getSharedPreferences(r5, r4)
            android.content.SharedPreferences$Editor r4 = r4.edit()
            java.lang.String r6 = "user_agent"
            android.content.SharedPreferences$Editor r3 = r4.putString(r6, r3)
            if (r2 != 0) goto L3d
            r3.apply()
            goto L40
        L3d:
            com.google.android.gms.common.util.q.a(r8, r3, r5)
        L40:
            r0.zza = r1
        L42:
            java.lang.String r8 = "User agent is updated."
            com.google.android.gms.ads.internal.util.zze.zza(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzu.zzc(android.content.Context):void");
    }

    @Override // com.google.android.gms.ads.internal.util.zzac
    public final Drawable zzd(Context context, Bitmap bitmap, boolean z, float f2) {
        if (!z || f2 <= 0.0f || f2 > 25.0f) {
            return new BitmapDrawable(context.getResources(), bitmap);
        }
        try {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap);
            RenderScript renderScriptCreate = RenderScript.create(context);
            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
            Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
            scriptIntrinsicBlurCreate.setRadius(f2);
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
            allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
            return new BitmapDrawable(context.getResources(), bitmapCreateBitmap);
        } catch (RuntimeException unused) {
            return new BitmapDrawable(context.getResources(), bitmap);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzac
    public final int zze(ContentResolver contentResolver) {
        return Settings.Global.getInt(contentResolver, "wifi_on", 0);
    }

    @Override // com.google.android.gms.ads.internal.util.zzac
    public final int zzf(ContentResolver contentResolver) {
        return Settings.Global.getInt(contentResolver, "airplane_mode_on", 0);
    }
}