package j$;

import java.util.function.ObjLongConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class v0 implements j$.util.function.I {
    final /* synthetic */ ObjLongConsumer a;

    private /* synthetic */ v0(ObjLongConsumer objLongConsumer) {
        this.a = objLongConsumer;
    }

    public static /* synthetic */ j$.util.function.I a(ObjLongConsumer objLongConsumer) {
        if (objLongConsumer == null) {
            return null;
        }
        return objLongConsumer instanceof w0 ? ((w0) objLongConsumer).a : new v0(objLongConsumer);
    }

    @Override // j$.util.function.I
    public /* synthetic */ void accept(Object obj, long j2) {
        this.a.accept(obj, j2);
    }
}