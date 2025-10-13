package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import com.google.android.gms.ads.internal.zzs;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ul {
    private int A;
    private final String B;
    private boolean C;
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f9490b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9491c;

    /* renamed from: d, reason: collision with root package name */
    private int f9492d;

    /* renamed from: e, reason: collision with root package name */
    private int f9493e;

    /* renamed from: f, reason: collision with root package name */
    private int f9494f;

    /* renamed from: g, reason: collision with root package name */
    private String f9495g;

    /* renamed from: h, reason: collision with root package name */
    private int f9496h;

    /* renamed from: i, reason: collision with root package name */
    private int f9497i;

    /* renamed from: j, reason: collision with root package name */
    private int f9498j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f9499k;

    /* renamed from: l, reason: collision with root package name */
    private int f9500l;

    /* renamed from: m, reason: collision with root package name */
    private double f9501m;
    private boolean n;
    private String o;
    private String p;
    private final boolean q;
    private final boolean r;
    private final String s;
    private final boolean t;
    private final boolean u;
    private final boolean v;
    private final String w;
    private final String x;
    private float y;
    private int z;

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ul(android.content.Context r7) {
        /*
            r6 = this;
            r6.<init>()
            android.content.pm.PackageManager r0 = r7.getPackageManager()
            r6.b(r7)
            r6.c(r7)
            r6.d(r7)
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r2 = "geo:0,0?q=donuts"
            android.content.pm.ResolveInfo r2 = e(r0, r2)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L20
            r2 = 1
            goto L21
        L20:
            r2 = 0
        L21:
            r6.q = r2
            java.lang.String r2 = "http://www.google.com"
            android.content.pm.ResolveInfo r2 = e(r0, r2)
            if (r2 == 0) goto L2c
            goto L2d
        L2c:
            r3 = 0
        L2d:
            r6.r = r3
            java.lang.String r2 = r1.getCountry()
            r6.s = r2
            com.google.android.gms.internal.ads.ta3.a()
            boolean r2 = com.google.android.gms.internal.ads.xq.m()
            r6.t = r2
            boolean r2 = com.google.android.gms.common.util.j.a(r7)
            r6.u = r2
            boolean r2 = com.google.android.gms.common.util.j.b(r7)
            r6.v = r2
            java.lang.String r1 = r1.getLanguage()
            r6.w = r1
            java.lang.String r1 = "market://details?id=com.google.android.gms.ads"
            android.content.pm.ResolveInfo r0 = e(r0, r1)
            java.lang.String r1 = "."
            r2 = 0
            if (r0 != 0) goto L5d
        L5b:
            r0 = r2
            goto L8e
        L5d:
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            if (r0 != 0) goto L62
            goto L5b
        L62:
            com.google.android.gms.common.p.b r3 = com.google.android.gms.common.p.c.a(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5b
            java.lang.String r5 = r0.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5b
            android.content.pm.PackageInfo r3 = r3.f(r5, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5b
            if (r3 == 0) goto L5b
            int r3 = r3.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5b
            java.lang.String r0 = r0.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5b
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5b
            int r4 = r4.length()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5b
            int r4 = r4 + 12
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5b
            r5.<init>(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5b
            r5.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5b
            r5.append(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5b
            r5.append(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5b
            java.lang.String r0 = r5.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5b
        L8e:
            r6.x = r0
            com.google.android.gms.common.p.b r0 = com.google.android.gms.common.p.c.a(r7)     // Catch: java.lang.Exception -> Lbf
            java.lang.String r3 = "com.android.vending"
            r4 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r0 = r0.f(r3, r4)     // Catch: java.lang.Exception -> Lbf
            if (r0 == 0) goto Lc0
            int r3 = r0.versionCode     // Catch: java.lang.Exception -> Lbf
            java.lang.String r0 = r0.packageName     // Catch: java.lang.Exception -> Lbf
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> Lbf
            int r4 = r4.length()     // Catch: java.lang.Exception -> Lbf
            int r4 = r4 + 12
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lbf
            r5.<init>(r4)     // Catch: java.lang.Exception -> Lbf
            r5.append(r3)     // Catch: java.lang.Exception -> Lbf
            r5.append(r1)     // Catch: java.lang.Exception -> Lbf
            r5.append(r0)     // Catch: java.lang.Exception -> Lbf
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Exception -> Lbf
            goto Lc0
        Lbf:
        Lc0:
            r6.B = r2
            android.content.res.Resources r7 = r7.getResources()
            if (r7 != 0) goto Lc9
            return
        Lc9:
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            if (r7 != 0) goto Ld0
            return
        Ld0:
            float r0 = r7.density
            r6.y = r0
            int r0 = r7.widthPixels
            r6.z = r0
            int r7 = r7.heightPixels
            r6.A = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ul.<init>(android.content.Context):void");
    }

    private final void b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.a = audioManager.getMode();
                this.f9490b = audioManager.isMusicActive();
                this.f9491c = audioManager.isSpeakerphoneOn();
                this.f9492d = audioManager.getStreamVolume(3);
                this.f9493e = audioManager.getRingerMode();
                this.f9494f = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                zzs.zzg().g(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.a = -2;
        this.f9490b = false;
        this.f9491c = false;
        this.f9492d = 0;
        this.f9493e = 2;
        this.f9494f = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    @android.annotation.TargetApi(16)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void c(android.content.Context r6) {
        /*
            r5 = this;
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r6.getSystemService(r0)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r1 = "connectivity"
            java.lang.Object r1 = r6.getSystemService(r1)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            java.lang.String r2 = r0.getNetworkOperator()
            r5.f9495g = r2
            boolean r2 = com.google.android.gms.common.util.n.l()
            r3 = 0
            if (r2 == 0) goto L31
            com.google.android.gms.internal.ads.o3<java.lang.Boolean> r2 = com.google.android.gms.internal.ads.w3.D5
            com.google.android.gms.internal.ads.u3 r4 = com.google.android.gms.internal.ads.c.c()
            java.lang.Object r2 = r4.b(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L31
            r2 = 0
            goto L35
        L31:
            int r2 = r0.getNetworkType()
        L35:
            r5.f9497i = r2
            int r0 = r0.getPhoneType()
            r5.f9498j = r0
            r0 = -2
            r5.f9496h = r0
            r5.f9499k = r3
            r0 = -1
            r5.f9500l = r0
            com.google.android.gms.ads.internal.zzs.zzc()
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r6 = com.google.android.gms.ads.internal.util.zzr.zzD(r6, r2)
            if (r6 == 0) goto L6f
            android.net.NetworkInfo r6 = r1.getActiveNetworkInfo()
            if (r6 == 0) goto L67
            int r0 = r6.getType()
            r5.f9496h = r0
            android.net.NetworkInfo$DetailedState r6 = r6.getDetailedState()
            int r6 = r6.ordinal()
            r5.f9500l = r6
            goto L69
        L67:
            r5.f9496h = r0
        L69:
            boolean r6 = r1.isActiveNetworkMetered()
            r5.f9499k = r6
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ul.c(android.content.Context):void");
    }

    private final void d(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            this.f9501m = -1.0d;
            this.n = false;
        } else {
            int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
            this.f9501m = intentRegisterReceiver.getIntExtra("level", -1) / intentRegisterReceiver.getIntExtra("scale", -1);
            this.n = intExtra == 2 || intExtra == 5;
        }
    }

    private static ResolveInfo e(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            zzs.zzg().g(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    public final vl a() {
        return new vl(this.a, this.q, this.r, this.f9495g, this.s, this.t, this.u, this.v, this.f9490b, this.f9491c, this.w, this.x, this.B, this.f9492d, this.f9496h, this.f9497i, this.f9498j, this.f9493e, this.f9494f, this.y, this.z, this.A, this.f9501m, this.n, this.f9499k, this.f9500l, this.o, this.C, this.p);
    }

    public ul(Context context, vl vlVar) {
        b(context);
        c(context);
        d(context);
        this.o = Build.FINGERPRINT;
        this.p = Build.DEVICE;
        boolean z = false;
        if (com.google.android.gms.common.util.n.b() && v4.a(context)) {
            z = true;
        }
        this.C = z;
        this.q = vlVar.a;
        this.r = vlVar.f9724b;
        this.s = vlVar.f9726d;
        this.t = vlVar.f9727e;
        this.u = vlVar.f9728f;
        this.v = vlVar.f9729g;
        this.w = vlVar.f9730h;
        this.x = vlVar.f9731i;
        this.B = vlVar.f9732j;
        this.y = vlVar.f9735m;
        this.z = vlVar.n;
        this.A = vlVar.o;
    }
}