package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.backends.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: Uploader.java */
/* loaded from: classes.dex */
public class m {
    private final Context a;

    /* renamed from: b */
    private final com.google.android.datatransport.runtime.backends.e f4419b;

    /* renamed from: c */
    private final e.c.b.a.i.w.j.c f4420c;

    /* renamed from: d */
    private final s f4421d;

    /* renamed from: e */
    private final Executor f4422e;

    /* renamed from: f */
    private final e.c.b.a.i.x.b f4423f;

    /* renamed from: g */
    private final e.c.b.a.i.y.a f4424g;

    public m(Context context, com.google.android.datatransport.runtime.backends.e eVar, e.c.b.a.i.w.j.c cVar, s sVar, Executor executor, e.c.b.a.i.x.b bVar, e.c.b.a.i.y.a aVar) {
        this.a = context;
        this.f4419b = eVar;
        this.f4420c = cVar;
        this.f4421d = sVar;
        this.f4422e = executor;
        this.f4423f = bVar;
        this.f4424g = aVar;
    }

    static /* synthetic */ Object c(m mVar, com.google.android.datatransport.runtime.backends.g gVar, Iterable iterable, e.c.b.a.i.m mVar2, int i2) {
        if (gVar.c() == g.a.TRANSIENT_ERROR) {
            mVar.f4420c.K0(iterable);
            mVar.f4421d.a(mVar2, i2 + 1);
            return null;
        }
        mVar.f4420c.m(iterable);
        if (gVar.c() == g.a.OK) {
            mVar.f4420c.G(mVar2, mVar.f4424g.a() + gVar.b());
        }
        if (!mVar.f4420c.F0(mVar2)) {
            return null;
        }
        mVar.f4421d.a(mVar2, 1);
        return null;
    }

    static /* synthetic */ Object d(m mVar, e.c.b.a.i.m mVar2, int i2) {
        mVar.f4421d.a(mVar2, i2 + 1);
        return null;
    }

    static /* synthetic */ void e(m mVar, e.c.b.a.i.m mVar2, int i2, Runnable runnable) {
        try {
            try {
                e.c.b.a.i.x.b bVar = mVar.f4423f;
                e.c.b.a.i.w.j.c cVar = mVar.f4420c;
                cVar.getClass();
                bVar.b(k.a(cVar));
                if (mVar.a()) {
                    mVar.f(mVar2, i2);
                } else {
                    mVar.f4423f.b(l.a(mVar, mVar2, i2));
                }
            } catch (e.c.b.a.i.x.a unused) {
                mVar.f4421d.a(mVar2, i2 + 1);
            }
        } finally {
            runnable.run();
        }
    }

    boolean a() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    void f(e.c.b.a.i.m mVar, int i2) {
        com.google.android.datatransport.runtime.backends.g gVarA;
        com.google.android.datatransport.runtime.backends.m mVar2 = this.f4419b.get(mVar.b());
        Iterable iterable = (Iterable) this.f4423f.b(i.a(this, mVar));
        if (iterable.iterator().hasNext()) {
            if (mVar2 == null) {
                e.c.b.a.i.u.a.a("Uploader", "Unknown backend for %s, deleting event batch for it...", mVar);
                gVarA = com.google.android.datatransport.runtime.backends.g.a();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((e.c.b.a.i.w.j.i) it.next()).b());
                }
                gVarA = mVar2.a(com.google.android.datatransport.runtime.backends.f.a().b(arrayList).c(mVar.c()).a());
            }
            this.f4423f.b(j.a(this, gVarA, iterable, mVar, i2));
        }
    }

    public void g(e.c.b.a.i.m mVar, int i2, Runnable runnable) {
        this.f4422e.execute(h.a(this, mVar, i2, runnable));
    }
}