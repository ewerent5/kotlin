package c.f.b.k.m;

import java.util.ArrayList;

/* compiled from: RunGroup.java */
/* loaded from: classes.dex */
class m {
    public static int a;

    /* renamed from: d */
    p f2924d;

    /* renamed from: e */
    p f2925e;

    /* renamed from: g */
    int f2927g;

    /* renamed from: h */
    int f2928h;

    /* renamed from: b */
    public int f2922b = 0;

    /* renamed from: c */
    public boolean f2923c = false;

    /* renamed from: f */
    ArrayList<p> f2926f = new ArrayList<>();

    public m(p pVar, int i2) {
        this.f2924d = null;
        this.f2925e = null;
        this.f2927g = 0;
        int i3 = a;
        this.f2927g = i3;
        a = i3 + 1;
        this.f2924d = pVar;
        this.f2925e = pVar;
        this.f2928h = i2;
    }

    private long c(f fVar, long j2) {
        p pVar = fVar.f2902d;
        if (pVar instanceof k) {
            return j2;
        }
        int size = fVar.f2909k.size();
        long jMin = j2;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = fVar.f2909k.get(i2);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f2902d != pVar) {
                    jMin = Math.min(jMin, c(fVar2, fVar2.f2904f + j2));
                }
            }
        }
        if (fVar != pVar.f2951i) {
            return jMin;
        }
        long j3 = j2 - pVar.j();
        return Math.min(Math.min(jMin, c(pVar.f2950h, j3)), j3 - pVar.f2950h.f2904f);
    }

    private long d(f fVar, long j2) {
        p pVar = fVar.f2902d;
        if (pVar instanceof k) {
            return j2;
        }
        int size = fVar.f2909k.size();
        long jMax = j2;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = fVar.f2909k.get(i2);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f2902d != pVar) {
                    jMax = Math.max(jMax, d(fVar2, fVar2.f2904f + j2));
                }
            }
        }
        if (fVar != pVar.f2950h) {
            return jMax;
        }
        long j3 = j2 + pVar.j();
        return Math.max(Math.max(jMax, d(pVar.f2951i, j3)), j3 - pVar.f2951i.f2904f);
    }

    public void a(p pVar) {
        this.f2926f.add(pVar);
        this.f2925e = pVar;
    }

    public long b(c.f.b.k.f fVar, int i2) {
        long j2;
        int i3;
        p pVar = this.f2924d;
        if (pVar instanceof c) {
            if (((c) pVar).f2948f != i2) {
                return 0L;
            }
        } else if (i2 == 0) {
            if (!(pVar instanceof l)) {
                return 0L;
            }
        } else if (!(pVar instanceof n)) {
            return 0L;
        }
        f fVar2 = (i2 == 0 ? fVar.f2862f : fVar.f2863g).f2950h;
        f fVar3 = (i2 == 0 ? fVar.f2862f : fVar.f2863g).f2951i;
        boolean zContains = pVar.f2950h.f2910l.contains(fVar2);
        boolean zContains2 = this.f2924d.f2951i.f2910l.contains(fVar3);
        long j3 = this.f2924d.j();
        if (zContains && zContains2) {
            long jD = d(this.f2924d.f2950h, 0L);
            long jC = c(this.f2924d.f2951i, 0L);
            long j4 = jD - j3;
            p pVar2 = this.f2924d;
            int i4 = pVar2.f2951i.f2904f;
            if (j4 >= (-i4)) {
                j4 += i4;
            }
            int i5 = pVar2.f2950h.f2904f;
            long j5 = ((-jC) - j3) - i5;
            if (j5 >= i5) {
                j5 -= i5;
            }
            float fO = pVar2.f2944b.o(i2);
            float f2 = fO > 0.0f ? (long) ((j5 / fO) + (j4 / (1.0f - fO))) : 0L;
            long j6 = ((long) ((f2 * fO) + 0.5f)) + j3 + ((long) ((f2 * (1.0f - fO)) + 0.5f));
            j2 = r13.f2950h.f2904f + j6;
            i3 = this.f2924d.f2951i.f2904f;
        } else {
            if (zContains) {
                return Math.max(d(this.f2924d.f2950h, r13.f2904f), this.f2924d.f2950h.f2904f + j3);
            }
            if (zContains2) {
                return Math.max(-c(this.f2924d.f2951i, r13.f2904f), (-this.f2924d.f2951i.f2904f) + j3);
            }
            j2 = r13.f2950h.f2904f + this.f2924d.j();
            i3 = this.f2924d.f2951i.f2904f;
        }
        return j2 - i3;
    }
}