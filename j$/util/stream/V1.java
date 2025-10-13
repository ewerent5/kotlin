package j$.util.stream;

import j$.util.function.C0277e;
import j$.util.function.C0280h;
import j$.util.function.Consumer;
import j$.util.stream.A2;
import java.util.Objects;

/* JADX INFO: Add missing generic type declarations: [R] */
/* loaded from: classes2.dex */
class V1<R> extends AbstractC0369v2<R> implements InterfaceC0365u2<Long, R, V1>, A2.g {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j$.util.function.J f16231b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ j$.util.function.I f16232c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ j$.util.function.n f16233d;

    V1(j$.util.function.J j2, j$.util.function.I i2, j$.util.function.n nVar) {
        this.f16231b = j2;
        this.f16232c = i2;
        this.f16233d = nVar;
    }

    @Override // j$.util.stream.A2
    public /* synthetic */ void accept(double d2) {
        j$.time.a.c(this);
        throw null;
    }

    @Override // j$.util.stream.A2, j$.util.function.w
    public /* synthetic */ void accept(int i2) {
        j$.time.a.a(this);
        throw null;
    }

    @Override // j$.util.stream.A2
    public void accept(long j2) {
        this.f16232c.accept(this.a, j2);
    }

    @Override // j$.util.function.Consumer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void accept(Long l2) {
        Q1.c(this, l2);
    }

    @Override // j$.util.function.Consumer
    public Consumer e(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new C0277e(this, consumer);
    }

    @Override // j$.util.function.C
    public j$.util.function.C f(j$.util.function.C c2) {
        Objects.requireNonNull(c2);
        return new C0280h(this, c2);
    }

    @Override // j$.util.stream.InterfaceC0365u2
    public void i(InterfaceC0365u2 interfaceC0365u2) {
        this.a = this.f16233d.apply(this.a, ((V1) interfaceC0365u2).a);
    }

    @Override // j$.util.stream.A2
    public void m() {
    }

    @Override // j$.util.stream.A2
    public void n(long j2) {
        this.a = this.f16231b.get();
    }

    @Override // j$.util.stream.A2
    public /* synthetic */ boolean o() {
        return false;
    }
}