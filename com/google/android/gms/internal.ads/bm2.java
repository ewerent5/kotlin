package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
abstract class bm2 {
    final Unsafe a;

    bm2(Unsafe unsafe) {
        this.a = unsafe;
    }

    public abstract void a(Object obj, long j2, byte b2);

    public abstract boolean b(Object obj, long j2);

    public abstract void c(Object obj, long j2, boolean z);

    public abstract float d(Object obj, long j2);

    public abstract void e(Object obj, long j2, float f2);

    public abstract double f(Object obj, long j2);

    public abstract void g(Object obj, long j2, double d2);

    public final long h(Field field) {
        return this.a.objectFieldOffset(field);
    }

    public final int i(Class<?> cls) {
        return this.a.arrayBaseOffset(cls);
    }

    public final int j(Class<?> cls) {
        return this.a.arrayIndexScale(cls);
    }

    public final int k(Object obj, long j2) {
        return this.a.getInt(obj, j2);
    }

    public final void l(Object obj, long j2, int i2) {
        this.a.putInt(obj, j2, i2);
    }

    public final long m(Object obj, long j2) {
        return this.a.getLong(obj, j2);
    }

    public final void n(Object obj, long j2, long j3) {
        this.a.putLong(obj, j2, j3);
    }

    public final Object o(Object obj, long j2) {
        return this.a.getObject(obj, j2);
    }

    public final void p(Object obj, long j2, Object obj2) {
        this.a.putObject(obj, j2, obj2);
    }
}