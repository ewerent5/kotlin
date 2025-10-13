package e.c.b.b.c.e;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
final class qa {
    private static final Unsafe a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?> f14784b;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f14785c;

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f14786d;

    /* renamed from: e, reason: collision with root package name */
    private static final c f14787e;

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f14788f;

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f14789g;

    /* renamed from: h, reason: collision with root package name */
    private static final long f14790h;

    /* renamed from: i, reason: collision with root package name */
    private static final long f14791i;

    /* renamed from: j, reason: collision with root package name */
    private static final long f14792j;

    /* renamed from: k, reason: collision with root package name */
    private static final long f14793k;

    /* renamed from: l, reason: collision with root package name */
    private static final long f14794l;

    /* renamed from: m, reason: collision with root package name */
    private static final long f14795m;
    private static final long n;
    private static final long o;
    private static final long p;
    private static final long q;
    private static final long r;
    private static final long s;
    private static final long t;
    private static final long u;
    private static final int v;
    static final boolean w;

    /* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
    private static final class a extends c {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // e.c.b.b.c.e.qa.c
        public final byte a(Object obj, long j2) {
            return qa.w ? qa.L(obj, j2) : qa.M(obj, j2);
        }

        @Override // e.c.b.b.c.e.qa.c
        public final void b(Object obj, long j2, byte b2) {
            if (qa.w) {
                qa.u(obj, j2, b2);
            } else {
                qa.y(obj, j2, b2);
            }
        }

        @Override // e.c.b.b.c.e.qa.c
        public final void c(Object obj, long j2, double d2) {
            f(obj, j2, Double.doubleToLongBits(d2));
        }

        @Override // e.c.b.b.c.e.qa.c
        public final void d(Object obj, long j2, float f2) {
            e(obj, j2, Float.floatToIntBits(f2));
        }

        @Override // e.c.b.b.c.e.qa.c
        public final void g(Object obj, long j2, boolean z) {
            if (qa.w) {
                qa.z(obj, j2, z);
            } else {
                qa.D(obj, j2, z);
            }
        }

        @Override // e.c.b.b.c.e.qa.c
        public final boolean h(Object obj, long j2) {
            return qa.w ? qa.N(obj, j2) : qa.O(obj, j2);
        }

        @Override // e.c.b.b.c.e.qa.c
        public final float i(Object obj, long j2) {
            return Float.intBitsToFloat(k(obj, j2));
        }

        @Override // e.c.b.b.c.e.qa.c
        public final double j(Object obj, long j2) {
            return Double.longBitsToDouble(l(obj, j2));
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
    private static final class b extends c {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // e.c.b.b.c.e.qa.c
        public final byte a(Object obj, long j2) {
            return qa.w ? qa.L(obj, j2) : qa.M(obj, j2);
        }

        @Override // e.c.b.b.c.e.qa.c
        public final void b(Object obj, long j2, byte b2) {
            if (qa.w) {
                qa.u(obj, j2, b2);
            } else {
                qa.y(obj, j2, b2);
            }
        }

        @Override // e.c.b.b.c.e.qa.c
        public final void c(Object obj, long j2, double d2) {
            f(obj, j2, Double.doubleToLongBits(d2));
        }

        @Override // e.c.b.b.c.e.qa.c
        public final void d(Object obj, long j2, float f2) {
            e(obj, j2, Float.floatToIntBits(f2));
        }

        @Override // e.c.b.b.c.e.qa.c
        public final void g(Object obj, long j2, boolean z) {
            if (qa.w) {
                qa.z(obj, j2, z);
            } else {
                qa.D(obj, j2, z);
            }
        }

        @Override // e.c.b.b.c.e.qa.c
        public final boolean h(Object obj, long j2) {
            return qa.w ? qa.N(obj, j2) : qa.O(obj, j2);
        }

        @Override // e.c.b.b.c.e.qa.c
        public final float i(Object obj, long j2) {
            return Float.intBitsToFloat(k(obj, j2));
        }

        @Override // e.c.b.b.c.e.qa.c
        public final double j(Object obj, long j2) {
            return Double.longBitsToDouble(l(obj, j2));
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
    private static abstract class c {
        Unsafe a;

        c(Unsafe unsafe) {
            this.a = unsafe;
        }

        public abstract byte a(Object obj, long j2);

        public abstract void b(Object obj, long j2, byte b2);

        public abstract void c(Object obj, long j2, double d2);

        public abstract void d(Object obj, long j2, float f2);

        public final void e(Object obj, long j2, int i2) {
            this.a.putInt(obj, j2, i2);
        }

        public final void f(Object obj, long j2, long j3) {
            this.a.putLong(obj, j2, j3);
        }

        public abstract void g(Object obj, long j2, boolean z);

        public abstract boolean h(Object obj, long j2);

        public abstract float i(Object obj, long j2);

        public abstract double j(Object obj, long j2);

        public final int k(Object obj, long j2) {
            return this.a.getInt(obj, j2);
        }

        public final long l(Object obj, long j2) {
            return this.a.getLong(obj, j2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
    private static final class d extends c {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // e.c.b.b.c.e.qa.c
        public final byte a(Object obj, long j2) {
            return this.a.getByte(obj, j2);
        }

        @Override // e.c.b.b.c.e.qa.c
        public final void b(Object obj, long j2, byte b2) {
            this.a.putByte(obj, j2, b2);
        }

        @Override // e.c.b.b.c.e.qa.c
        public final void c(Object obj, long j2, double d2) {
            this.a.putDouble(obj, j2, d2);
        }

        @Override // e.c.b.b.c.e.qa.c
        public final void d(Object obj, long j2, float f2) {
            this.a.putFloat(obj, j2, f2);
        }

        @Override // e.c.b.b.c.e.qa.c
        public final void g(Object obj, long j2, boolean z) {
            this.a.putBoolean(obj, j2, z);
        }

        @Override // e.c.b.b.c.e.qa.c
        public final boolean h(Object obj, long j2) {
            return this.a.getBoolean(obj, j2);
        }

        @Override // e.c.b.b.c.e.qa.c
        public final float i(Object obj, long j2) {
            return this.a.getFloat(obj, j2);
        }

        @Override // e.c.b.b.c.e.qa.c
        public final double j(Object obj, long j2) {
            return this.a.getDouble(obj, j2);
        }
    }

    static {
        Unsafe unsafeT = t();
        a = unsafeT;
        f14784b = d6.c();
        boolean zB = B(Long.TYPE);
        f14785c = zB;
        boolean zB2 = B(Integer.TYPE);
        f14786d = zB2;
        c dVar = null;
        if (unsafeT != null) {
            if (!d6.b()) {
                dVar = new d(unsafeT);
            } else if (zB) {
                dVar = new a(unsafeT);
            } else if (zB2) {
                dVar = new b(unsafeT);
            }
        }
        f14787e = dVar;
        f14788f = E();
        f14789g = A();
        long jN = n(byte[].class);
        f14790h = jN;
        f14791i = n(boolean[].class);
        f14792j = s(boolean[].class);
        f14793k = n(int[].class);
        f14794l = s(int[].class);
        f14795m = n(long[].class);
        n = s(long[].class);
        o = n(float[].class);
        p = s(float[].class);
        q = n(double[].class);
        r = s(double[].class);
        s = n(Object[].class);
        t = s(Object[].class);
        Field fieldG = G();
        u = (fieldG == null || dVar == null) ? -1L : dVar.a.objectFieldOffset(fieldG);
        v = (int) (7 & jN);
        w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private qa() {
    }

    private static boolean A() {
        Unsafe unsafe = a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            if (d6.b()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger = Logger.getLogger(qa.class.getName());
            Level level = Level.WARNING;
            String strValueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(strValueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    private static boolean B(Class<?> cls) {
        if (!d6.b()) {
            return false;
        }
        try {
            Class<?> cls2 = f14784b;
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

    static double C(Object obj, long j2) {
        return f14787e.j(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void D(Object obj, long j2, boolean z) {
        y(obj, j2, z ? (byte) 1 : (byte) 0);
    }

    private static boolean E() {
        Unsafe unsafe = a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (G() == null) {
                return false;
            }
            if (d6.b()) {
                return true;
            }
            cls.getMethod("getByte", cls2);
            cls.getMethod("putByte", cls2, Byte.TYPE);
            cls.getMethod("getInt", cls2);
            cls.getMethod("putInt", cls2, Integer.TYPE);
            cls.getMethod("getLong", cls2);
            cls.getMethod("putLong", cls2, cls2);
            cls.getMethod("copyMemory", cls2, cls2, cls2);
            cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
            return true;
        } catch (Throwable th) {
            Logger logger = Logger.getLogger(qa.class.getName());
            Level level = Level.WARNING;
            String strValueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(strValueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    static Object F(Object obj, long j2) {
        return f14787e.a.getObject(obj, j2);
    }

    private static Field G() {
        Field fieldD;
        if (d6.b() && (fieldD = d(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldD;
        }
        Field fieldD2 = d(Buffer.class, "address");
        if (fieldD2 == null || fieldD2.getType() != Long.TYPE) {
            return null;
        }
        return fieldD2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte L(Object obj, long j2) {
        return (byte) (b(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte M(Object obj, long j2) {
        return (byte) (b(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean N(Object obj, long j2) {
        return L(obj, j2) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean O(Object obj, long j2) {
        return M(obj, j2) != 0;
    }

    static byte a(byte[] bArr, long j2) {
        return f14787e.a(bArr, f14790h + j2);
    }

    static int b(Object obj, long j2) {
        return f14787e.k(obj, j2);
    }

    static <T> T c(Class<T> cls) {
        try {
            return (T) a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private static Field d(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static void f(Object obj, long j2, double d2) {
        f14787e.c(obj, j2, d2);
    }

    static void g(Object obj, long j2, float f2) {
        f14787e.d(obj, j2, f2);
    }

    static void h(Object obj, long j2, int i2) {
        f14787e.e(obj, j2, i2);
    }

    static void i(Object obj, long j2, long j3) {
        f14787e.f(obj, j2, j3);
    }

    static void j(Object obj, long j2, Object obj2) {
        f14787e.a.putObject(obj, j2, obj2);
    }

    static void k(Object obj, long j2, boolean z) {
        f14787e.g(obj, j2, z);
    }

    static void l(byte[] bArr, long j2, byte b2) {
        f14787e.b(bArr, f14790h + j2, b2);
    }

    static boolean m() {
        return f14789g;
    }

    private static int n(Class<?> cls) {
        if (f14789g) {
            return f14787e.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    static long o(Object obj, long j2) {
        return f14787e.l(obj, j2);
    }

    static boolean r() {
        return f14788f;
    }

    private static int s(Class<?> cls) {
        if (f14789g) {
            return f14787e.a.arrayIndexScale(cls);
        }
        return -1;
    }

    static Unsafe t() {
        try {
            return (Unsafe) AccessController.doPrivileged(new pa());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void u(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int iB = b(obj, j3);
        int i2 = ((~((int) j2)) & 3) << 3;
        h(obj, j3, ((255 & b2) << i2) | (iB & (~(255 << i2))));
    }

    static boolean w(Object obj, long j2) {
        return f14787e.h(obj, j2);
    }

    static float x(Object obj, long j2) {
        return f14787e.i(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void y(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        h(obj, j3, ((255 & b2) << i2) | (b(obj, j3) & (~(255 << i2))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void z(Object obj, long j2, boolean z) {
        u(obj, j2, z ? (byte) 1 : (byte) 0);
    }
}