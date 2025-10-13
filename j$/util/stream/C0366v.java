package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.C0273a;
import java.util.Objects;

/* renamed from: j$.util.stream.v */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0366v implements BiConsumer {
    public static final /* synthetic */ C0366v a = ;

    private /* synthetic */ C0366v() {
    }

    @Override // j$.util.function.BiConsumer
    public BiConsumer a(BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        return new C0273a(this, biConsumer);
    }

    @Override // j$.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        double[] dArr = (double[]) obj;
        double[] dArr2 = (double[]) obj2;
        C0337n1.b(dArr, dArr2[0]);
        C0337n1.b(dArr, dArr2[1]);
        dArr[2] = dArr[2] + dArr2[2];
        dArr[3] = dArr[3] + dArr2[3];
    }
}