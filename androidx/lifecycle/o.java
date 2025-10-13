package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Lifecycling.java */
/* loaded from: classes.dex */
public class o {
    private static Map<Class<?>, Integer> a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static Map<Class<?>, List<Constructor<? extends f>>> f1222b = new HashMap();

    private static f a(Constructor<? extends f> constructor, Object obj) {
        try {
            return constructor.newInstance(obj);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    private static Constructor<? extends f> b(Class<?> cls) throws NoSuchMethodException, SecurityException {
        try {
            Package r0 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r0 != null ? r0.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String strC = c(canonicalName);
            if (!name.isEmpty()) {
                strC = name + "." + strC;
            }
            Constructor declaredConstructor = Class.forName(strC).getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static String c(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    private static int d(Class<?> cls) throws NoSuchMethodException, SecurityException {
        Integer num = a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int iG = g(cls);
        a.put(cls, Integer.valueOf(iG));
        return iG;
    }

    private static boolean e(Class<?> cls) {
        return cls != null && j.class.isAssignableFrom(cls);
    }

    static i f(Object obj) {
        boolean z = obj instanceof i;
        boolean z2 = obj instanceof e;
        if (z && z2) {
            return new FullLifecycleObserverAdapter((e) obj, (i) obj);
        }
        if (z2) {
            return new FullLifecycleObserverAdapter((e) obj, null);
        }
        if (z) {
            return (i) obj;
        }
        Class<?> cls = obj.getClass();
        if (d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List<Constructor<? extends f>> list = f1222b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(a(list.get(0), obj));
        }
        f[] fVarArr = new f[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            fVarArr[i2] = a(list.get(i2), obj);
        }
        return new CompositeGeneratedAdaptersObserver(fVarArr);
    }

    private static int g(Class<?> cls) throws NoSuchMethodException, SecurityException {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends f> constructorB = b(cls);
        if (constructorB != null) {
            f1222b.put(cls, Collections.singletonList(constructorB));
            return 2;
        }
        if (b.a.d(cls)) {
            return 1;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        ArrayList arrayList = null;
        if (e(superclass)) {
            if (d(superclass) == 1) {
                return 1;
            }
            arrayList = new ArrayList(f1222b.get(superclass));
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            if (e(cls2)) {
                if (d(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.addAll(f1222b.get(cls2));
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f1222b.put(cls, arrayList);
        return 2;
    }
}