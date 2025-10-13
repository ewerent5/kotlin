package e.c.b.b.c.e;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class gc implements dc {
    private static final w2<Boolean> a;

    /* renamed from: b, reason: collision with root package name */
    private static final w2<Boolean> f14555b;

    /* renamed from: c, reason: collision with root package name */
    private static final w2<Boolean> f14556c;

    /* renamed from: d, reason: collision with root package name */
    private static final w2<Long> f14557d;

    /* renamed from: e, reason: collision with root package name */
    private static final w2<Long> f14558e;

    static {
        b3 b3Var = new b3(t2.a("com.google.android.gms.measurement"));
        a = b3Var.d("measurement.client.consent_state_v1", false);
        f14555b = b3Var.d("measurement.client.3p_consent_state_v1", false);
        f14556c = b3Var.d("measurement.service.consent_state_v1_W36", false);
        f14557d = b3Var.b("measurement.id.service.consent_state_v1_W36", 0L);
        f14558e = b3Var.b("measurement.service.storage_consent_support_version", 203590L);
    }

    @Override // e.c.b.b.c.e.dc
    public final boolean zza() {
        return true;
    }

    @Override // e.c.b.b.c.e.dc
    public final boolean zzb() {
        return a.o().booleanValue();
    }

    @Override // e.c.b.b.c.e.dc
    public final boolean zzc() {
        return f14555b.o().booleanValue();
    }

    @Override // e.c.b.b.c.e.dc
    public final boolean zzd() {
        return f14556c.o().booleanValue();
    }

    @Override // e.c.b.b.c.e.dc
    public final long zze() {
        return f14558e.o().longValue();
    }
}