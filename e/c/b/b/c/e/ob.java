package e.c.b.b.c.e;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class ob implements pb {
    private static final w2<Boolean> a;

    /* renamed from: b, reason: collision with root package name */
    private static final w2<Boolean> f14758b;

    static {
        b3 b3Var = new b3(t2.a("com.google.android.gms.measurement"));
        a = b3Var.d("measurement.androidId.delete_feature", true);
        f14758b = b3Var.d("measurement.log_androidId_enabled", false);
    }

    @Override // e.c.b.b.c.e.pb
    public final boolean zza() {
        return a.o().booleanValue();
    }
}