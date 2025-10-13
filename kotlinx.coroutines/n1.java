package kotlinx.coroutines;

/* compiled from: JobSupport.kt */
/* loaded from: classes3.dex */
final class n1 extends u1<o1> {

    /* renamed from: i, reason: collision with root package name */
    private final i.y.c.l<Throwable, i.s> f17021i;

    /* JADX WARN: Multi-variable type inference failed */
    public n1(o1 o1Var, i.y.c.l<? super Throwable, i.s> lVar) {
        super(o1Var);
        this.f17021i = lVar;
    }

    @Override // i.y.c.l
    public /* bridge */ /* synthetic */ i.s invoke(Throwable th) {
        z(th);
        return i.s.a;
    }

    @Override // kotlinx.coroutines.y
    public void z(Throwable th) {
        this.f17021i.invoke(th);
    }
}