package j$.util.stream;

import j$.util.function.Predicate;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
class I1<T> extends M1<T> {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ N1 f16137c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Predicate f16138d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    I1(N1 n1, Predicate predicate) {
        super(n1);
        this.f16137c = n1;
        this.f16138d = predicate;
    }

    @Override // j$.util.function.Consumer
    public void accept(Object obj) {
        if (this.a || this.f16138d.test(obj) != this.f16137c.f16149b) {
            return;
        }
        this.a = true;
        this.f16146b = this.f16137c.f16150c;
    }
}