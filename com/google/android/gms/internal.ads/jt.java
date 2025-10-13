package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@TargetApi(14)
/* loaded from: classes.dex */
public final class jt extends Thread implements SurfaceTexture.OnFrameAvailableListener, ht {

    /* renamed from: e */
    private static final float[] f6831e = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    private EGL10 A;
    private EGLDisplay B;
    private EGLContext C;
    private EGLSurface D;
    private volatile boolean E;
    private volatile boolean F;

    /* renamed from: f */
    private final it f6832f;

    /* renamed from: g */
    private final float[] f6833g;

    /* renamed from: h */
    private final float[] f6834h;

    /* renamed from: i */
    private final float[] f6835i;

    /* renamed from: j */
    private final float[] f6836j;

    /* renamed from: k */
    private final float[] f6837k;

    /* renamed from: l */
    private final float[] f6838l;

    /* renamed from: m */
    private final float[] f6839m;
    private float n;
    private float o;
    private float p;
    private int q;
    private int r;
    private SurfaceTexture s;
    private SurfaceTexture t;
    private int u;
    private int v;
    private int w;
    private final FloatBuffer x;
    private final CountDownLatch y;
    private final Object z;

    public jt(Context context) {
        super("SphericalVideoProcessor");
        float[] fArr = f6831e;
        int length = fArr.length;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.x = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr).position(0);
        this.f6833g = new float[9];
        this.f6834h = new float[9];
        this.f6835i = new float[9];
        this.f6836j = new float[9];
        this.f6837k = new float[9];
        this.f6838l = new float[9];
        this.f6839m = new float[9];
        this.n = Float.NaN;
        it itVar = new it(context);
        this.f6832f = itVar;
        itVar.c(this);
        this.y = new CountDownLatch(1);
        this.z = new Object();
    }

    private static final void g(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            StringBuilder sb = new StringBuilder(str.length() + 21);
            sb.append(str);
            sb.append(": glError ");
            sb.append(iGlGetError);
            Log.e("SphericalVideoRenderer", sb.toString());
        }
    }

    private static final void h(float[] fArr, float[] fArr2, float[] fArr3) {
        fArr[0] = (fArr2[0] * fArr3[0]) + (fArr2[1] * fArr3[3]) + (fArr2[2] * fArr3[6]);
        fArr[1] = (fArr2[0] * fArr3[1]) + (fArr2[1] * fArr3[4]) + (fArr2[2] * fArr3[7]);
        fArr[2] = (fArr2[0] * fArr3[2]) + (fArr2[1] * fArr3[5]) + (fArr2[2] * fArr3[8]);
        fArr[3] = (fArr2[3] * fArr3[0]) + (fArr2[4] * fArr3[3]) + (fArr2[5] * fArr3[6]);
        fArr[4] = (fArr2[3] * fArr3[1]) + (fArr2[4] * fArr3[4]) + (fArr2[5] * fArr3[7]);
        fArr[5] = (fArr2[3] * fArr3[2]) + (fArr2[4] * fArr3[5]) + (fArr2[5] * fArr3[8]);
        fArr[6] = (fArr2[6] * fArr3[0]) + (fArr2[7] * fArr3[3]) + (fArr2[8] * fArr3[6]);
        fArr[7] = (fArr2[6] * fArr3[1]) + (fArr2[7] * fArr3[4]) + (fArr2[8] * fArr3[7]);
        fArr[8] = (fArr2[6] * fArr3[2]) + (fArr2[7] * fArr3[5]) + (fArr2[8] * fArr3[8]);
    }

    private static final void i(float[] fArr, float f2) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d2 = f2;
        fArr[4] = (float) Math.cos(d2);
        fArr[5] = (float) (-Math.sin(d2));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d2);
        fArr[8] = (float) Math.cos(d2);
    }

    private static final void j(float[] fArr, float f2) {
        double d2 = f2;
        fArr[0] = (float) Math.cos(d2);
        fArr[1] = (float) (-Math.sin(d2));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d2);
        fArr[4] = (float) Math.cos(d2);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    private static final int k(int i2, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        g("createShader");
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, str);
            g("shaderSource");
            GLES20.glCompileShader(iGlCreateShader);
            g("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            g("getShaderiv");
            if (iArr[0] == 0) {
                StringBuilder sb = new StringBuilder(37);
                sb.append("Could not compile shader ");
                sb.append(i2);
                sb.append(":");
                Log.e("SphericalVideoRenderer", sb.toString());
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(iGlCreateShader));
                GLES20.glDeleteShader(iGlCreateShader);
                g("deleteShader");
                return 0;
            }
        }
        return iGlCreateShader;
    }

    public final void a(SurfaceTexture surfaceTexture, int i2, int i3) {
        this.r = i2;
        this.q = i3;
        this.t = surfaceTexture;
    }

    public final void b(int i2, int i3) {
        synchronized (this.z) {
            this.r = i2;
            this.q = i3;
            this.E = true;
            this.z.notifyAll();
        }
    }

    public final void c() {
        synchronized (this.z) {
            this.F = true;
            this.t = null;
            this.z.notifyAll();
        }
    }

    public final SurfaceTexture d() throws InterruptedException {
        if (this.t == null) {
            return null;
        }
        try {
            this.y.await();
        } catch (InterruptedException unused) {
        }
        return this.s;
    }

    public final void e(float f2, float f3) {
        int i2 = this.r;
        int i3 = this.q;
        float f4 = i2 > i3 ? i2 : i3;
        this.o -= (f2 * 1.7453293f) / f4;
        float f5 = this.p - ((f3 * 1.7453293f) / f4);
        this.p = f5;
        if (f5 < -1.5707964f) {
            this.p = -1.5707964f;
            f5 = -1.5707964f;
        }
        if (f5 > 1.5707964f) {
            this.p = 1.5707964f;
        }
    }

    final boolean f() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.D;
        boolean zEglDestroyContext = false;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            zEglDestroyContext = this.A.eglDestroySurface(this.B, this.D) | this.A.eglMakeCurrent(this.B, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.D = null;
        }
        EGLContext eGLContext = this.C;
        if (eGLContext != null) {
            zEglDestroyContext |= this.A.eglDestroyContext(this.B, eGLContext);
            this.C = null;
        }
        EGLDisplay eGLDisplay = this.B;
        if (eGLDisplay == null) {
            return zEglDestroyContext;
        }
        boolean zEglTerminate = this.A.eglTerminate(eGLDisplay);
        this.B = null;
        return zEglTerminate | zEglDestroyContext;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.w++;
        synchronized (this.z) {
            this.z.notifyAll();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00b3  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1004
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.jt.run():void");
    }

    @Override // com.google.android.gms.internal.ads.ht
    public final void zza() {
        synchronized (this.z) {
            this.z.notifyAll();
        }
    }
}