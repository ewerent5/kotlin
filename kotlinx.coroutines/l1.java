package kotlinx.coroutines;

/* compiled from: CancellableContinuationImpl.kt */
/* loaded from: classes3.dex */
final class l1 extends i {

    /* renamed from: e, reason: collision with root package name */
    private final i.y.c.l<Throwable, i.s> f17014e;

    /* JADX WARN: Multi-variable type inference failed */
    public l1(i.y.c.l<? super Throwable, i.s> lVar) {
        this.f17014e = lVar;
    }

    @Override // kotlinx.coroutines.j
    public void a(Throwable th) {
        this.f17014e.invoke(th);
    }

    @Override // i.y.c.l
    public /* bridge */ /* synthetic */ i.s invoke(Throwable th) {
        a(th);
        return i.s.a;
    }

    public String toString() {
        return "InvokeOnCancel[" + n0.a(this.f17014e) + '@' + n0.b(this) + ']';
    }
}