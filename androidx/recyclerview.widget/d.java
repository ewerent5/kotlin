package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.h;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: AsyncListDiffer.java */
/* loaded from: classes.dex */
public class d<T> {
    private static final Executor a = new c();

    /* renamed from: b, reason: collision with root package name */
    private final n f1649b;

    /* renamed from: c, reason: collision with root package name */
    final androidx.recyclerview.widget.c<T> f1650c;

    /* renamed from: d, reason: collision with root package name */
    Executor f1651d;

    /* renamed from: f, reason: collision with root package name */
    private List<T> f1653f;

    /* renamed from: h, reason: collision with root package name */
    int f1655h;

    /* renamed from: e, reason: collision with root package name */
    private final List<b<T>> f1652e = new CopyOnWriteArrayList();

    /* renamed from: g, reason: collision with root package name */
    private List<T> f1654g = Collections.emptyList();

    /* compiled from: AsyncListDiffer.java */
    class a implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f1656e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f1657f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f1658g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Runnable f1659h;

        /* compiled from: AsyncListDiffer.java */
        /* renamed from: androidx.recyclerview.widget.d$a$a, reason: collision with other inner class name */
        class C0024a extends h.b {
            C0024a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.h.b
            public boolean a(int i2, int i3) {
                Object obj = a.this.f1656e.get(i2);
                Object obj2 = a.this.f1657f.get(i3);
                if (obj != null && obj2 != null) {
                    return d.this.f1650c.b().a(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.h.b
            public boolean b(int i2, int i3) {
                Object obj = a.this.f1656e.get(i2);
                Object obj2 = a.this.f1657f.get(i3);
                return (obj == null || obj2 == null) ? obj == null && obj2 == null : d.this.f1650c.b().b(obj, obj2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.h.b
            public Object c(int i2, int i3) {
                Object obj = a.this.f1656e.get(i2);
                Object obj2 = a.this.f1657f.get(i3);
                if (obj == null || obj2 == null) {
                    throw new AssertionError();
                }
                return d.this.f1650c.b().c(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.h.b
            public int d() {
                return a.this.f1657f.size();
            }

            @Override // androidx.recyclerview.widget.h.b
            public int e() {
                return a.this.f1656e.size();
            }
        }

        /* compiled from: AsyncListDiffer.java */
        class b implements Runnable {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ h.c f1661e;

            b(h.c cVar) {
                this.f1661e = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                d dVar = d.this;
                if (dVar.f1655h == aVar.f1658g) {
                    dVar.c(aVar.f1657f, this.f1661e, aVar.f1659h);
                }
            }
        }

        a(List list, List list2, int i2, Runnable runnable) {
            this.f1656e = list;
            this.f1657f = list2;
            this.f1658g = i2;
            this.f1659h = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f1651d.execute(new b(h.a(new C0024a())));
        }
    }

    /* compiled from: AsyncListDiffer.java */
    public interface b<T> {
        void a(List<T> list, List<T> list2);
    }

    /* compiled from: AsyncListDiffer.java */
    private static class c implements Executor {

        /* renamed from: e, reason: collision with root package name */
        final Handler f1663e = new Handler(Looper.getMainLooper());

        c() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f1663e.post(runnable);
        }
    }

    public d(n nVar, androidx.recyclerview.widget.c<T> cVar) {
        this.f1649b = nVar;
        this.f1650c = cVar;
        if (cVar.c() != null) {
            this.f1651d = cVar.c();
        } else {
            this.f1651d = a;
        }
    }

    private void d(List<T> list, Runnable runnable) {
        Iterator<b<T>> it = this.f1652e.iterator();
        while (it.hasNext()) {
            it.next().a(list, this.f1654g);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void a(b<T> bVar) {
        this.f1652e.add(bVar);
    }

    public List<T> b() {
        return this.f1654g;
    }

    void c(List<T> list, h.c cVar, Runnable runnable) {
        List<T> list2 = this.f1654g;
        this.f1653f = list;
        this.f1654g = Collections.unmodifiableList(list);
        cVar.d(this.f1649b);
        d(list2, runnable);
    }

    public void e(List<T> list) {
        f(list, null);
    }

    public void f(List<T> list, Runnable runnable) {
        int i2 = this.f1655h + 1;
        this.f1655h = i2;
        List<T> list2 = this.f1653f;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List<T> list3 = this.f1654g;
        if (list == null) {
            int size = list2.size();
            this.f1653f = null;
            this.f1654g = Collections.emptyList();
            this.f1649b.c(0, size);
            d(list3, runnable);
            return;
        }
        if (list2 != null) {
            this.f1650c.a().execute(new a(list2, list, i2, runnable));
            return;
        }
        this.f1653f = list;
        this.f1654g = Collections.unmodifiableList(list);
        this.f1649b.b(0, list.size());
        d(list3, runnable);
    }
}