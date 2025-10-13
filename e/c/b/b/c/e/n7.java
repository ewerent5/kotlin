package e.c.b.b.c.e;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
final class n7 extends a6<Float> implements x7<Float>, m9, RandomAccess {

    /* renamed from: f, reason: collision with root package name */
    private static final n7 f14725f;

    /* renamed from: g, reason: collision with root package name */
    private float[] f14726g;

    /* renamed from: h, reason: collision with root package name */
    private int f14727h;

    static {
        n7 n7Var = new n7(new float[0], 0);
        f14725f = n7Var;
        n7Var.C0();
    }

    n7() {
        this(new float[10], 0);
    }

    private final void e(int i2) {
        if (i2 < 0 || i2 >= this.f14727h) {
            throw new IndexOutOfBoundsException(f(i2));
        }
    }

    private final String f(int i2) {
        int i3 = this.f14727h;
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
        float fFloatValue = ((Float) obj).floatValue();
        a();
        if (i2 < 0 || i2 > (i3 = this.f14727h)) {
            throw new IndexOutOfBoundsException(f(i2));
        }
        float[] fArr = this.f14726g;
        if (i3 < fArr.length) {
            System.arraycopy(fArr, i2, fArr, i2 + 1, i3 - i2);
        } else {
            float[] fArr2 = new float[((i3 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            System.arraycopy(this.f14726g, i2, fArr2, i2 + 1, this.f14727h - i2);
            this.f14726g = fArr2;
        }
        this.f14726g[i2] = fFloatValue;
        this.f14727h++;
        ((AbstractList) this).modCount++;
    }

    @Override // e.c.b.b.c.e.a6, java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final boolean addAll(Collection<? extends Float> collection) {
        a();
        r7.d(collection);
        if (!(collection instanceof n7)) {
            return super.addAll(collection);
        }
        n7 n7Var = (n7) collection;
        int i2 = n7Var.f14727h;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f14727h;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        float[] fArr = this.f14726g;
        if (i4 > fArr.length) {
            this.f14726g = Arrays.copyOf(fArr, i4);
        }
        System.arraycopy(n7Var.f14726g, 0, this.f14726g, this.f14727h, n7Var.f14727h);
        this.f14727h = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // e.c.b.b.c.e.x7
    public final /* synthetic */ x7<Float> b(int i2) {
        if (i2 >= this.f14727h) {
            return new n7(Arrays.copyOf(this.f14726g, i2), this.f14727h);
        }
        throw new IllegalArgumentException();
    }

    public final void c(float f2) {
        a();
        int i2 = this.f14727h;
        float[] fArr = this.f14726g;
        if (i2 == fArr.length) {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            this.f14726g = fArr2;
        }
        float[] fArr3 = this.f14726g;
        int i3 = this.f14727h;
        this.f14727h = i3 + 1;
        fArr3[i3] = f2;
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
        if (!(obj instanceof n7)) {
            return super.equals(obj);
        }
        n7 n7Var = (n7) obj;
        if (this.f14727h != n7Var.f14727h) {
            return false;
        }
        float[] fArr = n7Var.f14726g;
        for (int i2 = 0; i2 < this.f14727h; i2++) {
            if (Float.floatToIntBits(this.f14726g[i2]) != Float.floatToIntBits(fArr[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final /* synthetic */ Object get(int i2) {
        e(i2);
        return Float.valueOf(this.f14726g[i2]);
    }

    @Override // e.c.b.b.c.e.a6, java.util.AbstractList, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i2 = 0; i2 < this.f14727h; i2++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f14726g[i2]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f14726g[i2] == fFloatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // e.c.b.b.c.e.a6, java.util.AbstractList, java.util.List, j$.util.List
    public final /* synthetic */ Object remove(int i2) {
        a();
        e(i2);
        float[] fArr = this.f14726g;
        float f2 = fArr[i2];
        if (i2 < this.f14727h - 1) {
            System.arraycopy(fArr, i2 + 1, fArr, i2, (r2 - i2) - 1);
        }
        this.f14727h--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f2);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i2, int i3) {
        a();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f14726g;
        System.arraycopy(fArr, i3, fArr, i2, this.f14727h - i3);
        this.f14727h -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final /* synthetic */ Object set(int i2, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        a();
        e(i2);
        float[] fArr = this.f14726g;
        float f2 = fArr[i2];
        fArr[i2] = fFloatValue;
        return Float.valueOf(f2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final int size() {
        return this.f14727h;
    }

    private n7(float[] fArr, int i2) {
        this.f14726g = fArr;
        this.f14727h = i2;
    }

    @Override // e.c.b.b.c.e.a6, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final /* synthetic */ boolean add(Object obj) {
        c(((Float) obj).floatValue());
        return true;
    }
}