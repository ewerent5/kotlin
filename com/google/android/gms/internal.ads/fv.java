package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class fv implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f5950e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f5951f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ int f5952g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ int f5953h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ lv f5954i;

    fv(lv lvVar, String str, String str2, int i2, int i3, boolean z) {
        this.f5954i = lvVar;
        this.f5950e = str;
        this.f5951f = str2;
        this.f5952g = i2;
        this.f5953h = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.f5950e);
        map.put("cachedSrc", this.f5951f);
        map.put("bytesLoaded", Integer.toString(this.f5952g));
        map.put("totalBytes", Integer.toString(this.f5953h));
        map.put("cacheReady", "0");
        lv.u(this.f5954i, "onPrecacheEvent", map);
    }
}