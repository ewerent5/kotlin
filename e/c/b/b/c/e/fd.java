package e.c.b.b.c.e;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class fd implements cd {
    private static final w2<Boolean> a;

    /* renamed from: b, reason: collision with root package name */
    private static final w2<Boolean> f14532b;

    /* renamed from: c, reason: collision with root package name */
    private static final w2<Boolean> f14533c;

    static {
        b3 b3Var = new b3(t2.a("com.google.android.gms.measurement"));
        a = b3Var.d("measurement.client.sessions.check_on_reset_and_enable2", true);
        f14532b = b3Var.d("measurement.client.sessions.check_on_startup", true);
        f14533c = b3Var.d("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override // e.c.b.b.c.e.cd
    public final boolean zza() {
        return true;
    }

    @Override // e.c.b.b.c.e.cd
    public final boolean zzb() {
        return a.o().booleanValue();
    }
}