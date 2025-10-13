package e.c.b.b.c.e;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class ib implements jb {
    private static final w2<Boolean> a;

    /* renamed from: b, reason: collision with root package name */
    private static final w2<Boolean> f14624b;

    /* renamed from: c, reason: collision with root package name */
    private static final w2<Boolean> f14625c;

    /* renamed from: d, reason: collision with root package name */
    private static final w2<Long> f14626d;

    static {
        b3 b3Var = new b3(t2.a("com.google.android.gms.measurement"));
        a = b3Var.d("measurement.client.ad_impression", true);
        f14624b = b3Var.d("measurement.service.separate_public_internal_event_blacklisting", true);
        f14625c = b3Var.d("measurement.service.ad_impression", true);
        f14626d = b3Var.b("measurement.id.service.ad_impression", 0L);
    }

    @Override // e.c.b.b.c.e.jb
    public final boolean zza() {
        return true;
    }

    @Override // e.c.b.b.c.e.jb
    public final boolean zzb() {
        return a.o().booleanValue();
    }

    @Override // e.c.b.b.c.e.jb
    public final boolean zzc() {
        return f14624b.o().booleanValue();
    }

    @Override // e.c.b.b.c.e.jb
    public final boolean zzd() {
        return f14625c.o().booleanValue();
    }
}