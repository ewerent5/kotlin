package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class iv implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f6609e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f6610f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ int f6611g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ lv f6612h;

    iv(lv lvVar, String str, String str2, int i2) {
        this.f6612h = lvVar;
        this.f6609e = str;
        this.f6610f = str2;
        this.f6611g = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheComplete");
        map.put("src", this.f6609e);
        map.put("cachedSrc", this.f6610f);
        map.put("totalBytes", Integer.toString(this.f6611g));
        lv.u(this.f6612h, "onPrecacheEvent", map);
    }
}