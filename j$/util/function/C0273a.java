package j$.util.function;

import java.util.Objects;

/* renamed from: j$.util.function.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0273a implements BiConsumer {
    public final /* synthetic */ BiConsumer a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BiConsumer f16072b;

    public /* synthetic */ C0273a(BiConsumer biConsumer, BiConsumer biConsumer2) {
        this.a = biConsumer;
        this.f16072b = biConsumer2;
    }

    @Override // j$.util.function.BiConsumer
    public BiConsumer a(BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        return new C0273a(this, biConsumer);
    }

    @Override // j$.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        BiConsumer biConsumer = this.a;
        BiConsumer biConsumer2 = this.f16072b;
        biConsumer.accept(obj, obj2);
        biConsumer2.accept(obj, obj2);
    }
}