package e.c.b.b.c.e;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class ub implements qb {
    private static final w2<Boolean> a;

    /* renamed from: b, reason: collision with root package name */
    private static final w2<Long> f14877b;

    static {
        b3 b3Var = new b3(t2.a("com.google.android.gms.measurement"));
        a = b3Var.d("measurement.service.directly_maybe_log_error_events", false);
        f14877b = b3Var.b("measurement.id.service.directly_maybe_log_error_events", 0L);
    }

    @Override // e.c.b.b.c.e.qb
    public final boolean zza() {
        return true;
    }

    @Override // e.c.b.b.c.e.qb
    public final boolean zzb() {
        return a.o().booleanValue();
    }
}