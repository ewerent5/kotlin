package j$.util.stream;

/* renamed from: j$.util.stream.k2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0326k2 extends AbstractC0373w2<Integer, Integer, C0330l2> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j$.util.function.v f16322b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f16323c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0326k2(U2 u2, j$.util.function.v vVar, int i2) {
        super(u2);
        this.f16322b = vVar;
        this.f16323c = i2;
    }

    @Override // j$.util.stream.AbstractC0373w2
    public InterfaceC0365u2 a() {
        return new C0330l2(this.f16323c, this.f16322b);
    }
}