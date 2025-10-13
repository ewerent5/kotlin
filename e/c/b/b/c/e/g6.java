package e.c.b.b.c.e;

import j$.lang.Iterable;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
public abstract class g6 implements Serializable, Iterable<Byte>, Iterable {

    /* renamed from: e, reason: collision with root package name */
    public static final g6 f14544e = new q6(r7.f14815c);

    /* renamed from: f, reason: collision with root package name */
    private static final m6 f14545f;

    /* renamed from: g, reason: collision with root package name */
    private static final Comparator<g6> f14546g;

    /* renamed from: h, reason: collision with root package name */
    private int f14547h = 0;

    static {
        j6 j6Var = null;
        f14545f = d6.b() ? new u6(j6Var) : new k6(j6Var);
        f14546g = new i6();
    }

    g6() {
    }

    public static g6 k(String str) {
        return new q6(str.getBytes(r7.a));
    }

    public static g6 l(byte[] bArr, int i2, int i3) {
        r(i2, i2 + i3, bArr.length);
        return new q6(f14545f.a(bArr, i2, i3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int p(byte b2) {
        return b2 & 255;
    }

    static int r(int i2, int i3, int i4) {
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

    static o6 u(int i2) {
        return new o6(i2, null);
    }

    public abstract byte a(int i2);

    public abstract int c();

    public abstract boolean equals(Object obj);

    protected abstract int f(int i2, int i3, int i4);

    @Override // j$.lang.Iterable
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable.CC.$default$forEach(this, consumer);
    }

    public abstract g6 h(int i2, int i3);

    public final int hashCode() {
        int iF = this.f14547h;
        if (iF == 0) {
            int iC = c();
            iF = f(iC, 0, iC);
            if (iF == 0) {
                iF = 1;
            }
            this.f14547h = iF;
        }
        return iF;
    }

    @Override // java.lang.Iterable, j$.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return new j6(this);
    }

    protected abstract String m(Charset charset);

    abstract void n(h6 h6Var);

    abstract byte o(int i2);

    @Override // java.lang.Iterable, j$.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return j$.util.v.o(iterator(), 0);
    }

    public final String t() {
        return c() == 0 ? "" : m(r7.a);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(c());
        objArr[2] = c() <= 50 ? ga.a(this) : String.valueOf(ga.a(h(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract boolean w();

    protected final int x() {
        return this.f14547h;
    }
}