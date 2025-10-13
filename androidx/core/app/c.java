package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: ActivityRecreator.java */
/* loaded from: classes.dex */
final class c {
    protected static final Class<?> a;

    /* renamed from: b, reason: collision with root package name */
    protected static final Field f823b;

    /* renamed from: c, reason: collision with root package name */
    protected static final Field f824c;

    /* renamed from: d, reason: collision with root package name */
    protected static final Method f825d;

    /* renamed from: e, reason: collision with root package name */
    protected static final Method f826e;

    /* renamed from: f, reason: collision with root package name */
    protected static final Method f827f;

    /* renamed from: g, reason: collision with root package name */
    private static final Handler f828g = new Handler(Looper.getMainLooper());

    /* compiled from: ActivityRecreator.java */
    class a implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ d f829e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f830f;

        a(d dVar, Object obj) {
            this.f829e = dVar;
            this.f830f = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f829e.f835e = this.f830f;
        }
    }

    /* compiled from: ActivityRecreator.java */
    class b implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Application f831e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ d f832f;

        b(Application application, d dVar) {
            this.f831e = application;
            this.f832f = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f831e.unregisterActivityLifecycleCallbacks(this.f832f);
        }
    }

    /* compiled from: ActivityRecreator.java */
    /* renamed from: androidx.core.app.c$c, reason: collision with other inner class name */
    class RunnableC0008c implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f833e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f834f;

        RunnableC0008c(Object obj, Object obj2) {
            this.f833e = obj;
            this.f834f = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = c.f825d;
                if (method != null) {
                    method.invoke(this.f833e, this.f834f, Boolean.FALSE, "AppCompat recreation");
                } else {
                    c.f826e.invoke(this.f833e, this.f834f, Boolean.FALSE);
                }
            } catch (RuntimeException e2) {
                if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                    throw e2;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* compiled from: ActivityRecreator.java */
    private static final class d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: e, reason: collision with root package name */
        Object f835e;

        /* renamed from: f, reason: collision with root package name */
        private Activity f836f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f837g = false;

        /* renamed from: h, reason: collision with root package name */
        private boolean f838h = false;

        /* renamed from: i, reason: collision with root package name */
        private boolean f839i = false;

        d(Activity activity) {
            this.f836f = activity;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f836f == activity) {
                this.f836f = null;
                this.f838h = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f838h || this.f839i || this.f837g || !c.h(this.f835e, activity)) {
                return;
            }
            this.f839i = true;
            this.f835e = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f836f == activity) {
                this.f837g = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> clsA = a();
        a = clsA;
        f823b = b();
        f824c = f();
        f825d = d(clsA);
        f826e = c(clsA);
        f827f = e(clsA);
    }

    private static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 == 26 || i2 == 27;
    }

    protected static boolean h(Object obj, Activity activity) {
        try {
            Object obj2 = f824c.get(activity);
            if (obj2 != obj) {
                return false;
            }
            f828g.postAtFrontOfQueue(new RunnableC0008c(f823b.get(activity), obj2));
            return true;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && f827f == null) {
            return false;
        }
        if (f826e == null && f825d == null) {
            return false;
        }
        try {
            Object obj2 = f824c.get(activity);
            if (obj2 == null || (obj = f823b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            d dVar = new d(activity);
            application.registerActivityLifecycleCallbacks(dVar);
            Handler handler = f828g;
            handler.post(new a(dVar, obj2));
            try {
                if (g()) {
                    Method method = f827f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, dVar));
                return true;
            } catch (Throwable th) {
                f828g.post(new b(application, dVar));
                throw th;
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}