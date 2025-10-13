package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public abstract class t61<AdT> implements j31<AdT> {
    private static Bundle d(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.j31
    public final g52<AdT> a(kp1 kp1Var, xo1 xo1Var) {
        String strOptString = xo1Var.u.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        qp1 qp1Var = kp1Var.a.a;
        pp1 pp1Var = new pp1();
        pp1Var.I(qp1Var);
        pp1Var.u(strOptString);
        Bundle bundleD = d(qp1Var.f8427d.q);
        Bundle bundleD2 = d(bundleD.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        bundleD2.putInt("gw", 1);
        String strOptString2 = xo1Var.u.optString("mad_hac", null);
        if (strOptString2 != null) {
            bundleD2.putString("mad_hac", strOptString2);
        }
        String strOptString3 = xo1Var.u.optString("adJson", null);
        if (strOptString3 != null) {
            bundleD2.putString("_ad", strOptString3);
        }
        bundleD2.putBoolean("_noRefresh", true);
        Iterator<String> itKeys = xo1Var.C.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString4 = xo1Var.C.optString(next, null);
            if (next != null) {
                bundleD2.putString(next, strOptString4);
            }
        }
        bundleD.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundleD2);
        m93 m93Var = qp1Var.f8427d;
        pp1Var.p(new m93(m93Var.f7443e, m93Var.f7444f, bundleD2, m93Var.f7446h, m93Var.f7447i, m93Var.f7448j, m93Var.f7449k, m93Var.f7450l, m93Var.f7451m, m93Var.n, m93Var.o, m93Var.p, bundleD, m93Var.r, m93Var.s, m93Var.t, m93Var.u, m93Var.v, m93Var.w, m93Var.x, m93Var.y, m93Var.z, m93Var.A));
        qp1 qp1VarJ = pp1Var.J();
        Bundle bundle = new Bundle();
        ap1 ap1Var = kp1Var.f7035b.f6562b;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList<>(ap1Var.a));
        bundle2.putInt("refresh_interval", ap1Var.f4968c);
        bundle2.putString("gws_query_id", ap1Var.f4967b);
        bundle.putBundle("parent_common_config", bundle2);
        String str = kp1Var.a.a.f8429f;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        bundle3.putString("allocation_id", xo1Var.v);
        bundle3.putStringArrayList("click_urls", new ArrayList<>(xo1Var.f10198c));
        bundle3.putStringArrayList("imp_urls", new ArrayList<>(xo1Var.f10199d));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList<>(xo1Var.o));
        bundle3.putStringArrayList("fill_urls", new ArrayList<>(xo1Var.f10208m));
        bundle3.putStringArrayList("video_start_urls", new ArrayList<>(xo1Var.f10202g));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList<>(xo1Var.f10203h));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList<>(xo1Var.f10204i));
        bundle3.putString("transaction_id", xo1Var.f10205j);
        bundle3.putString("valid_from_timestamp", xo1Var.f10206k);
        bundle3.putBoolean("is_closable_area_disabled", xo1Var.K);
        if (xo1Var.f10207l != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", xo1Var.f10207l.f9200f);
            bundle4.putString("rb_type", xo1Var.f10207l.f9199e);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return c(qp1VarJ, bundle);
    }

    @Override // com.google.android.gms.internal.ads.j31
    public final boolean b(kp1 kp1Var, xo1 xo1Var) {
        return !TextUtils.isEmpty(xo1Var.u.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    protected abstract g52<AdT> c(qp1 qp1Var, Bundle bundle);
}