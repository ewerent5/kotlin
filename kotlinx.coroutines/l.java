package kotlinx.coroutines;

import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.o1;

/* compiled from: CancellableContinuationImpl.kt */
/* loaded from: classes3.dex */
public class l<T> extends q0<T> implements k<T>, i.v.j.a.e {

    /* renamed from: h, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f17010h = AtomicIntegerFieldUpdater.newUpdater(l.class, "_decision");

    /* renamed from: i, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f17011i = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_state");
    private volatile int _decision;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: j, reason: collision with root package name */
    private final i.v.g f17012j;

    /* renamed from: k, reason: collision with root package name */
    private final i.v.d<T> f17013k;

    /* JADX WARN: Multi-variable type inference failed */
    public l(i.v.d<? super T> dVar, int i2) {
        super(i2);
        this.f17013k = dVar;
        if (m0.a()) {
            if (!(i2 != -1)) {
                throw new AssertionError();
            }
        }
        this.f17012j = dVar.getContext();
        this._decision = 0;
        this._state = b.f16932e;
        this._parentHandle = null;
    }

    private final u0 A() {
        return (u0) this._parentHandle;
    }

    private final boolean F() {
        i.v.d<T> dVar = this.f17013k;
        return (dVar instanceof kotlinx.coroutines.internal.e) && ((kotlinx.coroutines.internal.e) dVar).t(this);
    }

    private final i G(i.y.c.l<? super Throwable, i.s> lVar) {
        return lVar instanceof i ? (i) lVar : new l1(lVar);
    }

