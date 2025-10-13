package k.c.g;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Scroller;
import android.widget.ZoomButtonsController;
import ch.qos.logback.classic.Level;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import k.b.a.a.a;
import k.c.e.h;
import k.c.e.i;
import k.c.f.t;
import k.c.f.u;
import k.c.g.a;
import k.c.g.g.g;

/* compiled from: MapView.java */
/* loaded from: classes3.dex */
public class d extends ViewGroup implements k.c.a.c, a.InterfaceC0211a<Object> {

    /* renamed from: e, reason: collision with root package name */
    private static t f16837e = new u();
    private double A;
    private boolean B;
    private double C;
    private double D;
    private int E;
    private int F;
    private h G;
    private Handler H;
    private boolean I;
    private float J;
    final Point K;
    private final Point L;
    private final LinkedList<f> M;
    private boolean N;
    private boolean O;
    private boolean P;
    private k.c.f.e Q;
    private long R;
    private long S;
    protected List<k.c.c.a> T;
    private double U;
    private boolean V;
    private final k.c.g.e W;
    private final Rect a0;
    private boolean b0;
    private int c0;
    private int d0;
    private boolean e0;

    /* renamed from: f, reason: collision with root package name */
    private double f16838f;
    private boolean f0;

    /* renamed from: g, reason: collision with root package name */
    private g f16839g;

    /* renamed from: h, reason: collision with root package name */
    protected k.c.g.f f16840h;

    /* renamed from: i, reason: collision with root package name */
    private k.c.g.g.h f16841i;

    /* renamed from: j, reason: collision with root package name */
    private final GestureDetector f16842j;

    /* renamed from: k, reason: collision with root package name */
    private final Scroller f16843k;

    /* renamed from: l, reason: collision with root package name */
    protected boolean f16844l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f16845m;
    protected final AtomicBoolean n;
    protected Double o;
    protected Double p;
    private final k.c.g.c q;
    private final k.c.g.a r;
    private k.b.a.a.a<Object> s;
    private final PointF t;
    private final k.c.f.e u;
    private PointF v;
    private float w;
    private final Rect x;
    private boolean y;
    private double z;

    /* compiled from: MapView.java */
    private class c implements GestureDetector.OnDoubleTapListener {
        private c() {
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (d.this.getOverlayManager().T(motionEvent, d.this)) {
                return true;
            }
            d.this.getProjection().F((int) motionEvent.getX(), (int) motionEvent.getY(), d.this.K);
            k.c.a.b controller = d.this.getController();
            Point point = d.this.K;
            return controller.f(point.x, point.y);
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return d.this.getOverlayManager().H0(motionEvent, d.this);
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            return d.this.getOverlayManager().a0(motionEvent, d.this);
        }
    }

    /* compiled from: MapView.java */
    /* renamed from: k.c.g.d$d, reason: collision with other inner class name */
    private class GestureDetectorOnGestureListenerC0219d implements GestureDetector.OnGestureListener {
        private GestureDetectorOnGestureListenerC0219d() {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            d dVar = d.this;
            if (dVar.f16844l) {
                if (dVar.f16843k != null) {
                    d.this.f16843k.abortAnimation();
                }
                d.this.f16844l = false;
            }
            if (!d.this.getOverlayManager().k0(motionEvent, d.this) && d.this.r != null) {
                d.this.r.i();
            }
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            if (!d.this.e0 || d.this.f0) {
                d.this.f0 = false;
                return false;
            }
            if (d.this.getOverlayManager().O0(motionEvent, motionEvent2, f2, f3, d.this)) {
                return true;
            }
            if (d.this.f16845m) {
                d.this.f16845m = false;
                return false;
            }
            d dVar = d.this;
            dVar.f16844l = true;
            if (dVar.f16843k != null) {
                d.this.f16843k.fling((int) d.this.getMapScrollX(), (int) d.this.getMapScrollY(), -((int) f2), -((int) f3), Level.ALL_INT, Integer.MAX_VALUE, Level.ALL_INT, Integer.MAX_VALUE);
            }
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            if (d.this.s == null || !d.this.s.d()) {
                d.this.getOverlayManager().v0(motionEvent, d.this);
            }
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            if (d.this.getOverlayManager().h0(motionEvent, motionEvent2, f2, f3, d.this)) {
                return true;
            }
            d.this.scrollBy((int) f2, (int) f3);
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
            d.this.getOverlayManager().C(motionEvent, d.this);
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return d.this.getOverlayManager().B(motionEvent, d.this);
        }
    }

