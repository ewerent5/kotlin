package com.google.firebase.installations;

/* compiled from: GetAuthTokenListener.java */
/* loaded from: classes.dex */
class j implements n {
    private final o a;

    /* renamed from: b, reason: collision with root package name */
    private final e.c.b.b.e.i<l> f12807b;

    public j(o oVar, e.c.b.b.e.i<l> iVar) {
        this.a = oVar;
        this.f12807b = iVar;
    }

    @Override // com.google.firebase.installations.n
    public boolean a(Exception exc) {
        this.f12807b.d(exc);
        return true;
    }

    @Override // com.google.firebase.installations.n
    public boolean b(com.google.firebase.installations.p.d dVar) {
        if (!dVar.k() || this.a.f(dVar)) {
            return false;
        }
        this.f12807b.c(l.a().b(dVar.b()).d(dVar.c()).c(dVar.h()).a());
        return true;
    }
}