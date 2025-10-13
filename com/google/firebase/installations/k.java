package com.google.firebase.installations;

/* compiled from: GetIdListener.java */
/* loaded from: classes.dex */
class k implements n {
    final e.c.b.b.e.i<String> a;

    public k(e.c.b.b.e.i<String> iVar) {
        this.a = iVar;
    }

    @Override // com.google.firebase.installations.n
    public boolean a(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.n
    public boolean b(com.google.firebase.installations.p.d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.a.e(dVar.d());
        return true;
    }
}