package j$.util.function;

import java.util.Objects;

/* renamed from: j$.util.function.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0277e implements Consumer {
    public final /* synthetic */ Consumer a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Consumer f16074b;

    public /* synthetic */ C0277e(Consumer consumer, Consumer consumer2) {
        this.a = consumer;
        this.f16074b = consumer2;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        Consumer consumer = this.a;
        Consumer consumer2 = this.f16074b;
        consumer.accept(obj);
        consumer2.accept(obj);
    }

    @Override // j$.util.function.Consumer
    public Consumer e(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new C0277e(this, consumer);
    }
}