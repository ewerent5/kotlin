package kotlinx.coroutines.q2;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Objects;
import kotlinx.coroutines.internal.h0;
import kotlinx.coroutines.internal.m;
import kotlinx.coroutines.internal.w;
import kotlinx.coroutines.internal.x;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.n0;

/* compiled from: AbstractChannel.kt */
/* loaded from: classes3.dex */
public abstract class c<E> implements t<E> {

    /* renamed from: c */
    protected final i.y.c.l<E, i.s> f17045c;

    /* renamed from: b */
    private final kotlinx.coroutines.internal.k f17044b = new kotlinx.coroutines.internal.k();
    private volatile Object onCloseHandler = null;

    /* compiled from: AbstractChannel.kt */
    public static final class a<E> extends s {

        /* renamed from: h */
        public final E f17046h;

        public a(E e2) {
            this.f17046h = e2;
        }

        @Override // kotlinx.coroutines.q2.s
        public Object A() {
            return this.f17046h;
        }

        @Override // kotlinx.coroutines.q2.s
        public x B(m.b bVar) {
            x xVar = kotlinx.coroutines.m.a;
            if (bVar == null) {
                return xVar;
            }
            throw null;
        }

        @Override // kotlinx.coroutines.internal.m
        public String toString() {
            return "SendBuffered@" + n0.b(this) + CoreConstants.LEFT_PARENTHESIS_CHAR + this.f17046h + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // kotlinx.coroutines.q2.s
        public void z() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(i.y.c.l<? super E, i.s> lVar) {
        this.f17045c = lVar;
    }

    private final int a() {
        Object objP = this.f17044b.p();
        Objects.requireNonNull(objP, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
        int i2 = 0;
        for (kotlinx.coroutines.internal.m mVarQ = (kotlinx.coroutines.internal.m) objP; !i.y.d.l.a(mVarQ, r0); mVarQ = mVarQ.q()) {
            if (mVarQ instanceof kotlinx.coroutines.internal.m) {
                i2++;
            }
        }
        return i2;
    }

    private final String e() {
        String string;
        kotlinx.coroutines.internal.m mVarQ = this.f17044b.q();
        if (mVarQ == this.f17044b) {
            return "EmptyQueue";
        }
        if (mVarQ instanceof j) {
            string = mVarQ.toString();
        } else if (mVarQ instanceof o) {
            string = "ReceiveQueued";
        } else if (mVarQ instanceof s) {
            string = "SendQueued";
        } else {
            string = "UNEXPECTED:" + mVarQ;
        }
        kotlinx.coroutines.internal.m mVarR = this.f17044b.r();
        if (mVarR == mVarQ) {
            return string;
        }
        String str = string + ",queueSize=" + a();
        if (!(mVarR instanceof j)) {
            return str;
        }
        return str + ",closedForSend=" + mVarR;
    }

    private final void f(j<?> jVar) {
        Object objB = kotlinx.coroutines.internal.j.b(null, 1, null);
        while (true) {
            kotlinx.coroutines.internal.m mVarR = jVar.r();
            if (!(mVarR instanceof o)) {
                mVarR = null;
            }
            o oVar = (o) mVarR;
            if (oVar == null) {
                break;
            } else if (oVar.v()) {
                objB = kotlinx.coroutines.internal.j.c(objB, oVar);
            } else {
                oVar.s();
            }
        }
        if (objB != null) {
            if (objB instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) objB;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((o) arrayList.get(size)).A(jVar);
                }
            } else {
                ((o) objB).A(jVar);
            }
        }
        i(jVar);
    }

    private final Throwable g(E e2, j<?> jVar) {
        h0 h0VarD;
        f(jVar);
        i.y.c.l<E, i.s> lVar = this.f17045c;
        if (lVar == null || (h0VarD = kotlinx.coroutines.internal.s.d(lVar, e2, null, 2, null)) == null) {
            return jVar.G();
        }
        i.b.a(h0VarD, jVar.G());
        throw h0VarD;
    }

    protected String b() {
        return "";
    }

    protected final j<?> c() {
        kotlinx.coroutines.internal.m mVarR = this.f17044b.r();
        if (!(mVarR instanceof j)) {
            mVarR = null;
        }
        j<?> jVar = (j) mVarR;
        if (jVar == null) {
            return null;
        }
        f(jVar);
        return jVar;
    }

    protected final kotlinx.coroutines.internal.k d() {
        return this.f17044b;
    }

    protected Object h(E e2) {
        q<E> qVarK;
        x xVarH;
        do {
            qVarK = k();
            if (qVarK == null) {
                return b.f17040c;
            }
            xVarH = qVarK.h(e2, null);
        } while (xVarH == null);
        if (m0.a()) {
            if (!(xVarH == kotlinx.coroutines.m.a)) {
                throw new AssertionError();
            }
        }
        qVarK.g(e2);
        return qVarK.a();
    }

    protected void i(kotlinx.coroutines.internal.m mVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final q<?> j(E e2) {
        kotlinx.coroutines.internal.m mVarR;
        kotlinx.coroutines.internal.k kVar = this.f17044b;
        a aVar = new a(e2);
        do {
            mVarR = kVar.r();
            if (mVarR instanceof q) {
                return (q) mVarR;
            }
        } while (!mVarR.k(aVar, kVar));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.internal.m] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    protected q<E> k() {
        ?? r1;
        kotlinx.coroutines.internal.m mVarW;
        kotlinx.coroutines.internal.k kVar = this.f17044b;
        while (true) {
            Object objP = kVar.p();
            Objects.requireNonNull(objP, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            r1 = (kotlinx.coroutines.internal.m) objP;
            if (r1 == kVar || !(r1 instanceof q)) {
                break;
            }
            if (((((q) r1) instanceof j) && !r1.u()) || (mVarW = r1.w()) == null) {
                break;
            }
            mVarW.t();
        }
        r1 = 0;
        return (q) r1;
    }

    protected final s l() {
        kotlinx.coroutines.internal.m mVar;
        kotlinx.coroutines.internal.m mVarW;
        kotlinx.coroutines.internal.k kVar = this.f17044b;
        while (true) {
            Object objP = kVar.p();
            Objects.requireNonNull(objP, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            mVar = (kotlinx.coroutines.internal.m) objP;
            if (mVar == kVar || !(mVar instanceof s)) {
                break;
            }
            if (((((s) mVar) instanceof j) && !mVar.u()) || (mVarW = mVar.w()) == null) {
                break;
            }
            mVarW.t();
        }
        mVar = null;
        return (s) mVar;
    }

    @Override // kotlinx.coroutines.q2.t
    public final boolean offer(E e2) throws Throwable {
        Object objH = h(e2);
        if (objH == b.f17039b) {
            return true;
        }
        if (objH == b.f17040c) {
            j<?> jVarC = c();
            if (jVarC == null) {
                return false;
            }
            throw w.k(g(e2, jVarC));
        }
        if (objH instanceof j) {
            throw w.k(g(e2, (j) objH));
        }
        throw new IllegalStateException(("offerInternal returned " + objH).toString());
    }

    public String toString() {
        return n0.a(this) + '@' + n0.b(this) + CoreConstants.CURLY_LEFT + e() + CoreConstants.CURLY_RIGHT + b();
    }
}