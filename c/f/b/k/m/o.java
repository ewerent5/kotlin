package c.f.b.k.m;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: WidgetGroup.java */
/* loaded from: classes.dex */
public class o {
    static int a;

    /* renamed from: c, reason: collision with root package name */
    int f2932c;

    /* renamed from: e, reason: collision with root package name */
    int f2934e;

    /* renamed from: b, reason: collision with root package name */
    ArrayList<c.f.b.k.e> f2931b = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    boolean f2933d = false;

    /* renamed from: f, reason: collision with root package name */
    ArrayList<a> f2935f = null;

    /* renamed from: g, reason: collision with root package name */
    private int f2936g = -1;

    /* compiled from: WidgetGroup.java */
    class a {
        WeakReference<c.f.b.k.e> a;

        /* renamed from: b, reason: collision with root package name */
        int f2937b;

        /* renamed from: c, reason: collision with root package name */
        int f2938c;

        /* renamed from: d, reason: collision with root package name */
        int f2939d;

        /* renamed from: e, reason: collision with root package name */
        int f2940e;

        /* renamed from: f, reason: collision with root package name */
        int f2941f;

        /* renamed from: g, reason: collision with root package name */
        int f2942g;

        public a(c.f.b.k.e eVar, c.f.b.d dVar, int i2) {
            this.a = new WeakReference<>(eVar);
            this.f2937b = dVar.x(eVar.I);
            this.f2938c = dVar.x(eVar.J);
            this.f2939d = dVar.x(eVar.K);
            this.f2940e = dVar.x(eVar.L);
            this.f2941f = dVar.x(eVar.M);
            this.f2942g = i2;
        }
    }

    public o(int i2) {
        this.f2932c = -1;
        this.f2934e = 0;
        int i3 = a;
        a = i3 + 1;
        this.f2932c = i3;
        this.f2934e = i2;
    }

    private String e() {
        int i2 = this.f2934e;
        return i2 == 0 ? "Horizontal" : i2 == 1 ? "Vertical" : i2 == 2 ? "Both" : "Unknown";
    }

    private int j(c.f.b.d dVar, ArrayList<c.f.b.k.e> arrayList, int i2) {
        int iX;
        int iX2;
        c.f.b.k.f fVar = (c.f.b.k.f) arrayList.get(0).I();
        dVar.D();
        fVar.g(dVar, false);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            arrayList.get(i3).g(dVar, false);
        }
        if (i2 == 0 && fVar.O0 > 0) {
            c.f.b.k.b.b(fVar, dVar, arrayList, 0);
        }
        if (i2 == 1 && fVar.P0 > 0) {
            c.f.b.k.b.b(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.z();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.f2935f = new ArrayList<>();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            this.f2935f.add(new a(arrayList.get(i4), dVar, i2));
        }
        if (i2 == 0) {
            iX = dVar.x(fVar.I);
            iX2 = dVar.x(fVar.K);
            dVar.D();
        } else {
            iX = dVar.x(fVar.J);
            iX2 = dVar.x(fVar.L);
            dVar.D();
        }
        return iX2 - iX;
    }

    public boolean a(c.f.b.k.e eVar) {
        if (this.f2931b.contains(eVar)) {
            return false;
        }
        this.f2931b.add(eVar);
        return true;
    }

    public void b(ArrayList<o> arrayList) {
        int size = this.f2931b.size();
        if (this.f2936g != -1 && size > 0) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                o oVar = arrayList.get(i2);
                if (this.f2936g == oVar.f2932c) {
                    g(this.f2934e, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.f2932c;
    }

    public int d() {
        return this.f2934e;
    }

    public int f(c.f.b.d dVar, int i2) {
        if (this.f2931b.size() == 0) {
            return 0;
        }
        return j(dVar, this.f2931b, i2);
    }

    public void g(int i2, o oVar) {
        Iterator<c.f.b.k.e> it = this.f2931b.iterator();
        while (it.hasNext()) {
            c.f.b.k.e next = it.next();
            oVar.a(next);
            if (i2 == 0) {
                next.B0 = oVar.c();
            } else {
                next.C0 = oVar.c();
            }
        }
        this.f2936g = oVar.f2932c;
    }

    public void h(boolean z) {
        this.f2933d = z;
    }

    public void i(int i2) {
        this.f2934e = i2;
    }

    public String toString() {
        String str = e() + " [" + this.f2932c + "] <";
        Iterator<c.f.b.k.e> it = this.f2931b.iterator();
        while (it.hasNext()) {
            str = str + " " + it.next().r();
        }
        return str + " >";
    }
}