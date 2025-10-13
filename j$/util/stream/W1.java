package j$.util.stream;

/* loaded from: classes2.dex */
class W1 extends AbstractC0373w2<Double, Double, X1> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j$.util.function.p f16234b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ double f16235c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    W1(U2 u2, j$.util.function.p pVar, double d2) {
        super(u2);
        this.f16234b = pVar;
        this.f16235c = d2;
    }

    @Override // j$.util.stream.AbstractC0373w2
    public InterfaceC0365u2 a() {
        return new X1(this.f16235c, this.f16234b);
    }
}