package i.v;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import i.v.g;
import i.y.c.p;
import i.y.d.l;

/* compiled from: CoroutineContextImpl.kt */
/* loaded from: classes3.dex */
public abstract class a implements g.b {
    private final g.c<?> key;

    public a(g.c<?> cVar) {
        l.d(cVar, Action.KEY_ATTRIBUTE);
        this.key = cVar;
    }

    @Override // i.v.g
    public <R> R fold(R r, p<? super R, ? super g.b, ? extends R> pVar) {
        l.d(pVar, "operation");
        return (R) g.b.a.a(this, r, pVar);
    }

    @Override // i.v.g.b, i.v.g
    public <E extends g.b> E get(g.c<E> cVar) {
        l.d(cVar, Action.KEY_ATTRIBUTE);
        return (E) g.b.a.b(this, cVar);
    }

    @Override // i.v.g.b
    public g.c<?> getKey() {
        return this.key;
    }

    @Override // i.v.g
    public g minusKey(g.c<?> cVar) {
        l.d(cVar, Action.KEY_ATTRIBUTE);
        return g.b.a.c(this, cVar);
    }

    @Override // i.v.g
    public g plus(g gVar) {
        l.d(gVar, CoreConstants.CONTEXT_SCOPE_VALUE);
        return g.b.a.d(this, gVar);
    }
}