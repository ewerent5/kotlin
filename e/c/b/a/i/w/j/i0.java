package e.c.b.a.i.w.j;

import android.content.Context;

/* compiled from: SchemaManager_Factory.java */
/* loaded from: classes.dex */
public final class i0 implements e.c.b.a.i.t.a.b<h0> {
    private final h.a.a<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final h.a.a<String> f14327b;

    /* renamed from: c, reason: collision with root package name */
    private final h.a.a<Integer> f14328c;

    public i0(h.a.a<Context> aVar, h.a.a<String> aVar2, h.a.a<Integer> aVar3) {
        this.a = aVar;
        this.f14327b = aVar2;
        this.f14328c = aVar3;
    }

    public static i0 a(h.a.a<Context> aVar, h.a.a<String> aVar2, h.a.a<Integer> aVar3) {
        return new i0(aVar, aVar2, aVar3);
    }

    public static h0 c(Context context, String str, int i2) {
        return new h0(context, str, i2);
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public h0 get() {
        return c(this.a.get(), this.f14327b.get(), this.f14328c.get().intValue());
    }
}