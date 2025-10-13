package j$.util.stream;

import j$.util.function.BiFunction;
import j$.util.function.C0277e;
import j$.util.function.Consumer;
import java.util.Objects;

/* JADX INFO: Add missing generic type declarations: [T, U] */
/* renamed from: j$.util.stream.d2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0298d2<T, U> extends AbstractC0369v2<U> implements InterfaceC0365u2<T, U, C0298d2> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f16272b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BiFunction f16273c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ j$.util.function.n f16274d;

    C0298d2(Object obj, BiFunction biFunction, j$.util.function.n nVar) {
        this.f16272b = obj;
        this.f16273c = biFunction;
        this.f16274d = nVar;
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
        this.a = this.f16273c.apply(this.a, obj);
    }

    @Override // j$.util.function.Consumer
    public Consumer e(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new C0277e(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0365u2
    public void i(InterfaceC0365u2 interfaceC0365u2) {
        this.a = this.f16274d.apply(this.a, ((C0298d2) interfaceC0365u2).a);
    }

    @Override // j$.util.stream.A2
    public void m() {
    }

    @Override // j$.util.stream.A2
    public void n(long j2) {
        this.a = this.f16272b;
    }

    @Override // j$.util.stream.A2
    public /* synthetic */ boolean o() {
        return false;
    }
}