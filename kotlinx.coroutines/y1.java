package kotlinx.coroutines;

/* compiled from: MainCoroutineDispatcher.kt */
/* loaded from: classes3.dex */
public abstract class y1 extends d0 {
    public abstract y1 b0();

    protected final String h0() {
        y1 y1VarB0;
        y1 y1VarC = t0.c();
        if (this == y1VarC) {
            return "Dispatchers.Main";
        }
        try {
            y1VarB0 = y1VarC.b0();
        } catch (UnsupportedOperationException unused) {
            y1VarB0 = null;
        }
        if (this == y1VarB0) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // kotlinx.coroutines.d0
    public String toString() {
        String strH0 = h0();
        if (strH0 != null) {
            return strH0;
        }
        return n0.a(this) + '@' + n0.b(this);
    }
}