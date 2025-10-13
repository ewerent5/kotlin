package c.e;

import ch.qos.logback.core.CoreConstants;

/* compiled from: SparseArrayCompat.java */
/* loaded from: classes.dex */
public class h<E> implements Cloneable {

    /* renamed from: e, reason: collision with root package name */
    private static final Object f2749e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private boolean f2750f;

    /* renamed from: g, reason: collision with root package name */
    private int[] f2751g;

    /* renamed from: h, reason: collision with root package name */
    private Object[] f2752h;

    /* renamed from: i, reason: collision with root package name */
    private int f2753i;

    public h() {
        this(10);
    }

    private void e() {
        int i2 = this.f2753i;
        int[] iArr = this.f2751g;
        Object[] objArr = this.f2752h;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f2749e) {
                if (i4 != i3) {
                    iArr[i3] = iArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f2750f = false;
        this.f2753i = i3;
    }

    public void a(int i2, E e2) {
        int i3 = this.f2753i;
        if (i3 != 0 && i2 <= this.f2751g[i3 - 1]) {
            k(i2, e2);
            return;
        }
        if (this.f2750f && i3 >= this.f2751g.length) {
            e();
        }
        int i4 = this.f2753i;
        if (i4 >= this.f2751g.length) {
            int iE = c.e(i4 + 1);
            int[] iArr = new int[iE];
            Object[] objArr = new Object[iE];
            int[] iArr2 = this.f2751g;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f2752h;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f2751g = iArr;
            this.f2752h = objArr;
        }
        this.f2751g[i4] = i2;
        this.f2752h[i4] = e2;
        this.f2753i = i4 + 1;
    }

    public void b() {
        int i2 = this.f2753i;
        Object[] objArr = this.f2752h;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.f2753i = 0;
        this.f2750f = false;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public h<E> clone() {
        try {
            h<E> hVar = (h) super.clone();
            hVar.f2751g = (int[]) this.f2751g.clone();
            hVar.f2752h = (Object[]) this.f2752h.clone();
            return hVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public E f(int i2) {
        return g(i2, null);
    }

    public E g(int i2, E e2) {
        int iA = c.a(this.f2751g, this.f2753i, i2);
        if (iA >= 0) {
            Object[] objArr = this.f2752h;
            if (objArr[iA] != f2749e) {
                return (E) objArr[iA];
            }
        }
        return e2;
    }

    public int h(int i2) {
        if (this.f2750f) {
            e();
        }
        return c.a(this.f2751g, this.f2753i, i2);
    }

    public int i(E e2) {
        if (this.f2750f) {
            e();
        }
        for (int i2 = 0; i2 < this.f2753i; i2++) {
            if (this.f2752h[i2] == e2) {
                return i2;
            }
        }
        return -1;
    }

    public int j(int i2) {
        if (this.f2750f) {
            e();
        }
        return this.f2751g[i2];
    }

    public void k(int i2, E e2) {
        int iA = c.a(this.f2751g, this.f2753i, i2);
        if (iA >= 0) {
            this.f2752h[iA] = e2;
            return;
        }
        int i3 = ~iA;
        int i4 = this.f2753i;
        if (i3 < i4) {
            Object[] objArr = this.f2752h;
            if (objArr[i3] == f2749e) {
                this.f2751g[i3] = i2;
                objArr[i3] = e2;
                return;
            }
        }
        if (this.f2750f && i4 >= this.f2751g.length) {
            e();
            i3 = ~c.a(this.f2751g, this.f2753i, i2);
        }
        int i5 = this.f2753i;
        if (i5 >= this.f2751g.length) {
            int iE = c.e(i5 + 1);
            int[] iArr = new int[iE];
            Object[] objArr2 = new Object[iE];
            int[] iArr2 = this.f2751g;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f2752h;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f2751g = iArr;
            this.f2752h = objArr2;
        }
        int i6 = this.f2753i;
        if (i6 - i3 != 0) {
            int[] iArr3 = this.f2751g;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr4 = this.f2752h;
            System.arraycopy(objArr4, i3, objArr4, i7, this.f2753i - i3);
        }
        this.f2751g[i3] = i2;
        this.f2752h[i3] = e2;
        this.f2753i++;
    }

    public void l(int i2) {
        int iA = c.a(this.f2751g, this.f2753i, i2);
        if (iA >= 0) {
            Object[] objArr = this.f2752h;
            Object obj = objArr[iA];
            Object obj2 = f2749e;
            if (obj != obj2) {
                objArr[iA] = obj2;
                this.f2750f = true;
            }
        }
    }

    public void m(int i2) {
        Object[] objArr = this.f2752h;
        Object obj = objArr[i2];
        Object obj2 = f2749e;
        if (obj != obj2) {
            objArr[i2] = obj2;
            this.f2750f = true;
        }
    }

    public int n() {
        if (this.f2750f) {
            e();
        }
        return this.f2753i;
    }

    public E o(int i2) {
        if (this.f2750f) {
            e();
        }
        return (E) this.f2752h[i2];
    }

    public String toString() {
        if (n() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2753i * 28);
        sb.append(CoreConstants.CURLY_LEFT);
        for (int i2 = 0; i2 < this.f2753i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(j(i2));
            sb.append('=');
            E eO = o(i2);
            if (eO != this) {
                sb.append(eO);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append(CoreConstants.CURLY_RIGHT);
        return sb.toString();
    }

    public h(int i2) {
        this.f2750f = false;
        if (i2 == 0) {
            this.f2751g = c.a;
            this.f2752h = c.f2715c;
        } else {
            int iE = c.e(i2);
            this.f2751g = new int[iE];
            this.f2752h = new Object[iE];
        }
    }
}