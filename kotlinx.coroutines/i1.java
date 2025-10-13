package kotlinx.coroutines;

/* compiled from: JobSupport.kt */
/* loaded from: classes3.dex */
public final class i1 implements j1 {

    /* renamed from: e, reason: collision with root package name */
    private final z1 f16949e;

    public i1(z1 z1Var) {
        this.f16949e = z1Var;
    }

    @Override // kotlinx.coroutines.j1
    public boolean b() {
        return false;
    }

    @Override // kotlinx.coroutines.j1
    public z1 e() {
        return this.f16949e;
    }

    public String toString() {
        return m0.c() ? e().z("New") : super.toString();
    }
}