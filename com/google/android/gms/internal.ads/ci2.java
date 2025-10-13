package com.google.android.gms.internal.ads;

import j$.lang.Iterable;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import org.slf4j.Marker;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public abstract class ci2 implements Iterable<Byte>, Serializable, Iterable {

    /* renamed from: e, reason: collision with root package name */
    public static final ci2 f5319e = new zh2(oj2.f7950c);

    /* renamed from: f, reason: collision with root package name */
    private static final Comparator<ci2> f5320f;

    /* renamed from: g, reason: collision with root package name */
    private static final bi2 f5321g;

    /* renamed from: h, reason: collision with root package name */
    private int f5322h = 0;

    static {
        int i2 = nh2.a;
        f5321g = new bi2(null);
        f5320f = new th2();
    }

    ci2() {
    }

    public static ci2 G(byte[] bArr, int i2, int i3) {
        f(i2, i2 + i3, bArr.length);
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return new zh2(bArr2);
    }

    public static ci2 H(byte[] bArr) {
        return G(bArr, 0, bArr.length);
    }

    static ci2 I(byte[] bArr) {
        return new zh2(bArr);
    }

    public static ci2 J(String str) {
        return new zh2(str.getBytes(oj2.a));
    }

    public static ci2 K(InputStream inputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        int iMin = 256;
        while (true) {
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = inputStream.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    break;
                }
                i2 += i3;
            }
            ci2 ci2VarG = i2 == 0 ? null : G(bArr, 0, i2);
            if (ci2VarG == null) {
                return L(arrayList);
            }
            arrayList.add(ci2VarG);
            iMin = Math.min(iMin + iMin, 8192);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ci2 L(Iterable<ci2> iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = iterable.size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? f5319e : m(iterable.iterator(), size);
    }

    public static ai2 a() {
        return new ai2(128);
    }

    static void e(int i2, int i3) {
        if (((i3 - (i2 + 1)) | i2) < 0) {
            if (i2 < 0) {
                StringBuilder sb = new StringBuilder(22);
                sb.append("Index < 0: ");
                sb.append(i2);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Index > length: ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(i3);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
    }

    static int f(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i2);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i3 < i2) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(i3);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("End index: ");
        sb3.append(i3);
        sb3.append(" >= ");
        sb3.append(i4);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    private static ci2 m(Iterator<ci2> it, int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i2)));
        }
        if (i2 == 1) {
            return it.next();
        }
        int i3 = i2 >>> 1;
        ci2 ci2VarM = m(it, i3);
        ci2 ci2VarM2 = m(it, i2 - i3);
        if (Integer.MAX_VALUE - ci2VarM.l() >= ci2VarM2.l()) {
            return cl2.U(ci2VarM, ci2VarM2);
        }
        int iL = ci2VarM.l();
        int iL2 = ci2VarM2.l();
        StringBuilder sb = new StringBuilder(53);
        sb.append("ByteString would be too long: ");
        sb.append(iL);
        sb.append(Marker.ANY_NON_NULL_MARKER);
        sb.append(iL2);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // java.lang.Iterable, j$.lang.Iterable
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public xh2 iterator() {
        return new sh2(this);
    }

    public final boolean F() {
        return l() == 0;
    }

    @Deprecated
    public final void M(byte[] bArr, int i2, int i3, int i4) {
        f(i2, i2 + i4, l());
        f(i3, i3 + i4, bArr.length);
        if (i4 > 0) {
            n(bArr, i2, i3, i4);
        }
    }

    public final byte[] O() {
        int iL = l();
        if (iL == 0) {
            return oj2.f7950c;
        }
        byte[] bArr = new byte[iL];
        n(bArr, 0, 0, iL);
        return bArr;
    }

    public final String P(Charset charset) {
        return l() == 0 ? "" : u(charset);
    }

    protected final int c() {
        return this.f5322h;
    }

    public abstract boolean equals(Object obj);

    @Override // j$.lang.Iterable
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable.CC.$default$forEach(this, consumer);
    }

    public abstract byte h(int i2);

    public final int hashCode() {
        int iY = this.f5322h;
        if (iY == 0) {
            int iL = l();
            iY = y(iL, 0, iL);
            if (iY == 0) {
                iY = 1;
            }
            this.f5322h = iY;
        }
        return iY;
    }

    abstract byte k(int i2);

    public abstract int l();

    protected abstract void n(byte[] bArr, int i2, int i3, int i4);

    protected abstract int o();

    protected abstract boolean p();

    public abstract ci2 r(int i2, int i3);

    @Override // java.lang.Iterable, j$.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return j$.util.v.o(iterator(), 0);
    }

    abstract void t(rh2 rh2Var);

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(l());
        objArr[2] = l() <= 50 ? pl2.a(this) : String.valueOf(pl2.a(r(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    protected abstract String u(Charset charset);

    public abstract boolean w();

    protected abstract int x(int i2, int i3, int i4);

    protected abstract int y(int i2, int i3, int i4);

    public abstract gi2 z();
}