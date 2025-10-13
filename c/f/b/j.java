package c.f.b;

import c.f.b.b;
import java.util.Arrays;

/* compiled from: SolverVariableValues.java */
/* loaded from: classes.dex */
public class j implements b.a {
    private static float a = 0.001f;

    /* renamed from: b, reason: collision with root package name */
    private final int f2817b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f2818c = 16;

    /* renamed from: d, reason: collision with root package name */
    private int f2819d = 16;

    /* renamed from: e, reason: collision with root package name */
    int[] f2820e = new int[16];

    /* renamed from: f, reason: collision with root package name */
    int[] f2821f = new int[16];

    /* renamed from: g, reason: collision with root package name */
    int[] f2822g = new int[16];

    /* renamed from: h, reason: collision with root package name */
    float[] f2823h = new float[16];

    /* renamed from: i, reason: collision with root package name */
    int[] f2824i = new int[16];

    /* renamed from: j, reason: collision with root package name */
    int[] f2825j = new int[16];

    /* renamed from: k, reason: collision with root package name */
    int f2826k = 0;

    /* renamed from: l, reason: collision with root package name */
    int f2827l = -1;

    /* renamed from: m, reason: collision with root package name */
    private final b f2828m;
    protected final c n;

    j(b bVar, c cVar) {
        this.f2828m = bVar;
        this.n = cVar;
        clear();
    }

    private void l(i iVar, int i2) {
        int[] iArr;
        int i3 = iVar.f2801d % this.f2819d;
        int[] iArr2 = this.f2820e;
        int i4 = iArr2[i3];
        if (i4 == -1) {
            iArr2[i3] = i2;
        } else {
            while (true) {
                iArr = this.f2821f;
                if (iArr[i4] == -1) {
                    break;
                } else {
                    i4 = iArr[i4];
                }
            }
            iArr[i4] = i2;
        }
        this.f2821f[i2] = -1;
    }

    private void m(int i2, i iVar, float f2) {
        this.f2822g[i2] = iVar.f2801d;
        this.f2823h[i2] = f2;
        this.f2824i[i2] = -1;
        this.f2825j[i2] = -1;
        iVar.a(this.f2828m);
        iVar.n++;
        this.f2826k++;
    }

    private int n() {
        for (int i2 = 0; i2 < this.f2818c; i2++) {
            if (this.f2822g[i2] == -1) {
                return i2;
            }
        }
        return -1;
    }

    private void o() {
        int i2 = this.f2818c * 2;
        this.f2822g = Arrays.copyOf(this.f2822g, i2);
        this.f2823h = Arrays.copyOf(this.f2823h, i2);
        this.f2824i = Arrays.copyOf(this.f2824i, i2);
        this.f2825j = Arrays.copyOf(this.f2825j, i2);
        this.f2821f = Arrays.copyOf(this.f2821f, i2);
        for (int i3 = this.f2818c; i3 < i2; i3++) {
            this.f2822g[i3] = -1;
            this.f2821f[i3] = -1;
        }
        this.f2818c = i2;
    }

    private void q(int i2, i iVar, float f2) {
        int iN = n();
        m(iN, iVar, f2);
        if (i2 != -1) {
            this.f2824i[iN] = i2;
            int[] iArr = this.f2825j;
            iArr[iN] = iArr[i2];
            iArr[i2] = iN;
        } else {
            this.f2824i[iN] = -1;
            if (this.f2826k > 0) {
                this.f2825j[iN] = this.f2827l;
                this.f2827l = iN;
            } else {
                this.f2825j[iN] = -1;
            }
        }
        int[] iArr2 = this.f2825j;
        if (iArr2[iN] != -1) {
            this.f2824i[iArr2[iN]] = iN;
        }
        l(iVar, iN);
    }

    private void r(i iVar) {
        int[] iArr;
        int i2 = iVar.f2801d;
        int i3 = i2 % this.f2819d;
        int[] iArr2 = this.f2820e;
        int i4 = iArr2[i3];
        if (i4 == -1) {
            return;
        }
        if (this.f2822g[i4] == i2) {
            int[] iArr3 = this.f2821f;
            iArr2[i3] = iArr3[i4];
            iArr3[i4] = -1;
            return;
        }
        while (true) {
            iArr = this.f2821f;
            if (iArr[i4] == -1 || this.f2822g[iArr[i4]] == i2) {
                break;
            } else {
                i4 = iArr[i4];
            }
        }
        int i5 = iArr[i4];
        if (i5 == -1 || this.f2822g[i5] != i2) {
            return;
        }
        iArr[i4] = iArr[i5];
        iArr[i5] = -1;
    }

    @Override // c.f.b.b.a
    public int a() {
        return this.f2826k;
    }

