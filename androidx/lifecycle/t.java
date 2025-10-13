package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.g;
import androidx.lifecycle.u;

/* compiled from: ProcessLifecycleOwner.java */
/* loaded from: classes.dex */
public class t implements k {

    /* renamed from: e, reason: collision with root package name */
    private static final t f1223e = new t();

    /* renamed from: j, reason: collision with root package name */
    private Handler f1228j;

    /* renamed from: f, reason: collision with root package name */
    private int f1224f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f1225g = 0;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1226h = true;

    /* renamed from: i, reason: collision with root package name */
    private boolean f1227i = true;

    /* renamed from: k, reason: collision with root package name */
    private final l f1229k = new l(this);

    /* renamed from: l, reason: collision with root package name */
    private Runnable f1230l = new a();

    /* renamed from: m, reason: collision with root package name */
    u.a f1231m = new b();

    /* compiled from: ProcessLifecycleOwner.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            t.this.f();
            t.this.g();
        }
    }

    /* compiled from: ProcessLifecycleOwner.java */
    class b implements u.a {
        b() {
        }

        @Override // androidx.lifecycle.u.a
        public void h() {
            t.this.c();
        }

        @Override // androidx.lifecycle.u.a
        public void i() {
        }

        @Override // androidx.lifecycle.u.a
        public void onResume() {
            t.this.b();
        }
    }

    /* compiled from: ProcessLifecycleOwner.java */
    class c extends d {

        /* compiled from: ProcessLifecycleOwner.java */
        class a extends d {
            a() {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                t.this.b();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                t.this.c();
            }
        }

        c() {
        }

        @Override // androidx.lifecycle.d, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT < 29) {
                u.f(activity).h(t.this.f1231m);
            }
        }

        @Override // androidx.lifecycle.d, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            t.this.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // androidx.lifecycle.d, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            t.this.d();
        }
    }

    private t() {
    }

    static void h(Context context) {
        f1223e.e(context);
    }

    void a() {
        int i2 = this.f1225g - 1;
        this.f1225g = i2;
        if (i2 == 0) {
            this.f1228j.postDelayed(this.f1230l, 700L);
        }
    }

    void b() {
        int i2 = this.f1225g + 1;
        this.f1225g = i2;
        if (i2 == 1) {
            if (!this.f1226h) {
                this.f1228j.removeCallbacks(this.f1230l);
            } else {
                this.f1229k.h(g.b.ON_RESUME);
                this.f1226h = false;
            }
        }
    }

    void c() {
        int i2 = this.f1224f + 1;
        this.f1224f = i2;
        if (i2 == 1 && this.f1227i) {
            this.f1229k.h(g.b.ON_START);
            this.f1227i = false;
        }
    }

    void d() {
        this.f1224f--;
        g();
    }

    void e(Context context) {
        this.f1228j = new Handler();
        this.f1229k.h(g.b.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new c());
    }

    void f() {
        if (this.f1225g == 0) {
            this.f1226h = true;
            this.f1229k.h(g.b.ON_PAUSE);
        }
    }

    void g() {
        if (this.f1224f == 0 && this.f1226h) {
            this.f1229k.h(g.b.ON_STOP);
            this.f1227i = true;
        }
    }

    @Override // androidx.lifecycle.k
    public g i() {
        return this.f1229k;
    }
}