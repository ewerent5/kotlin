package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.C0273a;
import java.util.LinkedHashSet;
import java.util.Objects;

/* loaded from: classes2.dex */
public final /* synthetic */ class M0 implements BiConsumer {
    public static final /* synthetic */ M0 a = ;

    private /* synthetic */ M0() {
    }

    @Override // j$.util.function.BiConsumer
    public BiConsumer a(BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        return new C0273a(this, biConsumer);
    }

    @Override // j$.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        ((LinkedHashSet) obj).add(obj2);
    }
}