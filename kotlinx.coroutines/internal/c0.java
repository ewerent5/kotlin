package kotlinx.coroutines.internal;

import ch.qos.logback.core.CoreConstants;
import i.v.g;
import kotlinx.coroutines.h2;

/* compiled from: ThreadContext.kt */
/* loaded from: classes3.dex */
public final class c0<T> implements h2<T> {

    /* renamed from: e, reason: collision with root package name */
    private final g.c<?> f16961e;

    /* renamed from: f, reason: collision with root package name */
    private final T f16962f;

    /* renamed from: g, reason: collision with root package name */
    private final ThreadLocal<T> f16963g;

    public c0(T t, ThreadLocal<T> threadLocal) {
        this.f16962f = t;
        this.f16963g = threadLocal;
        this.f16961e = new d0(threadLocal);
    }

    @Override // kotlinx.coroutines.h2
    public void C(i.v.g gVar, T t) {
        this.f16963g.set(t);
    }

    @Override // kotlinx.coroutines.h2
    public T T(i.v.g gVar) {
        T t = this.f16963g.get();
        this.f16963g.set(this.f16962f);
        return t;
    }

    @Override // i.v.g
    public <R> R fold(R r, i.y.c.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) h2.a.a(this, r, pVar);
    }

    @Override // i.v.g.b, i.v.g
    public <E extends g.b> E get(g.c<E> cVar) {
        if (i.y.d.l.a(getKey(), cVar)) {
            return this;
        }
        return null;
    }

    @Override // i.v.g.b
    public g.c<?> getKey() {
        return this.f16961e;
    }

    @Override // i.v.g
    public i.v.g minusKey(g.c<?> cVar) {
        return i.y.d.l.a(getKey(), cVar) ? i.v.h.f15852e : this;
    }

    @Override // i.v.g
    public i.v.g plus(i.v.g gVar) {
        return h2.a.d(this, gVar);
    }

    public String toString() {
        return "ThreadLocal(value=" + this.f16962f + ", threadLocal = " + this.f16963g + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}