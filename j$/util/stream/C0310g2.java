package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.stream.InterfaceC0333m1;

/* JADX INFO: Add missing generic type declarations: [T, I] */
/* renamed from: j$.util.stream.g2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0310g2<I, T> extends AbstractC0373w2<T, I, C0314h2> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j$.util.function.n f16288b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BiConsumer f16289c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ j$.util.function.J f16290d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC0333m1 f16291e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0310g2(U2 u2, j$.util.function.n nVar, BiConsumer biConsumer, j$.util.function.J j2, InterfaceC0333m1 interfaceC0333m1) {
        super(u2);
        this.f16288b = nVar;
        this.f16289c = biConsumer;
        this.f16290d = j2;
        this.f16291e = interfaceC0333m1;
    }

    @Override // j$.util.stream.AbstractC0373w2
    public InterfaceC0365u2 a() {
        return new C0314h2(this.f16290d, this.f16289c, this.f16288b);
    }

    @Override // j$.util.stream.AbstractC0373w2, j$.util.stream.g3
    public int b() {
        if (this.f16291e.characteristics().contains(InterfaceC0333m1.a.UNORDERED)) {
            return T2.f16227m;
        }
        return 0;
    }
}