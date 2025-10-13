package j$.util.stream;

import j$.util.function.BiFunction;

/* JADX INFO: Add missing generic type declarations: [T, U] */
/* renamed from: j$.util.stream.c2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0294c2<T, U> extends AbstractC0373w2<T, U, C0298d2> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j$.util.function.n f16264b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BiFunction f16265c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Object f16266d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0294c2(U2 u2, j$.util.function.n nVar, BiFunction biFunction, Object obj) {
        super(u2);
        this.f16264b = nVar;
        this.f16265c = biFunction;
        this.f16266d = obj;
    }

    @Override // j$.util.stream.AbstractC0373w2
    public InterfaceC0365u2 a() {
        return new C0298d2(this.f16266d, this.f16265c, this.f16264b);
    }
}