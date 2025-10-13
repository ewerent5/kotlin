package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class fv1 {
    private final mv1 a;

    /* renamed from: b, reason: collision with root package name */
    private final WebView f5955b;

    /* renamed from: c, reason: collision with root package name */
    private final List<nv1> f5956c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, nv1> f5957d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final String f5958e = "";

    /* renamed from: f, reason: collision with root package name */
    private final String f5959f;

    /* renamed from: g, reason: collision with root package name */
    private final gv1 f5960g;

    private fv1(mv1 mv1Var, WebView webView, String str, List<nv1> list, String str2, String str3, gv1 gv1Var) {
        this.a = mv1Var;
        this.f5955b = webView;
        this.f5960g = gv1Var;
        this.f5959f = str2;
    }

    @Deprecated
    public static fv1 a(mv1 mv1Var, WebView webView, String str) {
        return new fv1(mv1Var, webView, null, null, null, "", gv1.HTML);
    }

    public static fv1 b(mv1 mv1Var, WebView webView, String str, String str2) {
        return new fv1(mv1Var, webView, null, null, str, "", gv1.HTML);
    }

    public static fv1 c(mv1 mv1Var, WebView webView, String str, String str2) {
        return new fv1(mv1Var, webView, null, null, str, "", gv1.JAVASCRIPT);
    }

    public final mv1 d() {
        return this.a;
    }

    public final List<nv1> e() {
        return Collections.unmodifiableList(this.f5956c);
    }

    public final Map<String, nv1> f() {
        return Collections.unmodifiableMap(this.f5957d);
    }

    public final WebView g() {
        return this.f5955b;
    }

    public final String h() {
        return this.f5959f;
    }

    public final String i() {
        return this.f5958e;
    }

    public final gv1 j() {
        return this.f5960g;
    }
}