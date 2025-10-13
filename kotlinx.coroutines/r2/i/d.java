package kotlinx.coroutines.r2.i;

import i.d0.i;
import i.s;
import i.v.g;
import i.v.h;
import i.y.c.p;
import i.y.c.q;
import i.y.d.m;
import java.util.Objects;
import kotlinx.coroutines.s1;

/* compiled from: SafeCollector.kt */
/* loaded from: classes3.dex */
public final class d<T> extends i.v.j.a.d implements kotlinx.coroutines.r2.d<T>, i.v.j.a.e {

    /* renamed from: h, reason: collision with root package name */
    public final int f17089h;

    /* renamed from: i, reason: collision with root package name */
    private g f17090i;

    /* renamed from: j, reason: collision with root package name */
    private i.v.d<? super s> f17091j;

    /* renamed from: k, reason: collision with root package name */
    public final kotlinx.coroutines.r2.d<T> f17092k;

    /* renamed from: l, reason: collision with root package name */
    public final g f17093l;

    /* compiled from: SafeCollector.kt */
    static final class a extends m implements p<Integer, g.b, Integer> {

        /* renamed from: e, reason: collision with root package name */
        public static final a f17094e = new a();

        a() {
            super(2);
        }

        public final int a(int i2, g.b bVar) {
            return i2 + 1;
        }

        @Override // i.y.c.p
        public /* bridge */ /* synthetic */ Integer i(Integer num, g.b bVar) {
            return Integer.valueOf(a(num.intValue(), bVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(kotlinx.coroutines.r2.d<? super T> dVar, g gVar) {
        super(b.f17086f, h.f15852e);
        this.f17092k = dVar;
        this.f17093l = gVar;
        this.f17089h = ((Number) gVar.fold(0, a.f17094e)).intValue();
    }

    private final void s(g gVar, g gVar2, T t) {
        if (gVar2 instanceof kotlinx.coroutines.r2.i.a) {
            u((kotlinx.coroutines.r2.i.a) gVar2, t);
        }
        f.a(this, gVar);
        this.f17090i = gVar;
    }

    private final Object t(i.v.d<? super s> dVar, T t) {
        g context = dVar.getContext();
        s1.e(context);
        g gVar = this.f17090i;
        if (gVar != context) {
            s(context, gVar, t);
        }
        this.f17091j = dVar;
        q qVar = e.a;
        kotlinx.coroutines.r2.d<T> dVar2 = this.f17092k;
        Objects.requireNonNull(dVar2, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        return qVar.d(dVar2, t, this);
    }

    private final void u(kotlinx.coroutines.r2.i.a aVar, Object obj) {
        throw new IllegalStateException(i.f("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + aVar.f17084g + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // kotlinx.coroutines.r2.d
    public Object b(T t, i.v.d<? super s> dVar) {
        try {
            Object objT = t(dVar, t);
            if (objT == i.v.i.d.c()) {
                i.v.j.a.h.c(dVar);
            }
            return objT == i.v.i.d.c() ? objT : s.a;
        } catch (Throwable th) {
            this.f17090i = new kotlinx.coroutines.r2.i.a(th);
            throw th;
        }
    }

    @Override // i.v.j.a.a, i.v.j.a.e
    public i.v.j.a.e c() {
        i.v.d<? super s> dVar = this.f17091j;
        if (!(dVar instanceof i.v.j.a.e)) {
            dVar = null;
        }
        return (i.v.j.a.e) dVar;
    }

    @Override // i.v.j.a.d, i.v.d
    public g getContext() {
        g context;
        i.v.d<? super s> dVar = this.f17091j;
        return (dVar == null || (context = dVar.getContext()) == null) ? h.f15852e : context;
    }

    @Override // i.v.j.a.a, i.v.j.a.e
    public StackTraceElement h() {
        return null;
    }

    @Override // i.v.j.a.a
    public Object p(Object obj) {
        Throwable thB = i.m.b(obj);
        if (thB != null) {
            this.f17090i = new kotlinx.coroutines.r2.i.a(thB);
        }
        i.v.d<? super s> dVar = this.f17091j;
        if (dVar != null) {
            dVar.e(obj);
        }
        return i.v.i.d.c();
    }

    @Override // i.v.j.a.d, i.v.j.a.a
    public void q() {
        super.q();
    }
}