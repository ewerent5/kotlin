package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@Deprecated
/* loaded from: classes.dex */
public final class ju0 {
    private final ConcurrentHashMap<String, String> a;

    /* renamed from: b, reason: collision with root package name */
    private final sq f6847b;

    public ju0(su0 su0Var, sq sqVar) {
        this.a = new ConcurrentHashMap<>(su0Var.f9562b);
        this.f6847b = sqVar;
    }

    public final void a(kp1 kp1Var) {
        if (kp1Var.f7035b.a.size() > 0) {
            switch (kp1Var.f7035b.a.get(0).f10197b) {
                case 1:
                    this.a.put("ad_format", "banner");
                    break;
                case 2:
                    this.a.put("ad_format", "interstitial");
                    break;
                case 3:
                    this.a.put("ad_format", "native_express");
                    break;
                case 4:
                    this.a.put("ad_format", "native_advanced");
                    break;
                case 5:
                    this.a.put("ad_format", "rewarded");
                    break;
                case 6:
                    this.a.put("ad_format", "app_open_ad");
                    this.a.put("as", true != this.f6847b.h() ? "0" : "1");
                    break;
                default:
                    this.a.put("ad_format", "unknown");
                    break;
            }
        }
        if (TextUtils.isEmpty(kp1Var.f7035b.f6562b.f4967b)) {
            return;
        }
        this.a.put("gqi", kp1Var.f7035b.f6562b.f4967b);
    }

    public final void b(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }

    public final Map<String, String> c() {
        return this.a;
    }
}