package k.b.a.a;

import android.util.Log;
import android.view.MotionEvent;
import java.lang.reflect.Method;

/* compiled from: MultiTouchController.java */
/* loaded from: classes3.dex */
public class a<T> {
    public static final boolean a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f16523b = null;

    /* renamed from: c, reason: collision with root package name */
    private static Method f16524c = null;

    /* renamed from: d, reason: collision with root package name */
    private static Method f16525d = null;

    /* renamed from: e, reason: collision with root package name */
    private static Method f16526e = null;

    /* renamed from: f, reason: collision with root package name */
    private static Method f16527f = null;

    /* renamed from: g, reason: collision with root package name */
    private static Method f16528g = null;

    /* renamed from: h, reason: collision with root package name */
    private static Method f16529h = null;

    /* renamed from: i, reason: collision with root package name */
    private static Method f16530i = null;

    /* renamed from: j, reason: collision with root package name */
    private static int f16531j = 6;

    /* renamed from: k, reason: collision with root package name */
    private static int f16532k = 8;

    /* renamed from: l, reason: collision with root package name */
    private static final float[] f16533l;

    /* renamed from: m, reason: collision with root package name */
    private static final float[] f16534m;
    private static final float[] n;
    private static final int[] o;
    private long B;
    private long C;
    private float D;
    private float E;
    private float F;
    private float G;
    private float H;
    private float I;
    InterfaceC0211a<T> p;
    private float s;
    private float t;
    private float u;
    private float v;
    private float w;
    private float x;
    private boolean y;
    private T z = null;
    private c A = new c();
    private int J = 0;
    private b q = new b();
    private b r = new b();

    /* compiled from: MultiTouchController.java */
    /* renamed from: k.b.a.a.a$a, reason: collision with other inner class name */
    public interface InterfaceC0211a<T> {
        void a(T t, c cVar);

        void b(T t, b bVar);

        T c(b bVar);

        boolean d(T t, c cVar, b bVar);
    }

    /* compiled from: MultiTouchController.java */
    public static class b {
        private int a;

        /* renamed from: b, reason: collision with root package name */
        private float[] f16535b = new float[20];

        /* renamed from: c, reason: collision with root package name */
        private float[] f16536c = new float[20];

        /* renamed from: d, reason: collision with root package name */
        private float[] f16537d = new float[20];

        /* renamed from: e, reason: collision with root package name */
        private int[] f16538e = new int[20];

        /* renamed from: f, reason: collision with root package name */
        private float f16539f;

        /* renamed from: g, reason: collision with root package name */
        private float f16540g;

        /* renamed from: h, reason: collision with root package name */
        private float f16541h;

        /* renamed from: i, reason: collision with root package name */
        private float f16542i;

        /* renamed from: j, reason: collision with root package name */
        private float f16543j;

        /* renamed from: k, reason: collision with root package name */
        private float f16544k;

        /* renamed from: l, reason: collision with root package name */
        private float f16545l;

        /* renamed from: m, reason: collision with root package name */
        private float f16546m;
        private boolean n;
        private boolean o;
        private boolean p;
        private boolean q;
        private boolean r;
        private int s;
        private long t;

