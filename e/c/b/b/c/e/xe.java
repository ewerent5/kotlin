package e.c.b.b.c.e;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class xe implements te {
    private static final w2<Boolean> a;

    /* renamed from: b, reason: collision with root package name */
    private static final w2<Long> f14928b;

    static {
        b3 b3Var = new b3(t2.a("com.google.android.gms.measurement"));
        a = b3Var.d("measurement.service.ssaid_removal", true);
        f14928b = b3Var.b("measurement.id.ssaid_removal", 0L);
    }

    @Override // e.c.b.b.c.e.te
    public final boolean zza() {
        return true;
    }

    @Override // e.c.b.b.c.e.te
    public final boolean zzb() {
        return a.o().booleanValue();
    }
}