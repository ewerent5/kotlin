package j$.util.stream;

import j$.util.function.C0277e;
import j$.util.function.C0278f;
import j$.util.function.Consumer;
import j$.util.stream.A2;
import java.util.Objects;

/* loaded from: classes2.dex */
class X1 implements InterfaceC0365u2<Double, Double, X1>, A2.e {
    private double a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ double f16244b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ j$.util.function.p f16245c;

    X1(double d2, j$.util.function.p pVar) {
        this.f16244b = d2;
        this.f16245c = pVar;
    }

    @Override // j$.util.stream.A2
    public void accept(double d2) {
        this.a = this.f16245c.applyAsDouble(this.a, d2);
    }

    @Override // j$.util.stream.A2, j$.util.function.w
    public /* synthetic */ void accept(int i2) {
        j$.time.a.a(this);
        throw null;
    }

    @Override // j$.util.stream.A2
    public /* synthetic */ void accept(long j2) {
        j$.time.a.b(this);
        throw null;
    }

    @Override // j$.util.function.Consumer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void accept(Double d2) {
        Q1.a(this, d2);
    }

    @Override // j$.util.function.Consumer
    public Consumer e(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new C0277e(this, consumer);
    }

    @Override // j$.util.function.J
    public Object get() {
        return Double.valueOf(this.a);
    }

    @Override // j$.util.stream.InterfaceC0365u2
    public void i(InterfaceC0365u2 interfaceC0365u2) {
        accept(((X1) interfaceC0365u2).a);
    }

    @Override // j$.util.function.q
    public j$.util.function.q k(j$.util.function.q qVar) {
        Objects.requireNonNull(qVar);
        return new C0278f(this, qVar);
    }

    @Override // j$.util.stream.A2
    public void m() {
    }

    @Override // j$.util.stream.A2
    public void n(long j2) {
        this.a = this.f16244b;
    }

    @Override // j$.util.stream.A2
    public /* synthetic */ boolean o() {
        return false;
    }
}