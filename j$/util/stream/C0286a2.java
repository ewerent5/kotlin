package j$.util.stream;

/* JADX INFO: Add missing generic type declarations: [R] */
/* renamed from: j$.util.stream.a2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0286a2<R> extends AbstractC0373w2<Double, R, C0290b2> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j$.util.function.n f16257b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ j$.util.function.G f16258c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ j$.util.function.J f16259d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0286a2(U2 u2, j$.util.function.n nVar, j$.util.function.G g2, j$.util.function.J j2) {
        super(u2);
        this.f16257b = nVar;
        this.f16258c = g2;
        this.f16259d = j2;
    }

    @Override // j$.util.stream.AbstractC0373w2
    public InterfaceC0365u2 a() {
        return new C0290b2(this.f16259d, this.f16258c, this.f16257b);
    }
}