package j$.util.stream;

import j$.util.function.C0277e;
import j$.util.function.C0279g;
import j$.util.function.Consumer;
import j$.util.stream.A2;
import java.util.Objects;

/* renamed from: j$.util.stream.e */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0299e implements A2.f {
    public /* synthetic */ C0299e() {
    }

    @Override // j$.util.stream.A2
    public /* synthetic */ void accept(double d2) {
        j$.time.a.c(this);
        throw null;
    }

    @Override // j$.util.stream.A2.f, j$.util.stream.A2, j$.util.function.w
    public final void accept(int i2) {
        wVar.accept(i2);
    }

    @Override // j$.util.stream.A2
    public /* synthetic */ void accept(long j2) {
        j$.time.a.b(this);
        throw null;
    }

    @Override // j$.util.function.Consumer
    /* renamed from: b */
    public /* synthetic */ void accept(Integer num) {
        Q1.b(this, num);
    }

    @Override // j$.util.function.Consumer
    public Consumer e(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new C0277e(this, consumer);
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
    }

    @Override // j$.util.stream.A2
    public /* synthetic */ boolean o() {
        return false;
    }
}