package e.c.b.b.c.e;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class vb implements wb {
    private static final w2<Boolean> a;

    /* renamed from: b, reason: collision with root package name */
    private static final w2<Long> f14900b;

    static {
        b3 b3Var = new b3(t2.a("com.google.android.gms.measurement"));
        a = b3Var.d("measurement.sdk.attribution.cache", true);
        f14900b = b3Var.b("measurement.sdk.attribution.cache.ttl", 604800000L);
    }

    @Override // e.c.b.b.c.e.wb
    public final boolean zza() {
        return a.o().booleanValue();
    }

    @Override // e.c.b.b.c.e.wb
    public final long zzb() {
        return f14900b.o().longValue();
    }
}