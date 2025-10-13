package androidx.work.impl.k.f;

import android.content.Context;
import androidx.work.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: ConstraintTracker.java */
/* loaded from: classes.dex */
public abstract class d<T> {
    private static final String a = h.f("ConstraintTracker");

    /* renamed from: b, reason: collision with root package name */
    protected final androidx.work.impl.utils.k.a f2274b;

    /* renamed from: c, reason: collision with root package name */
    protected final Context f2275c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f2276d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final Set<androidx.work.impl.k.a<T>> f2277e = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    T f2278f;

    /* compiled from: ConstraintTracker.java */
    class a implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f2279e;

        a(List list) {
            this.f2279e = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f2279e.iterator();
            while (it.hasNext()) {
                ((androidx.work.impl.k.a) it.next()).a(d.this.f2278f);
            }
        }
    }

    d(Context context, androidx.work.impl.utils.k.a aVar) {
        this.f2275c = context.getApplicationContext();
        this.f2274b = aVar;
    }

    public void a(androidx.work.impl.k.a<T> aVar) {
        synchronized (this.f2276d) {
            if (this.f2277e.add(aVar)) {
                if (this.f2277e.size() == 1) {
                    this.f2278f = b();
                    h.c().a(a, String.format("%s: initial state = %s", getClass().getSimpleName(), this.f2278f), new Throwable[0]);
                    e();
                }
                aVar.a(this.f2278f);
            }
        }
    }

    public abstract T b();

    public void c(androidx.work.impl.k.a<T> aVar) {
        synchronized (this.f2276d) {
            if (this.f2277e.remove(aVar) && this.f2277e.isEmpty()) {
                f();
            }
        }
    }

    public void d(T t) {
        synchronized (this.f2276d) {
            T t2 = this.f2278f;
            if (t2 != t && (t2 == null || !t2.equals(t))) {
                this.f2278f = t;
                this.f2274b.a().execute(new a(new ArrayList(this.f2277e)));
            }
        }
    }

    public abstract void e();

    public abstract void f();
}