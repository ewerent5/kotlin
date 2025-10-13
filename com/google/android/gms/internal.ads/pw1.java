package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class pw1 {
    private final HashMap<View, String> a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<View, ow1> f8277b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f8278c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<View> f8279d = new HashSet<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet<String> f8280e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet<String> f8281f = new HashSet<>();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f8282g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private boolean f8283h;

    public final HashSet<String> a() {
        return this.f8280e;
    }

    public final HashSet<String> b() {
        return this.f8281f;
    }

    public final String c(String str) {
        return this.f8282g.get(str);
    }

    public final void d() {
        tv1 tv1VarA = tv1.a();
        if (tv1VarA != null) {
            for (hv1 hv1Var : tv1VarA.f()) {
                View viewJ = hv1Var.j();
                if (hv1Var.k()) {
                    String strI = hv1Var.i();
                    if (viewJ != null) {
                        String str = null;
                        if (viewJ.hasWindowFocus()) {
                            HashSet hashSet = new HashSet();
                            View view = viewJ;
                            while (true) {
                                if (view == null) {
                                    this.f8279d.addAll(hashSet);
                                    break;
                                }
                                String strB = nw1.b(view);
                                if (strB != null) {
                                    str = strB;
                                    break;
                                } else {
                                    hashSet.add(view);
                                    Object parent = view.getParent();
                                    view = parent instanceof View ? (View) parent : null;
                                }
                            }
                        } else {
                            str = "noWindowFocus";
                        }
                        if (str == null) {
                            this.f8280e.add(strI);
                            this.a.put(viewJ, strI);
                            for (wv1 wv1Var : hv1Var.g()) {
                                View view2 = wv1Var.a().get();
                                if (view2 != null) {
                                    ow1 ow1Var = this.f8277b.get(view2);
                                    if (ow1Var != null) {
                                        ow1Var.a(hv1Var.i());
                                    } else {
                                        this.f8277b.put(view2, new ow1(wv1Var, hv1Var.i()));
                                    }
                                }
                            }
                        } else {
                            this.f8281f.add(strI);
                            this.f8278c.put(strI, viewJ);
                            this.f8282g.put(strI, str);
                        }
                    } else {
                        this.f8281f.add(strI);
                        this.f8282g.put(strI, "noAdView");
                    }
                }
            }
        }
    }

    public final void e() {
        this.a.clear();
        this.f8277b.clear();
        this.f8278c.clear();
        this.f8279d.clear();
        this.f8280e.clear();
        this.f8281f.clear();
        this.f8282g.clear();
        this.f8283h = false;
    }

    public final void f() {
        this.f8283h = true;
    }

    public final String g(View view) {
        if (this.a.size() == 0) {
            return null;
        }
        String str = this.a.get(view);
        if (str != null) {
            this.a.remove(view);
        }
        return str;
    }

    public final View h(String str) {
        return this.f8278c.get(str);
    }

    public final ow1 i(View view) {
        ow1 ow1Var = this.f8277b.get(view);
        if (ow1Var != null) {
            this.f8277b.remove(view);
        }
        return ow1Var;
    }

    public final int j(View view) {
        if (this.f8279d.contains(view)) {
            return 1;
        }
        return this.f8283h ? 2 : 3;
    }
}