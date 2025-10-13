package e.c.b.b.c.e;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class fe implements ge {
    private static final w2<Long> a;

    /* renamed from: b, reason: collision with root package name */
    private static final w2<Long> f14534b;

    static {
        b3 b3Var = new b3(t2.a("com.google.android.gms.measurement"));
        a = b3Var.b("measurement.id.max_bundles_per_iteration", 0L);
        f14534b = b3Var.b("measurement.max_bundles_per_iteration", 2L);
    }

    @Override // e.c.b.b.c.e.ge
    public final long zza() {
        return f14534b.o().longValue();
    }
}