package j$;

import java.util.function.LongFunction;

/* renamed from: j$.h0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0249h0 implements j$.util.function.D {
    final /* synthetic */ LongFunction a;

    private /* synthetic */ C0249h0(LongFunction longFunction) {
        this.a = longFunction;
    }

    public static /* synthetic */ j$.util.function.D a(LongFunction longFunction) {
        if (longFunction == null) {
            return null;
        }
        return longFunction instanceof C0251i0 ? ((C0251i0) longFunction).a : new C0249h0(longFunction);
    }

    @Override // j$.util.function.D
    public /* synthetic */ Object apply(long j2) {
        return this.a.apply(j2);
    }
}