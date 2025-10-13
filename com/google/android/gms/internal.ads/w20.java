package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class w20 implements Runnable {

    /* renamed from: e */
    private final ew f9856e;

    /* renamed from: f */
    private final JSONObject f9857f;

    w20(ew ewVar, JSONObject jSONObject) {
        this.f9856e = ewVar;
        this.f9857f = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9856e.j0("AFMA_updateActiveView", this.f9857f);
    }
}