package j$.util.stream;

import j$.C0261n0;
import j$.util.stream.A2;
import j$.util.stream.AbstractC0384z1;

/* loaded from: classes2.dex */
class E1 extends AbstractC0384z1.k<Long> {

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ C0261n0 f16128l;

    class a extends A2.c<Integer> {
        a(A2 a2) {
            super(a2);
        }

        @Override // j$.util.stream.A2.g, j$.util.stream.A2
        public void accept(long j2) {
            this.a.accept(E1.this.f16128l.a(j2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    E1(D1 d1, AbstractC0313h1 abstractC0313h1, U2 u2, int i2, C0261n0 c0261n0) {
        super(abstractC0313h1, u2, i2);
        this.f16128l = c0261n0;
    }

    @Override // j$.util.stream.AbstractC0313h1
    A2 G0(int i2, A2 a2) {
        return new a(a2);
    }
}