package j$.util.stream;

import j$.util.function.C0278f;
import j$.util.stream.A2;
import java.util.Objects;

/* loaded from: classes2.dex */
class L1 extends M1<Double> implements A2.e {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ N1 f16144c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ j$.util.function.s f16145d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    L1(N1 n1, j$.util.function.s sVar) {
        super(n1);
        this.f16144c = n1;
        this.f16145d = sVar;
    }

    @Override // j$.util.stream.M1, j$.util.stream.A2
    public void accept(double d2) {
        if (this.a || ((j$.E) this.f16145d).b(d2) != this.f16144c.f16149b) {
            return;
        }
        this.a = true;
        this.f16146b = this.f16144c.f16150c;
    }

    @Override // j$.util.function.Consumer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void accept(Double d2) {
        Q1.a(this, d2);
    }

    @Override // j$.util.function.q
    public j$.util.function.q k(j$.util.function.q qVar) {
        Objects.requireNonNull(qVar);
        return new C0278f(this, qVar);
    }
}