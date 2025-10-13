package kotlinx.coroutines;

import i.v.e;
import i.v.g;
import java.util.Objects;

/* compiled from: CoroutineDispatcher.kt */
/* loaded from: classes3.dex */
public abstract class d0 extends i.v.a implements i.v.e {

    /* renamed from: e, reason: collision with root package name */
    public static final a f16936e = new a(null);

    /* compiled from: CoroutineDispatcher.kt */
    public static final class a extends i.v.b<i.v.e, d0> {

        /* compiled from: CoroutineDispatcher.kt */
        /* renamed from: kotlinx.coroutines.d0$a$a, reason: collision with other inner class name */
        static final class C0223a extends i.y.d.m implements i.y.c.l<g.b, d0> {

            /* renamed from: e, reason: collision with root package name */
            public static final C0223a f16937e = new C0223a();

            C0223a() {
                super(1);
            }

            @Override // i.y.c.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d0 invoke(g.b bVar) {
                if (!(bVar instanceof d0)) {
                    bVar = null;
                }
                return (d0) bVar;
            }
        }

        public /* synthetic */ a(i.y.d.g gVar) {
            this();
        }

        private a() {
            super(i.v.e.f15850b, C0223a.f16937e);
        }
    }

    public d0() {
        super(i.v.e.f15850b);
    }

    public abstract void Z(i.v.g gVar, Runnable runnable);

    public boolean a0(i.v.g gVar) {
        return true;
    }

    @Override // i.v.e
    public void d(i.v.d<?> dVar) {
        Objects.requireNonNull(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        l<?> lVarS = ((kotlinx.coroutines.internal.e) dVar).s();
        if (lVarS != null) {
            lVarS.w();
        }
    }

    @Override // i.v.e
    public final <T> i.v.d<T> g(i.v.d<? super T> dVar) {
        return new kotlinx.coroutines.internal.e(this, dVar);
    }

    @Override // i.v.a, i.v.g.b, i.v.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) e.a.a(this, cVar);
    }

    @Override // i.v.a, i.v.g
    public i.v.g minusKey(g.c<?> cVar) {
        return e.a.b(this, cVar);
    }

    public String toString() {
        return n0.a(this) + '@' + n0.b(this);
    }
}