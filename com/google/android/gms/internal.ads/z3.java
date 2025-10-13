package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zzs;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class z3 {
    private final String a = f5.f5797b.e();

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, String> f10537b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f10538c;

    /* renamed from: d, reason: collision with root package name */
    private final String f10539d;

    public z3(Context context, String str) {
        this.f10538c = context;
        this.f10539d = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f10537b = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        zzs.zzc();
        linkedHashMap.put("device", zzr.zzx());
        linkedHashMap.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        zzs.zzc();
        linkedHashMap.put("is_lite_sdk", true != zzr.zzG(context) ? "0" : "1");
        Future<vl> futureA = zzs.zzn().a(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(futureA.get().f9733k));
            linkedHashMap.put("network_fine", Integer.toString(futureA.get().f9734l));
        } catch (Exception e2) {
            zzs.zzg().g(e2, "CsiConfiguration.CsiConfiguration");
        }
    }

    final String a() {
        return this.a;
    }

    final Context b() {
        return this.f10538c;
    }

    final String c() {
        return this.f10539d;
    }

    final Map<String, String> d() {
        return this.f10537b;
    }
}