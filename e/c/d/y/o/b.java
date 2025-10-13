package e.c.d.y.o;

import e.c.d.y.e;
import java.lang.reflect.AccessibleObject;

/* compiled from: ReflectionAccessor.java */
/* loaded from: classes.dex */
public abstract class b {
    private static final b a;

    static {
        a = e.c() < 9 ? new a() : new c();
    }

    public static b a() {
        return a;
    }

    public abstract void b(AccessibleObject accessibleObject);
}