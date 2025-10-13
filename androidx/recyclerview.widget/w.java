package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ViewInfoStore.java */
/* loaded from: classes.dex */
class w {
    final c.e.g<RecyclerView.d0, a> a = new c.e.g<>();

    /* renamed from: b, reason: collision with root package name */
    final c.e.d<RecyclerView.d0> f1783b = new c.e.d<>();

    /* compiled from: ViewInfoStore.java */
    static class a {
        static c.h.k.e<a> a = new c.h.k.f(20);

        /* renamed from: b, reason: collision with root package name */
        int f1784b;

        /* renamed from: c, reason: collision with root package name */
        RecyclerView.l.c f1785c;

        /* renamed from: d, reason: collision with root package name */
        RecyclerView.l.c f1786d;

        private a() {
        }

        static void a() {
            while (a.b() != null) {
            }
        }

        static a b() {
            a aVarB = a.b();
            return aVarB == null ? new a() : aVarB;
        }

        static void c(a aVar) {
            aVar.f1784b = 0;
            aVar.f1785c = null;
            aVar.f1786d = null;
            a.a(aVar);
        }
    }

    /* compiled from: ViewInfoStore.java */
    interface b {
        void a(RecyclerView.d0 d0Var);

        void b(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);

        void c(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);

        void d(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);
    }

    w() {
    }

    private RecyclerView.l.c l(RecyclerView.d0 d0Var, int i2) {
        a aVarM;
        RecyclerView.l.c cVar;
        int iF = this.a.f(d0Var);
        if (iF >= 0 && (aVarM = this.a.m(iF)) != null) {
            int i3 = aVarM.f1784b;
            if ((i3 & i2) != 0) {
                int i4 = (~i2) & i3;
                aVarM.f1784b = i4;
                if (i2 == 4) {
                    cVar = aVarM.f1785c;
                } else {
                    if (i2 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    cVar = aVarM.f1786d;
                }
                if ((i4 & 12) == 0) {
                    this.a.k(iF);
                    a.c(aVarM);
                }
                return cVar;
            }
        }
        return null;
    }

    void a(RecyclerView.d0 d0Var, RecyclerView.l.c cVar) {
        a aVarB = this.a.get(d0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.a.put(d0Var, aVarB);
        }
        aVarB.f1784b |= 2;
        aVarB.f1785c = cVar;
    }

    void b(RecyclerView.d0 d0Var) {
        a aVarB = this.a.get(d0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.a.put(d0Var, aVarB);
        }
        aVarB.f1784b |= 1;
    }

    void c(long j2, RecyclerView.d0 d0Var) {
        this.f1783b.j(j2, d0Var);
    }

    void d(RecyclerView.d0 d0Var, RecyclerView.l.c cVar) {
        a aVarB = this.a.get(d0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.a.put(d0Var, aVarB);
        }
        aVarB.f1786d = cVar;
        aVarB.f1784b |= 8;
    }

    void e(RecyclerView.d0 d0Var, RecyclerView.l.c cVar) {
        a aVarB = this.a.get(d0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.a.put(d0Var, aVarB);
        }
        aVarB.f1785c = cVar;
        aVarB.f1784b |= 4;
    }

    void f() {
        this.a.clear();
        this.f1783b.b();
    }

    RecyclerView.d0 g(long j2) {
        return this.f1783b.f(j2);
    }

    boolean h(RecyclerView.d0 d0Var) {
        a aVar = this.a.get(d0Var);
        return (aVar == null || (aVar.f1784b & 1) == 0) ? false : true;
    }

    boolean i(RecyclerView.d0 d0Var) {
        a aVar = this.a.get(d0Var);
        return (aVar == null || (aVar.f1784b & 4) == 0) ? false : true;
    }

    void j() {
        a.a();
    }

    public void k(RecyclerView.d0 d0Var) {
        p(d0Var);
    }

    RecyclerView.l.c m(RecyclerView.d0 d0Var) {
        return l(d0Var, 8);
    }

    RecyclerView.l.c n(RecyclerView.d0 d0Var) {
        return l(d0Var, 4);
    }

    void o(b bVar) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            RecyclerView.d0 d0VarI = this.a.i(size);
            a aVarK = this.a.k(size);
            int i2 = aVarK.f1784b;
            if ((i2 & 3) == 3) {
                bVar.a(d0VarI);
            } else if ((i2 & 1) != 0) {
                RecyclerView.l.c cVar = aVarK.f1785c;
                if (cVar == null) {
                    bVar.a(d0VarI);
                } else {
                    bVar.c(d0VarI, cVar, aVarK.f1786d);
                }
            } else if ((i2 & 14) == 14) {
                bVar.b(d0VarI, aVarK.f1785c, aVarK.f1786d);
            } else if ((i2 & 12) == 12) {
                bVar.d(d0VarI, aVarK.f1785c, aVarK.f1786d);
            } else if ((i2 & 4) != 0) {
                bVar.c(d0VarI, aVarK.f1785c, null);
            } else if ((i2 & 8) != 0) {
                bVar.b(d0VarI, aVarK.f1785c, aVarK.f1786d);
            }
            a.c(aVarK);
        }
    }

    void p(RecyclerView.d0 d0Var) {
        a aVar = this.a.get(d0Var);
        if (aVar == null) {
            return;
        }
        aVar.f1784b &= -2;
    }

    void q(RecyclerView.d0 d0Var) {
        int iM = this.f1783b.m() - 1;
        while (true) {
            if (iM < 0) {
                break;
            }
            if (d0Var == this.f1783b.n(iM)) {
                this.f1783b.l(iM);
                break;
            }
            iM--;
        }
        a aVarRemove = this.a.remove(d0Var);
        if (aVarRemove != null) {
            a.c(aVarRemove);
        }
    }
}