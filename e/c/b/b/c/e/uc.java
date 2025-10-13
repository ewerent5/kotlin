package e.c.b.b.c.e;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class uc implements vc {
    private static final w2<Boolean> a;

    /* renamed from: b, reason: collision with root package name */
    private static final w2<Long> f14878b;

    static {
        b3 b3Var = new b3(t2.a("com.google.android.gms.measurement"));
        a = b3Var.d("measurement.sdk.referrer.delayed_install_referrer_api", false);
        f14878b = b3Var.b("measurement.id.sdk.referrer.delayed_install_referrer_api", 0L);
    }

    @Override // e.c.b.b.c.e.vc
    public final boolean zza() {
        return true;
    }

    @Override // e.c.b.b.c.e.vc
    public final boolean zzb() {
        return a.o().booleanValue();
    }
}