    /* compiled from: MapView.java */
    private class e implements a.e, ZoomButtonsController.OnZoomListener {
        private e() {
        }

        @Override // android.widget.ZoomButtonsController.OnZoomListener
        public void onVisibilityChanged(boolean z) {
        }

        @Override // k.c.g.a.e, android.widget.ZoomButtonsController.OnZoomListener
        public void onZoom(boolean z) {
            if (z) {
                d.this.getController().d();
            } else {
                d.this.getController().h();
            }
        }
    }

    /* compiled from: MapView.java */
    public interface f {
        void a(View view, int i2, int i3, int i4, int i5);
    }

    public d(Context context, h hVar, Handler handler, AttributeSet attributeSet) {
        this(context, hVar, handler, attributeSet, k.c.b.a.a().z());
    }

    private void E() {
        this.f16840h = null;
    }

    private MotionEvent H(MotionEvent motionEvent) {
        if (getMapOrientation() == 0.0f) {
            return motionEvent;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (Build.VERSION.SDK_INT < 11) {
            getProjection().L((int) motionEvent.getX(), (int) motionEvent.getY(), this.K);
            Point point = this.K;
            motionEventObtain.setLocation(point.x, point.y);
        } else {
            motionEventObtain.transform(getProjection().l());
        }
        return motionEventObtain;
    }

    private void R(k.c.e.n.d dVar) {
        float fA = dVar.a();
        int i2 = (int) (fA * (y() ? ((getResources().getDisplayMetrics().density * 256.0f) / fA) * this.J : this.J));
        if (k.c.b.a.a().u()) {
            Log.d("OsmDroid", "Scaling tiles to " + i2);
        }
        t.J(i2);
    }

    public static t getTileSystem() {
        return f16837e;
    }

    private void q() {
        this.r.r(o());
        this.r.s(p());
    }

    public static void setTileSystem(t tVar) {
        f16837e = tVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, k.c.e.n.d] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.StringBuilder] */
    private k.c.e.n.d u(AttributeSet attributeSet) {
        String attributeValue;
        k.c.e.n.e eVar = k.c.e.n.f.f16693d;
        if (attributeSet != null && (attributeValue = attributeSet.getAttributeValue(null, "tilesource")) != null) {
            try {
                ?? A = k.c.e.n.f.a(attributeValue);
                Log.i("OsmDroid", "Using tile source specified in layout attributes: " + A);
                eVar = A;
            } catch (IllegalArgumentException unused) {
                Log.w("OsmDroid", "Invalid tile source specified in layout attributes: " + eVar);
            }
        }
        if (attributeSet != null && (eVar instanceof k.c.e.n.c)) {
            String attributeValue2 = attributeSet.getAttributeValue(null, "style");
            if (attributeValue2 == null) {
                Log.i("OsmDroid", "Using default style: 1");
            } else {
                Log.i("OsmDroid", "Using style specified in layout attributes: " + attributeValue2);
                ((k.c.e.n.c) eVar).f(attributeValue2);
            }
        }
        Log.i("OsmDroid", "Using tile source: " + eVar.name());
        return eVar;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x005c. Please report as an issue. */
    protected void A(boolean z, int i2, int i3, int i4, int i5) {
        int paddingTop;
        long paddingTop2;
        int i6;
        long j2;
        int paddingTop3;
        E();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                b bVar = (b) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int measuredWidth = childAt.getMeasuredWidth();
                getProjection().J(bVar.a, this.L);
                if (getMapOrientation() != 0.0f) {
                    k.c.g.f projection = getProjection();
                    Point point = this.L;
                    Point pointF = projection.F(point.x, point.y, null);
                    Point point2 = this.L;
                    point2.x = pointF.x;
                    point2.y = pointF.y;
                }
                Point point3 = this.L;
                long paddingLeft = point3.x;
                long j3 = point3.y;
                switch (bVar.f16846b) {
                    case 1:
                        paddingLeft += getPaddingLeft();
                        paddingTop = getPaddingTop();
                        j3 += paddingTop;
                        break;
                    case 2:
                        paddingLeft = (getPaddingLeft() + paddingLeft) - (measuredWidth / 2);
                        paddingTop = getPaddingTop();
                        j3 += paddingTop;
                        break;
                    case 3:
                        paddingLeft = (getPaddingLeft() + paddingLeft) - measuredWidth;
                        paddingTop = getPaddingTop();
                        j3 += paddingTop;
                        break;
                    case 4:
                        paddingLeft += getPaddingLeft();
                        paddingTop2 = getPaddingTop() + j3;
                        i6 = measuredHeight / 2;
                        j2 = i6;
                        j3 = paddingTop2 - j2;
                        break;
                    case 5:
                        paddingLeft = (getPaddingLeft() + paddingLeft) - (measuredWidth / 2);
                        paddingTop2 = getPaddingTop() + j3;
                        i6 = measuredHeight / 2;
                        j2 = i6;
                        j3 = paddingTop2 - j2;
                        break;
                    case 6:
                        paddingLeft = (getPaddingLeft() + paddingLeft) - measuredWidth;
                        paddingTop2 = getPaddingTop() + j3;
                        i6 = measuredHeight / 2;
                        j2 = i6;
                        j3 = paddingTop2 - j2;
                        break;
                    case 7:
                        paddingLeft += getPaddingLeft();
                        paddingTop3 = getPaddingTop();
                        paddingTop2 = paddingTop3 + j3;
                        j2 = measuredHeight;
                        j3 = paddingTop2 - j2;
                        break;
                    case 8:
                        paddingLeft = (getPaddingLeft() + paddingLeft) - (measuredWidth / 2);
                        paddingTop3 = getPaddingTop();
                        paddingTop2 = paddingTop3 + j3;
                        j2 = measuredHeight;
                        j3 = paddingTop2 - j2;
                        break;
                    case 9:
                        paddingLeft = (getPaddingLeft() + paddingLeft) - measuredWidth;
                        paddingTop3 = getPaddingTop();
                        paddingTop2 = paddingTop3 + j3;
                        j2 = measuredHeight;
                        j3 = paddingTop2 - j2;
                        break;
                }
                long j4 = paddingLeft + bVar.f16847c;
                long j5 = j3 + bVar.f16848d;
                childAt.layout(t.M(j4), t.M(j5), t.M(j4 + measuredWidth), t.M(j5 + measuredHeight));
            }
        }
        if (!x()) {
            this.N = true;
            Iterator<f> it = this.M.iterator();
            while (it.hasNext()) {
                it.next().a(this, i2, i3, i4, i5);
            }
            this.M.clear();
        }
        E();
    }

    public void B() {
        getOverlayManager().q(this);
        this.G.i();
        k.c.g.a aVar = this.r;
        if (aVar != null) {
            aVar.o();
        }
        Handler handler = this.H;
        if (handler instanceof k.c.e.o.c) {
            ((k.c.e.o.c) handler).a();
        }
        this.H = null;
        k.c.g.f fVar = this.f16840h;
        if (fVar != null) {
            fVar.e();
        }
        this.f16840h = null;
        this.W.a();
        this.T.clear();
    }

    public void C(k.c.c.a aVar) {
        this.T.remove(aVar);
    }

    public void D() {
        this.v = null;
    }

    public void F() {
        this.y = false;
    }

    public void G() {
        this.B = false;
    }

    public void I(k.c.a.a aVar, long j2, long j3) {
        k.c.f.e eVarK = getProjection().k();
        this.Q = (k.c.f.e) aVar;
        K(-j2, -j3);
        E();
        if (!getProjection().k().equals(eVarK)) {
            k.c.c.b bVar = null;
            for (k.c.c.a aVar2 : this.T) {
                if (bVar == null) {
                    bVar = new k.c.c.b(this, 0, 0);
                }
                aVar2.b(bVar);
            }
        }
        invalidate();
    }

    public void J(float f2, boolean z) {
        this.w = f2 % 360.0f;
        if (z) {
            requestLayout();
            invalidate();
        }
    }

    void K(long j2, long j3) {
        this.R = j2;
        this.S = j3;
        requestLayout();
    }

    protected void L(float f2, float f3) {
        this.v = new PointF(f2, f3);
    }

    protected void M(float f2, float f3) {
        this.t.set(f2, f3);
        Point pointL = getProjection().L((int) f2, (int) f3, null);
        getProjection().f(pointL.x, pointL.y, this.u);
        L(f2, f3);
    }

    public void N(double d2, double d3, int i2) {
        this.y = true;
        this.z = d2;
        this.A = d3;
        this.F = i2;
    }

    public void O(double d2, double d3, int i2) {
        this.B = true;
        this.C = d2;
        this.D = d3;
        this.E = i2;
    }

    double P(double d2) {
        double dMax = Math.max(getMinZoomLevel(), Math.min(getMaxZoomLevel(), d2));
        double d3 = this.f16838f;
        if (dMax != d3) {
            Scroller scroller = this.f16843k;
            if (scroller != null) {
                scroller.forceFinished(true);
            }
            this.f16844l = false;
        }
        k.c.f.e eVarK = getProjection().k();
        this.f16838f = dMax;
        setExpectedCenter(eVarK);
        q();
        k.c.c.c cVar = null;
        if (x()) {
            getController().c(eVarK);
            Point point = new Point();
            k.c.g.f projection = getProjection();
            g overlayManager = getOverlayManager();
            PointF pointF = this.t;
            if (overlayManager.d((int) pointF.x, (int) pointF.y, point, this)) {
                getController().b(projection.g(point.x, point.y, null, false));
            }
            this.G.r(projection, dMax, d3, t(this.a0));
            this.f0 = true;
        }
        if (dMax != d3) {
            for (k.c.c.a aVar : this.T) {
                if (cVar == null) {
                    cVar = new k.c.c.c(this, dMax);
                }
                aVar.a(cVar);
            }
        }
        requestLayout();
        invalidate();
        return this.f16838f;
    }

    protected void Q() {
        this.U = getZoomLevelDouble();
    }

    @Override // k.b.a.a.a.InterfaceC0211a
    public void a(Object obj, a.c cVar) {
        Q();
        PointF pointF = this.t;
        cVar.n(pointF.x, pointF.y, true, 1.0f, false, 0.0f, 0.0f, false, 0.0f);
    }

    @Override // k.b.a.a.a.InterfaceC0211a
    public void b(Object obj, a.b bVar) {
        if (this.V) {
            this.f16838f = Math.round(this.f16838f);
            invalidate();
        }
        D();
    }

    @Override // k.b.a.a.a.InterfaceC0211a
    public Object c(a.b bVar) {
        if (v()) {
            return null;
        }
        M(bVar.i(), bVar.j());
        return this;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override // android.view.View
    public void computeScroll() {
        Scroller scroller = this.f16843k;
        if (scroller != null && this.f16844l && scroller.computeScrollOffset()) {
            if (this.f16843k.isFinished()) {
                this.f16844l = false;
            } else {
                scrollTo(this.f16843k.getCurrX(), this.f16843k.getCurrY());
                postInvalidate();
            }
        }
    }

    @Override // k.b.a.a.a.InterfaceC0211a
    public boolean d(Object obj, a.c cVar, a.b bVar) {
        L(cVar.k(), cVar.l());
        setMultiTouchScale(cVar.j());
        requestLayout();
        invalidate();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        E();
        getProjection().G(canvas, true, false);
        try {
            getOverlayManager().y0(canvas, this);
            getProjection().E(canvas, false);
            k.c.g.a aVar = this.r;
            if (aVar != null) {
                aVar.k(canvas);
            }
            super.dispatchDraw(canvas);
        } catch (Exception e2) {
            Log.e("OsmDroid", "error dispatchDraw, probably in edit mode", e2);
        }
        if (k.c.b.a.a().u()) {
            Log.d("OsmDroid", "Rendering overall: " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (k.c.b.a.a().u()) {
            Log.d("OsmDroid", "dispatchTouchEvent(" + motionEvent + ")");
        }
        if (this.r.m(motionEvent)) {
            this.r.i();
            return true;
        }
        MotionEvent motionEventH = H(motionEvent);
        try {
            if (super.dispatchTouchEvent(motionEvent)) {
                if (k.c.b.a.a().u()) {
                    Log.d("OsmDroid", "super handled onTouchEvent");
                }
                return true;
            }
            if (getOverlayManager().j0(motionEventH, this)) {
                if (motionEventH != motionEvent) {
                    motionEventH.recycle();
                }
                return true;
            }
            k.b.a.a.a<Object> aVar = this.s;
            if (aVar == null || !aVar.f(motionEvent)) {
                z = false;
            } else {
                if (k.c.b.a.a().u()) {
                    Log.d("OsmDroid", "mMultiTouchController handled onTouchEvent");
                }
                z = true;
            }
            if (this.f16842j.onTouchEvent(motionEventH)) {
                if (k.c.b.a.a().u()) {
                    Log.d("OsmDroid", "mGestureDetector handled onTouchEvent");
                }
                z = true;
            }
            if (z) {
                if (motionEventH != motionEvent) {
                    motionEventH.recycle();
                }
                return true;
            }
            if (motionEventH != motionEvent) {
                motionEventH.recycle();
            }
            if (k.c.b.a.a().u()) {
                Log.d("OsmDroid", "no-one handled onTouchEvent");
            }
            return false;
        } finally {
            if (motionEventH != motionEvent) {
                motionEventH.recycle();
            }
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b(-2, -2, null, 8, 0, 0);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public k.c.f.a getBoundingBox() {
        return getProjection().h();
    }

    public k.c.a.b getController() {
        return this.q;
    }

    k.c.f.e getExpectedCenter() {
        return this.Q;
    }

    public double getLatitudeSpanDouble() {
        return getBoundingBox().j();
    }

    public double getLongitudeSpanDouble() {
        return getBoundingBox().v();
    }

    public k.c.a.a getMapCenter() {
        return s(null);
    }

    public int getMapCenterOffsetX() {
        return this.c0;
    }

    public int getMapCenterOffsetY() {
        return this.d0;
    }

    public float getMapOrientation() {
        return this.w;
    }

    public k.c.g.g.h getMapOverlay() {
        return this.f16841i;
    }

    @Deprecated
    public float getMapScale() {
        return 1.0f;
    }

    public long getMapScrollX() {
        return this.R;
    }

    public long getMapScrollY() {
        return this.S;
    }

    public double getMaxZoomLevel() {
        Double d2 = this.p;
        return d2 == null ? this.f16841i.C() : d2.doubleValue();
    }

    public double getMinZoomLevel() {
        Double d2 = this.o;
        return d2 == null ? this.f16841i.D() : d2.doubleValue();
    }

    public g getOverlayManager() {
        return this.f16839g;
    }

    public List<k.c.g.g.e> getOverlays() {
        return getOverlayManager().s();
    }

    public k.c.g.e getRepository() {
        return this.W;
    }

    public Scroller getScroller() {
        return this.f16843k;
    }

    public h getTileProvider() {
        return this.G;
    }

    public Handler getTileRequestCompleteHandler() {
        return this.H;
    }

    public float getTilesScaleFactor() {
        return this.J;
    }

    public k.c.g.a getZoomController() {
        return this.r;
    }

    @Deprecated
    public int getZoomLevel() {
        return (int) getZoomLevelDouble();
    }

    public double getZoomLevelDouble() {
        return this.f16838f;
    }

    public void m(k.c.c.a aVar) {
        this.T.add(aVar);
    }

    public void n(f fVar) {
        if (x()) {
            return;
        }
        this.M.add(fVar);
    }

    public boolean o() {
        return this.f16838f < getMaxZoomLevel();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        if (this.b0) {
            B();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        return getOverlayManager().r0(i2, keyEvent, this) || super.onKeyDown(i2, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        return getOverlayManager().q0(i2, keyEvent, this) || super.onKeyUp(i2, keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        A(z, i2, i3, i4, i5);
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        measureChildren(i2, i3);
        super.onMeasure(i2, i3);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (getOverlayManager().l0(motionEvent, this)) {
            return true;
        }
        scrollBy((int) (motionEvent.getX() * 25.0f), (int) (motionEvent.getY() * 25.0f));
        return super.onTrackballEvent(motionEvent);
    }

    public boolean p() {
        return this.f16838f > getMinZoomLevel();
    }

    public Rect r(Rect rect) {
        if (rect == null) {
            rect = new Rect();
        }
        rect.set(0, 0, getWidth(), getHeight());
        return rect;
    }

    public k.c.a.a s(k.c.f.e eVar) {
        return getProjection().g(getWidth() / 2, getHeight() / 2, eVar, false);
    }

    @Override // android.view.View
    public void scrollBy(int i2, int i3) {
        scrollTo((int) (getMapScrollX() + i2), (int) (getMapScrollY() + i3));
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
        K(i2, i3);
        E();
        invalidate();
        if (getMapOrientation() != 0.0f) {
            A(true, getLeft(), getTop(), getRight(), getBottom());
        }
        k.c.c.b bVar = null;
        for (k.c.c.a aVar : this.T) {
            if (bVar == null) {
                bVar = new k.c.c.b(this, i2, i3);
            }
            aVar.b(bVar);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        this.f16841i.I(i2);
        invalidate();
    }

    @Deprecated
    public void setBuiltInZoomControls(boolean z) {
        this.r.q(z ? a.f.SHOW_AND_FADEOUT : a.f.NEVER);
    }

    public void setDestroyMode(boolean z) {
        this.b0 = z;
    }

    public void setExpectedCenter(k.c.a.a aVar) {
        I(aVar, 0L, 0L);
    }

    public void setFlingEnabled(boolean z) {
        this.e0 = z;
    }

    public void setHorizontalMapRepetitionEnabled(boolean z) {
        this.O = z;
        this.f16841i.H(z);
        E();
        invalidate();
    }

    @Deprecated
    public void setInitCenter(k.c.a.a aVar) {
        setExpectedCenter(aVar);
    }

    @Deprecated
    void setMapCenter(k.c.a.a aVar) {
        getController().b(aVar);
    }

    @Deprecated
    public void setMapListener(k.c.c.a aVar) {
        this.T.add(aVar);
    }

    public void setMapOrientation(float f2) {
        J(f2, true);
    }

    public void setMaxZoomLevel(Double d2) {
        this.p = d2;
    }

    public void setMinZoomLevel(Double d2) {
        this.o = d2;
    }

    public void setMultiTouchControls(boolean z) {
        this.s = z ? new k.b.a.a.a<>(this, false) : null;
    }

    protected void setMultiTouchScale(float f2) {
        P((Math.log(f2) / Math.log(2.0d)) + this.U);
    }

    public void setOverlayManager(g gVar) {
        this.f16839g = gVar;
    }

    @Deprecated
    protected void setProjection(k.c.g.f fVar) {
        this.f16840h = fVar;
    }

    public void setScrollableAreaLimitDouble(k.c.f.a aVar) {
        if (aVar == null) {
            F();
            G();
        } else {
            N(aVar.c(), aVar.d(), 0);
            O(aVar.s(), aVar.q(), 0);
        }
    }

    public void setTileProvider(h hVar) {
        this.G.i();
        this.G.g();
        this.G = hVar;
        hVar.o().add(this.H);
        R(this.G.p());
        k.c.g.g.h hVar2 = new k.c.g.g.h(this.G, getContext(), this.O, this.P);
        this.f16841i = hVar2;
        this.f16839g.N(hVar2);
        invalidate();
    }

    public void setTileSource(k.c.e.n.d dVar) {
        this.G.u(dVar);
        R(dVar);
        q();
        P(this.f16838f);
        postInvalidate();
    }

    public void setTilesScaleFactor(float f2) {
        this.J = f2;
        R(getTileProvider().p());
    }

    public void setTilesScaledToDpi(boolean z) {
        this.I = z;
        R(getTileProvider().p());
    }

    public void setUseDataConnection(boolean z) {
        this.f16841i.K(z);
    }

    public void setVerticalMapRepetitionEnabled(boolean z) {
        this.P = z;
        this.f16841i.L(z);
        E();
        invalidate();
    }

    public void setZoomRounding(boolean z) {
        this.V = z;
    }

    public Rect t(Rect rect) {
        Rect rectR = r(rect);
        if (getMapOrientation() != 0.0f && getMapOrientation() != 180.0f) {
            k.c.f.f.c(rectR, rectR.centerX(), rectR.centerY(), getMapOrientation(), rectR);
        }
        return rectR;
    }

    public boolean v() {
        return this.n.get();
    }

    public boolean w() {
        return this.O;
    }

    public boolean x() {
        return this.N;
    }

    public boolean y() {
        return this.I;
    }

    public boolean z() {
        return this.P;
    }

    public d(Context context, h hVar, Handler handler, AttributeSet attributeSet, boolean z) {
        super(context, attributeSet);
        this.f16838f = 0.0d;
        this.n = new AtomicBoolean(false);
        this.t = new PointF();
        this.u = new k.c.f.e(0.0d, 0.0d);
        this.w = 0.0f;
        this.x = new Rect();
        this.I = false;
        this.J = 1.0f;
        this.K = new Point();
        this.L = new Point();
        this.M = new LinkedList<>();
        this.N = false;
        this.O = true;
        this.P = true;
        this.T = new ArrayList();
        this.W = new k.c.g.e(this);
        this.a0 = new Rect();
        this.b0 = true;
        this.e0 = true;
        this.f0 = false;
        k.c.b.a.a().G(context);
        if (isInEditMode()) {
            this.H = null;
            this.q = null;
            this.r = null;
            this.f16843k = null;
            this.f16842j = null;
            return;
        }
        if (!z && Build.VERSION.SDK_INT >= 11) {
            setLayerType(1, null);
        }
        this.q = new k.c.g.c(this);
        this.f16843k = new Scroller(context);
        hVar = hVar == null ? new i(context.getApplicationContext(), u(attributeSet)) : hVar;
        this.H = handler == null ? new k.c.e.o.c(this) : handler;
        this.G = hVar;
        hVar.o().add(this.H);
        R(this.G.p());
        this.f16841i = new k.c.g.g.h(this.G, context, this.O, this.P);
        this.f16839g = new k.c.g.g.a(this.f16841i);
        k.c.g.a aVar = new k.c.g.a(this);
        this.r = aVar;
        aVar.p(new e());
        q();
        GestureDetector gestureDetector = new GestureDetector(context, new GestureDetectorOnGestureListenerC0219d());
        this.f16842j = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new c());
        if (k.c.b.a.a().a() && Build.VERSION.SDK_INT >= 16) {
            setHasTransientState(true);
        }
        aVar.q(a.f.SHOW_AND_FADEOUT);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public k.c.g.f getProjection() {
        if (this.f16840h == null) {
            k.c.g.f fVar = new k.c.g.f(this);
            this.f16840h = fVar;
            fVar.c(this.u, this.v);
            if (this.y) {
                fVar.a(this.z, this.A, true, this.F);
            }
            if (this.B) {
                fVar.a(this.C, this.D, false, this.E);
            }
            this.f16845m = fVar.H(this);
        }
        return this.f16840h;
    }

    /* compiled from: MapView.java */
    public static class b extends ViewGroup.LayoutParams {
        public k.c.a.a a;

        /* renamed from: b, reason: collision with root package name */
        public int f16846b;

        /* renamed from: c, reason: collision with root package name */
        public int f16847c;

        /* renamed from: d, reason: collision with root package name */
        public int f16848d;

        public b(int i2, int i3, k.c.a.a aVar, int i4, int i5, int i6) {
            super(i2, i3);
            if (aVar != null) {
                this.a = aVar;
            } else {
                this.a = new k.c.f.e(0.0d, 0.0d);
            }
            this.f16846b = i4;
            this.f16847c = i5;
            this.f16848d = i6;
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = new k.c.f.e(0.0d, 0.0d);
            this.f16846b = 8;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public d(Context context) {
        this(context, null, null, null);
    }
}