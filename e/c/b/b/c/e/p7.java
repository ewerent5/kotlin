package e.c.b.b.c.e;

import e.c.b.b.c.e.o7;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
final class p7 implements y8 {
    private static final p7 a = new p7();

    private p7() {
    }

    public static p7 c() {
        return a;
    }

    @Override // e.c.b.b.c.e.y8
    public final boolean a(Class<?> cls) {
        return o7.class.isAssignableFrom(cls);
    }

    @Override // e.c.b.b.c.e.y8
    public final z8 b(Class<?> cls) {
        if (!o7.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (z8) o7.l(cls.asSubclass(o7.class)).o(o7.e.f14744c, null, null);
        } catch (Exception e2) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e2);
        }
    }
}