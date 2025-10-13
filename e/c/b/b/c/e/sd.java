package e.c.b.b.c.e;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class sd implements td {
    private static final w2<Boolean> a;

    /* renamed from: b, reason: collision with root package name */
    private static final w2<Boolean> f14837b;

    /* renamed from: c, reason: collision with root package name */
    private static final w2<Boolean> f14838c;

    /* renamed from: d, reason: collision with root package name */
    private static final w2<Long> f14839d;

    static {
        b3 b3Var = new b3(t2.a("com.google.android.gms.measurement"));
        a = b3Var.d("measurement.client.global_params", true);
        f14837b = b3Var.d("measurement.service.global_params_in_payload", true);
        f14838c = b3Var.d("measurement.service.global_params", true);
        f14839d = b3Var.b("measurement.id.service.global_params", 0L);
    }

    @Override // e.c.b.b.c.e.td
    public final boolean zza() {
        return true;
    }

    @Override // e.c.b.b.c.e.td
    public final boolean zzb() {
        return a.o().booleanValue();
    }

    @Override // e.c.b.b.c.e.td
    public final boolean zzc() {
        return f14837b.o().booleanValue();
    }

    @Override // e.c.b.b.c.e.td
    public final boolean zzd() {
        return f14838c.o().booleanValue();
    }
}