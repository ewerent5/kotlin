package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: JobSupport.kt */
/* loaded from: classes3.dex */
final class m1 extends q1<o1> {

    /* renamed from: i, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f17018i = AtomicIntegerFieldUpdater.newUpdater(m1.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: j, reason: collision with root package name */
    private final i.y.c.l<Throwable, i.s> f17019j;

    /* JADX WARN: Multi-variable type inference failed */
    public m1(o1 o1Var, i.y.c.l<? super Throwable, i.s> lVar) {
        super(o1Var);
        this.f17019j = lVar;
        this._invoked = 0;
    }

    @Override // i.y.c.l
    public /* bridge */ /* synthetic */ i.s invoke(Throwable th) {
        z(th);
        return i.s.a;
    }

    @Override // kotlinx.coroutines.y
    public void z(Throwable th) {
        if (f17018i.compareAndSet(this, 0, 1)) {
            this.f17019j.invoke(th);
        }
    }
}