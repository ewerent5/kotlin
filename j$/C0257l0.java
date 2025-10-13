package j$;

import java.util.function.LongToDoubleFunction;

/* renamed from: j$.l0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0257l0 {
    final /* synthetic */ LongToDoubleFunction a;

    private /* synthetic */ C0257l0(LongToDoubleFunction longToDoubleFunction) {
        this.a = longToDoubleFunction;
    }

    public static /* synthetic */ C0257l0 b(LongToDoubleFunction longToDoubleFunction) {
        if (longToDoubleFunction == null) {
            return null;
        }
        return longToDoubleFunction instanceof C0259m0 ? ((C0259m0) longToDoubleFunction).a : new C0257l0(longToDoubleFunction);
    }

    public double a(long j2) {
        return this.a.applyAsDouble(j2);
    }
}