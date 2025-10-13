package e.c.b.b.c.e;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class yd implements vd {
    private static final w2<Boolean> a;

    /* renamed from: b, reason: collision with root package name */
    private static final w2<Boolean> f14966b;

    /* renamed from: c, reason: collision with root package name */
    private static final w2<Boolean> f14967c;

    /* renamed from: d, reason: collision with root package name */
    private static final w2<Boolean> f14968d;

    /* renamed from: e, reason: collision with root package name */
    private static final w2<Long> f14969e;

    static {
        b3 b3Var = new b3(t2.a("com.google.android.gms.measurement"));
        a = b3Var.d("measurement.sdk.collection.enable_extend_user_property_size", true);
        f14966b = b3Var.d("measurement.sdk.collection.last_deep_link_referrer2", true);
        f14967c = b3Var.d("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        f14968d = b3Var.d("measurement.sdk.collection.last_gclid_from_referrer2", false);
        f14969e = b3Var.b("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // e.c.b.b.c.e.vd
    public final boolean zza() {
        return a.o().booleanValue();
    }

    @Override // e.c.b.b.c.e.vd
    public final boolean zzb() {
        return f14966b.o().booleanValue();
    }

    @Override // e.c.b.b.c.e.vd
    public final boolean zzc() {
        return f14967c.o().booleanValue();
    }

    @Override // e.c.b.b.c.e.vd
    public final boolean zzd() {
        return f14968d.o().booleanValue();
    }
}