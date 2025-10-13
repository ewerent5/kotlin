package kotlinx.coroutines;

/* compiled from: Unconfined.kt */
/* loaded from: classes3.dex */
public final class m2 extends d0 {

    /* renamed from: f, reason: collision with root package name */
    public static final m2 f17020f = new m2();

    private m2() {
    }

    @Override // kotlinx.coroutines.d0
    public void Z(i.v.g gVar, Runnable runnable) {
        o2 o2Var = (o2) gVar.get(o2.f17026e);
        if (o2Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        o2Var.f17027f = true;
    }

    @Override // kotlinx.coroutines.d0
    public boolean a0(i.v.g gVar) {
        return false;
    }

    @Override // kotlinx.coroutines.d0
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}