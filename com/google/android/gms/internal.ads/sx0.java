package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzs;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class sx0 implements SensorEventListener {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private SensorManager f9012b;

    /* renamed from: c, reason: collision with root package name */
    private Sensor f9013c;

    /* renamed from: d, reason: collision with root package name */
    private long f9014d;

    /* renamed from: e, reason: collision with root package name */
    private int f9015e;

    /* renamed from: f, reason: collision with root package name */
    private rx0 f9016f;

    /* renamed from: g, reason: collision with root package name */
    @GuardedBy("this")
    private boolean f9017g;

    sx0(Context context) {
        this.a = context;
    }

    public final void a(rx0 rx0Var) {
        this.f9016f = rx0Var;
    }

    public final void b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (((Boolean) c.c().b(w3.T5)).booleanValue()) {
                if (this.f9012b == null) {
                    SensorManager sensorManager2 = (SensorManager) this.a.getSystemService("sensor");
                    this.f9012b = sensorManager2;
                    if (sensorManager2 == null) {
                        er.zzi("Shake detection failed to initialize. Failed to obtain accelerometer.");
                        return;
                    }
                    this.f9013c = sensorManager2.getDefaultSensor(1);
                }
                if (!this.f9017g && (sensorManager = this.f9012b) != null && (sensor = this.f9013c) != null) {
                    sensorManager.registerListener(this, sensor, 2);
                    this.f9014d = zzs.zzj().a() - ((Integer) c.c().b(w3.V5)).intValue();
                    this.f9017g = true;
                    zze.zza("Listening for shake gestures.");
                }
            }
        }
    }

    public final void c() {
        synchronized (this) {
            if (this.f9017g) {
                SensorManager sensorManager = this.f9012b;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(this, this.f9013c);
                    zze.zza("Stopped listening for shake gestures.");
                }
                this.f9017g = false;
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i2) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (((Boolean) c.c().b(w3.T5)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f2 = fArr[0] / 9.80665f;
            float f3 = fArr[1] / 9.80665f;
            float f4 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f2 * f2) + (f3 * f3) + (f4 * f4))) < ((Float) c.c().b(w3.U5)).floatValue()) {
                return;
            }
            long jA = zzs.zzj().a();
            if (this.f9014d + ((Integer) c.c().b(w3.V5)).intValue() > jA) {
                return;
            }
            if (this.f9014d + ((Integer) c.c().b(w3.W5)).intValue() < jA) {
                this.f9015e = 0;
            }
            zze.zza("Shake detected.");
            this.f9014d = jA;
            int i2 = this.f9015e + 1;
            this.f9015e = i2;
            rx0 rx0Var = this.f9016f;
            if (rx0Var != null) {
                if (i2 == ((Integer) c.c().b(w3.X5)).intValue()) {
                    gx0 gx0Var = (gx0) rx0Var;
                    gx0Var.h(new ex0(gx0Var));
                }
            }
        }
    }
}