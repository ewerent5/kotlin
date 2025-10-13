package com.google.firebase.crashlytics.d.m;

import android.app.ActivityManager;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: SessionProtobufHelper.java */
/* loaded from: classes.dex */
public class d {
    private static final a a = a.c("0");

    /* renamed from: b, reason: collision with root package name */
    private static final a f12690b = a.c("Unity");

    private static void A(c cVar, a aVar) throws IOException {
        if (aVar != null) {
            cVar.W(6, 2);
            cVar.S(h(aVar));
            cVar.C(1, aVar);
        }
    }

    public static void B(c cVar, String str, String str2, boolean z) throws IOException {
        a aVarC = a.c(str);
        a aVarC2 = a.c(str2);
        cVar.W(8, 2);
        cVar.S(m(aVarC, aVarC2, z));
        cVar.E(1, 3);
        cVar.C(2, aVarC);
        cVar.C(3, aVarC2);
        cVar.A(4, z);
    }

    public static void C(c cVar, String str, String str2, String str3) throws IOException {
        if (str == null) {
            str = "";
        }
        a aVarC = a.c(str);
        a aVarO = o(str2);
        a aVarO2 = o(str3);
        int iC = c.c(1, aVarC) + 0;
        if (str2 != null) {
            iC += c.c(2, aVarO);
        }
        if (str3 != null) {
            iC += c.c(3, aVarO2);
        }
        cVar.W(6, 2);
        cVar.S(iC);
        cVar.C(1, aVarC);
        if (str2 != null) {
            cVar.C(2, aVarO);
        }
        if (str3 != null) {
            cVar.C(3, aVarO2);
        }
    }

