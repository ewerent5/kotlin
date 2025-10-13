package j$;

import java.util.function.IntToLongFunction;

/* renamed from: j$.a0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0235a0 implements IntToLongFunction {
    final /* synthetic */ j$.util.function.z a;

    private /* synthetic */ C0235a0(j$.util.function.z zVar) {
        this.a = zVar;
    }

    public static /* synthetic */ IntToLongFunction a(j$.util.function.z zVar) {
        if (zVar == null) {
            return null;
        }
        return zVar instanceof Z ? ((Z) zVar).a : new C0235a0(zVar);
    }

    @Override // java.util.function.IntToLongFunction
    public /* synthetic */ long applyAsLong(int i2) {
        return this.a.applyAsLong(i2);
    }
}