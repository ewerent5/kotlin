package j$;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class Q implements j$.util.function.w {
    final /* synthetic */ IntConsumer a;

    private /* synthetic */ Q(IntConsumer intConsumer) {
        this.a = intConsumer;
    }

    public static /* synthetic */ j$.util.function.w b(IntConsumer intConsumer) {
        if (intConsumer == null) {
            return null;
        }
        return intConsumer instanceof S ? ((S) intConsumer).a : new Q(intConsumer);
    }

    @Override // j$.util.function.w
    public /* synthetic */ void accept(int i2) {
        this.a.accept(i2);
    }

    @Override // j$.util.function.w
    public /* synthetic */ j$.util.function.w l(j$.util.function.w wVar) {
        return b(this.a.andThen(S.a(wVar)));
    }
}