package com.google.firebase.components;

/* compiled from: ComponentRuntime.java */
/* loaded from: classes.dex */
final /* synthetic */ class i implements com.google.firebase.n.a {
    private final l a;

    /* renamed from: b, reason: collision with root package name */
    private final d f12285b;

    private i(l lVar, d dVar) {
        this.a = lVar;
        this.f12285b = dVar;
    }

    public static com.google.firebase.n.a a(l lVar, d dVar) {
        return new i(lVar, dVar);
    }

    @Override // com.google.firebase.n.a
    public Object get() {
        l lVar = this.a;
        d dVar = this.f12285b;
        return dVar.d().a(new v(dVar, lVar));
    }
}