package e.c.b.b.c.e;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class hc implements ic {
    private static final w2<Boolean> a;

    /* renamed from: b, reason: collision with root package name */
    private static final w2<Boolean> f14594b;

    /* renamed from: c, reason: collision with root package name */
    private static final w2<Boolean> f14595c;

    /* renamed from: d, reason: collision with root package name */
    private static final w2<Long> f14596d;

    static {
        b3 b3Var = new b3(t2.a("com.google.android.gms.measurement"));
        a = b3Var.d("measurement.sdk.dynamite.allow_remote_dynamite3", true);
        f14594b = b3Var.d("measurement.collection.init_params_control_enabled", true);
        f14595c = b3Var.d("measurement.sdk.dynamite.use_dynamite3", true);
        f14596d = b3Var.b("measurement.id.sdk.dynamite.use_dynamite", 0L);
    }

    @Override // e.c.b.b.c.e.ic
    public final boolean zza() {
        return a.o().booleanValue();
    }
}