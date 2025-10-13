package butterknife;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class ButterKnife {
    private static boolean a = false;

    /* renamed from: b, reason: collision with root package name */
    static final Map<Class<?>, Constructor<? extends Unbinder>> f2424b = new LinkedHashMap();

    private ButterKnife() {
        throw new AssertionError("No instances.");
    }

    public static Unbinder a(Object obj, View view) throws NoSuchMethodException, SecurityException {
        Class<?> cls = obj.getClass();
        if (a) {
            Log.d("ButterKnife", "Looking up binding for " + cls.getName());
        }
        Constructor<? extends Unbinder> constructorB = b(cls);
        if (constructorB == null) {
            return Unbinder.a;
        }
        try {
            return constructorB.newInstance(obj, view);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Unable to invoke " + constructorB, e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Unable to invoke " + constructorB, e3);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unable to create binding instance.", cause);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Constructor<? extends Unbinder> b(Class<?> cls) throws NoSuchMethodException, SecurityException {
        Constructor<? extends Unbinder> constructorB;
        Map<Class<?>, Constructor<? extends Unbinder>> map = f2424b;
        Constructor<? extends Unbinder> constructor = map.get(cls);
        if (constructor != null || map.containsKey(cls)) {
            if (a) {
                Log.d("ButterKnife", "HIT: Cached in binding map.");
            }
            return constructor;
        }
        String name = cls.getName();
        if (name.startsWith("android.") || name.startsWith("java.") || name.startsWith("androidx.")) {
            if (!a) {
                return null;
            }
            Log.d("ButterKnife", "MISS: Reached framework class. Abandoning search.");
            return null;
        }
        try {
            constructorB = cls.getClassLoader().loadClass(name + "_ViewBinding").getConstructor(cls, View.class);
            if (a) {
                Log.d("ButterKnife", "HIT: Loaded binding class and constructor.");
            }
        } catch (ClassNotFoundException unused) {
            if (a) {
                Log.d("ButterKnife", "Not found. Trying superclass " + cls.getSuperclass().getName());
            }
            constructorB = b(cls.getSuperclass());
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException("Unable to find binding constructor for " + name, e2);
        }
        f2424b.put(cls, constructorB);
        return constructorB;
    }
}