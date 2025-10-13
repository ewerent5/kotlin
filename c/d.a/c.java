package c.d.a;

import android.content.res.ColorStateList;

/* compiled from: CardViewApi21Impl.java */
/* loaded from: classes.dex */
class c implements f {
    c() {
    }

    private g n(e eVar) {
        return (g) eVar.e();
    }

    @Override // c.d.a.f
    public void a(e eVar, float f2) {
        n(eVar).h(f2);
    }

    @Override // c.d.a.f
    public float b(e eVar) {
        return eVar.f().getElevation();
    }

    @Override // c.d.a.f
    public float c(e eVar) {
        return n(eVar).d();
    }

    @Override // c.d.a.f
    public void d(e eVar) {
        m(eVar, f(eVar));
    }

    @Override // c.d.a.f
    public void e(e eVar, float f2) {
        eVar.f().setElevation(f2);
    }

    @Override // c.d.a.f
    public float f(e eVar) {
        return n(eVar).c();
    }

    @Override // c.d.a.f
    public ColorStateList g(e eVar) {
        return n(eVar).b();
    }

    @Override // c.d.a.f
    public void h() {
    }

    @Override // c.d.a.f
    public float i(e eVar) {
        return c(eVar) * 2.0f;
    }

    @Override // c.d.a.f
    public float j(e eVar) {
        return c(eVar) * 2.0f;
    }

    @Override // c.d.a.f
    public void k(e eVar) {
        m(eVar, f(eVar));
    }

    @Override // c.d.a.f
    public void l(e eVar, ColorStateList colorStateList) {
        n(eVar).f(colorStateList);
    }

    @Override // c.d.a.f
    public void m(e eVar, float f2) {
        n(eVar).g(f2, eVar.d(), eVar.c());
        o(eVar);
    }

    public void o(e eVar) {
        if (!eVar.d()) {
            eVar.a(0, 0, 0, 0);
            return;
        }
        float f2 = f(eVar);
        float fC = c(eVar);
        int iCeil = (int) Math.ceil(h.c(f2, fC, eVar.c()));
        int iCeil2 = (int) Math.ceil(h.d(f2, fC, eVar.c()));
        eVar.a(iCeil, iCeil2, iCeil, iCeil2);
    }
}