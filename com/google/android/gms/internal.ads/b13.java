package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@TargetApi(17)
/* loaded from: classes.dex */
public final class b13 extends Surface {

    /* renamed from: e, reason: collision with root package name */
    private static boolean f5047e;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f5048f;

    /* renamed from: g, reason: collision with root package name */
    private final a13 f5049g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f5050h;

    /* synthetic */ b13(a13 a13Var, SurfaceTexture surfaceTexture, boolean z, z03 z03Var) {
        super(surfaceTexture);
        this.f5049g = a13Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized boolean a(android.content.Context r6) {
        /*
            java.lang.Class<com.google.android.gms.internal.ads.b13> r0 = com.google.android.gms.internal.ads.b13.class
            monitor-enter(r0)
            boolean r1 = com.google.android.gms.internal.ads.b13.f5048f     // Catch: java.lang.Throwable -> L4f
            if (r1 != 0) goto L4b
            int r1 = com.google.android.gms.internal.ads.v03.a     // Catch: java.lang.Throwable -> L4f
            r2 = 17
            r3 = 1
            if (r1 < r2) goto L49
            r2 = 0
            android.opengl.EGLDisplay r4 = android.opengl.EGL14.eglGetDisplay(r2)     // Catch: java.lang.Throwable -> L4f
            r5 = 12373(0x3055, float:1.7338E-41)
            java.lang.String r4 = android.opengl.EGL14.eglQueryString(r4, r5)     // Catch: java.lang.Throwable -> L4f
            if (r4 == 0) goto L47
            java.lang.String r5 = "EGL_EXT_protected_content"
            boolean r4 = r4.contains(r5)     // Catch: java.lang.Throwable -> L4f
            if (r4 == 0) goto L47
            r4 = 24
            if (r1 != r4) goto L46
            java.lang.String r1 = com.google.android.gms.internal.ads.v03.f9615d     // Catch: java.lang.Throwable -> L4f
            java.lang.String r4 = "SM-G950"
            boolean r4 = r1.startsWith(r4)     // Catch: java.lang.Throwable -> L4f
            if (r4 != 0) goto L39
            java.lang.String r4 = "SM-G955"
            boolean r1 = r1.startsWith(r4)     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L46
        L39:
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r1 = "android.hardware.vr.high_performance"
            boolean r6 = r6.hasSystemFeature(r1)     // Catch: java.lang.Throwable -> L4f
            if (r6 != 0) goto L46
            goto L47
        L46:
            r2 = 1
        L47:
            com.google.android.gms.internal.ads.b13.f5047e = r2     // Catch: java.lang.Throwable -> L4f
        L49:
            com.google.android.gms.internal.ads.b13.f5048f = r3     // Catch: java.lang.Throwable -> L4f
        L4b:
            boolean r6 = com.google.android.gms.internal.ads.b13.f5047e     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r0)
            return r6
        L4f:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b13.a(android.content.Context):boolean");
    }

    public static b13 b(Context context, boolean z) {
        if (v03.a < 17) {
            throw new UnsupportedOperationException("Unsupported prior to API level 17");
        }
        boolean z2 = true;
        if (z && !a(context)) {
            z2 = false;
        }
        f03.d(z2);
        return new a13().a(z);
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f5049g) {
            if (!this.f5050h) {
                this.f5049g.b();
                this.f5050h = true;
            }
        }
    }
}