        private int m(int i2) {
            int i3 = 0;
            int i4 = 32768;
            int i5 = 15;
            while (true) {
                int i6 = i5 - 1;
                int i7 = ((i3 << 1) + i4) << i5;
                if (i2 >= i7) {
                    i3 += i4;
                    i2 -= i7;
                }
                i4 >>= 1;
                if (i4 <= 0) {
                    return i3;
                }
                i5 = i6;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(int i2, float[] fArr, float[] fArr2, float[] fArr3, int[] iArr, int i3, boolean z, long j2) {
            this.t = j2;
            this.s = i3;
            this.a = i2;
            for (int i4 = 0; i4 < i2; i4++) {
                this.f16535b[i4] = fArr[i4];
                this.f16536c[i4] = fArr2[i4];
                this.f16537d[i4] = fArr3[i4];
                this.f16538e[i4] = iArr[i4];
            }
            this.n = z;
            boolean z2 = i2 >= 2;
            this.o = z2;
            if (z2) {
                this.f16539f = (fArr[0] + fArr[1]) * 0.5f;
                this.f16540g = (fArr2[0] + fArr2[1]) * 0.5f;
                this.f16541h = (fArr3[0] + fArr3[1]) * 0.5f;
                this.f16542i = Math.abs(fArr[1] - fArr[0]);
                this.f16543j = Math.abs(fArr2[1] - fArr2[0]);
            } else {
                this.f16539f = fArr[0];
                this.f16540g = fArr2[0];
                this.f16541h = fArr3[0];
                this.f16543j = 0.0f;
                this.f16542i = 0.0f;
            }
            this.r = false;
            this.q = false;
            this.p = false;
        }

        public long c() {
            return this.t;
        }

        public float d() {
            if (!this.r) {
                if (this.o) {
                    float[] fArr = this.f16536c;
                    double d2 = fArr[1] - fArr[0];
                    float[] fArr2 = this.f16535b;
                    this.f16546m = (float) Math.atan2(d2, fArr2[1] - fArr2[0]);
                } else {
                    this.f16546m = 0.0f;
                }
                this.r = true;
            }
            return this.f16546m;
        }

        public float e() {
            if (!this.q) {
                if (this.o) {
                    float fM = f() != 0.0f ? m((int) (r0 * 256.0f)) / 16.0f : 0.0f;
                    this.f16544k = fM;
                    float f2 = this.f16542i;
                    if (fM < f2) {
                        this.f16544k = f2;
                    }
                    float f3 = this.f16544k;
                    float f4 = this.f16543j;
                    if (f3 < f4) {
                        this.f16544k = f4;
                    }
                } else {
                    this.f16544k = 0.0f;
                }
                this.q = true;
            }
            return this.f16544k;
        }

        public float f() {
            float f2;
            if (!this.p) {
                if (this.o) {
                    float f3 = this.f16542i;
                    float f4 = this.f16543j;
                    f2 = (f3 * f3) + (f4 * f4);
                } else {
                    f2 = 0.0f;
                }
                this.f16545l = f2;
                this.p = true;
            }
            return this.f16545l;
        }

        public float g() {
            if (this.o) {
                return this.f16543j;
            }
            return 0.0f;
        }

        public float h() {
            if (this.o) {
                return this.f16542i;
            }
            return 0.0f;
        }

        public float i() {
            return this.f16539f;
        }

        public float j() {
            return this.f16540g;
        }

        public boolean k() {
            return this.n;
        }

        public boolean l() {
            return this.o;
        }
    }

    /* compiled from: MultiTouchController.java */
    public static class c {
        private float a;

        /* renamed from: b, reason: collision with root package name */
        private float f16547b;

        /* renamed from: c, reason: collision with root package name */
        private float f16548c;

        /* renamed from: d, reason: collision with root package name */
        private float f16549d;

        /* renamed from: e, reason: collision with root package name */
        private float f16550e;

        /* renamed from: f, reason: collision with root package name */
        private float f16551f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f16552g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f16553h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f16554i;

        public float j() {
            if (this.f16552g) {
                return this.f16548c;
            }
            return 1.0f;
        }

        public float k() {
            return this.a;
        }

        public float l() {
            return this.f16547b;
        }

        protected void m(float f2, float f3, float f4, float f5, float f6, float f7) {
            this.a = f2;
            this.f16547b = f3;
            if (f4 == 0.0f) {
                f4 = 1.0f;
            }
            this.f16548c = f4;
            if (f5 == 0.0f) {
                f5 = 1.0f;
            }
            this.f16549d = f5;
            if (f6 == 0.0f) {
                f6 = 1.0f;
            }
            this.f16550e = f6;
            this.f16551f = f7;
        }

        public void n(float f2, float f3, boolean z, float f4, boolean z2, float f5, float f6, boolean z3, float f7) {
            this.a = f2;
            this.f16547b = f3;
            this.f16552g = z;
            if (f4 == 0.0f) {
                f4 = 1.0f;
            }
            this.f16548c = f4;
            this.f16553h = z2;
            if (f5 == 0.0f) {
                f5 = 1.0f;
            }
            this.f16549d = f5;
            if (f6 == 0.0f) {
                f6 = 1.0f;
            }
            this.f16550e = f6;
            this.f16554i = z3;
            this.f16551f = f7;
        }
    }

    static {
        boolean z = true;
        try {
            f16523b = MotionEvent.class.getMethod("getPointerCount", new Class[0]);
            Class cls = Integer.TYPE;
            f16524c = MotionEvent.class.getMethod("getPointerId", cls);
            f16525d = MotionEvent.class.getMethod("getPressure", cls);
            f16526e = MotionEvent.class.getMethod("getHistoricalX", cls, cls);
            f16527f = MotionEvent.class.getMethod("getHistoricalY", cls, cls);
            f16528g = MotionEvent.class.getMethod("getHistoricalPressure", cls, cls);
            f16529h = MotionEvent.class.getMethod("getX", cls);
            f16530i = MotionEvent.class.getMethod("getY", cls);
        } catch (Exception e2) {
            Log.e("MultiTouchController", "static initializer failed", e2);
            z = false;
        }
        a = z;
        if (z) {
            try {
                f16531j = MotionEvent.class.getField("ACTION_POINTER_UP").getInt(null);
                f16532k = MotionEvent.class.getField("ACTION_POINTER_INDEX_SHIFT").getInt(null);
            } catch (Exception unused) {
            }
        }
        f16533l = new float[20];
        f16534m = new float[20];
        n = new float[20];
        o = new int[20];
    }

    public a(InterfaceC0211a<T> interfaceC0211a, boolean z) {
        this.y = z;
        this.p = interfaceC0211a;
    }

    private void a() {
        T t = this.z;
        if (t == null) {
            return;
        }
        this.p.a(t, this.A);
        float f2 = 1.0f / ((this.A.f16552g && this.A.f16548c != 0.0f) ? this.A.f16548c : 1.0f);
        c();
        this.D = (this.s - this.A.a) * f2;
        this.E = (this.t - this.A.f16547b) * f2;
        this.F = this.A.f16548c / this.u;
        this.H = this.A.f16549d / this.v;
        this.I = this.A.f16550e / this.w;
        this.G = this.A.f16551f - this.x;
    }

    private void b(int i2, float[] fArr, float[] fArr2, float[] fArr3, int[] iArr, int i3, boolean z, long j2) {
        b bVar = this.r;
        this.r = this.q;
        this.q = bVar;
        bVar.n(i2, fArr, fArr2, fArr3, iArr, i3, z, j2);
        e();
    }

    private void c() {
        this.s = this.q.i();
        this.t = this.q.j();
        this.u = Math.max(21.3f, !this.A.f16552g ? 0.0f : this.q.e());
        this.v = Math.max(30.0f, !this.A.f16553h ? 0.0f : this.q.h());
        this.w = Math.max(30.0f, !this.A.f16553h ? 0.0f : this.q.g());
        this.x = this.A.f16554i ? this.q.d() : 0.0f;
    }

    private void e() {
        int i2 = this.J;
        if (i2 == 0) {
            if (this.q.k()) {
                T tC = this.p.c(this.q);
                this.z = tC;
                if (tC != null) {
                    this.J = 1;
                    this.p.b(tC, this.q);
                    a();
                    long jC = this.q.c();
                    this.C = jC;
                    this.B = jC;
                    return;
                }
                return;
            }
            return;
        }
        if (i2 == 1) {
            if (!this.q.k()) {
                this.J = 0;
                InterfaceC0211a<T> interfaceC0211a = this.p;
                this.z = null;
                interfaceC0211a.b(null, this.q);
                return;
            }
            if (!this.q.l()) {
                if (this.q.c() < this.C) {
                    a();
                    return;
                } else {
                    g();
                    return;
                }
            }
            this.J = 2;
            a();
            long jC2 = this.q.c();
            this.B = jC2;
            this.C = jC2 + 20;
            return;
        }
        if (i2 != 2) {
            return;
        }
        if (!this.q.l() || !this.q.k()) {
            if (!this.q.k()) {
                this.J = 0;
                InterfaceC0211a<T> interfaceC0211a2 = this.p;
                this.z = null;
                interfaceC0211a2.b(null, this.q);
                return;
            }
            this.J = 1;
            a();
            long jC3 = this.q.c();
            this.B = jC3;
            this.C = jC3 + 20;
            return;
        }
        if (Math.abs(this.q.i() - this.r.i()) > 30.0f || Math.abs(this.q.j() - this.r.j()) > 30.0f || Math.abs(this.q.h() - this.r.h()) * 0.5f > 40.0f || Math.abs(this.q.g() - this.r.g()) * 0.5f > 40.0f) {
            a();
            long jC4 = this.q.c();
            this.B = jC4;
            this.C = jC4 + 20;
            return;
        }
        if (this.q.t < this.C) {
            a();
        } else {
            g();
        }
    }

    private void g() {
        if (this.z == null) {
            return;
        }
        float f2 = 1.0f;
        if (this.A.f16552g && this.A.f16548c != 0.0f) {
            f2 = this.A.f16548c;
        }
        c();
        this.A.m(this.s - (this.D * f2), this.t - (this.E * f2), this.F * this.u, this.H * this.v, this.I * this.w, this.G + this.x);
        this.p.d(this.z, this.A, this.q);
    }

    public boolean d() {
        return this.J == 2;
    }

    public boolean f(MotionEvent motionEvent) {
        try {
            int iIntValue = a ? ((Integer) f16523b.invoke(motionEvent, new Object[0])).intValue() : 1;
            if (this.J == 0 && !this.y && iIntValue == 1) {
                return false;
            }
            int action = motionEvent.getAction();
            int historySize = motionEvent.getHistorySize() / iIntValue;
            int i2 = 0;
            while (i2 <= historySize) {
                boolean z = i2 < historySize;
                if (!a || iIntValue == 1) {
                    f16533l[0] = z ? motionEvent.getHistoricalX(i2) : motionEvent.getX();
                    f16534m[0] = z ? motionEvent.getHistoricalY(i2) : motionEvent.getY();
                    n[0] = z ? motionEvent.getHistoricalPressure(i2) : motionEvent.getPressure();
                } else {
                    int iMin = Math.min(iIntValue, 20);
                    for (int i3 = 0; i3 < iMin; i3++) {
                        o[i3] = ((Integer) f16524c.invoke(motionEvent, Integer.valueOf(i3))).intValue();
                        f16533l[i3] = ((Float) (z ? f16526e.invoke(motionEvent, Integer.valueOf(i3), Integer.valueOf(i2)) : f16529h.invoke(motionEvent, Integer.valueOf(i3)))).floatValue();
                        f16534m[i3] = ((Float) (z ? f16527f.invoke(motionEvent, Integer.valueOf(i3), Integer.valueOf(i2)) : f16530i.invoke(motionEvent, Integer.valueOf(i3)))).floatValue();
                        n[i3] = ((Float) (z ? f16528g.invoke(motionEvent, Integer.valueOf(i3), Integer.valueOf(i2)) : f16525d.invoke(motionEvent, Integer.valueOf(i3)))).floatValue();
                    }
                }
                float[] fArr = f16533l;
                float[] fArr2 = f16534m;
                float[] fArr3 = n;
                int[] iArr = o;
                int i4 = z ? 2 : action;
                int i5 = i4;
                boolean z2 = z || !(action == 1 || (((1 << f16532k) - 1) & action) == f16531j || action == 3);
                int i6 = historySize;
                int i7 = i2;
                b(iIntValue, fArr, fArr2, fArr3, iArr, i5, z2, z ? motionEvent.getHistoricalEventTime(i2) : motionEvent.getEventTime());
                i2 = i7 + 1;
                historySize = i6;
            }
            return true;
        } catch (Exception e2) {
            Log.e("MultiTouchController", "onTouchEvent() failed", e2);
            return false;
        }
    }
}