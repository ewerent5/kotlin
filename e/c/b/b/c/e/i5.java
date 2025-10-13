package e.c.b.b.c.e;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class i5<E> extends w4<E> {

    /* renamed from: g, reason: collision with root package name */
    static final i5<Object> f14606g = new i5<>(new Object[0], 0, null, 0, 0);

    /* renamed from: h, reason: collision with root package name */
    private final transient Object[] f14607h;

    /* renamed from: i, reason: collision with root package name */
    private final transient Object[] f14608i;

    /* renamed from: j, reason: collision with root package name */
    private final transient int f14609j;

    /* renamed from: k, reason: collision with root package name */
    private final transient int f14610k;

    /* renamed from: l, reason: collision with root package name */
    private final transient int f14611l;

    i5(Object[] objArr, int i2, Object[] objArr2, int i3, int i4) {
        this.f14607h = objArr;
        this.f14608i = objArr2;
        this.f14609j = i3;
        this.f14610k = i2;
        this.f14611l = i4;
    }

    @Override // e.c.b.b.c.e.n4
    final int a(Object[] objArr, int i2) {
        System.arraycopy(this.f14607h, 0, objArr, i2, this.f14611l);
        return i2 + this.f14611l;
    }

    @Override // e.c.b.b.c.e.n4
    /* renamed from: c */
    public final n5<E> iterator() {
        return (n5) k().iterator();
    }

    @Override // e.c.b.b.c.e.n4, java.util.AbstractCollection, java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public final boolean contains(@NullableDecl Object obj) {
        Object[] objArr = this.f14608i;
        if (obj == null || objArr == null) {
            return false;
        }
        int iB = o4.b(obj);
        while (true) {
            int i2 = iB & this.f14609j;
            Object obj2 = objArr[i2];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iB = i2 + 1;
        }
    }

    @Override // e.c.b.b.c.e.n4
    final Object[] e() {
        return this.f14607h;
    }

    @Override // e.c.b.b.c.e.n4
    final int f() {
        return 0;
    }

    @Override // e.c.b.b.c.e.n4
    final int h() {
        return this.f14611l;
    }

    @Override // e.c.b.b.c.e.w4, java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public final int hashCode() {
        return this.f14610k;
    }

    @Override // e.c.b.b.c.e.w4, e.c.b.b.c.e.n4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, j$.util.Collection, java.util.Set, j$.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // e.c.b.b.c.e.n4
    final boolean l() {
        return false;
    }

    @Override // e.c.b.b.c.e.w4
    final boolean n() {
        return true;
    }

    @Override // e.c.b.b.c.e.w4
    final r4<E> o() {
        return r4.p(this.f14607h, this.f14611l);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public final int size() {
        return this.f14611l;
    }
}