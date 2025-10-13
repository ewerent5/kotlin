package kotlinx.coroutines;

/* compiled from: Builders.common.kt */
/* loaded from: classes3.dex */
final class n2<T> extends kotlinx.coroutines.internal.v<T> {
    public n2(i.v.g gVar, i.v.d<? super T> dVar) {
        super(gVar, dVar);
    }

    @Override // kotlinx.coroutines.internal.v, kotlinx.coroutines.a
    protected void B0(Object obj) {
        Object objA = a0.a(obj, this.f17001h);
        i.v.g context = this.f17001h.getContext();
        Object objC = kotlinx.coroutines.internal.b0.c(context, null);
        try {
            this.f17001h.e(objA);
            i.s sVar = i.s.a;
        } finally {
            kotlinx.coroutines.internal.b0.a(context, objC);
        }
    }
}