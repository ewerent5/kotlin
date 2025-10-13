package i.v;

import ch.qos.logback.core.joran.action.Action;
import i.v.g;
import i.y.d.l;
import java.util.Objects;

/* compiled from: ContinuationInterceptor.kt */
/* loaded from: classes3.dex */
public interface e extends g.b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f15850b = b.a;

    /* compiled from: ContinuationInterceptor.kt */
    public static final class a {
        public static <E extends g.b> E a(e eVar, g.c<E> cVar) {
            l.d(cVar, Action.KEY_ATTRIBUTE);
            if (!(cVar instanceof i.v.b)) {
                if (e.f15850b != cVar) {
                    return null;
                }
                Objects.requireNonNull(eVar, "null cannot be cast to non-null type E");
                return eVar;
            }
            i.v.b bVar = (i.v.b) cVar;
            if (!bVar.a(eVar.getKey())) {
                return null;
            }
            E e2 = (E) bVar.b(eVar);
            if (e2 instanceof g.b) {
                return e2;
            }
            return null;
        }

        public static g b(e eVar, g.c<?> cVar) {
            l.d(cVar, Action.KEY_ATTRIBUTE);
            if (!(cVar instanceof i.v.b)) {
                return e.f15850b == cVar ? h.f15852e : eVar;
            }
            i.v.b bVar = (i.v.b) cVar;
            return (!bVar.a(eVar.getKey()) || bVar.b(eVar) == null) ? eVar : h.f15852e;
        }
    }

    /* compiled from: ContinuationInterceptor.kt */
    public static final class b implements g.c<e> {
        static final /* synthetic */ b a = new b();

        private b() {
        }
    }

    void d(d<?> dVar);

    <T> d<T> g(d<? super T> dVar);
}