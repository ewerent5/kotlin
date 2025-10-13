package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.ads.internal.zzs;
import java.net.URISyntaxException;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class aa {
    public static final ba<ew> a = f9.a;

    /* renamed from: b, reason: collision with root package name */
    public static final ba<ew> f4869b = g9.a;

    /* renamed from: c, reason: collision with root package name */
    public static final ba<ew> f4870c = h9.a;

    /* renamed from: d, reason: collision with root package name */
    public static final ba<ew> f4871d = m9.a;

    /* renamed from: e, reason: collision with root package name */
    public static final ba<ew> f4872e = new s9();

    /* renamed from: f, reason: collision with root package name */
    public static final ba<ew> f4873f = new t9();

    /* renamed from: g, reason: collision with root package name */
    public static final ba<ew> f4874g = n9.a;

    /* renamed from: h, reason: collision with root package name */
    public static final ba<Object> f4875h = new u9();

    /* renamed from: i, reason: collision with root package name */
    public static final ba<ew> f4876i = new v9();

    /* renamed from: j, reason: collision with root package name */
    public static final ba<ew> f4877j = o9.a;

    /* renamed from: k, reason: collision with root package name */
    public static final ba<ew> f4878k = new w9();

    /* renamed from: l, reason: collision with root package name */
    public static final ba<ew> f4879l = new x9();

    /* renamed from: m, reason: collision with root package name */
    public static final ba<lt> f4880m = new av();
    public static final ba<lt> n = new bv();
    public static final ba<ew> o = new e9();
    public static final qa p = new qa();
    public static final ba<ew> q = new y9();
    public static final ba<ew> r = new z9();
    public static final ba<ew> s = new p9();
    public static final ba<ew> t = new q9();

    public static g52<String> a(ew ewVar, String str) {
        Uri uriE = Uri.parse(str);
        try {
            ip2 ip2VarG = ewVar.g();
            if (ip2VarG != null && ip2VarG.a(uriE)) {
                uriE = ip2VarG.e(uriE, ewVar.getContext(), ewVar.n(), ewVar.zzj());
            }
        } catch (jp2 unused) {
            er.zzi(str.length() != 0 ? "Unable to append parameter to URL: ".concat(str) : new String("Unable to append parameter to URL: "));
        }
        final String strB = mp.b(uriE, ewVar.getContext());
        if (!k5.f6961f.e().booleanValue()) {
            return y42.a(strB);
        }
        p42 p42VarD = p42.D(ewVar.s());
        x02 x02Var = i9.a;
        h52 h52Var = qr.f8451f;
        return y42.e(y42.i(y42.e(p42VarD, Throwable.class, x02Var, h52Var), new x02(strB) { // from class: com.google.android.gms.internal.ads.j9
            private final String a;

            {
                this.a = strB;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
            @Override // com.google.android.gms.internal.ads.x02
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object apply(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.String r0 = r5.a
                    java.lang.String r6 = (java.lang.String) r6
                    com.google.android.gms.internal.ads.ba<com.google.android.gms.internal.ads.ew> r1 = com.google.android.gms.internal.ads.aa.a
                    if (r6 != 0) goto L9
                    goto L74
                L9:
                    com.google.android.gms.internal.ads.z4<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.k5.f6960e
                    java.lang.Object r1 = r1.e()
                    java.lang.Boolean r1 = (java.lang.Boolean) r1
                    boolean r1 = r1.booleanValue()
                    if (r1 != 0) goto L18
                    goto L39
                L18:
                    java.lang.String r1 = ".doubleclick.net"
                    java.lang.String r2 = ".googleadservices.com"
                    java.lang.String r3 = ".googlesyndication.com"
                    java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3}
                    android.net.Uri r2 = android.net.Uri.parse(r0)
                    java.lang.String r2 = r2.getHost()
                    r3 = 0
                L2b:
                    r4 = 3
                    if (r3 >= r4) goto L74
                    r4 = r1[r3]
                    boolean r4 = r2.endsWith(r4)
                    if (r4 != 0) goto L39
                    int r3 = r3 + 1
                    goto L2b
                L39:
                    com.google.android.gms.internal.ads.z4<java.lang.String> r1 = com.google.android.gms.internal.ads.k5.a
                    java.lang.Object r1 = r1.e()
                    java.lang.String r1 = (java.lang.String) r1
                    com.google.android.gms.internal.ads.z4<java.lang.String> r2 = com.google.android.gms.internal.ads.k5.f6957b
                    java.lang.Object r2 = r2.e()
                    java.lang.String r2 = (java.lang.String) r2
                    boolean r3 = android.text.TextUtils.isEmpty(r1)
                    if (r3 != 0) goto L53
                    java.lang.String r0 = r0.replace(r1, r6)
                L53:
                    boolean r1 = android.text.TextUtils.isEmpty(r2)
                    if (r1 != 0) goto L74
                    android.net.Uri r1 = android.net.Uri.parse(r0)
                    java.lang.String r3 = r1.getQueryParameter(r2)
                    boolean r3 = android.text.TextUtils.isEmpty(r3)
                    if (r3 == 0) goto L74
                    android.net.Uri$Builder r0 = r1.buildUpon()
                    android.net.Uri$Builder r6 = r0.appendQueryParameter(r2, r6)
                    java.lang.String r6 = r6.toString()
                    return r6
                L74:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j9.apply(java.lang.Object):java.lang.Object");
            }
        }, h52Var), Throwable.class, new x02(strB) { // from class: com.google.android.gms.internal.ads.k9
            private final String a;

            {
                this.a = strB;
            }

            @Override // com.google.android.gms.internal.ads.x02
            public final Object apply(Object obj) {
                String str2 = this.a;
                Throwable th = (Throwable) obj;
                ba<ew> baVar = aa.a;
                if (k5.f6965j.e().booleanValue()) {
                    zzs.zzg().g(th, "prepareClickUrl.attestation2");
                }
                return str2;
            }
        }, h52Var);
    }

    static final /* synthetic */ void b(hx hxVar, Map map) throws JSONException, URISyntaxException {
        PackageManager packageManager = hxVar.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                        String strOptString = jSONObject2.optString("id");
                        String strOptString2 = jSONObject2.optString("u");
                        String strOptString3 = jSONObject2.optString(IntegerTokenConverter.CONVERTER_KEY);
                        String strOptString4 = jSONObject2.optString("m");
                        String strOptString5 = jSONObject2.optString("p");
                        String strOptString6 = jSONObject2.optString("c");
                        String strOptString7 = jSONObject2.optString("intent_url");
                        Intent uri = null;
                        if (!TextUtils.isEmpty(strOptString7)) {
                            try {
                                uri = Intent.parseUri(strOptString7, 0);
                            } catch (URISyntaxException e2) {
                                String strValueOf = String.valueOf(strOptString7);
                                er.zzg(strValueOf.length() != 0 ? "Error parsing the url: ".concat(strValueOf) : new String("Error parsing the url: "), e2);
                            }
                        }
                        if (uri == null) {
                            uri = new Intent();
                            if (!TextUtils.isEmpty(strOptString2)) {
                                uri.setData(Uri.parse(strOptString2));
                            }
                            if (!TextUtils.isEmpty(strOptString3)) {
                                uri.setAction(strOptString3);
                            }
                            if (!TextUtils.isEmpty(strOptString4)) {
                                uri.setType(strOptString4);
                            }
                            if (!TextUtils.isEmpty(strOptString5)) {
                                uri.setPackage(strOptString5);
                            }
                            if (!TextUtils.isEmpty(strOptString6)) {
                                String[] strArrSplit = strOptString6.split("/", 2);
                                if (strArrSplit.length == 2) {
                                    uri.setComponent(new ComponentName(strArrSplit[0], strArrSplit[1]));
                                }
                            }
                        }
                        try {
                            jSONObject.put(strOptString, packageManager.resolveActivity(uri, 65536) != null);
                        } catch (JSONException e3) {
                            er.zzg("Error constructing openable urls response.", e3);
                        }
                    } catch (JSONException e4) {
                        er.zzg("Error parsing the intent data.", e4);
                    }
                }
                ((vc) hxVar).a("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((vc) hxVar).a("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((vc) hxVar).a("openableIntents", new JSONObject());
        }
    }
}