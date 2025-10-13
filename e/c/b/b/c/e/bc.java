package e.c.b.b.c.e;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class bc implements cc {
    private static final w2<Boolean> a;

    /* renamed from: b, reason: collision with root package name */
    private static final w2<Boolean> f14415b;

    /* renamed from: c, reason: collision with root package name */
    private static final w2<Long> f14416c;

    static {
        b3 b3Var = new b3(t2.a("com.google.android.gms.measurement"));
        a = b3Var.d("measurement.service.configurable_service_limits", true);
        f14415b = b3Var.d("measurement.client.configurable_service_limits", true);
        f14416c = b3Var.b("measurement.id.service.configurable_service_limits", 0L);
    }

    @Override // e.c.b.b.c.e.cc
    public final boolean zza() {
        return true;
    }

    @Override // e.c.b.b.c.e.cc
    public final boolean zzb() {
        return a.o().booleanValue();
    }

    @Override // e.c.b.b.c.e.cc
    public final boolean zzc() {
        return f14415b.o().booleanValue();
    }
}