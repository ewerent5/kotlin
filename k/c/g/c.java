package k.c.g;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.graphics.Point;
import android.os.Build;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import java.util.Iterator;
import java.util.LinkedList;
import k.c.f.o;
import k.c.f.t;
import k.c.g.d;

/* compiled from: MapController.java */
/* loaded from: classes3.dex */
public class c implements k.c.a.b, d.f {
    protected final k.c.g.d a;

    /* renamed from: b */
    private ScaleAnimation f16812b;

    /* renamed from: c */
    private ScaleAnimation f16813c;

    /* renamed from: e */
    private Animator f16815e;

    /* renamed from: d */
    private double f16814d = 0.0d;

    /* renamed from: f */
    private C0218c f16816f = new C0218c(this, null);

    /* compiled from: MapController.java */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.values().length];
            a = iArr;
            try {
                iArr[d.AnimateToGeoPoint.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.AnimateToPoint.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[d.SetCenterPoint.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[d.ZoomToSpanPoint.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: MapController.java */
    @TargetApi(11)
    private static class b implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {
        private final k.c.f.e a = new k.c.f.e(0.0d, 0.0d);

        /* renamed from: b */
        private final c f16817b;

        /* renamed from: c */
        private final Double f16818c;

        /* renamed from: d */
        private final Double f16819d;

        /* renamed from: e */
        private final k.c.a.a f16820e;

        /* renamed from: f */
        private final k.c.a.a f16821f;

        /* renamed from: g */
        private final Float f16822g;

        /* renamed from: h */
        private final Float f16823h;

        public b(c cVar, Double d2, Double d3, k.c.a.a aVar, k.c.a.a aVar2, Float f2, Float f3, Boolean bool) {
            this.f16817b = cVar;
            this.f16818c = d2;
            this.f16819d = d3;
            this.f16820e = aVar;
            this.f16821f = aVar2;
            if (f3 == null) {
                this.f16822g = null;
                this.f16823h = null;
            } else {
                this.f16822g = f2;
                this.f16823h = Float.valueOf((float) o.d(f2.floatValue(), f3.floatValue(), bool));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f16817b.m();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f16817b.m();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f16817b.n();
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (this.f16819d != null) {
                this.f16817b.a.P(this.f16818c.doubleValue() + ((this.f16819d.doubleValue() - this.f16818c.doubleValue()) * fFloatValue));
            }
            if (this.f16823h != null) {
                this.f16817b.a.setMapOrientation(this.f16822g.floatValue() + (this.f16823h.floatValue() * fFloatValue));
            }
            if (this.f16821f != null) {
                k.c.g.d dVar = this.f16817b.a;
                t tileSystem = k.c.g.d.getTileSystem();
                double dG = tileSystem.g(this.f16820e.a());
                double d2 = fFloatValue;
                double dG2 = tileSystem.g(dG + ((tileSystem.g(this.f16821f.a()) - dG) * d2));
                double dF = tileSystem.f(this.f16820e.b());
                this.a.g(tileSystem.f(dF + ((tileSystem.f(this.f16821f.b()) - dF) * d2)), dG2);
                this.f16817b.a.setExpectedCenter(this.a);
            }
            this.f16817b.a.invalidate();
        }
    }

    /* compiled from: MapController.java */
    private enum d {
        ZoomToSpanPoint,
        AnimateToPoint,
        AnimateToGeoPoint,
        SetCenterPoint
    }

    /* compiled from: MapController.java */
    protected static class e implements Animation.AnimationListener {
        private c a;

        public e(c cVar) {
            this.a = cVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.a.m();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            this.a.n();
        }
    }

    public c(k.c.g.d dVar) {
        this.a = dVar;
        if (!dVar.x()) {
            dVar.n(this);
        }
        if (Build.VERSION.SDK_INT < 11) {
            e eVar = new e(this);
            this.f16812b = new ScaleAnimation(1.0f, 2.0f, 1.0f, 2.0f, 1, 0.5f, 1, 0.5f);
            this.f16813c = new ScaleAnimation(1.0f, 0.5f, 1.0f, 0.5f, 1, 0.5f, 1, 0.5f);
            this.f16812b.setDuration(k.c.b.a.a().y());
            this.f16813c.setDuration(k.c.b.a.a().y());
            this.f16812b.setAnimationListener(eVar);
            this.f16813c.setAnimationListener(eVar);
        }
    }

    @Override // k.c.g.d.f
    public void a(View view, int i2, int i3, int i4, int i5) {
        this.f16816f.c();
    }

    @Override // k.c.a.b
    public void b(k.c.a.a aVar) {
        j(aVar, null, null);
    }

    @Override // k.c.a.b
    public void c(k.c.a.a aVar) {
        if (this.a.x()) {
            this.a.setExpectedCenter(aVar);
        } else {
            this.f16816f.d(aVar);
        }
    }

    @Override // k.c.a.b
    public boolean d() {
        return p(null);
    }

    @Override // k.c.a.b
    public void e(boolean z) {
        if (!this.a.getScroller().isFinished()) {
            if (z) {
                k.c.g.d dVar = this.a;
                dVar.f16844l = false;
                dVar.getScroller().abortAnimation();
            } else {
                o();
            }
        }
        if (Build.VERSION.SDK_INT < 11) {
            if (this.a.n.get()) {
                this.a.clearAnimation();
                return;
            }
            return;
        }
        Animator animator = this.f16815e;
        if (this.a.n.get()) {
            if (z) {
                animator.end();
            } else {
                animator.cancel();
            }
        }
    }

    @Override // k.c.a.b
    public boolean f(int i2, int i3) {
        return q(i2, i3, null);
    }

    @Override // k.c.a.b
    public double g(double d2) {
        return this.a.P(d2);
    }

    @Override // k.c.a.b
    public boolean h() {
        return r(null);
    }

    public void i(int i2, int i3) {
        if (!this.a.x()) {
            this.f16816f.a(i2, i3);
            return;
        }
        if (this.a.v()) {
            return;
        }
        k.c.g.d dVar = this.a;
        dVar.f16844l = false;
        int mapScrollX = (int) dVar.getMapScrollX();
        int mapScrollY = (int) this.a.getMapScrollY();
        int width = i2 - (this.a.getWidth() / 2);
        int height = i3 - (this.a.getHeight() / 2);
        if (width == mapScrollX && height == mapScrollY) {
            return;
        }
        this.a.getScroller().startScroll(mapScrollX, mapScrollY, width, height, k.c.b.a.a().d());
        this.a.postInvalidate();
    }

    public void j(k.c.a.a aVar, Double d2, Long l2) {
        k(aVar, d2, l2, null);
    }

    public void k(k.c.a.a aVar, Double d2, Long l2, Float f2) {
        l(aVar, d2, l2, f2, null);
    }

    public void l(k.c.a.a aVar, Double d2, Long l2, Float f2, Boolean bool) {
        if (!this.a.x()) {
            this.f16816f.b(aVar, d2, l2, f2, bool);
            return;
        }
        if (Build.VERSION.SDK_INT < 11) {
            Point pointJ = this.a.getProjection().J(aVar, null);
            i(pointJ.x, pointJ.y);
            return;
        }
        b bVar = new b(this, Double.valueOf(this.a.getZoomLevelDouble()), d2, new k.c.f.e(this.a.getProjection().k()), aVar, Float.valueOf(this.a.getMapOrientation()), f2, bool);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addListener(bVar);
        valueAnimatorOfFloat.addUpdateListener(bVar);
        if (l2 == null) {
            valueAnimatorOfFloat.setDuration(k.c.b.a.a().d());
        } else {
            valueAnimatorOfFloat.setDuration(l2.longValue());
        }
        Animator animator = this.f16815e;
        if (animator != null) {
            bVar.onAnimationCancel(animator);
        }
        this.f16815e = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
    }

    protected void m() {
        this.a.n.set(false);
        this.a.D();
        if (Build.VERSION.SDK_INT >= 11) {
            this.f16815e = null;
        } else {
            this.a.clearAnimation();
            this.f16812b.reset();
            this.f16813c.reset();
            g(this.f16814d);
        }
        this.a.invalidate();
    }

    protected void n() {
        this.a.n.set(true);
    }

    public void o() {
        k.c.g.d dVar = this.a;
        dVar.f16844l = false;
        dVar.getScroller().forceFinished(true);
    }

    public boolean p(Long l2) {
        return s(this.a.getZoomLevelDouble() + 1.0d, l2);
    }

    public boolean q(int i2, int i3, Long l2) {
        return t(this.a.getZoomLevelDouble() + 1.0d, i2, i3, l2);
    }

    public boolean r(Long l2) {
        return s(this.a.getZoomLevelDouble() - 1.0d, l2);
    }

    public boolean s(double d2, Long l2) {
        return t(d2, this.a.getWidth() / 2, this.a.getHeight() / 2, l2);
    }

    public boolean t(double d2, int i2, int i3, Long l2) {
        double maxZoomLevel = d2 > this.a.getMaxZoomLevel() ? this.a.getMaxZoomLevel() : d2;
        if (maxZoomLevel < this.a.getMinZoomLevel()) {
            maxZoomLevel = this.a.getMinZoomLevel();
        }
        double zoomLevelDouble = this.a.getZoomLevelDouble();
        if (!((maxZoomLevel < zoomLevelDouble && this.a.p()) || (maxZoomLevel > zoomLevelDouble && this.a.o())) || this.a.n.getAndSet(true)) {
            return false;
        }
        k.c.c.c cVar = null;
        for (k.c.c.a aVar : this.a.T) {
            if (cVar == null) {
                cVar = new k.c.c.c(this.a, maxZoomLevel);
            }
            aVar.a(cVar);
        }
        this.a.M(i2, i3);
        this.a.Q();
        float fPow = (float) Math.pow(2.0d, maxZoomLevel - zoomLevelDouble);
        if (Build.VERSION.SDK_INT >= 11) {
            b bVar = new b(this, Double.valueOf(zoomLevelDouble), Double.valueOf(maxZoomLevel), null, null, null, null, null);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addListener(bVar);
            valueAnimatorOfFloat.addUpdateListener(bVar);
            if (l2 == null) {
                valueAnimatorOfFloat.setDuration(k.c.b.a.a().y());
            } else {
                valueAnimatorOfFloat.setDuration(l2.longValue());
            }
            this.f16815e = valueAnimatorOfFloat;
            valueAnimatorOfFloat.start();
            return true;
        }
        this.f16814d = maxZoomLevel;
        if (maxZoomLevel > zoomLevelDouble) {
            this.a.startAnimation(this.f16812b);
        } else {
            this.a.startAnimation(this.f16813c);
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, fPow, 1.0f, fPow, 1, 0.5f, 1, 0.5f);
        if (l2 == null) {
            scaleAnimation.setDuration(k.c.b.a.a().y());
        } else {
            scaleAnimation.setDuration(l2.longValue());
        }
        scaleAnimation.setAnimationListener(new e(this));
        return true;
    }

    public void u(double d2, double d3) {
        if (d2 <= 0.0d || d3 <= 0.0d) {
            return;
        }
        if (!this.a.x()) {
            this.f16816f.e(d2, d3);
            return;
        }
        k.c.f.a aVarH = this.a.getProjection().h();
        double dC = this.a.getProjection().C();
        double dMax = Math.max(d2 / aVarH.j(), d3 / aVarH.v());
        if (dMax > 1.0d) {
            this.a.P(dC - o.e((float) dMax));
        } else if (dMax < 0.5d) {
            this.a.P((dC + o.e(1.0f / ((float) dMax))) - 1.0d);
        }
    }

    public void v(int i2, int i3) {
        u(i2 * 1.0E-6d, i3 * 1.0E-6d);
    }

    /* compiled from: MapController.java */
    /* renamed from: k.c.g.c$c */
    private class C0218c {
        private LinkedList<a> a;

        /* compiled from: MapController.java */
        /* renamed from: k.c.g.c$c$a */
        private class a {
            private d a;

            /* renamed from: b */
            private Point f16825b;

            /* renamed from: c */
            private k.c.a.a f16826c;

            /* renamed from: d */
            private final Long f16827d;

            /* renamed from: e */
            private final Double f16828e;

            /* renamed from: f */
            private final Float f16829f;

            /* renamed from: g */
            private final Boolean f16830g;

            public a(C0218c c0218c, d dVar, Point point, k.c.a.a aVar) {
                this(dVar, point, aVar, null, null, null, null);
            }

            public a(d dVar, Point point, k.c.a.a aVar, Double d2, Long l2, Float f2, Boolean bool) {
                this.a = dVar;
                this.f16825b = point;
                this.f16826c = aVar;
                this.f16827d = l2;
                this.f16828e = d2;
                this.f16829f = f2;
                this.f16830g = bool;
            }
        }

        private C0218c() {
            this.a = new LinkedList<>();
        }

        public void a(int i2, int i3) {
            this.a.add(new a(this, d.AnimateToPoint, new Point(i2, i3), null));
        }

        public void b(k.c.a.a aVar, Double d2, Long l2, Float f2, Boolean bool) {
            this.a.add(new a(d.AnimateToGeoPoint, null, aVar, d2, l2, f2, bool));
        }

        public void c() {
            Iterator<a> it = this.a.iterator();
            while (it.hasNext()) {
                a next = it.next();
                int i2 = a.a[next.a.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 == 4 && next.f16825b != null) {
                                c.this.v(next.f16825b.x, next.f16825b.y);
                            }
                        } else if (next.f16826c != null) {
                            c.this.c(next.f16826c);
                        }
                    } else if (next.f16825b != null) {
                        c.this.i(next.f16825b.x, next.f16825b.y);
                    }
                } else if (next.f16826c != null) {
                    c.this.l(next.f16826c, next.f16828e, next.f16827d, next.f16829f, next.f16830g);
                }
            }
            this.a.clear();
        }

        public void d(k.c.a.a aVar) {
            this.a.add(new a(this, d.SetCenterPoint, null, aVar));
        }

        public void e(double d2, double d3) {
            this.a.add(new a(this, d.ZoomToSpanPoint, new Point((int) (d2 * 1000000.0d), (int) (d3 * 1000000.0d)), null));
        }

        /* synthetic */ C0218c(c cVar, a aVar) {
            this();
        }
    }
}