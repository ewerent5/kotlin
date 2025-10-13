package c.f.b.k.m;

/* compiled from: GuidelineReference.java */
/* loaded from: classes.dex */
class j extends p {
    public j(c.f.b.k.e eVar) {
        super(eVar);
        eVar.f2862f.f();
        eVar.f2863g.f();
        this.f2948f = ((c.f.b.k.g) eVar).b1();
    }

    private void q(f fVar) {
        this.f2950h.f2909k.add(fVar);
        fVar.f2910l.add(this.f2950h);
    }

    @Override // c.f.b.k.m.p, c.f.b.k.m.d
    public void a(d dVar) {
        f fVar = this.f2950h;
        if (fVar.f2901c && !fVar.f2908j) {
            this.f2950h.d((int) ((fVar.f2910l.get(0).f2905g * ((c.f.b.k.g) this.f2944b).e1()) + 0.5f));
        }
    }

    @Override // c.f.b.k.m.p
    void d() {
        c.f.b.k.g gVar = (c.f.b.k.g) this.f2944b;
        int iC1 = gVar.c1();
        int iD1 = gVar.d1();
        gVar.e1();
        if (gVar.b1() == 1) {
            if (iC1 != -1) {
                this.f2950h.f2910l.add(this.f2944b.U.f2862f.f2950h);
                this.f2944b.U.f2862f.f2950h.f2909k.add(this.f2950h);
                this.f2950h.f2904f = iC1;
            } else if (iD1 != -1) {
                this.f2950h.f2910l.add(this.f2944b.U.f2862f.f2951i);
                this.f2944b.U.f2862f.f2951i.f2909k.add(this.f2950h);
                this.f2950h.f2904f = -iD1;
            } else {
                f fVar = this.f2950h;
                fVar.f2900b = true;
                fVar.f2910l.add(this.f2944b.U.f2862f.f2951i);
                this.f2944b.U.f2862f.f2951i.f2909k.add(this.f2950h);
            }
            q(this.f2944b.f2862f.f2950h);
            q(this.f2944b.f2862f.f2951i);
            return;
        }
        if (iC1 != -1) {
            this.f2950h.f2910l.add(this.f2944b.U.f2863g.f2950h);
            this.f2944b.U.f2863g.f2950h.f2909k.add(this.f2950h);
            this.f2950h.f2904f = iC1;
        } else if (iD1 != -1) {
            this.f2950h.f2910l.add(this.f2944b.U.f2863g.f2951i);
            this.f2944b.U.f2863g.f2951i.f2909k.add(this.f2950h);
            this.f2950h.f2904f = -iD1;
        } else {
            f fVar2 = this.f2950h;
            fVar2.f2900b = true;
            fVar2.f2910l.add(this.f2944b.U.f2863g.f2951i);
            this.f2944b.U.f2863g.f2951i.f2909k.add(this.f2950h);
        }
        q(this.f2944b.f2863g.f2950h);
        q(this.f2944b.f2863g.f2951i);
    }

    @Override // c.f.b.k.m.p
    public void e() {
        if (((c.f.b.k.g) this.f2944b).b1() == 1) {
            this.f2944b.V0(this.f2950h.f2905g);
        } else {
            this.f2944b.W0(this.f2950h.f2905g);
        }
    }

    @Override // c.f.b.k.m.p
    void f() {
        this.f2950h.c();
    }

    @Override // c.f.b.k.m.p
    boolean m() {
        return false;
    }
}