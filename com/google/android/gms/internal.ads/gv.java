package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzs;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class gv implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f6189e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f6190f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ long f6191g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ long f6192h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ long f6193i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ long f6194j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ long f6195k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ boolean f6196l;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ int f6197m;
    final /* synthetic */ int n;
    final /* synthetic */ lv o;

    gv(lv lvVar, String str, String str2, long j2, long j3, long j4, long j5, long j6, boolean z, int i2, int i3) {
        this.o = lvVar;
        this.f6189e = str;
        this.f6190f = str2;
        this.f6191g = j2;
        this.f6192h = j3;
        this.f6193i = j4;
        this.f6194j = j5;
        this.f6195k = j6;
        this.f6196l = z;
        this.f6197m = i2;
        this.n = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.f6189e);
        map.put("cachedSrc", this.f6190f);
        map.put("bufferedDuration", Long.toString(this.f6191g));
        map.put("totalDuration", Long.toString(this.f6192h));
        if (((Boolean) c.c().b(w3.j1)).booleanValue()) {
            map.put("qoeLoadedBytes", Long.toString(this.f6193i));
            map.put("qoeCachedBytes", Long.toString(this.f6194j));
            map.put("totalBytes", Long.toString(this.f6195k));
            map.put("reportTime", Long.toString(zzs.zzj().a()));
        }
        map.put("cacheReady", true != this.f6196l ? "0" : "1");
        map.put("playerCount", Integer.toString(this.f6197m));
        map.put("playerPreparedCount", Integer.toString(this.n));
        lv.u(this.o, "onPrecacheEvent", map);
    }
}