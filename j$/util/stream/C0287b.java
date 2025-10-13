package j$.util.stream;

import j$.util.function.C0277e;
import j$.util.function.Consumer;
import java.util.Objects;

/* renamed from: j$.util.stream.b */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0287b implements Consumer {
    public /* synthetic */ C0287b() {
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        a2.accept(obj);
    }

    @Override // j$.util.function.Consumer
    public Consumer e(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new C0277e(this, consumer);
    }
}