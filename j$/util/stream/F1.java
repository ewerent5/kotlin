package j$.util.stream;

import j$.C0257l0;
import j$.util.stream.A2;
import j$.util.stream.AbstractC0345p1;

/* loaded from: classes2.dex */
class F1 extends AbstractC0345p1.i<Long> {

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ C0257l0 f16131l;

    class a extends A2.c<Double> {
        a(A2 a2) {
            super(a2);
        }

        @Override // j$.util.stream.A2.g, j$.util.stream.A2
        public void accept(long j2) {
            this.a.accept(F1.this.f16131l.a(j2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    F1(D1 d1, AbstractC0313h1 abstractC0313h1, U2 u2, int i2, C0257l0 c0257l0) {
        super(abstractC0313h1, u2, i2);
        this.f16131l = c0257l0;
    }

    @Override // j$.util.stream.AbstractC0313h1
    A2 G0(int i2, A2 a2) {
        return new a(a2);
    }
}