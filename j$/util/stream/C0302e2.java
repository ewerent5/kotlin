package j$.util.stream;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: j$.util.stream.e2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0302e2<T> extends AbstractC0373w2<T, j$.util.o<T>, C0306f2> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j$.util.function.n f16283b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0302e2(U2 u2, j$.util.function.n nVar) {
        super(u2);
        this.f16283b = nVar;
    }

    @Override // j$.util.stream.AbstractC0373w2
    public InterfaceC0365u2 a() {
        return new C0306f2(this.f16283b);
    }
}