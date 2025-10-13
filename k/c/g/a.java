package k.c.g;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.os.Build;
import android.view.MotionEvent;
import android.view.animation.LinearInterpolator;
import java.lang.Thread;

/* compiled from: CustomZoomButtonsController.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private final k.c.g.d f16773b;

    /* renamed from: c, reason: collision with root package name */
    private final ValueAnimator f16774c;

    /* renamed from: d, reason: collision with root package name */
    private k.c.g.b f16775d;

    /* renamed from: e, reason: collision with root package name */
    private e f16776e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f16777f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f16778g;

    /* renamed from: h, reason: collision with root package name */
    private float f16779h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f16780i;

    /* renamed from: m, reason: collision with root package name */
    private boolean f16784m;
    private long n;
    private Thread o;
    private final Runnable p;
    private final Object a = new Object();

    /* renamed from: j, reason: collision with root package name */
    private f f16781j = f.NEVER;

    /* renamed from: k, reason: collision with root package name */
    private int f16782k = 500;

    /* renamed from: l, reason: collision with root package name */
    private int f16783l = 3500;

    /* compiled from: CustomZoomButtonsController.java */
    /* renamed from: k.c.g.a$a, reason: collision with other inner class name */
    class C0216a implements ValueAnimator.AnimatorUpdateListener {
        C0216a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (a.this.f16780i) {
                a.this.f16774c.cancel();
                return;
            }
            a.this.f16779h = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.l();
        }
    }

    /* compiled from: CustomZoomButtonsController.java */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() throws InterruptedException {
            while (true) {
                long jN = (a.this.n + a.this.f16783l) - a.this.n();
                if (jN <= 0) {
                    a.this.t();
                    return;
                }
                try {
                    Thread.sleep(jN, 0);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* compiled from: CustomZoomButtonsController.java */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f16774c.start();
        }
    }

    /* compiled from: CustomZoomButtonsController.java */
    static /* synthetic */ class d {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[f.values().length];
            a = iArr;
            try {
                iArr[f.ALWAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[f.NEVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[f.SHOW_AND_FADEOUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: CustomZoomButtonsController.java */
    public interface e {
        void onZoom(boolean z);
    }

    /* compiled from: CustomZoomButtonsController.java */
    public enum f {
        ALWAYS,
        NEVER,
        SHOW_AND_FADEOUT
    }

    public a(k.c.g.d dVar) {
        this.f16773b = dVar;
        this.f16775d = new k.c.g.b(dVar);
        if (Build.VERSION.SDK_INT >= 11) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f16774c = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.setDuration(this.f16782k);
            valueAnimatorOfFloat.addUpdateListener(new C0216a());
        } else {
            this.f16774c = null;
        }
        this.p = new b();
    }

    private boolean j() {
        if (!this.f16784m) {
            return false;
        }
        this.f16784m = false;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (this.f16780i) {
            return;
        }
        this.f16773b.postInvalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long n() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        if (this.f16780i) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 11) {
            this.f16774c.setStartDelay(0L);
            this.f16773b.post(new c());
        } else {
            this.f16779h = 0.0f;
            l();
        }
    }

    private void u() {
        if (Build.VERSION.SDK_INT >= 11) {
            this.f16774c.cancel();
        }
    }

    public void i() {
        if (!this.f16780i && this.f16781j == f.SHOW_AND_FADEOUT) {
            float f2 = this.f16779h;
            if (this.f16784m) {
                this.f16784m = false;
            } else {
                this.f16784m = f2 == 0.0f;
            }
            u();
            this.f16779h = 1.0f;
            this.n = n();
            l();
            Thread thread = this.o;
            if (thread == null || thread.getState() == Thread.State.TERMINATED) {
                synchronized (this.a) {
                    Thread thread2 = this.o;
                    if (thread2 == null || thread2.getState() == Thread.State.TERMINATED) {
                        Thread thread3 = new Thread(this.p);
                        this.o = thread3;
                        thread3.setName(getClass().getName() + "#active");
                        this.o.start();
                    }
                }
            }
        }
    }

    public void k(Canvas canvas) {
        this.f16775d.a(canvas, this.f16779h, this.f16777f, this.f16778g);
    }

    public boolean m(MotionEvent motionEvent) {
        e eVar;
        e eVar2;
        if (this.f16779h == 0.0f || j()) {
            return false;
        }
        if (this.f16775d.i(motionEvent, true)) {
            if (this.f16777f && (eVar2 = this.f16776e) != null) {
                eVar2.onZoom(true);
            }
            return true;
        }
        if (!this.f16775d.i(motionEvent, false)) {
            return false;
        }
        if (this.f16778g && (eVar = this.f16776e) != null) {
            eVar.onZoom(false);
        }
        return true;
    }

    public void o() {
        this.f16780i = true;
        u();
    }

    public void p(e eVar) {
        this.f16776e = eVar;
    }

    public void q(f fVar) {
        this.f16781j = fVar;
        int i2 = d.a[fVar.ordinal()];
        if (i2 == 1) {
            this.f16779h = 1.0f;
        } else if (i2 == 2 || i2 == 3) {
            this.f16779h = 0.0f;
        }
    }

    public void r(boolean z) {
        this.f16777f = z;
    }

    public void s(boolean z) {
        this.f16778g = z;
    }
}