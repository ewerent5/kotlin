package j$.util.stream;

import j$.util.function.C0277e;
import j$.util.function.C0278f;
import j$.util.function.Consumer;
import j$.util.stream.A2;
import java.util.Objects;

/* JADX INFO: Add missing generic type declarations: [R] */
/* renamed from: j$.util.stream.b2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0290b2<R> extends AbstractC0369v2<R> implements InterfaceC0365u2<Double, R, C0290b2>, A2.e {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j$.util.function.J f16260b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ j$.util.function.G f16261c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ j$.util.function.n f16262d;

    C0290b2(j$.util.function.J j2, j$.util.function.G g2, j$.util.function.n nVar) {
        this.f16260b = j2;
        this.f16261c = g2;
        this.f16262d = nVar;
    }

    @Override // j$.util.stream.A2
    public void accept(double d2) {
        this.f16261c.accept(this.a, d2);
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

    @Override // j$.util.stream.InterfaceC0365u2
    public void i(InterfaceC0365u2 interfaceC0365u2) {
        this.a = this.f16262d.apply(this.a, ((C0290b2) interfaceC0365u2).a);
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
        this.a = this.f16260b.get();
    }

    @Override // j$.util.stream.A2
    public /* synthetic */ boolean o() {
        return false;
    }
}