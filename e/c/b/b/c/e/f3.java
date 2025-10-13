package e.c.b.b.c.e;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class f3 {
    private final boolean a;

    public f3(i3 i3Var) {
        q3.c(i3Var, "BuildInfo must be non-null");
        this.a = !i3Var.zza();
    }

    public final boolean a(String str) {
        q3.c(str, "flagName must not be null");
        if (this.a) {
            return h3.a.zza().a(str);
        }
        return true;
    }
}