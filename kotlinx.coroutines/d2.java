package kotlinx.coroutines;

import i.m;

/* compiled from: JobSupport.kt */
/* loaded from: classes3.dex */
final class d2 extends u1<o1> {

    /* renamed from: i, reason: collision with root package name */
    private final i.v.d<i.s> f16940i;

    /* JADX WARN: Multi-variable type inference failed */
    public d2(o1 o1Var, i.v.d<? super i.s> dVar) {
        super(o1Var);
        this.f16940i = dVar;
    }

    @Override // i.y.c.l
    public /* bridge */ /* synthetic */ i.s invoke(Throwable th) {
        z(th);
        return i.s.a;
    }

    @Override // kotlinx.coroutines.y
    public void z(Throwable th) {
        i.v.d<i.s> dVar = this.f16940i;
        i.s sVar = i.s.a;
        m.a aVar = i.m.f15825e;
        dVar.e(i.m.a(sVar));
    }
}