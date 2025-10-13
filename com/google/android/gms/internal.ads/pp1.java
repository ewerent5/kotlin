package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class pp1 {
    private m93 a;

    /* renamed from: b, reason: collision with root package name */
    private r93 f8218b;

    /* renamed from: c, reason: collision with root package name */
    private String f8219c;

    /* renamed from: d, reason: collision with root package name */
    private d3 f8220d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f8221e;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList<String> f8222f;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList<String> f8223g;

    /* renamed from: h, reason: collision with root package name */
    private g6 f8224h;

    /* renamed from: i, reason: collision with root package name */
    private y93 f8225i;

    /* renamed from: j, reason: collision with root package name */
    private AdManagerAdViewOptions f8226j;

    /* renamed from: k, reason: collision with root package name */
    private PublisherAdViewOptions f8227k;

    /* renamed from: l, reason: collision with root package name */
    private e0 f8228l;
    private jc n;
    private wa1 q;
    private i0 r;

    /* renamed from: m, reason: collision with root package name */
    private int f8229m = 1;
    private final ep1 o = new ep1();
    private boolean p = false;

    public final pp1 A(ArrayList<String> arrayList) {
        this.f8222f = arrayList;
        return this;
    }

    public final pp1 B(ArrayList<String> arrayList) {
        this.f8223g = arrayList;
        return this;
    }

    public final pp1 C(g6 g6Var) {
        this.f8224h = g6Var;
        return this;
    }

    public final pp1 D(y93 y93Var) {
        this.f8225i = y93Var;
        return this;
    }

    public final pp1 E(jc jcVar) {
        this.n = jcVar;
        this.f8220d = new d3(false, true, false);
        return this;
    }

    public final pp1 F(PublisherAdViewOptions publisherAdViewOptions) {
        this.f8227k = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.f8221e = publisherAdViewOptions.zza();
            this.f8228l = publisherAdViewOptions.zzb();
        }
        return this;
    }

    public final pp1 G(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.f8226j = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.f8221e = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
        return this;
    }

    public final pp1 H(wa1 wa1Var) {
        this.q = wa1Var;
        return this;
    }

    public final pp1 I(qp1 qp1Var) {
        this.o.a(qp1Var.o.a);
        this.a = qp1Var.f8427d;
        this.f8218b = qp1Var.f8428e;
        this.r = qp1Var.q;
        this.f8219c = qp1Var.f8429f;
        this.f8220d = qp1Var.a;
        this.f8222f = qp1Var.f8430g;
        this.f8223g = qp1Var.f8431h;
        this.f8224h = qp1Var.f8432i;
        this.f8225i = qp1Var.f8433j;
        G(qp1Var.f8435l);
        F(qp1Var.f8436m);
        this.p = qp1Var.p;
        this.q = qp1Var.f8426c;
        return this;
    }

    public final qp1 J() {
        com.google.android.gms.common.internal.p.k(this.f8219c, "ad unit must not be null");
        com.google.android.gms.common.internal.p.k(this.f8218b, "ad size must not be null");
        com.google.android.gms.common.internal.p.k(this.a, "ad request must not be null");
        return new qp1(this, null);
    }

    public final boolean K() {
        return this.p;
    }

    public final pp1 n(i0 i0Var) {
        this.r = i0Var;
        return this;
    }

    public final pp1 p(m93 m93Var) {
        this.a = m93Var;
        return this;
    }

    public final m93 q() {
        return this.a;
    }

    public final pp1 r(r93 r93Var) {
        this.f8218b = r93Var;
        return this;
    }

    public final pp1 s(boolean z) {
        this.p = z;
        return this;
    }

    public final r93 t() {
        return this.f8218b;
    }

    public final pp1 u(String str) {
        this.f8219c = str;
        return this;
    }

    public final String v() {
        return this.f8219c;
    }

    public final pp1 w(d3 d3Var) {
        this.f8220d = d3Var;
        return this;
    }

    public final ep1 x() {
        return this.o;
    }

    public final pp1 y(boolean z) {
        this.f8221e = z;
        return this;
    }

    public final pp1 z(int i2) {
        this.f8229m = i2;
        return this;
    }
}