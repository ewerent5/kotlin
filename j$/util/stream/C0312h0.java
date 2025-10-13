package j$.util.stream;

import j$.util.function.C0277e;
import j$.util.function.Consumer;
import java.util.Objects;

/* renamed from: j$.util.stream.h0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0312h0 implements Consumer {
    public static final /* synthetic */ C0312h0 a = ;

    private /* synthetic */ C0312h0() {
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
    }

    @Override // j$.util.function.Consumer
    public Consumer e(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new C0277e(this, consumer);
    }
}