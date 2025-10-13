package j$.util.stream;

import j$.util.function.C0277e;
import j$.util.function.C0278f;
import j$.util.function.Consumer;
import j$.util.stream.A2;
import java.util.Objects;

/* loaded from: classes2.dex */
class Z1 implements InterfaceC0365u2<Double, j$.util.p, Z1>, A2.e {
    private boolean a;

    /* renamed from: b, reason: collision with root package name */
    private double f16255b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ j$.util.function.p f16256c;

    Z1(j$.util.function.p pVar) {
        this.f16256c = pVar;
    }

    @Override // j$.util.stream.A2
    public void accept(double d2) {
        if (this.a) {
            this.a = false;
        } else {
            d2 = this.f16256c.applyAsDouble(this.f16255b, d2);
        }
        this.f16255b = d2;
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
        return this.a ? j$.util.p.a() : j$.util.p.d(this.f16255b);
    }

    @Override // j$.util.stream.InterfaceC0365u2
    public void i(InterfaceC0365u2 interfaceC0365u2) {
        Z1 z1 = (Z1) interfaceC0365u2;
        if (z1.a) {
            return;
        }
        accept(z1.f16255b);
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
        this.a = true;
        this.f16255b = 0.0d;
    }

    @Override // j$.util.stream.A2
    public /* synthetic */ boolean o() {
        return false;
    }
}