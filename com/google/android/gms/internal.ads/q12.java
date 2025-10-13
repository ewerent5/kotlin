package com.google.android.gms.internal.ads;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class q12 {

    @NullableDecl
    private static final Object a;

    /* renamed from: b, reason: collision with root package name */
    @NullableDecl
    private static final Method f8311b;

    /* renamed from: c, reason: collision with root package name */
    @NullableDecl
    private static final Method f8312c;

    static {
        Object objC = c();
        a = objC;
        f8311b = objC == null ? null : e("getStackTraceElement", Throwable.class, Integer.TYPE);
        f8312c = objC != null ? d() : null;
    }

    public static void a(Throwable th) {
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    public static String b(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        ih2.c(th, new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @NullableDecl
    private static Object c() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    @NullableDecl
    private static Method d() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Method methodE = e("getStackTraceDepth", Throwable.class);
            if (methodE == null) {
                return null;
            }
            methodE.invoke(c(), new Throwable());
            return methodE;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    @NullableDecl
    private static Method e(String str, Class<?>... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }
}