package e.c.d.a0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.ActionConst;
import e.c.d.y.f;
import e.c.d.y.n.e;
import j$.util.Spliterator;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: JsonReader.java */
/* loaded from: classes.dex */
public class a implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    private static final char[] f15391e = ")]}'\n".toCharArray();

    /* renamed from: f, reason: collision with root package name */
    private final Reader f15392f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f15393g = false;

    /* renamed from: h, reason: collision with root package name */
    private final char[] f15394h = new char[Spliterator.IMMUTABLE];

    /* renamed from: i, reason: collision with root package name */
    private int f15395i = 0;

    /* renamed from: j, reason: collision with root package name */
    private int f15396j = 0;

    /* renamed from: k, reason: collision with root package name */
    private int f15397k = 0;

    /* renamed from: l, reason: collision with root package name */
    private int f15398l = 0;

    /* renamed from: m, reason: collision with root package name */
    int f15399m = 0;
    private long n;
    private int o;
    private String p;
    private int[] q;
    private int r;
    private String[] s;
    private int[] t;

    /* compiled from: JsonReader.java */
    /* renamed from: e.c.d.a0.a$a, reason: collision with other inner class name */
    class C0186a extends f {
        C0186a() {
        }

        @Override // e.c.d.y.f
        public void a(a aVar) throws IOException {
            if (aVar instanceof e) {
                ((e) aVar).W0();
                return;
            }
            int i2 = aVar.f15399m;
            if (i2 == 0) {
                i2 = aVar.i();
            }
            if (i2 == 13) {
                aVar.f15399m = 9;
                return;
            }
            if (i2 == 12) {
                aVar.f15399m = 8;
                return;
            }
            if (i2 == 14) {
                aVar.f15399m = 10;
                return;
            }
            throw new IllegalStateException("Expected a name but was " + aVar.k0() + aVar.C());
        }
    }

    static {
        f.a = new C0186a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.q = iArr;
        this.r = 0;
        this.r = 0 + 1;
        iArr[0] = 6;
        this.s = new String[32];
        this.t = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f15392f = reader;
    }

    private boolean B(char c2) throws IOException {
        if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
            return false;
        }
        if (c2 != '#') {
            if (c2 == ',') {
                return false;
            }
            if (c2 != '/' && c2 != '=') {
                if (c2 == '{' || c2 == '}' || c2 == ':') {
                    return false;
                }
                if (c2 != ';') {
                    switch (c2) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        d();
        return false;
    }

    private void C0(char c2) throws IOException {
        char[] cArr = this.f15394h;
        do {
            int i2 = this.f15395i;
            int i3 = this.f15396j;
            while (i2 < i3) {
                int i4 = i2 + 1;
                char c3 = cArr[i2];
                if (c3 == c2) {
                    this.f15395i = i4;
                    return;
                }
                if (c3 == '\\') {
                    this.f15395i = i4;
                    v0();
                    i2 = this.f15395i;
                    i3 = this.f15396j;
                } else {
                    if (c3 == '\n') {
                        this.f15397k++;
                        this.f15398l = i4;
                    }
                    i2 = i4;
                }
            }
            this.f15395i = i2;
        } while (s(1));
        throw S0("Unterminated string");
    }

    private boolean G0(String str) {
        int length = str.length();
        while (true) {
            if (this.f15395i + length > this.f15396j && !s(length)) {
                return false;
            }
            char[] cArr = this.f15394h;
            int i2 = this.f15395i;
            if (cArr[i2] != '\n') {
                for (int i3 = 0; i3 < length; i3++) {
                    if (this.f15394h[this.f15395i + i3] != str.charAt(i3)) {
                        break;
                    }
                }
                return true;
            }
            this.f15397k++;
            this.f15398l = i2 + 1;
            this.f15395i++;
        }
    }

    private void H0() {
        char c2;
        do {
            if (this.f15395i >= this.f15396j && !s(1)) {
                return;
            }
            char[] cArr = this.f15394h;
            int i2 = this.f15395i;
            int i3 = i2 + 1;
            this.f15395i = i3;
            c2 = cArr[i2];
            if (c2 == '\n') {
                this.f15397k++;
                this.f15398l = i3;
                return;
            }
        } while (c2 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        d();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void I0() throws java.io.IOException {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f15395i
            int r2 = r1 + r0
            int r3 = r4.f15396j
            if (r2 >= r3) goto L51
            char[] r2 = r4.f15394h
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.d()
        L4b:
            int r1 = r4.f15395i
            int r1 = r1 + r0
            r4.f15395i = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f15395i = r1
            r0 = 1
            boolean r0 = r4.s(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.c.d.a0.a.I0():void");
    }

    private IOException S0(String str) throws d {
        throw new d(str + C());
    }

    private int Z(boolean z) throws IOException {
        char[] cArr = this.f15394h;
        int i2 = this.f15395i;
        int i3 = this.f15396j;
        while (true) {
            if (i2 == i3) {
                this.f15395i = i2;
                if (!s(1)) {
                    if (!z) {
                        return -1;
                    }
                    throw new EOFException("End of input" + C());
                }
                i2 = this.f15395i;
                i3 = this.f15396j;
            }
            int i4 = i2 + 1;
            char c2 = cArr[i2];
            if (c2 == '\n') {
                this.f15397k++;
                this.f15398l = i4;
            } else if (c2 != ' ' && c2 != '\r' && c2 != '\t') {
                if (c2 == '/') {
                    this.f15395i = i4;
                    if (i4 == i3) {
                        this.f15395i = i4 - 1;
                        boolean zS = s(2);
                        this.f15395i++;
                        if (!zS) {
                            return c2;
                        }
                    }
                    d();
                    int i5 = this.f15395i;
                    char c3 = cArr[i5];
                    if (c3 == '*') {
                        this.f15395i = i5 + 1;
                        if (!G0("*/")) {
                            throw S0("Unterminated comment");
                        }
                        i2 = this.f15395i + 2;
                        i3 = this.f15396j;
                    } else {
                        if (c3 != '/') {
                            return c2;
                        }
                        this.f15395i = i5 + 1;
                        H0();
                        i2 = this.f15395i;
                        i3 = this.f15396j;
                    }
                } else {
                    if (c2 != '#') {
                        this.f15395i = i4;
                        return c2;
                    }
                    this.f15395i = i4;
                    d();
                    H0();
                    i2 = this.f15395i;
                    i3 = this.f15396j;
                }
            }
            i2 = i4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        r1.append(r0, r3, r2 - r3);
        r9.f15395i = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String b0(char r10) throws java.io.IOException {
        /*
            r9 = this;
            char[] r0 = r9.f15394h
            r1 = 0
        L3:
            int r2 = r9.f15395i
            int r3 = r9.f15396j
        L7:
            r4 = r3
            r3 = r2
        L9:
            r5 = 16
            r6 = 1
            if (r2 >= r4) goto L5c
            int r7 = r2 + 1
            char r2 = r0[r2]
            if (r2 != r10) goto L28
            r9.f15395i = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L20
            java.lang.String r10 = new java.lang.String
            r10.<init>(r0, r3, r7)
            return r10
        L20:
            r1.append(r0, r3, r7)
            java.lang.String r10 = r1.toString()
            return r10
        L28:
            r8 = 92
            if (r2 != r8) goto L4f
            r9.f15395i = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L40
            int r1 = r7 + 1
            int r1 = r1 * 2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r2.<init>(r1)
            r1 = r2
        L40:
            r1.append(r0, r3, r7)
            char r2 = r9.v0()
            r1.append(r2)
            int r2 = r9.f15395i
            int r3 = r9.f15396j
            goto L7
        L4f:
            r5 = 10
            if (r2 != r5) goto L5a
            int r2 = r9.f15397k
            int r2 = r2 + r6
            r9.f15397k = r2
            r9.f15398l = r7
        L5a:
            r2 = r7
            goto L9
        L5c:
            if (r1 != 0) goto L6c
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L6c:
            int r4 = r2 - r3
            r1.append(r0, r3, r4)
            r9.f15395i = r2
            boolean r2 = r9.s(r6)
            if (r2 == 0) goto L7a
            goto L3
        L7a:
            java.lang.String r10 = "Unterminated string"
            java.io.IOException r10 = r9.S0(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: e.c.d.a0.a.b0(char):java.lang.String");
    }

    private void d() throws IOException {
        if (!this.f15393g) {
            throw S0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void g() throws IOException {
        Z(true);
        int i2 = this.f15395i - 1;
        this.f15395i = i2;
        char[] cArr = f15391e;
        if (i2 + cArr.length > this.f15396j && !s(cArr.length)) {
            return;
        }
        int i3 = 0;
        while (true) {
            char[] cArr2 = f15391e;
            if (i3 >= cArr2.length) {
                this.f15395i += cArr2.length;
                return;
            } else if (this.f15394h[this.f15395i + i3] != cArr2[i3]) {
                return;
            } else {
                i3++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        d();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String j0() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 0
        L3:
            int r3 = r6.f15395i
            int r4 = r3 + r2
            int r5 = r6.f15396j
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f15394h
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.d()
            goto L5c
        L4e:
            char[] r3 = r6.f15394h
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.s(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r0 = r2
            goto L7e
        L5e:
            if (r1 != 0) goto L6b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L6b:
            char[] r3 = r6.f15394h
            int r4 = r6.f15395i
            r1.append(r3, r4, r2)
            int r3 = r6.f15395i
            int r3 = r3 + r2
            r6.f15395i = r3
            r2 = 1
            boolean r2 = r6.s(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r1 != 0) goto L8a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f15394h
            int r3 = r6.f15395i
            r1.<init>(r2, r3, r0)
            goto L95
        L8a:
            char[] r2 = r6.f15394h
            int r3 = r6.f15395i
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L95:
            int r2 = r6.f15395i
            int r2 = r2 + r0
            r6.f15395i = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.c.d.a0.a.j0():java.lang.String");
    }

    private int l0() {
        int i2;
        String str;
        String str2;
        char c2 = this.f15394h[this.f15395i];
        if (c2 == 't' || c2 == 'T') {
            i2 = 5;
            str = "true";
            str2 = "TRUE";
        } else if (c2 == 'f' || c2 == 'F') {
            i2 = 6;
            str = "false";
            str2 = "FALSE";
        } else {
            if (c2 != 'n' && c2 != 'N') {
                return 0;
            }
            i2 = 7;
            str = "null";
            str2 = ActionConst.NULL;
        }
        int length = str.length();
        for (int i3 = 1; i3 < length; i3++) {
            if (this.f15395i + i3 >= this.f15396j && !s(i3 + 1)) {
                return 0;
            }
            char c3 = this.f15394h[this.f15395i + i3];
            if (c3 != str.charAt(i3) && c3 != str2.charAt(i3)) {
                return 0;
            }
        }
        if ((this.f15395i + length < this.f15396j || s(length + 1)) && B(this.f15394h[this.f15395i + length])) {
            return 0;
        }
        this.f15395i += length;
        this.f15399m = i2;
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0095, code lost:
    
        if (B(r14) != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0097, code lost:
    
        if (r9 != 2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0099, code lost:
    
        if (r10 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009f, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a1, code lost:
    
        if (r13 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a7, code lost:
    
        if (r11 != 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a9, code lost:
    
        if (r13 != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ab, code lost:
    
        if (r13 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ae, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00af, code lost:
    
        r18.n = r11;
        r18.f15395i += r8;
        r18.f15399m = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ba, code lost:
    
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00bb, code lost:
    
        if (r9 == 2) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00be, code lost:
    
        if (r9 == 4) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00c1, code lost:
    
        if (r9 != 7) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c4, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c6, code lost:
    
        r18.o = r8;
        r18.f15399m = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00cc, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00cd, code lost:
    
        return 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int q0() {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.c.d.a0.a.q0():int");
    }

    private void r0(int i2) {
        int i3 = this.r;
        int[] iArr = this.q;
        if (i3 == iArr.length) {
            int i4 = i3 * 2;
            this.q = Arrays.copyOf(iArr, i4);
            this.t = Arrays.copyOf(this.t, i4);
            this.s = (String[]) Arrays.copyOf(this.s, i4);
        }
        int[] iArr2 = this.q;
        int i5 = this.r;
        this.r = i5 + 1;
        iArr2[i5] = i2;
    }

    private boolean s(int i2) throws IOException {
        int i3;
        int i4;
        char[] cArr = this.f15394h;
        int i5 = this.f15398l;
        int i6 = this.f15395i;
        this.f15398l = i5 - i6;
        int i7 = this.f15396j;
        if (i7 != i6) {
            int i8 = i7 - i6;
            this.f15396j = i8;
            System.arraycopy(cArr, i6, cArr, 0, i8);
        } else {
            this.f15396j = 0;
        }
        this.f15395i = 0;
        do {
            Reader reader = this.f15392f;
            int i9 = this.f15396j;
            int i10 = reader.read(cArr, i9, cArr.length - i9);
            if (i10 == -1) {
                return false;
            }
            i3 = this.f15396j + i10;
            this.f15396j = i3;
            if (this.f15397k == 0 && (i4 = this.f15398l) == 0 && i3 > 0 && cArr[0] == 65279) {
                this.f15395i++;
                this.f15398l = i4 + 1;
                i2++;
            }
        } while (i3 < i2);
        return true;
    }

    private char v0() throws IOException {
        int i2;
        int i3;
        if (this.f15395i == this.f15396j && !s(1)) {
            throw S0("Unterminated escape sequence");
        }
        char[] cArr = this.f15394h;
        int i4 = this.f15395i;
        int i5 = i4 + 1;
        this.f15395i = i5;
        char c2 = cArr[i4];
        if (c2 == '\n') {
            this.f15397k++;
            this.f15398l = i5;
        } else if (c2 != '\"' && c2 != '\'' && c2 != '/' && c2 != '\\') {
            if (c2 == 'b') {
                return '\b';
            }
            if (c2 == 'f') {
                return '\f';
            }
            if (c2 == 'n') {
                return '\n';
            }
            if (c2 == 'r') {
                return '\r';
            }
            if (c2 == 't') {
                return '\t';
            }
            if (c2 != 'u') {
                throw S0("Invalid escape sequence");
            }
            if (i5 + 4 > this.f15396j && !s(4)) {
                throw S0("Unterminated escape sequence");
            }
            char c3 = 0;
            int i6 = this.f15395i;
            int i7 = i6 + 4;
            while (i6 < i7) {
                char c4 = this.f15394h[i6];
                char c5 = (char) (c3 << 4);
                if (c4 < '0' || c4 > '9') {
                    if (c4 >= 'a' && c4 <= 'f') {
                        i2 = c4 - 'a';
                    } else {
                        if (c4 < 'A' || c4 > 'F') {
                            throw new NumberFormatException("\\u" + new String(this.f15394h, this.f15395i, 4));
                        }
                        i2 = c4 - 'A';
                    }
                    i3 = i2 + 10;
                } else {
                    i3 = c4 - '0';
                }
                c3 = (char) (c5 + i3);
                i6++;
            }
            this.f15395i += 4;
            return c3;
        }
        return c2;
    }

    public final boolean A() {
        return this.f15393g;
    }

    String C() {
        return " at line " + (this.f15397k + 1) + " column " + ((this.f15395i - this.f15398l) + 1) + " path " + getPath();
    }

    public boolean D() throws IOException {
        int i2 = this.f15399m;
        if (i2 == 0) {
            i2 = i();
        }
        if (i2 == 5) {
            this.f15399m = 0;
            int[] iArr = this.t;
            int i3 = this.r - 1;
            iArr[i3] = iArr[i3] + 1;
            return true;
        }
        if (i2 == 6) {
            this.f15399m = 0;
            int[] iArr2 = this.t;
            int i4 = this.r - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + k0() + C());
    }

    public double K() throws IOException, NumberFormatException {
        int i2 = this.f15399m;
        if (i2 == 0) {
            i2 = i();
        }
        if (i2 == 15) {
            this.f15399m = 0;
            int[] iArr = this.t;
            int i3 = this.r - 1;
            iArr[i3] = iArr[i3] + 1;
            return this.n;
        }
        if (i2 == 16) {
            this.p = new String(this.f15394h, this.f15395i, this.o);
            this.f15395i += this.o;
        } else if (i2 == 8 || i2 == 9) {
            this.p = b0(i2 == 8 ? CoreConstants.SINGLE_QUOTE_CHAR : CoreConstants.DOUBLE_QUOTE_CHAR);
        } else if (i2 == 10) {
            this.p = j0();
        } else if (i2 != 11) {
            throw new IllegalStateException("Expected a double but was " + k0() + C());
        }
        this.f15399m = 11;
        double d2 = Double.parseDouble(this.p);
        if (!this.f15393g && (Double.isNaN(d2) || Double.isInfinite(d2))) {
            throw new d("JSON forbids NaN and infinities: " + d2 + C());
        }
        this.p = null;
        this.f15399m = 0;
        int[] iArr2 = this.t;
        int i4 = this.r - 1;
        iArr2[i4] = iArr2[i4] + 1;
        return d2;
    }

    public int N() throws IOException, NumberFormatException {
        int i2 = this.f15399m;
        if (i2 == 0) {
            i2 = i();
        }
        if (i2 == 15) {
            long j2 = this.n;
            int i3 = (int) j2;
            if (j2 == i3) {
                this.f15399m = 0;
                int[] iArr = this.t;
                int i4 = this.r - 1;
                iArr[i4] = iArr[i4] + 1;
                return i3;
            }
            throw new NumberFormatException("Expected an int but was " + this.n + C());
        }
        if (i2 == 16) {
            this.p = new String(this.f15394h, this.f15395i, this.o);
            this.f15395i += this.o;
        } else {
            if (i2 != 8 && i2 != 9 && i2 != 10) {
                throw new IllegalStateException("Expected an int but was " + k0() + C());
            }
            if (i2 == 10) {
                this.p = j0();
            } else {
                this.p = b0(i2 == 8 ? CoreConstants.SINGLE_QUOTE_CHAR : CoreConstants.DOUBLE_QUOTE_CHAR);
            }
            try {
                int i5 = Integer.parseInt(this.p);
                this.f15399m = 0;
                int[] iArr2 = this.t;
                int i6 = this.r - 1;
                iArr2[i6] = iArr2[i6] + 1;
                return i5;
            } catch (NumberFormatException unused) {
            }
        }
        this.f15399m = 11;
        double d2 = Double.parseDouble(this.p);
        int i7 = (int) d2;
        if (i7 != d2) {
            throw new NumberFormatException("Expected an int but was " + this.p + C());
        }
        this.p = null;
        this.f15399m = 0;
        int[] iArr3 = this.t;
        int i8 = this.r - 1;
        iArr3[i8] = iArr3[i8] + 1;
        return i7;
    }

    public void O0() throws IOException {
        int i2 = 0;
        do {
            int i3 = this.f15399m;
            if (i3 == 0) {
                i3 = i();
            }
            if (i3 == 3) {
                r0(1);
            } else if (i3 == 1) {
                r0(3);
            } else if (i3 == 4 || i3 == 2) {
                this.r--;
                i2--;
                this.f15399m = 0;
            } else {
                if (i3 == 14 || i3 == 10) {
                    I0();
                } else if (i3 == 8 || i3 == 12) {
                    C0(CoreConstants.SINGLE_QUOTE_CHAR);
                } else if (i3 == 9 || i3 == 13) {
                    C0(CoreConstants.DOUBLE_QUOTE_CHAR);
                } else if (i3 == 16) {
                    this.f15395i += this.o;
                }
                this.f15399m = 0;
            }
            i2++;
            this.f15399m = 0;
        } while (i2 != 0);
        int[] iArr = this.t;
        int i4 = this.r;
        int i5 = i4 - 1;
        iArr[i5] = iArr[i5] + 1;
        this.s[i4 - 1] = "null";
    }

    public long T() throws IOException, NumberFormatException {
        int i2 = this.f15399m;
        if (i2 == 0) {
            i2 = i();
        }
        if (i2 == 15) {
            this.f15399m = 0;
            int[] iArr = this.t;
            int i3 = this.r - 1;
            iArr[i3] = iArr[i3] + 1;
            return this.n;
        }
        if (i2 == 16) {
            this.p = new String(this.f15394h, this.f15395i, this.o);
            this.f15395i += this.o;
        } else {
            if (i2 != 8 && i2 != 9 && i2 != 10) {
                throw new IllegalStateException("Expected a long but was " + k0() + C());
            }
            if (i2 == 10) {
                this.p = j0();
            } else {
                this.p = b0(i2 == 8 ? CoreConstants.SINGLE_QUOTE_CHAR : CoreConstants.DOUBLE_QUOTE_CHAR);
            }
            try {
                long j2 = Long.parseLong(this.p);
                this.f15399m = 0;
                int[] iArr2 = this.t;
                int i4 = this.r - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return j2;
            } catch (NumberFormatException unused) {
            }
        }
        this.f15399m = 11;
        double d2 = Double.parseDouble(this.p);
        long j3 = (long) d2;
        if (j3 != d2) {
            throw new NumberFormatException("Expected a long but was " + this.p + C());
        }
        this.p = null;
        this.f15399m = 0;
        int[] iArr3 = this.t;
        int i5 = this.r - 1;
        iArr3[i5] = iArr3[i5] + 1;
        return j3;
    }

    public String W() throws IOException {
        String strB0;
        int i2 = this.f15399m;
        if (i2 == 0) {
            i2 = i();
        }
        if (i2 == 14) {
            strB0 = j0();
        } else if (i2 == 12) {
            strB0 = b0(CoreConstants.SINGLE_QUOTE_CHAR);
        } else {
            if (i2 != 13) {
                throw new IllegalStateException("Expected a name but was " + k0() + C());
            }
            strB0 = b0(CoreConstants.DOUBLE_QUOTE_CHAR);
        }
        this.f15399m = 0;
        this.s[this.r - 1] = strB0;
        return strB0;
    }

    public void a0() throws IOException {
        int i2 = this.f15399m;
        if (i2 == 0) {
            i2 = i();
        }
        if (i2 == 7) {
            this.f15399m = 0;
            int[] iArr = this.t;
            int i3 = this.r - 1;
            iArr[i3] = iArr[i3] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + k0() + C());
    }

    public void b() throws IOException {
        int i2 = this.f15399m;
        if (i2 == 0) {
            i2 = i();
        }
        if (i2 == 3) {
            r0(1);
            this.t[this.r - 1] = 0;
            this.f15399m = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + k0() + C());
        }
    }

    public void c() throws IOException {
        int i2 = this.f15399m;
        if (i2 == 0) {
            i2 = i();
        }
        if (i2 == 1) {
            r0(3);
            this.f15399m = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + k0() + C());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f15399m = 0;
        this.q[0] = 8;
        this.r = 1;
        this.f15392f.close();
    }

    public String getPath() {
        StringBuilder sb = new StringBuilder();
        sb.append(CoreConstants.DOLLAR);
        int i2 = this.r;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = this.q[i3];
            if (i4 == 1 || i4 == 2) {
                sb.append('[');
                sb.append(this.t[i3]);
                sb.append(']');
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                sb.append(CoreConstants.DOT);
                String[] strArr = this.s;
                if (strArr[i3] != null) {
                    sb.append(strArr[i3]);
                }
            }
        }
        return sb.toString();
    }

    public String h0() throws IOException {
        String str;
        int i2 = this.f15399m;
        if (i2 == 0) {
            i2 = i();
        }
        if (i2 == 10) {
            str = j0();
        } else if (i2 == 8) {
            str = b0(CoreConstants.SINGLE_QUOTE_CHAR);
        } else if (i2 == 9) {
            str = b0(CoreConstants.DOUBLE_QUOTE_CHAR);
        } else if (i2 == 11) {
            str = this.p;
            this.p = null;
        } else if (i2 == 15) {
            str = Long.toString(this.n);
        } else {
            if (i2 != 16) {
                throw new IllegalStateException("Expected a string but was " + k0() + C());
            }
            str = new String(this.f15394h, this.f15395i, this.o);
            this.f15395i += this.o;
        }
        this.f15399m = 0;
        int[] iArr = this.t;
        int i3 = this.r - 1;
        iArr[i3] = iArr[i3] + 1;
        return str;
    }

    int i() throws IOException {
        int iZ;
        int[] iArr = this.q;
        int i2 = this.r;
        int i3 = iArr[i2 - 1];
        if (i3 == 1) {
            iArr[i2 - 1] = 2;
        } else if (i3 == 2) {
            int iZ2 = Z(true);
            if (iZ2 != 44) {
                if (iZ2 != 59) {
                    if (iZ2 != 93) {
                        throw S0("Unterminated array");
                    }
                    this.f15399m = 4;
                    return 4;
                }
                d();
            }
        } else {
            if (i3 == 3 || i3 == 5) {
                iArr[i2 - 1] = 4;
                if (i3 == 5 && (iZ = Z(true)) != 44) {
                    if (iZ != 59) {
                        if (iZ != 125) {
                            throw S0("Unterminated object");
                        }
                        this.f15399m = 2;
                        return 2;
                    }
                    d();
                }
                int iZ3 = Z(true);
                if (iZ3 == 34) {
                    this.f15399m = 13;
                    return 13;
                }
                if (iZ3 == 39) {
                    d();
                    this.f15399m = 12;
                    return 12;
                }
                if (iZ3 == 125) {
                    if (i3 == 5) {
                        throw S0("Expected name");
                    }
                    this.f15399m = 2;
                    return 2;
                }
                d();
                this.f15395i--;
                if (!B((char) iZ3)) {
                    throw S0("Expected name");
                }
                this.f15399m = 14;
                return 14;
            }
            if (i3 == 4) {
                iArr[i2 - 1] = 5;
                int iZ4 = Z(true);
                if (iZ4 != 58) {
                    if (iZ4 != 61) {
                        throw S0("Expected ':'");
                    }
                    d();
                    if (this.f15395i < this.f15396j || s(1)) {
                        char[] cArr = this.f15394h;
                        int i4 = this.f15395i;
                        if (cArr[i4] == '>') {
                            this.f15395i = i4 + 1;
                        }
                    }
                }
            } else if (i3 == 6) {
                if (this.f15393g) {
                    g();
                }
                this.q[this.r - 1] = 7;
            } else if (i3 == 7) {
                if (Z(false) == -1) {
                    this.f15399m = 17;
                    return 17;
                }
                d();
                this.f15395i--;
            } else if (i3 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iZ5 = Z(true);
        if (iZ5 == 34) {
            this.f15399m = 9;
            return 9;
        }
        if (iZ5 == 39) {
            d();
            this.f15399m = 8;
            return 8;
        }
        if (iZ5 != 44 && iZ5 != 59) {
            if (iZ5 == 91) {
                this.f15399m = 3;
                return 3;
            }
            if (iZ5 != 93) {
                if (iZ5 == 123) {
                    this.f15399m = 1;
                    return 1;
                }
                this.f15395i--;
                int iL0 = l0();
                if (iL0 != 0) {
                    return iL0;
                }
                int iQ0 = q0();
                if (iQ0 != 0) {
                    return iQ0;
                }
                if (!B(this.f15394h[this.f15395i])) {
                    throw S0("Expected value");
                }
                d();
                this.f15399m = 10;
                return 10;
            }
            if (i3 == 1) {
                this.f15399m = 4;
                return 4;
            }
        }
        if (i3 != 1 && i3 != 2) {
            throw S0("Unexpected value");
        }
        d();
        this.f15395i--;
        this.f15399m = 7;
        return 7;
    }

    public void j() throws IOException {
        int i2 = this.f15399m;
        if (i2 == 0) {
            i2 = i();
        }
        if (i2 != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + k0() + C());
        }
        int i3 = this.r - 1;
        this.r = i3;
        int[] iArr = this.t;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.f15399m = 0;
    }

    public b k0() throws IOException {
        int i2 = this.f15399m;
        if (i2 == 0) {
            i2 = i();
        }
        switch (i2) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public void q() throws IOException {
        int i2 = this.f15399m;
        if (i2 == 0) {
            i2 = i();
        }
        if (i2 != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + k0() + C());
        }
        int i3 = this.r - 1;
        this.r = i3;
        this.s[i3] = null;
        int[] iArr = this.t;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.f15399m = 0;
    }

    public String toString() {
        return getClass().getSimpleName() + C();
    }

    public boolean v() throws IOException {
        int i2 = this.f15399m;
        if (i2 == 0) {
            i2 = i();
        }
        return (i2 == 2 || i2 == 4) ? false : true;
    }

    public final void y0(boolean z) {
        this.f15393g = z;
    }
}