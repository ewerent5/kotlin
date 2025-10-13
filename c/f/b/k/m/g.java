package c.f.b.k.m;

import c.f.b.k.m.f;

/* compiled from: DimensionDependency.java */
/* loaded from: classes.dex */
class g extends f {

    /* renamed from: m, reason: collision with root package name */
    public int f2920m;

    public g(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f2903e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f2903e = f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // c.f.b.k.m.f
    public void d(int i2) {
        if (this.f2908j) {
            return;
        }
        this.f2908j = true;
        this.f2905g = i2;
        for (d dVar : this.f2909k) {
            dVar.a(dVar);
        }
    }
}