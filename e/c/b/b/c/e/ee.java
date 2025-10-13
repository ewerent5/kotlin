package e.c.b.b.c.e;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class ee implements be {
    private static final w2<Boolean> a;

    /* renamed from: b, reason: collision with root package name */
    private static final w2<Boolean> f14496b;

    static {
        b3 b3Var = new b3(t2.a("com.google.android.gms.measurement"));
        a = b3Var.d("measurement.sdk.screen.manual_screen_view_logging", true);
        f14496b = b3Var.d("measurement.sdk.screen.disabling_automatic_reporting", true);
    }

    @Override // e.c.b.b.c.e.be
    public final boolean zza() {
        return true;
    }

    @Override // e.c.b.b.c.e.be
    public final boolean zzb() {
        return a.o().booleanValue();
    }

    @Override // e.c.b.b.c.e.be
    public final boolean zzc() {
        return f14496b.o().booleanValue();
    }
}