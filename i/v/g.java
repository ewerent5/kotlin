package i.v;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import i.v.e;
import i.y.c.p;
import i.y.d.l;
import i.y.d.m;

/* compiled from: CoroutineContext.kt */
/* loaded from: classes3.dex */
public interface g {

    /* compiled from: CoroutineContext.kt */
    public static final class a {

        /* compiled from: CoroutineContext.kt */
        /* renamed from: i.v.g$a$a, reason: collision with other inner class name */
        static final class C0200a extends m implements p<g, b, g> {

            /* renamed from: e, reason: collision with root package name */
            public static final C0200a f15851e = new C0200a();

            C0200a() {
                super(2);
            }

            @Override // i.y.c.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g i(g gVar, b bVar) {
                i.v.c cVar;
                l.d(gVar, "acc");
                l.d(bVar, "element");
                g gVarMinusKey = gVar.minusKey(bVar.getKey());
                h hVar = h.f15852e;
                if (gVarMinusKey == hVar) {
                    return bVar;
                }
                e.b bVar2 = e.f15850b;
                e eVar = (e) gVarMinusKey.get(bVar2);
                if (eVar == null) {
                    cVar = new i.v.c(gVarMinusKey, bVar);
                } else {
                    g gVarMinusKey2 = gVarMinusKey.minusKey(bVar2);
                    if (gVarMinusKey2 == hVar) {
                        return new i.v.c(bVar, eVar);
                    }
                    cVar = new i.v.c(new i.v.c(gVarMinusKey2, bVar), eVar);
                }
                return cVar;
            }
        }

        public static g a(g gVar, g gVar2) {
            l.d(gVar2, CoreConstants.CONTEXT_SCOPE_VALUE);
            return gVar2 == h.f15852e ? gVar : (g) gVar2.fold(gVar, C0200a.f15851e);
        }
    }

    /* compiled from: CoroutineContext.kt */
    public interface b extends g {

        /* compiled from: CoroutineContext.kt */
        public static final class a {
            public static <R> R a(b bVar, R r, p<? super R, ? super b, ? extends R> pVar) {
                l.d(pVar, "operation");
                return pVar.i(r, bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends b> E b(b bVar, c<E> cVar) {
                l.d(cVar, Action.KEY_ATTRIBUTE);
                if (l.a(bVar.getKey(), cVar)) {
                    return bVar;
                }
                return null;
            }

            public static g c(b bVar, c<?> cVar) {
                l.d(cVar, Action.KEY_ATTRIBUTE);
                return l.a(bVar.getKey(), cVar) ? h.f15852e : bVar;
            }

            public static g d(b bVar, g gVar) {
                l.d(gVar, CoreConstants.CONTEXT_SCOPE_VALUE);
                return a.a(bVar, gVar);
            }
        }

        @Override // i.v.g
        <E extends b> E get(c<E> cVar);

        c<?> getKey();
    }

    /* compiled from: CoroutineContext.kt */
    public interface c<E extends b> {
    }

    <R> R fold(R r, p<? super R, ? super b, ? extends R> pVar);

    <E extends b> E get(c<E> cVar);

    g minusKey(c<?> cVar);

    g plus(g gVar);
}