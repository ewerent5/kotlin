package j$.util.stream;

import j$.util.function.C0277e;
import j$.util.function.Consumer;
import java.util.Objects;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: j$.util.stream.f2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0306f2<T> implements InterfaceC0365u2<T, j$.util.o<T>, C0306f2> {
    private boolean a;

    /* renamed from: b, reason: collision with root package name */
    private Object f16285b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ j$.util.function.n f16286c;

    C0306f2(j$.util.function.n nVar) {
        this.f16286c = nVar;
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
        if (this.a) {
            this.a = false;
        } else {
            obj = this.f16286c.apply(this.f16285b, obj);
        }
        this.f16285b = obj;
    }

    @Override // j$.util.function.Consumer
    public Consumer e(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new C0277e(this, consumer);
    }

    @Override // j$.util.function.J
    public Object get() {
        return this.a ? j$.util.o.a() : j$.util.o.d(this.f16285b);
    }

    @Override // j$.util.stream.InterfaceC0365u2
    public void i(InterfaceC0365u2 interfaceC0365u2) {
        C0306f2 c0306f2 = (C0306f2) interfaceC0365u2;
        if (c0306f2.a) {
            return;
        }
        accept(c0306f2.f16285b);
    }

    @Override // j$.util.stream.A2
    public void m() {
    }

    @Override // j$.util.stream.A2
    public void n(long j2) {
        this.a = true;
        this.f16285b = null;
    }

    @Override // j$.util.stream.A2
    public /* synthetic */ boolean o() {
        return false;
    }
}