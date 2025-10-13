package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class a13 extends HandlerThread implements SurfaceTexture.OnFrameAvailableListener, Handler.Callback {

    /* renamed from: e, reason: collision with root package name */
    private final int[] f4808e;

    /* renamed from: f, reason: collision with root package name */
    private Handler f4809f;

    /* renamed from: g, reason: collision with root package name */
    private SurfaceTexture f4810g;

    /* renamed from: h, reason: collision with root package name */
    private Error f4811h;

    /* renamed from: i, reason: collision with root package name */
    private RuntimeException f4812i;

    /* renamed from: j, reason: collision with root package name */
    private b13 f4813j;

    public a13() {
        super("dummySurface");
        this.f4808e = new int[1];
    }

    public final b13 a(boolean z) {
        boolean z2;
        start();
        this.f4809f = new Handler(getLooper(), this);
        synchronized (this) {
            z2 = false;
            this.f4809f.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
            while (this.f4813j == null && this.f4812i == null && this.f4811h == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.f4812i;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.f4811h;
        if (error == null) {
            return this.f4813j;
        }
        throw error;
    }

    public final void b() {
        this.f4809f.sendEmptyMessage(3);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        try {
            if (i2 != 1) {
                if (i2 == 2) {
                    this.f4810g.updateTexImage();
                    return true;
                }
                if (i2 != 3) {
                    return true;
                }
                try {
                    try {
                        this.f4810g.release();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                } finally {
                    this.f4813j = null;
                    this.f4810g = null;
                    GLES20.glDeleteTextures(1, this.f4808e, 0);
                }
            }
            try {
                boolean z = message.arg1 != 0;
                EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
                f03.e(eGLDisplayEglGetDisplay != null, "eglGetDisplay failed");
                int[] iArr = new int[2];
                f03.e(EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = new int[1];
                f03.e(EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] > 0 && eGLConfigArr[0] != null, "eglChooseConfig failed");
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, z ? new int[]{12440, 2, 12992, 1, 12344} : new int[]{12440, 2, 12344}, 0);
                f03.e(eGLContextEglCreateContext != null, "eglCreateContext failed");
                EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplayEglGetDisplay, eGLConfig, z ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                f03.e(eGLSurfaceEglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
                f03.e(EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext), "eglMakeCurrent failed");
                GLES20.glGenTextures(1, this.f4808e, 0);
                SurfaceTexture surfaceTexture = new SurfaceTexture(this.f4808e[0]);
                this.f4810g = surfaceTexture;
                surfaceTexture.setOnFrameAvailableListener(this);
                this.f4813j = new b13(this, this.f4810g, z, null);
                synchronized (this) {
                    notify();
                }
            } catch (Error e2) {
                Log.e("DummySurface", "Failed to initialize dummy surface", e2);
                this.f4811h = e2;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e3) {
                Log.e("DummySurface", "Failed to initialize dummy surface", e3);
                this.f4812i = e3;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f4809f.sendEmptyMessage(2);
    }
}