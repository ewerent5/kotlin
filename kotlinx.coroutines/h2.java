package kotlinx.coroutines;

import i.v.g;

/* compiled from: ThreadContextElement.kt */
/* loaded from: classes3.dex */
public interface h2<S> extends g.b {

    /* compiled from: ThreadContextElement.kt */
    public static final class a {
        public static <S, R> R a(h2<S> h2Var, R r, i.y.c.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) g.b.a.a(h2Var, r, pVar);
        }

        public static <S, E extends g.b> E b(h2<S> h2Var, g.c<E> cVar) {
            return (E) g.b.a.b(h2Var, cVar);
        }

        public static <S> i.v.g c(h2<S> h2Var, g.c<?> cVar) {
            return g.b.a.c(h2Var, cVar);
        }

        public static <S> i.v.g d(h2<S> h2Var, i.v.g gVar) {
            return g.b.a.d(h2Var, gVar);
        }
    }

    void C(i.v.g gVar, S s);

    S T(i.v.g gVar);
}