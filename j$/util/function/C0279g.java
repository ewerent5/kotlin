package j$.util.function;

import java.util.Objects;

/* renamed from: j$.util.function.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0279g implements w {
    public final /* synthetic */ w a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f16076b;

    public /* synthetic */ C0279g(w wVar, w wVar2) {
        this.a = wVar;
        this.f16076b = wVar2;
    }

    @Override // j$.util.function.w
    public final void accept(int i2) {
        w wVar = this.a;
        w wVar2 = this.f16076b;
        wVar.accept(i2);
        wVar2.accept(i2);
    }

    @Override // j$.util.function.w
    public w l(w wVar) {
        Objects.requireNonNull(wVar);
        return new C0279g(this, wVar);
    }
}