package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.C0273a;
import java.util.Objects;

/* loaded from: classes2.dex */
public final /* synthetic */ class O implements BiConsumer {
    public static final /* synthetic */ O a = ;

    private /* synthetic */ O() {
    }

    @Override // j$.util.function.BiConsumer
    public BiConsumer a(BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        return new C0273a(this, biConsumer);
    }

    @Override // j$.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        long[] jArr = (long[]) obj;
        long[] jArr2 = (long[]) obj2;
        jArr[0] = jArr[0] + jArr2[0];
        jArr[1] = jArr[1] + jArr2[1];
    }
}