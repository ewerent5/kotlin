package i.y.d;

/* compiled from: Reflection.java */
/* loaded from: classes3.dex */
public class v {
    private static final w a;

    /* renamed from: b, reason: collision with root package name */
    private static final i.b0.c[] f15894b;

    static {
        w wVar = null;
        try {
            wVar = (w) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (wVar == null) {
            wVar = new w();
        }
        a = wVar;
        f15894b = new i.b0.c[0];
    }

    public static i.b0.e a(i iVar) {
        return a.a(iVar);
    }

    public static i.b0.c b(Class cls) {
        return a.b(cls);
    }

    public static i.b0.d c(Class cls) {
        return a.c(cls, "");
    }

    public static i.b0.g d(n nVar) {
        return a.d(nVar);
    }

    public static String e(h hVar) {
        return a.e(hVar);
    }

    public static String f(m mVar) {
        return a.f(mVar);
    }
}