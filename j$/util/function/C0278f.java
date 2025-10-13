package j$.util.function;

import java.util.Objects;

/* renamed from: j$.util.function.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0278f implements q {
    public final /* synthetic */ q a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f16075b;

    public /* synthetic */ C0278f(q qVar, q qVar2) {
        this.a = qVar;
        this.f16075b = qVar2;
    }

    @Override // j$.util.function.q
    public final void accept(double d2) {
        q qVar = this.a;
        q qVar2 = this.f16075b;
        qVar.accept(d2);
        qVar2.accept(d2);
    }

    @Override // j$.util.function.q
    public q k(q qVar) {
        Objects.requireNonNull(qVar);
        return new C0278f(this, qVar);
    }
}