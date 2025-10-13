package com.google.firebase.crashlytics.d.m;

import j$.util.Spliterator;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: CodedOutputStream.java */
/* loaded from: classes.dex */
public final class c implements Flushable {

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f12686e;

    /* renamed from: f, reason: collision with root package name */
    private final int f12687f;

    /* renamed from: g, reason: collision with root package name */
    private int f12688g = 0;

    /* renamed from: h, reason: collision with root package name */
    private final OutputStream f12689h;

    /* compiled from: CodedOutputStream.java */
    static class a extends IOException {
        a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private c(OutputStream outputStream, byte[] bArr) {
        this.f12689h = outputStream;
        this.f12686e = bArr;
        this.f12687f = bArr.length;
    }

    public static int a(int i2, boolean z) {
        return o(i2) + b(z);
    }

    public static int b(boolean z) {
        return 1;
    }

    public static int c(int i2, com.google.firebase.crashlytics.d.m.a aVar) {
        return o(i2) + d(aVar);
    }

    public static int d(com.google.firebase.crashlytics.d.m.a aVar) {
        return k(aVar.f()) + aVar.f();
    }

    public static int f(int i2, int i3) {
        return o(i2) + g(i3);
    }

    public static int g(int i2) {
        return j(i2);
    }

    public static int h(int i2, float f2) {
        return o(i2) + i(f2);
    }

    public static int i(float f2) {
        return 4;
    }

    public static int j(int i2) {
        if (i2 >= 0) {
            return k(i2);
        }
        return 10;
    }

