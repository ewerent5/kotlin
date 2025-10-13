package c.f.b;

import c.f.b.b;
import java.util.Arrays;

/* compiled from: ArrayLinkedVariables.java */
/* loaded from: classes.dex */
public class a implements b.a {
    private static float a = 0.001f;

    /* renamed from: c, reason: collision with root package name */
    private final b f2757c;

    /* renamed from: d, reason: collision with root package name */
    protected final c f2758d;

    /* renamed from: b, reason: collision with root package name */
    int f2756b = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f2759e = 8;

    /* renamed from: f, reason: collision with root package name */
    private i f2760f = null;

    /* renamed from: g, reason: collision with root package name */
    private int[] f2761g = new int[8];

    /* renamed from: h, reason: collision with root package name */
    private int[] f2762h = new int[8];

    /* renamed from: i, reason: collision with root package name */
    private float[] f2763i = new float[8];

    /* renamed from: j, reason: collision with root package name */
    private int f2764j = -1;

    /* renamed from: k, reason: collision with root package name */
    private int f2765k = -1;

    /* renamed from: l, reason: collision with root package name */
    private boolean f2766l = false;

    a(b bVar, c cVar) {
        this.f2757c = bVar;
        this.f2758d = cVar;
    }

    @Override // c.f.b.b.a
    public int a() {
        return this.f2756b;
    }

    @Override // c.f.b.b.a
    public i b(int i2) {
        int i3 = this.f2764j;
        for (int i4 = 0; i3 != -1 && i4 < this.f2756b; i4++) {
            if (i4 == i2) {
                return this.f2758d.f2774d[this.f2761g[i3]];
            }
            i3 = this.f2762h[i3];
        }
        return null;
    }

    @Override // c.f.b.b.a
    public void c() {
        int i2 = this.f2764j;
        for (int i3 = 0; i2 != -1 && i3 < this.f2756b; i3++) {
            float[] fArr = this.f2763i;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.f2762h[i2];
        }
    }

    @Override // c.f.b.b.a
    public final void clear() {
        int i2 = this.f2764j;
        for (int i3 = 0; i2 != -1 && i3 < this.f2756b; i3++) {
            i iVar = this.f2758d.f2774d[this.f2761g[i2]];
            if (iVar != null) {
                iVar.c(this.f2757c);
            }
            i2 = this.f2762h[i2];
        }
        this.f2764j = -1;
        this.f2765k = -1;
        this.f2766l = false;
        this.f2756b = 0;
    }

    @Override // c.f.b.b.a
    public float d(int i2) {
        int i3 = this.f2764j;
        for (int i4 = 0; i3 != -1 && i4 < this.f2756b; i4++) {
            if (i4 == i2) {
                return this.f2763i[i3];
            }
            i3 = this.f2762h[i3];
        }
        return 0.0f;
    }

