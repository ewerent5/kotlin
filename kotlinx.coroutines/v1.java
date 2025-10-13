package kotlinx.coroutines;

import ch.qos.logback.core.CoreConstants;
import i.v.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.m;
import kotlinx.coroutines.o1;

/* compiled from: JobSupport.kt */
/* loaded from: classes3.dex */
public class v1 implements o1, s, c2 {

    /* renamed from: e */
    private static final AtomicReferenceFieldUpdater f17160e = AtomicReferenceFieldUpdater.newUpdater(v1.class, Object.class, "_state");
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* compiled from: JobSupport.kt */
    private static final class a extends u1<o1> {

        /* renamed from: i */
        private final v1 f17161i;

        /* renamed from: j */
        private final b f17162j;

        /* renamed from: k */
        private final r f17163k;

        /* renamed from: l */
        private final Object f17164l;

        public a(v1 v1Var, b bVar, r rVar, Object obj) {
            super(rVar.f17060i);
            this.f17161i = v1Var;
            this.f17162j = bVar;
            this.f17163k = rVar;
            this.f17164l = obj;
        }

        @Override // i.y.c.l
        public /* bridge */ /* synthetic */ i.s invoke(Throwable th) {
            z(th);
            return i.s.a;
        }

        @Override // kotlinx.coroutines.y
        public void z(Throwable th) {
            this.f17161i.I(this.f17162j, this.f17163k, this.f17164l);
        }
    }

    /* compiled from: JobSupport.kt */
    private static final class b implements j1 {
        private volatile Object _exceptionsHolder = null;
        private volatile int _isCompleting;
        private volatile Object _rootCause;

        /* renamed from: e */
        private final z1 f17165e;

