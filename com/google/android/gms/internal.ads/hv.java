package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class hv implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f6397e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f6398f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ int f6399g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ int f6400h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ long f6401i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ long f6402j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ boolean f6403k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ int f6404l;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ int f6405m;
    final /* synthetic */ lv n;

    hv(lv lvVar, String str, String str2, int i2, int i3, long j2, long j3, boolean z, int i4, int i5) {
        this.n = lvVar;
        this.f6397e = str;
        this.f6398f = str2;
        this.f6399g = i2;
        this.f6400h = i3;
        this.f6401i = j2;
        this.f6402j = j3;
        this.f6403k = z;
        this.f6404l = i4;
        this.f6405m = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.f6397e);
        map.put("cachedSrc", this.f6398f);
        map.put("bytesLoaded", Integer.toString(this.f6399g));
        map.put("totalBytes", Integer.toString(this.f6400h));
        map.put("bufferedDuration", Long.toString(this.f6401i));
        map.put("totalDuration", Long.toString(this.f6402j));
        map.put("cacheReady", true != this.f6403k ? "0" : "1");
        map.put("playerCount", Integer.toString(this.f6404l));
        map.put("playerPreparedCount", Integer.toString(this.f6405m));
        lv.u(this.n, "onPrecacheEvent", map);
    }
}