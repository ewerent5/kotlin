package j$.util.stream;

/* renamed from: j$.util.stream.m2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0334m2 extends AbstractC0373w2<Integer, j$.util.q, C0338n2> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j$.util.function.v f16327b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0334m2(U2 u2, j$.util.function.v vVar) {
        super(u2);
        this.f16327b = vVar;
    }

    @Override // j$.util.stream.AbstractC0373w2
    public InterfaceC0365u2 a() {
        return new C0338n2(this.f16327b);
    }
}