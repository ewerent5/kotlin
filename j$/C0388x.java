package j$;

import java.util.function.Consumer;

/* renamed from: j$.x */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0388x implements Consumer {
    final /* synthetic */ j$.util.function.Consumer a;

    private /* synthetic */ C0388x(j$.util.function.Consumer consumer) {
        this.a = consumer;
    }

    public static /* synthetic */ Consumer a(j$.util.function.Consumer consumer) {
        if (consumer == null) {
            return null;
        }
        return consumer instanceof C0387w ? ((C0387w) consumer).a : new C0388x(consumer);
    }

    @Override // java.util.function.Consumer
    public /* synthetic */ void accept(Object obj) {
        this.a.accept(obj);
    }

    @Override // java.util.function.Consumer
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return a(this.a.e(C0387w.b(consumer)));
    }
}