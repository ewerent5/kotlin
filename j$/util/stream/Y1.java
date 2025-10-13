package j$.util.stream;

/* loaded from: classes2.dex */
class Y1 extends AbstractC0373w2<Double, j$.util.p, Z1> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j$.util.function.p f16251b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Y1(U2 u2, j$.util.function.p pVar) {
        super(u2);
        this.f16251b = pVar;
    }

    @Override // j$.util.stream.AbstractC0373w2
    public InterfaceC0365u2 a() {
        return new Z1(this.f16251b);
    }
}