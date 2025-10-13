package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.ads.internal.util.zzbk;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class so0 {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final eo0 f8943b;

    /* renamed from: c, reason: collision with root package name */
    private final ip2 f8944c;

    /* renamed from: d, reason: collision with root package name */
    private final kr f8945d;

    /* renamed from: e, reason: collision with root package name */
    private final zza f8946e;

    /* renamed from: f, reason: collision with root package name */
    private final w43 f8947f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f8948g;

    /* renamed from: h, reason: collision with root package name */
    private final g6 f8949h;

    /* renamed from: i, reason: collision with root package name */
    private final lp0 f8950i;

    /* renamed from: j, reason: collision with root package name */
    private final ScheduledExecutorService f8951j;

    public so0(Context context, eo0 eo0Var, ip2 ip2Var, kr krVar, zza zzaVar, w43 w43Var, Executor executor, qp1 qp1Var, lp0 lp0Var, ScheduledExecutorService scheduledExecutorService) {
        this.a = context;
        this.f8943b = eo0Var;
        this.f8944c = ip2Var;
        this.f8945d = krVar;
        this.f8946e = zzaVar;
        this.f8947f = w43Var;
        this.f8948g = executor;
        this.f8949h = qp1Var.f8432i;
        this.f8950i = lp0Var;
        this.f8951j = scheduledExecutorService;
    }

    public static final f2 g(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return n(jSONObjectOptJSONObject);
    }

    public static final List<f2> h(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject == null) {
            return b22.n();
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("reasons");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return b22.n();
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
            f2 f2VarN = n(jSONArrayOptJSONArray.optJSONObject(i2));
            if (f2VarN != null) {
                arrayList.add(f2VarN);
            }
        }
        return b22.t(arrayList);
    }

    private final g52<List<c6>> i(JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return y42.a(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.add(j(jSONArray.optJSONObject(i2), z));
        }
        return y42.i(y42.j(arrayList), ko0.a, this.f8948g);
    }

    private final g52<c6> j(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return y42.a(null);
        }
        final String strOptString = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString)) {
            return y42.a(null);
        }
        final double dOptDouble = jSONObject.optDouble("scale", 1.0d);
        boolean zOptBoolean = jSONObject.optBoolean("is_transparent", true);
        final int iOptInt = jSONObject.optInt("width", -1);
        final int iOptInt2 = jSONObject.optInt("height", -1);
        if (z) {
            return y42.a(new c6(null, Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2));
        }
        return m(jSONObject.optBoolean("require"), y42.i(this.f8943b.a(strOptString, dOptDouble, zOptBoolean), new x02(strOptString, dOptDouble, iOptInt, iOptInt2) { // from class: com.google.android.gms.internal.ads.lo0
            private final String a;

            /* renamed from: b, reason: collision with root package name */
            private final double f7278b;

            /* renamed from: c, reason: collision with root package name */
            private final int f7279c;

            /* renamed from: d, reason: collision with root package name */
            private final int f7280d;

            {
                this.a = strOptString;
                this.f7278b = dOptDouble;
                this.f7279c = iOptInt;
                this.f7280d = iOptInt2;
            }

            @Override // com.google.android.gms.internal.ads.x02
            public final Object apply(Object obj) {
                String str = this.a;
                return new c6(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(str), this.f7278b, this.f7279c, this.f7280d);
            }
        }, this.f8948g), null);
    }

    private static Integer k(JSONObject jSONObject, String str) throws JSONException {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static <T> g52<T> l(g52<T> g52Var, T t) {
        final Object obj = null;
        return y42.f(g52Var, Exception.class, new e42(obj) { // from class: com.google.android.gms.internal.ads.po0
            @Override // com.google.android.gms.internal.ads.e42
            public final g52 zza(Object obj2) {
                zze.zzb("Error during loading assets.", (Exception) obj2);
                return y42.a(null);
            }
        }, qr.f8451f);
    }

    private static <T> g52<T> m(boolean z, final g52<T> g52Var, T t) {
        return z ? y42.h(g52Var, new e42(g52Var) { // from class: com.google.android.gms.internal.ads.qo0
            private final g52 a;

            {
                this.a = g52Var;
            }

            @Override // com.google.android.gms.internal.ads.e42
            public final g52 zza(Object obj) {
                return obj != null ? this.a : y42.b(new e71(1, "Retrieve required value in native ad response failed."));
            }
        }, qr.f8451f) : l(g52Var, null);
    }

    private static final f2 n(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("reason");
        String strOptString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return null;
        }
        return new f2(strOptString, strOptString2);
    }

    public final g52<c6> a(JSONObject jSONObject, String str) {
        return j(jSONObject.optJSONObject(str), this.f8949h.f6058f);
    }

    public final g52<List<c6>> b(JSONObject jSONObject, String str) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        g6 g6Var = this.f8949h;
        return i(jSONArrayOptJSONArray, g6Var.f6058f, g6Var.f6060h);
    }

    public final g52<z5> c(JSONObject jSONObject, String str) {
        final JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("attribution");
        if (jSONObjectOptJSONObject == null) {
            return y42.a(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("images");
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("image");
        if (jSONArrayOptJSONArray == null && jSONObjectOptJSONObject2 != null) {
            jSONArrayOptJSONArray = new JSONArray();
            jSONArrayOptJSONArray.put(jSONObjectOptJSONObject2);
        }
        return m(jSONObjectOptJSONObject.optBoolean("require"), y42.i(i(jSONArrayOptJSONArray, false, true), new x02(this, jSONObjectOptJSONObject) { // from class: com.google.android.gms.internal.ads.mo0
            private final so0 a;

            /* renamed from: b, reason: collision with root package name */
            private final JSONObject f7518b;

            {
                this.a = this;
                this.f7518b = jSONObjectOptJSONObject;
            }

            @Override // com.google.android.gms.internal.ads.x02
            public final Object apply(Object obj) {
                return this.a.f(this.f7518b, (List) obj);
            }
        }, this.f8948g), null);
    }

    public final g52<ew> d(JSONObject jSONObject) {
        JSONObject jSONObjectZzh = zzbk.zzh(jSONObject, "html_containers", "instream");
        if (jSONObjectZzh != null) {
            final g52<ew> g52VarB = this.f8950i.b(jSONObjectZzh.optString("base_url"), jSONObjectZzh.optString("html"));
            return y42.h(g52VarB, new e42(g52VarB) { // from class: com.google.android.gms.internal.ads.oo0
                private final g52 a;

                {
                    this.a = g52VarB;
                }

                @Override // com.google.android.gms.internal.ads.e42
                public final g52 zza(Object obj) throws e71 {
                    g52 g52Var = this.a;
                    ew ewVar = (ew) obj;
                    if (ewVar == null || ewVar.zzh() == null) {
                        throw new e71(1, "Retrieve video view in instream ad response failed.");
                    }
                    return g52Var;
                }
            }, qr.f8451f);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("video");
        if (jSONObjectOptJSONObject == null) {
            return y42.a(null);
        }
        if (TextUtils.isEmpty(jSONObjectOptJSONObject.optString("vast_xml"))) {
            er.zzi("Required field 'vast_xml' is missing");
            return y42.a(null);
        }
        return l(y42.g(this.f8950i.a(jSONObjectOptJSONObject), ((Integer) c.c().b(w3.a2)).intValue(), TimeUnit.SECONDS, this.f8951j), null);
    }

    final /* synthetic */ g52 e(String str, Object obj) throws pw {
        zzs.zzd();
        ew ewVarA = qw.a(this.a, vx.b(), "native-omid", false, false, this.f8944c, null, this.f8945d, null, null, this.f8946e, this.f8947f, null, null);
        final vr vrVarB = vr.b(ewVarA);
        ewVarA.E0().i0(new rx(vrVarB) { // from class: com.google.android.gms.internal.ads.ro0

            /* renamed from: e, reason: collision with root package name */
            private final vr f8696e;

            {
                this.f8696e = vrVarB;
            }

            @Override // com.google.android.gms.internal.ads.rx
            public final void zza(boolean z) {
                this.f8696e.c();
            }
        });
        ewVarA.loadData(str, "text/html", "UTF-8");
        return vrVarB;
    }

    final /* synthetic */ z5 f(JSONObject jSONObject, List list) throws JSONException {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String strOptString = jSONObject.optString("text");
        Integer numK = k(jSONObject, "bg_color");
        Integer numK2 = k(jSONObject, "text_color");
        int iOptInt = jSONObject.optInt("text_size", -1);
        boolean zOptBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int iOptInt2 = jSONObject.optInt("animation_ms", CoreConstants.MILLIS_IN_ONE_SECOND);
        return new z5(strOptString, list, numK, numK2, iOptInt > 0 ? Integer.valueOf(iOptInt) : null, jSONObject.optInt("presentation_ms", 4000) + iOptInt2, this.f8949h.f6061i, zOptBoolean);
    }
}