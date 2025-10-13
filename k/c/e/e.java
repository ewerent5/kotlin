package k.c.e;

import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import k.c.f.n;

/* compiled from: MapTileCache.java */
/* loaded from: classes3.dex */
public class e {
    private a a;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<Long, Drawable> f16580b;

    /* renamed from: c, reason: collision with root package name */
    private final k.c.f.g f16581c;

    /* renamed from: d, reason: collision with root package name */
    private final k.c.f.j f16582d;

    /* renamed from: e, reason: collision with root package name */
    private final n f16583e;

    /* renamed from: f, reason: collision with root package name */
    private final List<k.c.f.i> f16584f;

    /* renamed from: g, reason: collision with root package name */
    private int f16585g;

    /* renamed from: h, reason: collision with root package name */
    private final f f16586h;

    /* renamed from: i, reason: collision with root package name */
    private final List<k.c.f.l> f16587i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f16588j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f16589k;

    /* compiled from: MapTileCache.java */
    public interface a {
        void a(long j2);
    }

    public e() {
        this(k.c.b.a.a().A());
    }

    private void l(n nVar) {
        synchronized (this.f16580b) {
            nVar.b(this.f16580b.size());
            nVar.a();
            Iterator<Long> it = this.f16580b.keySet().iterator();
            while (it.hasNext()) {
                nVar.f(it.next().longValue());
            }
        }
    }

    private void n() {
        k.c.f.g gVar;
        int i2 = 0;
        for (k.c.f.i iVar : this.f16584f) {
            if (i2 < this.f16582d.c().size()) {
                gVar = this.f16582d.c().get(i2);
            } else {
                gVar = new k.c.f.g();
                this.f16582d.c().add(gVar);
            }
            iVar.a(this.f16581c, gVar);
            i2++;
        }
        while (i2 < this.f16582d.c().size()) {
            this.f16582d.c().remove(this.f16582d.c().size() - 1);
        }
    }

    private boolean r(long j2) {
        if (this.f16581c.e(j2) || this.f16582d.e(j2)) {
            return true;
        }
        Iterator<k.c.f.l> it = this.f16587i.iterator();
        while (it.hasNext()) {
            if (it.next().e(j2)) {
                return true;
            }
        }
        return false;
    }

    public void a() {
        n nVar = new n();
        l(nVar);
        for (int i2 = 0; i2 < nVar.d(); i2++) {
            o(nVar.c(i2));
        }
        this.f16580b.clear();
    }

    public boolean b(int i2) {
        if (this.f16585g >= i2) {
            return false;
        }
        Log.i("OsmDroid", "Tile cache increased from " + this.f16585g + " to " + i2);
        this.f16585g = i2;
        return true;
    }

    public void c() {
        int i2;
        int size = this.f16580b.size();
        if (this.f16589k) {
            i2 = Integer.MAX_VALUE;
        } else {
            i2 = size - this.f16585g;
            if (i2 <= 0) {
                return;
            }
        }
        n();
        if (!this.f16588j || !b(this.f16581c.size() + this.f16582d.size()) || this.f16589k || (i2 = size - this.f16585g) > 0) {
            l(this.f16583e);
            for (int i3 = 0; i3 < this.f16583e.d(); i3++) {
                long jC = this.f16583e.c(i3);
                if (!r(jC)) {
                    o(jC);
                    i2--;
                    if (i2 == 0) {
                        return;
                    }
                }
            }
        }
    }

    public k.c.f.j d() {
        return this.f16582d;
    }

    public Drawable e(long j2) {
        Drawable drawable;
        synchronized (this.f16580b) {
            drawable = this.f16580b.get(Long.valueOf(j2));
        }
        return drawable;
    }

    public k.c.f.g f() {
        return this.f16581c;
    }

    public f g() {
        return this.f16586h;
    }

    public List<k.c.f.i> h() {
        return this.f16584f;
    }

    public List<k.c.f.l> i() {
        return this.f16587i;
    }

    public a j() {
        return this.a;
    }

    public void k() {
        c();
        this.f16586h.d();
    }

    public void m(long j2, Drawable drawable) {
        if (drawable != null) {
            synchronized (this.f16580b) {
                this.f16580b.put(Long.valueOf(j2), drawable);
            }
        }
    }

    protected void o(long j2) {
        Drawable drawableRemove;
        synchronized (this.f16580b) {
            drawableRemove = this.f16580b.remove(Long.valueOf(j2));
        }
        if (j() != null) {
            j().a(j2);
        }
        k.c.e.a.d().c(drawableRemove);
    }

    public void p(boolean z) {
        this.f16588j = z;
    }

    public void q(boolean z) {
        this.f16589k = z;
    }

    public e(int i2) {
        this.f16580b = new HashMap<>();
        this.f16581c = new k.c.f.g();
        this.f16582d = new k.c.f.j();
        this.f16583e = new n();
        this.f16584f = new ArrayList();
        this.f16587i = new ArrayList();
        b(i2);
        this.f16586h = new f(this);
    }
}