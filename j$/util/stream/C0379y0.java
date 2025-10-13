package j$.util.stream;

import j$.util.function.C0277e;
import j$.util.function.Consumer;
import java.util.Objects;

/* renamed from: j$.util.stream.y0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0379y0 implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ Consumer f16379b;

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        this.a.f(consumer, obj);
    }

    @Override // j$.util.function.Consumer
    public Consumer e(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new C0277e(this, consumer);
    }
}