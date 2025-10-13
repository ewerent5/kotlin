package j$;

import java.util.function.LongToIntFunction;

/* renamed from: j$.n0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0261n0 {
    final /* synthetic */ LongToIntFunction a;

    private /* synthetic */ C0261n0(LongToIntFunction longToIntFunction) {
        this.a = longToIntFunction;
    }

    public static /* synthetic */ C0261n0 b(LongToIntFunction longToIntFunction) {
        if (longToIntFunction == null) {
            return null;
        }
        return longToIntFunction instanceof C0263o0 ? ((C0263o0) longToIntFunction).a : new C0261n0(longToIntFunction);
    }

    public int a(long j2) {
        return this.a.applyAsInt(j2);
    }
}