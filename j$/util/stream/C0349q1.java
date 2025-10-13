package j$.util.stream;

import j$.util.stream.A2;
import j$.util.stream.AbstractC0384z1;

/* renamed from: j$.util.stream.q1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0349q1 extends AbstractC0384z1.k<Double> {

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ j$.G f16351l;

    /* renamed from: j$.util.stream.q1$a */
    class a extends A2.a<Integer> {
        a(A2 a2) {
            super(a2);
        }

        @Override // j$.util.stream.A2.e, j$.util.stream.A2
        public void accept(double d2) {
            this.a.accept(C0349q1.this.f16351l.a(d2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0349q1(AbstractC0345p1 abstractC0345p1, AbstractC0313h1 abstractC0313h1, U2 u2, int i2, j$.G g2) {
        super(abstractC0313h1, u2, i2);
        this.f16351l = g2;
    }

    @Override // j$.util.stream.AbstractC0313h1
    A2 G0(int i2, A2 a2) {
        return new a(a2);
    }
}