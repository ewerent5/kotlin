package e.c.b.b.c.e;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
final class z6 extends a6<Double> implements x7<Double>, m9, RandomAccess {

    /* renamed from: f, reason: collision with root package name */
    private static final z6 f14973f;

    /* renamed from: g, reason: collision with root package name */
    private double[] f14974g;

    /* renamed from: h, reason: collision with root package name */
    private int f14975h;

    static {
        z6 z6Var = new z6(new double[0], 0);
        f14973f = z6Var;
        z6Var.C0();
    }

    z6() {
        this(new double[10], 0);
    }

    private final void e(int i2) {
        if (i2 < 0 || i2 >= this.f14975h) {
            throw new IndexOutOfBoundsException(f(i2));
        }
    }

    private final String f(int i2) {
        int i3 = this.f14975h;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        double dDoubleValue = ((Double) obj).doubleValue();
        a();
        if (i2 < 0 || i2 > (i3 = this.f14975h)) {
            throw new IndexOutOfBoundsException(f(i2));
        }
        double[] dArr = this.f14974g;
        if (i3 < dArr.length) {
            System.arraycopy(dArr, i2, dArr, i2 + 1, i3 - i2);
        } else {
            double[] dArr2 = new double[((i3 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            System.arraycopy(this.f14974g, i2, dArr2, i2 + 1, this.f14975h - i2);
            this.f14974g = dArr2;
        }
        this.f14974g[i2] = dDoubleValue;
        this.f14975h++;
        ((AbstractList) this).modCount++;
    }

    @Override // e.c.b.b.c.e.a6, java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final boolean addAll(Collection<? extends Double> collection) {
        a();
        r7.d(collection);
        if (!(collection instanceof z6)) {
            return super.addAll(collection);
        }
        z6 z6Var = (z6) collection;
        int i2 = z6Var.f14975h;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f14975h;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        double[] dArr = this.f14974g;
        if (i4 > dArr.length) {
            this.f14974g = Arrays.copyOf(dArr, i4);
        }
        System.arraycopy(z6Var.f14974g, 0, this.f14974g, this.f14975h, z6Var.f14975h);
        this.f14975h = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // e.c.b.b.c.e.x7
    public final /* synthetic */ x7<Double> b(int i2) {
        if (i2 >= this.f14975h) {
            return new z6(Arrays.copyOf(this.f14974g, i2), this.f14975h);
        }
        throw new IllegalArgumentException();
    }

    public final void c(double d2) {
        a();
        int i2 = this.f14975h;
        double[] dArr = this.f14974g;
        if (i2 == dArr.length) {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            this.f14974g = dArr2;
        }
        double[] dArr3 = this.f14974g;
        int i3 = this.f14975h;
        this.f14975h = i3 + 1;
        dArr3[i3] = d2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // e.c.b.b.c.e.a6, java.util.AbstractList, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6)) {
            return super.equals(obj);
        }
        z6 z6Var = (z6) obj;
        if (this.f14975h != z6Var.f14975h) {
            return false;
        }
        double[] dArr = z6Var.f14974g;
        for (int i2 = 0; i2 < this.f14975h; i2++) {
            if (Double.doubleToLongBits(this.f14974g[i2]) != Double.doubleToLongBits(dArr[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final /* synthetic */ Object get(int i2) {
        e(i2);
        return Double.valueOf(this.f14974g[i2]);
    }

    @Override // e.c.b.b.c.e.a6, java.util.AbstractList, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final int hashCode() {
        int iB = 1;
        for (int i2 = 0; i2 < this.f14975h; i2++) {
            iB = (iB * 31) + r7.b(Double.doubleToLongBits(this.f14974g[i2]));
        }
        return iB;
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f14974g[i2] == dDoubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // e.c.b.b.c.e.a6, java.util.AbstractList, java.util.List, j$.util.List
    public final /* synthetic */ Object remove(int i2) {
        a();
        e(i2);
        double[] dArr = this.f14974g;
        double d2 = dArr[i2];
        if (i2 < this.f14975h - 1) {
            System.arraycopy(dArr, i2 + 1, dArr, i2, (r3 - i2) - 1);
        }
        this.f14975h--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d2);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i2, int i3) {
        a();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f14974g;
        System.arraycopy(dArr, i3, dArr, i2, this.f14975h - i3);
        this.f14975h -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final /* synthetic */ Object set(int i2, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        a();
        e(i2);
        double[] dArr = this.f14974g;
        double d2 = dArr[i2];
        dArr[i2] = dDoubleValue;
        return Double.valueOf(d2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final int size() {
        return this.f14975h;
    }

    private z6(double[] dArr, int i2) {
        this.f14974g = dArr;
        this.f14975h = i2;
    }

    @Override // e.c.b.b.c.e.a6, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final /* synthetic */ boolean add(Object obj) {
        c(((Double) obj).doubleValue());
        return true;
    }
}