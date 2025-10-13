package j$;

import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final /* synthetic */ class A0 implements Supplier {
    final /* synthetic */ j$.util.function.J a;

    private /* synthetic */ A0(j$.util.function.J j2) {
        this.a = j2;
    }

    public static /* synthetic */ Supplier a(j$.util.function.J j2) {
        if (j2 == null) {
            return null;
        }
        return j2 instanceof z0 ? ((z0) j2).a : new A0(j2);
    }

    @Override // java.util.function.Supplier
    public /* synthetic */ Object get() {
        return this.a.get();
    }
}