    public static int k(int i2) {
        if ((i2 & (-128)) == 0) {
            return 1;
        }
        if ((i2 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i2) == 0) {
            return 3;
        }
        return (i2 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int l(long j2) {
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (((-16384) & j2) == 0) {
            return 2;
        }
        if (((-2097152) & j2) == 0) {
            return 3;
        }
        if (((-268435456) & j2) == 0) {
            return 4;
        }
        if (((-34359738368L) & j2) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j2) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j2) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j2) == 0) {
            return 8;
        }
        return (j2 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int m(int i2, int i3) {
        return o(i2) + n(i3);
    }

    public static int n(int i2) {
        return k(v(i2));
    }

    public static int o(int i2) {
        return k(e.a(i2, 0));
    }

    public static int p(int i2, int i3) {
        return o(i2) + q(i3);
    }

    public static int q(int i2) {
        return k(i2);
    }

    public static int r(int i2, long j2) {
        return o(i2) + s(j2);
    }

    public static int s(long j2) {
        return l(j2);
    }

    public static int v(int i2) {
        return (i2 >> 31) ^ (i2 << 1);
    }

    public static c w(OutputStream outputStream) {
        return x(outputStream, Spliterator.CONCURRENT);
    }

    public static c x(OutputStream outputStream, int i2) {
        return new c(outputStream, new byte[i2]);
    }

    private void z() throws IOException {
        OutputStream outputStream = this.f12689h;
        if (outputStream == null) {
            throw new a();
        }
        outputStream.write(this.f12686e, 0, this.f12688g);
        this.f12688g = 0;
    }

    public void A(int i2, boolean z) throws IOException {
        W(i2, 0);
        B(z);
    }

    public void B(boolean z) throws IOException {
        L(z ? 1 : 0);
    }

    public void C(int i2, com.google.firebase.crashlytics.d.m.a aVar) throws IOException {
        W(i2, 2);
        D(aVar);
    }

    public void D(com.google.firebase.crashlytics.d.m.a aVar) throws IOException {
        S(aVar.f());
        M(aVar);
    }

    public void E(int i2, int i3) throws IOException {
        W(i2, 0);
        F(i3);
    }

    public void F(int i2) throws IOException {
        J(i2);
    }

    public void G(int i2, float f2) throws IOException {
        W(i2, 5);
        H(f2);
    }

    public void H(float f2) throws IOException {
        R(Float.floatToRawIntBits(f2));
    }

    public void J(int i2) throws IOException {
        if (i2 >= 0) {
            S(i2);
        } else {
            T(i2);
        }
    }

    public void K(byte b2) throws IOException {
        if (this.f12688g == this.f12687f) {
            z();
        }
        byte[] bArr = this.f12686e;
        int i2 = this.f12688g;
        this.f12688g = i2 + 1;
        bArr[i2] = b2;
    }

    public void L(int i2) throws IOException {
        K((byte) i2);
    }

    public void M(com.google.firebase.crashlytics.d.m.a aVar) throws IOException {
        N(aVar, 0, aVar.f());
    }

    public void N(com.google.firebase.crashlytics.d.m.a aVar, int i2, int i3) throws IOException {
        int i4 = this.f12687f;
        int i5 = this.f12688g;
        if (i4 - i5 >= i3) {
            aVar.d(this.f12686e, i2, i5, i3);
            this.f12688g += i3;
            return;
        }
        int i6 = i4 - i5;
        aVar.d(this.f12686e, i2, i5, i6);
        int i7 = i2 + i6;
        int i8 = i3 - i6;
        this.f12688g = this.f12687f;
        z();
        if (i8 <= this.f12687f) {
            aVar.d(this.f12686e, i7, 0, i8);
            this.f12688g = i8;
            return;
        }
        InputStream inputStreamE = aVar.e();
        long j2 = i7;
        if (j2 != inputStreamE.skip(j2)) {
            throw new IllegalStateException("Skip failed.");
        }
        while (i8 > 0) {
            int iMin = Math.min(i8, this.f12687f);
            int i9 = inputStreamE.read(this.f12686e, 0, iMin);
            if (i9 != iMin) {
                throw new IllegalStateException("Read failed.");
            }
            this.f12689h.write(this.f12686e, 0, i9);
            i8 -= i9;
        }
    }

    public void P(byte[] bArr) throws IOException {
        Q(bArr, 0, bArr.length);
    }

    public void Q(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = this.f12687f;
        int i5 = this.f12688g;
        if (i4 - i5 >= i3) {
            System.arraycopy(bArr, i2, this.f12686e, i5, i3);
            this.f12688g += i3;
            return;
        }
        int i6 = i4 - i5;
        System.arraycopy(bArr, i2, this.f12686e, i5, i6);
        int i7 = i2 + i6;
        int i8 = i3 - i6;
        this.f12688g = this.f12687f;
        z();
        if (i8 > this.f12687f) {
            this.f12689h.write(bArr, i7, i8);
        } else {
            System.arraycopy(bArr, i7, this.f12686e, 0, i8);
            this.f12688g = i8;
        }
    }

    public void R(int i2) throws IOException {
        L(i2 & 255);
        L((i2 >> 8) & 255);
        L((i2 >> 16) & 255);
        L((i2 >> 24) & 255);
    }

    public void S(int i2) throws IOException {
        while ((i2 & (-128)) != 0) {
            L((i2 & 127) | 128);
            i2 >>>= 7;
        }
        L(i2);
    }

    public void T(long j2) throws IOException {
        while (((-128) & j2) != 0) {
            L((((int) j2) & 127) | 128);
            j2 >>>= 7;
        }
        L((int) j2);
    }

    public void U(int i2, int i3) throws IOException {
        W(i2, 0);
        V(i3);
    }

    public void V(int i2) throws IOException {
        S(v(i2));
    }

    public void W(int i2, int i3) throws IOException {
        S(e.a(i2, i3));
    }

    public void X(int i2, int i3) throws IOException {
        W(i2, 0);
        Z(i3);
    }

    public void Z(int i2) throws IOException {
        S(i2);
    }

    public void a0(int i2, long j2) throws IOException {
        W(i2, 0);
        b0(j2);
    }

    public void b0(long j2) throws IOException {
        T(j2);
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f12689h != null) {
            z();
        }
    }
}