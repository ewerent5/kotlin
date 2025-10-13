package j$.util.stream;

/* renamed from: j$.util.stream.s2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0357s2 extends AbstractC0373w2<Long, j$.util.r, C0361t2> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j$.util.function.B f16358b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0357s2(U2 u2, j$.util.function.B b2) {
        super(u2);
        this.f16358b = b2;
    }

    @Override // j$.util.stream.AbstractC0373w2
    public InterfaceC0365u2 a() {
        return new C0361t2(this.f16358b);
    }
}