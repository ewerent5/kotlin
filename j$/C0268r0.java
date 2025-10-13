package j$;

import java.util.function.ObjDoubleConsumer;

/* renamed from: j$.r0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0268r0 implements j$.util.function.G {
    final /* synthetic */ ObjDoubleConsumer a;

    private /* synthetic */ C0268r0(ObjDoubleConsumer objDoubleConsumer) {
        this.a = objDoubleConsumer;
    }

    public static /* synthetic */ j$.util.function.G a(ObjDoubleConsumer objDoubleConsumer) {
        if (objDoubleConsumer == null) {
            return null;
        }
        return objDoubleConsumer instanceof C0270s0 ? ((C0270s0) objDoubleConsumer).a : new C0268r0(objDoubleConsumer);
    }

    @Override // j$.util.function.G
    public /* synthetic */ void accept(Object obj, double d2) {
        this.a.accept(obj, d2);
    }
}