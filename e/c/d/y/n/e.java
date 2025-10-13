package e.c.d.y.n;

import ch.qos.logback.core.CoreConstants;
import e.c.d.o;
import e.c.d.q;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* compiled from: JsonTreeReader.java */
/* loaded from: classes.dex */
public final class e extends e.c.d.a0.a {
    private static final Reader u = new a();
    private static final Object v = new Object();
    private Object[] w;
    private int x;
    private String[] y;
    private int[] z;

    /* compiled from: JsonTreeReader.java */
    class a extends Reader {
        a() {
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i2, int i3) {
            throw new AssertionError();
        }
    }

    public e(e.c.d.l lVar) {
        super(u);
        this.w = new Object[32];
        this.x = 0;
        this.y = new String[32];
        this.z = new int[32];
        X0(lVar);
    }

    private String C() {
        return " at path " + getPath();
    }

    private void T0(e.c.d.a0.b bVar) {
        if (k0() == bVar) {
            return;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + k0() + C());
    }

    private Object U0() {
        return this.w[this.x - 1];
    }

    private Object V0() {
        Object[] objArr = this.w;
        int i2 = this.x - 1;
        this.x = i2;
        Object obj = objArr[i2];
        objArr[i2] = null;
        return obj;
    }

    private void X0(Object obj) {
        int i2 = this.x;
        Object[] objArr = this.w;
        if (i2 == objArr.length) {
            int i3 = i2 * 2;
            this.w = Arrays.copyOf(objArr, i3);
            this.z = Arrays.copyOf(this.z, i3);
            this.y = (String[]) Arrays.copyOf(this.y, i3);
        }
        Object[] objArr2 = this.w;
        int i4 = this.x;
        this.x = i4 + 1;
        objArr2[i4] = obj;
    }

    @Override // e.c.d.a0.a
    public boolean D() {
        T0(e.c.d.a0.b.BOOLEAN);
        boolean zN = ((q) V0()).n();
        int i2 = this.x;
        if (i2 > 0) {
            int[] iArr = this.z;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return zN;
    }

    @Override // e.c.d.a0.a
    public double K() {
        e.c.d.a0.b bVarK0 = k0();
        e.c.d.a0.b bVar = e.c.d.a0.b.NUMBER;
        if (bVarK0 != bVar && bVarK0 != e.c.d.a0.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + bVarK0 + C());
        }
        double dO = ((q) U0()).o();
        if (!A() && (Double.isNaN(dO) || Double.isInfinite(dO))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + dO);
        }
        V0();
        int i2 = this.x;
        if (i2 > 0) {
            int[] iArr = this.z;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return dO;
    }

    @Override // e.c.d.a0.a
    public int N() {
        e.c.d.a0.b bVarK0 = k0();
        e.c.d.a0.b bVar = e.c.d.a0.b.NUMBER;
        if (bVarK0 != bVar && bVarK0 != e.c.d.a0.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + bVarK0 + C());
        }
        int iP = ((q) U0()).p();
        V0();
        int i2 = this.x;
        if (i2 > 0) {
            int[] iArr = this.z;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return iP;
    }

    @Override // e.c.d.a0.a
    public void O0() {
        if (k0() == e.c.d.a0.b.NAME) {
            W();
            this.y[this.x - 2] = "null";
        } else {
            V0();
            int i2 = this.x;
            if (i2 > 0) {
                this.y[i2 - 1] = "null";
            }
        }
        int i3 = this.x;
        if (i3 > 0) {
            int[] iArr = this.z;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
        }
    }

    @Override // e.c.d.a0.a
    public long T() {
        e.c.d.a0.b bVarK0 = k0();
        e.c.d.a0.b bVar = e.c.d.a0.b.NUMBER;
        if (bVarK0 != bVar && bVarK0 != e.c.d.a0.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + bVarK0 + C());
        }
        long jR = ((q) U0()).r();
        V0();
        int i2 = this.x;
        if (i2 > 0) {
            int[] iArr = this.z;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return jR;
    }

