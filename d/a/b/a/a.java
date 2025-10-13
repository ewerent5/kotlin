package d.a.b.a;

import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class a implements XmlResourceParser {

    /* renamed from: e, reason: collision with root package name */
    private static final Logger f14100e = Logger.getLogger(a.class.getName());

    /* renamed from: f, reason: collision with root package name */
    private d.c.b f14101f;

    /* renamed from: g, reason: collision with root package name */
    private b f14102g;

    /* renamed from: h, reason: collision with root package name */
    private d.a.a f14103h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f14104i;

    /* renamed from: j, reason: collision with root package name */
    private c f14105j;

    /* renamed from: k, reason: collision with root package name */
    private int[] f14106k;

    /* renamed from: l, reason: collision with root package name */
    private C0169a f14107l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f14108m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int[] r;
    private int s;
    private int t;
    private int u;

    /* renamed from: d.a.b.a.a$a, reason: collision with other inner class name */
    private static final class C0169a {
        private int[] a = new int[32];

        /* renamed from: b, reason: collision with root package name */
        private int f14109b;

        /* renamed from: c, reason: collision with root package name */
        private int f14110c;

        /* renamed from: d, reason: collision with root package name */
        private int f14111d;

        private void b(int i2) {
            int[] iArr = this.a;
            int length = iArr.length;
            int i3 = this.f14109b;
            int i4 = length - i3;
            if (i4 > i2) {
                return;
            }
            int[] iArr2 = new int[(iArr.length + i4) * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.a = iArr2;
        }

        private final int c(int i2, boolean z) {
            int i3 = this.f14109b;
            if (i3 == 0) {
                return -1;
            }
            int i4 = i3 - 1;
            for (int i5 = this.f14111d; i5 != 0; i5--) {
                i4 -= 2;
                for (int i6 = this.a[i4]; i6 != 0; i6--) {
                    int[] iArr = this.a;
                    if (z) {
                        if (iArr[i4] == i2) {
                            return iArr[i4 + 1];
                        }
                    } else if (iArr[i4 + 1] == i2) {
                        return iArr[i4];
                    }
                    i4 -= 2;
                }
            }
            return -1;
        }

        private final int e(int i2, boolean z) {
            if (this.f14109b != 0 && i2 >= 0) {
                int i3 = 0;
                for (int i4 = this.f14111d; i4 != 0; i4--) {
                    int[] iArr = this.a;
                    int i5 = iArr[i3];
                    if (i2 < i5) {
                        int i6 = i3 + (i2 * 2) + 1;
                        if (!z) {
                            i6++;
                        }
                        return iArr[i6];
                    }
                    i2 -= i5;
                    i3 += (i5 * 2) + 2;
                }
            }
            return -1;
        }

        public final void a() {
            int i2 = this.f14109b;
            if (i2 == 0) {
                return;
            }
            int i3 = i2 - 1;
            int i4 = this.a[i3];
            int i5 = i4 * 2;
            if ((i3 - 1) - i5 == 0) {
                return;
            }
            this.f14109b = i2 - (i5 + 2);
            this.f14110c -= i4;
            this.f14111d--;
        }

        public final int d(int i2) {
            return c(i2, false);
        }

        public final int f(int i2) {
            int i3 = 0;
            if (this.f14109b != 0 && i2 >= 0) {
                int i4 = this.f14111d;
                if (i2 > i4) {
                    i2 = i4;
                }
                int i5 = 0;
                while (i2 != 0) {
                    int i6 = this.a[i5];
                    i3 += i6;
                    i5 += (i6 * 2) + 2;
                    i2--;
                }
            }
            return i3;
        }

        public final int g() {
            int i2 = this.f14109b;
            if (i2 == 0) {
                return 0;
            }
            return this.a[i2 - 1];
        }

        public final int h() {
            return this.f14111d;
        }

        public final int i(int i2) {
            return e(i2, true);
        }

        public final int j(int i2) {
            return e(i2, false);
        }

        public final void k() {
            b(2);
            int i2 = this.f14109b;
            int[] iArr = this.a;
            iArr[i2] = 0;
            iArr[i2 + 1] = 0;
            this.f14109b = i2 + 2;
            this.f14111d++;
        }

        public final boolean l() {
            int i2;
            int[] iArr;
            int i3;
            int i4 = this.f14109b;
            if (i4 == 0 || (i3 = (iArr = this.a)[i4 - 1]) == 0) {
                return false;
            }
            int i5 = i3 - 1;
            int i6 = i2 - 2;
            iArr[i6] = i5;
            iArr[i6 - ((i5 * 2) + 1)] = i5;
            this.f14109b = i4 - 2;
            this.f14110c--;
            return true;
        }

        public final void m(int i2, int i3) {
            if (this.f14111d == 0) {
                k();
            }
            b(2);
            int i4 = this.f14109b;
            int i5 = i4 - 1;
            int[] iArr = this.a;
            int i6 = iArr[i5];
            int i7 = (i5 - 1) - (i6 * 2);
            int i8 = i6 + 1;
            iArr[i7] = i8;
            iArr[i5] = i2;
            iArr[i5 + 1] = i3;
            iArr[i5 + 2] = i8;
            this.f14109b = i4 + 2;
            this.f14110c++;
        }

        public final void n() {
            this.f14109b = 0;
            this.f14110c = 0;
            this.f14111d = 0;
        }
    }

    public a() {
        this.f14102g = new b();
        this.f14104i = false;
        this.f14107l = new C0169a();
        i();
    }

    public a(InputStream inputStream) {
        this();
        g(inputStream);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0096, code lost:
    
        throw new java.io.IOException("Invalid resource ids size (" + r2 + ").");
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x018b, code lost:
    
        throw new java.io.IOException("Invalid chunk type (" + r5 + ").");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void b() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.b.a.a.b():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002f, code lost:
    
        return r0 / 5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int c(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            d.a.b.a.c r0 = r5.f14105j
            r1 = -1
            if (r0 == 0) goto L32
            if (r7 != 0) goto L8
            goto L32
        L8:
            int r7 = r0.b(r7)
            if (r7 != r1) goto Lf
            return r1
        Lf:
            if (r6 == 0) goto L18
            d.a.b.a.c r0 = r5.f14105j
            int r6 = r0.b(r6)
            goto L19
        L18:
            r6 = -1
        L19:
            r0 = 0
        L1a:
            int[] r2 = r5.r
            int r3 = r2.length
            if (r0 == r3) goto L32
            int r3 = r0 + 1
            r4 = r2[r3]
            if (r7 != r4) goto L30
            if (r6 == r1) goto L2d
            int r4 = r0 + 0
            r2 = r2[r4]
            if (r6 != r2) goto L30
        L2d:
            int r0 = r0 / 5
            return r0
        L30:
            r0 = r3
            goto L1a
        L32:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.b.a.a.c(java.lang.String, java.lang.String):int");
    }

    private final int d(int i2) {
        if (this.n != 2) {
            throw new IndexOutOfBoundsException("Current event is not START_TAG.");
        }
        int i3 = i2 * 5;
        if (i3 < this.r.length) {
            return i3;
        }
        throw new IndexOutOfBoundsException("Invalid attribute index (" + i2 + ").");
    }

    private final void i() {
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.r = null;
        this.s = -1;
        this.t = -1;
        this.u = -1;
    }

    private void j(d.a.a aVar) {
        d.a.a aVar2 = this.f14103h;
    }

    @Override // android.content.res.XmlResourceParser, java.lang.AutoCloseable
    public void close() {
        if (this.f14104i) {
            this.f14104i = false;
            this.f14101f = null;
            this.f14105j = null;
            this.f14106k = null;
            this.f14107l.n();
            i();
        }
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public void defineEntityReplacementText(String str, String str2) throws XmlPullParserException {
        throw new XmlPullParserException("Method is not supported.");
    }

    public void g(InputStream inputStream) {
        close();
        if (inputStream != null) {
            this.f14101f = new d.c.b(new e.e.a.a(inputStream));
        }
    }

    @Override // android.util.AttributeSet
    public boolean getAttributeBooleanValue(int i2, boolean z) {
        return getAttributeIntValue(i2, z ? 1 : 0) != 0;
    }

    @Override // android.util.AttributeSet
    public boolean getAttributeBooleanValue(String str, String str2, boolean z) {
        int iC = c(str, str2);
        return iC == -1 ? z : getAttributeBooleanValue(iC, z);
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public int getAttributeCount() {
        if (this.n != 2) {
            return -1;
        }
        return this.r.length / 5;
    }

    @Override // android.util.AttributeSet
    public float getAttributeFloatValue(int i2, float f2) {
        int iD = d(i2);
        int[] iArr = this.r;
        return iArr[iD + 3] == 4 ? Float.intBitsToFloat(iArr[iD + 4]) : f2;
    }

    @Override // android.util.AttributeSet
    public float getAttributeFloatValue(String str, String str2, float f2) {
        int iC = c(str, str2);
        return iC == -1 ? f2 : getAttributeFloatValue(iC, f2);
    }

    @Override // android.util.AttributeSet
    public int getAttributeIntValue(int i2, int i3) {
        int iD = d(i2);
        int[] iArr = this.r;
        int i4 = iArr[iD + 3];
        return (i4 < 16 || i4 > 31) ? i3 : iArr[iD + 4];
    }

    @Override // android.util.AttributeSet
    public int getAttributeIntValue(String str, String str2, int i2) {
        int iC = c(str, str2);
        return iC == -1 ? i2 : getAttributeIntValue(iC, i2);
    }

    @Override // android.util.AttributeSet
    public int getAttributeListValue(int i2, String[] strArr, int i3) {
        return 0;
    }

    @Override // android.util.AttributeSet
    public int getAttributeListValue(String str, String str2, String[] strArr, int i2) {
        return 0;
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public String getAttributeName(int i2) {
        int i3 = this.r[d(i2) + 1];
        return i3 == -1 ? "" : this.f14105j.d(i3);
    }

    @Override // android.util.AttributeSet
    public int getAttributeNameResource(int i2) {
        int i3 = this.r[d(i2) + 1];
        int[] iArr = this.f14106k;
        if (iArr == null || i3 < 0 || i3 >= iArr.length) {
            return 0;
        }
        return iArr[i3];
    }

    @Override // android.content.res.XmlResourceParser, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public String getAttributeNamespace(int i2) {
        int i3 = this.r[d(i2) + 0];
        return i3 == -1 ? "" : this.f14105j.d(i3);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getAttributePrefix(int i2) {
        int iD = this.f14107l.d(this.r[d(i2) + 0]);
        return iD == -1 ? "" : this.f14105j.d(iD);
    }

    @Override // android.util.AttributeSet
    public int getAttributeResourceValue(int i2, int i3) {
        int iD = d(i2);
        int[] iArr = this.r;
        return iArr[iD + 3] == 1 ? iArr[iD + 4] : i3;
    }

    @Override // android.util.AttributeSet
    public int getAttributeResourceValue(String str, String str2, int i2) {
        int iC = c(str, str2);
        return iC == -1 ? i2 : getAttributeResourceValue(iC, i2);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getAttributeType(int i2) {
        return "CDATA";
    }

    @Override // android.util.AttributeSet
    public int getAttributeUnsignedIntValue(int i2, int i3) {
        return getAttributeIntValue(i2, i3);
    }

    @Override // android.util.AttributeSet
    public int getAttributeUnsignedIntValue(String str, String str2, int i2) {
        int iC = c(str, str2);
        return iC == -1 ? i2 : getAttributeUnsignedIntValue(iC, i2);
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public String getAttributeValue(int i2) {
        String strA;
        int iD = d(i2);
        int[] iArr = this.r;
        int i3 = iArr[iD + 3];
        int i4 = iArr[iD + 4];
        int i5 = iArr[iD + 2];
        b bVar = this.f14102g;
        if (bVar != null) {
            if (i5 == -1) {
                strA = null;
            } else {
                try {
                    strA = d.a.b.b.a.a(this.f14105j.d(i5));
                } catch (d.a.a e2) {
                    j(e2);
                    f14100e.log(Level.WARNING, String.format("Could not decode attr value, using undecoded value instead: ns=%s, name=%s, value=0x%08x", getAttributePrefix(i2), getAttributeName(i2), Integer.valueOf(i4)), (Throwable) e2);
                }
            }
            return bVar.a(i3, i4, strA, getAttributeNameResource(i2));
        }
        return TypedValue.coerceToString(i3, i4);
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public String getAttributeValue(String str, String str2) {
        int iC = c(str, str2);
        if (iC == -1) {
            return null;
        }
        return getAttributeValue(iC);
    }

    @Override // android.util.AttributeSet
    public String getClassAttribute() {
        int i2 = this.t;
        if (i2 == -1) {
            return null;
        }
        return this.f14105j.d(this.r[d(i2) + 2]);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int getColumnNumber() {
        return -1;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int getDepth() {
        return this.f14107l.h() - 1;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int getEventType() {
        return this.n;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public boolean getFeature(String str) {
        return false;
    }

    @Override // android.util.AttributeSet
    public String getIdAttribute() {
        int i2 = this.s;
        if (i2 == -1) {
            return null;
        }
        return this.f14105j.d(this.r[d(i2) + 2]);
    }

    @Override // android.util.AttributeSet
    public int getIdAttributeResourceValue(int i2) {
        int i3 = this.s;
        if (i3 == -1) {
            return i2;
        }
        int iD = d(i3);
        int[] iArr = this.r;
        return iArr[iD + 3] != 1 ? i2 : iArr[iD + 4];
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getInputEncoding() {
        return null;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int getLineNumber() {
        return this.o;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getName() {
        int i2 = this.p;
        if (i2 == -1) {
            return null;
        }
        int i3 = this.n;
        if (i3 == 2 || i3 == 3) {
            return this.f14105j.d(i2);
        }
        return null;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getNamespace() {
        return this.f14105j.d(this.q);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getNamespace(String str) {
        throw new RuntimeException("Method is not supported.");
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int getNamespaceCount(int i2) {
        return this.f14107l.f(i2);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getNamespacePrefix(int i2) {
        return this.f14105j.d(this.f14107l.i(i2));
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getNamespaceUri(int i2) {
        return this.f14105j.d(this.f14107l.j(i2));
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public String getPositionDescription() {
        return "XML line #" + getLineNumber();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getPrefix() {
        return this.f14105j.d(this.f14107l.d(this.q));
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public Object getProperty(String str) {
        return null;
    }

    @Override // android.util.AttributeSet
    public int getStyleAttribute() {
        int i2 = this.u;
        if (i2 == -1) {
            return 0;
        }
        return this.r[d(i2) + 4];
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getText() {
        int i2 = this.p;
        if (i2 == -1 || this.n != 4) {
            return null;
        }
        return this.f14105j.d(i2);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public char[] getTextCharacters(int[] iArr) {
        String text = getText();
        if (text == null) {
            return null;
        }
        iArr[0] = 0;
        iArr[1] = text.length();
        char[] cArr = new char[text.length()];
        text.getChars(0, text.length(), cArr, 0);
        return cArr;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public boolean isAttributeDefault(int i2) {
        return false;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public boolean isEmptyElementTag() {
        return false;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public boolean isWhitespace() {
        return false;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int next() throws XmlPullParserException, IOException {
        if (this.f14101f == null) {
            throw new XmlPullParserException("Parser is not opened.", this, null);
        }
        try {
            b();
            return this.n;
        } catch (IOException e2) {
            close();
            throw e2;
        }
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int nextTag() throws XmlPullParserException, IOException {
        int next = next();
        if (next == 4 && isWhitespace()) {
            next = next();
        }
        if (next == 2 || next == 3) {
            return next;
        }
        throw new XmlPullParserException("Expected start or end tag.", this, null);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String nextText() throws XmlPullParserException, IOException {
        if (getEventType() != 2) {
            throw new XmlPullParserException("Parser must be on START_TAG to read next text.", this, null);
        }
        int next = next();
        if (next != 4) {
            if (next == 3) {
                return "";
            }
            throw new XmlPullParserException("Parser must be on START_TAG or TEXT to read text.", this, null);
        }
        String text = getText();
        if (next() == 3) {
            return text;
        }
        throw new XmlPullParserException("Event TEXT must be immediately followed by END_TAG.", this, null);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int nextToken() {
        return next();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public void require(int i2, String str, String str2) throws XmlPullParserException {
        if (i2 == getEventType() && ((str == null || str.equals(getNamespace())) && (str2 == null || str2.equals(getName())))) {
            return;
        }
        throw new XmlPullParserException(XmlResourceParser.TYPES[i2] + " is expected.", this, null);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public void setFeature(String str, boolean z) throws XmlPullParserException {
        throw new XmlPullParserException("Method is not supported.");
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public void setInput(InputStream inputStream, String str) {
        g(inputStream);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public void setInput(Reader reader) throws XmlPullParserException {
        throw new XmlPullParserException("Method is not supported.");
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public void setProperty(String str, Object obj) throws XmlPullParserException {
        throw new XmlPullParserException("Method is not supported.");
    }
}