    private static void D(c cVar, Thread thread, StackTraceElement[] stackTraceElementArr, int i2, boolean z) throws IOException {
        cVar.W(1, 2);
        cVar.S(n(thread, stackTraceElementArr, i2, z));
        cVar.C(1, a.c(thread.getName()));
        cVar.X(2, i2);
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            q(cVar, 3, stackTraceElement, z);
        }
    }

    private static int a(a aVar, a aVar2) {
        int iR = c.r(1, 0L) + 0 + c.r(2, 0L) + c.c(3, aVar);
        return aVar2 != null ? iR + c.c(4, aVar2) : iR;
    }

    private static int b(String str, String str2) {
        int iC = c.c(1, a.c(str));
        if (str2 == null) {
            str2 = "";
        }
        return iC + c.c(2, a.c(str2));
    }

    private static int c(com.google.firebase.crashlytics.d.q.e eVar, int i2, int i3) {
        int i4 = 0;
        int iC = c.c(1, a.c(eVar.f12768b)) + 0;
        String str = eVar.a;
        if (str != null) {
            iC += c.c(3, a.c(str));
        }
        for (StackTraceElement stackTraceElement : eVar.f12769c) {
            int i5 = i(stackTraceElement, true);
            iC += c.o(4) + c.k(i5) + i5;
        }
        com.google.firebase.crashlytics.d.q.e eVar2 = eVar.f12770d;
        if (eVar2 == null) {
            return iC;
        }
        if (i2 < i3) {
            int iC2 = c(eVar2, i2 + 1, i3);
            return iC + c.o(6) + c.k(iC2) + iC2;
        }
        while (eVar2 != null) {
            eVar2 = eVar2.f12770d;
            i4++;
        }
        return iC + c.p(7, i4);
    }

    private static int d() {
        a aVar = a;
        return c.c(1, aVar) + 0 + c.c(2, aVar) + c.r(3, 0L);
    }

    private static int e(com.google.firebase.crashlytics.d.q.e eVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i2, a aVar, a aVar2) {
        int iN = n(thread, stackTraceElementArr, 4, true);
        int iO = c.o(1) + c.k(iN) + iN + 0;
        int length = threadArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            int iN2 = n(threadArr[i3], list.get(i3), 0, false);
            iO += c.o(1) + c.k(iN2) + iN2;
        }
        int iC = c(eVar, 1, i2);
        int iO2 = iO + c.o(2) + c.k(iC) + iC;
        int iD = d();
        int iO3 = iO2 + c.o(3) + c.k(iD) + iD;
        int iA = a(aVar, aVar2);
        return iO3 + c.o(3) + c.k(iA) + iA;
    }

    private static int f(com.google.firebase.crashlytics.d.q.e eVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i2, a aVar, a aVar2, Map<String, String> map, ActivityManager.RunningAppProcessInfo runningAppProcessInfo, int i3) {
        int iE = e(eVar, thread, stackTraceElementArr, threadArr, list, i2, aVar, aVar2);
        int iO = c.o(1) + c.k(iE) + iE + 0;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                int iB = b(entry.getKey(), entry.getValue());
                iO += c.o(2) + c.k(iB) + iB;
            }
        }
        if (runningAppProcessInfo != null) {
            iO += c.a(3, runningAppProcessInfo.importance != 100);
        }
        return iO + c.p(4, i3);
    }

    private static int g(Float f2, int i2, boolean z, int i3, long j2, long j3) {
        return (f2 != null ? 0 + c.h(1, f2.floatValue()) : 0) + c.m(2, i2) + c.a(3, z) + c.p(4, i3) + c.r(5, j2) + c.r(6, j3);
    }

    private static int h(a aVar) {
        return c.c(1, aVar);
    }

    private static int i(StackTraceElement stackTraceElement, boolean z) {
        int iR = (stackTraceElement.isNativeMethod() ? c.r(1, Math.max(stackTraceElement.getLineNumber(), 0)) : c.r(1, 0L)) + 0 + c.c(2, a.c(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName()));
        if (stackTraceElement.getFileName() != null) {
            iR += c.c(3, a.c(stackTraceElement.getFileName()));
        }
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            iR += c.r(4, stackTraceElement.getLineNumber());
        }
        return iR + c.p(5, z ? 2 : 0);
    }

    private static int j(a aVar, a aVar2, a aVar3, a aVar4, int i2, a aVar5) {
        int iC = c.c(1, aVar) + 0 + c.c(2, aVar2) + c.c(3, aVar3) + c.c(6, aVar4);
        if (aVar5 != null) {
            iC = iC + c.c(8, f12690b) + c.c(9, aVar5);
        }
        return iC + c.f(10, i2);
    }

    private static int k(int i2, a aVar, int i3, long j2, long j3, boolean z, int i4, a aVar2, a aVar3) {
        return c.f(3, i2) + 0 + (aVar == null ? 0 : c.c(4, aVar)) + c.p(5, i3) + c.r(6, j2) + c.r(7, j3) + c.a(10, z) + c.p(12, i4) + (aVar2 == null ? 0 : c.c(13, aVar2)) + (aVar3 != null ? c.c(14, aVar3) : 0);
    }

    private static int l(long j2, String str, com.google.firebase.crashlytics.d.q.e eVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i2, Map<String, String> map, ActivityManager.RunningAppProcessInfo runningAppProcessInfo, int i3, a aVar, a aVar2, Float f2, int i4, boolean z, long j3, long j4, a aVar3) {
        int iR = c.r(1, j2) + 0 + c.c(2, a.c(str));
        int iF = f(eVar, thread, stackTraceElementArr, threadArr, list, i2, aVar, aVar2, map, runningAppProcessInfo, i3);
        int iO = iR + c.o(3) + c.k(iF) + iF;
        int iG = g(f2, i4, z, i3, j3, j4);
        int iO2 = iO + c.o(5) + c.k(iG) + iG;
        if (aVar3 == null) {
            return iO2;
        }
        int iH = h(aVar3);
        return iO2 + c.o(6) + c.k(iH) + iH;
    }

    private static int m(a aVar, a aVar2, boolean z) {
        return c.f(1, 3) + 0 + c.c(2, aVar) + c.c(3, aVar2) + c.a(4, z);
    }

    private static int n(Thread thread, StackTraceElement[] stackTraceElementArr, int i2, boolean z) {
        int iC = c.c(1, a.c(thread.getName())) + c.p(2, i2);
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            int i3 = i(stackTraceElement, z);
            iC += c.o(3) + c.k(i3) + i3;
        }
        return iC;
    }

    private static a o(String str) {
        if (str == null) {
            return null;
        }
        return a.c(str);
    }

    public static void p(c cVar, String str, String str2, long j2) throws IOException {
        cVar.C(1, a.c(str2));
        cVar.C(2, a.c(str));
        cVar.a0(3, j2);
    }

    private static void q(c cVar, int i2, StackTraceElement stackTraceElement, boolean z) throws IOException {
        cVar.W(i2, 2);
        cVar.S(i(stackTraceElement, z));
        if (stackTraceElement.isNativeMethod()) {
            cVar.a0(1, Math.max(stackTraceElement.getLineNumber(), 0));
        } else {
            cVar.a0(1, 0L);
        }
        cVar.C(2, a.c(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName()));
        if (stackTraceElement.getFileName() != null) {
            cVar.C(3, a.c(stackTraceElement.getFileName()));
        }
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            cVar.a0(4, stackTraceElement.getLineNumber());
        }
        cVar.X(5, z ? 4 : 0);
    }

    public static void r(c cVar, String str, String str2, String str3, String str4, int i2, String str5) throws IOException {
        a aVarC = a.c(str);
        a aVarC2 = a.c(str2);
        a aVarC3 = a.c(str3);
        a aVarC4 = a.c(str4);
        a aVarC5 = str5 != null ? a.c(str5) : null;
        cVar.W(7, 2);
        cVar.S(j(aVarC, aVarC2, aVarC3, aVarC4, i2, aVarC5));
        cVar.C(1, aVarC);
        cVar.C(2, aVarC2);
        cVar.C(3, aVarC3);
        cVar.C(6, aVarC4);
        if (aVarC5 != null) {
            cVar.C(8, f12690b);
            cVar.C(9, aVarC5);
        }
        cVar.E(10, i2);
    }

    public static void s(c cVar, String str) throws IOException {
        a aVarC = a.c(str);
        cVar.W(7, 2);
        int iC = c.c(2, aVarC);
        cVar.S(c.o(5) + c.k(iC) + iC);
        cVar.W(5, 2);
        cVar.S(iC);
        cVar.C(2, aVarC);
    }

    public static void t(c cVar, int i2, String str, int i3, long j2, long j3, boolean z, int i4, String str2, String str3) throws IOException {
        a aVarO = o(str);
        a aVarO2 = o(str3);
        a aVarO3 = o(str2);
        cVar.W(9, 2);
        cVar.S(k(i2, aVarO, i3, j2, j3, z, i4, aVarO3, aVarO2));
        cVar.E(3, i2);
        cVar.C(4, aVarO);
        cVar.X(5, i3);
        cVar.a0(6, j2);
        cVar.a0(7, j3);
        cVar.A(10, z);
        cVar.X(12, i4);
        if (aVarO3 != null) {
            cVar.C(13, aVarO3);
        }
        if (aVarO2 != null) {
            cVar.C(14, aVarO2);
        }
    }

    public static void u(c cVar, long j2, String str, com.google.firebase.crashlytics.d.q.e eVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i2, Map<String, String> map, byte[] bArr, ActivityManager.RunningAppProcessInfo runningAppProcessInfo, int i3, String str2, String str3, Float f2, int i4, boolean z, long j3, long j4) throws IOException {
        a aVarC = a.c(str2);
        a aVarA = null;
        a aVarC2 = str3 == null ? null : a.c(str3.replace("-", ""));
        if (bArr != null) {
            aVarA = a.a(bArr);
        } else {
            com.google.firebase.crashlytics.d.b.f().b("No log data to include with this event.");
        }
        a aVar = aVarA;
        cVar.W(10, 2);
        cVar.S(l(j2, str, eVar, thread, stackTraceElementArr, threadArr, list, i2, map, runningAppProcessInfo, i3, aVarC, aVarC2, f2, i4, z, j3, j4, aVar));
        cVar.a0(1, j2);
        cVar.C(2, a.c(str));
        v(cVar, eVar, thread, stackTraceElementArr, threadArr, list, i2, aVarC, aVarC2, map, runningAppProcessInfo, i3);
        z(cVar, f2, i4, z, i3, j3, j4);
        A(cVar, aVar);
    }

    private static void v(c cVar, com.google.firebase.crashlytics.d.q.e eVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i2, a aVar, a aVar2, Map<String, String> map, ActivityManager.RunningAppProcessInfo runningAppProcessInfo, int i3) throws IOException {
        cVar.W(3, 2);
        cVar.S(f(eVar, thread, stackTraceElementArr, threadArr, list, i2, aVar, aVar2, map, runningAppProcessInfo, i3));
        x(cVar, eVar, thread, stackTraceElementArr, threadArr, list, i2, aVar, aVar2);
        if (map != null && !map.isEmpty()) {
            w(cVar, map);
        }
        if (runningAppProcessInfo != null) {
            cVar.A(3, runningAppProcessInfo.importance != 100);
        }
        cVar.X(4, i3);
    }

    private static void w(c cVar, Map<String, String> map) throws IOException {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            cVar.W(2, 2);
            cVar.S(b(entry.getKey(), entry.getValue()));
            cVar.C(1, a.c(entry.getKey()));
            String value = entry.getValue();
            if (value == null) {
                value = "";
            }
            cVar.C(2, a.c(value));
        }
    }

    private static void x(c cVar, com.google.firebase.crashlytics.d.q.e eVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i2, a aVar, a aVar2) throws IOException {
        cVar.W(1, 2);
        cVar.S(e(eVar, thread, stackTraceElementArr, threadArr, list, i2, aVar, aVar2));
        D(cVar, thread, stackTraceElementArr, 4, true);
        int length = threadArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            D(cVar, threadArr[i3], list.get(i3), 0, false);
        }
        y(cVar, eVar, 1, i2, 2);
        cVar.W(3, 2);
        cVar.S(d());
        a aVar3 = a;
        cVar.C(1, aVar3);
        cVar.C(2, aVar3);
        cVar.a0(3, 0L);
        cVar.W(4, 2);
        cVar.S(a(aVar, aVar2));
        cVar.a0(1, 0L);
        cVar.a0(2, 0L);
        cVar.C(3, aVar);
        if (aVar2 != null) {
            cVar.C(4, aVar2);
        }
    }

    private static void y(c cVar, com.google.firebase.crashlytics.d.q.e eVar, int i2, int i3, int i4) throws IOException {
        cVar.W(i4, 2);
        cVar.S(c(eVar, 1, i3));
        cVar.C(1, a.c(eVar.f12768b));
        String str = eVar.a;
        if (str != null) {
            cVar.C(3, a.c(str));
        }
        int i5 = 0;
        for (StackTraceElement stackTraceElement : eVar.f12769c) {
            q(cVar, 4, stackTraceElement, true);
        }
        com.google.firebase.crashlytics.d.q.e eVar2 = eVar.f12770d;
        if (eVar2 != null) {
            if (i2 < i3) {
                y(cVar, eVar2, i2 + 1, i3, 6);
                return;
            }
            while (eVar2 != null) {
                eVar2 = eVar2.f12770d;
                i5++;
            }
            cVar.X(7, i5);
        }
    }

    private static void z(c cVar, Float f2, int i2, boolean z, int i3, long j2, long j3) throws IOException {
        cVar.W(5, 2);
        cVar.S(g(f2, i2, z, i3, j2, j3));
        if (f2 != null) {
            cVar.G(1, f2.floatValue());
        }
        cVar.U(2, i2);
        cVar.A(3, z);
        cVar.X(4, i3);
        cVar.a0(5, j2);
        cVar.a0(6, j3);
    }
}