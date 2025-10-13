package e.c.b.b.c.e;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class ld implements id {
    private static final w2<Boolean> a;

    /* renamed from: b, reason: collision with root package name */
    private static final w2<Boolean> f14698b;

    /* renamed from: c, reason: collision with root package name */
    private static final w2<Long> f14699c;

    static {
        b3 b3Var = new b3(t2.a("com.google.android.gms.measurement"));
        a = b3Var.d("measurement.collection.efficient_engagement_reporting_enabled_2", true);
        f14698b = b3Var.d("measurement.collection.redundant_engagement_removal_enabled", false);
        f14699c = b3Var.b("measurement.id.collection.redundant_engagement_removal_enabled", 0L);
    }

    @Override // e.c.b.b.c.e.id
    public final boolean zza() {
        return a.o().booleanValue();
    }

    @Override // e.c.b.b.c.e.id
    public final boolean zzb() {
        return f14698b.o().booleanValue();
    }
}