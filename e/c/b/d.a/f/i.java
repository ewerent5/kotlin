package e.c.b.d.a.f;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class i<ResultT> implements n<ResultT> {
    private final Executor a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f15373b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final a<ResultT> f15374c;

    public i(Executor executor, a<ResultT> aVar) {
        this.a = executor;
        this.f15374c = aVar;
    }

    @Override // e.c.b.d.a.f.n
    public final void a(e<ResultT> eVar) {
        synchronized (this.f15373b) {
            if (this.f15374c == null) {
                return;
            }
            this.a.execute(new h(this, eVar));
        }
    }
}