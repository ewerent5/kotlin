package com.google.firebase.crashlytics.d.h;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.google.firebase.crashlytics.d.j.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: CrashlyticsReportDataCapture.java */
/* loaded from: classes.dex */
public class o {
    private static final String a = String.format(Locale.US, "Crashlytics Android SDK/%s", "17.3.0");

    /* renamed from: b, reason: collision with root package name */
    private static final Map<String, Integer> f12451b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f12452c;

    /* renamed from: d, reason: collision with root package name */
    private final x f12453d;

    /* renamed from: e, reason: collision with root package name */
    private final b f12454e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.firebase.crashlytics.d.q.d f12455f;

    static {
        HashMap map = new HashMap();
        f12451b = map;
        map.put("armeabi", 5);
        map.put("armeabi-v7a", 6);
        map.put("arm64-v8a", 9);
        map.put("x86", 0);
        map.put("x86_64", 1);
    }

    public o(Context context, x xVar, b bVar, com.google.firebase.crashlytics.d.q.d dVar) {
        this.f12452c = context;
        this.f12453d = xVar;
        this.f12454e = bVar;
        this.f12455f = dVar;
    }

    private v.a a() {
        return com.google.firebase.crashlytics.d.j.v.b().h("17.3.0").d(this.f12454e.a).e(this.f12453d.a()).b(this.f12454e.f12344e).c(this.f12454e.f12345f).g(4);
    }

    private static int d() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = f12451b.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    private v.d.AbstractC0137d.a.b.AbstractC0139a e() {
        return v.d.AbstractC0137d.a.b.AbstractC0139a.a().b(0L).d(0L).c(this.f12454e.f12343d).e(this.f12454e.f12341b).a();
    }

    private com.google.firebase.crashlytics.d.j.w<v.d.AbstractC0137d.a.b.AbstractC0139a> f() {
        return com.google.firebase.crashlytics.d.j.w.c(e());
    }

    private v.d.AbstractC0137d.a g(int i2, com.google.firebase.crashlytics.d.q.e eVar, Thread thread, int i3, int i4, boolean z) {
        Boolean boolValueOf;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfoK = h.k(this.f12454e.f12343d, this.f12452c);
        if (runningAppProcessInfoK != null) {
            boolValueOf = Boolean.valueOf(runningAppProcessInfoK.importance != 100);
        } else {
            boolValueOf = null;
        }
        return v.d.AbstractC0137d.a.a().b(boolValueOf).e(i2).d(k(eVar, thread, i3, i4, z)).a();
    }

    private v.d.AbstractC0137d.c h(int i2) {
        e eVarA = e.a(this.f12452c);
        Float fB = eVarA.b();
        Double dValueOf = fB != null ? Double.valueOf(fB.doubleValue()) : null;
        int iC = eVarA.c();
        boolean zQ = h.q(this.f12452c);
        return v.d.AbstractC0137d.c.a().b(dValueOf).c(iC).f(zQ).e(i2).g(h.v() - h.a(this.f12452c)).d(h.b(Environment.getDataDirectory().getPath())).a();
    }

    private v.d.AbstractC0137d.a.b.c i(com.google.firebase.crashlytics.d.q.e eVar, int i2, int i3) {
        return j(eVar, i2, i3, 0);
    }

