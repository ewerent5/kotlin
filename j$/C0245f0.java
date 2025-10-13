package j$;

import java.util.function.LongConsumer;

/* renamed from: j$.f0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0245f0 implements j$.util.function.C {
    final /* synthetic */ LongConsumer a;

    private /* synthetic */ C0245f0(LongConsumer longConsumer) {
        this.a = longConsumer;
    }

    public static /* synthetic */ j$.util.function.C b(LongConsumer longConsumer) {
        if (longConsumer == null) {
            return null;
        }
        return longConsumer instanceof C0247g0 ? ((C0247g0) longConsumer).a : new C0245f0(longConsumer);
    }

    @Override // j$.util.function.C
    public /* synthetic */ void accept(long j2) {
        this.a.accept(j2);
    }

    @Override // j$.util.function.C
    public /* synthetic */ j$.util.function.C f(j$.util.function.C c2) {
        return b(this.a.andThen(C0247g0.a(c2)));
    }
}