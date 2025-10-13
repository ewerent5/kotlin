package com.google.android.gms.measurement.internal;

import android.content.Context;
import ch.qos.logback.classic.turbo.ReconfigureOnChangeFilter;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class t {
    public static o3<Long> A;
    public static o3<Boolean> A0;
    public static o3<Long> B;
    public static o3<Boolean> B0;
    public static o3<Long> C;
    public static o3<Boolean> C0;
    public static o3<Integer> D;
    public static o3<Boolean> D0;
    public static o3<Long> E;
    public static o3<Boolean> E0;
    public static o3<Integer> F;
    public static o3<Boolean> F0;
    public static o3<Integer> G;
    public static o3<Long> G0;
    public static o3<Integer> H;
    public static o3<Boolean> H0;
    public static o3<Integer> I;
    public static o3<Boolean> I0;
    public static o3<Integer> J;
    public static o3<Boolean> J0;
    public static o3<Long> K;
    public static o3<Boolean> K0;
    public static o3<Boolean> L;
    public static o3<Boolean> L0;
    public static o3<String> M;
    public static o3<Integer> M0;
    public static o3<Long> N;
    public static o3<Boolean> N0;
    public static o3<Integer> O;
    public static o3<Boolean> O0;
    public static o3<Double> P;
    public static o3<Boolean> P0;
    public static o3<Integer> Q;
    public static o3<Boolean> Q0;
    public static o3<Integer> R;
    public static o3<Boolean> S;
    public static o3<Boolean> T;
    public static o3<Boolean> U;
    public static o3<Boolean> V;
    public static o3<Boolean> W;
    public static o3<Boolean> X;
    public static o3<Boolean> Y;
    public static o3<Boolean> Z;
    public static o3<Boolean> a0;
    public static o3<Boolean> b0;

    /* renamed from: c, reason: collision with root package name */
    public static o3<Long> f11219c;
    public static o3<Boolean> c0;

    /* renamed from: d, reason: collision with root package name */
    public static o3<Long> f11220d;
    public static o3<Boolean> d0;

    /* renamed from: e, reason: collision with root package name */
    public static o3<Long> f11221e;
    public static o3<Boolean> e0;

    /* renamed from: f, reason: collision with root package name */
    public static o3<String> f11222f;
    public static o3<Boolean> f0;

    /* renamed from: g, reason: collision with root package name */
    public static o3<String> f11223g;
    public static o3<Boolean> g0;

    /* renamed from: h, reason: collision with root package name */
    public static o3<Integer> f11224h;
    public static o3<Boolean> h0;

    /* renamed from: i, reason: collision with root package name */
    public static o3<Integer> f11225i;
    public static o3<Boolean> i0;

    /* renamed from: j, reason: collision with root package name */
    public static o3<Integer> f11226j;
    public static o3<Boolean> j0;

    /* renamed from: k, reason: collision with root package name */
    public static o3<Integer> f11227k;
    public static o3<Boolean> k0;

    /* renamed from: l, reason: collision with root package name */
    public static o3<Integer> f11228l;
    public static o3<Boolean> l0;

    /* renamed from: m, reason: collision with root package name */
    public static o3<Integer> f11229m;
    public static o3<Boolean> m0;
    public static o3<Integer> n;
    public static o3<Boolean> n0;
    public static o3<Integer> o;
    public static o3<Boolean> o0;
    public static o3<Integer> p;
    public static o3<Boolean> p0;
    public static o3<Integer> q;
    public static o3<Boolean> q0;
    public static o3<String> r;
    public static o3<Boolean> r0;
    public static o3<Long> s;
    public static o3<Boolean> s0;
    public static o3<Long> t;
    public static o3<Boolean> t0;
    public static o3<Long> u;
    public static o3<Boolean> u0;
    public static o3<Long> v;
    public static o3<Boolean> v0;
    public static o3<Long> w;
    public static o3<Boolean> w0;
    public static o3<Long> x;
    private static o3<Boolean> x0;
    public static o3<Long> y;
    public static o3<Boolean> y0;
    public static o3<Long> z;
    public static o3<Boolean> z0;
    private static List<o3<?>> a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b, reason: collision with root package name */
    private static Set<o3<?>> f11218b = Collections.synchronizedSet(new HashSet());

    static {
        Long lValueOf = Long.valueOf(AbstractComponentTracker.LINGERING_TIMEOUT);
        f11219c = a("measurement.ad_id_cache_time", lValueOf, lValueOf, w.a);
        f11220d = a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, v.a);
        f11221e = a("measurement.config.cache_time", 86400000L, 3600000L, j0.a);
        f11222f = a("measurement.config.url_scheme", "https", "https", s0.a);
        f11223g = a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", g1.a);
        f11224h = a("measurement.upload.max_bundles", 100, 100, p1.a);
        f11225i = a("measurement.upload.max_batch_size", 65536, 65536, c2.a);
        f11226j = a("measurement.upload.max_bundle_size", 65536, 65536, m2.a);
        Integer numValueOf = Integer.valueOf(CoreConstants.MILLIS_IN_ONE_SECOND);
        f11227k = a("measurement.upload.max_events_per_bundle", numValueOf, numValueOf, z2.a);
        f11228l = a("measurement.upload.max_events_per_day", 100000, 100000, k3.a);
        f11229m = a("measurement.upload.max_error_events_per_day", numValueOf, numValueOf, y.a);
        n = a("measurement.upload.max_public_events_per_day", 50000, 50000, x.a);
        o = a("measurement.upload.max_conversions_per_day", 10000, 10000, a0.a);
        p = a("measurement.upload.max_realtime_events_per_day", 10, 10, z.a);
        q = a("measurement.store.max_stored_events_per_app", 100000, 100000, d0.a);
        r = a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", c0.a);
        s = a("measurement.upload.backoff_period", 43200000L, 43200000L, f0.a);
        t = a("measurement.upload.window_interval", 3600000L, 3600000L, e0.a);
        u = a("measurement.upload.interval", 3600000L, 3600000L, h0.a);
        v = a("measurement.upload.realtime_upload_interval", lValueOf, lValueOf, g0.a);
        w = a("measurement.upload.debug_upload_interval", 1000L, 1000L, i0.a);
        x = a("measurement.upload.minimum_delay", 500L, 500L, l0.a);
        Long lValueOf2 = Long.valueOf(ReconfigureOnChangeFilter.DEFAULT_REFRESH_PERIOD);
        y = a("measurement.alarm_manager.minimum_interval", lValueOf2, lValueOf2, k0.a);
        z = a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, n0.a);
        A = a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, m0.a);
        B = a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, p0.a);
        C = a("measurement.upload.retry_time", 1800000L, 1800000L, o0.a);
        D = a("measurement.upload.retry_count", 6, 6, r0.a);
        E = a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, q0.a);
        F = a("measurement.lifetimevalue.max_currency_tracked", 4, 4, t0.a);
        G = a("measurement.audience.filter_result_max_count", 200, 200, v0.a);
        H = a("measurement.upload.max_public_user_properties", 25, 25, null);
        I = a("measurement.upload.max_event_name_cardinality", 500, 500, null);
        J = a("measurement.upload.max_public_event_params", 25, 25, null);
        K = a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, u0.a);
        Boolean bool = Boolean.FALSE;
        L = a("measurement.test.boolean_flag", bool, bool, x0.a);
        M = a("measurement.test.string_flag", "---", "---", w0.a);
        N = a("measurement.test.long_flag", -1L, -1L, z0.a);
        O = a("measurement.test.int_flag", -2, -2, y0.a);
        Double dValueOf = Double.valueOf(-3.0d);
        P = a("measurement.test.double_flag", dValueOf, dValueOf, b1.a);
        Q = a("measurement.experiment.max_ids", 50, 50, a1.a);
        R = a("measurement.max_bundles_per_iteration", 100, 100, e1.a);
        S = a("measurement.validation.internal_limits_internal_event_params", bool, bool, d1.a);
        Boolean bool2 = Boolean.TRUE;
        T = a("measurement.collection.firebase_global_collection_flag_enabled", bool2, bool2, f1.a);
        U = a("measurement.collection.efficient_engagement_reporting_enabled_2", bool2, bool2, i1.a);
        V = a("measurement.collection.redundant_engagement_removal_enabled", bool, bool, h1.a);
        W = a("measurement.client.freeride_engagement_fix", bool2, bool2, k1.a);
        X = a("measurement.collection.log_event_and_bundle_v2", bool2, bool2, j1.a);
        Y = a("measurement.quality.checksum", bool, bool, null);
        Z = a("measurement.sdk.dynamite.allow_remote_dynamite3", bool2, bool2, m1.a);
        a0 = a("measurement.sdk.collection.validate_param_names_alphabetical", bool2, bool2, l1.a);
        b0 = a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, o1.a);
        c0 = a("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, n1.a);
        d0 = a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, q1.a);
        e0 = a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, s1.a);
        f0 = a("measurement.sdk.collection.last_deep_link_referrer2", bool2, bool2, r1.a);
        g0 = a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, u1.a);
        h0 = a("measurement.sdk.collection.last_gclid_from_referrer2", bool, bool, t1.a);
        i0 = a("measurement.sdk.collection.enable_extend_user_property_size", bool2, bool2, w1.a);
        j0 = a("measurement.upload.file_lock_state_check", bool, bool, v1.a);
        k0 = a("measurement.ga.ga_app_id", bool, bool, y1.a);
        l0 = a("measurement.lifecycle.app_in_background_parameter", bool, bool, x1.a);
        m0 = a("measurement.integration.disable_firebase_instance_id", bool, bool, a2.a);
        n0 = a("measurement.lifecycle.app_backgrounded_engagement", bool, bool, z1.a);
        o0 = a("measurement.collection.service.update_with_analytics_fix", bool, bool, b2.a);
        p0 = a("measurement.service.use_appinfo_modified", bool, bool, f2.a);
        q0 = a("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, e2.a);
        r0 = a("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, h2.a);
        s0 = a("measurement.scheduler.task_thread.cleanup_on_exit", bool, bool, g2.a);
        t0 = a("measurement.upload.file_truncate_fix", bool, bool, j2.a);
        u0 = a("measurement.sdk.referrer.delayed_install_referrer_api", bool, bool, i2.a);
        v0 = a("measurement.sdk.screen.disabling_automatic_reporting", bool2, bool2, l2.a);
        w0 = a("measurement.sdk.screen.manual_screen_view_logging", bool2, bool2, k2.a);
        x0 = a("measurement.collection.synthetic_data_mitigation", bool, bool, n2.a);
        y0 = a("measurement.service.configurable_service_limits", bool2, bool2, p2.a);
        z0 = a("measurement.client.configurable_service_limits", bool2, bool2, o2.a);
        A0 = a("measurement.androidId.delete_feature", bool2, bool2, r2.a);
        B0 = a("measurement.client.global_params", bool2, bool2, q2.a);
        C0 = a("measurement.service.global_params", bool2, bool2, t2.a);
        D0 = a("measurement.service.global_params_in_payload", bool2, bool2, s2.a);
        E0 = a("measurement.client.string_reader", bool2, bool2, v2.a);
        F0 = a("measurement.sdk.attribution.cache", bool2, bool2, u2.a);
        G0 = a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, x2.a);
        H0 = a("measurement.service.database_return_empty_collection", bool2, bool2, w2.a);
        I0 = a("measurement.service.ssaid_removal", bool2, bool2, y2.a);
        J0 = a("measurement.client.consent_state_v1", bool2, bool2, b3.a);
        K0 = a("measurement.client.3p_consent_state_v1", bool2, bool2, a3.a);
        Boolean bool3 = Boolean.FALSE;
        L0 = a("measurement.service.consent_state_v1_W36", bool3, bool3, d3.a);
        M0 = a("measurement.service.storage_consent_support_version", 203590, 203590, c3.a);
        N0 = a("measurement.client.ad_impression", bool2, bool2, g3.a);
        O0 = a("measurement.service.ad_impression", bool2, bool2, f3.a);
        P0 = a("measurement.service.separate_public_internal_event_blacklisting", bool2, bool2, i3.a);
        Q0 = a("measurement.service.directly_maybe_log_error_events", bool3, bool3, h3.a);
    }

    private static <V> o3<V> a(String str, V v2, V v3, m3<V> m3Var) {
        o3<V> o3Var = new o3<>(str, v2, v3, m3Var);
        a.add(o3Var);
        return o3Var;
    }

    public static Map<String, String> c(Context context) {
        e.c.b.b.c.e.h2 h2VarA = e.c.b.b.c.e.h2.a(context.getContentResolver(), e.c.b.b.c.e.t2.a("com.google.android.gms.measurement"));
        return h2VarA == null ? Collections.emptyMap() : h2VarA.b();
    }
}