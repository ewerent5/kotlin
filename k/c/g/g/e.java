package k.c.g.g;

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import java.util.concurrent.atomic.AtomicInteger;
import k.c.f.t;

/* compiled from: Overlay.java */
/* loaded from: classes3.dex */
public abstract class e {
    private static AtomicInteger a = new AtomicInteger();

    /* renamed from: b, reason: collision with root package name */
    private static final Rect f16877b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    private boolean f16878c = true;

    /* renamed from: d, reason: collision with root package name */
    private final t f16879d;

    /* renamed from: e, reason: collision with root package name */
    protected k.c.f.a f16880e;

    /* compiled from: Overlay.java */
    public interface a {
        boolean d(int i2, int i3, Point point, k.c.a.c cVar);
    }

    public e() {
        t tileSystem = k.c.g.d.getTileSystem();
        this.f16879d = tileSystem;
        this.f16880e = new k.c.f.a(tileSystem.p(), tileSystem.q(), tileSystem.w(), tileSystem.x());
    }

    protected static final int e() {
        return a.getAndIncrement();
    }

    protected static final int f(int i2) {
        return a.getAndAdd(i2);
    }

    public void b(Canvas canvas, k.c.g.d dVar, boolean z) {
        if (z) {
            return;
        }
        c(canvas, dVar.getProjection());
    }

    public void c(Canvas canvas, k.c.g.f fVar) {
    }

    public boolean g() {
        return this.f16878c;
    }

    public void h(k.c.g.d dVar) {
    }

    public boolean i(MotionEvent motionEvent, k.c.g.d dVar) {
        return false;
    }

    public boolean j(MotionEvent motionEvent, k.c.g.d dVar) {
        return false;
    }

    public boolean k(MotionEvent motionEvent, k.c.g.d dVar) {
        return false;
    }

    public boolean l(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3, k.c.g.d dVar) {
        return false;
    }

    public boolean m(int i2, KeyEvent keyEvent, k.c.g.d dVar) {
        return false;
    }

    public boolean n(int i2, KeyEvent keyEvent, k.c.g.d dVar) {
        return false;
    }

    public boolean o(MotionEvent motionEvent, k.c.g.d dVar) {
        return false;
    }

    public boolean p(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3, k.c.g.d dVar) {
        return false;
    }

    public void q(MotionEvent motionEvent, k.c.g.d dVar) {
    }

    public boolean r(MotionEvent motionEvent, k.c.g.d dVar) {
        return false;
    }

    public boolean s(MotionEvent motionEvent, k.c.g.d dVar) {
        return false;
    }

    public boolean t(MotionEvent motionEvent, k.c.g.d dVar) {
        return false;
    }

    public boolean u(MotionEvent motionEvent, k.c.g.d dVar) {
        return false;
    }
}