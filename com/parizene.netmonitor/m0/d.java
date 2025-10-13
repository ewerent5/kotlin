package com.parizene.netmonitor.m0;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: CellConfig.java */
/* loaded from: classes.dex */
public class d {
    public com.parizene.netmonitor.m0.b0.c a;

    /* renamed from: b, reason: collision with root package name */
    public com.parizene.netmonitor.m0.b0.c[] f13347b;

    /* renamed from: c, reason: collision with root package name */
    public com.parizene.netmonitor.m0.b0.c f13348c;

    /* renamed from: d, reason: collision with root package name */
    public com.parizene.netmonitor.m0.b0.c[] f13349d;

    /* renamed from: e, reason: collision with root package name */
    public com.parizene.netmonitor.m0.b0.c f13350e;

    /* renamed from: f, reason: collision with root package name */
    public com.parizene.netmonitor.m0.b0.c[] f13351f;

    /* renamed from: g, reason: collision with root package name */
    public com.parizene.netmonitor.m0.b0.c f13352g;

    /* renamed from: h, reason: collision with root package name */
    public com.parizene.netmonitor.m0.b0.c[] f13353h;

    /* renamed from: i, reason: collision with root package name */
    public com.parizene.netmonitor.m0.b0.c f13354i;

    /* renamed from: j, reason: collision with root package name */
    public com.parizene.netmonitor.m0.b0.c[] f13355j;

    /* renamed from: k, reason: collision with root package name */
    public com.parizene.netmonitor.m0.b0.c f13356k;

    /* renamed from: l, reason: collision with root package name */
    public com.parizene.netmonitor.m0.b0.c[] f13357l;

    private d(com.parizene.netmonitor.m0.b0.c cVar, com.parizene.netmonitor.m0.b0.c cVar2, com.parizene.netmonitor.m0.b0.c cVar3, com.parizene.netmonitor.m0.b0.c cVar4, com.parizene.netmonitor.m0.b0.c cVar5, com.parizene.netmonitor.m0.b0.c cVar6) {
        com.parizene.netmonitor.m0.b0.c cVar7 = com.parizene.netmonitor.m0.b0.c.DEFAULT;
        com.parizene.netmonitor.m0.b0.c cVar8 = com.parizene.netmonitor.m0.b0.c.DBM;
        this.f13347b = new com.parizene.netmonitor.m0.b0.c[]{cVar7, cVar8};
        com.parizene.netmonitor.m0.b0.c cVar9 = com.parizene.netmonitor.m0.b0.c.MINUS_116;
        this.f13349d = new com.parizene.netmonitor.m0.b0.c[]{cVar7, cVar8, cVar9};
        this.f13351f = new com.parizene.netmonitor.m0.b0.c[]{cVar7, cVar9};
        this.f13353h = new com.parizene.netmonitor.m0.b0.c[]{cVar7, com.parizene.netmonitor.m0.b0.c.MINUS_113};
        this.f13355j = new com.parizene.netmonitor.m0.b0.c[]{cVar7, cVar9};
        this.f13357l = new com.parizene.netmonitor.m0.b0.c[]{cVar7, cVar9, com.parizene.netmonitor.m0.b0.c.MINUS_140};
        this.a = cVar;
        this.f13348c = cVar2;
        this.f13350e = cVar3;
        this.f13352g = cVar4;
        this.f13354i = cVar5;
        this.f13356k = cVar6;
    }

    private static d a() {
        com.parizene.netmonitor.m0.b0.c cVar = com.parizene.netmonitor.m0.b0.c.DEFAULT;
        return new d(cVar, cVar, cVar, cVar, cVar, cVar);
    }

    public static d b(String str) {
        if (TextUtils.isEmpty(str)) {
            return a();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new d(com.parizene.netmonitor.m0.b0.c.valueOf(jSONObject.getString("oldGsmCurrent")), com.parizene.netmonitor.m0.b0.c.valueOf(jSONObject.getString("oldWcdmaCurrent")), com.parizene.netmonitor.m0.b0.c.valueOf(jSONObject.getString("oldWcdmaNeighboring")), com.parizene.netmonitor.m0.b0.c.valueOf(jSONObject.getString("newGsm")), com.parizene.netmonitor.m0.b0.c.valueOf(jSONObject.getString("newWcdma")), com.parizene.netmonitor.m0.b0.c.valueOf(jSONObject.getString("newLte")));
        } catch (Exception e2) {
            m.a.a.g(e2);
            return a();
        }
    }

    public static String c(d dVar) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("oldGsmCurrent", dVar.a);
            jSONObject.put("oldWcdmaCurrent", dVar.f13348c);
            jSONObject.put("oldWcdmaNeighboring", dVar.f13350e);
            jSONObject.put("newGsm", dVar.f13352g);
            jSONObject.put("newWcdma", dVar.f13354i);
            jSONObject.put("newLte", dVar.f13356k);
            return jSONObject.toString();
        } catch (Exception e2) {
            m.a.a.g(e2);
            return null;
        }
    }
}