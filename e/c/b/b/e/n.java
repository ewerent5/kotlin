package e.c.b.b.e;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@17.0.2 */
/* loaded from: classes.dex */
final class n<TResult, TContinuationResult> implements b, d, e<TContinuationResult>, a0<TResult> {
    private final Executor a;

    /* renamed from: b, reason: collision with root package name */
    private final a<TResult, h<TContinuationResult>> f15030b;

    /* renamed from: c, reason: collision with root package name */
    private final d0<TContinuationResult> f15031c;

    public n(Executor executor, a<TResult, h<TContinuationResult>> aVar, d0<TContinuationResult> d0Var) {
        this.a = executor;
        this.f15030b = aVar;
        this.f15031c = d0Var;
    }

    @Override // e.c.b.b.e.d
    public final void a(Exception exc) {
        this.f15031c.q(exc);
    }

    @Override // e.c.b.b.e.a0
    public final void b(h<TResult> hVar) {
        this.a.execute(new q(this, hVar));
    }

    @Override // e.c.b.b.e.b
    public final void c() {
        this.f15031c.s();
    }

    @Override // e.c.b.b.e.e
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f15031c.r(tcontinuationresult);
    }
}