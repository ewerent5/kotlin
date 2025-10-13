package i.v.j.a;

/* compiled from: ContinuationImpl.kt */
/* loaded from: classes3.dex */
public abstract class j extends a {
    public j(i.v.d<Object> dVar) {
        super(dVar);
        if (dVar != null) {
            if (!(dVar.getContext() == i.v.h.f15852e)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // i.v.d
    public i.v.g getContext() {
        return i.v.h.f15852e;
    }
}