package j$;

import java.util.function.ObjLongConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class w0 implements ObjLongConsumer {
    final /* synthetic */ j$.util.function.I a;

    private /* synthetic */ w0(j$.util.function.I i2) {
        this.a = i2;
    }

    public static /* synthetic */ ObjLongConsumer a(j$.util.function.I i2) {
        if (i2 == null) {
            return null;
        }
        return i2 instanceof v0 ? ((v0) i2).a : new w0(i2);
    }

    @Override // java.util.function.ObjLongConsumer
    public /* synthetic */ void accept(Object obj, long j2) {
        this.a.accept(obj, j2);
    }
}