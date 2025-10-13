package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class i30 implements Runnable {

    /* renamed from: e */
    private final j30 f6468e;

    /* renamed from: f */
    private final JSONObject f6469f;

    i30(j30 j30Var, JSONObject jSONObject) {
        this.f6468e = j30Var;
        this.f6469f = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6468e.f(this.f6469f);
    }
}