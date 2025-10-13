package j$;

import j$.util.function.Consumer;

/* renamed from: j$.w */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0387w implements Consumer {
    final /* synthetic */ java.util.function.Consumer a;

    private /* synthetic */ C0387w(java.util.function.Consumer consumer) {
        this.a = consumer;
    }

    public static /* synthetic */ Consumer b(java.util.function.Consumer consumer) {
        if (consumer == null) {
            return null;
        }
        return consumer instanceof C0388x ? ((C0388x) consumer).a : new C0387w(consumer);
    }

    @Override // j$.util.function.Consumer
    public /* synthetic */ void accept(Object obj) {
        this.a.accept(obj);
    }

    @Override // j$.util.function.Consumer
    public /* synthetic */ Consumer e(Consumer consumer) {
        return b(this.a.andThen(C0388x.a(consumer)));
    }
}