package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.C0273a;
import java.util.Objects;

/* renamed from: j$.util.stream.x0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0375x0 implements BiConsumer {
    public static final /* synthetic */ C0375x0 a = ;

    private /* synthetic */ C0375x0() {
    }

    @Override // j$.util.function.BiConsumer
    public BiConsumer a(BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        return new C0273a(this, biConsumer);
    }

    @Override // j$.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        ((j$.util.n) obj).b((j$.util.n) obj2);
    }
}