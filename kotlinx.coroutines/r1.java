package kotlinx.coroutines;

/* compiled from: JobSupport.kt */
/* loaded from: classes3.dex */
public class r1 extends v1 implements u {

    /* renamed from: f, reason: collision with root package name */
    private final boolean f17061f;

    public r1(o1 o1Var) {
        super(true);
        Y(o1Var);
        this.f17061f = B0();
    }

    private final boolean B0() {
        v1 v1Var;
        q qVarS = S();
        if (!(qVarS instanceof r)) {
            qVarS = null;
        }
        r rVar = (r) qVarS;
        if (rVar != null && (v1Var = (v1) rVar.f17154h) != null) {
            while (!v1Var.P()) {
                q qVarS2 = v1Var.S();
                if (!(qVarS2 instanceof r)) {
                    qVarS2 = null;
                }
                r rVar2 = (r) qVarS2;
                if (rVar2 == null || (v1Var = (v1) rVar2.f17154h) == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.v1
    public boolean P() {
        return this.f17061f;
    }

    @Override // kotlinx.coroutines.v1
    public boolean Q() {
        return true;
    }
}