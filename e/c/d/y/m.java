package e.c.d.y;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* compiled from: UnsafeAllocator.java */
/* loaded from: classes.dex */
public abstract class m {

    /* compiled from: UnsafeAllocator.java */
    class a extends m {
        final /* synthetic */ Method a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f15506b;

        a(Method method, Object obj) {
            this.a = method;
            this.f15506b = obj;
        }

        @Override // e.c.d.y.m
        public <T> T c(Class<T> cls) {
            m.a(cls);
            return (T) this.a.invoke(this.f15506b, cls);
        }
    }

    /* compiled from: UnsafeAllocator.java */
    class b extends m {
        final /* synthetic */ Method a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f15507b;

        b(Method method, int i2) {
            this.a = method;
            this.f15507b = i2;
        }

        @Override // e.c.d.y.m
        public <T> T c(Class<T> cls) {
            m.a(cls);
            return (T) this.a.invoke(null, cls, Integer.valueOf(this.f15507b));
        }
    }

    /* compiled from: UnsafeAllocator.java */
    class c extends m {
        final /* synthetic */ Method a;

        c(Method method) {
            this.a = method;
        }

        @Override // e.c.d.y.m
        public <T> T c(Class<T> cls) {
            m.a(cls);
            return (T) this.a.invoke(null, cls, Object.class);
        }
    }

    /* compiled from: UnsafeAllocator.java */
    class d extends m {
        d() {
        }

        @Override // e.c.d.y.m
        public <T> T c(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls);
        }
    }

    static void a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + cls.getName());
        }
    }

    public static m b() throws NoSuchFieldException, NoSuchMethodException, ClassNotFoundException, SecurityException {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new b(declaredMethod2, iIntValue);
                } catch (Exception unused2) {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    return new c(declaredMethod3);
                }
            } catch (Exception unused3) {
                return new d();
            }
        }
    }

    public abstract <T> T c(Class<T> cls);
}