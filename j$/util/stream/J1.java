package j$.util.stream;

import j$.util.function.C0279g;
import j$.util.stream.A2;
import java.util.Objects;

/* loaded from: classes2.dex */
class J1 extends M1<Integer> implements A2.f {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ N1 f16140c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ j$.util.function.y f16141d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    J1(N1 n1, j$.util.function.y yVar) {
        super(n1);
        this.f16140c = n1;
        this.f16141d = yVar;
    }

    @Override // j$.util.stream.M1, j$.util.stream.A2, j$.util.function.w
    public void accept(int i2) {
        if (this.a || ((j$.V) this.f16141d).b(i2) != this.f16140c.f16149b) {
            return;
        }
        this.a = true;
        this.f16146b = this.f16140c.f16150c;
    }

    @Override // j$.util.function.Consumer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void accept(Integer num) {
        Q1.b(this, num);
    }

    @Override // j$.util.function.w
    public j$.util.function.w l(j$.util.function.w wVar) {
        Objects.requireNonNull(wVar);
        return new C0279g(this, wVar);
    }
}