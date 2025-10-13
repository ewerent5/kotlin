package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class it implements SensorEventListener {
    private final SensorManager a;

    /* renamed from: c, reason: collision with root package name */
    private final Display f6590c;

    /* renamed from: f, reason: collision with root package name */
    @GuardedBy("sensorThreadLock")
    private float[] f6593f;

    /* renamed from: g, reason: collision with root package name */
    private Handler f6594g;

    /* renamed from: h, reason: collision with root package name */
    private ht f6595h;

    /* renamed from: d, reason: collision with root package name */
    private final float[] f6591d = new float[9];

    /* renamed from: e, reason: collision with root package name */
    private final float[] f6592e = new float[9];

    /* renamed from: b, reason: collision with root package name */
    private final Object f6589b = new Object();

    it(Context context) {
        this.a = (SensorManager) context.getSystemService("sensor");
        this.f6590c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    final void a() {
        if (this.f6594g != null) {
            return;
        }
        Sensor defaultSensor = this.a.getDefaultSensor(11);
        if (defaultSensor == null) {
            er.zzf("No Sensor of TYPE_ROTATION_VECTOR");
            return;
        }
        HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
        handlerThread.start();
        l02 l02Var = new l02(handlerThread.getLooper());
        this.f6594g = l02Var;
        if (this.a.registerListener(this, defaultSensor, 0, l02Var)) {
            return;
        }
        er.zzf("SensorManager.registerListener failed.");
        b();
    }

    final void b() {
        if (this.f6594g == null) {
            return;
        }
        this.a.unregisterListener(this);
        this.f6594g.post(new gt(this));
        this.f6594g = null;
    }

    final void c(ht htVar) {
        this.f6595h = htVar;
    }

    final boolean d(float[] fArr) {
        synchronized (this.f6589b) {
            float[] fArr2 = this.f6593f;
            if (fArr2 == null) {
                return false;
            }
            System.arraycopy(fArr2, 0, fArr, 0, 9);
            return true;
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i2) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.f6589b) {
            if (this.f6593f == null) {
                this.f6593f = new float[9];
            }
        }
        SensorManager.getRotationMatrixFromVector(this.f6591d, fArr);
        int rotation = this.f6590c.getRotation();
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(this.f6591d, 2, 129, this.f6592e);
        } else if (rotation == 2) {
            SensorManager.remapCoordinateSystem(this.f6591d, 129, 130, this.f6592e);
        } else if (rotation != 3) {
            System.arraycopy(this.f6591d, 0, this.f6592e, 0, 9);
        } else {
            SensorManager.remapCoordinateSystem(this.f6591d, 130, 1, this.f6592e);
        }
        float[] fArr2 = this.f6592e;
        float f2 = fArr2[1];
        fArr2[1] = fArr2[3];
        fArr2[3] = f2;
        float f3 = fArr2[2];
        fArr2[2] = fArr2[6];
        fArr2[6] = f3;
        float f4 = fArr2[5];
        fArr2[5] = fArr2[7];
        fArr2[7] = f4;
        synchronized (this.f6589b) {
            System.arraycopy(this.f6592e, 0, this.f6593f, 0, 9);
        }
        ht htVar = this.f6595h;
        if (htVar != null) {
            htVar.zza();
        }
    }
}