    @Override // c.f.b.b.a
    public i b(int i2) {
        int i3 = this.f2826k;
        if (i3 == 0) {
            return null;
        }
        int i4 = this.f2827l;
        for (int i5 = 0; i5 < i3; i5++) {
            if (i5 == i2 && i4 != -1) {
                return this.n.f2774d[this.f2822g[i4]];
            }
            i4 = this.f2825j[i4];
            if (i4 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // c.f.b.b.a
    public void c() {
        int i2 = this.f2826k;
        int i3 = this.f2827l;
        for (int i4 = 0; i4 < i2; i4++) {
            float[] fArr = this.f2823h;
            fArr[i3] = fArr[i3] * (-1.0f);
            i3 = this.f2825j[i3];
            if (i3 == -1) {
                return;
            }
        }
    }

    @Override // c.f.b.b.a
    public void clear() {
        int i2 = this.f2826k;
        for (int i3 = 0; i3 < i2; i3++) {
            i iVarB = b(i3);
            if (iVarB != null) {
                iVarB.c(this.f2828m);
            }
        }
        for (int i4 = 0; i4 < this.f2818c; i4++) {
            this.f2822g[i4] = -1;
            this.f2821f[i4] = -1;
        }
        for (int i5 = 0; i5 < this.f2819d; i5++) {
            this.f2820e[i5] = -1;
        }
        this.f2826k = 0;
        this.f2827l = -1;
    }

    @Override // c.f.b.b.a
    public float d(int i2) {
        int i3 = this.f2826k;
        int i4 = this.f2827l;
        for (int i5 = 0; i5 < i3; i5++) {
            if (i5 == i2) {
                return this.f2823h[i4];
            }
            i4 = this.f2825j[i4];
            if (i4 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // c.f.b.b.a
    public void e(i iVar, float f2, boolean z) {
        float f3 = a;
        if (f2 <= (-f3) || f2 >= f3) {
            int iP = p(iVar);
            if (iP == -1) {
                i(iVar, f2);
                return;
            }
            float[] fArr = this.f2823h;
            fArr[iP] = fArr[iP] + f2;
            float f4 = fArr[iP];
            float f5 = a;
            if (f4 <= (-f5) || fArr[iP] >= f5) {
                return;
            }
            fArr[iP] = 0.0f;
            j(iVar, z);
        }
    }

    @Override // c.f.b.b.a
    public float f(i iVar) {
        int iP = p(iVar);
        if (iP != -1) {
            return this.f2823h[iP];
        }
        return 0.0f;
    }

    @Override // c.f.b.b.a
    public boolean g(i iVar) {
        return p(iVar) != -1;
    }

    @Override // c.f.b.b.a
    public float h(b bVar, boolean z) {
        float f2 = f(bVar.a);
        j(bVar.a, z);
        j jVar = (j) bVar.f2770e;
        int iA = jVar.a();
        int i2 = 0;
        int i3 = 0;
        while (i2 < iA) {
            int[] iArr = jVar.f2822g;
            if (iArr[i3] != -1) {
                e(this.n.f2774d[iArr[i3]], jVar.f2823h[i3] * f2, z);
                i2++;
            }
            i3++;
        }
        return f2;
    }

    @Override // c.f.b.b.a
    public void i(i iVar, float f2) {
        float f3 = a;
        if (f2 > (-f3) && f2 < f3) {
            j(iVar, true);
            return;
        }
        if (this.f2826k == 0) {
            m(0, iVar, f2);
            l(iVar, 0);
            this.f2827l = 0;
            return;
        }
        int iP = p(iVar);
        if (iP != -1) {
            this.f2823h[iP] = f2;
            return;
        }
        if (this.f2826k + 1 >= this.f2818c) {
            o();
        }
        int i2 = this.f2826k;
        int i3 = this.f2827l;
        int i4 = -1;
        for (int i5 = 0; i5 < i2; i5++) {
            int[] iArr = this.f2822g;
            int i6 = iArr[i3];
            int i7 = iVar.f2801d;
            if (i6 == i7) {
                this.f2823h[i3] = f2;
                return;
            }
            if (iArr[i3] < i7) {
                i4 = i3;
            }
            i3 = this.f2825j[i3];
            if (i3 == -1) {
                break;
            }
        }
        q(i4, iVar, f2);
    }

    @Override // c.f.b.b.a
    public float j(i iVar, boolean z) {
        int iP = p(iVar);
        if (iP == -1) {
            return 0.0f;
        }
        r(iVar);
        float f2 = this.f2823h[iP];
        if (this.f2827l == iP) {
            this.f2827l = this.f2825j[iP];
        }
        this.f2822g[iP] = -1;
        int[] iArr = this.f2824i;
        if (iArr[iP] != -1) {
            int[] iArr2 = this.f2825j;
            iArr2[iArr[iP]] = iArr2[iP];
        }
        int[] iArr3 = this.f2825j;
        if (iArr3[iP] != -1) {
            iArr[iArr3[iP]] = iArr[iP];
        }
        this.f2826k--;
        iVar.n--;
        if (z) {
            iVar.c(this.f2828m);
        }
        return f2;
    }

    @Override // c.f.b.b.a
    public void k(float f2) {
        int i2 = this.f2826k;
        int i3 = this.f2827l;
        for (int i4 = 0; i4 < i2; i4++) {
            float[] fArr = this.f2823h;
            fArr[i3] = fArr[i3] / f2;
            i3 = this.f2825j[i3];
            if (i3 == -1) {
                return;
            }
        }
    }

    public int p(i iVar) {
        int[] iArr;
        if (this.f2826k != 0 && iVar != null) {
            int i2 = iVar.f2801d;
            int i3 = this.f2820e[i2 % this.f2819d];
            if (i3 == -1) {
                return -1;
            }
            if (this.f2822g[i3] == i2) {
                return i3;
            }
            while (true) {
                iArr = this.f2821f;
                if (iArr[i3] == -1 || this.f2822g[iArr[i3]] == i2) {
                    break;
                }
                i3 = iArr[i3];
            }
            if (iArr[i3] != -1 && this.f2822g[iArr[i3]] == i2) {
                return iArr[i3];
            }
        }
        return -1;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i2 = this.f2826k;
        for (int i3 = 0; i3 < i2; i3++) {
            i iVarB = b(i3);
            if (iVarB != null) {
                String str2 = str + iVarB + " = " + d(i3) + " ";
                int iP = p(iVarB);
                String str3 = str2 + "[p: ";
                String str4 = (this.f2824i[iP] != -1 ? str3 + this.n.f2774d[this.f2822g[this.f2824i[iP]]] : str3 + "none") + ", n: ";
                str = (this.f2825j[iP] != -1 ? str4 + this.n.f2774d[this.f2822g[this.f2825j[iP]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}