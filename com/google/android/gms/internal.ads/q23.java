package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class q23 {
    private final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @GuardedBy("activityTrackerLock")
    private o23 f8318b = null;

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("activityTrackerLock")
    private boolean f8319c = false;

    public final void a(Context context) {
        synchronized (this.a) {
            if (!this.f8319c) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (application == null) {
                    er.zzi("Can not cast Context to Application");
                    return;
                }
                if (this.f8318b == null) {
                    this.f8318b = new o23();
                }
                this.f8318b.a(application, context);
                this.f8319c = true;
            }
        }
    }

    public final void b(p23 p23Var) {
        synchronized (this.a) {
            if (this.f8318b == null) {
                this.f8318b = new o23();
            }
            this.f8318b.b(p23Var);
        }
    }

    public final void c(p23 p23Var) {
        synchronized (this.a) {
            o23 o23Var = this.f8318b;
            if (o23Var == null) {
                return;
            }
            o23Var.c(p23Var);
        }
    }

    public final Activity d() {
        synchronized (this.a) {
            o23 o23Var = this.f8318b;
            if (o23Var == null) {
                return null;
            }
            return o23Var.d();
        }
    }

    public final Context e() {
        synchronized (this.a) {
            o23 o23Var = this.f8318b;
            if (o23Var == null) {
                return null;
            }
            return o23Var.e();
        }
    }
}