package i.v;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import i.v.g;
import i.y.c.p;
import i.y.d.l;
import java.io.Serializable;

/* compiled from: CoroutineContextImpl.kt */
/* loaded from: classes3.dex */
public final class h implements g, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final h f15852e = new h();

    private h() {
    }

    @Override // i.v.g
    public <R> R fold(R r, p<? super R, ? super g.b, ? extends R> pVar) {
        l.d(pVar, "operation");
        return r;
    }

    @Override // i.v.g
    public <E extends g.b> E get(g.c<E> cVar) {
        l.d(cVar, Action.KEY_ATTRIBUTE);
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // i.v.g
    public g minusKey(g.c<?> cVar) {
        l.d(cVar, Action.KEY_ATTRIBUTE);
        return this;
    }

    @Override // i.v.g
    public g plus(g gVar) {
        l.d(gVar, CoreConstants.CONTEXT_SCOPE_VALUE);
        return gVar;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}