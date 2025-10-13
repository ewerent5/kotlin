package i.v;

import ch.qos.logback.core.joran.action.Action;
import i.v.g;
import i.v.g.b;
import i.y.c.l;

/* compiled from: CoroutineContextImpl.kt */
/* loaded from: classes3.dex */
public abstract class b<B extends g.b, E extends B> implements g.c<E> {
    private final g.c<?> a;

    /* renamed from: b, reason: collision with root package name */
    private final l<g.b, E> f15846b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [i.v.g$c<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [i.y.c.l<? super i.v.g$b, ? extends E extends B>, i.y.c.l<i.v.g$b, E extends B>, java.lang.Object] */
    public b(g.c<B> cVar, l<? super g.b, ? extends E> lVar) {
        i.y.d.l.d(cVar, "baseKey");
        i.y.d.l.d(lVar, "safeCast");
        this.f15846b = lVar;
        this.a = cVar instanceof b ? (g.c<B>) ((b) cVar).a : cVar;
    }

    public final boolean a(g.c<?> cVar) {
        i.y.d.l.d(cVar, Action.KEY_ATTRIBUTE);
        return cVar == this || this.a == cVar;
    }

    /* JADX WARN: Incorrect return type in method signature: (Li/v/g$b;)TE; */
    public final g.b b(g.b bVar) {
        i.y.d.l.d(bVar, "element");
        return (g.b) this.f15846b.invoke(bVar);
    }
}