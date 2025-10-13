package e.c.b.b.e;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@17.0.2 */
/* loaded from: classes.dex */
final class m<TResult, TContinuationResult> implements a0<TResult> {
    private final Executor a;

    /* renamed from: b, reason: collision with root package name */
    private final a<TResult, TContinuationResult> f15028b;

    /* renamed from: c, reason: collision with root package name */
    private final d0<TContinuationResult> f15029c;

    public m(Executor executor, a<TResult, TContinuationResult> aVar, d0<TContinuationResult> d0Var) {
        this.a = executor;
        this.f15028b = aVar;
        this.f15029c = d0Var;
    }

    @Override // e.c.b.b.e.a0
    public final void b(h<TResult> hVar) {
        this.a.execute(new o(this, hVar));
    }
}