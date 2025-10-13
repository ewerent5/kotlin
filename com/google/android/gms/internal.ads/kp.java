package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class kp {
    private final AtomicReference<ExecutorService> a = new AtomicReference<>(null);

    /* renamed from: b, reason: collision with root package name */
    private final Object f7022b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("gmpAppIdLock")
    private String f7023c = null;

    /* renamed from: d, reason: collision with root package name */
    @GuardedBy("gmpAppIdLock")
    private String f7024d = null;

    /* renamed from: e, reason: collision with root package name */
    final AtomicBoolean f7025e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    private final AtomicInteger f7026f = new AtomicInteger(-1);

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference<Object> f7027g = new AtomicReference<>(null);

    /* renamed from: h, reason: collision with root package name */
    private final AtomicReference<Object> f7028h = new AtomicReference<>(null);

    /* renamed from: i, reason: collision with root package name */
    private final ConcurrentMap<String, Method> f7029i = new ConcurrentHashMap(9);

    /* renamed from: j, reason: collision with root package name */
    private final AtomicReference<xx> f7030j = new AtomicReference<>(null);

    /* renamed from: k, reason: collision with root package name */
    @GuardedBy("proxyReference")
    private final BlockingQueue<FutureTask<?>> f7031k = new ArrayBlockingQueue(20);

    /* renamed from: l, reason: collision with root package name */
    private final Object f7032l = new Object();

    static final boolean A(Context context) throws NoSuchFieldException, ClassNotFoundException {
        if (!((Boolean) c.c().b(w3.c0)).booleanValue()) {
            return false;
        }
        if (DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) < ((Integer) c.c().b(w3.d0)).intValue()) {
            return false;
        }
        if (((Boolean) c.c().b(w3.e0)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    private final void B(Context context, final String str, String str2, Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (g(context)) {
            final Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e2) {
                String strValueOf = String.valueOf(str2);
                er.zzg(strValueOf.length() != 0 ? "Invalid event ID: ".concat(strValueOf) : new String("Invalid event ID: "), e2);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (A(context)) {
                d("logEventInternal", new jp(str, bundle2) { // from class: com.google.android.gms.internal.ads.wo
                    private final String a;

                    /* renamed from: b, reason: collision with root package name */
                    private final Bundle f10008b;

                    {
                        this.a = str;
                        this.f10008b = bundle2;
                    }

                    @Override // com.google.android.gms.internal.ads.jp
                    public final void a(xx xxVar) {
                        xxVar.E("am", this.a, this.f10008b);
                    }
                });
                return;
            }
            if (c(context, "com.google.android.gms.measurement.AppMeasurement", this.f7027g, true)) {
                Method declaredMethod = this.f7029i.get("logEventInternal");
                if (declaredMethod == null) {
                    try {
                        declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        this.f7029i.put("logEventInternal", declaredMethod);
                    } catch (Exception unused) {
                        a("logEventInternal", true);
                        declaredMethod = null;
                    }
                }
                try {
                    declaredMethod.invoke(this.f7027g.get(), "am", str, bundle2);
                } catch (Exception unused2) {
                    a("logEventInternal", true);
                }
            }
        }
    }

    private final Method C(Context context, String str) throws NoSuchMethodException, SecurityException {
        Method method = this.f7029i.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.f7029i.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            a(str, false);
            return null;
        }
    }

    private final void D(Context context, String str, String str2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (c(context, "com.google.android.gms.measurement.AppMeasurement", this.f7027g, true)) {
            Method declaredMethod = this.f7029i.get(str2);
            if (declaredMethod == null) {
                try {
                    declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                    this.f7029i.put(str2, declaredMethod);
                } catch (Exception unused) {
                    a(str2, false);
                    declaredMethod = null;
                }
            }
            try {
                declaredMethod.invoke(this.f7027g.get(), str);
                StringBuilder sb = new StringBuilder(str2.length() + 37 + String.valueOf(str).length());
                sb.append("Invoke Firebase method ");
                sb.append(str2);
                sb.append(", Ad Unit Id: ");
                sb.append(str);
                zze.zza(sb.toString());
            } catch (Exception unused2) {
                a(str2, false);
            }
        }
    }

    private final Object E(String str, Context context) throws NoSuchMethodException, SecurityException {
        if (!c(context, "com.google.android.gms.measurement.AppMeasurement", this.f7027g, true)) {
            return null;
        }
        try {
            return C(context, str).invoke(this.f7027g.get(), new Object[0]);
        } catch (Exception unused) {
            a(str, true);
            return null;
        }
    }

    private final void a(String str, boolean z) {
        if (this.f7025e.get()) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 30);
        sb.append("Invoke Firebase method ");
        sb.append(str);
        sb.append(" error.");
        er.zzi(sb.toString());
        if (z) {
            er.zzi("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            this.f7025e.set(true);
        }
    }

    private final ExecutorService b() {
        ExecutorService threadPoolExecutor;
        if (this.a.get() == null) {
            if (com.google.android.gms.common.util.e.a()) {
                threadPoolExecutor = k02.a().a(((Integer) c.c().b(w3.b0)).intValue(), new hp(this), 2);
            } else {
                o3<Integer> o3Var = w3.b0;
                threadPoolExecutor = new ThreadPoolExecutor(((Integer) c.c().b(o3Var)).intValue(), ((Integer) c.c().b(o3Var)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new hp(this));
            }
            this.a.compareAndSet(null, threadPoolExecutor);
        }
        return this.a.get();
    }

    private final boolean c(Context context, String str, AtomicReference<Object> atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                atomicReference.compareAndSet(null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            } catch (Exception unused) {
                a("getInstance", z);
                return false;
            }
        }
        return true;
    }

    private final void d(final String str, final jp jpVar) {
        synchronized (this.f7030j) {
            FutureTask<?> futureTask = new FutureTask<>(new Runnable(this, jpVar, str) { // from class: com.google.android.gms.internal.ads.xo

                /* renamed from: e, reason: collision with root package name */
                private final kp f10193e;

                /* renamed from: f, reason: collision with root package name */
                private final jp f10194f;

                /* renamed from: g, reason: collision with root package name */
                private final String f10195g;

                {
                    this.f10193e = this;
                    this.f10194f = jpVar;
                    this.f10195g = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f10193e.x(this.f10194f, this.f10195g);
                }
            }, null);
            if (this.f7030j.get() != null) {
                futureTask.run();
            } else {
                this.f7031k.offer(futureTask);
            }
        }
    }

    private final <T> T e(String str, T t, ip<T> ipVar) {
        synchronized (this.f7030j) {
            if (this.f7030j.get() != null) {
                try {
                    return ipVar.a(this.f7030j.get());
                } catch (Exception unused) {
                    a(str, false);
                }
            }
            return t;
        }
    }

    public final boolean f() {
        synchronized (this.f7032l) {
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(android.content.Context r5) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.o3<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.w3.V
            com.google.android.gms.internal.ads.u3 r1 = com.google.android.gms.internal.ads.c.c()
            java.lang.Object r0 = r1.b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L67
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.f7025e
            boolean r0 = r0.get()
            if (r0 == 0) goto L1c
            goto L67
        L1c:
            com.google.android.gms.internal.ads.o3<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.w3.f0
            com.google.android.gms.internal.ads.u3 r2 = com.google.android.gms.internal.ads.c.c()
            java.lang.Object r0 = r2.b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 1
            if (r0 == 0) goto L30
            return r2
        L30:
            java.util.concurrent.atomic.AtomicInteger r0 = r4.f7026f
            int r0 = r0.get()
            r3 = -1
            if (r0 != r3) goto L5e
            com.google.android.gms.internal.ads.ta3.a()
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            boolean r0 = com.google.android.gms.internal.ads.xq.n(r5, r0)
            if (r0 != 0) goto L59
            com.google.android.gms.internal.ads.ta3.a()
            boolean r5 = com.google.android.gms.internal.ads.xq.o(r5)
            if (r5 == 0) goto L59
            java.lang.String r5 = "Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service."
            com.google.android.gms.internal.ads.er.zzi(r5)
            java.util.concurrent.atomic.AtomicInteger r5 = r4.f7026f
            r5.set(r1)
            goto L5e
        L59:
            java.util.concurrent.atomic.AtomicInteger r5 = r4.f7026f
            r5.set(r2)
        L5e:
            java.util.concurrent.atomic.AtomicInteger r5 = r4.f7026f
            int r5 = r5.get()
            if (r5 != r2) goto L67
            return r2
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kp.g(android.content.Context):boolean");
    }

    public final void h(Context context, x2 x2Var) {
        lp.d(context).b().c(x2Var);
        if (((Boolean) c.c().b(w3.h0)).booleanValue() && g(context) && A(context)) {
            synchronized (this.f7032l) {
            }
        }
    }

    public final void i(Context context, m93 m93Var) {
        if (((Boolean) c.c().b(w3.h0)).booleanValue() && g(context) && A(context)) {
            synchronized (this.f7032l) {
            }
        }
    }

    public final void j(final Bundle bundle) {
        d("setConsent", new jp(bundle) { // from class: com.google.android.gms.internal.ads.to
            private final Bundle a;

            {
                this.a = bundle;
            }

            @Override // com.google.android.gms.internal.ads.jp
            public final void a(xx xxVar) {
                xxVar.D(this.a);
            }
        });
    }

    public final void k(Context context, final String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (g(context)) {
            if (A(context)) {
                d("beginAdUnitExposure", new jp(str) { // from class: com.google.android.gms.internal.ads.zo
                    private final String a;

                    {
                        this.a = str;
                    }

                    @Override // com.google.android.gms.internal.ads.jp
                    public final void a(xx xxVar) {
                        xxVar.J(this.a);
                    }
                });
            } else {
                D(context, str, "beginAdUnitExposure");
            }
        }
    }

    public final void l(Context context, final String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (g(context)) {
            if (A(context)) {
                d("endAdUnitExposure", new jp(str) { // from class: com.google.android.gms.internal.ads.ap
                    private final String a;

                    {
                        this.a = str;
                    }

                    @Override // com.google.android.gms.internal.ads.jp
                    public final void a(xx xxVar) {
                        xxVar.S(this.a);
                    }
                });
            } else {
                D(context, str, "endAdUnitExposure");
            }
        }
    }

    public final String m(Context context) {
        if (!g(context)) {
            return "";
        }
        if (A(context)) {
            return (String) e("getCurrentScreenNameOrScreenClass", "", bp.a);
        }
        if (!c(context, "com.google.android.gms.measurement.AppMeasurement", this.f7027g, true)) {
            return "";
        }
        try {
            String str = (String) C(context, "getCurrentScreenName").invoke(this.f7027g.get(), new Object[0]);
            if (str == null) {
                str = (String) C(context, "getCurrentScreenClass").invoke(this.f7027g.get(), new Object[0]);
            }
            return str != null ? str : "";
        } catch (Exception unused) {
            a("getCurrentScreenName", false);
            return "";
        }
    }

    @Deprecated
    public final void n(final Context context, final String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (g(context) && (context instanceof Activity)) {
            if (A(context)) {
                d("setScreenName", new jp(context, str) { // from class: com.google.android.gms.internal.ads.cp
                    private final Context a;

                    /* renamed from: b, reason: collision with root package name */
                    private final String f5345b;

                    {
                        this.a = context;
                        this.f5345b = str;
                    }

                    @Override // com.google.android.gms.internal.ads.jp
                    public final void a(xx xxVar) {
                        Context context2 = this.a;
                        xxVar.z1(e.c.b.b.b.d.m4(context2), this.f5345b, context2.getPackageName());
                    }
                });
                return;
            }
            if (c(context, "com.google.firebase.analytics.FirebaseAnalytics", this.f7028h, false)) {
                Method declaredMethod = this.f7029i.get("setCurrentScreen");
                if (declaredMethod == null) {
                    try {
                        declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                        this.f7029i.put("setCurrentScreen", declaredMethod);
                    } catch (Exception unused) {
                        a("setCurrentScreen", false);
                        declaredMethod = null;
                    }
                }
                try {
                    declaredMethod.invoke(this.f7028h.get(), (Activity) context, str, context.getPackageName());
                } catch (Exception unused2) {
                    a("setCurrentScreen", false);
                }
            }
        }
    }

    public final String o(Context context) {
        if (!g(context)) {
            return null;
        }
        synchronized (this.f7022b) {
            String str = this.f7023c;
            if (str != null) {
                return str;
            }
            if (A(context)) {
                this.f7023c = (String) e("getGmpAppId", this.f7023c, dp.a);
            } else {
                this.f7023c = (String) E("getGmpAppId", context);
            }
            return this.f7023c;
        }
    }

    public final String p(final Context context) {
        if (!g(context)) {
            return null;
        }
        long jLongValue = ((Long) c.c().b(w3.a0)).longValue();
        if (A(context)) {
            try {
                return jLongValue < 0 ? (String) e("getAppInstanceId", null, ep.a) : (String) b().submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.fp
                    private final kp a;

                    {
                        this.a = this;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.a.z();
                    }
                }).get(jLongValue, TimeUnit.MILLISECONDS);
            } catch (TimeoutException unused) {
                return "TIME_OUT";
            } catch (Exception unused2) {
                return null;
            }
        }
        if (jLongValue < 0) {
            return (String) E("getAppInstanceId", context);
        }
        try {
            return (String) b().submit(new Callable(this, context) { // from class: com.google.android.gms.internal.ads.gp
                private final kp a;

                /* renamed from: b, reason: collision with root package name */
                private final Context f6153b;

                {
                    this.a = this;
                    this.f6153b = context;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.y(this.f6153b);
                }
            }).get(jLongValue, TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused3) {
            return "TIME_OUT";
        } catch (Exception unused4) {
            return null;
        }
    }

    public final String q(Context context) throws NoSuchMethodException, SecurityException {
        if (!g(context)) {
            return null;
        }
        if (A(context)) {
            Long l2 = (Long) e("getAdEventId", null, uo.a);
            if (l2 != null) {
                return Long.toString(l2.longValue());
            }
            return null;
        }
        Object objE = E("generateEventId", context);
        if (objE != null) {
            return objE.toString();
        }
        return null;
    }

    public final String r(Context context) {
        if (!g(context)) {
            return null;
        }
        synchronized (this.f7022b) {
            String str = this.f7024d;
            if (str != null) {
                return str;
            }
            if (A(context)) {
                this.f7024d = (String) e("getAppIdOrigin", this.f7024d, vo.a);
            } else {
                this.f7024d = "fa";
            }
            return this.f7024d;
        }
    }

    public final void s(Context context, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        B(context, "_ac", str, null);
    }

    public final void t(Context context, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        B(context, "_ai", str, null);
    }

    public final void u(Context context, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        B(context, "_aq", str, null);
    }

    public final void v(Context context, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        B(context, "_aa", str, null);
    }

    public final void w(Context context, String str, String str2, String str3, int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (g(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i2);
            B(context, "_ar", str, bundle);
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 75);
            sb.append("Log a Firebase reward video event, reward type: ");
            sb.append(str3);
            sb.append(", reward value: ");
            sb.append(i2);
            zze.zza(sb.toString());
        }
    }

    final /* synthetic */ void x(jp jpVar, String str) {
        if (this.f7030j.get() != null) {
            try {
                jpVar.a(this.f7030j.get());
            } catch (Exception unused) {
                a(str, false);
            }
        }
    }

    final /* synthetic */ String y(Context context) {
        return (String) E("getAppInstanceId", context);
    }

    final /* synthetic */ String z() {
        return (String) e("getAppInstanceId", null, yo.a);
    }
}