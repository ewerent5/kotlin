package e.c.b.a.i.w;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;

/* compiled from: SchedulingModule_WorkSchedulerFactory.java */
/* loaded from: classes.dex */
public final class i implements e.c.b.a.i.t.a.b<s> {
    private final h.a.a<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final h.a.a<e.c.b.a.i.w.j.c> f14295b;

    /* renamed from: c, reason: collision with root package name */
    private final h.a.a<com.google.android.datatransport.runtime.scheduling.jobscheduling.g> f14296c;

    /* renamed from: d, reason: collision with root package name */
    private final h.a.a<e.c.b.a.i.y.a> f14297d;

    public i(h.a.a<Context> aVar, h.a.a<e.c.b.a.i.w.j.c> aVar2, h.a.a<com.google.android.datatransport.runtime.scheduling.jobscheduling.g> aVar3, h.a.a<e.c.b.a.i.y.a> aVar4) {
        this.a = aVar;
        this.f14295b = aVar2;
        this.f14296c = aVar3;
        this.f14297d = aVar4;
    }

    public static i a(h.a.a<Context> aVar, h.a.a<e.c.b.a.i.w.j.c> aVar2, h.a.a<com.google.android.datatransport.runtime.scheduling.jobscheduling.g> aVar3, h.a.a<e.c.b.a.i.y.a> aVar4) {
        return new i(aVar, aVar2, aVar3, aVar4);
    }

    public static s c(Context context, e.c.b.a.i.w.j.c cVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.g gVar, e.c.b.a.i.y.a aVar) {
        return (s) e.c.b.a.i.t.a.d.c(h.a(context, cVar, gVar, aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public s get() {
        return c(this.a.get(), this.f14295b.get(), this.f14296c.get(), this.f14297d.get());
    }
}