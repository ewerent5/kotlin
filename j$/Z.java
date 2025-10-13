package j$;

import java.util.function.IntToLongFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class Z implements j$.util.function.z {
    final /* synthetic */ IntToLongFunction a;

    private /* synthetic */ Z(IntToLongFunction intToLongFunction) {
        this.a = intToLongFunction;
    }

    public static /* synthetic */ j$.util.function.z a(IntToLongFunction intToLongFunction) {
        if (intToLongFunction == null) {
            return null;
        }
        return intToLongFunction instanceof C0235a0 ? ((C0235a0) intToLongFunction).a : new Z(intToLongFunction);
    }

    @Override // j$.util.function.z
    public /* synthetic */ long applyAsLong(int i2) {
        return this.a.applyAsLong(i2);
    }
}