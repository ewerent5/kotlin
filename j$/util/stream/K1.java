package j$.util.stream;

import j$.C0253j0;
import j$.util.function.C0280h;
import j$.util.stream.A2;
import java.util.Objects;

/* loaded from: classes2.dex */
class K1 extends M1<Long> implements A2.g {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ N1 f16142c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ j$.util.function.E f16143d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    K1(N1 n1, j$.util.function.E e2) {
        super(n1);
        this.f16142c = n1;
        this.f16143d = e2;
    }

    @Override // j$.util.stream.M1, j$.util.stream.A2
    public void accept(long j2) {
        if (this.a || ((C0253j0) this.f16143d).b(j2) != this.f16142c.f16149b) {
            return;
        }
        this.a = true;
        this.f16146b = this.f16142c.f16150c;
    }

    @Override // j$.util.function.Consumer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void accept(Long l2) {
        Q1.c(this, l2);
    }

    @Override // j$.util.function.C
    public j$.util.function.C f(j$.util.function.C c2) {
        Objects.requireNonNull(c2);
        return new C0280h(this, c2);
    }
}