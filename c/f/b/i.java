package c.f.b;

import java.util.Arrays;
import java.util.HashSet;

/* compiled from: SolverVariable.java */
/* loaded from: classes.dex */
public class i {
    private static int a = 1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2799b;

    /* renamed from: c, reason: collision with root package name */
    private String f2800c;

    /* renamed from: g, reason: collision with root package name */
    public float f2804g;

    /* renamed from: k, reason: collision with root package name */
    a f2808k;

    /* renamed from: d, reason: collision with root package name */
    public int f2801d = -1;

    /* renamed from: e, reason: collision with root package name */
    int f2802e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f2803f = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2805h = false;

    /* renamed from: i, reason: collision with root package name */
    float[] f2806i = new float[9];

    /* renamed from: j, reason: collision with root package name */
    float[] f2807j = new float[9];

    /* renamed from: l, reason: collision with root package name */
    b[] f2809l = new b[16];

    /* renamed from: m, reason: collision with root package name */
    int f2810m = 0;
    public int n = 0;
    boolean o = false;
    int p = -1;
    float q = 0.0f;
    HashSet<b> r = null;

    /* compiled from: SolverVariable.java */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f2808k = aVar;
    }

    static void b() {
        a++;
    }

    public final void a(b bVar) {
        int i2 = 0;
        while (true) {
            int i3 = this.f2810m;
            if (i2 >= i3) {
                b[] bVarArr = this.f2809l;
                if (i3 >= bVarArr.length) {
                    this.f2809l = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f2809l;
                int i4 = this.f2810m;
                bVarArr2[i4] = bVar;
                this.f2810m = i4 + 1;
                return;
            }
            if (this.f2809l[i2] == bVar) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void c(b bVar) {
        int i2 = this.f2810m;
        int i3 = 0;
        while (i3 < i2) {
            if (this.f2809l[i3] == bVar) {
                while (i3 < i2 - 1) {
                    b[] bVarArr = this.f2809l;
                    int i4 = i3 + 1;
                    bVarArr[i3] = bVarArr[i4];
                    i3 = i4;
                }
                this.f2810m--;
                return;
            }
            i3++;
        }
    }

    public void d() {
        this.f2800c = null;
        this.f2808k = a.UNKNOWN;
        this.f2803f = 0;
        this.f2801d = -1;
        this.f2802e = -1;
        this.f2804g = 0.0f;
        this.f2805h = false;
        this.o = false;
        this.p = -1;
        this.q = 0.0f;
        int i2 = this.f2810m;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f2809l[i3] = null;
        }
        this.f2810m = 0;
        this.n = 0;
        this.f2799b = false;
        Arrays.fill(this.f2807j, 0.0f);
    }

    public void e(d dVar, float f2) {
        this.f2804g = f2;
        this.f2805h = true;
        this.o = false;
        this.p = -1;
        this.q = 0.0f;
        int i2 = this.f2810m;
        this.f2802e = -1;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f2809l[i3].A(dVar, this, false);
        }
        this.f2810m = 0;
    }

    public void f(a aVar, String str) {
        this.f2808k = aVar;
    }

    public final void g(d dVar, b bVar) {
        int i2 = this.f2810m;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f2809l[i3].B(dVar, bVar, false);
        }
        this.f2810m = 0;
    }

    public String toString() {
        if (this.f2800c != null) {
            return "" + this.f2800c;
        }
        return "" + this.f2801d;
    }
}