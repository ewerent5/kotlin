package k.c.g.g.j;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.MotionEvent;
import java.util.Iterator;
import java.util.LinkedList;
import k.c.f.t;
import k.c.g.f;
import k.c.g.g.e;

/* compiled from: MyLocationNewOverlay.java */
/* loaded from: classes3.dex */
public class d extends e implements b, e.a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f16914f = e.e();
    protected float A;
    protected float B;

    /* renamed from: i, reason: collision with root package name */
    protected final float f16917i;

    /* renamed from: j, reason: collision with root package name */
    protected Bitmap f16918j;

    /* renamed from: k, reason: collision with root package name */
    protected Bitmap f16919k;

    /* renamed from: l, reason: collision with root package name */
    protected k.c.g.d f16920l;

    /* renamed from: m, reason: collision with root package name */
    private k.c.a.b f16921m;
    public c n;
    private Handler r;
    private Location u;
    protected final PointF z;

    /* renamed from: g, reason: collision with root package name */
    protected Paint f16915g = new Paint();

    /* renamed from: h, reason: collision with root package name */
    protected Paint f16916h = new Paint();
    private final LinkedList<Runnable> o = new LinkedList<>();
    private final Point p = new Point();
    private final Point q = new Point();
    private Object s = new Object();
    protected boolean t = true;
    private final k.c.f.e v = new k.c.f.e(0, 0);
    private boolean w = false;
    protected boolean x = false;
    protected boolean y = true;
    private boolean C = true;
    private boolean D = false;

    /* compiled from: MyLocationNewOverlay.java */
    class a implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Location f16922e;

        a(Location location) {
            this.f16922e = location;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.G(this.f16922e);
            Iterator it = d.this.o.iterator();
            while (it.hasNext()) {
                Thread thread = new Thread((Runnable) it.next());
                thread.setName(a.class.getName() + "#onLocationChanged");
                thread.start();
            }
            d.this.o.clear();
        }
    }

    public d(c cVar, k.c.g.d dVar) {
        float f2 = dVar.getContext().getResources().getDisplayMetrics().density;
        this.f16917i = f2;
        this.f16920l = dVar;
        this.f16921m = dVar.getController();
        this.f16916h.setARGB(0, 100, 100, 255);
        this.f16916h.setAntiAlias(true);
        this.f16915g.setFilterBitmap(true);
        F(((BitmapDrawable) dVar.getContext().getResources().getDrawable(k.c.d.a.f16571c)).getBitmap(), ((BitmapDrawable) dVar.getContext().getResources().getDrawable(k.c.d.a.f16574f)).getBitmap());
        this.z = new PointF((24.0f * f2) + 0.5f, (f2 * 39.0f) + 0.5f);
        this.r = new Handler(Looper.getMainLooper());
        H(cVar);
    }

    public boolean A(c cVar) {
        Location locationA;
        H(cVar);
        boolean zC = this.n.c(this);
        this.w = zC;
        if (zC && (locationA = this.n.a()) != null) {
            G(locationA);
        }
        k.c.g.d dVar = this.f16920l;
        if (dVar != null) {
            dVar.postInvalidate();
        }
        return zC;
    }

    public k.c.f.e B() {
        if (this.u == null) {
            return null;
        }
        return new k.c.f.e(this.u);
    }

    public boolean C() {
        return this.x;
    }

    public boolean D() {
        return this.w;
    }

    public boolean E(Runnable runnable) {
        if (this.n == null || this.u == null) {
            this.o.addLast(runnable);
            return false;
        }
        Thread thread = new Thread(runnable);
        thread.setName(d.class.getName() + "#runOnFirstFix");
        thread.start();
        return true;
    }

    public void F(Bitmap bitmap, Bitmap bitmap2) {
        this.f16918j = bitmap;
        this.f16919k = bitmap2;
        this.A = (bitmap2.getWidth() / 2.0f) - 0.5f;
        this.B = (this.f16919k.getHeight() / 2.0f) - 0.5f;
    }

    protected void G(Location location) {
        this.u = location;
        this.v.g(location.getLatitude(), this.u.getLongitude());
        if (this.x) {
            this.f16921m.b(this.v);
            return;
        }
        k.c.g.d dVar = this.f16920l;
        if (dVar != null) {
            dVar.postInvalidate();
        }
    }

    protected void H(c cVar) {
        if (cVar == null) {
            throw new RuntimeException("You must pass an IMyLocationProvider to setMyLocationProvider()");
        }
        if (D()) {
            I();
        }
        this.n = cVar;
    }

    protected void I() {
        Object obj;
        c cVar = this.n;
        if (cVar != null) {
            cVar.b();
        }
        Handler handler = this.r;
        if (handler == null || (obj = this.s) == null) {
            return;
        }
        handler.removeCallbacksAndMessages(obj);
    }

    @Override // k.c.g.g.j.b
    public void a(Location location, c cVar) {
        Handler handler;
        if (location == null || (handler = this.r) == null) {
            return;
        }
        handler.postAtTime(new a(location), this.s, 0L);
    }

    @Override // k.c.g.g.e
    public void c(Canvas canvas, f fVar) {
        if (this.u == null || !D()) {
            return;
        }
        y(canvas, fVar, this.u);
    }

    @Override // k.c.g.g.e.a
    public boolean d(int i2, int i3, Point point, k.c.a.c cVar) {
        if (this.u != null) {
            this.f16920l.getProjection().J(this.v, this.q);
            Point point2 = this.q;
            point.x = point2.x;
            point.y = point2.y;
            double d2 = i2 - point2.x;
            double d3 = i3 - point2.y;
            z = (d2 * d2) + (d3 * d3) < 64.0d;
            if (k.c.b.a.a().c()) {
                Log.d("OsmDroid", "snap=" + z);
            }
        }
        return z;
    }

    @Override // k.c.g.g.e
    public void h(k.c.g.d dVar) {
        x();
        this.f16920l = null;
        this.f16921m = null;
        this.r = null;
        this.f16916h = null;
        this.s = null;
        this.u = null;
        this.f16921m = null;
        c cVar = this.n;
        if (cVar != null) {
            cVar.destroy();
        }
        this.n = null;
        super.h(dVar);
    }

    @Override // k.c.g.g.e
    public boolean t(MotionEvent motionEvent, k.c.g.d dVar) {
        boolean z = motionEvent.getAction() == 2 && motionEvent.getPointerCount() == 1;
        if (motionEvent.getAction() == 0 && this.t) {
            w();
        } else if (z && C()) {
            return true;
        }
        return super.t(motionEvent, dVar);
    }

    public void w() {
        this.f16921m.e(false);
        this.x = false;
    }

    public void x() {
        this.w = false;
        I();
        k.c.g.d dVar = this.f16920l;
        if (dVar != null) {
            dVar.postInvalidate();
        }
    }

    protected void y(Canvas canvas, f fVar, Location location) {
        fVar.J(this.v, this.p);
        if (this.y) {
            float accuracy = location.getAccuracy() / ((float) t.c(location.getLatitude(), fVar.C()));
            this.f16916h.setAlpha(50);
            this.f16916h.setStyle(Paint.Style.FILL);
            Point point = this.p;
            canvas.drawCircle(point.x, point.y, accuracy, this.f16916h);
            this.f16916h.setAlpha(150);
            this.f16916h.setStyle(Paint.Style.STROKE);
            Point point2 = this.p;
            canvas.drawCircle(point2.x, point2.y, accuracy, this.f16916h);
        }
        if (location.hasBearing()) {
            canvas.save();
            float bearing = location.getBearing();
            if (bearing >= 360.0f) {
                bearing -= 360.0f;
            }
            Point point3 = this.p;
            canvas.rotate(bearing, point3.x, point3.y);
            Bitmap bitmap = this.f16919k;
            Point point4 = this.p;
            canvas.drawBitmap(bitmap, point4.x - this.A, point4.y - this.B, this.f16915g);
            canvas.restore();
            return;
        }
        canvas.save();
        float f2 = -this.f16920l.getMapOrientation();
        Point point5 = this.p;
        canvas.rotate(f2, point5.x, point5.y);
        Bitmap bitmap2 = this.f16918j;
        float f3 = this.p.x;
        PointF pointF = this.z;
        canvas.drawBitmap(bitmap2, f3 - pointF.x, r8.y - pointF.y, this.f16915g);
        canvas.restore();
    }

    public boolean z() {
        return A(this.n);
    }
}