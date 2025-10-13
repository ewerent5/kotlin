package e.c.b.c.v;

import android.content.Context;
import android.graphics.Color;
import e.c.b.c.z.b;

/* compiled from: ElevationOverlayProvider.java */
/* loaded from: classes.dex */
public class a {
    private final boolean a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15312b;

    /* renamed from: c, reason: collision with root package name */
    private final int f15313c;

    /* renamed from: d, reason: collision with root package name */
    private final float f15314d;

    public a(Context context) {
        this.a = b.b(context, e.c.b.c.b.o, false);
        this.f15312b = e.c.b.c.s.a.a(context, e.c.b.c.b.n, 0);
        this.f15313c = e.c.b.c.s.a.a(context, e.c.b.c.b.f15081l, 0);
        this.f15314d = context.getResources().getDisplayMetrics().density;
    }

    private boolean e(int i2) {
        return c.h.d.a.d(i2, 255) == this.f15313c;
    }

    public float a(float f2) {
        if (this.f15314d <= 0.0f || f2 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f2 / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i2, float f2) {
        float fA = a(f2);
        return c.h.d.a.d(e.c.b.c.s.a.f(c.h.d.a.d(i2, 255), this.f15312b, fA), Color.alpha(i2));
    }

    public int c(int i2, float f2) {
        return (this.a && e(i2)) ? b(i2, f2) : i2;
    }

    public boolean d() {
        return this.a;
    }
}