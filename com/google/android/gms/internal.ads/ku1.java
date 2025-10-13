package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zzs;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ku1 {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7079b;

    /* renamed from: c, reason: collision with root package name */
    private final String f7080c;

    public ku1(Context context, kr krVar) {
        this.a = context;
        this.f7079b = context.getPackageName();
        this.f7080c = krVar.f7054e;
    }

    public final void a(Map<String, String> map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        zzs.zzc();
        map.put("device", zzr.zzx());
        map.put("app", this.f7079b);
        zzs.zzc();
        map.put("is_lite_sdk", true != zzr.zzG(this.a) ? "0" : "1");
        List<String> listD = w3.d();
        if (((Boolean) c.c().b(w3.T4)).booleanValue()) {
            listD.addAll(zzs.zzg().l().zzn().h());
        }
        map.put("e", TextUtils.join(",", listD));
        map.put("sdkVersion", this.f7080c);
    }
}