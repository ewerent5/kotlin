package kotlinx.coroutines.q2;

import i.m;
import kotlinx.coroutines.internal.m;
import kotlinx.coroutines.internal.w;
import kotlinx.coroutines.internal.x;
import kotlinx.coroutines.k;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.n0;

/* compiled from: AbstractChannel.kt */
/* loaded from: classes3.dex */
public abstract class a<E> extends kotlinx.coroutines.q2.c<E> implements g<E> {

    /* compiled from: AbstractChannel.kt */
    /* renamed from: kotlinx.coroutines.q2.a$a, reason: collision with other inner class name */
    private static final class C0226a<E> implements h<E> {
        private Object a = kotlinx.coroutines.q2.b.f17041d;

        /* renamed from: b, reason: collision with root package name */
        public final a<E> f17032b;

        public C0226a(a<E> aVar) {
            this.f17032b = aVar;
        }

        private final boolean b(Object obj) throws Throwable {
            if (!(obj instanceof j)) {
                return true;
            }
            j jVar = (j) obj;
            if (jVar.f17057h == null) {
                return false;
            }
            throw w.k(jVar.F());
        }

        @Override // kotlinx.coroutines.q2.h
        public Object a(i.v.d<? super Boolean> dVar) {
            Object obj = this.a;
            x xVar = kotlinx.coroutines.q2.b.f17041d;
            if (obj != xVar) {
                return i.v.j.a.b.a(b(obj));
            }
            Object objU = this.f17032b.u();
            this.a = objU;
            return objU != xVar ? i.v.j.a.b.a(b(objU)) : c(dVar);
        }

        final /* synthetic */ Object c(i.v.d<? super Boolean> dVar) throws Throwable {
            kotlinx.coroutines.l lVarB = kotlinx.coroutines.n.b(i.v.i.c.b(dVar));
            b bVar = new b(this, lVarB);
            while (true) {
                if (this.f17032b.o(bVar)) {
                    this.f17032b.v(lVarB, bVar);
                    break;
                }
                Object objU = this.f17032b.u();
                d(objU);
                if (objU instanceof j) {
                    j jVar = (j) objU;
                    if (jVar.f17057h == null) {
                        Boolean boolA = i.v.j.a.b.a(false);
                        m.a aVar = i.m.f15825e;
                        lVarB.e(i.m.a(boolA));
                    } else {
                        Throwable thF = jVar.F();
                        m.a aVar2 = i.m.f15825e;
                        lVarB.e(i.m.a(i.n.a(thF)));
                    }
                } else if (objU != kotlinx.coroutines.q2.b.f17041d) {
                    Boolean boolA2 = i.v.j.a.b.a(true);
                    i.y.c.l<E, i.s> lVar = this.f17032b.f17045c;
                    lVarB.l(boolA2, lVar != null ? kotlinx.coroutines.internal.s.a(lVar, objU, lVarB.getContext()) : null);
                }
            }
            Object objB = lVarB.B();
            if (objB == i.v.i.d.c()) {
                i.v.j.a.h.c(dVar);
            }
            return objB;
        }

        public final void d(Object obj) {
            this.a = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.coroutines.q2.h
        public E next() throws Throwable {
            E e2 = (E) this.a;
            if (e2 instanceof j) {
                throw w.k(((j) e2).F());
            }
            x xVar = kotlinx.coroutines.q2.b.f17041d;
            if (e2 == xVar) {
                throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
            }
            this.a = xVar;
            return e2;
        }
    }

    /* compiled from: AbstractChannel.kt */
    private static class b<E> extends o<E> {

        /* renamed from: h, reason: collision with root package name */
        public final C0226a<E> f17033h;

        /* renamed from: i, reason: collision with root package name */
        public final kotlinx.coroutines.k<Boolean> f17034i;

        /* JADX WARN: Multi-variable type inference failed */
        public b(C0226a<E> c0226a, kotlinx.coroutines.k<? super Boolean> kVar) {
            this.f17033h = c0226a;
            this.f17034i = kVar;
        }

        @Override // kotlinx.coroutines.q2.o
        public void A(j<?> jVar) {
            Object objA = jVar.f17057h == null ? k.a.a(this.f17034i, Boolean.FALSE, null, 2, null) : this.f17034i.j(jVar.F());
            if (objA != null) {
                this.f17033h.d(jVar);
                this.f17034i.n(objA);
            }
        }

