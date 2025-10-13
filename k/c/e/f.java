package k.c.e;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k.c.e.m.p;

/* compiled from: MapTilePreCache.java */
/* loaded from: classes3.dex */
public class f {

    /* renamed from: c, reason: collision with root package name */
    private Iterator<Long> f16591c;

    /* renamed from: d, reason: collision with root package name */
    private final e f16592d;
    private final List<p> a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final k.c.f.j f16590b = new k.c.f.j();

    /* renamed from: e, reason: collision with root package name */
    private final k.c.f.d f16593e = new k.c.f.d(new a());

    /* compiled from: MapTilePreCache.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                long jE = f.this.e();
                if (jE == -1) {
                    return;
                } else {
                    f.this.g(jE);
                }
            }
        }
    }

    public f(e eVar) {
        this.f16592d = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long e() {
        long jLongValue;
        do {
            synchronized (this.f16590b) {
                if (!this.f16591c.hasNext()) {
                    return -1L;
                }
                jLongValue = this.f16591c.next().longValue();
            }
        } while (this.f16592d.e(jLongValue) != null);
        return jLongValue;
    }

    private void f() {
        k.c.f.g gVar;
        synchronized (this.f16590b) {
            int i2 = 0;
            for (k.c.f.g gVar2 : this.f16592d.d().c()) {
                if (i2 < this.f16590b.c().size()) {
                    gVar = this.f16590b.c().get(i2);
                } else {
                    gVar = new k.c.f.g();
                    this.f16590b.c().add(gVar);
                }
                gVar.F(gVar2);
                i2++;
            }
            while (i2 < this.f16590b.c().size()) {
                this.f16590b.c().remove(this.f16590b.c().size() - 1);
            }
            this.f16591c = this.f16590b.iterator();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(long j2) {
        for (p pVar : this.a) {
            if (pVar instanceof k.c.e.m.l) {
                k.c.e.n.d dVarT = ((k.c.e.m.l) pVar).t();
                if (!(dVarT instanceof k.c.e.n.e) || ((k.c.e.n.e) dVarT).l().b()) {
                }
            }
            Drawable drawableB = pVar.h().b(j2);
            if (drawableB != null) {
                this.f16592d.m(j2, drawableB);
                return;
            }
        }
    }

    public void c(p pVar) {
        this.a.add(pVar);
    }

    public void d() {
        if (this.f16593e.d()) {
            return;
        }
        f();
        this.f16593e.c();
    }
}