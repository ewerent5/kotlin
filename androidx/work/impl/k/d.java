package androidx.work.impl.k;

import android.content.Context;
import androidx.work.h;
import androidx.work.impl.k.e.c;
import androidx.work.impl.k.e.e;
import androidx.work.impl.k.e.f;
import androidx.work.impl.k.e.g;
import androidx.work.impl.l.j;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WorkConstraintsTracker.java */
/* loaded from: classes.dex */
public class d implements c.a {
    private static final String a = h.f("WorkConstraintsTracker");

    /* renamed from: b, reason: collision with root package name */
    private final c f2262b;

    /* renamed from: c, reason: collision with root package name */
    private final androidx.work.impl.k.e.c<?>[] f2263c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f2264d;

    public d(Context context, androidx.work.impl.utils.k.a aVar, c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f2262b = cVar;
        this.f2263c = new androidx.work.impl.k.e.c[]{new androidx.work.impl.k.e.a(applicationContext, aVar), new androidx.work.impl.k.e.b(applicationContext, aVar), new androidx.work.impl.k.e.h(applicationContext, aVar), new androidx.work.impl.k.e.d(applicationContext, aVar), new g(applicationContext, aVar), new f(applicationContext, aVar), new e(applicationContext, aVar)};
        this.f2264d = new Object();
    }

    @Override // androidx.work.impl.k.e.c.a
    public void a(List<String> list) {
        synchronized (this.f2264d) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (c(str)) {
                    h.c().a(a, String.format("Constraints met for %s", str), new Throwable[0]);
                    arrayList.add(str);
                }
            }
            c cVar = this.f2262b;
            if (cVar != null) {
                cVar.e(arrayList);
            }
        }
    }

    @Override // androidx.work.impl.k.e.c.a
    public void b(List<String> list) {
        synchronized (this.f2264d) {
            c cVar = this.f2262b;
            if (cVar != null) {
                cVar.b(list);
            }
        }
    }

    public boolean c(String str) {
        synchronized (this.f2264d) {
            for (androidx.work.impl.k.e.c<?> cVar : this.f2263c) {
                if (cVar.d(str)) {
                    h.c().a(a, String.format("Work %s constrained by %s", str, cVar.getClass().getSimpleName()), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    public void d(List<j> list) {
        synchronized (this.f2264d) {
            for (androidx.work.impl.k.e.c<?> cVar : this.f2263c) {
                cVar.g(null);
            }
            for (androidx.work.impl.k.e.c<?> cVar2 : this.f2263c) {
                cVar2.e(list);
            }
            for (androidx.work.impl.k.e.c<?> cVar3 : this.f2263c) {
                cVar3.g(this);
            }
        }
    }

    public void e() {
        synchronized (this.f2264d) {
            for (androidx.work.impl.k.e.c<?> cVar : this.f2263c) {
                cVar.f();
            }
        }
    }
}