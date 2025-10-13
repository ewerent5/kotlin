package e.c.d.y.o;

import e.c.d.m;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: UnsafeReflectionAccessor.java */
/* loaded from: classes.dex */
final class c extends b {

    /* renamed from: b, reason: collision with root package name */
    private static Class f15577b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f15578c = d();

    /* renamed from: d, reason: collision with root package name */
    private final Field f15579d = c();

    c() {
    }

    private static Field c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    private static Object d() throws NoSuchFieldException, ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f15577b = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // e.c.d.y.o.b
    public void b(AccessibleObject accessibleObject) throws SecurityException {
        if (e(accessibleObject)) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e2) {
            throw new m("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e2);
        }
    }

    boolean e(AccessibleObject accessibleObject) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.f15578c != null && this.f15579d != null) {
            try {
                f15577b.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.f15578c, accessibleObject, Long.valueOf(((Long) f15577b.getMethod("objectFieldOffset", Field.class).invoke(this.f15578c, this.f15579d)).longValue()), Boolean.TRUE);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}