package j$;

import java.util.function.LongFunction;

/* renamed from: j$.i0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0251i0 implements LongFunction {
    final /* synthetic */ j$.util.function.D a;

    private /* synthetic */ C0251i0(j$.util.function.D d2) {
        this.a = d2;
    }

    public static /* synthetic */ LongFunction a(j$.util.function.D d2) {
        if (d2 == null) {
            return null;
        }
        return d2 instanceof C0249h0 ? ((C0249h0) d2).a : new C0251i0(d2);
    }

    @Override // java.util.function.LongFunction
    public /* synthetic */ Object apply(long j2) {
        return this.a.apply(j2);
    }
}