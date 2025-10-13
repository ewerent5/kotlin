package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class aj2 implements jk2 {
    private static final aj2 a = new aj2();

    private aj2() {
    }

    public static aj2 a() {
        return a;
    }

    @Override // com.google.android.gms.internal.ads.jk2
    public final boolean b(Class<?> cls) {
        return ej2.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.ads.jk2
    public final ik2 c(Class<?> cls) {
        if (!ej2.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (ik2) ej2.z(cls.asSubclass(ej2.class)).C(3, null, null);
        } catch (Exception e2) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e2);
        }
    }
}