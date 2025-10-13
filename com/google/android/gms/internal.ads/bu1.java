package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzs;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class bu1 {
    private final HashMap<String, String> a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final hu1 f5194b = new hu1(zzs.zzj());

    private bu1() {
    }

    public static bu1 a(String str) {
        bu1 bu1Var = new bu1();
        bu1Var.a.put("action", str);
        return bu1Var;
    }

    public static bu1 b(String str) {
        bu1 bu1Var = new bu1();
        bu1Var.a.put("request_id", str);
        return bu1Var;
    }

    public final bu1 c(String str, String str2) {
        this.a.put(str, str2);
        return this;
    }

    public final bu1 d(String str) {
        this.f5194b.a(str);
        return this;
    }

    public final bu1 e(String str, String str2) {
        this.f5194b.b(str, str2);
        return this;
    }

    public final bu1 f(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
        return this;
    }

    public final bu1 g(kp1 kp1Var, sq sqVar) {
        ip1 ip1Var = kp1Var.f7035b;
        h(ip1Var.f6562b);
        if (!ip1Var.a.isEmpty()) {
            switch (ip1Var.a.get(0).f10197b) {
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
                    if (sqVar != null) {
                        this.a.put("as", true != sqVar.h() ? "0" : "1");
                        break;
                    }
                    break;
                default:
                    this.a.put("ad_format", "unknown");
                    break;
            }
        }
        return this;
    }

    public final bu1 h(ap1 ap1Var) {
        if (!TextUtils.isEmpty(ap1Var.f4967b)) {
            this.a.put("gqi", ap1Var.f4967b);
        }
        return this;
    }

    public final bu1 i(xo1 xo1Var) {
        this.a.put("aai", xo1Var.v);
        return this;
    }

    public final Map<String, String> j() {
        HashMap map = new HashMap(this.a);
        for (gu1 gu1Var : this.f5194b.c()) {
            map.put(gu1Var.a, gu1Var.f6180b);
        }
        return map;
    }
}