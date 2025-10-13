package j$.util.stream;

/* JADX INFO: Add missing generic type declarations: [R] */
/* loaded from: classes2.dex */
class U1<R> extends AbstractC0373w2<Long, R, V1> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j$.util.function.n f16228b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ j$.util.function.I f16229c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ j$.util.function.J f16230d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    U1(U2 u2, j$.util.function.n nVar, j$.util.function.I i2, j$.util.function.J j2) {
        super(u2);
        this.f16228b = nVar;
        this.f16229c = i2;
        this.f16230d = j2;
    }

    @Override // j$.util.stream.AbstractC0373w2
    public InterfaceC0365u2 a() {
        return new V1(this.f16230d, this.f16229c, this.f16228b);
    }
}