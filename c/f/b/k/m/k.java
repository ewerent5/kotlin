package c.f.b.k.m;

import c.f.b.k.m.f;
import java.util.Iterator;

/* compiled from: HelperReferences.java */
/* loaded from: classes.dex */
class k extends p {
    public k(c.f.b.k.e eVar) {
        super(eVar);
    }

    private void q(f fVar) {
        this.f2950h.f2909k.add(fVar);
        fVar.f2910l.add(this.f2950h);
    }

    @Override // c.f.b.k.m.p, c.f.b.k.m.d
    public void a(d dVar) {
        c.f.b.k.a aVar = (c.f.b.k.a) this.f2944b;
        int iE1 = aVar.e1();
        Iterator<f> it = this.f2950h.f2910l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = it.next().f2905g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (iE1 == 0 || iE1 == 2) {
            this.f2950h.d(i3 + aVar.f1());
        } else {
            this.f2950h.d(i2 + aVar.f1());
        }
    }

    @Override // c.f.b.k.m.p
    void d() {
        c.f.b.k.e eVar = this.f2944b;
        if (eVar instanceof c.f.b.k.a) {
            this.f2950h.f2900b = true;
            c.f.b.k.a aVar = (c.f.b.k.a) eVar;
            int iE1 = aVar.e1();
            boolean zD1 = aVar.d1();
            int i2 = 0;
            if (iE1 == 0) {
                this.f2950h.f2903e = f.a.LEFT;
                while (i2 < aVar.E0) {
                    c.f.b.k.e eVar2 = aVar.D0[i2];
                    if (zD1 || eVar2.Q() != 8) {
                        f fVar = eVar2.f2862f.f2950h;
                        fVar.f2909k.add(this.f2950h);
                        this.f2950h.f2910l.add(fVar);
                    }
                    i2++;
                }
                q(this.f2944b.f2862f.f2950h);
                q(this.f2944b.f2862f.f2951i);
                return;
            }
            if (iE1 == 1) {
                this.f2950h.f2903e = f.a.RIGHT;
                while (i2 < aVar.E0) {
                    c.f.b.k.e eVar3 = aVar.D0[i2];
                    if (zD1 || eVar3.Q() != 8) {
                        f fVar2 = eVar3.f2862f.f2951i;
                        fVar2.f2909k.add(this.f2950h);
                        this.f2950h.f2910l.add(fVar2);
                    }
                    i2++;
                }
                q(this.f2944b.f2862f.f2950h);
                q(this.f2944b.f2862f.f2951i);
                return;
            }
            if (iE1 == 2) {
                this.f2950h.f2903e = f.a.TOP;
                while (i2 < aVar.E0) {
                    c.f.b.k.e eVar4 = aVar.D0[i2];
                    if (zD1 || eVar4.Q() != 8) {
                        f fVar3 = eVar4.f2863g.f2950h;
                        fVar3.f2909k.add(this.f2950h);
                        this.f2950h.f2910l.add(fVar3);
                    }
                    i2++;
                }
                q(this.f2944b.f2863g.f2950h);
                q(this.f2944b.f2863g.f2951i);
                return;
            }
            if (iE1 != 3) {
                return;
            }
            this.f2950h.f2903e = f.a.BOTTOM;
            while (i2 < aVar.E0) {
                c.f.b.k.e eVar5 = aVar.D0[i2];
                if (zD1 || eVar5.Q() != 8) {
                    f fVar4 = eVar5.f2863g.f2951i;
                    fVar4.f2909k.add(this.f2950h);
                    this.f2950h.f2910l.add(fVar4);
                }
                i2++;
            }
            q(this.f2944b.f2863g.f2950h);
            q(this.f2944b.f2863g.f2951i);
        }
    }

    @Override // c.f.b.k.m.p
    public void e() {
        c.f.b.k.e eVar = this.f2944b;
        if (eVar instanceof c.f.b.k.a) {
            int iE1 = ((c.f.b.k.a) eVar).e1();
            if (iE1 == 0 || iE1 == 1) {
                this.f2944b.V0(this.f2950h.f2905g);
            } else {
                this.f2944b.W0(this.f2950h.f2905g);
            }
        }
    }

    @Override // c.f.b.k.m.p
    void f() {
        this.f2945c = null;
        this.f2950h.c();
    }

    @Override // c.f.b.k.m.p
    boolean m() {
        return false;
    }
}