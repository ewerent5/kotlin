package j$.util.stream;

import j$.util.stream.A2;
import j$.util.stream.AbstractC0345p1;

/* loaded from: classes2.dex */
class A1 extends AbstractC0345p1.i<Integer> {

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ j$.X f16090l;

    class a extends A2.b<Double> {
        a(A2 a2) {
            super(a2);
        }

        @Override // j$.util.stream.A2.f, j$.util.stream.A2, j$.util.function.w
        public void accept(int i2) {
            this.a.accept(A1.this.f16090l.a(i2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    A1(AbstractC0384z1 abstractC0384z1, AbstractC0313h1 abstractC0313h1, U2 u2, int i2, j$.X x) {
        super(abstractC0313h1, u2, i2);
        this.f16090l = x;
    }

    @Override // j$.util.stream.AbstractC0313h1
    A2 G0(int i2, A2 a2) {
        return new a(a2);
    }
}