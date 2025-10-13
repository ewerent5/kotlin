package e.c.b.b.c.e;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class le implements me {
    private static final w2<Boolean> a;

    /* renamed from: b, reason: collision with root package name */
    private static final w2<Double> f14700b;

    /* renamed from: c, reason: collision with root package name */
    private static final w2<Long> f14701c;

    /* renamed from: d, reason: collision with root package name */
    private static final w2<Long> f14702d;

    /* renamed from: e, reason: collision with root package name */
    private static final w2<String> f14703e;

    static {
        b3 b3Var = new b3(t2.a("com.google.android.gms.measurement"));
        a = b3Var.d("measurement.test.boolean_flag", false);
        f14700b = b3Var.a("measurement.test.double_flag", -3.0d);
        f14701c = b3Var.b("measurement.test.int_flag", -2L);
        f14702d = b3Var.b("measurement.test.long_flag", -1L);
        f14703e = b3Var.c("measurement.test.string_flag", "---");
    }

    @Override // e.c.b.b.c.e.me
    public final boolean zza() {
        return a.o().booleanValue();
    }

    @Override // e.c.b.b.c.e.me
    public final double zzb() {
        return f14700b.o().doubleValue();
    }

    @Override // e.c.b.b.c.e.me
    public final long zzc() {
        return f14701c.o().longValue();
    }

    @Override // e.c.b.b.c.e.me
    public final long zzd() {
        return f14702d.o().longValue();
    }

    @Override // e.c.b.b.c.e.me
    public final String zze() {
        return f14703e.o();
    }
}