package c.a.o;

import android.view.View;
import android.view.animation.Interpolator;
import c.h.l.x;
import c.h.l.y;
import c.h.l.z;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ViewPropertyAnimatorCompatSet.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    private Interpolator f2614c;

    /* renamed from: d, reason: collision with root package name */
    y f2615d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f2616e;

    /* renamed from: b, reason: collision with root package name */
    private long f2613b = -1;

    /* renamed from: f, reason: collision with root package name */
    private final z f2617f = new a();
    final ArrayList<x> a = new ArrayList<>();

    /* compiled from: ViewPropertyAnimatorCompatSet.java */
    class a extends z {
        private boolean a = false;

        /* renamed from: b, reason: collision with root package name */
        private int f2618b = 0;

        a() {
        }

        @Override // c.h.l.y
        public void b(View view) {
            int i2 = this.f2618b + 1;
            this.f2618b = i2;
            if (i2 == h.this.a.size()) {
                y yVar = h.this.f2615d;
                if (yVar != null) {
                    yVar.b(null);
                }
                d();
            }
        }

        @Override // c.h.l.z, c.h.l.y
        public void c(View view) {
            if (this.a) {
                return;
            }
            this.a = true;
            y yVar = h.this.f2615d;
            if (yVar != null) {
                yVar.c(null);
            }
        }

        void d() {
            this.f2618b = 0;
            this.a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f2616e) {
            Iterator<x> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.f2616e = false;
        }
    }

    void b() {
        this.f2616e = false;
    }

    public h c(x xVar) {
        if (!this.f2616e) {
            this.a.add(xVar);
        }
        return this;
    }

    public h d(x xVar, x xVar2) {
        this.a.add(xVar);
        xVar2.h(xVar.c());
        this.a.add(xVar2);
        return this;
    }

    public h e(long j2) {
        if (!this.f2616e) {
            this.f2613b = j2;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f2616e) {
            this.f2614c = interpolator;
        }
        return this;
    }

    public h g(y yVar) {
        if (!this.f2616e) {
            this.f2615d = yVar;
        }
        return this;
    }

    public void h() {
        if (this.f2616e) {
            return;
        }
        Iterator<x> it = this.a.iterator();
        while (it.hasNext()) {
            x next = it.next();
            long j2 = this.f2613b;
            if (j2 >= 0) {
                next.d(j2);
            }
            Interpolator interpolator = this.f2614c;
            if (interpolator != null) {
                next.e(interpolator);
            }
            if (this.f2615d != null) {
                next.f(this.f2617f);
            }
            next.j();
        }
        this.f2616e = true;
    }
}