package j$.util.stream;

import j$.util.function.C0277e;
import j$.util.function.Consumer;
import java.util.Objects;

/* loaded from: classes2.dex */
public final /* synthetic */ class G0 implements Consumer {
    public static final /* synthetic */ G0 a = ;

    private /* synthetic */ G0() {
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