package j$;

import java.util.function.ObjIntConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class u0 implements ObjIntConsumer {
    final /* synthetic */ j$.util.function.H a;

    private /* synthetic */ u0(j$.util.function.H h2) {
        this.a = h2;
    }

    public static /* synthetic */ ObjIntConsumer a(j$.util.function.H h2) {
        if (h2 == null) {
            return null;
        }
        return h2 instanceof t0 ? ((t0) h2).a : new u0(h2);
    }

    @Override // java.util.function.ObjIntConsumer
    public /* synthetic */ void accept(Object obj, int i2) {
        this.a.accept(obj, i2);
    }
}