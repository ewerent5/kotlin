package j$.util.stream;

import j$.util.function.C0277e;
import j$.util.function.C0279g;
import j$.util.function.Consumer;
import j$.util.stream.A2;
import java.util.Objects;

/* renamed from: j$.util.stream.l2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0330l2 implements InterfaceC0365u2<Integer, Integer, C0330l2>, A2.f {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f16324b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ j$.util.function.v f16325c;

    C0330l2(int i2, j$.util.function.v vVar) {
        this.f16324b = i2;
        this.f16325c = vVar;
    }

    @Override // j$.util.stream.A2
    public /* synthetic */ void accept(double d2) {
        j$.time.a.c(this);
        throw null;
    }

    @Override // j$.util.stream.A2, j$.util.function.w
    public void accept(int i2) {
        this.a = this.f16325c.applyAsInt(this.a, i2);
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

    @Override // j$.util.function.J
    public Object get() {
        return Integer.valueOf(this.a);
    }

    @Override // j$.util.stream.InterfaceC0365u2
    public void i(InterfaceC0365u2 interfaceC0365u2) {
        accept(((C0330l2) interfaceC0365u2).a);
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
        this.a = this.f16324b;
    }

    @Override // j$.util.stream.A2
    public /* synthetic */ boolean o() {
        return false;
    }
}