package e.c.b.b.c.e;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class sc implements pc {
    private static final w2<Boolean> a;

    /* renamed from: b, reason: collision with root package name */
    private static final w2<Boolean> f14834b;

    /* renamed from: c, reason: collision with root package name */
    private static final w2<Boolean> f14835c;

    /* renamed from: d, reason: collision with root package name */
    private static final w2<Boolean> f14836d;

    static {
        b3 b3Var = new b3(t2.a("com.google.android.gms.measurement"));
        a = b3Var.d("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f14834b = b3Var.d("measurement.audience.refresh_event_count_filters_timestamp", false);
        f14835c = b3Var.d("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f14836d = b3Var.d("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // e.c.b.b.c.e.pc
    public final boolean zza() {
        return true;
    }

    @Override // e.c.b.b.c.e.pc
    public final boolean zzb() {
        return f14834b.o().booleanValue();
    }

    @Override // e.c.b.b.c.e.pc
    public final boolean zzc() {
        return f14835c.o().booleanValue();
    }

    @Override // e.c.b.b.c.e.pc
    public final boolean zzd() {
        return f14836d.o().booleanValue();
    }
}