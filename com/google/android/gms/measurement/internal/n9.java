package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import e.c.b.b.c.e.lc;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class n9 {
    final /* synthetic */ e9 a;

    n9(e9 e9Var) {
        this.a = e9Var;
    }

    private final void c(long j2, boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.a.d();
        if (this.a.a.k()) {
            this.a.h().v.b(j2);
            this.a.zzq().I().b("Session started, time", Long.valueOf(this.a.zzl().c()));
            Long lValueOf = Long.valueOf(j2 / 1000);
            this.a.k().U("auto", "_sid", lValueOf, j2);
            this.a.h().s.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", lValueOf.longValue());
            if (this.a.i().o(t.l0) && z) {
                bundle.putLong("_aib", 1L);
            }
            this.a.k().O("auto", "_s", j2, bundle);
            if (lc.a() && this.a.i().o(t.q0)) {
                String strA = this.a.h().A.a();
                if (TextUtils.isEmpty(strA)) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", strA);
                this.a.k().O("auto", "_ssr", j2, bundle2);
            }
        }
    }

    final void a() {
        this.a.d();
        if (this.a.h().t(this.a.zzl().a())) {
            this.a.h().s.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.a.zzq().I().a("Detected application was in foreground");
                c(this.a.zzl().a(), false);
            }
        }
    }

    final void b(long j2, boolean z) {
        this.a.d();
        this.a.A();
        if (this.a.h().t(j2)) {
            this.a.h().s.a(true);
        }
        this.a.h().v.b(j2);
        if (this.a.h().s.b()) {
            c(j2, z);
        }
    }
}