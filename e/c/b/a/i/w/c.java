package e.c.b.a.i.w;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;
import e.c.b.a.i.m;
import e.c.b.a.i.q;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* compiled from: DefaultScheduler.java */
/* loaded from: classes.dex */
public class c implements e {
    private static final Logger a = Logger.getLogger(q.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private final s f14286b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f14287c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.backends.e f14288d;

    /* renamed from: e, reason: collision with root package name */
    private final e.c.b.a.i.w.j.c f14289e;

    /* renamed from: f, reason: collision with root package name */
    private final e.c.b.a.i.x.b f14290f;

    public c(Executor executor, com.google.android.datatransport.runtime.backends.e eVar, s sVar, e.c.b.a.i.w.j.c cVar, e.c.b.a.i.x.b bVar) {
        this.f14287c = executor;
        this.f14288d = eVar;
        this.f14286b = sVar;
        this.f14289e = cVar;
        this.f14290f = bVar;
    }

    static /* synthetic */ Object b(c cVar, m mVar, e.c.b.a.i.h hVar) {
        cVar.f14289e.z0(mVar, hVar);
        cVar.f14286b.a(mVar, 1);
        return null;
    }

    static /* synthetic */ void c(c cVar, m mVar, e.c.b.a.h hVar, e.c.b.a.i.h hVar2) {
        try {
            com.google.android.datatransport.runtime.backends.m mVar2 = cVar.f14288d.get(mVar.b());
            if (mVar2 != null) {
                cVar.f14290f.b(b.a(cVar, mVar, mVar2.b(hVar2)));
                hVar.a(null);
            } else {
                String str = String.format("Transport backend '%s' is not registered", mVar.b());
                a.warning(str);
                hVar.a(new IllegalArgumentException(str));
            }
        } catch (Exception e2) {
            a.warning("Error scheduling event " + e2.getMessage());
            hVar.a(e2);
        }
    }

    @Override // e.c.b.a.i.w.e
    public void a(m mVar, e.c.b.a.i.h hVar, e.c.b.a.h hVar2) {
        this.f14287c.execute(a.a(this, mVar, hVar2, hVar));
    }
}