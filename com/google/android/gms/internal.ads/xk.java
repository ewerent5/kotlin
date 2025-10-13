package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class xk implements zk {
    private static final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    static zk f10180b;

    /* renamed from: c, reason: collision with root package name */
    static zk f10181c;

    /* renamed from: e, reason: collision with root package name */
    private final Context f10183e;

    /* renamed from: g, reason: collision with root package name */
    private final ExecutorService f10185g;

    /* renamed from: h, reason: collision with root package name */
    private final kr f10186h;

    /* renamed from: d, reason: collision with root package name */
    private final Object f10182d = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final WeakHashMap<Thread, Boolean> f10184f = new WeakHashMap<>();

    protected xk(Context context, kr krVar) {
        k02.a();
        this.f10185g = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.f10183e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f10186h = krVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033 A[Catch: all -> 0x003e, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0015, B:10:0x0027, B:11:0x0033, B:12:0x003a), top: B:18:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zk c(android.content.Context r3) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.xk.a
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zk r1 = com.google.android.gms.internal.ads.xk.f10180b     // Catch: java.lang.Throwable -> L3e
            if (r1 != 0) goto L3a
            com.google.android.gms.internal.ads.z4<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.r5.f8582e     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r1 = r1.e()     // Catch: java.lang.Throwable -> L3e
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L3e
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto L33
            com.google.android.gms.internal.ads.o3<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.w3.Z4     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.internal.ads.u3 r2 = com.google.android.gms.internal.ads.c.c()     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r1 = r2.b(r1)     // Catch: java.lang.Throwable -> L3e
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L3e
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L3e
            if (r1 != 0) goto L33
            com.google.android.gms.internal.ads.xk r1 = new com.google.android.gms.internal.ads.xk     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.internal.ads.kr r2 = com.google.android.gms.internal.ads.kr.c()     // Catch: java.lang.Throwable -> L3e
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.internal.ads.xk.f10180b = r1     // Catch: java.lang.Throwable -> L3e
            goto L3a
        L33:
            com.google.android.gms.internal.ads.yk r3 = new com.google.android.gms.internal.ads.yk     // Catch: java.lang.Throwable -> L3e
            r3.<init>()     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.internal.ads.xk.f10180b = r3     // Catch: java.lang.Throwable -> L3e
        L3a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.internal.ads.zk r3 = com.google.android.gms.internal.ads.xk.f10180b
            return r3
        L3e:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xk.c(android.content.Context):com.google.android.gms.internal.ads.zk");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0060 A[Catch: all -> 0x006b, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0015, B:10:0x0027, B:12:0x0036, B:13:0x0038, B:16:0x0041, B:20:0x0050, B:21:0x0051, B:22:0x0060, B:23:0x0067, B:14:0x0039, B:15:0x0040), top: B:29:0x0003, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zk d(android.content.Context r4, com.google.android.gms.internal.ads.kr r5) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.xk.a
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zk r1 = com.google.android.gms.internal.ads.xk.f10181c     // Catch: java.lang.Throwable -> L6b
            if (r1 != 0) goto L67
            com.google.android.gms.internal.ads.z4<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.r5.f8582e     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r1 = r1.e()     // Catch: java.lang.Throwable -> L6b
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L6b
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L60
            com.google.android.gms.internal.ads.o3<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.w3.Z4     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.ads.u3 r2 = com.google.android.gms.internal.ads.c.c()     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r1 = r2.b(r1)     // Catch: java.lang.Throwable -> L6b
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L6b
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L6b
            if (r1 != 0) goto L60
            com.google.android.gms.internal.ads.xk r1 = new com.google.android.gms.internal.ads.xk     // Catch: java.lang.Throwable -> L6b
            r1.<init>(r4, r5)     // Catch: java.lang.Throwable -> L6b
            android.os.Looper r4 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L6b
            java.lang.Thread r4 = r4.getThread()     // Catch: java.lang.Throwable -> L6b
            if (r4 == 0) goto L51
            java.lang.Object r5 = r1.f10182d     // Catch: java.lang.Throwable -> L6b
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L6b
            java.util.WeakHashMap<java.lang.Thread, java.lang.Boolean> r2 = r1.f10184f     // Catch: java.lang.Throwable -> L4e
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L4e
            r2.put(r4, r3)     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4e
            java.lang.Thread$UncaughtExceptionHandler r5 = r4.getUncaughtExceptionHandler()     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.ads.wk r2 = new com.google.android.gms.internal.ads.wk     // Catch: java.lang.Throwable -> L6b
            r2.<init>(r1, r5)     // Catch: java.lang.Throwable -> L6b
            r4.setUncaughtExceptionHandler(r2)     // Catch: java.lang.Throwable -> L6b
            goto L51
        L4e:
            r4 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L6b
        L51:
            java.lang.Thread$UncaughtExceptionHandler r4 = java.lang.Thread.getDefaultUncaughtExceptionHandler()     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.ads.vk r5 = new com.google.android.gms.internal.ads.vk     // Catch: java.lang.Throwable -> L6b
            r5.<init>(r1, r4)     // Catch: java.lang.Throwable -> L6b
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r5)     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.ads.xk.f10181c = r1     // Catch: java.lang.Throwable -> L6b
            goto L67
        L60:
            com.google.android.gms.internal.ads.yk r4 = new com.google.android.gms.internal.ads.yk     // Catch: java.lang.Throwable -> L6b
            r4.<init>()     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.ads.xk.f10181c = r4     // Catch: java.lang.Throwable -> L6b
        L67:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.ads.zk r4 = com.google.android.gms.internal.ads.xk.f10181c
            return r4
        L6b:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xk.d(android.content.Context, com.google.android.gms.internal.ads.kr):com.google.android.gms.internal.ads.zk");
    }

    @Override // com.google.android.gms.internal.ads.zk
    public final void a(Throwable th, String str, float f2) {
        boolean zG;
        String packageName;
        if (xq.g(th) == null) {
            return;
        }
        String name = th.getClass().getName();
        StringWriter stringWriter = new StringWriter();
        ih2.c(th, new PrintWriter(stringWriter));
        String string = stringWriter.toString();
        double d2 = f2;
        double dRandom = Math.random();
        int i2 = f2 > 0.0f ? (int) (1.0f / f2) : 1;
        if (dRandom < d2) {
            ArrayList<String> arrayList = new ArrayList();
            try {
                zG = com.google.android.gms.common.p.c.a(this.f10183e).g();
            } catch (Throwable th2) {
                er.zzg("Error fetching instant app info", th2);
                zG = false;
            }
            try {
                packageName = this.f10183e.getPackageName();
            } catch (Throwable unused) {
                er.zzi("Cannot obtain package name, proceeding.");
                packageName = "unknown";
            }
            Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(zG)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
            String str2 = Build.MANUFACTURER;
            String string2 = Build.MODEL;
            if (!string2.startsWith(str2)) {
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + string2.length());
                sb.append(str2);
                sb.append(" ");
                sb.append(string2);
                string2 = sb.toString();
            }
            Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("device", string2).appendQueryParameter("js", this.f10186h.f7054e).appendQueryParameter("appid", packageName).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", string).appendQueryParameter("eids", TextUtils.join(",", w3.c())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "367272508").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i2)).appendQueryParameter("pb_tm", String.valueOf(r5.f8580c.e()));
            if (((Boolean) c.c().b(w3.V0)).booleanValue()) {
                builderAppendQueryParameter2.appendQueryParameter("gmscv", String.valueOf(com.google.android.gms.common.f.f().a(this.f10183e))).appendQueryParameter("lite", true != this.f10186h.f7058i ? "0" : "1");
            }
            arrayList.add(builderAppendQueryParameter2.toString());
            for (final String str3 : arrayList) {
                final jr jrVar = new jr(null);
                this.f10185g.execute(new Runnable(jrVar, str3) { // from class: com.google.android.gms.internal.ads.uk

                    /* renamed from: e, reason: collision with root package name */
                    private final jr f9479e;

                    /* renamed from: f, reason: collision with root package name */
                    private final String f9480f;

                    {
                        this.f9479e = jrVar;
                        this.f9480f = str3;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9479e.zza(this.f9480f);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zk
    public final void b(Throwable th, String str) {
        a(th, str, 1.0f);
    }

    protected final void e(Thread thread, Throwable th) {
        if (th != null) {
            boolean zI = false;
            boolean zEquals = false;
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                    zI |= xq.i(stackTraceElement.getClassName());
                    zEquals |= xk.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (!zI || zEquals) {
                return;
            }
            a(th, "", 1.0f);
        }
    }
}