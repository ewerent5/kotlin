package c.f.b.k;

import c.f.b.i;
import c.f.b.k.m.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: ConstraintAnchor.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private int f2841b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2842c;

    /* renamed from: d, reason: collision with root package name */
    public final e f2843d;

    /* renamed from: e, reason: collision with root package name */
    public final b f2844e;

    /* renamed from: f, reason: collision with root package name */
    public d f2845f;

    /* renamed from: i, reason: collision with root package name */
    c.f.b.i f2848i;
    private HashSet<d> a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f2846g = 0;

    /* renamed from: h, reason: collision with root package name */
    int f2847h = -1;

    /* compiled from: ConstraintAnchor.java */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* compiled from: ConstraintAnchor.java */
    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, b bVar) {
        this.f2843d = eVar;
        this.f2844e = bVar;
    }

    public boolean a(d dVar, int i2, int i3, boolean z) {
        if (dVar == null) {
            p();
            return true;
        }
        if (!z && !o(dVar)) {
            return false;
        }
        this.f2845f = dVar;
        if (dVar.a == null) {
            dVar.a = new HashSet<>();
        }
        HashSet<d> hashSet = this.f2845f.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        if (i2 > 0) {
            this.f2846g = i2;
        } else {
            this.f2846g = 0;
        }
        this.f2847h = i3;
        return true;
    }

    public void b(int i2, ArrayList<o> arrayList, o oVar) {
        HashSet<d> hashSet = this.a;
        if (hashSet != null) {
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                c.f.b.k.m.i.a(it.next().f2843d, i2, arrayList, oVar);
            }
        }
    }

    public HashSet<d> c() {
        return this.a;
    }

    public int d() {
        if (this.f2842c) {
            return this.f2841b;
        }
        return 0;
    }

    public int e() {
        d dVar;
        if (this.f2843d.Q() == 8) {
            return 0;
        }
        return (this.f2847h <= -1 || (dVar = this.f2845f) == null || dVar.f2843d.Q() != 8) ? this.f2846g : this.f2847h;
    }

    public final d f() {
        switch (a.a[this.f2844e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f2843d.K;
            case 3:
                return this.f2843d.I;
            case 4:
                return this.f2843d.L;
            case 5:
                return this.f2843d.J;
            default:
                throw new AssertionError(this.f2844e.name());
        }
    }

    public e g() {
        return this.f2843d;
    }

    public c.f.b.i h() {
        return this.f2848i;
    }

    public d i() {
        return this.f2845f;
    }

    public b j() {
        return this.f2844e;
    }

    public boolean k() {
        HashSet<d> hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator<d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().f().n()) {
                return true;
            }
        }
        return false;
    }

    public boolean l() {
        HashSet<d> hashSet = this.a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean m() {
        return this.f2842c;
    }

    public boolean n() {
        return this.f2845f != null;
    }

    public boolean o(d dVar) {
        if (dVar == null) {
            return false;
        }
        b bVarJ = dVar.j();
        b bVar = this.f2844e;
        if (bVarJ == bVar) {
            return bVar != b.BASELINE || (dVar.g().U() && g().U());
        }
        switch (a.a[bVar.ordinal()]) {
            case 1:
                return (bVarJ == b.BASELINE || bVarJ == b.CENTER_X || bVarJ == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z = bVarJ == b.LEFT || bVarJ == b.RIGHT;
                if (dVar.g() instanceof g) {
                    return z || bVarJ == b.CENTER_X;
                }
                return z;
            case 4:
            case 5:
                boolean z2 = bVarJ == b.TOP || bVarJ == b.BOTTOM;
                if (dVar.g() instanceof g) {
                    return z2 || bVarJ == b.CENTER_Y;
                }
                return z2;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f2844e.name());
        }
    }

    public void p() {
        HashSet<d> hashSet;
        d dVar = this.f2845f;
        if (dVar != null && (hashSet = dVar.a) != null) {
            hashSet.remove(this);
            if (this.f2845f.a.size() == 0) {
                this.f2845f.a = null;
            }
        }
        this.a = null;
        this.f2845f = null;
        this.f2846g = 0;
        this.f2847h = -1;
        this.f2842c = false;
        this.f2841b = 0;
    }

    public void q() {
        this.f2842c = false;
        this.f2841b = 0;
    }

    public void r(c.f.b.c cVar) {
        c.f.b.i iVar = this.f2848i;
        if (iVar == null) {
            this.f2848i = new c.f.b.i(i.a.UNRESTRICTED, null);
        } else {
            iVar.d();
        }
    }

    public void s(int i2) {
        this.f2841b = i2;
        this.f2842c = true;
    }

    public String toString() {
        return this.f2843d.r() + ":" + this.f2844e.toString();
    }
}