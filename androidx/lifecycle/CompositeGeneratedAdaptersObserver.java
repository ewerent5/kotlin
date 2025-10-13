package androidx.lifecycle;

import androidx.lifecycle.g;

/* loaded from: classes.dex */
class CompositeGeneratedAdaptersObserver implements i {

    /* renamed from: e, reason: collision with root package name */
    private final f[] f1169e;

    CompositeGeneratedAdaptersObserver(f[] fVarArr) {
        this.f1169e = fVarArr;
    }

    @Override // androidx.lifecycle.i
    public void c(k kVar, g.b bVar) {
        p pVar = new p();
        for (f fVar : this.f1169e) {
            fVar.a(kVar, bVar, false, pVar);
        }
        for (f fVar2 : this.f1169e) {
            fVar2.a(kVar, bVar, true, pVar);
        }
    }
}