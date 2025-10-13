package j$.time.n;

import j$.time.o.l;
import j$.time.o.m;
import j$.time.o.n;
import j$.time.o.q;

/* loaded from: classes2.dex */
class e implements j$.time.o.k {
    final /* synthetic */ j$.time.m.b a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j$.time.o.k f15961b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ j$.time.m.h f15962c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ j$.time.j f15963d;

    e(j$.time.m.b bVar, j$.time.o.k kVar, j$.time.m.h hVar, j$.time.j jVar) {
        this.a = bVar;
        this.f15961b = kVar;
        this.f15962c = hVar;
        this.f15963d = jVar;
    }

    @Override // j$.time.o.k
    public boolean d(l lVar) {
        return (this.a == null || !lVar.v()) ? this.f15961b.d(lVar) : this.a.d(lVar);
    }

    @Override // j$.time.o.k
    public /* synthetic */ int h(l lVar) {
        return j$.time.a.f(this, lVar);
    }

    @Override // j$.time.o.k
    public q j(l lVar) {
        return ((this.a == null || !lVar.v()) ? this.f15961b : this.a).j(lVar);
    }

    @Override // j$.time.o.k
    public long l(l lVar) {
        return ((this.a == null || !lVar.v()) ? this.f15961b : this.a).l(lVar);
    }

    @Override // j$.time.o.k
    public Object n(n nVar) {
        int i2 = m.a;
        return nVar == j$.time.o.b.a ? this.f15962c : nVar == j$.time.o.d.a ? this.f15963d : nVar == j$.time.o.e.a ? this.f15961b.n(nVar) : nVar.a(this);
    }
}