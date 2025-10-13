package j$.util.stream;

import j$.util.function.C0277e;
import j$.util.function.Consumer;
import java.util.List;
import java.util.Objects;

/* renamed from: j$.util.stream.b1 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0289b1 implements Consumer {
    public final /* synthetic */ List a;

    public /* synthetic */ C0289b1(List list) {
        arrayList = list;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        arrayList.add(obj);
    }

    @Override // j$.util.function.Consumer
    public Consumer e(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new C0277e(this, consumer);
    }
}