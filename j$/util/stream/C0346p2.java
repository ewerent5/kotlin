package j$.util.stream;

import j$.util.function.C0277e;
import j$.util.function.C0279g;
import j$.util.function.Consumer;
import j$.util.stream.A2;
import java.util.Objects;

/* JADX INFO: Add missing generic type declarations: [R] */
/* renamed from: j$.util.stream.p2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0346p2<R> extends AbstractC0369v2<R> implements InterfaceC0365u2<Integer, R, C0346p2>, A2.f {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j$.util.function.J f16348b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ j$.util.function.H f16349c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ j$.util.function.n f16350d;

    C0346p2(j$.util.function.J j2, j$.util.function.H h2, j$.util.function.n nVar) {
        this.f16348b = j2;
        this.f16349c = h2;
        this.f16350d = nVar;
    }

    @Override // j$.util.stream.A2
    public /* synthetic */ void accept(double d2) {
        j$.time.a.c(this);
        throw null;
    }

    @Override // j$.util.stream.A2, j$.util.function.w
    public void accept(int i2) {
        this.f16349c.accept(this.a, i2);
    }

    @Override // j$.util.stream.A2
    public /* synthetic */ void accept(long j2) {
        j$.time.a.b(this);
        throw null;
    }

    @Override // j$.util.function.Consumer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void accept(Integer num) {
        Q1.b(this, num);
    }

    @Override // j$.util.function.Consumer
    public Consumer e(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new C0277e(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0365u2
    public void i(InterfaceC0365u2 interfaceC0365u2) {
        this.a = this.f16350d.apply(this.a, ((C0346p2) interfaceC0365u2).a);
    }

    @Override // j$.util.function.w
    public j$.util.function.w l(j$.util.function.w wVar) {
        Objects.requireNonNull(wVar);
        return new C0279g(this, wVar);
    }

    @Override // j$.util.stream.A2
    public void m() {
    }

    @Override // j$.util.stream.A2
    public void n(long j2) {
        this.a = this.f16348b.get();
    }

    @Override // j$.util.stream.A2
    public /* synthetic */ boolean o() {
        return false;
    }
}