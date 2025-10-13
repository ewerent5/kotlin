package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* compiled from: ForwardingListener.java */
/* loaded from: classes.dex */
public abstract class h0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: e, reason: collision with root package name */
    private final float f461e;

    /* renamed from: f, reason: collision with root package name */
    private final int f462f;

    /* renamed from: g, reason: collision with root package name */
    private final int f463g;

    /* renamed from: h, reason: collision with root package name */
    final View f464h;

    /* renamed from: i, reason: collision with root package name */
    private Runnable f465i;

    /* renamed from: j, reason: collision with root package name */
    private Runnable f466j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f467k;

    /* renamed from: l, reason: collision with root package name */
    private int f468l;

    /* renamed from: m, reason: collision with root package name */
    private final int[] f469m = new int[2];

    /* compiled from: ForwardingListener.java */
    private class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = h0.this.f464h.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* compiled from: ForwardingListener.java */
    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h0.this.f();
        }
    }

    public h0(View view) {
        this.f464h = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f461e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f462f = tapTimeout;
        this.f463g = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void b() {
        Runnable runnable = this.f466j;
        if (runnable != null) {
            this.f464h.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f465i;
        if (runnable2 != null) {
            this.f464h.removeCallbacks(runnable2);
        }
    }

    private boolean g(MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException {
        f0 f0Var;
        View view = this.f464h;
        androidx.appcompat.view.menu.p pVarC = c();
        if (pVarC == null || !pVarC.a() || (f0Var = (f0) pVarC.j()) == null || !f0Var.isShown()) {
            return false;
        }
        MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        j(view, motionEventObtainNoHistory);
        k(f0Var, motionEventObtainNoHistory);
        boolean zE = f0Var.e(motionEventObtainNoHistory, this.f468l);
        motionEventObtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return zE && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean h(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f464h
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f468l
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f461e
            boolean r6 = i(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.b()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.b()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f468l = r6
            java.lang.Runnable r6 = r5.f465i
            if (r6 != 0) goto L52
            androidx.appcompat.widget.h0$a r6 = new androidx.appcompat.widget.h0$a
            r6.<init>()
            r5.f465i = r6
        L52:
            java.lang.Runnable r6 = r5.f465i
            int r1 = r5.f462f
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f466j
            if (r6 != 0) goto L65
            androidx.appcompat.widget.h0$b r6 = new androidx.appcompat.widget.h0$b
            r6.<init>()
            r5.f466j = r6
        L65:
            java.lang.Runnable r6 = r5.f466j
            int r1 = r5.f463g
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.h0.h(android.view.MotionEvent):boolean");
    }

    private static boolean i(View view, float f2, float f3, float f4) {
        float f5 = -f4;
        return f2 >= f5 && f3 >= f5 && f2 < ((float) (view.getRight() - view.getLeft())) + f4 && f3 < ((float) (view.getBottom() - view.getTop())) + f4;
    }

    private boolean j(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f469m);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    private boolean k(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f469m);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    public abstract androidx.appcompat.view.menu.p c();

    protected abstract boolean d();

    protected boolean e() {
        androidx.appcompat.view.menu.p pVarC = c();
        if (pVarC == null || !pVarC.a()) {
            return true;
        }
        pVarC.dismiss();
        return true;
    }

    void f() {
        b();
        View view = this.f464h;
        if (view.isEnabled() && !view.isLongClickable() && d()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f467k = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f467k;
        if (z2) {
            z = g(motionEvent) || !e();
        } else {
            z = h(motionEvent) && d();
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f464h.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f467k = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f467k = false;
        this.f468l = -1;
        Runnable runnable = this.f465i;
        if (runnable != null) {
            this.f464h.removeCallbacks(runnable);
        }
    }
}