package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.C0273a;
import java.util.LinkedHashSet;
import java.util.Objects;

/* renamed from: j$.util.stream.i */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0315i implements BiConsumer {
    public static final /* synthetic */ C0315i a = ;

    private /* synthetic */ C0315i() {
    }

    @Override // j$.util.function.BiConsumer
    public BiConsumer a(BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        return new C0273a(this, biConsumer);
    }

    @Override // j$.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
    }
}