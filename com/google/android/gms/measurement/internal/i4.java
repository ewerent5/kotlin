package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import e.c.b.b.c.e.ec;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class i4 extends w5 {

    /* renamed from: c, reason: collision with root package name */
    static final Pair<String, Long> f10923c = new Pair<>("", 0L);
    public final o4 A;
    public final o4 B;
    public final m4 C;
    public final n4 D;

    /* renamed from: d, reason: collision with root package name */
    private SharedPreferences f10924d;

    /* renamed from: e, reason: collision with root package name */
    public p4 f10925e;

    /* renamed from: f, reason: collision with root package name */
    public final m4 f10926f;

    /* renamed from: g, reason: collision with root package name */
    public final m4 f10927g;

    /* renamed from: h, reason: collision with root package name */
    public final m4 f10928h;

    /* renamed from: i, reason: collision with root package name */
    public final m4 f10929i;

    /* renamed from: j, reason: collision with root package name */
    public final m4 f10930j;

    /* renamed from: k, reason: collision with root package name */
    public final m4 f10931k;

    /* renamed from: l, reason: collision with root package name */
    public final m4 f10932l;

    /* renamed from: m, reason: collision with root package name */
    public final o4 f10933m;
    private String n;
    private boolean o;
    private long p;
    public final m4 q;
    public final m4 r;
    public final k4 s;
    public final o4 t;
    public final k4 u;
    public final m4 v;
    public boolean w;
    public k4 x;
    public k4 y;
    public m4 z;

    i4(z4 z4Var) {
        super(z4Var);
        this.f10926f = new m4(this, "last_upload", 0L);
        this.f10927g = new m4(this, "last_upload_attempt", 0L);
        this.f10928h = new m4(this, "backoff", 0L);
        this.f10929i = new m4(this, "last_delete_stale", 0L);
        this.q = new m4(this, "time_before_start", AbstractComponentTracker.LINGERING_TIMEOUT);
        this.r = new m4(this, "session_timeout", 1800000L);
        this.s = new k4(this, "start_new_session", true);
        this.v = new m4(this, "last_pause_time", 0L);
        this.t = new o4(this, "non_personalized_ads", null);
        this.u = new k4(this, "allow_remote_dynamite", false);
        this.f10930j = new m4(this, "midnight_offset", 0L);
        this.f10931k = new m4(this, "first_open_time", 0L);
        this.f10932l = new m4(this, "app_install_time", 0L);
        this.f10933m = new o4(this, "app_instance_id", null);
        this.x = new k4(this, "app_backgrounded", false);
        this.y = new k4(this, "deep_link_retrieval_complete", false);
        this.z = new m4(this, "deep_link_retrieval_attempts", 0L);
        this.A = new o4(this, "firebase_feature_rollouts", null);
        this.B = new o4(this, "deferred_attribution_cache", null);
        this.C = new m4(this, "deferred_attribution_cache_timestamp", 0L);
        this.D = new n4(this, "default_event_parameters", null);
    }

    final String A() {
        d();
        return z().getString("gmp_app_id", null);
    }

    final String B() {
        d();
        return z().getString("admob_app_id", null);
    }

    final Boolean C() {
        d();
        if (z().contains("use_service")) {
            return Boolean.valueOf(z().getBoolean("use_service", false));
        }
        return null;
    }

    final void D() {
        d();
        Boolean boolE = E();
        SharedPreferences.Editor editorEdit = z().edit();
        editorEdit.clear();
        editorEdit.apply();
        if (boolE != null) {
            q(boolE);
        }
    }

    final Boolean E() {
        d();
        if (z().contains("measurement_enabled")) {
            return Boolean.valueOf(z().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    final Boolean F() {
        if (!ec.a() || !i().o(t.J0)) {
            return null;
        }
        d();
        if (z().contains("measurement_enabled_from_api")) {
            return Boolean.valueOf(z().getBoolean("measurement_enabled_from_api", true));
        }
        return null;
    }

    public final int G() {
        d();
        return z().getInt("consent_source", 100);
    }

    final d H() {
        d();
        return d.b(z().getString("consent_settings", "G1"));
    }

    protected final String I() {
        d();
        String string = z().getString("previous_os_version", null);
        e().l();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor editorEdit = z().edit();
            editorEdit.putString("previous_os_version", str);
            editorEdit.apply();
        }
        return string;
    }

    final boolean J() {
        return this.f10924d.contains("deferred_analytics_collection");
    }

    @Override // com.google.android.gms.measurement.internal.w5
    protected final void j() {
        SharedPreferences sharedPreferences = zzm().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f10924d = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.w = z;
        if (!z) {
            SharedPreferences.Editor editorEdit = this.f10924d.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        this.f10925e = new p4(this, "health_monitor", Math.max(0L, t.f11220d.a(null).longValue()));
    }

    @Override // com.google.android.gms.measurement.internal.w5
    protected final boolean o() {
        return true;
    }

    final Pair<String, Boolean> p(String str) {
        d();
        long jC = zzl().c();
        if (this.n != null && jC < this.p) {
            return new Pair<>(this.n, Boolean.valueOf(this.o));
        }
        this.p = jC + i().w(str);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(zzm());
            if (advertisingIdInfo != null) {
                this.n = advertisingIdInfo.getId();
                this.o = advertisingIdInfo.isLimitAdTrackingEnabled();
            }
            if (this.n == null) {
                this.n = "";
            }
        } catch (Exception e2) {
            zzq().H().b("Unable to get advertising id", e2);
            this.n = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair<>(this.n, Boolean.valueOf(this.o));
    }

    final void q(Boolean bool) {
        d();
        SharedPreferences.Editor editorEdit = z().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
    }

    final void r(boolean z) {
        d();
        SharedPreferences.Editor editorEdit = z().edit();
        editorEdit.putBoolean("use_service", z);
        editorEdit.apply();
    }

    final boolean s(int i2) {
        return d.g(i2, z().getInt("consent_source", 100));
    }

    final boolean t(long j2) {
        return j2 - this.r.a() > this.v.a();
    }

    final boolean u(d dVar, int i2) {
        if (!ec.a() || !i().o(t.J0)) {
            return false;
        }
        d();
        if (!s(i2)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = z().edit();
        editorEdit.putString("consent_settings", dVar.e());
        editorEdit.putInt("consent_source", i2);
        editorEdit.apply();
        return true;
    }

    final void v(Boolean bool) {
        if (ec.a() && i().o(t.J0)) {
            d();
            SharedPreferences.Editor editorEdit = z().edit();
            if (bool != null) {
                editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit.remove("measurement_enabled_from_api");
            }
            editorEdit.apply();
        }
    }

    final void w(String str) {
        d();
        SharedPreferences.Editor editorEdit = z().edit();
        editorEdit.putString("gmp_app_id", str);
        editorEdit.apply();
    }

    final void x(boolean z) {
        d();
        zzq().I().b("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor editorEdit = z().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z);
        editorEdit.apply();
    }

    final void y(String str) {
        d();
        SharedPreferences.Editor editorEdit = z().edit();
        editorEdit.putString("admob_app_id", str);
        editorEdit.apply();
    }

    protected final SharedPreferences z() {
        d();
        l();
        return this.f10924d;
    }
}