    private v.d.AbstractC0137d.a.b.c j(com.google.firebase.crashlytics.d.q.e eVar, int i2, int i3, int i4) {
        String str = eVar.f12768b;
        String str2 = eVar.a;
        StackTraceElement[] stackTraceElementArr = eVar.f12769c;
        int i5 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        com.google.firebase.crashlytics.d.q.e eVar2 = eVar.f12770d;
        if (i4 >= i3) {
            com.google.firebase.crashlytics.d.q.e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = eVar3.f12770d;
                i5++;
            }
        }
        v.d.AbstractC0137d.a.b.c.AbstractC0142a abstractC0142aD = v.d.AbstractC0137d.a.b.c.a().f(str).e(str2).c(com.google.firebase.crashlytics.d.j.w.a(m(stackTraceElementArr, i2))).d(i5);
        if (eVar2 != null && i5 == 0) {
            abstractC0142aD.b(j(eVar2, i2, i3, i4 + 1));
        }
        return abstractC0142aD.a();
    }

    private v.d.AbstractC0137d.a.b k(com.google.firebase.crashlytics.d.q.e eVar, Thread thread, int i2, int i3, boolean z) {
        return v.d.AbstractC0137d.a.b.a().e(u(eVar, thread, i2, z)).c(i(eVar, i2, i3)).d(r()).b(f()).a();
    }

    private v.d.AbstractC0137d.a.b.e.AbstractC0146b l(StackTraceElement stackTraceElement, v.d.AbstractC0137d.a.b.e.AbstractC0146b.AbstractC0147a abstractC0147a) {
        long lineNumber = 0;
        long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            lineNumber = stackTraceElement.getLineNumber();
        }
        return abstractC0147a.e(jMax).f(str).b(fileName).d(lineNumber).a();
    }

    private com.google.firebase.crashlytics.d.j.w<v.d.AbstractC0137d.a.b.e.AbstractC0146b> m(StackTraceElement[] stackTraceElementArr, int i2) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(l(stackTraceElement, v.d.AbstractC0137d.a.b.e.AbstractC0146b.a().c(i2)));
        }
        return com.google.firebase.crashlytics.d.j.w.a(arrayList);
    }

    private v.d.a n() {
        v.d.a.AbstractC0136a abstractC0136aF = v.d.a.a().e(this.f12453d.d()).g(this.f12454e.f12344e).d(this.f12454e.f12345f).f(this.f12453d.a());
        String strA = this.f12454e.f12346g.a();
        if (strA != null) {
            abstractC0136aF.b("Unity").c(strA);
        }
        return abstractC0136aF.a();
    }

    private v.d o(String str, long j2) {
        return v.d.a().l(j2).i(str).g(a).b(n()).k(q()).d(p()).h(3).a();
    }

    private v.d.c p() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int iD = d();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jV = h.v();
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        boolean zA = h.A(this.f12452c);
        int iN = h.n(this.f12452c);
        return v.d.c.a().b(iD).f(Build.MODEL).c(iAvailableProcessors).h(jV).d(blockCount).i(zA).j(iN).e(Build.MANUFACTURER).g(Build.PRODUCT).a();
    }

    private v.d.e q() {
        return v.d.e.a().d(3).e(Build.VERSION.RELEASE).b(Build.VERSION.CODENAME).c(h.C(this.f12452c)).a();
    }

    private v.d.AbstractC0137d.a.b.AbstractC0143d r() {
        return v.d.AbstractC0137d.a.b.AbstractC0143d.a().d("0").c("0").b(0L).a();
    }

    private v.d.AbstractC0137d.a.b.e s(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return t(thread, stackTraceElementArr, 0);
    }

    private v.d.AbstractC0137d.a.b.e t(Thread thread, StackTraceElement[] stackTraceElementArr, int i2) {
        return v.d.AbstractC0137d.a.b.e.a().d(thread.getName()).c(i2).b(com.google.firebase.crashlytics.d.j.w.a(m(stackTraceElementArr, i2))).a();
    }

    private com.google.firebase.crashlytics.d.j.w<v.d.AbstractC0137d.a.b.e> u(com.google.firebase.crashlytics.d.q.e eVar, Thread thread, int i2, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(t(thread, eVar.f12769c, i2));
        if (z) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(s(key, this.f12455f.a(entry.getValue())));
                }
            }
        }
        return com.google.firebase.crashlytics.d.j.w.a(arrayList);
    }

    public v.d.AbstractC0137d b(Throwable th, Thread thread, String str, long j2, int i2, int i3, boolean z) {
        int i4 = this.f12452c.getResources().getConfiguration().orientation;
        return v.d.AbstractC0137d.a().f(str).e(j2).b(g(i4, new com.google.firebase.crashlytics.d.q.e(th, this.f12455f), thread, i2, i3, z)).c(h(i4)).a();
    }

    public com.google.firebase.crashlytics.d.j.v c(String str, long j2) {
        return a().i(o(str, j2)).a();
    }
}