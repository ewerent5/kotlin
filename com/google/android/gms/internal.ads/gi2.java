package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public abstract class gi2 {
    int a;

    /* renamed from: b, reason: collision with root package name */
    hi2 f6132b;

    /* synthetic */ gi2(di2 di2Var) {
    }

    static gi2 d(byte[] bArr, int i2, int i3, boolean z) {
        ei2 ei2Var = new ei2(bArr, i2, i3, z, null);
        try {
            ei2Var.A(i3);
            return ei2Var;
        } catch (qj2 e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static int e(int i2) {
        return (-(i2 & 1)) ^ (i2 >>> 1);
    }

    public static long f(long j2) {
        return (-(j2 & 1)) ^ (j2 >>> 1);
    }

    public abstract int A(int i2);

    public abstract void a(int i2);

    public abstract boolean b();

    public abstract int c();

    public abstract int g();

    public abstract void h(int i2);

    public abstract boolean i(int i2);

    public abstract double j();

    public abstract float k();

    public abstract long l();

    public abstract long m();

    public abstract int n();

    public abstract long o();

    public abstract int p();

    public abstract boolean q();

    public abstract String r();

    public abstract String s();

    public abstract ci2 t();

    public abstract int u();

    public abstract int v();

    public abstract int w();

    public abstract long x();

    public abstract int y();

    public abstract long z();
}