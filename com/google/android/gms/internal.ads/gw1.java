package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public class gw1 {
    private fx1 a;

    /* renamed from: b, reason: collision with root package name */
    private long f6213b;

    /* renamed from: c, reason: collision with root package name */
    private int f6214c;

    public gw1() {
        k();
        this.a = new fx1(null);
    }

    public void a() {
    }

    public void b() {
        this.a.clear();
    }

    final void c(WebView webView) {
        this.a = new fx1(webView);
    }

    public final WebView d() {
        return this.a.get();
    }

    public final boolean e() {
        return this.a.get() != null;
    }

    public final void f(String str, long j2) {
        if (j2 >= this.f6213b) {
            this.f6214c = 2;
            zv1.a().e(d(), str);
        }
    }

    public final void g(String str, long j2) {
        if (j2 < this.f6213b || this.f6214c == 3) {
            return;
        }
        this.f6214c = 3;
        zv1.a().e(d(), str);
    }

    public void h(hv1 hv1Var, fv1 fv1Var) throws JSONException {
        i(hv1Var, fv1Var, null);
    }

    protected final void i(hv1 hv1Var, fv1 fv1Var, JSONObject jSONObject) throws JSONException {
        String strI = hv1Var.i();
        JSONObject jSONObject2 = new JSONObject();
        kw1.c(jSONObject2, "environment", "app");
        kw1.c(jSONObject2, "adSessionType", fv1Var.j());
        JSONObject jSONObject3 = new JSONObject();
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("; ");
        sb.append(str2);
        kw1.c(jSONObject3, "deviceType", sb.toString());
        kw1.c(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        kw1.c(jSONObject3, "os", "Android");
        kw1.c(jSONObject2, "deviceInfo", jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        kw1.c(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        kw1.c(jSONObject4, "partnerName", fv1Var.d().b());
        kw1.c(jSONObject4, "partnerVersion", fv1Var.d().c());
        kw1.c(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        kw1.c(jSONObject5, "libraryVersion", "1.3.3-google_20200416");
        kw1.c(jSONObject5, "appId", xv1.a().b().getApplicationContext().getPackageName());
        kw1.c(jSONObject2, "app", jSONObject5);
        if (fv1Var.h() != null) {
            kw1.c(jSONObject2, "contentUrl", fv1Var.h());
        }
        kw1.c(jSONObject2, "customReferenceData", fv1Var.i());
        JSONObject jSONObject6 = new JSONObject();
        Iterator<nv1> it = fv1Var.e().iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
        zv1.a().c(d(), strI, jSONObject2, jSONObject6, jSONObject);
    }

    public final void j(float f2) {
        zv1.a().f(d(), f2);
    }

    public final void k() {
        this.f6213b = System.nanoTime();
        this.f6214c = 1;
    }
}