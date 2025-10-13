package e.c.b.d.a.f;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class m<ResultT> implements n<ResultT> {
    private final Executor a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f15381b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final c<? super ResultT> f15382c;

    public m(Executor executor, c<? super ResultT> cVar) {
        this.a = executor;
        this.f15382c = cVar;
    }

    @Override // e.c.b.d.a.f.n
    public final void a(e<ResultT> eVar) {
        if (eVar.g()) {
            synchronized (this.f15381b) {
                if (this.f15382c == null) {
                    return;
                }
                this.a.execute(new l(this, eVar));
            }
        }
    }
}