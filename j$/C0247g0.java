package j$;

import java.util.function.LongConsumer;

/* renamed from: j$.g0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0247g0 implements LongConsumer {
    final /* synthetic */ j$.util.function.C a;

    private /* synthetic */ C0247g0(j$.util.function.C c2) {
        this.a = c2;
    }

    public static /* synthetic */ LongConsumer a(j$.util.function.C c2) {
        if (c2 == null) {
            return null;
        }
        return c2 instanceof C0245f0 ? ((C0245f0) c2).a : new C0247g0(c2);
    }

    @Override // java.util.function.LongConsumer
    public /* synthetic */ void accept(long j2) {
        this.a.accept(j2);
    }

    @Override // java.util.function.LongConsumer
    public /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return a(this.a.f(C0245f0.b(longConsumer)));
    }
}