    @Override // e.c.d.a0.a
    public String W() {
        T0(e.c.d.a0.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) U0()).next();
        String str = (String) entry.getKey();
        this.y[this.x - 1] = str;
        X0(entry.getValue());
        return str;
    }

    public void W0() {
        T0(e.c.d.a0.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) U0()).next();
        X0(entry.getValue());
        X0(new q((String) entry.getKey()));
    }

    @Override // e.c.d.a0.a
    public void a0() {
        T0(e.c.d.a0.b.NULL);
        V0();
        int i2 = this.x;
        if (i2 > 0) {
            int[] iArr = this.z;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // e.c.d.a0.a
    public void b() {
        T0(e.c.d.a0.b.BEGIN_ARRAY);
        X0(((e.c.d.i) U0()).iterator());
        this.z[this.x - 1] = 0;
    }

    @Override // e.c.d.a0.a
    public void c() {
        T0(e.c.d.a0.b.BEGIN_OBJECT);
        X0(((o) U0()).o().iterator());
    }

    @Override // e.c.d.a0.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.w = new Object[]{v};
        this.x = 1;
    }

    @Override // e.c.d.a0.a
    public String getPath() {
        StringBuilder sb = new StringBuilder();
        sb.append(CoreConstants.DOLLAR);
        int i2 = 0;
        while (i2 < this.x) {
            Object[] objArr = this.w;
            if (objArr[i2] instanceof e.c.d.i) {
                i2++;
                if (objArr[i2] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.z[i2]);
                    sb.append(']');
                }
            } else if (objArr[i2] instanceof o) {
                i2++;
                if (objArr[i2] instanceof Iterator) {
                    sb.append(CoreConstants.DOT);
                    String[] strArr = this.y;
                    if (strArr[i2] != null) {
                        sb.append(strArr[i2]);
                    }
                }
            }
            i2++;
        }
        return sb.toString();
    }

    @Override // e.c.d.a0.a
    public String h0() {
        e.c.d.a0.b bVarK0 = k0();
        e.c.d.a0.b bVar = e.c.d.a0.b.STRING;
        if (bVarK0 == bVar || bVarK0 == e.c.d.a0.b.NUMBER) {
            String strF = ((q) V0()).f();
            int i2 = this.x;
            if (i2 > 0) {
                int[] iArr = this.z;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            return strF;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + bVarK0 + C());
    }

    @Override // e.c.d.a0.a
    public void j() {
        T0(e.c.d.a0.b.END_ARRAY);
        V0();
        V0();
        int i2 = this.x;
        if (i2 > 0) {
            int[] iArr = this.z;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // e.c.d.a0.a
    public e.c.d.a0.b k0() {
        if (this.x == 0) {
            return e.c.d.a0.b.END_DOCUMENT;
        }
        Object objU0 = U0();
        if (objU0 instanceof Iterator) {
            boolean z = this.w[this.x - 2] instanceof o;
            Iterator it = (Iterator) objU0;
            if (!it.hasNext()) {
                return z ? e.c.d.a0.b.END_OBJECT : e.c.d.a0.b.END_ARRAY;
            }
            if (z) {
                return e.c.d.a0.b.NAME;
            }
            X0(it.next());
            return k0();
        }
        if (objU0 instanceof o) {
            return e.c.d.a0.b.BEGIN_OBJECT;
        }
        if (objU0 instanceof e.c.d.i) {
            return e.c.d.a0.b.BEGIN_ARRAY;
        }
        if (!(objU0 instanceof q)) {
            if (objU0 instanceof e.c.d.n) {
                return e.c.d.a0.b.NULL;
            }
            if (objU0 == v) {
                throw new IllegalStateException("JsonReader is closed");
            }
            throw new AssertionError();
        }
        q qVar = (q) objU0;
        if (qVar.y()) {
            return e.c.d.a0.b.STRING;
        }
        if (qVar.u()) {
            return e.c.d.a0.b.BOOLEAN;
        }
        if (qVar.x()) {
            return e.c.d.a0.b.NUMBER;
        }
        throw new AssertionError();
    }

    @Override // e.c.d.a0.a
    public void q() {
        T0(e.c.d.a0.b.END_OBJECT);
        V0();
        V0();
        int i2 = this.x;
        if (i2 > 0) {
            int[] iArr = this.z;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // e.c.d.a0.a
    public String toString() {
        return e.class.getSimpleName();
    }

    @Override // e.c.d.a0.a
    public boolean v() {
        e.c.d.a0.b bVarK0 = k0();
        return (bVarK0 == e.c.d.a0.b.END_OBJECT || bVarK0 == e.c.d.a0.b.END_ARRAY) ? false : true;
    }
}