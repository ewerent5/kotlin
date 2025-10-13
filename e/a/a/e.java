package e.a.a;

import android.util.Log;

/* compiled from: AmplitudeLog.java */
/* loaded from: classes.dex */
public class e {
    protected static e a = new e();

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f14167b = true;

    /* renamed from: c, reason: collision with root package name */
    private volatile int f14168c = 4;

    private e() {
    }

    public static e d() {
        return a;
    }

    int a(String str, String str2) {
        if (!this.f14167b || this.f14168c > 3) {
            return 0;
        }
        return Log.d(str, str2);
    }

    int b(String str, String str2) {
        if (!this.f14167b || this.f14168c > 6) {
            return 0;
        }
        return Log.e(str, str2);
    }

    int c(String str, String str2, Throwable th) {
        if (!this.f14167b || this.f14168c > 6) {
            return 0;
        }
        return Log.e(str, str2, th);
    }

    int e(String str, String str2) {
        if (!this.f14167b || this.f14168c > 4) {
            return 0;
        }
        return Log.i(str, str2);
    }

    e f(boolean z) {
        this.f14167b = z;
        return a;
    }

    e g(int i2) {
        this.f14168c = i2;
        return a;
    }

    int h(String str, String str2) {
        if (!this.f14167b || this.f14168c > 5) {
            return 0;
        }
        return Log.w(str, str2);
    }

    int i(String str, Throwable th) {
        if (!this.f14167b || this.f14168c > 5) {
            return 0;
        }
        return Log.w(str, th);
    }
}