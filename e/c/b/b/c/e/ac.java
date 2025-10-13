package e.c.b.b.c.e;

import ch.qos.logback.classic.turbo.ReconfigureOnChangeFilter;
import ch.qos.logback.core.spi.AbstractComponentTracker;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class ac implements xb {
    private static final w2<Long> A;
    private static final w2<Long> B;
    private static final w2<Long> C;
    private static final w2<Long> D;
    private static final w2<Long> E;
    private static final w2<Long> F;
    private static final w2<Long> G;
    private static final w2<Long> H;
    private static final w2<String> I;
    private static final w2<Long> J;
    private static final w2<Long> a;

    /* renamed from: b, reason: collision with root package name */
    private static final w2<Long> f14371b;

    /* renamed from: c, reason: collision with root package name */
    private static final w2<String> f14372c;

    /* renamed from: d, reason: collision with root package name */
    private static final w2<String> f14373d;

    /* renamed from: e, reason: collision with root package name */
    private static final w2<String> f14374e;

    /* renamed from: f, reason: collision with root package name */
    private static final w2<Long> f14375f;

    /* renamed from: g, reason: collision with root package name */
    private static final w2<Long> f14376g;

    /* renamed from: h, reason: collision with root package name */
    private static final w2<Long> f14377h;

    /* renamed from: i, reason: collision with root package name */
    private static final w2<Long> f14378i;

    /* renamed from: j, reason: collision with root package name */
    private static final w2<Long> f14379j;

    /* renamed from: k, reason: collision with root package name */
    private static final w2<Long> f14380k;

    /* renamed from: l, reason: collision with root package name */
    private static final w2<Long> f14381l;

    /* renamed from: m, reason: collision with root package name */
    private static final w2<Long> f14382m;
    private static final w2<Long> n;
    private static final w2<Long> o;
    private static final w2<Long> p;
    private static final w2<Long> q;
    private static final w2<String> r;
    private static final w2<Long> s;
    private static final w2<Long> t;
    private static final w2<Long> u;
    private static final w2<Long> v;
    private static final w2<Long> w;
    private static final w2<Long> x;
    private static final w2<Long> y;
    private static final w2<Long> z;

    static {
        b3 b3Var = new b3(t2.a("com.google.android.gms.measurement"));
        a = b3Var.b("measurement.ad_id_cache_time", AbstractComponentTracker.LINGERING_TIMEOUT);
        f14371b = b3Var.b("measurement.config.cache_time", 86400000L);
        f14372c = b3Var.c("measurement.log_tag", "FA");
        f14373d = b3Var.c("measurement.config.url_authority", "app-measurement.com");
        f14374e = b3Var.c("measurement.config.url_scheme", "https");
        f14375f = b3Var.b("measurement.upload.debug_upload_interval", 1000L);
        f14376g = b3Var.b("measurement.lifetimevalue.max_currency_tracked", 4L);
        f14377h = b3Var.b("measurement.store.max_stored_events_per_app", 100000L);
        f14378i = b3Var.b("measurement.experiment.max_ids", 50L);
        f14379j = b3Var.b("measurement.audience.filter_result_max_count", 200L);
        f14380k = b3Var.b("measurement.alarm_manager.minimum_interval", ReconfigureOnChangeFilter.DEFAULT_REFRESH_PERIOD);
        f14381l = b3Var.b("measurement.upload.minimum_delay", 500L);
        f14382m = b3Var.b("measurement.monitoring.sample_period_millis", 86400000L);
        n = b3Var.b("measurement.upload.realtime_upload_interval", AbstractComponentTracker.LINGERING_TIMEOUT);
        o = b3Var.b("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        p = b3Var.b("measurement.config.cache_time.service", 3600000L);
        q = b3Var.b("measurement.service_client.idle_disconnect_millis", 5000L);
        r = b3Var.c("measurement.log_tag.service", "FA-SVC");
        s = b3Var.b("measurement.upload.stale_data_deletion_interval", 86400000L);
        t = b3Var.b("measurement.upload.backoff_period", 43200000L);
        u = b3Var.b("measurement.upload.initial_upload_delay_time", 15000L);
        v = b3Var.b("measurement.upload.interval", 3600000L);
        w = b3Var.b("measurement.upload.max_bundle_size", 65536L);
        x = b3Var.b("measurement.upload.max_bundles", 100L);
        y = b3Var.b("measurement.upload.max_conversions_per_day", 500L);
        z = b3Var.b("measurement.upload.max_error_events_per_day", 1000L);
        A = b3Var.b("measurement.upload.max_events_per_bundle", 1000L);
        B = b3Var.b("measurement.upload.max_events_per_day", 100000L);
        C = b3Var.b("measurement.upload.max_public_events_per_day", 50000L);
        D = b3Var.b("measurement.upload.max_queue_time", 2419200000L);
        E = b3Var.b("measurement.upload.max_realtime_events_per_day", 10L);
        F = b3Var.b("measurement.upload.max_batch_size", 65536L);
        G = b3Var.b("measurement.upload.retry_count", 6L);
        H = b3Var.b("measurement.upload.retry_time", 1800000L);
        I = b3Var.c("measurement.upload.url", "https://app-measurement.com/a");
        J = b3Var.b("measurement.upload.window_interval", 3600000L);
    }

    @Override // e.c.b.b.c.e.xb
    public final long a() {
        return q.o().longValue();
    }

    @Override // e.c.b.b.c.e.xb
    public final long b() {
        return J.o().longValue();
    }

    @Override // e.c.b.b.c.e.xb
    public final long c() {
        return H.o().longValue();
    }

    @Override // e.c.b.b.c.e.xb
    public final String d() {
        return I.o();
    }

    @Override // e.c.b.b.c.e.xb
    public final long e() {
        return F.o().longValue();
    }

    @Override // e.c.b.b.c.e.xb
    public final long f() {
        return C.o().longValue();
    }

    @Override // e.c.b.b.c.e.xb
    public final long g() {
        return G.o().longValue();
    }

    @Override // e.c.b.b.c.e.xb
    public final long h() {
        return E.o().longValue();
    }

    @Override // e.c.b.b.c.e.xb
    public final long k() {
        return D.o().longValue();
    }

    @Override // e.c.b.b.c.e.xb
    public final long zza() {
        return a.o().longValue();
    }

    @Override // e.c.b.b.c.e.xb
    public final long zzb() {
        return f14371b.o().longValue();
    }

    @Override // e.c.b.b.c.e.xb
    public final String zzc() {
        return f14373d.o();
    }

    @Override // e.c.b.b.c.e.xb
    public final String zzd() {
        return f14374e.o();
    }

    @Override // e.c.b.b.c.e.xb
    public final long zze() {
        return f14375f.o().longValue();
    }

    @Override // e.c.b.b.c.e.xb
    public final long zzf() {
        return f14376g.o().longValue();
    }

    @Override // e.c.b.b.c.e.xb
    public final long zzg() {
        return f14377h.o().longValue();
    }

    @Override // e.c.b.b.c.e.xb
    public final long zzh() {
        return f14378i.o().longValue();
    }

    @Override // e.c.b.b.c.e.xb
    public final long zzi() {
        return f14379j.o().longValue();
    }

    @Override // e.c.b.b.c.e.xb
    public final long zzj() {
        return f14380k.o().longValue();
    }

    @Override // e.c.b.b.c.e.xb
    public final long zzk() {
        return f14381l.o().longValue();
    }

    @Override // e.c.b.b.c.e.xb
    public final long zzl() {
        return f14382m.o().longValue();
    }

    @Override // e.c.b.b.c.e.xb
    public final long zzm() {
        return n.o().longValue();
    }

    @Override // e.c.b.b.c.e.xb
    public final long zzn() {
        return o.o().longValue();
    }

    @Override // e.c.b.b.c.e.xb
    public final long zzp() {
        return s.o().longValue();
    }

    @Override // e.c.b.b.c.e.xb
    public final long zzq() {
        return t.o().longValue();
    }

    @Override // e.c.b.b.c.e.xb
    public final long zzr() {
        return u.o().longValue();
    }

    @Override // e.c.b.b.c.e.xb
    public final long zzs() {
        return v.o().longValue();
    }

    @Override // e.c.b.b.c.e.xb
    public final long zzt() {
        return w.o().longValue();
    }

    @Override // e.c.b.b.c.e.xb
    public final long zzu() {
        return x.o().longValue();
    }

    @Override // e.c.b.b.c.e.xb
    public final long zzv() {
        return y.o().longValue();
    }

    @Override // e.c.b.b.c.e.xb
    public final long zzw() {
        return z.o().longValue();
    }

    @Override // e.c.b.b.c.e.xb
    public final long zzx() {
        return A.o().longValue();
    }

    @Override // e.c.b.b.c.e.xb
    public final long zzy() {
        return B.o().longValue();
    }
}