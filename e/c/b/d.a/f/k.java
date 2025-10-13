package e.c.b.d.a.f;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class k<ResultT> implements n<ResultT> {
    private final Executor a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f15377b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final b f15378c;

    public k(Executor executor, b bVar) {
        this.a = executor;
        this.f15378c = bVar;
    }

    @Override // e.c.b.d.a.f.n
    public final void a(e<ResultT> eVar) {
        if (eVar.g()) {
            return;
        }
        synchronized (this.f15377b) {
            if (this.f15378c == null) {
                return;
            }
            this.a.execute(new j(this, eVar));
        }
    }
}