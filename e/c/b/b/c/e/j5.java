package e.c.b.b.c.e;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class j5 extends r4<Object> {

    /* renamed from: g, reason: collision with root package name */
    private final transient Object[] f14637g;

    /* renamed from: h, reason: collision with root package name */
    private final transient int f14638h;

    /* renamed from: i, reason: collision with root package name */
    private final transient int f14639i;

    j5(Object[] objArr, int i2, int i3) {
        this.f14637g = objArr;
        this.f14638h = i2;
        this.f14639i = i3;
    }

    @Override // java.util.List, j$.util.List
    public final Object get(int i2) {
        q3.a(i2, this.f14639i);
        return this.f14637g[(i2 * 2) + this.f14638h];
    }

    @Override // e.c.b.b.c.e.n4
    final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public final int size() {
        return this.f14639i;
    }
}