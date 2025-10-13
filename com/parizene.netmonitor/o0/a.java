package com.parizene.netmonitor.o0;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: ReflectUtils.java */
/* loaded from: classes.dex */
public class a {
    public static Field a(Class<?> cls, String str) throws NoSuchFieldException {
        Field declaredField;
        try {
            declaredField = cls.getDeclaredField(str);
            try {
                declaredField.setAccessible(true);
            } catch (Exception e2) {
                e = e2;
                m.a.a.g(e);
                return declaredField;
            }
        } catch (Exception e3) {
            e = e3;
            declaredField = null;
        }
        return declaredField;
    }

    public static Method b(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException, SecurityException {
        Method declaredMethod;
        try {
            declaredMethod = cls.getDeclaredMethod(str, clsArr);
            try {
                declaredMethod.setAccessible(true);
            } catch (Exception e2) {
                e = e2;
                m.a.a.g(e);
                return declaredMethod;
            }
        } catch (Exception e3) {
            e = e3;
            declaredMethod = null;
        }
        return declaredMethod;
    }

    public static Object c(Object obj, Field field, Object obj2) {
        if (field != null) {
            try {
                return field.get(obj);
            } catch (Exception e2) {
                m.a.a.g(e2);
            }
        }
        return obj2;
    }

    public static Object d(Object obj, Method method, Object obj2, Object... objArr) {
        if (method != null) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception e2) {
                m.a.a.g(e2);
            }
        }
        return obj2;
    }
}