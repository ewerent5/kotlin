package j$;

import j$.util.function.BiConsumer;

/* renamed from: j$.q */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0266q implements BiConsumer {
    final /* synthetic */ java.util.function.BiConsumer a;

    private /* synthetic */ C0266q(java.util.function.BiConsumer biConsumer) {
        this.a = biConsumer;
    }

    public static /* synthetic */ BiConsumer b(java.util.function.BiConsumer biConsumer) {
        if (biConsumer == null) {
            return null;
        }
        return biConsumer instanceof r ? ((r) biConsumer).a : new C0266q(biConsumer);
    }

    @Override // j$.util.function.BiConsumer
    public /* synthetic */ BiConsumer a(BiConsumer biConsumer) {
        return b(this.a.andThen(r.a(biConsumer)));
    }

    @Override // j$.util.function.BiConsumer
    public /* synthetic */ void accept(Object obj, Object obj2) {
        this.a.accept(obj, obj2);
    }
}