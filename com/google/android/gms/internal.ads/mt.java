package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzau;
import com.google.android.gms.ads.internal.util.zzav;
import com.google.android.gms.ads.internal.util.zzaw;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzs;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class mt {
    private final Context a;

    /* renamed from: b */
    private final String f7539b;

    /* renamed from: c */
    private final kr f7540c;

    /* renamed from: d */
    private final j4 f7541d;

    /* renamed from: e */
    private final m4 f7542e;

    /* renamed from: f */
    private final zzaw f7543f;

    /* renamed from: g */
    private final long[] f7544g;

    /* renamed from: h */
    private final String[] f7545h;

    /* renamed from: i */
    private boolean f7546i;

    /* renamed from: j */
    private boolean f7547j;

    /* renamed from: k */
    private boolean f7548k;

    /* renamed from: l */
    private boolean f7549l;

    /* renamed from: m */
    private boolean f7550m;
    private ts n;
    private boolean o;
    private boolean p;
    private long q;

    public mt(Context context, kr krVar, String str, m4 m4Var, j4 j4Var) {
        zzav zzavVar = new zzav();
        zzavVar.zza("min_1", Double.MIN_VALUE, 1.0d);
        zzavVar.zza("1_5", 1.0d, 5.0d);
        zzavVar.zza("5_10", 5.0d, 10.0d);
        zzavVar.zza("10_20", 10.0d, 20.0d);
        zzavVar.zza("20_30", 20.0d, 30.0d);
        zzavVar.zza("30_max", 30.0d, Double.MAX_VALUE);
        this.f7543f = zzavVar.zzb();
        this.f7546i = false;
        this.f7547j = false;
        this.f7548k = false;
        this.f7549l = false;
        this.q = -1L;
        this.a = context;
        this.f7540c = krVar;
        this.f7539b = str;
        this.f7542e = m4Var;
        this.f7541d = j4Var;
        String str2 = (String) c.c().b(w3.w);
        if (str2 == null) {
            this.f7545h = new String[0];
            this.f7544g = new long[0];
            return;
        }
        String[] strArrSplit = TextUtils.split(str2, ",");
        int length = strArrSplit.length;
        this.f7545h = new String[length];
        this.f7544g = new long[length];
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                this.f7544g[i2] = Long.parseLong(strArrSplit[i2]);
            } catch (NumberFormatException e2) {
                er.zzj("Unable to parse frame hash target time number.", e2);
                this.f7544g[i2] = -1;
            }
        }
    }

    public final void a(ts tsVar) {
        d4.a(this.f7542e, this.f7541d, "vpc2");
        this.f7546i = true;
        this.f7542e.d("vpn", tsVar.a());
        this.n = tsVar;
    }

    public final void b() {
        if (!this.f7546i || this.f7547j) {
            return;
        }
        d4.a(this.f7542e, this.f7541d, "vfr2");
        this.f7547j = true;
    }

    public final void c() {
        if (!w5.a.e().booleanValue() || this.o) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString("request", this.f7539b);
        bundle.putString("player", this.n.a());
        for (zzau zzauVar : this.f7543f.zzb()) {
            String strValueOf = String.valueOf(zzauVar.zza);
            bundle.putString(strValueOf.length() != 0 ? "fps_c_".concat(strValueOf) : new String("fps_c_"), Integer.toString(zzauVar.zze));
            String strValueOf2 = String.valueOf(zzauVar.zza);
            bundle.putString(strValueOf2.length() != 0 ? "fps_p_".concat(strValueOf2) : new String("fps_p_"), Double.toString(zzauVar.zzd));
        }
        int i2 = 0;
        while (true) {
            long[] jArr = this.f7544g;
            if (i2 >= jArr.length) {
                zzs.zzc().zzj(this.a, this.f7540c.f7054e, "gmob-apps", bundle, true);
                this.o = true;
                return;
            }
            String str = this.f7545h[i2];
            if (str != null) {
                String strValueOf3 = String.valueOf(Long.valueOf(jArr[i2]));
                StringBuilder sb = new StringBuilder(strValueOf3.length() + 3);
                sb.append("fh_");
                sb.append(strValueOf3);
                bundle.putString(sb.toString(), str);
            }
            i2++;
        }
    }

    public final void d(ts tsVar) {
        if (this.f7548k && !this.f7549l) {
            if (zze.zzc() && !this.f7549l) {
                zze.zza("VideoMetricsMixin first frame");
            }
            d4.a(this.f7542e, this.f7541d, "vff2");
            this.f7549l = true;
        }
        long jNanoTime = zzs.zzj().nanoTime();
        if (this.f7550m && this.p && this.q != -1) {
            this.f7543f.zza(TimeUnit.SECONDS.toNanos(1L) / (jNanoTime - this.q));
        }
        this.p = this.f7550m;
        this.q = jNanoTime;
        long jLongValue = ((Long) c.c().b(w3.x)).longValue();
        long jM = tsVar.m();
        int i2 = 0;
        while (true) {
            String[] strArr = this.f7545h;
            if (i2 >= strArr.length) {
                return;
            }
            if (strArr[i2] == null && jLongValue > Math.abs(jM - this.f7544g[i2])) {
                String[] strArr2 = this.f7545h;
                int i3 = 8;
                Bitmap bitmap = tsVar.getBitmap(8, 8);
                long j2 = 63;
                long j3 = 0;
                int i4 = 0;
                while (i4 < i3) {
                    int i5 = 0;
                    while (i5 < i3) {
                        int pixel = bitmap.getPixel(i5, i4);
                        j3 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1L : 0L) << ((int) j2);
                        i5++;
                        j2--;
                        i3 = 8;
                    }
                    i4++;
                    i3 = 8;
                }
                strArr2[i2] = String.format("%016X", Long.valueOf(j3));
                return;
            }
            i2++;
        }
    }

    public final void e() {
        this.f7550m = true;
        if (!this.f7547j || this.f7548k) {
            return;
        }
        d4.a(this.f7542e, this.f7541d, "vfp2");
        this.f7548k = true;
    }

    public final void f() {
        this.f7550m = false;
    }
}