package e.c.b.b.c.e;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class ef implements ff {
    private static final w2<Boolean> a = new b3(t2.a("com.google.android.gms.measurement")).d("measurement.integration.disable_firebase_instance_id", false);

    @Override // e.c.b.b.c.e.ff
    public final boolean zza() {
        return true;
    }

    @Override // e.c.b.b.c.e.ff
    public final boolean zzb() {
        return a.o().booleanValue();
    }
}