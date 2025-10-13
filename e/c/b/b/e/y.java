package e.c.b.b.e;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@17.0.2 */
/* loaded from: classes.dex */
final class y<TResult, TContinuationResult> implements b, d, e<TContinuationResult>, a0<TResult> {
    private final Executor a;

    /* renamed from: b, reason: collision with root package name */
    private final g<TResult, TContinuationResult> f15051b;

    /* renamed from: c, reason: collision with root package name */
    private final d0<TContinuationResult> f15052c;

    public y(Executor executor, g<TResult, TContinuationResult> gVar, d0<TContinuationResult> d0Var) {
        this.a = executor;
        this.f15051b = gVar;
        this.f15052c = d0Var;
    }

    @Override // e.c.b.b.e.d
    public final void a(Exception exc) {
        this.f15052c.q(exc);
    }

    @Override // e.c.b.b.e.a0
    public final void b(h<TResult> hVar) {
        this.a.execute(new z(this, hVar));
    }

    @Override // e.c.b.b.e.b
    public final void c() {
        this.f15052c.s();
    }

    @Override // e.c.b.b.e.e
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f15052c.r(tcontinuationresult);
    }
}