package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* renamed from: j$.util.stream.v1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0368v1<P_IN, P_OUT, O> extends AbstractC0317i1<P_IN, P_OUT, O, C0368v1<P_IN, P_OUT, O>> {

    /* renamed from: j, reason: collision with root package name */
    private final C0360t1 f16366j;

    C0368v1(C0360t1 c0360t1, T1 t1, Spliterator spliterator) {
        super(t1, spliterator);
        this.f16366j = c0360t1;
    }

    C0368v1(C0368v1 c0368v1, Spliterator spliterator) {
        super(c0368v1, spliterator);
        this.f16366j = c0368v1.f16366j;
    }

    private void m(Object obj) {
        boolean z;
        AbstractC0325k1 abstractC0325k1 = this;
        while (true) {
            if (abstractC0325k1 != null) {
                AbstractC0325k1 abstractC0325k1C = abstractC0325k1.c();
                if (abstractC0325k1C != null && abstractC0325k1C.f16319e != abstractC0325k1) {
                    z = false;
                    break;
                }
                abstractC0325k1 = abstractC0325k1C;
            } else {
                z = true;
                break;
            }
        }
        if (z) {
            l(obj);
        } else {
            j();
        }
    }

    @Override // j$.util.stream.AbstractC0325k1
    protected Object a() {
        T1 t1 = this.f16316b;
        h3 h3Var = (h3) this.f16366j.f16362e.get();
        t1.t0(h3Var, this.f16317c);
        Object obj = h3Var.get();
        if (!this.f16366j.f16359b) {
            if (obj != null) {
                l(obj);
            }
            return null;
        }
        if (obj == null) {
            return null;
        }
        m(obj);
        return obj;
    }

    @Override // j$.util.stream.AbstractC0325k1
    protected AbstractC0325k1 f(Spliterator spliterator) {
        return new C0368v1(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0317i1
    protected Object k() {
        return this.f16366j.f16360c;
    }

    @Override // j$.util.stream.AbstractC0325k1, java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        if (this.f16366j.f16359b) {
            C0368v1 c0368v1 = (C0368v1) this.f16319e;
            C0368v1 c0368v12 = null;
            while (true) {
                if (c0368v1 != c0368v12) {
                    Object objB = c0368v1.b();
                    if (objB != null && this.f16366j.f16361d.test(objB)) {
                        g(objB);
                        m(objB);
                        break;
                    } else {
                        c0368v12 = c0368v1;
                        c0368v1 = (C0368v1) this.f16320f;
                    }
                } else {
                    break;
                }
            }
        }
        this.f16317c = null;
        this.f16320f = null;
        this.f16319e = null;
    }
}