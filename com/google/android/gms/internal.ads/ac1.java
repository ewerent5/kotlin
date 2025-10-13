package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ac1 implements zg1<Bundle> {
    final qp1 a;

    /* renamed from: b, reason: collision with root package name */
    private final long f4891b;

    public ac1(qp1 qp1Var, long j2) {
        com.google.android.gms.common.internal.p.k(qp1Var, "the targeting must not be null");
        this.a = qp1Var;
        this.f4891b = j2;
    }

    @Override // com.google.android.gms.internal.ads.zg1
    public final /* bridge */ /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        m93 m93Var = this.a.f8427d;
        bundle2.putInt("http_timeout_millis", m93Var.A);
        bundle2.putString("slotname", this.a.f8429f);
        int i2 = this.a.o.a;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 1) {
            bundle2.putBoolean("is_new_rewarded", true);
        } else if (i3 == 2) {
            bundle2.putBoolean("is_rewarded_interstitial", true);
        }
        bundle2.putLong("start_signals_timestamp", this.f4891b);
        cq1.b(bundle2, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(m93Var.f7444f)), m93Var.f7444f != -1);
        cq1.f(bundle2, "extras", m93Var.f7445g);
        cq1.c(bundle2, "cust_gender", Integer.valueOf(m93Var.f7446h), m93Var.f7446h != -1);
        cq1.g(bundle2, "kw", m93Var.f7447i);
        cq1.c(bundle2, "tag_for_child_directed_treatment", Integer.valueOf(m93Var.f7449k), m93Var.f7449k != -1);
        if (m93Var.f7448j) {
            bundle2.putBoolean("test_request", true);
        }
        cq1.c(bundle2, "d_imp_hdr", 1, m93Var.f7443e >= 2 && m93Var.f7450l);
        String str = m93Var.f7451m;
        cq1.b(bundle2, "ppid", str, m93Var.f7443e >= 2 && !TextUtils.isEmpty(str));
        Location location = m93Var.o;
        if (location != null) {
            Float fValueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
            Long lValueOf = Long.valueOf(location.getTime() * 1000);
            Long lValueOf2 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
            Long lValueOf3 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
            Bundle bundle3 = new Bundle();
            bundle3.putFloat("radius", fValueOf.floatValue());
            bundle3.putLong("lat", lValueOf2.longValue());
            bundle3.putLong("long", lValueOf3.longValue());
            bundle3.putLong("time", lValueOf.longValue());
            bundle2.putBundle("uule", bundle3);
        }
        cq1.e(bundle2, "url", m93Var.p);
        cq1.g(bundle2, "neighboring_content_urls", m93Var.z);
        cq1.f(bundle2, "custom_targeting", m93Var.r);
        cq1.g(bundle2, "category_exclusions", m93Var.s);
        cq1.e(bundle2, "request_agent", m93Var.t);
        cq1.e(bundle2, "request_pkg", m93Var.u);
        cq1.d(bundle2, "is_designed_for_families", Boolean.valueOf(m93Var.v), m93Var.f7443e >= 7);
        if (m93Var.f7443e >= 8) {
            cq1.c(bundle2, "tag_for_under_age_of_consent", Integer.valueOf(m93Var.x), m93Var.x != -1);
            cq1.e(bundle2, "max_ad_content_rating", m93Var.y);
        }
    }
}