package e.c.b.b.c.e;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
final class k9 {
    private static final i9 a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final i9 f14672b = new h9();

    static i9 a() {
        return a;
    }

    static i9 b() {
        return f14672b;
    }

    private static i9 c() {
        try {
            return (i9) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}