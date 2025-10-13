package c.f.b.k.m;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DependencyNode.java */
/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: d, reason: collision with root package name */
    p f2902d;

    /* renamed from: f, reason: collision with root package name */
    int f2904f;

    /* renamed from: g, reason: collision with root package name */
    public int f2905g;
    public d a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2900b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2901c = false;

    /* renamed from: e, reason: collision with root package name */
    a f2903e = a.UNKNOWN;

    /* renamed from: h, reason: collision with root package name */
    int f2906h = 1;

    /* renamed from: i, reason: collision with root package name */
    g f2907i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2908j = false;

    /* renamed from: k, reason: collision with root package name */
    List<d> f2909k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    List<f> f2910l = new ArrayList();

    /* compiled from: DependencyNode.java */
    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(p pVar) {
        this.f2902d = pVar;
    }

    @Override // c.f.b.k.m.d
    public void a(d dVar) {
        Iterator<f> it = this.f2910l.iterator();
        while (it.hasNext()) {
            if (!it.next().f2908j) {
                return;
            }
        }
        this.f2901c = true;
        d dVar2 = this.a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f2900b) {
            this.f2902d.a(this);
            return;
        }
        f fVar = null;
        int i2 = 0;
        for (f fVar2 : this.f2910l) {
            if (!(fVar2 instanceof g)) {
                i2++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i2 == 1 && fVar.f2908j) {
            g gVar = this.f2907i;
            if (gVar != null) {
                if (!gVar.f2908j) {
                    return;
                } else {
                    this.f2904f = this.f2906h * gVar.f2905g;
                }
            }
            d(fVar.f2905g + this.f2904f);
        }
        d dVar3 = this.a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f2909k.add(dVar);
        if (this.f2908j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f2910l.clear();
        this.f2909k.clear();
        this.f2908j = false;
        this.f2905g = 0;
        this.f2901c = false;
        this.f2900b = false;
    }

    public void d(int i2) {
        if (this.f2908j) {
            return;
        }
        this.f2908j = true;
        this.f2905g = i2;
        for (d dVar : this.f2909k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2902d.f2944b.r());
        sb.append(":");
        sb.append(this.f2903e);
        sb.append("(");
        sb.append(this.f2908j ? Integer.valueOf(this.f2905g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f2910l.size());
        sb.append(":d=");
        sb.append(this.f2909k.size());
        sb.append(">");
        return sb.toString();
    }
}