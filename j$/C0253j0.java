package j$;

import java.util.function.LongPredicate;

/* renamed from: j$.j0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0253j0 implements j$.util.function.E {
    final /* synthetic */ LongPredicate a;

    private /* synthetic */ C0253j0(LongPredicate longPredicate) {
        this.a = longPredicate;
    }

    public static /* synthetic */ j$.util.function.E a(LongPredicate longPredicate) {
        if (longPredicate == null) {
            return null;
        }
        return longPredicate instanceof C0255k0 ? ((C0255k0) longPredicate).a : new C0253j0(longPredicate);
    }

    public /* synthetic */ boolean b(long j2) {
        return this.a.test(j2);
    }
}