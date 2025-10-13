package j;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: ByteString.kt */
/* loaded from: classes3.dex */
public class i implements Serializable, Comparable<i> {

    /* renamed from: g, reason: collision with root package name */
    private transient int f16465g;

    /* renamed from: h, reason: collision with root package name */
    private transient String f16466h;

    /* renamed from: i, reason: collision with root package name */
    private final byte[] f16467i;

    /* renamed from: f, reason: collision with root package name */
    public static final a f16464f = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final i f16463e = new i(new byte[0]);

    /* compiled from: ByteString.kt */
    public static final class a {
        private a() {
        }

        public static /* synthetic */ i f(a aVar, byte[] bArr, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i2 = 0;
            }
            if ((i4 & 2) != 0) {
                i3 = bArr.length;
            }
            return aVar.e(bArr, i2, i3);
        }

        public final i a(String str) {
            i.y.d.l.d(str, "$this$decodeBase64");
            byte[] bArrA = j.a.a(str);
            if (bArrA != null) {
                return new i(bArrA);
            }
            return null;
        }

        public final i b(String str) {
            i.y.d.l.d(str, "$this$decodeHex");
            if (!(str.length() % 2 == 0)) {
                throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = i2 * 2;
                bArr[i2] = (byte) ((j.f0.b.e(str.charAt(i3)) << 4) + j.f0.b.e(str.charAt(i3 + 1)));
            }
            return new i(bArr);
        }

        public final i c(String str, Charset charset) {
            i.y.d.l.d(str, "$this$encode");
            i.y.d.l.d(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            i.y.d.l.c(bytes, "(this as java.lang.String).getBytes(charset)");
            return new i(bytes);
        }

        public final i d(String str) {
            i.y.d.l.d(str, "$this$encodeUtf8");
            i iVar = new i(b.a(str));
            iVar.r(str);
            return iVar;
        }

        public final i e(byte[] bArr, int i2, int i3) {
            i.y.d.l.d(bArr, "$this$toByteString");
            c.b(bArr.length, i2, i3);
            return new i(i.t.g.g(bArr, i2, i3 + i2));
        }

        public /* synthetic */ a(i.y.d.g gVar) {
            this();
        }
    }

    public i(byte[] bArr) {
        i.y.d.l.d(bArr, "data");
        this.f16467i = bArr;
    }

    public String a() {
        return j.a.c(e(), null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compareTo(j.i r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            i.y.d.l.d(r10, r0)
            int r0 = r9.u()
            int r1 = r10.u()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2b
            byte r7 = r9.d(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.d(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L32
            goto L30
        L2b:
            if (r0 != r1) goto L2e
            goto L33
        L2e:
            if (r0 >= r1) goto L32
        L30:
            r3 = -1
            goto L33
        L32:
            r3 = 1
        L33:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: j.i.compareTo(j.i):int");
    }

    public i c(String str) {
        i.y.d.l.d(str, "algorithm");
        byte[] bArrDigest = MessageDigest.getInstance(str).digest(this.f16467i);
        i.y.d.l.c(bArrDigest, "MessageDigest.getInstance(algorithm).digest(data)");
        return new i(bArrDigest);
    }

    public final byte d(int i2) {
        return m(i2);
    }

    public final byte[] e() {
        return this.f16467i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.u() == e().length && iVar.p(0, e(), 0, e().length)) {
                return true;
            }
        }
        return false;
    }

    public final int f() {
        return this.f16465g;
    }

    public int h() {
        return e().length;
    }

    public int hashCode() {
        int iF = f();
        if (iF != 0) {
            return iF;
        }
        int iHashCode = Arrays.hashCode(e());
        q(iHashCode);
        return iHashCode;
    }

    public final String j() {
        return this.f16466h;
    }

    public String k() {
        char[] cArr = new char[e().length * 2];
        int i2 = 0;
        for (byte b2 : e()) {
            int i3 = i2 + 1;
            cArr[i2] = j.f0.b.f()[(b2 >> 4) & 15];
            i2 = i3 + 1;
            cArr[i3] = j.f0.b.f()[b2 & 15];
        }
        return new String(cArr);
    }

    public byte[] l() {
        return e();
    }

    public byte m(int i2) {
        return e()[i2];
    }

    public i n() {
        return c("MD5");
    }

    public boolean o(int i2, i iVar, int i3, int i4) {
        i.y.d.l.d(iVar, "other");
        return iVar.p(i3, e(), i2, i4);
    }

    public boolean p(int i2, byte[] bArr, int i3, int i4) {
        i.y.d.l.d(bArr, "other");
        return i2 >= 0 && i2 <= e().length - i4 && i3 >= 0 && i3 <= bArr.length - i4 && c.a(e(), i2, bArr, i3, i4);
    }

    public final void q(int i2) {
        this.f16465g = i2;
    }

    public final void r(String str) {
        this.f16466h = str;
    }

    public i s() {
        return c("SHA-1");
    }

    public i t() {
        return c("SHA-256");
    }

    public String toString() {
        if (e().length == 0) {
            return "[size=0]";
        }
        int iC = j.f0.b.c(e(), 64);
        if (iC != -1) {
            String strX = x();
            Objects.requireNonNull(strX, "null cannot be cast to non-null type java.lang.String");
            String strSubstring = strX.substring(0, iC);
            i.y.d.l.c(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String strX2 = i.d0.p.x(i.d0.p.x(i.d0.p.x(strSubstring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
            if (iC >= strX.length()) {
                return "[text=" + strX2 + ']';
            }
            return "[size=" + e().length + " text=" + strX2 + "…]";
        }
        if (e().length <= 64) {
            return "[hex=" + k() + ']';
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[size=");
        sb.append(e().length);
        sb.append(" hex=");
        if (64 <= e().length) {
            sb.append((64 == e().length ? this : new i(i.t.g.g(e(), 0, 64))).k());
            sb.append("…]");
            return sb.toString();
        }
        throw new IllegalArgumentException(("endIndex > length(" + e().length + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    public final int u() {
        return h();
    }

    public final boolean v(i iVar) {
        i.y.d.l.d(iVar, "prefix");
        return o(0, iVar, 0, iVar.u());
    }

    public i w() {
        byte b2;
        for (int i2 = 0; i2 < e().length; i2++) {
            byte b3 = e()[i2];
            byte b4 = (byte) 65;
            if (b3 >= b4 && b3 <= (b2 = (byte) 90)) {
                byte[] bArrE = e();
                byte[] bArrCopyOf = Arrays.copyOf(bArrE, bArrE.length);
                i.y.d.l.c(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
                bArrCopyOf[i2] = (byte) (b3 + 32);
                for (int i3 = i2 + 1; i3 < bArrCopyOf.length; i3++) {
                    byte b5 = bArrCopyOf[i3];
                    if (b5 >= b4 && b5 <= b2) {
                        bArrCopyOf[i3] = (byte) (b5 + 32);
                    }
                }
                return new i(bArrCopyOf);
            }
        }
        return this;
    }

    public String x() {
        String strJ = j();
        if (strJ != null) {
            return strJ;
        }
        String strB = b.b(l());
        r(strB);
        return strB;
    }

    public void y(f fVar, int i2, int i3) {
        i.y.d.l.d(fVar, "buffer");
        j.f0.b.d(this, fVar, i2, i3);
    }
}