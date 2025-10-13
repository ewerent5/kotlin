package e.c.b.d.a.a;

import android.content.Context;
import e.c.b.d.a.b.h0;
import e.c.b.d.a.b.s;

/* loaded from: classes.dex */
public final class c implements h0<?> {
    private final h0 a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f15336b = 3;

    public c(h0<Context> h0Var, short[] sArr) {
        this.a = h0Var;
    }

    public static c b(h0<Context> h0Var) {
        return new c(h0Var, null);
    }

    @Override // e.c.b.d.a.b.h0
    public final /* bridge */ /* synthetic */ Object a() {
        int i2 = this.f15336b;
        if (i2 != 0) {
            return i2 != 1 ? i2 != 2 ? new e.c.b.d.a.e.a((Context) this.a.a()) : new e(((d) this.a).a()) : new a(((d) this.a).a());
        }
        b bVar = (b) this.a.a();
        s.d(bVar);
        return bVar;
    }
}