package androidx.room;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import i.v.g;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.o1;

/* compiled from: RoomDatabase.kt */
/* loaded from: classes.dex */
public final class z0 implements g.b {

    /* renamed from: e, reason: collision with root package name */
    public static final a f2032e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private final AtomicInteger f2033f;

    /* renamed from: g, reason: collision with root package name */
    private final o1 f2034g;

    /* renamed from: h, reason: collision with root package name */
    private final i.v.e f2035h;

    /* compiled from: RoomDatabase.kt */
    public static final class a implements g.c<z0> {
        private a() {
        }

        public /* synthetic */ a(i.y.d.g gVar) {
            this();
        }
    }

    public z0(o1 o1Var, i.v.e eVar) {
        i.y.d.l.d(o1Var, "transactionThreadControlJob");
        i.y.d.l.d(eVar, "transactionDispatcher");
        this.f2034g = o1Var;
        this.f2035h = eVar;
        this.f2033f = new AtomicInteger(0);
    }

    public final void a() {
        this.f2033f.incrementAndGet();
    }

    public final i.v.e c() {
        return this.f2035h;
    }

    public final void e() {
        int iDecrementAndGet = this.f2033f.decrementAndGet();
        if (iDecrementAndGet < 0) {
            throw new IllegalStateException("Transaction was never started or was already released.");
        }
        if (iDecrementAndGet == 0) {
            o1.a.a(this.f2034g, null, 1, null);
        }
    }

    @Override // i.v.g
    public <R> R fold(R r, i.y.c.p<? super R, ? super g.b, ? extends R> pVar) {
        i.y.d.l.d(pVar, "operation");
        return (R) g.b.a.a(this, r, pVar);
    }

    @Override // i.v.g.b, i.v.g
    public <E extends g.b> E get(g.c<E> cVar) {
        i.y.d.l.d(cVar, Action.KEY_ATTRIBUTE);
        return (E) g.b.a.b(this, cVar);
    }

    @Override // i.v.g.b
    public g.c<z0> getKey() {
        return f2032e;
    }

    @Override // i.v.g
    public i.v.g minusKey(g.c<?> cVar) {
        i.y.d.l.d(cVar, Action.KEY_ATTRIBUTE);
        return g.b.a.c(this, cVar);
    }

    @Override // i.v.g
    public i.v.g plus(i.v.g gVar) {
        i.y.d.l.d(gVar, CoreConstants.CONTEXT_SCOPE_VALUE);
        return g.b.a.d(this, gVar);
    }
}