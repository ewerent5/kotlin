package j$.util.stream;

import j$.util.function.C0277e;
import j$.util.function.Consumer;
import java.util.Objects;

/* loaded from: classes2.dex */
abstract class M1<T> implements A2<T> {
    boolean a;

    /* renamed from: b, reason: collision with root package name */
    boolean f16146b;

    M1(N1 n1) {
        this.f16146b = !n1.f16150c;
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
    public /* synthetic */ void accept(long j2) {
        j$.time.a.b(this);
        throw null;
    }

    @Override // j$.util.function.Consumer
    public Consumer e(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new C0277e(this, consumer);
    }

    @Override // j$.util.stream.A2
    public void m() {
    }

    @Override // j$.util.stream.A2
    public void n(long j2) {
    }

    @Override // j$.util.stream.A2
    public boolean o() {
        return this.a;
    }
}