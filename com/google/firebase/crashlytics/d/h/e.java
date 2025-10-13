package com.google.firebase.crashlytics.d.h;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: BatteryState.java */
/* loaded from: classes.dex */
class e {
    private final Float a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f12348b;

    private e(Float f2, boolean z) {
        this.f12348b = z;
        this.a = f2;
    }

    public static e a(Context context) {
        boolean zE;
        Float fD = null;
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            zE = e(intentRegisterReceiver);
            fD = d(intentRegisterReceiver);
        } else {
            zE = false;
        }
        return new e(fD, zE);
    }

    private static Float d(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(intExtra / intExtra2);
    }

    private static boolean e(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    public Float b() {
        return this.a;
    }

    public int c() {
        Float f2;
        if (!this.f12348b || (f2 = this.a) == null) {
            return 1;
        }
        return ((double) f2.floatValue()) < 0.99d ? 2 : 3;
    }
}