package kotlinx.coroutines.q2;

import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.internal.x;
import kotlinx.coroutines.m0;

/* compiled from: ArrayChannel.kt */
/* loaded from: classes3.dex */
public class e<E> extends a<E> {

    /* renamed from: d, reason: collision with root package name */
    private final ReentrantLock f17047d;

    /* renamed from: e, reason: collision with root package name */
    private Object[] f17048e;

    /* renamed from: f, reason: collision with root package name */
    private int f17049f;

    /* renamed from: g, reason: collision with root package name */
    private final int f17050g;

    /* renamed from: h, reason: collision with root package name */
    private final f f17051h;
    private volatile int size;

    public e(int i2, f fVar, i.y.c.l<? super E, i.s> lVar) {
        super(lVar);
        this.f17050g = i2;
        this.f17051h = fVar;
        if (!(i2 >= 1)) {
            throw new IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + i2 + " was specified").toString());
        }
        this.f17047d = new ReentrantLock();
        Object[] objArr = new Object[Math.min(i2, 8)];
        i.t.g.k(objArr, b.a, 0, 0, 6, null);
        i.s sVar = i.s.a;
        this.f17048e = objArr;
        this.size = 0;
    }

    private final void w(int i2, E e2) {
        if (i2 < this.f17050g) {
            x(i2);
            Object[] objArr = this.f17048e;
            objArr[(this.f17049f + i2) % objArr.length] = e2;
            return;
        }
        if (m0.a()) {
            if (!(this.f17051h == f.DROP_OLDEST)) {
                throw new AssertionError();
            }
        }
        Object[] objArr2 = this.f17048e;
        int i3 = this.f17049f;
        objArr2[i3 % objArr2.length] = null;
        objArr2[(i2 + i3) % objArr2.length] = e2;
        this.f17049f = (i3 + 1) % objArr2.length;
    }

    private final void x(int i2) {
        Object[] objArr = this.f17048e;
        if (i2 >= objArr.length) {
            int iMin = Math.min(objArr.length * 2, this.f17050g);
            Object[] objArr2 = new Object[iMin];
            for (int i3 = 0; i3 < i2; i3++) {
                Object[] objArr3 = this.f17048e;
                objArr2[i3] = objArr3[(this.f17049f + i3) % objArr3.length];
            }
            i.t.g.i(objArr2, b.a, i2, iMin);
            this.f17048e = objArr2;
            this.f17049f = 0;
        }
    }

    private final x y(int i2) {
        if (i2 < this.f17050g) {
            this.size = i2 + 1;
            return null;
        }
        int i3 = d.a[this.f17051h.ordinal()];
        if (i3 == 1) {
            return b.f17040c;
        }
        if (i3 == 2) {
            return b.f17039b;
        }
        if (i3 == 3) {
            return null;
        }
        throw new i.k();
    }

    @Override // kotlinx.coroutines.q2.c
    protected String b() {
        return "(buffer:capacity=" + this.f17050g + ",size=" + this.size + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // kotlinx.coroutines.q2.c
    protected Object h(E e2) {
        q<E> qVarK;
        x xVarH;
        ReentrantLock reentrantLock = this.f17047d;
        reentrantLock.lock();
        try {
            int i2 = this.size;
            j<?> jVarC = c();
            if (jVarC != null) {
                return jVarC;
            }
            x xVarY = y(i2);
            if (xVarY != null) {
                return xVarY;
            }
            if (i2 == 0) {
                do {
                    qVarK = k();
                    if (qVarK != null) {
                        if (qVarK instanceof j) {
                            this.size = i2;
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
                this.size = i2;
                i.s sVar = i.s.a;
                reentrantLock.unlock();
                i.y.d.l.b(qVarK);
                qVarK.g(e2);
                i.y.d.l.b(qVarK);
                return qVarK.a();
            }
            w(i2, e2);
            return b.f17039b;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.q2.a
    protected boolean p(o<? super E> oVar) {
        ReentrantLock reentrantLock = this.f17047d;
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
        return this.size == 0;
    }

    @Override // kotlinx.coroutines.q2.a
    protected Object u() {
        ReentrantLock reentrantLock = this.f17047d;
        reentrantLock.lock();
        try {
            int i2 = this.size;
            if (i2 == 0) {
                Object objC = c();
                if (objC == null) {
                    objC = b.f17041d;
                }
                return objC;
            }
            Object[] objArr = this.f17048e;
            int i3 = this.f17049f;
            Object obj = objArr[i3];
            s sVar = null;
            objArr[i3] = null;
            this.size = i2 - 1;
            Object objA = b.f17041d;
            if (i2 == this.f17050g) {
                s sVar2 = null;
                while (true) {
                    s sVarL = l();
                    if (sVarL == null) {
                        sVar = sVar2;
                        break;
                    }
                    i.y.d.l.b(sVarL);
                    x xVarB = sVarL.B(null);
                    if (xVarB != null) {
                        if (m0.a()) {
                            if (!(xVarB == kotlinx.coroutines.m.a)) {
                                throw new AssertionError();
                            }
                        }
                        i.y.d.l.b(sVarL);
                        objA = sVarL.A();
                        sVar = sVarL;
                        z = true;
                    } else {
                        i.y.d.l.b(sVarL);
                        sVarL.C();
                        sVar2 = sVarL;
                    }
                }
            }
            if (objA != b.f17041d && !(objA instanceof j)) {
                this.size = i2;
                Object[] objArr2 = this.f17048e;
                objArr2[(this.f17049f + i2) % objArr2.length] = objA;
            }
            this.f17049f = (this.f17049f + 1) % this.f17048e.length;
            i.s sVar3 = i.s.a;
            if (z) {
                i.y.d.l.b(sVar);
                sVar.z();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }
}