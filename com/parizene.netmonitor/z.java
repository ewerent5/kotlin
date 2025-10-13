package com.parizene.netmonitor;

import android.app.ActivityManager;
import android.os.PowerManager;

/* compiled from: NetmonitorService_MembersInjector.java */
/* loaded from: classes.dex */
public final class z {
    public static void a(NetmonitorService netmonitorService, ActivityManager activityManager) {
        netmonitorService.f12997i = activityManager;
    }

    public static void b(NetmonitorService netmonitorService, f.a<com.parizene.netmonitor.m0.z.b> aVar) {
        netmonitorService.f12998j = aVar;
    }

    public static void c(NetmonitorService netmonitorService, org.greenrobot.eventbus.c cVar) {
        netmonitorService.f12995g = cVar;
    }

    public static void d(NetmonitorService netmonitorService, x xVar) {
        netmonitorService.f12996h = xVar;
    }

    public static void e(NetmonitorService netmonitorService, a0 a0Var) {
        netmonitorService.f12994f = a0Var;
    }

    public static void f(NetmonitorService netmonitorService, PowerManager powerManager) {
        netmonitorService.f12993e = powerManager;
    }
}