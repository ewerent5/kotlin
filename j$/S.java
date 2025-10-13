package j$;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class S implements IntConsumer {
    final /* synthetic */ j$.util.function.w a;

    private /* synthetic */ S(j$.util.function.w wVar) {
        this.a = wVar;
    }

    public static /* synthetic */ IntConsumer a(j$.util.function.w wVar) {
        if (wVar == null) {
            return null;
        }
        return wVar instanceof Q ? ((Q) wVar).a : new S(wVar);
    }

    @Override // java.util.function.IntConsumer
    public /* synthetic */ void accept(int i2) {
        this.a.accept(i2);
    }

    @Override // java.util.function.IntConsumer
    public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return a(this.a.l(Q.b(intConsumer)));
    }
}