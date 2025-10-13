package kotlinx.coroutines;

/* compiled from: JobSupport.kt */
/* loaded from: classes3.dex */
public final class r extends q1<v1> implements q {

    /* renamed from: i */
    public final s f17060i;

    public r(v1 v1Var, s sVar) {
        super(v1Var);
        this.f17060i = sVar;
    }

    @Override // kotlinx.coroutines.q
    public boolean c(Throwable th) {
        return ((v1) this.f17154h).G(th);
    }

    @Override // i.y.c.l
    public /* bridge */ /* synthetic */ i.s invoke(Throwable th) {
        z(th);
        return i.s.a;
    }

    @Override // kotlinx.coroutines.y
    public void z(Throwable th) {
        this.f17060i.v((c2) this.f17154h);
    }
}