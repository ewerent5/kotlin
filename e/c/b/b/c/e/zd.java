package e.c.b.b.c.e;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class zd implements ae {
    private static final w2<Long> a;

    /* renamed from: b, reason: collision with root package name */
    private static final w2<Boolean> f14978b;

    /* renamed from: c, reason: collision with root package name */
    private static final w2<Boolean> f14979c;

    /* renamed from: d, reason: collision with root package name */
    private static final w2<Boolean> f14980d;

    /* renamed from: e, reason: collision with root package name */
    private static final w2<Long> f14981e;

    static {
        b3 b3Var = new b3(t2.a("com.google.android.gms.measurement"));
        a = b3Var.b("measurement.id.lifecycle.app_in_background_parameter", 0L);
        f14978b = b3Var.d("measurement.lifecycle.app_backgrounded_engagement", false);
        f14979c = b3Var.d("measurement.lifecycle.app_backgrounded_tracking", true);
        f14980d = b3Var.d("measurement.lifecycle.app_in_background_parameter", false);
        f14981e = b3Var.b("measurement.id.lifecycle.app_backgrounded_tracking", 0L);
    }

    @Override // e.c.b.b.c.e.ae
    public final boolean zza() {
        return f14978b.o().booleanValue();
    }

    @Override // e.c.b.b.c.e.ae
    public final boolean zzb() {
        return f14980d.o().booleanValue();
    }
}