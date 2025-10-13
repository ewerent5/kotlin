package e.c.b.b.c.e;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class nc implements oc {
    private static final w2<Boolean> a = new b3(t2.a("com.google.android.gms.measurement")).d("measurement.client.firebase_feature_rollout.v1.enable", true);

    @Override // e.c.b.b.c.e.oc
    public final boolean zza() {
        return true;
    }

    @Override // e.c.b.b.c.e.oc
    public final boolean zzb() {
        return a.o().booleanValue();
    }
}