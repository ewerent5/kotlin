package kotlinx.coroutines.q2;

import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.internal.h0;
import kotlinx.coroutines.internal.x;
import kotlinx.coroutines.m0;

/* compiled from: ConflatedChannel.kt */
/* loaded from: classes3.dex */
public class m<E> extends a<E> {

    /* renamed from: d, reason: collision with root package name */
    private final ReentrantLock f17058d;

    /* renamed from: e, reason: collision with root package name */
    private Object f17059e;

    public m(i.y.c.l<? super E, i.s> lVar) {
        super(lVar);
        this.f17058d = new ReentrantLock();
        this.f17059e = b.a;
    }

    private final h0 w(Object obj) {
        i.y.c.l<E, i.s> lVar;
        Object obj2 = this.f17059e;
        h0 h0VarD = null;
        if (obj2 != b.a && (lVar = this.f17045c) != null) {
            h0VarD = kotlinx.coroutines.internal.s.d(lVar, obj2, null, 2, null);
        }
        this.f17059e = obj;
        return h0VarD;
    }

    @Override // kotlinx.coroutines.q2.c
    protected String b() {
        return "(value=" + this.f17059e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // kotlinx.coroutines.q2.c
    protected Object h(E e2) {
        q<E> qVarK;
        x xVarH;
        ReentrantLock reentrantLock = this.f17058d;
        reentrantLock.lock();
        try {
            j<?> jVarC = c();
            if (jVarC != null) {
                return jVarC;
            }
            if (this.f17059e == b.a) {
                do {
                    qVarK = k();
                    if (qVarK != null) {
                        if (qVarK instanceof j) {
                            i.y.d.l.b(qVarK);
                            return qVarK;
                        }
                        i.y.d.l.b(qVarK);
                        xVarH = qVarK.h(e2, null);
                    }
                } while (xVarH == null);
                if (m0.a()) {
                    if (!(xVarH == kotlinx.coroutines.m.a)) {
                        throw new AssertionError();
                    }
                }
                i.s sVar = i.s.a;
                reentrantLock.unlock();
                i.y.d.l.b(qVarK);
                qVarK.g(e2);
                i.y.d.l.b(qVarK);
                return qVarK.a();
            }
            h0 h0VarW = w(e2);
            if (h0VarW == null) {
                return b.f17039b;
            }
            throw h0VarW;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.q2.a
    protected boolean p(o<? super E> oVar) {
        ReentrantLock reentrantLock = this.f17058d;
        reentrantLock.lock();
        try {
            return super.p(oVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.q2.a
    protected final boolean q() {
        return false;
    }

    @Override // kotlinx.coroutines.q2.a
    protected final boolean r() {
        return this.f17059e == b.a;
    }

    @Override // kotlinx.coroutines.q2.a
    protected Object u() {
        ReentrantLock reentrantLock = this.f17058d;
        reentrantLock.lock();
        try {
            Object obj = this.f17059e;
            x xVar = b.a;
            if (obj != xVar) {
                this.f17059e = xVar;
                i.s sVar = i.s.a;
                return obj;
            }
            Object objC = c();
            if (objC == null) {
                objC = b.f17041d;
            }
            return objC;
        } finally {
            reentrantLock.unlock();
        }
    }
}