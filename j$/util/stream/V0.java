package j$.util.stream;

import j$.util.function.C0277e;
import j$.util.function.C0280h;
import j$.util.function.Consumer;
import j$.util.stream.A2;
import java.util.Objects;

/* loaded from: classes2.dex */
public final /* synthetic */ class V0 implements A2.g {
    public /* synthetic */ V0() {
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

    @Override // j$.util.stream.A2.g, j$.util.stream.A2
    public final void accept(long j2) {
        c2.accept(j2);
    }

    @Override // j$.util.function.Consumer
    /* renamed from: b */
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