        public i.y.c.l<Throwable, i.s> B(E e2) {
            i.y.c.l<E, i.s> lVar = this.f17033h.f17032b.f17045c;
            if (lVar != null) {
                return kotlinx.coroutines.internal.s.a(lVar, e2, this.f17034i.getContext());
            }
            return null;
        }

        @Override // kotlinx.coroutines.q2.q
        public void g(E e2) {
            this.f17033h.d(e2);
            this.f17034i.n(kotlinx.coroutines.m.a);
        }

        @Override // kotlinx.coroutines.q2.q
        public x h(E e2, m.b bVar) {
            kotlinx.coroutines.k<Boolean> kVar = this.f17034i;
            Boolean bool = Boolean.TRUE;
            if (bVar != null) {
                throw null;
            }
            Object objK = kVar.k(bool, null, B(e2));
            if (objK == null) {
                return null;
            }
            if (m0.a()) {
                if (!(objK == kotlinx.coroutines.m.a)) {
                    throw new AssertionError();
                }
            }
            if (bVar == null) {
                return kotlinx.coroutines.m.a;
            }
            throw null;
        }

        @Override // kotlinx.coroutines.internal.m
        public String toString() {
            return "ReceiveHasNext@" + n0.b(this);
        }
    }

    /* compiled from: AbstractChannel.kt */
    private final class c extends kotlinx.coroutines.c {

        /* renamed from: e, reason: collision with root package name */
        private final o<?> f17035e;

        public c(o<?> oVar) {
            this.f17035e = oVar;
        }

        @Override // kotlinx.coroutines.j
        public void a(Throwable th) {
            if (this.f17035e.v()) {
                a.this.s();
            }
        }

        @Override // i.y.c.l
        public /* bridge */ /* synthetic */ i.s invoke(Throwable th) {
            a(th);
            return i.s.a;
        }

        public String toString() {
            return "RemoveReceiveOnCancel[" + this.f17035e + ']';
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    public static final class d extends m.a {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.internal.m f17037d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ a f17038e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(kotlinx.coroutines.internal.m mVar, kotlinx.coroutines.internal.m mVar2, a aVar) {
            super(mVar2);
            this.f17037d = mVar;
            this.f17038e = aVar;
        }

        @Override // kotlinx.coroutines.internal.c
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Object g(kotlinx.coroutines.internal.m mVar) {
            if (this.f17038e.r()) {
                return null;
            }
            return kotlinx.coroutines.internal.l.a();
        }
    }

    public a(i.y.c.l<? super E, i.s> lVar) {
        super(lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean o(o<? super E> oVar) {
        boolean zP = p(oVar);
        if (zP) {
            t();
        }
        return zP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(kotlinx.coroutines.k<?> kVar, o<?> oVar) {
        kVar.f(new c(oVar));
    }

    @Override // kotlinx.coroutines.q2.p
    public final h<E> iterator() {
        return new C0226a(this);
    }

    @Override // kotlinx.coroutines.q2.c
    protected q<E> k() {
        q<E> qVarK = super.k();
        if (qVarK != null && !(qVarK instanceof j)) {
            s();
        }
        return qVarK;
    }

    protected boolean p(o<? super E> oVar) {
        int iY;
        kotlinx.coroutines.internal.m mVarR;
        if (!q()) {
            kotlinx.coroutines.internal.m mVarD = d();
            d dVar = new d(oVar, oVar, this);
            do {
                kotlinx.coroutines.internal.m mVarR2 = mVarD.r();
                if (!(!(mVarR2 instanceof s))) {
                    return false;
                }
                iY = mVarR2.y(oVar, mVarD, dVar);
                if (iY != 1) {
                }
            } while (iY != 2);
            return false;
        }
        kotlinx.coroutines.internal.m mVarD2 = d();
        do {
            mVarR = mVarD2.r();
            if (!(!(mVarR instanceof s))) {
                return false;
            }
        } while (!mVarR.k(oVar, mVarD2));
        return true;
    }

    protected abstract boolean q();

    protected abstract boolean r();

    protected void s() {
    }

    protected void t() {
    }

    protected Object u() {
        while (true) {
            s sVarL = l();
            if (sVarL == null) {
                return kotlinx.coroutines.q2.b.f17041d;
            }
            x xVarB = sVarL.B(null);
            if (xVarB != null) {
                if (m0.a()) {
                    if (!(xVarB == kotlinx.coroutines.m.a)) {
                        throw new AssertionError();
                    }
                }
                sVarL.z();
                return sVarL.A();
            }
            sVarL.C();
        }
    }
}