    @Override // c.f.b.b.a
    public void e(i iVar, float f2, boolean z) {
        float f3 = a;
        if (f2 <= (-f3) || f2 >= f3) {
            int i2 = this.f2764j;
            if (i2 == -1) {
                this.f2764j = 0;
                this.f2763i[0] = f2;
                this.f2761g[0] = iVar.f2801d;
                this.f2762h[0] = -1;
                iVar.n++;
                iVar.a(this.f2757c);
                this.f2756b++;
                if (this.f2766l) {
                    return;
                }
                int i3 = this.f2765k + 1;
                this.f2765k = i3;
                int[] iArr = this.f2761g;
                if (i3 >= iArr.length) {
                    this.f2766l = true;
                    this.f2765k = iArr.length - 1;
                    return;
                }
                return;
            }
            int i4 = -1;
            for (int i5 = 0; i2 != -1 && i5 < this.f2756b; i5++) {
                int[] iArr2 = this.f2761g;
                int i6 = iArr2[i2];
                int i7 = iVar.f2801d;
                if (i6 == i7) {
                    float[] fArr = this.f2763i;
                    float f4 = fArr[i2] + f2;
                    float f5 = a;
                    if (f4 > (-f5) && f4 < f5) {
                        f4 = 0.0f;
                    }
                    fArr[i2] = f4;
                    if (f4 == 0.0f) {
                        if (i2 == this.f2764j) {
                            this.f2764j = this.f2762h[i2];
                        } else {
                            int[] iArr3 = this.f2762h;
                            iArr3[i4] = iArr3[i2];
                        }
                        if (z) {
                            iVar.c(this.f2757c);
                        }
                        if (this.f2766l) {
                            this.f2765k = i2;
                        }
                        iVar.n--;
                        this.f2756b--;
                        return;
                    }
                    return;
                }
                if (iArr2[i2] < i7) {
                    i4 = i2;
                }
                i2 = this.f2762h[i2];
            }
            int length = this.f2765k;
            int i8 = length + 1;
            if (this.f2766l) {
                int[] iArr4 = this.f2761g;
                if (iArr4[length] != -1) {
                    length = iArr4.length;
                }
            } else {
                length = i8;
            }
            int[] iArr5 = this.f2761g;
            if (length >= iArr5.length && this.f2756b < iArr5.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr6 = this.f2761g;
                    if (i9 >= iArr6.length) {
                        break;
                    }
                    if (iArr6[i9] == -1) {
                        length = i9;
                        break;
                    }
                    i9++;
                }
            }
            int[] iArr7 = this.f2761g;
            if (length >= iArr7.length) {
                length = iArr7.length;
                int i10 = this.f2759e * 2;
                this.f2759e = i10;
                this.f2766l = false;
                this.f2765k = length - 1;
                this.f2763i = Arrays.copyOf(this.f2763i, i10);
                this.f2761g = Arrays.copyOf(this.f2761g, this.f2759e);
                this.f2762h = Arrays.copyOf(this.f2762h, this.f2759e);
            }
            this.f2761g[length] = iVar.f2801d;
            this.f2763i[length] = f2;
            if (i4 != -1) {
                int[] iArr8 = this.f2762h;
                iArr8[length] = iArr8[i4];
                iArr8[i4] = length;
            } else {
                this.f2762h[length] = this.f2764j;
                this.f2764j = length;
            }
            iVar.n++;
            iVar.a(this.f2757c);
            this.f2756b++;
            if (!this.f2766l) {
                this.f2765k++;
            }
            int i11 = this.f2765k;
            int[] iArr9 = this.f2761g;
            if (i11 >= iArr9.length) {
                this.f2766l = true;
                this.f2765k = iArr9.length - 1;
            }
        }
    }

    @Override // c.f.b.b.a
    public final float f(i iVar) {
        int i2 = this.f2764j;
        for (int i3 = 0; i2 != -1 && i3 < this.f2756b; i3++) {
            if (this.f2761g[i2] == iVar.f2801d) {
                return this.f2763i[i2];
            }
            i2 = this.f2762h[i2];
        }
        return 0.0f;
    }

    @Override // c.f.b.b.a
    public boolean g(i iVar) {
        int i2 = this.f2764j;
        if (i2 == -1) {
            return false;
        }
        for (int i3 = 0; i2 != -1 && i3 < this.f2756b; i3++) {
            if (this.f2761g[i2] == iVar.f2801d) {
                return true;
            }
            i2 = this.f2762h[i2];
        }
        return false;
    }

    @Override // c.f.b.b.a
    public float h(b bVar, boolean z) {
        float f2 = f(bVar.a);
        j(bVar.a, z);
        b.a aVar = bVar.f2770e;
        int iA = aVar.a();
        for (int i2 = 0; i2 < iA; i2++) {
            i iVarB = aVar.b(i2);
            e(iVarB, aVar.f(iVarB) * f2, z);
        }
        return f2;
    }

    @Override // c.f.b.b.a
    public final void i(i iVar, float f2) {
        if (f2 == 0.0f) {
            j(iVar, true);
            return;
        }
        int i2 = this.f2764j;
        if (i2 == -1) {
            this.f2764j = 0;
            this.f2763i[0] = f2;
            this.f2761g[0] = iVar.f2801d;
            this.f2762h[0] = -1;
            iVar.n++;
            iVar.a(this.f2757c);
            this.f2756b++;
            if (this.f2766l) {
                return;
            }
            int i3 = this.f2765k + 1;
            this.f2765k = i3;
            int[] iArr = this.f2761g;
            if (i3 >= iArr.length) {
                this.f2766l = true;
                this.f2765k = iArr.length - 1;
                return;
            }
            return;
        }
        int i4 = -1;
        for (int i5 = 0; i2 != -1 && i5 < this.f2756b; i5++) {
            int[] iArr2 = this.f2761g;
            int i6 = iArr2[i2];
            int i7 = iVar.f2801d;
            if (i6 == i7) {
                this.f2763i[i2] = f2;
                return;
            }
            if (iArr2[i2] < i7) {
                i4 = i2;
            }
            i2 = this.f2762h[i2];
        }
        int length = this.f2765k;
        int i8 = length + 1;
        if (this.f2766l) {
            int[] iArr3 = this.f2761g;
            if (iArr3[length] != -1) {
                length = iArr3.length;
            }
        } else {
            length = i8;
        }
        int[] iArr4 = this.f2761g;
        if (length >= iArr4.length && this.f2756b < iArr4.length) {
            int i9 = 0;
            while (true) {
                int[] iArr5 = this.f2761g;
                if (i9 >= iArr5.length) {
                    break;
                }
                if (iArr5[i9] == -1) {
                    length = i9;
                    break;
                }
                i9++;
            }
        }
        int[] iArr6 = this.f2761g;
        if (length >= iArr6.length) {
            length = iArr6.length;
            int i10 = this.f2759e * 2;
            this.f2759e = i10;
            this.f2766l = false;
            this.f2765k = length - 1;
            this.f2763i = Arrays.copyOf(this.f2763i, i10);
            this.f2761g = Arrays.copyOf(this.f2761g, this.f2759e);
            this.f2762h = Arrays.copyOf(this.f2762h, this.f2759e);
        }
        this.f2761g[length] = iVar.f2801d;
        this.f2763i[length] = f2;
        if (i4 != -1) {
            int[] iArr7 = this.f2762h;
            iArr7[length] = iArr7[i4];
            iArr7[i4] = length;
        } else {
            this.f2762h[length] = this.f2764j;
            this.f2764j = length;
        }
        iVar.n++;
        iVar.a(this.f2757c);
        int i11 = this.f2756b + 1;
        this.f2756b = i11;
        if (!this.f2766l) {
            this.f2765k++;
        }
        int[] iArr8 = this.f2761g;
        if (i11 >= iArr8.length) {
            this.f2766l = true;
        }
        if (this.f2765k >= iArr8.length) {
            this.f2766l = true;
            this.f2765k = iArr8.length - 1;
        }
    }

    @Override // c.f.b.b.a
    public final float j(i iVar, boolean z) {
        if (this.f2760f == iVar) {
            this.f2760f = null;
        }
        int i2 = this.f2764j;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = 0;
        int i4 = -1;
        while (i2 != -1 && i3 < this.f2756b) {
            if (this.f2761g[i2] == iVar.f2801d) {
                if (i2 == this.f2764j) {
                    this.f2764j = this.f2762h[i2];
                } else {
                    int[] iArr = this.f2762h;
                    iArr[i4] = iArr[i2];
                }
                if (z) {
                    iVar.c(this.f2757c);
                }
                iVar.n--;
                this.f2756b--;
                this.f2761g[i2] = -1;
                if (this.f2766l) {
                    this.f2765k = i2;
                }
                return this.f2763i[i2];
            }
            i3++;
            i4 = i2;
            i2 = this.f2762h[i2];
        }
        return 0.0f;
    }

    @Override // c.f.b.b.a
    public void k(float f2) {
        int i2 = this.f2764j;
        for (int i3 = 0; i2 != -1 && i3 < this.f2756b; i3++) {
            float[] fArr = this.f2763i;
            fArr[i2] = fArr[i2] / f2;
            i2 = this.f2762h[i2];
        }
    }

    public String toString() {
        int i2 = this.f2764j;
        String str = "";
        for (int i3 = 0; i2 != -1 && i3 < this.f2756b; i3++) {
            str = ((str + " -> ") + this.f2763i[i2] + " : ") + this.f2758d.f2774d[this.f2761g[i2]];
            i2 = this.f2762h[i2];
        }
        return str;
    }
}