    private final void H(i.y.c.l<? super Throwable, i.s> lVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    private final void L(Object obj, int i2, i.y.c.l<? super Throwable, i.s> lVar) {
        Object obj2;
        do {
            obj2 = this._state;
            if (!(obj2 instanceof b2)) {
                if (obj2 instanceof o) {
                    o oVar = (o) obj2;
                    if (oVar.c()) {
                        if (lVar != null) {
                            t(lVar, oVar.f17169b);
                            return;
                        }
                        return;
                    }
                }
                q(obj);
                throw new i.d();
            }
        } while (!f17011i.compareAndSet(this, obj2, N((b2) obj2, obj, i2, lVar, null)));
        x();
        y(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void M(l lVar, Object obj, int i2, i.y.c.l lVar2, int i3, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i3 & 4) != 0) {
            lVar2 = null;
        }
        lVar.L(obj, i2, lVar2);
    }

    private final Object N(b2 b2Var, Object obj, int i2, i.y.c.l<? super Throwable, i.s> lVar, Object obj2) {
        if (obj instanceof w) {
            if (m0.a()) {
                if (!(obj2 == null)) {
                    throw new AssertionError();
                }
            }
            if (!m0.a()) {
                return obj;
            }
            if (lVar == null) {
                return obj;
            }
            throw new AssertionError();
        }
        if (!r0.b(i2) && obj2 == null) {
            return obj;
        }
        if (lVar == null && ((!(b2Var instanceof i) || (b2Var instanceof c)) && obj2 == null)) {
            return obj;
        }
        if (!(b2Var instanceof i)) {
            b2Var = null;
        }
        return new v(obj, (i) b2Var, lVar, obj2, null, 16, null);
    }

    private final void O(u0 u0Var) {
        this._parentHandle = u0Var;
    }

    private final void P() {
        o1 o1Var;
        if (v() || A() != null || (o1Var = (o1) this.f17013k.getContext().get(o1.f17025d)) == null) {
            return;
        }
        u0 u0VarD = o1.a.d(o1Var, true, false, new p(o1Var, this), 2, null);
        O(u0VarD);
        if (!E() || F()) {
            return;
        }
        u0VarD.f();
        O(a2.f16927e);
    }

    private final boolean Q() {
        do {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f17010h.compareAndSet(this, 0, 2));
        return true;
    }

    private final kotlinx.coroutines.internal.x R(Object obj, Object obj2, i.y.c.l<? super Throwable, i.s> lVar) {
        Object obj3;
        do {
            obj3 = this._state;
            if (!(obj3 instanceof b2)) {
                if (!(obj3 instanceof v) || obj2 == null) {
                    return null;
                }
                v vVar = (v) obj3;
                if (vVar.f17157d != obj2) {
                    return null;
                }
                if (!m0.a() || i.y.d.l.a(vVar.a, obj)) {
                    return m.a;
                }
                throw new AssertionError();
            }
        } while (!f17011i.compareAndSet(this, obj3, N((b2) obj3, obj, this.f17031g, lVar, obj2)));
        x();
        return m.a;
    }

    private final boolean S() {
        do {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f17010h.compareAndSet(this, 0, 1));
        return true;
    }

    private final Void q(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void r(i.y.c.l<? super Throwable, i.s> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            f0.a(getContext(), new z("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    private final boolean u(Throwable th) {
        if (!r0.c(this.f17031g)) {
            return false;
        }
        i.v.d<T> dVar = this.f17013k;
        if (!(dVar instanceof kotlinx.coroutines.internal.e)) {
            dVar = null;
        }
        kotlinx.coroutines.internal.e eVar = (kotlinx.coroutines.internal.e) dVar;
        if (eVar != null) {
            return eVar.u(th);
        }
        return false;
    }

    private final boolean v() {
        Throwable thQ;
        boolean zE = E();
        if (!r0.c(this.f17031g)) {
            return zE;
        }
        i.v.d<T> dVar = this.f17013k;
        if (!(dVar instanceof kotlinx.coroutines.internal.e)) {
            dVar = null;
        }
        kotlinx.coroutines.internal.e eVar = (kotlinx.coroutines.internal.e) dVar;
        if (eVar == null || (thQ = eVar.q(this)) == null) {
            return zE;
        }
        if (!zE) {
            m(thQ);
        }
        return true;
    }

    private final void x() {
        if (F()) {
            return;
        }
        w();
    }

    private final void y(int i2) {
        if (Q()) {
            return;
        }
        r0.a(this, i2);
    }

    public final Object B() throws Throwable {
        o1 o1Var;
        P();
        if (S()) {
            return i.v.i.d.c();
        }
        Object objC = C();
        if (objC instanceof w) {
            Throwable th = ((w) objC).f17169b;
            if (m0.d()) {
                throw kotlinx.coroutines.internal.w.j(th, this);
            }
            throw th;
        }
        if (!r0.b(this.f17031g) || (o1Var = (o1) getContext().get(o1.f17025d)) == null || o1Var.b()) {
            return i(objC);
        }
        CancellationException cancellationExceptionS = o1Var.s();
        b(objC, cancellationExceptionS);
        if (m0.d()) {
            throw kotlinx.coroutines.internal.w.j(cancellationExceptionS, this);
        }
        throw cancellationExceptionS;
    }

    public final Object C() {
        return this._state;
    }

    public void D() {
        P();
    }

    public boolean E() {
        return !(C() instanceof b2);
    }

    protected String I() {
        return "CancellableContinuation";
    }

    public final void J(Throwable th) {
        if (u(th)) {
            return;
        }
        m(th);
        x();
    }

    public final boolean K() {
        if (m0.a()) {
            if (!(this.f17031g == 2)) {
                throw new AssertionError();
            }
        }
        if (m0.a()) {
            if (!(A() != a2.f16927e)) {
                throw new AssertionError();
            }
        }
        Object obj = this._state;
        if (m0.a() && !(!(obj instanceof b2))) {
            throw new AssertionError();
        }
        if ((obj instanceof v) && ((v) obj).f17157d != null) {
            w();
            return false;
        }
        this._decision = 0;
        this._state = b.f16932e;
        return true;
    }

    @Override // kotlinx.coroutines.k
    public Object a(T t, Object obj) {
        return R(t, obj, null);
    }

    @Override // kotlinx.coroutines.q0
    public void b(Object obj, Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof b2) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof w) {
                return;
            }
            if (obj2 instanceof v) {
                v vVar = (v) obj2;
                if (!(!vVar.c())) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                if (f17011i.compareAndSet(this, obj2, v.b(vVar, null, null, null, null, th, 15, null))) {
                    vVar.d(this, th);
                    return;
                }
            } else if (f17011i.compareAndSet(this, obj2, new v(obj2, null, null, null, th, 14, null))) {
                return;
            }
        }
    }

    @Override // i.v.j.a.e
    public i.v.j.a.e c() {
        i.v.d<T> dVar = this.f17013k;
        if (!(dVar instanceof i.v.j.a.e)) {
            dVar = null;
        }
        return (i.v.j.a.e) dVar;
    }

    @Override // kotlinx.coroutines.q0
    public final i.v.d<T> d() {
        return this.f17013k;
    }

    @Override // i.v.d
    public void e(Object obj) {
        M(this, a0.c(obj, this), this.f17031g, null, 4, null);
    }

    @Override // kotlinx.coroutines.k
    public void f(i.y.c.l<? super Throwable, i.s> lVar) {
        i iVarG = G(lVar);
        while (true) {
            Object obj = this._state;
            if (obj instanceof b) {
                if (f17011i.compareAndSet(this, obj, iVarG)) {
                    return;
                }
            } else if (obj instanceof i) {
                H(lVar, obj);
            } else {
                boolean z = obj instanceof w;
                if (z) {
                    if (!((w) obj).b()) {
                        H(lVar, obj);
                    }
                    if (obj instanceof o) {
                        if (!z) {
                            obj = null;
                        }
                        w wVar = (w) obj;
                        r(lVar, wVar != null ? wVar.f17169b : null);
                        return;
                    }
                    return;
                }
                if (obj instanceof v) {
                    v vVar = (v) obj;
                    if (vVar.f17155b != null) {
                        H(lVar, obj);
                    }
                    if (iVarG instanceof c) {
                        return;
                    }
                    if (vVar.c()) {
                        r(lVar, vVar.f17158e);
                        return;
                    } else {
                        if (f17011i.compareAndSet(this, obj, v.b(vVar, null, iVarG, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (iVarG instanceof c) {
                        return;
                    }
                    if (f17011i.compareAndSet(this, obj, new v(obj, iVarG, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    @Override // kotlinx.coroutines.q0
    public Throwable g(Object obj) {
        Throwable thG = super.g(obj);
        if (thG == null) {
            return null;
        }
        i.v.d<T> dVar = this.f17013k;
        return (m0.d() && (dVar instanceof i.v.j.a.e)) ? kotlinx.coroutines.internal.w.j(thG, (i.v.j.a.e) dVar) : thG;
    }

    @Override // i.v.d
    public i.v.g getContext() {
        return this.f17012j;
    }

    @Override // i.v.j.a.e
    public StackTraceElement h() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.q0
    public <T> T i(Object obj) {
        return obj instanceof v ? (T) ((v) obj).a : obj;
    }

    @Override // kotlinx.coroutines.k
    public Object j(Throwable th) {
        return R(new w(th, false, 2, null), null, null);
    }

    @Override // kotlinx.coroutines.k
    public Object k(T t, Object obj, i.y.c.l<? super Throwable, i.s> lVar) {
        return R(t, obj, lVar);
    }

    @Override // kotlinx.coroutines.k
    public void l(T t, i.y.c.l<? super Throwable, i.s> lVar) {
        L(t, this.f17031g, lVar);
    }

    @Override // kotlinx.coroutines.k
    public boolean m(Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof b2)) {
                return false;
            }
            z = obj instanceof i;
        } while (!f17011i.compareAndSet(this, obj, new o(this, th, z)));
        if (!z) {
            obj = null;
        }
        i iVar = (i) obj;
        if (iVar != null) {
            s(iVar, th);
        }
        x();
        y(this.f17031g);
        return true;
    }

    @Override // kotlinx.coroutines.k
    public void n(Object obj) {
        if (m0.a()) {
            if (!(obj == m.a)) {
                throw new AssertionError();
            }
        }
        y(this.f17031g);
    }

    @Override // kotlinx.coroutines.q0
    public Object p() {
        return C();
    }

    public final void s(i iVar, Throwable th) {
        try {
            iVar.a(th);
        } catch (Throwable th2) {
            f0.a(getContext(), new z("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void t(i.y.c.l<? super Throwable, i.s> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            f0.a(getContext(), new z("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public String toString() {
        return I() + CoreConstants.LEFT_PARENTHESIS_CHAR + n0.c(this.f17013k) + "){" + C() + "}@" + n0.b(this);
    }

    public final void w() {
        u0 u0VarA = A();
        if (u0VarA != null) {
            u0VarA.f();
        }
        O(a2.f16927e);
    }

    public Throwable z(o1 o1Var) {
        return o1Var.s();
    }
}