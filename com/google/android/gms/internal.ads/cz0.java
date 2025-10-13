package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.StringReader;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class cz0 {
    private final Context a;

    /* renamed from: b */
    private final kr f5389b;

    /* renamed from: c */
    private final qp1 f5390c;

    /* renamed from: d */
    private final Executor f5391d;

    public cz0(Context context, kr krVar, qp1 qp1Var, Executor executor) {
        this.a = context;
        this.f5389b = krVar;
        this.f5390c = qp1Var;
        this.f5391d = executor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        if (r2.equals(r4) != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.g52<com.google.android.gms.internal.ads.kp1> a() {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.le r0 = com.google.android.gms.ads.internal.zzs.zzp()
            android.content.Context r1 = r6.a
            com.google.android.gms.internal.ads.kr r2 = r6.f5389b
            com.google.android.gms.internal.ads.ve r0 = r0.b(r1, r2)
            com.google.android.gms.internal.ads.oe<org.json.JSONObject> r1 = com.google.android.gms.internal.ads.se.f8855b
            java.lang.String r2 = "google.afma.response.normalize"
            com.google.android.gms.internal.ads.ke r0 = r0.a(r2, r1, r1)
            com.google.android.gms.internal.ads.qp1 r1 = r6.f5390c
            com.google.android.gms.internal.ads.m93 r1 = r1.f8427d
            com.google.android.gms.internal.ads.e93 r1 = r1.w
            com.google.android.gms.internal.ads.o3<java.lang.Boolean> r2 = com.google.android.gms.internal.ads.w3.U4
            com.google.android.gms.internal.ads.u3 r3 = com.google.android.gms.internal.ads.c.c()
            java.lang.Object r2 = r3.b(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            java.lang.String r3 = ""
            if (r2 != 0) goto L2f
            goto L56
        L2f:
            if (r1 == 0) goto L7c
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L7c
            java.lang.String r4 = r1.f5603e     // Catch: org.json.JSONException -> L7c
            r2.<init>(r4)     // Catch: org.json.JSONException -> L7c
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L7c
            java.lang.String r5 = r1.f5604f     // Catch: org.json.JSONException -> L7c
            r4.<init>(r5)     // Catch: org.json.JSONException -> L7c
            java.lang.String r5 = "request_id"
            java.lang.String r2 = r2.optString(r5, r3)
            java.lang.String r4 = r4.optString(r5, r3)
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L7c
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L56
            goto L7c
        L56:
            com.google.android.gms.internal.ads.g52 r2 = com.google.android.gms.internal.ads.y42.a(r3)
            com.google.android.gms.internal.ads.zy0 r3 = new com.google.android.gms.internal.ads.zy0
            r3.<init>(r6, r1)
            java.util.concurrent.Executor r1 = r6.f5391d
            com.google.android.gms.internal.ads.g52 r1 = com.google.android.gms.internal.ads.y42.h(r2, r3, r1)
            com.google.android.gms.internal.ads.az0 r2 = new com.google.android.gms.internal.ads.az0
            r2.<init>(r0)
            java.util.concurrent.Executor r0 = r6.f5391d
            com.google.android.gms.internal.ads.g52 r0 = com.google.android.gms.internal.ads.y42.h(r1, r2, r0)
            com.google.android.gms.internal.ads.bz0 r1 = new com.google.android.gms.internal.ads.bz0
            r1.<init>(r6)
            java.util.concurrent.Executor r2 = r6.f5391d
            com.google.android.gms.internal.ads.g52 r0 = com.google.android.gms.internal.ads.y42.h(r0, r1, r2)
            return r0
        L7c:
            com.google.android.gms.internal.ads.e71 r0 = new com.google.android.gms.internal.ads.e71
            r1 = 14
            java.lang.String r2 = "Mismatch request IDs."
            r0.<init>(r1, r2)
            com.google.android.gms.internal.ads.g52 r0 = com.google.android.gms.internal.ads.y42.b(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cz0.a():com.google.android.gms.internal.ads.g52");
    }

    final /* synthetic */ g52 b(JSONObject jSONObject) {
        return y42.a(new kp1(new gp1(this.f5390c), ip1.a(new StringReader(jSONObject.toString()))));
    }
}