package kotlinx.coroutines;

/* compiled from: CancellableContinuation.kt */
/* loaded from: classes3.dex */
final class v0 extends i {

    /* renamed from: e, reason: collision with root package name */
    private final u0 f17159e;

    public v0(u0 u0Var) {
        this.f17159e = u0Var;
    }

    @Override // kotlinx.coroutines.j
    public void a(Throwable th) {
        this.f17159e.f();
    }

    @Override // i.y.c.l
    public /* bridge */ /* synthetic */ i.s invoke(Throwable th) {
        a(th);
        return i.s.a;
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f17159e + ']';
    }
}