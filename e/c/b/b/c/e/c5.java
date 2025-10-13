package e.c.b.b.c.e;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class c5<E> extends r4<E> {

    /* renamed from: g, reason: collision with root package name */
    static final r4<Object> f14422g = new c5(new Object[0], 0);

    /* renamed from: h, reason: collision with root package name */
    private final transient Object[] f14423h;

    /* renamed from: i, reason: collision with root package name */
    private final transient int f14424i;

    c5(Object[] objArr, int i2) {
        this.f14423h = objArr;
        this.f14424i = i2;
    }

    @Override // e.c.b.b.c.e.r4, e.c.b.b.c.e.n4
    final int a(Object[] objArr, int i2) {
        System.arraycopy(this.f14423h, 0, objArr, i2, this.f14424i);
        return i2 + this.f14424i;
    }

    @Override // e.c.b.b.c.e.n4
    final Object[] e() {
        return this.f14423h;
    }

    @Override // e.c.b.b.c.e.n4
    final int f() {
        return 0;
    }

    @Override // java.util.List, j$.util.List
    public final E get(int i2) {
        q3.a(i2, this.f14424i);
        return (E) this.f14423h[i2];
    }

    @Override // e.c.b.b.c.e.n4
    final int h() {
        return this.f14424i;
    }

    @Override // e.c.b.b.c.e.n4
    final boolean l() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public final int size() {
        return this.f14424i;
    }
}