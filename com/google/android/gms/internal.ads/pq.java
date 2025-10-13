package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzs;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class pq {

    /* renamed from: g */
    final String f8235g;

    /* renamed from: h */
    private final zzg f8236h;
    long a = -1;

    /* renamed from: b */
    long f8230b = -1;

    /* renamed from: c */
    @GuardedBy("lock")
    int f8231c = -1;

    /* renamed from: d */
    int f8232d = -1;

    /* renamed from: e */
    long f8233e = 0;

    /* renamed from: f */
    private final Object f8234f = new Object();

    /* renamed from: i */
    @GuardedBy("lock")
    int f8237i = 0;

    /* renamed from: j */
    @GuardedBy("lock")
    int f8238j = 0;

    public pq(String str, zzg zzgVar) {
        this.f8235g = str;
        this.f8236h = zzgVar;
    }

    public final void a() {
        synchronized (this.f8234f) {
            this.f8237i++;
        }
    }

    public final void b() {
        synchronized (this.f8234f) {
            this.f8238j++;
        }
    }

    public final void c(m93 m93Var, long j2) {
        synchronized (this.f8234f) {
            long jZzq = this.f8236h.zzq();
            long jA = zzs.zzj().a();
            if (this.f8230b == -1) {
                if (jA - jZzq > ((Long) c.c().b(w3.E0)).longValue()) {
                    this.f8232d = -1;
                } else {
                    this.f8232d = this.f8236h.zzs();
                }
                this.f8230b = j2;
                this.a = j2;
            } else {
                this.a = j2;
            }
            Bundle bundle = m93Var.f7445g;
            if (bundle != null && bundle.getInt("gw", 2) == 1) {
                return;
            }
            this.f8231c++;
            int i2 = this.f8232d + 1;
            this.f8232d = i2;
            if (i2 == 0) {
                this.f8233e = 0L;
                this.f8236h.zzt(jA);
            } else {
                this.f8233e = jA - this.f8236h.zzu();
            }
        }
    }

    public final void d() {
        if (p5.a.e().booleanValue()) {
            synchronized (this.f8234f) {
                this.f8231c--;
                this.f8232d--;
            }
        }
    }

    public final Bundle e(Context context, String str) {
        Bundle bundle;
        synchronized (this.f8234f) {
            bundle = new Bundle();
            bundle.putString("session_id", this.f8236h.zzB() ? "" : this.f8235g);
            bundle.putLong("basets", this.f8230b);
            bundle.putLong("currts", this.a);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.f8231c);
            bundle.putInt("preqs_in_session", this.f8232d);
            bundle.putLong("time_in_session", this.f8233e);
            bundle.putInt("pclick", this.f8237i);
            bundle.putInt("pimp", this.f8238j);
            Context contextA = em.a(context);
            int identifier = contextA.getResources().getIdentifier("Theme.Translucent", "style", "android");
            boolean z = false;
            if (identifier == 0) {
                er.zzh("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            } else {
                try {
                    if (identifier == contextA.getPackageManager().getActivityInfo(new ComponentName(contextA.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                        z = true;
                    } else {
                        er.zzh("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    er.zzi("Fail to fetch AdActivity theme");
                    er.zzh("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                }
            }
            bundle.putBoolean("support_transparent_background", z);
        }
        return bundle;
    }
}