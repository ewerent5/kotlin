package e.c.b.b.c.e;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
final class w8 {
    private static final u8 a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final u8 f14918b = new x8();

    static u8 a() {
        return a;
    }

    static u8 b() {
        return f14918b;
    }

    private static u8 c() {
        try {
            return (u8) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}