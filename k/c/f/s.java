package k.c.f;

import android.graphics.Rect;

/* compiled from: TileLooper.java */
/* loaded from: classes3.dex */
public abstract class s {
    protected final Rect a;

    /* renamed from: b, reason: collision with root package name */
    protected int f16767b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16768c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16769d;

    public s() {
        this(false, false);
    }

    public abstract void a();

    public abstract void b(long j2, int i2, int i3);

    public void c() {
    }

    protected void d(double d2, r rVar) {
        t.z(rVar, t.A(d2), this.a);
        this.f16767b = t.k(d2);
        c();
        int i2 = 1 << this.f16767b;
        int i3 = this.a.left;
        while (true) {
            Rect rect = this.a;
            if (i3 > rect.right) {
                a();
                return;
            }
            for (int i4 = rect.top; i4 <= this.a.bottom; i4++) {
                if ((this.f16768c || (i3 >= 0 && i3 < i2)) && (this.f16769d || (i4 >= 0 && i4 < i2))) {
                    b(m.b(this.f16767b, o.f(i3, i2), o.f(i4, i2)), i3, i4);
                }
            }
            i3++;
        }
    }

    public void e(boolean z) {
        this.f16768c = z;
    }

    public void f(boolean z) {
        this.f16769d = z;
    }

    public s(boolean z, boolean z2) {
        this.a = new Rect();
        this.f16768c = true;
        this.f16769d = true;
        this.f16768c = z;
        this.f16769d = z2;
    }
}