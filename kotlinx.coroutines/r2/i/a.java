package kotlinx.coroutines.r2.i;

import i.v.g;
import i.y.c.p;

/* compiled from: SafeCollector.kt */
/* loaded from: classes3.dex */
public final class a implements g.b {

    /* renamed from: e, reason: collision with root package name */
    public static final C0229a f17082e = new C0229a(null);

    /* renamed from: f, reason: collision with root package name */
    private final g.c<?> f17083f = f17082e;

    /* renamed from: g, reason: collision with root package name */
    public final Throwable f17084g;

    /* compiled from: SafeCollector.kt */
    /* renamed from: kotlinx.coroutines.r2.i.a$a, reason: collision with other inner class name */
    public static final class C0229a implements g.c<a> {
        private C0229a() {
        }

        public /* synthetic */ C0229a(i.y.d.g gVar) {
            this();
        }
    }

    public a(Throwable th) {
        this.f17084g = th;
    }

    @Override // i.v.g
    public <R> R fold(R r, p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) g.b.a.a(this, r, pVar);
    }

    @Override // i.v.g.b, i.v.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    @Override // i.v.g.b
    public g.c<?> getKey() {
        return this.f17083f;
    }

    @Override // i.v.g
    public g minusKey(g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // i.v.g
    public g plus(g gVar) {
        return g.b.a.d(this, gVar);
    }
}