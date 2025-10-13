package kotlinx.coroutines.r2;

import i.s;
import i.y.c.p;

/* compiled from: Builders.kt */
/* loaded from: classes3.dex */
final class h<T> extends a<T> {
    private final p<d<? super T>, i.v.d<? super s>, Object> a;

    /* JADX WARN: Multi-variable type inference failed */
    public h(p<? super d<? super T>, ? super i.v.d<? super s>, ? extends Object> pVar) {
        this.a = pVar;
    }

    @Override // kotlinx.coroutines.r2.a
    public Object b(d<? super T> dVar, i.v.d<? super s> dVar2) {
        Object objI = this.a.i(dVar, dVar2);
        return objI == i.v.i.d.c() ? objI : s.a;
    }
}