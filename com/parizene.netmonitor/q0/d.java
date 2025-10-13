package com.parizene.netmonitor.q0;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.Application;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.os.PowerManager;
import android.preference.PreferenceManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;

/* compiled from: AndroidModule.java */
/* loaded from: classes3.dex */
public abstract class d {
    static ActivityManager a(Context context) {
        return (ActivityManager) context.getSystemService("activity");
    }

    static AlarmManager b(Context context) {
        return (AlarmManager) context.getSystemService("alarm");
    }

    static ConnectivityManager c(Context context) {
        return (ConnectivityManager) context.getSystemService("connectivity");
    }

    static Context d(Application application) {
        return application.getApplicationContext();
    }

    static KeyguardManager e(Context context) {
        return (KeyguardManager) context.getSystemService("keyguard");
    }

    static c.p.a.a f(Context context) {
        return c.p.a.a.b(context);
    }

    static LocationManager g(Context context) {
        return (LocationManager) context.getSystemService("location");
    }

    static NotificationManager h(Context context) {
        return (NotificationManager) context.getSystemService("notification");
    }

    static PackageManager i(Context context) {
        return context.getPackageManager();
    }

    static PowerManager j(Context context) {
        return (PowerManager) context.getSystemService("power");
    }

    static SharedPreferences k(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    static SubscriptionManager l(Context context) {
        return (SubscriptionManager) context.getSystemService("telephony_subscription_service");
    }

    static TelephonyManager m(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    @SuppressLint({"WifiManagerPotentialLeak"})
    static WifiManager n(Context context) {
        return (WifiManager) context.getSystemService("wifi");
    }
}