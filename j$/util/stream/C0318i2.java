package j$.util.stream;

import j$.util.function.BiConsumer;

/* JADX INFO: Add missing generic type declarations: [R, T] */
/* renamed from: j$.util.stream.i2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0318i2<R, T> extends AbstractC0373w2<T, R, C0322j2> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BiConsumer f16307b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BiConsumer f16308c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ j$.util.function.J f16309d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0318i2(U2 u2, BiConsumer biConsumer, BiConsumer biConsumer2, j$.util.function.J j2) {
        super(u2);
        this.f16307b = biConsumer;
        this.f16308c = biConsumer2;
        this.f16309d = j2;
    }

    @Override // j$.util.stream.AbstractC0373w2
    public InterfaceC0365u2 a() {
        return new C0322j2(this.f16309d, this.f16308c, this.f16307b);
    }
}