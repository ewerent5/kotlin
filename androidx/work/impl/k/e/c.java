package androidx.work.impl.k.e;

import androidx.work.impl.l.j;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ConstraintController.java */
/* loaded from: classes.dex */
public abstract class c<T> implements androidx.work.impl.k.a<T> {
    private final List<String> a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private T f2265b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.work.impl.k.f.d<T> f2266c;

    /* renamed from: d, reason: collision with root package name */
    private a f2267d;

    /* compiled from: ConstraintController.java */
    public interface a {
        void a(List<String> list);

        void b(List<String> list);
    }

    c(androidx.work.impl.k.f.d<T> dVar) {
        this.f2266c = dVar;
    }

    private void h() {
        if (this.a.isEmpty() || this.f2267d == null) {
            return;
        }
        T t = this.f2265b;
        if (t == null || c(t)) {
            this.f2267d.b(this.a);
        } else {
            this.f2267d.a(this.a);
        }
    }

    @Override // androidx.work.impl.k.a
    public void a(T t) {
        this.f2265b = t;
        h();
    }

    abstract boolean b(j jVar);

    abstract boolean c(T t);

    public boolean d(String str) {
        T t = this.f2265b;
        return t != null && c(t) && this.a.contains(str);
    }

    public void e(List<j> list) {
        this.a.clear();
        for (j jVar : list) {
            if (b(jVar)) {
                this.a.add(jVar.f2302c);
            }
        }
        if (this.a.isEmpty()) {
            this.f2266c.c(this);
        } else {
            this.f2266c.a(this);
        }
        h();
    }

    public void f() {
        if (this.a.isEmpty()) {
            return;
        }
        this.a.clear();
        this.f2266c.c(this);
    }

    public void g(a aVar) {
        if (this.f2267d != aVar) {
            this.f2267d = aVar;
            h();
        }
    }
}