        public b(z1 z1Var, boolean z, Throwable th) {
            this.f17165e = z1Var;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        private final ArrayList<Throwable> c() {
            return new ArrayList<>(4);
        }

        private final Object d() {
            return this._exceptionsHolder;
        }

        private final void l(Object obj) {
            this._exceptionsHolder = obj;
        }

        public final void a(Throwable th) {
            Throwable thF = f();
            if (thF == null) {
                m(th);
                return;
            }
            if (th == thF) {
                return;
            }
            Object objD = d();
            if (objD == null) {
                l(th);
                return;
            }
            if (!(objD instanceof Throwable)) {
                if (objD instanceof ArrayList) {
                    ((ArrayList) objD).add(th);
                    return;
                }
                throw new IllegalStateException(("State is " + objD).toString());
            }
            if (th == objD) {
                return;
            }
            ArrayList<Throwable> arrayListC = c();
            arrayListC.add(objD);
            arrayListC.add(th);
            i.s sVar = i.s.a;
            l(arrayListC);
        }

        @Override // kotlinx.coroutines.j1
        public boolean b() {
            return f() == null;
        }

        @Override // kotlinx.coroutines.j1
        public z1 e() {
            return this.f17165e;
        }

        public final Throwable f() {
            return (Throwable) this._rootCause;
        }

        public final boolean g() {
            return f() != null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
        public final boolean h() {
            return this._isCompleting;
        }

        public final boolean i() {
            return d() == w1.f17174e;
        }

        public final List<Throwable> j(Throwable th) {
            ArrayList<Throwable> arrayListC;
            Object objD = d();
            if (objD == null) {
                arrayListC = c();
            } else if (objD instanceof Throwable) {
                ArrayList<Throwable> arrayListC2 = c();
                arrayListC2.add(objD);
                arrayListC = arrayListC2;
            } else {
                if (!(objD instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + objD).toString());
                }
                arrayListC = (ArrayList) objD;
            }
            Throwable thF = f();
            if (thF != null) {
                arrayListC.add(0, thF);
            }
            if (th != null && (!i.y.d.l.a(th, thF))) {
                arrayListC.add(th);
            }
            l(w1.f17174e);
            return arrayListC;
        }

        public final void k(boolean z) {
            this._isCompleting = z ? 1 : 0;
        }

        public final void m(Throwable th) {
            this._rootCause = th;
        }

        public String toString() {
            return "Finishing[cancelling=" + g() + ", completing=" + h() + ", rootCause=" + f() + ", exceptions=" + d() + ", list=" + e() + ']';
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    public static final class c extends m.a {

        /* renamed from: d */
        final /* synthetic */ kotlinx.coroutines.internal.m f17166d;

        /* renamed from: e */
        final /* synthetic */ v1 f17167e;

        /* renamed from: f */
        final /* synthetic */ Object f17168f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(kotlinx.coroutines.internal.m mVar, kotlinx.coroutines.internal.m mVar2, v1 v1Var, Object obj) {
            super(mVar2);
            this.f17166d = mVar;
            this.f17167e = v1Var;
            this.f17168f = obj;
        }

        @Override // kotlinx.coroutines.internal.c
        /* renamed from: i */
        public Object g(kotlinx.coroutines.internal.m mVar) {
            if (this.f17167e.U() == this.f17168f) {
                return null;
            }
            return kotlinx.coroutines.internal.l.a();
        }
    }

    public v1(boolean z) {
        this._state = z ? w1.f17176g : w1.f17175f;
        this._parentHandle = null;
    }

    private final boolean A0(b bVar, r rVar, Object obj) {
        while (o1.a.d(rVar.f17060i, false, false, new a(this, bVar, rVar, obj), 1, null) == a2.f16927e) {
            rVar = h0(rVar);
            if (rVar == null) {
                return false;
            }
        }
        return true;
    }

    private final boolean E(Throwable th) {
        if (a0()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        q qVarS = S();
        return (qVarS == null || qVarS == a2.f16927e) ? z : qVarS.c(th) || z;
    }

    private final void H(j1 j1Var, Object obj) throws Throwable {
        q qVarS = S();
        if (qVarS != null) {
            qVarS.f();
            q0(a2.f16927e);
        }
        if (!(obj instanceof w)) {
            obj = null;
        }
        w wVar = (w) obj;
        Throwable th = wVar != null ? wVar.f17169b : null;
        if (!(j1Var instanceof u1)) {
            z1 z1VarE = j1Var.e();
            if (z1VarE != null) {
                j0(z1VarE, th);
                return;
            }
            return;
        }
        try {
            ((u1) j1Var).z(th);
        } catch (Throwable th2) {
            X(new z("Exception in completion handler " + j1Var + " for " + this, th2));
        }
    }

    public final void I(b bVar, r rVar, Object obj) {
        if (m0.a()) {
            if (!(U() == bVar)) {
                throw new AssertionError();
            }
        }
        r rVarH0 = h0(rVar);
        if (rVarH0 == null || !A0(bVar, rVarH0, obj)) {
            u(L(bVar, obj));
        }
    }

    private final Throwable J(Object obj) {
        if (obj != null ? obj instanceof Throwable : true) {
            return obj != null ? (Throwable) obj : new p1(F(), null, this);
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((c2) obj).D();
    }

    private final Object L(b bVar, Object obj) throws Throwable {
        boolean zG;
        Throwable thO;
        boolean z = true;
        if (m0.a()) {
            if (!(U() == bVar)) {
                throw new AssertionError();
            }
        }
        if (m0.a() && !(!bVar.i())) {
            throw new AssertionError();
        }
        if (m0.a() && !bVar.h()) {
            throw new AssertionError();
        }
        w wVar = (w) (!(obj instanceof w) ? null : obj);
        Throwable th = wVar != null ? wVar.f17169b : null;
        synchronized (bVar) {
            zG = bVar.g();
            List<Throwable> listJ = bVar.j(th);
            thO = O(bVar, listJ);
            if (thO != null) {
                t(thO, listJ);
            }
        }
        if (thO != null && thO != th) {
            obj = new w(thO, false, 2, null);
        }
        if (thO != null) {
            if (!E(thO) && !V(thO)) {
                z = false;
            }
            if (z) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                ((w) obj).b();
            }
        }
        if (!zG) {
            k0(thO);
        }
        l0(obj);
        boolean zCompareAndSet = f17160e.compareAndSet(this, bVar, w1.g(obj));
        if (m0.a() && !zCompareAndSet) {
            throw new AssertionError();
        }
        H(bVar, obj);
        return obj;
    }

    private final r M(j1 j1Var) {
        r rVar = (r) (!(j1Var instanceof r) ? null : j1Var);
        if (rVar != null) {
            return rVar;
        }
        z1 z1VarE = j1Var.e();
        if (z1VarE != null) {
            return h0(z1VarE);
        }
        return null;
    }

    private final Throwable N(Object obj) {
        if (!(obj instanceof w)) {
            obj = null;
        }
        w wVar = (w) obj;
        if (wVar != null) {
            return wVar.f17169b;
        }
        return null;
    }

    private final Throwable O(b bVar, List<? extends Throwable> list) {
        Object obj = null;
        if (list.isEmpty()) {
            if (bVar.g()) {
                return new p1(F(), null, this);
            }
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                obj = next;
                break;
            }
        }
        Throwable th = (Throwable) obj;
        return th != null ? th : list.get(0);
    }

    private final z1 R(j1 j1Var) {
        z1 z1VarE = j1Var.e();
        if (z1VarE != null) {
            return z1VarE;
        }
        if (j1Var instanceof w0) {
            return new z1();
        }
        if (j1Var instanceof u1) {
            o0((u1) j1Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + j1Var).toString());
    }

    private final boolean b0() {
        Object objU;
        do {
            objU = U();
            if (!(objU instanceof j1)) {
                return false;
            }
        } while (r0(objU) < 0);
        return true;
    }

    private final Object d0(Object obj) throws Throwable {
        Throwable thJ = null;
        while (true) {
            Object objU = U();
            if (objU instanceof b) {
                synchronized (objU) {
                    if (((b) objU).i()) {
                        return w1.f17173d;
                    }
                    boolean zG = ((b) objU).g();
                    if (obj != null || !zG) {
                        if (thJ == null) {
                            thJ = J(obj);
                        }
                        ((b) objU).a(thJ);
                    }
                    Throwable thF = zG ^ true ? ((b) objU).f() : null;
                    if (thF != null) {
                        i0(((b) objU).e(), thF);
                    }
                    return w1.a;
                }
            }
            if (!(objU instanceof j1)) {
                return w1.f17173d;
            }
            if (thJ == null) {
                thJ = J(obj);
            }
            j1 j1Var = (j1) objU;
            if (!j1Var.b()) {
                Object objY0 = y0(objU, new w(thJ, false, 2, null));
                if (objY0 == w1.a) {
                    throw new IllegalStateException(("Cannot happen in " + objU).toString());
                }
                if (objY0 != w1.f17172c) {
                    return objY0;
                }
            } else if (x0(j1Var, thJ)) {
                return w1.a;
            }
        }
    }

    private final u1<?> f0(i.y.c.l<? super Throwable, i.s> lVar, boolean z) {
        if (z) {
            q1 q1Var = (q1) (lVar instanceof q1 ? lVar : null);
            if (q1Var == null) {
                return new m1(this, lVar);
            }
            if (!m0.a()) {
                return q1Var;
            }
            if (q1Var.f17154h == this) {
                return q1Var;
            }
            throw new AssertionError();
        }
        u1<?> u1Var = (u1) (lVar instanceof u1 ? lVar : null);
        if (u1Var == null) {
            return new n1(this, lVar);
        }
        if (!m0.a()) {
            return u1Var;
        }
        if (u1Var.f17154h == this && !(u1Var instanceof q1)) {
            return u1Var;
        }
        throw new AssertionError();
    }

    private final r h0(kotlinx.coroutines.internal.m mVar) {
        while (mVar.u()) {
            mVar = mVar.r();
        }
        while (true) {
            mVar = mVar.q();
            if (!mVar.u()) {
                if (mVar instanceof r) {
                    return (r) mVar;
                }
                if (mVar instanceof z1) {
                    return null;
                }
            }
        }
    }

    private final void i0(z1 z1Var, Throwable th) throws Throwable {
        k0(th);
        Object objP = z1Var.p();
        Objects.requireNonNull(objP, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
        z zVar = null;
        for (kotlinx.coroutines.internal.m mVarQ = (kotlinx.coroutines.internal.m) objP; !i.y.d.l.a(mVarQ, z1Var); mVarQ = mVarQ.q()) {
            if (mVarQ instanceof q1) {
                u1 u1Var = (u1) mVarQ;
                try {
                    u1Var.z(th);
                } catch (Throwable th2) {
                    if (zVar != null) {
                        i.b.a(zVar, th2);
                    } else {
                        zVar = new z("Exception in completion handler " + u1Var + " for " + this, th2);
                        i.s sVar = i.s.a;
                    }
                }
            }
        }
        if (zVar != null) {
            X(zVar);
        }
        E(th);
    }

    private final void j0(z1 z1Var, Throwable th) throws Throwable {
        Object objP = z1Var.p();
        Objects.requireNonNull(objP, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
        z zVar = null;
        for (kotlinx.coroutines.internal.m mVarQ = (kotlinx.coroutines.internal.m) objP; !i.y.d.l.a(mVarQ, z1Var); mVarQ = mVarQ.q()) {
            if (mVarQ instanceof u1) {
                u1 u1Var = (u1) mVarQ;
                try {
                    u1Var.z(th);
                } catch (Throwable th2) {
                    if (zVar != null) {
                        i.b.a(zVar, th2);
                    } else {
                        zVar = new z("Exception in completion handler " + u1Var + " for " + this, th2);
                        i.s sVar = i.s.a;
                    }
                }
            }
        }
        if (zVar != null) {
            X(zVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.i1] */
    private final void n0(w0 w0Var) {
        z1 z1Var = new z1();
        if (!w0Var.b()) {
            z1Var = new i1(z1Var);
        }
        f17160e.compareAndSet(this, w0Var, z1Var);
    }

    private final void o0(u1<?> u1Var) {
        u1Var.l(new z1());
        f17160e.compareAndSet(this, u1Var, u1Var.q());
    }

    private final boolean r(Object obj, z1 z1Var, u1<?> u1Var) {
        int iY;
        c cVar = new c(u1Var, u1Var, this, obj);
        do {
            iY = z1Var.r().y(u1Var, z1Var, cVar);
            if (iY == 1) {
                return true;
            }
        } while (iY != 2);
        return false;
    }

    private final int r0(Object obj) {
        if (obj instanceof w0) {
            if (((w0) obj).b()) {
                return 0;
            }
            if (!f17160e.compareAndSet(this, obj, w1.f17176g)) {
                return -1;
            }
            m0();
            return 1;
        }
        if (!(obj instanceof i1)) {
            return 0;
        }
        if (!f17160e.compareAndSet(this, obj, ((i1) obj).e())) {
            return -1;
        }
        m0();
        return 1;
    }

    private final String s0(Object obj) {
        if (!(obj instanceof b)) {
            return obj instanceof j1 ? ((j1) obj).b() ? "Active" : "New" : obj instanceof w ? "Cancelled" : "Completed";
        }
        b bVar = (b) obj;
        return bVar.g() ? "Cancelling" : bVar.h() ? "Completing" : "Active";
    }

    private final void t(Throwable th, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Throwable thM = !m0.d() ? th : kotlinx.coroutines.internal.w.m(th);
        for (Throwable thM2 : list) {
            if (m0.d()) {
                thM2 = kotlinx.coroutines.internal.w.m(thM2);
            }
            if (thM2 != th && thM2 != thM && !(thM2 instanceof CancellationException) && setNewSetFromMap.add(thM2)) {
                i.b.a(th, thM2);
            }
        }
    }

    public static /* synthetic */ CancellationException u0(v1 v1Var, Throwable th, String str, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i2 & 1) != 0) {
            str = null;
        }
        return v1Var.t0(th, str);
    }

    private final boolean w0(j1 j1Var, Object obj) throws Throwable {
        if (m0.a()) {
            if (!((j1Var instanceof w0) || (j1Var instanceof u1))) {
                throw new AssertionError();
            }
        }
        if (m0.a() && !(!(obj instanceof w))) {
            throw new AssertionError();
        }
        if (!f17160e.compareAndSet(this, j1Var, w1.g(obj))) {
            return false;
        }
        k0(null);
        l0(obj);
        H(j1Var, obj);
        return true;
    }

    private final boolean x0(j1 j1Var, Throwable th) throws Throwable {
        if (m0.a() && !(!(j1Var instanceof b))) {
            throw new AssertionError();
        }
        if (m0.a() && !j1Var.b()) {
            throw new AssertionError();
        }
        z1 z1VarR = R(j1Var);
        if (z1VarR == null) {
            return false;
        }
        if (!f17160e.compareAndSet(this, j1Var, new b(z1VarR, false, th))) {
            return false;
        }
        i0(z1VarR, th);
        return true;
    }

    private final Object y0(Object obj, Object obj2) {
        return !(obj instanceof j1) ? w1.a : ((!(obj instanceof w0) && !(obj instanceof u1)) || (obj instanceof r) || (obj2 instanceof w)) ? z0((j1) obj, obj2) : w0((j1) obj, obj2) ? obj2 : w1.f17172c;
    }

    private final Object z(Object obj) {
        Object objY0;
        do {
            Object objU = U();
            if (!(objU instanceof j1) || ((objU instanceof b) && ((b) objU).h())) {
                return w1.a;
            }
            objY0 = y0(objU, new w(J(obj), false, 2, null));
        } while (objY0 == w1.f17172c);
        return objY0;
    }

    private final Object z0(j1 j1Var, Object obj) throws Throwable {
        z1 z1VarR = R(j1Var);
        if (z1VarR == null) {
            return w1.f17172c;
        }
        b bVar = (b) (!(j1Var instanceof b) ? null : j1Var);
        if (bVar == null) {
            bVar = new b(z1VarR, false, null);
        }
        synchronized (bVar) {
            if (bVar.h()) {
                return w1.a;
            }
            bVar.k(true);
            if (bVar != j1Var && !f17160e.compareAndSet(this, j1Var, bVar)) {
                return w1.f17172c;
            }
            if (m0.a() && !(!bVar.i())) {
                throw new AssertionError();
            }
            boolean zG = bVar.g();
            w wVar = (w) (!(obj instanceof w) ? null : obj);
            if (wVar != null) {
                bVar.a(wVar.f17169b);
            }
            Throwable thF = true ^ zG ? bVar.f() : null;
            i.s sVar = i.s.a;
            if (thF != null) {
                i0(z1VarR, thF);
            }
            r rVarM = M(j1Var);
            return (rVarM == null || !A0(bVar, rVarM, obj)) ? L(bVar, obj) : w1.f17171b;
        }
    }

    @Override // kotlinx.coroutines.o1
    public final u0 B(i.y.c.l<? super Throwable, i.s> lVar) {
        return q(false, true, lVar);
    }

    @Override // kotlinx.coroutines.c2
    public CancellationException D() {
        Throwable thF;
        Object objU = U();
        if (objU instanceof b) {
            thF = ((b) objU).f();
        } else if (objU instanceof w) {
            thF = ((w) objU).f17169b;
        } else {
            if (objU instanceof j1) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objU).toString());
            }
            thF = null;
        }
        CancellationException cancellationException = (CancellationException) (thF instanceof CancellationException ? thF : null);
        if (cancellationException != null) {
            return cancellationException;
        }
        return new p1("Parent job is " + s0(objU), thF, this);
    }

    public String F() {
        return "Job was cancelled";
    }

    public boolean G(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return x(th) && P();
    }

    @Override // kotlinx.coroutines.o1
    public void K(CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new p1(F(), null, this);
        }
        y(cancellationException);
    }

