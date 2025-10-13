package j$;

import java.util.function.ObjDoubleConsumer;

/* renamed from: j$.s0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0270s0 implements ObjDoubleConsumer {
    final /* synthetic */ j$.util.function.G a;

    private /* synthetic */ C0270s0(j$.util.function.G g2) {
        this.a = g2;
    }

    public static /* synthetic */ ObjDoubleConsumer a(j$.util.function.G g2) {
        if (g2 == null) {
            return null;
        }
        return g2 instanceof C0268r0 ? ((C0268r0) g2).a : new C0270s0(g2);
    }

    @Override // java.util.function.ObjDoubleConsumer
    public /* synthetic */ void accept(Object obj, double d2) {
        this.a.accept(obj, d2);
    }
}