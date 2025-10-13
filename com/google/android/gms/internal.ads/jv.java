package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class jv implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f6850e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f6851f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ long f6852g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ lv f6853h;

    jv(lv lvVar, String str, String str2, long j2) {
        this.f6853h = lvVar;
        this.f6850e = str;
        this.f6851f = str2;
        this.f6852g = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheComplete");
        map.put("src", this.f6850e);
        map.put("cachedSrc", this.f6851f);
        map.put("totalDuration", Long.toString(this.f6852g));
        lv.u(this.f6853h, "onPrecacheEvent", map);
    }
}