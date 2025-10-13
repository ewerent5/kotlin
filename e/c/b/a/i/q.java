package e.c.b.a.i;

import android.content.Context;
import java.util.Collections;
import java.util.Set;

/* compiled from: TransportRuntime.java */
/* loaded from: classes.dex */
public class q implements p {
    private static volatile r a;

    /* renamed from: b, reason: collision with root package name */
    private final e.c.b.a.i.y.a f14269b;

    /* renamed from: c, reason: collision with root package name */
    private final e.c.b.a.i.y.a f14270c;

    /* renamed from: d, reason: collision with root package name */
    private final e.c.b.a.i.w.e f14271d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.scheduling.jobscheduling.m f14272e;

    q(e.c.b.a.i.y.a aVar, e.c.b.a.i.y.a aVar2, e.c.b.a.i.w.e eVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.m mVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.q qVar) {
        this.f14269b = aVar;
        this.f14270c = aVar2;
        this.f14271d = eVar;
        this.f14272e = mVar;
        qVar.a();
    }

    private h b(l lVar) {
        return h.a().i(this.f14269b.a()).k(this.f14270c.a()).j(lVar.g()).h(new g(lVar.b(), lVar.d())).g(lVar.c().a()).d();
    }

    public static q c() {
        r rVar = a;
        if (rVar != null) {
            return rVar.c();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set<e.c.b.a.b> d(e eVar) {
        return eVar instanceof f ? Collections.unmodifiableSet(((f) eVar).a()) : Collections.singleton(e.c.b.a.b.b("proto"));
    }

    public static void f(Context context) {
        if (a == null) {
            synchronized (q.class) {
                if (a == null) {
                    a = d.d().b(context).a();
                }
            }
        }
    }

    @Override // e.c.b.a.i.p
    public void a(l lVar, e.c.b.a.h hVar) {
        this.f14271d.a(lVar.f().e(lVar.c().c()), b(lVar), hVar);
    }

    public com.google.android.datatransport.runtime.scheduling.jobscheduling.m e() {
        return this.f14272e;
    }

    public e.c.b.a.g g(e eVar) {
        return new n(d(eVar), m.a().b(eVar.getName()).c(eVar.getExtras()).a(), this);
    }
}