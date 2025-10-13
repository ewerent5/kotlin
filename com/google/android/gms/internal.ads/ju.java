package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class ju implements Runnable {

    /* renamed from: e */
    private final lt f6845e;

    /* renamed from: f */
    private final Map f6846f;

    ju(lt ltVar, Map map) {
        this.f6845e = ltVar;
        this.f6846f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6845e.e0("onGcacheInfoEvent", this.f6846f);
    }
}