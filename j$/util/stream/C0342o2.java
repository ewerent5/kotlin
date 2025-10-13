package j$.util.stream;

/* JADX INFO: Add missing generic type declarations: [R] */
/* renamed from: j$.util.stream.o2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0342o2<R> extends AbstractC0373w2<Integer, R, C0346p2> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j$.util.function.n f16333b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ j$.util.function.H f16334c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ j$.util.function.J f16335d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0342o2(U2 u2, j$.util.function.n nVar, j$.util.function.H h2, j$.util.function.J j2) {
        super(u2);
        this.f16333b = nVar;
        this.f16334c = h2;
        this.f16335d = j2;
    }

    @Override // j$.util.stream.AbstractC0373w2
    public InterfaceC0365u2 a() {
        return new C0346p2(this.f16335d, this.f16334c, this.f16333b);
    }
}