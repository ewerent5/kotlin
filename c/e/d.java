package c.e;

import ch.qos.logback.core.CoreConstants;

/* compiled from: LongSparseArray.java */
/* loaded from: classes.dex */
public class d<E> implements Cloneable {

    /* renamed from: e, reason: collision with root package name */
    private static final Object f2716e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private boolean f2717f;

    /* renamed from: g, reason: collision with root package name */
    private long[] f2718g;

    /* renamed from: h, reason: collision with root package name */
    private Object[] f2719h;

    /* renamed from: i, reason: collision with root package name */
    private int f2720i;

    public d() {
        this(10);
    }

    private void e() {
        int i2 = this.f2720i;
        long[] jArr = this.f2718g;
        Object[] objArr = this.f2719h;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f2716e) {
                if (i4 != i3) {
                    jArr[i3] = jArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f2717f = false;
        this.f2720i = i3;
    }

    public void a(long j2, E e2) {
        int i2 = this.f2720i;
        if (i2 != 0 && j2 <= this.f2718g[i2 - 1]) {
            j(j2, e2);
            return;
        }
        if (this.f2717f && i2 >= this.f2718g.length) {
            e();
        }
        int i3 = this.f2720i;
        if (i3 >= this.f2718g.length) {
            int iF = c.f(i3 + 1);
            long[] jArr = new long[iF];
            Object[] objArr = new Object[iF];
            long[] jArr2 = this.f2718g;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f2719h;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f2718g = jArr;
            this.f2719h = objArr;
        }
        this.f2718g[i3] = j2;
        this.f2719h[i3] = e2;
        this.f2720i = i3 + 1;
    }

    public void b() {
        int i2 = this.f2720i;
        Object[] objArr = this.f2719h;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.f2720i = 0;
        this.f2717f = false;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public d<E> clone() {
        try {
            d<E> dVar = (d) super.clone();
            dVar.f2718g = (long[]) this.f2718g.clone();
            dVar.f2719h = (Object[]) this.f2719h.clone();
            return dVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public E f(long j2) {
        return g(j2, null);
    }

    public E g(long j2, E e2) {
        int iB = c.b(this.f2718g, this.f2720i, j2);
        if (iB >= 0) {
            Object[] objArr = this.f2719h;
            if (objArr[iB] != f2716e) {
                return (E) objArr[iB];
            }
        }
        return e2;
    }

    public int h(long j2) {
        if (this.f2717f) {
            e();
        }
        return c.b(this.f2718g, this.f2720i, j2);
    }

    public long i(int i2) {
        if (this.f2717f) {
            e();
        }
        return this.f2718g[i2];
    }

    public void j(long j2, E e2) {
        int iB = c.b(this.f2718g, this.f2720i, j2);
        if (iB >= 0) {
            this.f2719h[iB] = e2;
            return;
        }
        int i2 = ~iB;
        int i3 = this.f2720i;
        if (i2 < i3) {
            Object[] objArr = this.f2719h;
            if (objArr[i2] == f2716e) {
                this.f2718g[i2] = j2;
                objArr[i2] = e2;
                return;
            }
        }
        if (this.f2717f && i3 >= this.f2718g.length) {
            e();
            i2 = ~c.b(this.f2718g, this.f2720i, j2);
        }
        int i4 = this.f2720i;
        if (i4 >= this.f2718g.length) {
            int iF = c.f(i4 + 1);
            long[] jArr = new long[iF];
            Object[] objArr2 = new Object[iF];
            long[] jArr2 = this.f2718g;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f2719h;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f2718g = jArr;
            this.f2719h = objArr2;
        }
        int i5 = this.f2720i;
        if (i5 - i2 != 0) {
            long[] jArr3 = this.f2718g;
            int i6 = i2 + 1;
            System.arraycopy(jArr3, i2, jArr3, i6, i5 - i2);
            Object[] objArr4 = this.f2719h;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f2720i - i2);
        }
        this.f2718g[i2] = j2;
        this.f2719h[i2] = e2;
        this.f2720i++;
    }

    public void k(long j2) {
        int iB = c.b(this.f2718g, this.f2720i, j2);
        if (iB >= 0) {
            Object[] objArr = this.f2719h;
            Object obj = objArr[iB];
            Object obj2 = f2716e;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.f2717f = true;
            }
        }
    }

    public void l(int i2) {
        Object[] objArr = this.f2719h;
        Object obj = objArr[i2];
        Object obj2 = f2716e;
        if (obj != obj2) {
            objArr[i2] = obj2;
            this.f2717f = true;
        }
    }

    public int m() {
        if (this.f2717f) {
            e();
        }
        return this.f2720i;
    }

    public E n(int i2) {
        if (this.f2717f) {
            e();
        }
        return (E) this.f2719h[i2];
    }

    public String toString() {
        if (m() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2720i * 28);
        sb.append(CoreConstants.CURLY_LEFT);
        for (int i2 = 0; i2 < this.f2720i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(i(i2));
            sb.append('=');
            E eN = n(i2);
            if (eN != this) {
                sb.append(eN);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append(CoreConstants.CURLY_RIGHT);
        return sb.toString();
    }

    public d(int i2) {
        this.f2717f = false;
        if (i2 == 0) {
            this.f2718g = c.f2714b;
            this.f2719h = c.f2715c;
        } else {
            int iF = c.f(i2);
            this.f2718g = new long[iF];
            this.f2719h = new Object[iF];
        }
    }
}