    public boolean P() {
        return true;
    }

    public boolean Q() {
        return false;
    }

    public final q S() {
        return (q) this._parentHandle;
    }

    public final Object U() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof kotlinx.coroutines.internal.t)) {
                return obj;
            }
            ((kotlinx.coroutines.internal.t) obj).c(this);
        }
    }

    protected boolean V(Throwable th) {
        return false;
    }

    @Override // kotlinx.coroutines.o1
    public final q W(s sVar) {
        u0 u0VarD = o1.a.d(this, true, false, new r(this, sVar), 2, null);
        Objects.requireNonNull(u0VarD, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (q) u0VarD;
    }

    public void X(Throwable th) throws Throwable {
        throw th;
    }

    public final void Y(o1 o1Var) {
        if (m0.a()) {
            if (!(S() == null)) {
                throw new AssertionError();
            }
        }
        if (o1Var == null) {
            q0(a2.f16927e);
            return;
        }
        o1Var.start();
        q qVarW = o1Var.W(this);
        q0(qVarW);
        if (Z()) {
            qVarW.f();
            q0(a2.f16927e);
        }
    }

    public final boolean Z() {
        return !(U() instanceof j1);
    }

    protected boolean a0() {
        return false;
    }

    @Override // kotlinx.coroutines.o1
    public boolean b() {
        Object objU = U();
        return (objU instanceof j1) && ((j1) objU).b();
    }

    final /* synthetic */ Object c0(i.v.d<? super i.s> dVar) throws Throwable {
        l lVar = new l(i.v.i.c.b(dVar), 1);
        lVar.D();
        n.a(lVar, B(new d2(this, lVar)));
        Object objB = lVar.B();
        if (objB == i.v.i.d.c()) {
            i.v.j.a.h.c(dVar);
        }
        return objB;
    }

    public final Object e0(Object obj) {
        Object objY0;
        do {
            objY0 = y0(U(), obj);
            if (objY0 == w1.a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, N(obj));
            }
        } while (objY0 == w1.f17172c);
        return objY0;
    }

    @Override // i.v.g
    public <R> R fold(R r, i.y.c.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) o1.a.b(this, r, pVar);
    }

    public String g0() {
        return n0.a(this);
    }

    @Override // i.v.g.b, i.v.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) o1.a.c(this, cVar);
    }

    @Override // i.v.g.b
    public final g.c<?> getKey() {
        return o1.f17025d;
    }

    @Override // kotlinx.coroutines.o1
    public final Object i(i.v.d<? super i.s> dVar) throws Throwable {
        if (b0()) {
            Object objC0 = c0(dVar);
            return objC0 == i.v.i.d.c() ? objC0 : i.s.a;
        }
        p2.a(dVar.getContext());
        return i.s.a;
    }

    protected void k0(Throwable th) {
    }

    protected void l0(Object obj) {
    }

    public void m0() {
    }

    @Override // i.v.g
    public i.v.g minusKey(g.c<?> cVar) {
        return o1.a.e(this, cVar);
    }

    public final void p0(u1<?> u1Var) {
        Object objU;
        do {
            objU = U();
            if (!(objU instanceof u1)) {
                if (!(objU instanceof j1) || ((j1) objU).e() == null) {
                    return;
                }
                u1Var.v();
                return;
            }
            if (objU != u1Var) {
                return;
            }
        } while (!f17160e.compareAndSet(this, objU, w1.f17176g));
    }

    @Override // i.v.g
    public i.v.g plus(i.v.g gVar) {
        return o1.a.f(this, gVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x007c A[SYNTHETIC] */
    @Override // kotlinx.coroutines.o1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlinx.coroutines.u0 q(boolean r8, boolean r9, i.y.c.l<? super java.lang.Throwable, i.s> r10) {
        /*
            r7 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r7.U()
            boolean r3 = r2 instanceof kotlinx.coroutines.w0
            if (r3 == 0) goto L27
            r3 = r2
            kotlinx.coroutines.w0 r3 = (kotlinx.coroutines.w0) r3
            boolean r4 = r3.b()
            if (r4 == 0) goto L23
            if (r1 == 0) goto L16
            goto L1a
        L16:
            kotlinx.coroutines.u1 r1 = r7.f0(r10, r8)
        L1a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.v1.f17160e
            boolean r2 = r3.compareAndSet(r7, r2, r1)
            if (r2 == 0) goto L2
            return r1
        L23:
            r7.n0(r3)
            goto L2
        L27:
            boolean r3 = r2 instanceof kotlinx.coroutines.j1
            if (r3 == 0) goto L90
            r3 = r2
            kotlinx.coroutines.j1 r3 = (kotlinx.coroutines.j1) r3
            kotlinx.coroutines.z1 r3 = r3.e()
            if (r3 != 0) goto L3f
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.JobNode<*>"
            java.util.Objects.requireNonNull(r2, r3)
            kotlinx.coroutines.u1 r2 = (kotlinx.coroutines.u1) r2
            r7.o0(r2)
            goto L2
        L3f:
            kotlinx.coroutines.a2 r4 = kotlinx.coroutines.a2.f16927e
            if (r8 == 0) goto L79
            boolean r5 = r2 instanceof kotlinx.coroutines.v1.b
            if (r5 == 0) goto L79
            monitor-enter(r2)
            r5 = r2
            kotlinx.coroutines.v1$b r5 = (kotlinx.coroutines.v1.b) r5     // Catch: java.lang.Throwable -> L76
            java.lang.Throwable r5 = r5.f()     // Catch: java.lang.Throwable -> L76
            if (r5 == 0) goto L5e
            boolean r6 = r10 instanceof kotlinx.coroutines.r     // Catch: java.lang.Throwable -> L76
            if (r6 == 0) goto L72
            r6 = r2
            kotlinx.coroutines.v1$b r6 = (kotlinx.coroutines.v1.b) r6     // Catch: java.lang.Throwable -> L76
            boolean r6 = r6.h()     // Catch: java.lang.Throwable -> L76
            if (r6 != 0) goto L72
        L5e:
            if (r1 == 0) goto L61
            goto L65
        L61:
            kotlinx.coroutines.u1 r1 = r7.f0(r10, r8)     // Catch: java.lang.Throwable -> L76
        L65:
            boolean r4 = r7.r(r2, r3, r1)     // Catch: java.lang.Throwable -> L76
            if (r4 != 0) goto L6d
            monitor-exit(r2)
            goto L2
        L6d:
            if (r5 != 0) goto L71
            monitor-exit(r2)
            return r1
        L71:
            r4 = r1
        L72:
            i.s r6 = i.s.a     // Catch: java.lang.Throwable -> L76
            monitor-exit(r2)
            goto L7a
        L76:
            r8 = move-exception
            monitor-exit(r2)
            throw r8
        L79:
            r5 = r0
        L7a:
            if (r5 == 0) goto L82
            if (r9 == 0) goto L81
            r10.invoke(r5)
        L81:
            return r4
        L82:
            if (r1 == 0) goto L85
            goto L89
        L85:
            kotlinx.coroutines.u1 r1 = r7.f0(r10, r8)
        L89:
            boolean r2 = r7.r(r2, r3, r1)
            if (r2 == 0) goto L2
            return r1
        L90:
            if (r9 == 0) goto La0
            boolean r8 = r2 instanceof kotlinx.coroutines.w
            if (r8 != 0) goto L97
            r2 = r0
        L97:
            kotlinx.coroutines.w r2 = (kotlinx.coroutines.w) r2
            if (r2 == 0) goto L9d
            java.lang.Throwable r0 = r2.f17169b
        L9d:
            r10.invoke(r0)
        La0:
            kotlinx.coroutines.a2 r8 = kotlinx.coroutines.a2.f16927e
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.v1.q(boolean, boolean, i.y.c.l):kotlinx.coroutines.u0");
    }

    public final void q0(q qVar) {
        this._parentHandle = qVar;
    }

    @Override // kotlinx.coroutines.o1
    public final CancellationException s() {
        Object objU = U();
        if (!(objU instanceof b)) {
            if (objU instanceof j1) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (objU instanceof w) {
                return u0(this, ((w) objU).f17169b, null, 1, null);
            }
            return new p1(n0.a(this) + " has completed normally", null, this);
        }
        Throwable thF = ((b) objU).f();
        if (thF != null) {
            CancellationException cancellationExceptionT0 = t0(thF, n0.a(this) + " is cancelling");
            if (cancellationExceptionT0 != null) {
                return cancellationExceptionT0;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    @Override // kotlinx.coroutines.o1
    public final boolean start() {
        int iR0;
        do {
            iR0 = r0(U());
            if (iR0 == 0) {
                return false;
            }
        } while (iR0 != 1);
        return true;
    }

    protected final CancellationException t0(Throwable th, String str) {
        CancellationException p1Var = (CancellationException) (!(th instanceof CancellationException) ? null : th);
        if (p1Var == null) {
            if (str == null) {
                str = F();
            }
            p1Var = new p1(str, th, this);
        }
        return p1Var;
    }

    public String toString() {
        return v0() + '@' + n0.b(this);
    }

    protected void u(Object obj) {
    }

    @Override // kotlinx.coroutines.s
    public final void v(c2 c2Var) throws Throwable {
        x(c2Var);
    }

    public final String v0() {
        return g0() + CoreConstants.CURLY_LEFT + s0(U()) + CoreConstants.CURLY_RIGHT;
    }

    public final boolean w(Throwable th) {
        return x(th);
    }

    public final boolean x(Object obj) throws Throwable {
        Object objD0 = w1.a;
        if (Q() && (objD0 = z(obj)) == w1.f17171b) {
            return true;
        }
        if (objD0 == w1.a) {
            objD0 = d0(obj);
        }
        if (objD0 == w1.a || objD0 == w1.f17171b) {
            return true;
        }
        if (objD0 == w1.f17173d) {
            return false;
        }
        u(objD0);
        return true;
    }

    public void y(Throwable th) throws Throwable {
        x(th);
    }
}