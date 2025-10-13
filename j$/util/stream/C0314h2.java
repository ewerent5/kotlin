package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.C0277e;
import j$.util.function.Consumer;
import java.util.Objects;

/* JADX INFO: Add missing generic type declarations: [T, I] */
/* renamed from: j$.util.stream.h2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0314h2<I, T> extends AbstractC0369v2<I> implements InterfaceC0365u2<T, I, C0314h2> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j$.util.function.J f16302b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BiConsumer f16303c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ j$.util.function.n f16304d;

    C0314h2(j$.util.function.J j2, BiConsumer biConsumer, j$.util.function.n nVar) {
        this.f16302b = j2;
        this.f16303c = biConsumer;
        this.f16304d = nVar;
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
    public void accept(Object obj) {
        this.f16303c.accept(this.a, obj);
    }

    @Override // j$.util.function.Consumer
    public Consumer e(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new C0277e(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0365u2
    public void i(InterfaceC0365u2 interfaceC0365u2) {
        this.a = this.f16304d.apply(this.a, ((C0314h2) interfaceC0365u2).a);
    }

    @Override // j$.util.stream.A2
    public void m() {
    }

    @Override // j$.util.stream.A2
    public void n(long j2) {
        this.a = this.f16302b.get();
    }

    @Override // j$.util.stream.A2
    public /* synthetic */ boolean o() {
        return false;
    }
}