package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LinearSmoothScroller.java */
/* loaded from: classes.dex */
public class l extends RecyclerView.z {

    /* renamed from: k, reason: collision with root package name */
    protected PointF f1761k;

    /* renamed from: l, reason: collision with root package name */
    private final DisplayMetrics f1762l;
    private float n;

    /* renamed from: i, reason: collision with root package name */
    protected final LinearInterpolator f1759i = new LinearInterpolator();

    /* renamed from: j, reason: collision with root package name */
    protected final DecelerateInterpolator f1760j = new DecelerateInterpolator();

    /* renamed from: m, reason: collision with root package name */
    private boolean f1763m = false;
    protected int o = 0;
    protected int p = 0;

    public l(Context context) {
        this.f1762l = context.getResources().getDisplayMetrics();
    }

    private float A() {
        if (!this.f1763m) {
            this.n = v(this.f1762l);
            this.f1763m = true;
        }
        return this.n;
    }

    private int y(int i2, int i3) {
        int i4 = i2 - i3;
        if (i2 * i4 <= 0) {
            return 0;
        }
        return i4;
    }

    protected int B() {
        PointF pointF = this.f1761k;
        if (pointF != null) {
            float f2 = pointF.y;
            if (f2 != 0.0f) {
                return f2 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    protected void C(RecyclerView.z.a aVar) {
        PointF pointFA = a(f());
        if (pointFA == null || (pointFA.x == 0.0f && pointFA.y == 0.0f)) {
            aVar.b(f());
            r();
            return;
        }
        i(pointFA);
        this.f1761k = pointFA;
        this.o = (int) (pointFA.x * 10000.0f);
        this.p = (int) (pointFA.y * 10000.0f);
        aVar.d((int) (this.o * 1.2f), (int) (this.p * 1.2f), (int) (x(10000) * 1.2f), this.f1759i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    protected void l(int i2, int i3, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
        if (c() == 0) {
            r();
            return;
        }
        this.o = y(this.o, i2);
        int iY = y(this.p, i3);
        this.p = iY;
        if (this.o == 0 && iY == 0) {
            C(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    protected void m() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    protected void n() {
        this.p = 0;
        this.o = 0;
        this.f1761k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    protected void o(View view, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
        int iT = t(view, z());
        int iU = u(view, B());
        int iW = w((int) Math.sqrt((iT * iT) + (iU * iU)));
        if (iW > 0) {
            aVar.d(-iT, -iU, iW, this.f1760j);
        }
    }

    public int s(int i2, int i3, int i4, int i5, int i6) {
        if (i6 == -1) {
            return i4 - i2;
        }
        if (i6 != 0) {
            if (i6 == 1) {
                return i5 - i3;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i7 = i4 - i2;
        if (i7 > 0) {
            return i7;
        }
        int i8 = i5 - i3;
        if (i8 < 0) {
            return i8;
        }
        return 0;
    }

    public int t(View view, int i2) {
        RecyclerView.o oVarE = e();
        if (oVarE == null || !oVarE.u()) {
            return 0;
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return s(oVarE.a0(view) - ((ViewGroup.MarginLayoutParams) pVar).leftMargin, oVarE.d0(view) + ((ViewGroup.MarginLayoutParams) pVar).rightMargin, oVarE.getPaddingLeft(), oVarE.u0() - oVarE.getPaddingRight(), i2);
    }

    public int u(View view, int i2) {
        RecyclerView.o oVarE = e();
        if (oVarE == null || !oVarE.v()) {
            return 0;
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return s(oVarE.e0(view) - ((ViewGroup.MarginLayoutParams) pVar).topMargin, oVarE.Y(view) + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin, oVarE.getPaddingTop(), oVarE.g0() - oVarE.getPaddingBottom(), i2);
    }

    protected float v(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    protected int w(int i2) {
        return (int) Math.ceil(x(i2) / 0.3356d);
    }

    protected int x(int i2) {
        return (int) Math.ceil(Math.abs(i2) * A());
    }

    protected int z() {
        PointF pointF = this.f1761k;
        if (pointF != null) {
            float f2 = pointF.x;
            if (f2 != 0.0f) {
                return f2 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }
}