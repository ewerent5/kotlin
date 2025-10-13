package com.google.android.gms.internal.ads;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.internal.ads.f32;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class p32 extends g32 {
    static final Unsafe a;

    /* renamed from: b, reason: collision with root package name */
    static final long f8080b;

    /* renamed from: c, reason: collision with root package name */
    static final long f8081c;

    /* renamed from: d, reason: collision with root package name */
    static final long f8082d;

    /* renamed from: e, reason: collision with root package name */
    static final long f8083e;

    /* renamed from: f, reason: collision with root package name */
    static final long f8084f;

    /* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
    class a implements PrivilegedExceptionAction<Unsafe> {
        a() {
        }

        public static final Unsafe a() throws IllegalAccessException, IllegalArgumentException {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Unsafe run() {
            return a();
        }
    }

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new a());
            }
            try {
                f8081c = unsafe.objectFieldOffset(f32.class.getDeclaredField("k"));
                f8080b = unsafe.objectFieldOffset(f32.class.getDeclaredField("j"));
                f8082d = unsafe.objectFieldOffset(f32.class.getDeclaredField(IntegerTokenConverter.CONVERTER_KEY));
                f8083e = unsafe.objectFieldOffset(q32.class.getDeclaredField("b"));
                f8084f = unsafe.objectFieldOffset(q32.class.getDeclaredField("c"));
                a = unsafe;
            } catch (Exception e2) {
                q12.a(e2);
                throw new RuntimeException(e2);
            }
        } catch (PrivilegedActionException e3) {
            throw new RuntimeException("Could not initialize intrinsics", e3.getCause());
        }
    }

    /* synthetic */ p32(f32.a aVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.g32
    final void a(q32 q32Var, Thread thread) {
        a.putObject(q32Var, f8083e, thread);
    }

    @Override // com.google.android.gms.internal.ads.g32
    final void b(q32 q32Var, q32 q32Var2) {
        a.putObject(q32Var, f8084f, q32Var2);
    }

    @Override // com.google.android.gms.internal.ads.g32
    final boolean c(f32<?> f32Var, q32 q32Var, q32 q32Var2) {
        return a.compareAndSwapObject(f32Var, f8081c, q32Var, q32Var2);
    }

    @Override // com.google.android.gms.internal.ads.g32
    final boolean d(f32<?> f32Var, j32 j32Var, j32 j32Var2) {
        return a.compareAndSwapObject(f32Var, f8080b, j32Var, j32Var2);
    }

    @Override // com.google.android.gms.internal.ads.g32
    final boolean e(f32<?> f32Var, Object obj, Object obj2) {
        return a.compareAndSwapObject(f32Var, f8082d, obj, obj2);
    }
}