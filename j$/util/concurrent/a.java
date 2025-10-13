package j$.util.concurrent;

import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.C0273a;
import java.util.Objects;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements BiConsumer {
    public final /* synthetic */ ConcurrentMap a;

    /* renamed from: b */
    public final /* synthetic */ BiFunction f16070b;

    public /* synthetic */ a(ConcurrentMap concurrentMap, BiFunction biFunction) {
        concurrentMap = concurrentMap;
        biFunction = biFunction;
    }

    @Override // j$.util.function.BiConsumer
    public BiConsumer a(BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        return new C0273a(this, biConsumer);
    }

    @Override // j$.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        ConcurrentMap concurrentMap = concurrentMap;
        BiFunction biFunction = biFunction;
        while (!concurrentMap.replace(obj, obj2, biFunction.apply(obj, obj2)) && (obj2 = concurrentMap.get(obj)) != null) {
        }
    }
}