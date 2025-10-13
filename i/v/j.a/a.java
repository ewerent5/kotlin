package i.v.j.a;

import i.m;
import i.n;
import i.s;
import i.y.d.l;
import java.io.Serializable;

/* compiled from: ContinuationImpl.kt */
/* loaded from: classes3.dex */
public abstract class a implements i.v.d<Object>, e, Serializable {

    /* renamed from: e, reason: collision with root package name */
    private final i.v.d<Object> f15866e;

    public a(i.v.d<Object> dVar) {
        this.f15866e = dVar;
    }

    @Override // i.v.j.a.e
    public e c() {
        i.v.d<Object> dVar = this.f15866e;
        if (!(dVar instanceof e)) {
            dVar = null;
        }
        return (e) dVar;
    }

    @Override // i.v.d
    public final void e(Object obj) {
        Object objP;
        a aVar = this;
        while (true) {
            h.b(aVar);
            i.v.d<Object> dVar = aVar.f15866e;
            l.b(dVar);
            try {
                objP = aVar.p(obj);
            } catch (Throwable th) {
                m.a aVar2 = m.f15825e;
                obj = m.a(n.a(th));
            }
            if (objP == i.v.i.d.c()) {
                return;
            }
            m.a aVar3 = m.f15825e;
            obj = m.a(objP);
            aVar.q();
            if (!(dVar instanceof a)) {
                dVar.e(obj);
                return;
            }
            aVar = (a) dVar;
        }
    }

    public i.v.d<s> g(Object obj, i.v.d<?> dVar) {
        l.d(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // i.v.j.a.e
    public StackTraceElement h() {
        return g.d(this);
    }

    public final i.v.d<Object> o() {
        return this.f15866e;
    }

    protected abstract Object p(Object obj);

    protected void q() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object objH = h();
        if (objH == null) {
            objH = getClass().getName();
        }
        sb.append(objH);
        return sb.toString();
    }
}