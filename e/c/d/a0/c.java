package e.c.d.a0;

import ch.qos.logback.core.CoreConstants;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: JsonWriter.java */
/* loaded from: classes.dex */
public class c implements Closeable, Flushable {

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f15409e = new String[128];

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f15410f;

    /* renamed from: g, reason: collision with root package name */
    private final Writer f15411g;

    /* renamed from: h, reason: collision with root package name */
    private int[] f15412h = new int[32];

    /* renamed from: i, reason: collision with root package name */
    private int f15413i = 0;

    /* renamed from: j, reason: collision with root package name */
    private String f15414j;

    /* renamed from: k, reason: collision with root package name */
    private String f15415k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f15416l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f15417m;
    private String n;
    private boolean o;

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            f15409e[i2] = String.format("\\u%04x", Integer.valueOf(i2));
        }
        String[] strArr = f15409e;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f15410f = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        N(6);
        this.f15415k = ":";
        this.o = true;
        Objects.requireNonNull(writer, "out == null");
        this.f15411g = writer;
    }

    private void B() throws IOException {
        if (this.f15414j == null) {
            return;
        }
        this.f15411g.write(10);
        int i2 = this.f15413i;
        for (int i3 = 1; i3 < i2; i3++) {
            this.f15411g.write(this.f15414j);
        }
    }

    private c D(int i2, char c2) throws IOException {
        c();
        N(i2);
        this.f15411g.write(c2);
        return this;
    }

    private int K() {
        int i2 = this.f15413i;
        if (i2 != 0) {
            return this.f15412h[i2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void N(int i2) {
        int i3 = this.f15413i;
        int[] iArr = this.f15412h;
        if (i3 == iArr.length) {
            this.f15412h = Arrays.copyOf(iArr, i3 * 2);
        }
        int[] iArr2 = this.f15412h;
        int i4 = this.f15413i;
        this.f15413i = i4 + 1;
        iArr2[i4] = i2;
    }

    private void T(int i2) {
        this.f15412h[this.f15413i - 1] = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void Z(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f15417m
            if (r0 == 0) goto L7
            java.lang.String[] r0 = e.c.d.a0.c.f15410f
            goto L9
        L7:
            java.lang.String[] r0 = e.c.d.a0.c.f15409e
        L9:
            java.io.Writer r1 = r8.f15411g
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = 0
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.f15411g
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f15411g
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f15411g
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f15411g
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.c.d.a0.c.Z(java.lang.String):void");
    }

    private void b() throws IOException {
        int iK = K();
        if (iK == 5) {
            this.f15411g.write(44);
        } else if (iK != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        B();
        T(4);
    }

    private void c() throws IOException {
        int iK = K();
        if (iK == 1) {
            T(2);
            B();
            return;
        }
        if (iK == 2) {
            this.f15411g.append(CoreConstants.COMMA_CHAR);
            B();
        } else {
            if (iK == 4) {
                this.f15411g.append((CharSequence) this.f15415k);
                T(5);
                return;
            }
            if (iK != 6) {
                if (iK != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f15416l) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            T(7);
        }
    }

    private c i(int i2, int i3, char c2) throws IOException {
        int iK = K();
        if (iK != i3 && iK != i2) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.n != null) {
            throw new IllegalStateException("Dangling name: " + this.n);
        }
        this.f15413i--;
        if (iK == i3) {
            B();
        }
        this.f15411g.write(c2);
        return this;
    }

    private void l0() throws IOException {
        if (this.n != null) {
            b();
            Z(this.n);
            this.n = null;
        }
    }

    public c A(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.n != null) {
            throw new IllegalStateException();
        }
        if (this.f15413i == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.n = str;
        return this;
    }

    public c C() throws IOException {
        if (this.n != null) {
            if (!this.o) {
                this.n = null;
                return this;
            }
            l0();
        }
        c();
        this.f15411g.write("null");
        return this;
    }

    public final void W(boolean z) {
        this.f15416l = z;
    }

    public c a0(long j2) throws IOException {
        l0();
        c();
        this.f15411g.write(Long.toString(j2));
        return this;
    }

    public c b0(Boolean bool) throws IOException {
        if (bool == null) {
            return C();
        }
        l0();
        c();
        this.f15411g.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f15411g.close();
        int i2 = this.f15413i;
        if (i2 > 1 || (i2 == 1 && this.f15412h[i2 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f15413i = 0;
    }

    public c d() throws IOException {
        l0();
        return D(1, '[');
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f15413i == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f15411g.flush();
    }

    public c g() throws IOException {
        l0();
        return D(3, CoreConstants.CURLY_LEFT);
    }

    public c h0(Number number) throws IOException {
        if (number == null) {
            return C();
        }
        l0();
        String string = number.toString();
        if (this.f15416l || !(string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            c();
            this.f15411g.append((CharSequence) string);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public c j() {
        return i(1, 2, ']');
    }

    public c j0(String str) throws IOException {
        if (str == null) {
            return C();
        }
        l0();
        c();
        Z(str);
        return this;
    }

    public c k0(boolean z) throws IOException {
        l0();
        c();
        this.f15411g.write(z ? "true" : "false");
        return this;
    }

    public c q() {
        return i(3, 5, CoreConstants.CURLY_RIGHT);
    }

    public final boolean s() {
        return this.o;
    }

    public boolean v() {
        return this.f15416l;
    }
}