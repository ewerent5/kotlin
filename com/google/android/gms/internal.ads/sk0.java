package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.util.zzbn;
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zzs;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class sk0 implements cm0 {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final fm0 f8892b;

    /* renamed from: c, reason: collision with root package name */
    private final JSONObject f8893c;

    /* renamed from: d, reason: collision with root package name */
    private final pq0 f8894d;

    /* renamed from: e, reason: collision with root package name */
    private final tl0 f8895e;

    /* renamed from: f, reason: collision with root package name */
    private final ip2 f8896f;

    /* renamed from: g, reason: collision with root package name */
    private final gb0 f8897g;

    /* renamed from: h, reason: collision with root package name */
    private final oa0 f8898h;

    /* renamed from: i, reason: collision with root package name */
    private final xo1 f8899i;

    /* renamed from: j, reason: collision with root package name */
    private final kr f8900j;

    /* renamed from: k, reason: collision with root package name */
    private final qp1 f8901k;

    /* renamed from: l, reason: collision with root package name */
    private final y20 f8902l;

    /* renamed from: m, reason: collision with root package name */
    private final wm0 f8903m;
    private final com.google.android.gms.common.util.f n;
    private final ph0 o;
    private final vu1 p;
    private boolean r;
    private s0 y;
    private boolean q = false;
    private boolean s = false;
    private boolean t = false;
    private Point u = new Point();
    private Point v = new Point();
    private long w = 0;
    private long x = 0;

    public sk0(Context context, fm0 fm0Var, JSONObject jSONObject, pq0 pq0Var, tl0 tl0Var, ip2 ip2Var, gb0 gb0Var, oa0 oa0Var, xo1 xo1Var, kr krVar, qp1 qp1Var, y20 y20Var, wm0 wm0Var, com.google.android.gms.common.util.f fVar, ph0 ph0Var, vu1 vu1Var) {
        this.a = context;
        this.f8892b = fm0Var;
        this.f8893c = jSONObject;
        this.f8894d = pq0Var;
        this.f8895e = tl0Var;
        this.f8896f = ip2Var;
        this.f8897g = gb0Var;
        this.f8898h = oa0Var;
        this.f8899i = xo1Var;
        this.f8900j = krVar;
        this.f8901k = qp1Var;
        this.f8902l = y20Var;
        this.f8903m = wm0Var;
        this.n = fVar;
        this.o = ph0Var;
        this.p = vu1Var;
    }

    private final String o(View view, Map<String, WeakReference<View>> map) {
        if (map != null && view != null) {
            for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                if (view.equals(entry.getValue().get())) {
                    return entry.getKey();
                }
            }
        }
        int iX = this.f8895e.X();
        if (iX == 1) {
            return "1099";
        }
        if (iX == 2) {
            return "2099";
        }
        if (iX != 6) {
            return null;
        }
        return "3099";
    }

    private final boolean p() {
        return this.f8893c.optBoolean("allow_custom_click_gesture", false);
    }

    private final boolean q(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z) throws JSONException {
        com.google.android.gms.common.internal.p.e("recordImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f8893c);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) c.c().b(w3.S1)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z);
            Context context = this.a;
            JSONObject jSONObject7 = new JSONObject();
            zzs.zzc();
            DisplayMetrics displayMetricsZzy = zzr.zzy((WindowManager) context.getSystemService("window"));
            ok0 ok0Var = null;
            try {
                jSONObject7.put("width", ta3.a().a(context, displayMetricsZzy.widthPixels));
                jSONObject7.put("height", ta3.a().a(context, displayMetricsZzy.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            if (((Boolean) c.c().b(w3.C5)).booleanValue()) {
                this.f8894d.d("/clickRecorded", new qk0(this, ok0Var));
            } else {
                this.f8894d.d("/logScionEvent", new pk0(this, ok0Var));
            }
            this.f8894d.d("/nativeImpression", new rk0(this, ok0Var));
            tr.a(this.f8894d.c("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.q) {
                return true;
            }
            this.q = zzs.zzm().zzc(this.a, this.f8900j.f7054e, this.f8899i.B.toString(), this.f8901k.f8429f);
            return true;
        } catch (JSONException e2) {
            er.zzg("Unable to create impression JSON.", e2);
            return false;
        }
    }

    private final boolean u(String str) {
        JSONObject jSONObjectOptJSONObject = this.f8893c.optJSONObject("allow_pub_event_reporting");
        return jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean(str, false);
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void O(String str) throws JSONException {
        r(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void a(View view, MotionEvent motionEvent, View view2) {
        this.u = zzbn.zzh(motionEvent, view2);
        long jA = this.n.a();
        this.x = jA;
        if (motionEvent.getAction() == 0) {
            this.w = jA;
            this.v = this.u;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        Point point = this.u;
        motionEventObtain.setLocation(point.x, point.y);
        this.f8896f.d(motionEventObtain);
        motionEventObtain.recycle();
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void b(s0 s0Var) {
        this.y = s0Var;
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void c(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.u = new Point();
        this.v = new Point();
        if (!this.r) {
            this.o.K0(view);
            this.r = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.f8902l.m(this);
        boolean zZza = zzbn.zza(this.f8900j.f7056g);
        if (map != null) {
            Iterator<Map.Entry<String, WeakReference<View>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = it.next().getValue().get();
                if (view2 != null) {
                    if (zZza) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            Iterator<Map.Entry<String, WeakReference<View>>> it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = it2.next().getValue().get();
                if (view3 != null) {
                    if (zZza) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void d(View view, Map<String, WeakReference<View>> map) {
        this.u = new Point();
        this.v = new Point();
        this.o.L0(view);
        this.r = false;
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void e(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) throws JSONException {
        JSONObject jSONObjectZze = zzbn.zze(this.a, map, map2, view2);
        JSONObject jSONObjectZzb = zzbn.zzb(this.a, view2);
        JSONObject jSONObjectZzc = zzbn.zzc(view2);
        JSONObject jSONObjectZzd = zzbn.zzd(this.a, view2);
        String strO = o(view, map);
        r(true == ((Boolean) c.c().b(w3.T1)).booleanValue() ? view2 : view, jSONObjectZzb, jSONObjectZze, jSONObjectZzc, jSONObjectZzd, strO, zzbn.zzf(strO, this.a, this.v, this.u), null, z, false);
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final JSONObject f(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) throws JSONException {
        JSONObject jSONObjectZze = zzbn.zze(this.a, map, map2, view);
        JSONObject jSONObjectZzb = zzbn.zzb(this.a, view);
        JSONObject jSONObjectZzc = zzbn.zzc(view);
        JSONObject jSONObjectZzd = zzbn.zzd(this.a, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", jSONObjectZze);
            jSONObject.put("ad_view_signal", jSONObjectZzb);
            jSONObject.put("scroll_view_signal", jSONObjectZzc);
            jSONObject.put("lock_screen_signal", jSONObjectZzd);
            return jSONObject;
        } catch (JSONException e2) {
            er.zzg("Unable to create native ad view signals JSON.", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void g(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) throws JSONException {
        String strZzk;
        JSONObject jSONObjectZze = zzbn.zze(this.a, map, map2, view);
        JSONObject jSONObjectZzb = zzbn.zzb(this.a, view);
        JSONObject jSONObjectZzc = zzbn.zzc(view);
        JSONObject jSONObjectZzd = zzbn.zzd(this.a, view);
        if (((Boolean) c.c().b(w3.S1)).booleanValue()) {
            try {
                strZzk = this.f8896f.b().zzk(this.a, view, null);
            } catch (Exception unused) {
                er.zzf("Exception getting data.");
            }
        } else {
            strZzk = null;
        }
        q(jSONObjectZzb, jSONObjectZze, jSONObjectZzc, jSONObjectZzd, strZzk, null, zzbn.zzi(this.a, this.f8899i));
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void h(View view) {
        if (!this.f8893c.optBoolean("custom_one_point_five_click_enabled", false)) {
            er.zzi("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        wm0 wm0Var = this.f8903m;
        if (view == null) {
            return;
        }
        view.setOnClickListener(wm0Var);
        view.setClickable(true);
        wm0Var.f9996k = new WeakReference<>(view);
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void i(l8 l8Var) {
        if (this.f8893c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.f8903m.b(l8Var);
        } else {
            er.zzi("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        }
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final boolean j(Bundle bundle) {
        if (u("impression_reporting")) {
            return q(null, null, null, null, null, zzs.zzc().zzg(bundle, null), false);
        }
        er.zzf("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void k(Bundle bundle) throws JSONException {
        if (bundle == null) {
            er.zzd("Click data is null. No click is reported.");
        } else if (!u("click_reporting")) {
            er.zzf("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            r(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, zzs.zzc().zzg(bundle, null), false, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void l(Bundle bundle) {
        if (bundle == null) {
            er.zzd("Touch event data is null. No touch event is reported.");
            return;
        }
        if (!u("touch_reporting")) {
            er.zzf("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
            return;
        }
        float f2 = bundle.getFloat("x");
        float f3 = bundle.getFloat("y");
        this.f8896f.b().zzg((int) f2, (int) f3, bundle.getInt("duration_ms"));
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void m(w0 w0Var) {
        try {
            if (this.s) {
                return;
            }
            if (w0Var == null && this.f8895e.b() != null) {
                this.s = true;
                this.p.b(this.f8895e.b().zzf());
                zzs();
                return;
            }
            this.s = true;
            this.p.b(w0Var.zzf());
            zzs();
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void n(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) throws JSONException {
        if (!this.t) {
            er.zzd("Custom click reporting failed. enableCustomClickGesture is not set.");
            return;
        }
        if (!p()) {
            er.zzd("Custom click reporting failed. Ad unit id not in the allow list.");
            return;
        }
        JSONObject jSONObjectZze = zzbn.zze(this.a, map, map2, view);
        JSONObject jSONObjectZzb = zzbn.zzb(this.a, view);
        JSONObject jSONObjectZzc = zzbn.zzc(view);
        JSONObject jSONObjectZzd = zzbn.zzd(this.a, view);
        String strO = o(null, map);
        r(view, jSONObjectZzb, jSONObjectZze, jSONObjectZzc, jSONObjectZzd, strO, zzbn.zzf(strO, this.a, this.v, this.u), null, z, true);
    }

    protected final void r(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z, boolean z2) throws JSONException {
        String strZzi;
        com.google.android.gms.common.internal.p.e("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.f8893c);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            jSONObject7.put("has_custom_click_handler", this.f8892b.g(this.f8895e.n()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.f8895e.X());
            jSONObject8.put("view_aware_api_used", z);
            g6 g6Var = this.f8901k.f8432i;
            jSONObject8.put("custom_mute_requested", g6Var != null && g6Var.f6063k);
            jSONObject8.put("custom_mute_enabled", (this.f8895e.a().isEmpty() || this.f8895e.b() == null) ? false : true);
            if (this.f8903m.c() != null && this.f8893c.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.n.a());
            if (this.t && p()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z2) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            jSONObject8.put("has_custom_click_handler", this.f8892b.g(this.f8895e.n()) != null);
            try {
                JSONObject jSONObjectOptJSONObject = this.f8893c.optJSONObject("tracking_urls_and_actions");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                strZzi = this.f8896f.b().zzi(this.a, jSONObjectOptJSONObject.optString("click_string"), view);
            } catch (Exception e2) {
                er.zzg("Exception obtaining click signals", e2);
                strZzi = null;
            }
            jSONObject8.put("click_signals", strZzi);
            if (((Boolean) c.c().b(w3.M2)).booleanValue()) {
                jSONObject8.put("open_chrome_custom_tab", true);
            }
            if (((Boolean) c.c().b(w3.G5)).booleanValue() && com.google.android.gms.common.util.n.l()) {
                jSONObject8.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) c.c().b(w3.H5)).booleanValue() && com.google.android.gms.common.util.n.l()) {
                jSONObject8.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long jA = this.n.a();
            jSONObject9.put("time_from_last_touch_down", jA - this.w);
            jSONObject9.put("time_from_last_touch", jA - this.x);
            jSONObject7.put("touch_signal", jSONObject9);
            tr.a(this.f8894d.c("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e3) {
            er.zzg("Unable to create click JSON.", e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void zzg() {
        this.t = true;
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final boolean zzh() {
        return p();
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void zzm() throws JSONException {
        q(null, null, null, null, null, null, false);
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void zzp() {
        if (this.f8893c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.f8903m.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void zzs() {
        try {
            s0 s0Var = this.y;
            if (s0Var != null) {
                s0Var.zze();
            }
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void zzu() throws JSONException {
        com.google.android.gms.common.internal.p.e("recordDownloadedImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f8893c);
            tr.a(this.f8894d.c("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e2) {
            er.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void zzw() {
        this.f8894d.b();
    }
}