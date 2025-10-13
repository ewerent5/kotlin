package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.j2;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.x0;

/* compiled from: DispatchedContinuation.kt */
/* loaded from: classes3.dex */
public final class e<T> extends q0<T> implements i.v.j.a.e, i.v.d<T> {

    /* renamed from: h */
    private static final AtomicReferenceFieldUpdater f16964h = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: i */
    public Object f16965i;

    /* renamed from: j */
    private final i.v.j.a.e f16966j;

    /* renamed from: k */
    public final Object f16967k;

    /* renamed from: l */
    public final kotlinx.coroutines.d0 f16968l;

    /* renamed from: m */
    public final i.v.d<T> f16969m;

    /* JADX WARN: Multi-variable type inference failed */
    public e(kotlinx.coroutines.d0 d0Var, i.v.d<? super T> dVar) {
        super(-1);
        this.f16968l = d0Var;
        this.f16969m = dVar;
        this.f16965i = f.a;
        this.f16966j = dVar instanceof i.v.j.a.e ? dVar : (i.v.d<? super T>) null;
        this.f16967k = b0.b(getContext());
        this._reusableCancellableContinuation = null;
    }

    @Override // kotlinx.coroutines.q0
    public void b(Object obj, Throwable th) {
        if (obj instanceof kotlinx.coroutines.x) {
            ((kotlinx.coroutines.x) obj).f17177b.invoke(th);
        }
    }

    @Override // i.v.j.a.e
    public i.v.j.a.e c() {
        return this.f16966j;
    }

    @Override // kotlinx.coroutines.q0
    public i.v.d<T> d() {
        return this;
    }

    @Override // i.v.d
    public void e(Object obj) {
        i.v.g context = this.f16969m.getContext();
        Object objD = kotlinx.coroutines.a0.d(obj, null, 1, null);
        if (this.f16968l.a0(context)) {
            this.f16965i = objD;
            this.f17031g = 0;
            this.f16968l.Z(context, this);
            return;
        }
        m0.a();
        x0 x0VarB = j2.f17004b.b();
        if (x0VarB.v0()) {
            this.f16965i = objD;
            this.f17031g = 0;
            x0VarB.k0(this);
            return;
        }
        x0VarB.q0(true);
        try {
            i.v.g context2 = getContext();
            Object objC = b0.c(context2, this.f16967k);
            try {
                this.f16969m.e(obj);
                i.s sVar = i.s.a;
                while (x0VarB.G0()) {
                }
            } finally {
                b0.a(context2, objC);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // i.v.d
    public i.v.g getContext() {
        return this.f16969m.getContext();
    }

    @Override // i.v.j.a.e
    public StackTraceElement h() {
        return null;
    }

    @Override // kotlinx.coroutines.q0
    public Object p() {
        Object obj = this.f16965i;
        if (m0.a()) {
            if (!(obj != f.a)) {
                throw new AssertionError();
            }
        }
        this.f16965i = f.a;
        return obj;
    }

    public final Throwable q(kotlinx.coroutines.k<?> kVar) {
        x xVar;
        do {
            Object obj = this._reusableCancellableContinuation;
            xVar = f.f16970b;
            if (obj != xVar) {
                if (obj == null) {
                    return null;
                }
                if (obj instanceof Throwable) {
                    if (f16964h.compareAndSet(this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!f16964h.compareAndSet(this, xVar, kVar));
        return null;
    }

    public final kotlinx.coroutines.l<T> r() {
        Object obj;
        do {
            obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = f.f16970b;
                return null;
            }
            if (!(obj instanceof kotlinx.coroutines.l)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!f16964h.compareAndSet(this, obj, f.f16970b));
        return (kotlinx.coroutines.l) obj;
    }

    public final kotlinx.coroutines.l<?> s() {
        Object obj = this._reusableCancellableContinuation;
        if (!(obj instanceof kotlinx.coroutines.l)) {
            obj = null;
        }
        return (kotlinx.coroutines.l) obj;
    }

    public final boolean t(kotlinx.coroutines.l<?> lVar) {
        Object obj = this._reusableCancellableContinuation;
        if (obj != null) {
            return !(obj instanceof kotlinx.coroutines.l) || obj == lVar;
        }
        return false;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f16968l + ", " + n0.c(this.f16969m) + ']';
    }

    public final boolean u(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            x xVar = f.f16970b;
            if (i.y.d.l.a(obj, xVar)) {
                if (f16964h.compareAndSet(this, xVar, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (f16964h.compareAndSet(this, obj, null)) {
                    return false;
                }
            }
        }
    }
}