package j$.util.stream;

/* renamed from: j$.util.stream.q2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0350q2 extends AbstractC0373w2<Long, Long, C0353r2> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j$.util.function.B f16353b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f16354c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0350q2(U2 u2, j$.util.function.B b2, long j2) {
        super(u2);
        this.f16353b = b2;
        this.f16354c = j2;
    }

    @Override // j$.util.stream.AbstractC0373w2
    public InterfaceC0365u2 a() {
        return new C0353r2(this.f16354c, this.f16353b);
    }
}