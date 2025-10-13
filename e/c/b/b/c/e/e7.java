package e.c.b.b.c.e;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
final class e7 {
    private static final d7<?> a = new f7();

    /* renamed from: b, reason: collision with root package name */
    private static final d7<?> f14478b = c();

    static d7<?> a() {
        return a;
    }

    static d7<?> b() {
        d7<?> d7Var = f14478b;
        if (d7Var != null) {
            return d7Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    private static d7<?> c() {
        try {
            return (d7) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}