package j$.util.stream;

import j$.util.function.C0277e;
import j$.util.function.C0280h;
import j$.util.function.Consumer;
import j$.util.stream.A2;
import java.util.Objects;

/* renamed from: j$.util.stream.r2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0353r2 implements InterfaceC0365u2<Long, Long, C0353r2>, A2.g {
    private long a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f16355b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ j$.util.function.B f16356c;

    C0353r2(long j2, j$.util.function.B b2) {
        this.f16355b = j2;
        this.f16356c = b2;
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
        this.a = this.f16356c.applyAsLong(this.a, j2);
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

    @Override // j$.util.function.J
    public Object get() {
        return Long.valueOf(this.a);
    }

    @Override // j$.util.stream.InterfaceC0365u2
    public void i(InterfaceC0365u2 interfaceC0365u2) {
        accept(((C0353r2) interfaceC0365u2).a);
    }

    @Override // j$.util.stream.A2
    public void m() {
    }

    @Override // j$.util.stream.A2
    public void n(long j2) {
        this.a = this.f16355b;
    }

    @Override // j$.util.stream.A2
    public /* synthetic */ boolean o() {
        return false;
    }
}