package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class cm2 {
    private static final Unsafe a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?> f5333b;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f5334c;

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f5335d;

    /* renamed from: e, reason: collision with root package name */
    private static final bm2 f5336e;

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f5337f;

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f5338g;

    /* renamed from: h, reason: collision with root package name */
    static final long f5339h;

    /* renamed from: i, reason: collision with root package name */
    static final boolean f5340i;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    static {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cm2.<clinit>():void");
    }

    private cm2() {
    }

    static /* synthetic */ boolean A(Object obj, long j2) {
        return ((byte) ((f5336e.k(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3))) & 255)) != 0;
    }

    static /* synthetic */ boolean B(Object obj, long j2) {
        return ((byte) ((f5336e.k(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & 255)) != 0;
    }

    private static int E(Class<?> cls) {
        if (f5338g) {
            return f5336e.i(cls);
        }
        return -1;
    }

    private static int a(Class<?> cls) {
        if (f5338g) {
            return f5336e.j(cls);
        }
        return -1;
    }

    private static Field b() {
        int i2 = nh2.a;
        Field fieldC = c(Buffer.class, "effectiveDirectAddress");
        if (fieldC != null) {
            return fieldC;
        }
        Field fieldC2 = c(Buffer.class, "address");
        if (fieldC2 == null || fieldC2.getType() != Long.TYPE) {
            return null;
        }
        return fieldC2;
    }

    private static Field c(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        bm2 bm2Var = f5336e;
        int iK = bm2Var.k(obj, j3);
        int i2 = ((~((int) j2)) & 3) << 3;
        bm2Var.l(obj, j3, ((255 & b2) << i2) | (iK & (~(255 << i2))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        bm2 bm2Var = f5336e;
        int i2 = (((int) j2) & 3) << 3;
        bm2Var.l(obj, j3, ((255 & b2) << i2) | (bm2Var.k(obj, j3) & (~(255 << i2))));
    }

    static boolean f() {
        return f5338g;
    }

    static boolean g() {
        return f5337f;
    }

    static <T> T h(Class<T> cls) {
        try {
            return (T) a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    static int i(Object obj, long j2) {
        return f5336e.k(obj, j2);
    }

    static void j(Object obj, long j2, int i2) {
        f5336e.l(obj, j2, i2);
    }

    static long k(Object obj, long j2) {
        return f5336e.m(obj, j2);
    }

    static void l(Object obj, long j2, long j3) {
        f5336e.n(obj, j2, j3);
    }

    static boolean m(Object obj, long j2) {
        return f5336e.b(obj, j2);
    }

    static void n(Object obj, long j2, boolean z) {
        f5336e.c(obj, j2, z);
    }

    static float o(Object obj, long j2) {
        return f5336e.d(obj, j2);
    }

    static void p(Object obj, long j2, float f2) {
        f5336e.e(obj, j2, f2);
    }

    static double q(Object obj, long j2) {
        return f5336e.f(obj, j2);
    }

    static void r(Object obj, long j2, double d2) {
        f5336e.g(obj, j2, d2);
    }

    static Object s(Object obj, long j2) {
        return f5336e.o(obj, j2);
    }

    static void t(Object obj, long j2, Object obj2) {
        f5336e.p(obj, j2, obj2);
    }

    static void u(byte[] bArr, long j2, byte b2) {
        f5336e.a(bArr, f5339h + j2, b2);
    }

    static Unsafe v() {
        try {
            return (Unsafe) AccessController.doPrivileged(new xl2());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean w(Class<?> cls) {
        int i2 = nh2.a;
        try {
            Class<?> cls2 = f5333b;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static /* synthetic */ void x(Throwable th) {
        Logger logger = Logger.getLogger(cm2.class.getName());
        Level level = Level.WARNING;
        String strValueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 71);
        sb.append("platform method missing - proto runtime falling back to safer methods: ");
        sb.append(strValueOf);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", sb.toString());
    }
}