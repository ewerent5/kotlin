package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public class z4<T> {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final T f10552b;

    /* renamed from: c, reason: collision with root package name */
    private final int f10553c;

    protected z4(String str, T t, int i2) {
        this.a = str;
        this.f10552b = t;
        this.f10553c = i2;
    }

    public static z4<Boolean> a(String str, boolean z) {
        return new z4<>(str, Boolean.valueOf(z), 1);
    }

    public static z4<Long> b(String str, long j2) {
        return new z4<>(str, Long.valueOf(j2), 2);
    }

    public static z4<Double> c(String str, double d2) {
        return new z4<>(str, Double.valueOf(d2), 3);
    }

    public static z4<String> d(String str, String str2) {
        return new z4<>(str, str2, 4);
    }

    public final T e() {
        x5 x5VarA = y5.a();
        if (x5VarA == null) {
            throw new IllegalStateException("Flag is not initialized.");
        }
        int i2 = this.f10553c - 1;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? (T) x5VarA.a(this.a, (String) this.f10552b) : (T) x5VarA.c(this.a, ((Double) this.f10552b).doubleValue()) : (T) x5VarA.b(this.a, ((Long) this.f10552b).longValue()) : (T) x5VarA.d(this.a, ((Boolean) this.f10552b).booleanValue());
    }
}