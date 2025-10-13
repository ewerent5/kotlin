package e.c.b.b.c.e;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
final class p8 implements y8 {
    private y8[] a;

    p8(y8... y8VarArr) {
        this.a = y8VarArr;
    }

    @Override // e.c.b.b.c.e.y8
    public final boolean a(Class<?> cls) {
        for (y8 y8Var : this.a) {
            if (y8Var.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // e.c.b.b.c.e.y8
    public final z8 b(Class<?> cls) {
        for (y8 y8Var : this.a) {
            if (y8Var.a(cls)) {
                return y8Var.b(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}