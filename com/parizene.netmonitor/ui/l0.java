package com.parizene.netmonitor.ui;

import android.text.TextUtils;

/* compiled from: AdsConfigHolder.kt */
/* loaded from: classes3.dex */
public final class l0 {
    private final f.a<e.c.d.f> a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13853b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f13854c;

    /* renamed from: d, reason: collision with root package name */
    private final com.parizene.netmonitor.p0.a f13855d;

    public l0(com.google.firebase.remoteconfig.g gVar, f.a<e.c.d.f> aVar) {
        i.y.d.l.d(gVar, "firebaseRemoteConfig");
        i.y.d.l.d(aVar, "gson");
        this.a = aVar;
        String strH = gVar.h("ads_config_json");
        this.f13853b = strH;
        boolean zE = gVar.e("ads_config_enabled");
        this.f13854c = zE;
        com.parizene.netmonitor.p0.a aVarA = a();
        this.f13855d = aVarA;
        m.a.a.a("adsConfigEnabled=%s, adsConfigJson=%s, adsConfig=%s", Boolean.valueOf(zE), strH, aVarA);
    }

    private final com.parizene.netmonitor.p0.a a() {
        com.parizene.netmonitor.p0.b bVar = new com.parizene.netmonitor.p0.b();
        if (!this.f13854c || TextUtils.isEmpty(this.f13853b)) {
            return bVar;
        }
        try {
            Object objJ = this.a.get().j(this.f13853b, com.parizene.netmonitor.p0.a.class);
            i.y.d.l.c(objJ, "gson.get().fromJson(adsConfigJson, AdsConfig::class.java)");
            return (com.parizene.netmonitor.p0.a) objJ;
        } catch (Exception e2) {
            m.a.a.g(e2);
            return bVar;
        }
    }

    public final com.parizene.netmonitor.p0.a b() {
        return this.f13855d;
    }
}