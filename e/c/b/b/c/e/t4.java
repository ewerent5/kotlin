package e.c.b.b.c.e;

import java.util.List;

/* JADX INFO: Add missing generic type declarations: [E] */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class t4<E> extends r4<E> {

    /* renamed from: g, reason: collision with root package name */
    private final transient int f14854g;

    /* renamed from: h, reason: collision with root package name */
    private final transient int f14855h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ r4 f14856i;

    t4(r4 r4Var, int i2, int i3) {
        this.f14856i = r4Var;
        this.f14854g = i2;
        this.f14855h = i3;
    }

    @Override // e.c.b.b.c.e.n4
    final Object[] e() {
        return this.f14856i.e();
    }

    @Override // e.c.b.b.c.e.n4
    final int f() {
        return this.f14856i.f() + this.f14854g;
    }

    @Override // java.util.List, j$.util.List
    public final E get(int i2) {
        q3.a(i2, this.f14855h);
        return this.f14856i.get(i2 + this.f14854g);
    }

    @Override // e.c.b.b.c.e.n4
    final int h() {
        return this.f14856i.f() + this.f14854g + this.f14855h;
    }

    @Override // e.c.b.b.c.e.n4
    final boolean l() {
        return true;
    }

    @Override // e.c.b.b.c.e.r4
    /* renamed from: m */
    public final r4<E> subList(int i2, int i3) {
        q3.e(i2, i3, this.f14855h);
        r4 r4Var = this.f14856i;
        int i4 = this.f14854g;
        return (r4) r4Var.subList(i2 + i4, i3 + i4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public final int size() {
        return this.f14855h;
    }

    @Override // e.c.b.b.c.e.r4, java.util.List, j$.util.List
    public final /* synthetic */ List subList(int i2, int i3) {
        return subList(i2, i3);
    }
}