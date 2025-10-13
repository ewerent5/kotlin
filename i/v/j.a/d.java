package i.v.j.a;

import i.v.g;
import i.y.d.l;

/* compiled from: ContinuationImpl.kt */
/* loaded from: classes3.dex */
public abstract class d extends a {

    /* renamed from: f, reason: collision with root package name */
    private transient i.v.d<Object> f15868f;

    /* renamed from: g, reason: collision with root package name */
    private final i.v.g f15869g;

    public d(i.v.d<Object> dVar, i.v.g gVar) {
        super(dVar);
        this.f15869g = gVar;
    }

    @Override // i.v.d
    public i.v.g getContext() {
        i.v.g gVar = this.f15869g;
        l.b(gVar);
        return gVar;
    }

    @Override // i.v.j.a.a
    protected void q() {
        i.v.d<?> dVar = this.f15868f;
        if (dVar != null && dVar != this) {
            g.b bVar = getContext().get(i.v.e.f15850b);
            l.b(bVar);
            ((i.v.e) bVar).d(dVar);
        }
        this.f15868f = c.f15867e;
    }

    public final i.v.d<Object> r() {
        i.v.d<Object> dVarG = this.f15868f;
        if (dVarG == null) {
            i.v.e eVar = (i.v.e) getContext().get(i.v.e.f15850b);
            if (eVar == null || (dVarG = eVar.g(this)) == null) {
                dVarG = this;
            }
            this.f15868f = dVarG;
        }
        return dVarG;
    }

    public d(i.v.d<Object> dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}