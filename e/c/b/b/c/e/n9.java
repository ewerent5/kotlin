package e.c.b.b.c.e;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
final class n9<E> extends a6<E> implements RandomAccess {

    /* renamed from: f, reason: collision with root package name */
    private static final n9<Object> f14729f;

    /* renamed from: g, reason: collision with root package name */
    private E[] f14730g;

    /* renamed from: h, reason: collision with root package name */
    private int f14731h;

    static {
        n9<Object> n9Var = new n9<>(new Object[0], 0);
        f14729f = n9Var;
        n9Var.C0();
    }

    private n9(E[] eArr, int i2) {
        this.f14730g = eArr;
        this.f14731h = i2;
    }

    private final void c(int i2) {
        if (i2 < 0 || i2 >= this.f14731h) {
            throw new IndexOutOfBoundsException(e(i2));
        }
    }

    private final String e(int i2) {
        int i3 = this.f14731h;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    public static <E> n9<E> f() {
        return (n9<E>) f14729f;
    }

    @Override // e.c.b.b.c.e.a6, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final boolean add(E e2) {
        a();
        int i2 = this.f14731h;
        E[] eArr = this.f14730g;
        if (i2 == eArr.length) {
            this.f14730g = (E[]) Arrays.copyOf(eArr, ((i2 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f14730g;
        int i3 = this.f14731h;
        this.f14731h = i3 + 1;
        eArr2[i3] = e2;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // e.c.b.b.c.e.x7
    public final /* synthetic */ x7 b(int i2) {
        if (i2 >= this.f14731h) {
            return new n9(Arrays.copyOf(this.f14730g, i2), this.f14731h);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final E get(int i2) {
        c(i2);
        return this.f14730g[i2];
    }

    @Override // e.c.b.b.c.e.a6, java.util.AbstractList, java.util.List, j$.util.List
    public final E remove(int i2) {
        a();
        c(i2);
        E[] eArr = this.f14730g;
        E e2 = eArr[i2];
        if (i2 < this.f14731h - 1) {
            System.arraycopy(eArr, i2 + 1, eArr, i2, (r2 - i2) - 1);
        }
        this.f14731h--;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final E set(int i2, E e2) {
        a();
        c(i2);
        E[] eArr = this.f14730g;
        E e3 = eArr[i2];
        eArr[i2] = e2;
        ((AbstractList) this).modCount++;
        return e3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final int size() {
        return this.f14731h;
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final void add(int i2, E e2) {
        int i3;
        a();
        if (i2 >= 0 && i2 <= (i3 = this.f14731h)) {
            E[] eArr = this.f14730g;
            if (i3 < eArr.length) {
                System.arraycopy(eArr, i2, eArr, i2 + 1, i3 - i2);
            } else {
                E[] eArr2 = (E[]) new Object[((i3 * 3) / 2) + 1];
                System.arraycopy(eArr, 0, eArr2, 0, i2);
                System.arraycopy(this.f14730g, i2, eArr2, i2 + 1, this.f14731h - i2);
                this.f14730g = eArr2;
            }
            this.f14730g[i2] = e2;
            this.f14731h++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(e(i2));
    }
}