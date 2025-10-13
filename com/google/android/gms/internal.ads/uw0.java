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
public final class uw0 implements SensorEventListener {

    @Nullable
    private final SensorManager a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final Sensor f9571b;

    /* renamed from: c, reason: collision with root package name */
    private float f9572c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    private Float f9573d = Float.valueOf(0.0f);

    /* renamed from: e, reason: collision with root package name */
    private long f9574e = zzs.zzj().a();

    /* renamed from: f, reason: collision with root package name */
    private int f9575f = 0;

    /* renamed from: g, reason: collision with root package name */
    private boolean f9576g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f9577h = false;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    private tw0 f9578i = null;

    /* renamed from: j, reason: collision with root package name */
    @GuardedBy("this")
    private boolean f9579j = false;

    uw0(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.a = sensorManager;
        if (sensorManager != null) {
            this.f9571b = sensorManager.getDefaultSensor(4);
        } else {
            this.f9571b = null;
        }
    }

    public final void a(tw0 tw0Var) {
        this.f9578i = tw0Var;
    }

    public final void b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (((Boolean) c.c().b(w3.Y5)).booleanValue()) {
                if (!this.f9579j && (sensorManager = this.a) != null && (sensor = this.f9571b) != null) {
                    sensorManager.registerListener(this, sensor, 2);
                    this.f9579j = true;
                    zze.zza("Listening for flick gestures.");
                }
                if (this.a == null || this.f9571b == null) {
                    er.zzi("Flick detection failed to initialize. Failed to obtain gyroscope.");
                }
            }
        }
    }

    public final void c() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (this.f9579j && (sensorManager = this.a) != null && (sensor = this.f9571b) != null) {
                sensorManager.unregisterListener(this, sensor);
                this.f9579j = false;
                zze.zza("Stopped listening for flick gestures.");
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i2) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (((Boolean) c.c().b(w3.Y5)).booleanValue()) {
            long jA = zzs.zzj().a();
            if (this.f9574e + ((Integer) c.c().b(w3.a6)).intValue() < jA) {
                this.f9575f = 0;
                this.f9574e = jA;
                this.f9576g = false;
                this.f9577h = false;
                this.f9572c = this.f9573d.floatValue();
            }
            Float fValueOf = Float.valueOf(this.f9573d.floatValue() + (sensorEvent.values[1] * 4.0f));
            this.f9573d = fValueOf;
            float fFloatValue = fValueOf.floatValue();
            float f2 = this.f9572c;
            o3<Float> o3Var = w3.Z5;
            if (fFloatValue > f2 + ((Float) c.c().b(o3Var)).floatValue()) {
                this.f9572c = this.f9573d.floatValue();
                this.f9577h = true;
            } else if (this.f9573d.floatValue() < this.f9572c - ((Float) c.c().b(o3Var)).floatValue()) {
                this.f9572c = this.f9573d.floatValue();
                this.f9576g = true;
            }
            if (this.f9573d.isInfinite()) {
                this.f9573d = Float.valueOf(0.0f);
                this.f9572c = 0.0f;
            }
            if (this.f9576g && this.f9577h) {
                zze.zza("Flick detected.");
                this.f9574e = jA;
                int i2 = this.f9575f + 1;
                this.f9575f = i2;
                this.f9576g = false;
                this.f9577h = false;
                tw0 tw0Var = this.f9578i;
                if (tw0Var != null) {
                    if (i2 == ((Integer) c.c().b(w3.b6)).intValue()) {
                        gx0 gx0Var = (gx0) tw0Var;
                        gx0Var.h(new fx0(gx0Var));
                    }
                }
            }
        }
    }
}