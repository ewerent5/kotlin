package com.parizene.netmonitor.s0.c;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.parizene.netmonitor.h0;
import e.g.a.g;
import e.g.a.h;
import e.g.a.i;
import e.g.a.k;
import j$.time.Period;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PremiumHelper.java */
/* loaded from: classes3.dex */
public class c extends e.g.a.c {

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f13673d = {"remove_ads"};

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f13674e = {"premium_yearly_7.99"};

    /* renamed from: f, reason: collision with root package name */
    private final org.greenrobot.eventbus.c f13675f;

    /* renamed from: g, reason: collision with root package name */
    private final f.a<com.parizene.netmonitor.k0.e> f13676g;

    /* renamed from: h, reason: collision with root package name */
    private final f.a<com.google.firebase.crashlytics.c> f13677h;

    /* renamed from: i, reason: collision with root package name */
    private a f13678i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f13679j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f13680k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f13681l;

    /* renamed from: m, reason: collision with root package name */
    private String f13682m;
    private final Map<String, e> n;
    private final Map<String, e> o;

    public c(Context context, org.greenrobot.eventbus.c cVar, f.a<com.parizene.netmonitor.k0.e> aVar, f.a<com.google.firebase.crashlytics.c> aVar2) {
        super(context);
        this.f13678i = a.UNKNOWN;
        this.n = new HashMap();
        HashMap map = new HashMap();
        this.o = map;
        this.f13675f = cVar;
        this.f13676g = aVar;
        this.f13677h = aVar2;
        map.put("premium_yearly_7.99", new e(7990000L, "USD", h0.b(context, 7.99d, "USD"), Period.ofYears(1), Period.ofDays(3)));
    }

    private e s(k kVar, boolean z) {
        Period periodZ;
        Period period;
        if (!w(kVar, z) || (periodZ = z(kVar.f())) == null) {
            return null;
        }
        if (z) {
            Period periodZ2 = z(kVar.a());
            if (periodZ2 == null) {
                return null;
            }
            period = periodZ2;
        } else {
            period = null;
        }
        return new e(kVar.c(), kVar.d(), kVar.b(), periodZ, period);
    }

    private boolean v() {
        return this.f13679j || this.f13680k;
    }

    private boolean w(k kVar, boolean z) {
        return (kVar == null || !"subs".equals(kVar.g()) || kVar.c() <= 0 || TextUtils.isEmpty(kVar.d()) || TextUtils.isEmpty(kVar.b()) || TextUtils.isEmpty(kVar.f()) || (z && TextUtils.isEmpty(kVar.a()))) ? false : true;
    }

    private Period z(String str) {
        try {
            return Period.parse(str);
        } catch (Exception e2) {
            m.a.a.g(e2);
            return null;
        }
    }

    public void A() {
        super.o("LiYqSD0gQi45Nh8ifScHRyk+Kys1PiciLllpPiA2KjgMPy5sCTQ3DyBZBwU3PDIGOUsBMDlaOwcg\nKxwJHUchIyYaPwlKFyMmHxcPSgoJBxcxfQg9NigbJyosKAsyJlhoQVciHTciBTJWODUuBykbJQMb\nKBMkQmoiJR0+TT8XK3xYUgcpCQdRAiYUFQcoYSMMSj40HAs2elcLNQtdACwDXh0lPVlbQRM5HQ88\nCy12ODMeIggbAxsbGlAcN3cDLzhGLR0GNGc+CUYiIQY9O0Q6Dw08ZzQgIyg4\n", true, Arrays.asList(f13673d), Arrays.asList(f13674e));
    }

    @Override // e.g.a.f.InterfaceC0193f
    public void a(g gVar, h hVar) {
        if (gVar.b()) {
            this.f13678i = a.ERROR;
            this.f13675f.p(new b());
            m.a.a.f("onQueryInventoryFinished: operation failed, result=%s, inventory=%s", gVar, hVar);
            return;
        }
        i iVarD = hVar.d("remove_ads");
        m.a.a.a("onQueryInventoryFinished: removeAdsPurchase=%s, removeAdsDetails=%s", iVarD, hVar.e("remove_ads"));
        i iVarD2 = hVar.d("premium_yearly_7.99");
        k kVarE = hVar.e("premium_yearly_7.99");
        m.a.a.a("onQueryInventoryFinished: premiumYearlyPurchase=%s, premiumYearlyDetails=%s", iVarD2, kVarE);
        this.f13679j = iVarD != null && p(iVarD);
        if (iVarD2 == null || !iVarD2.e()) {
            this.f13681l = false;
            this.f13682m = null;
        } else {
            this.f13681l = true;
            this.f13682m = "premium_yearly_7.99";
        }
        this.f13680k = iVarD2 != null && p(iVarD2);
        m.a.a.b("onQueryInventoryFinished: mIsRemovedAdsPurchased=%s, mIsSubscriptionActive=%s, mIsSubscriptionAutoRenewing=%s, mActiveSubscriptionSku=%s", Boolean.valueOf(this.f13679j), Boolean.valueOf(this.f13680k), Boolean.valueOf(this.f13681l), this.f13682m);
        this.n.clear();
        e eVarS = s(kVarE, true);
        if (eVarS == null) {
            this.n.putAll(this.o);
            String str = "mIsRemovedAdsPurchased=" + this.f13679j + ", isSubscriptionsSupported=" + g() + ", mIsSubscriptionActive=" + this.f13680k + ", mIsSubscriptionAutoRenewing=" + this.f13681l + ", mActiveSubscriptionSku=" + this.f13682m + ", premiumYearlyDetails=" + kVarE;
            m.a.a.f("onQueryInventoryFinished: %s", str);
            this.f13677h.get().c(new Exception(str));
        } else {
            this.n.put("premium_yearly_7.99", eVarS);
        }
        this.f13678i = a.OK;
        this.f13675f.p(new b());
    }

    @Override // e.g.a.f.d
    public void b(g gVar, i iVar) {
        if (gVar.b() || iVar == null) {
            m.a.a.f("onIabPurchaseFinished: operation failed, result=%s, purchase=%s", gVar, iVar);
            return;
        }
        if (!p(iVar)) {
            m.a.a.f("onIabPurchaseFinished: verification failed", new Object[0]);
            return;
        }
        String strC = iVar.c();
        m.a.a.b("onIabPurchaseFinished: '%s' purchased", strC);
        if ("remove_ads".equals(strC)) {
            this.f13679j = true;
            this.f13678i = a.OK;
            this.f13675f.p(new b());
        } else if ("premium_yearly_7.99".equals(strC)) {
            this.f13680k = true;
            this.f13681l = iVar.e();
            this.f13682m = strC;
            this.f13678i = a.OK;
            this.f13675f.p(new b());
        }
        this.f13676g.get().a(com.parizene.netmonitor.k0.d.a(strC, iVar.b()));
    }

    @Override // e.g.a.c
    public void m(boolean z) {
        m.a.a.a("onIabSetupFinished: isSuccessful=%s", Boolean.valueOf(z));
        if (z) {
            return;
        }
        this.f13678i = a.ERROR;
        this.f13675f.p(new b());
    }

    public boolean r() {
        return this.f13678i == a.OK && !v() && g();
    }

    public a t() {
        return this.f13678i;
    }

    public e u() {
        return this.n.get("premium_yearly_7.99");
    }

    public boolean x() {
        return a.OK == t() && v();
    }

    public void y(Activity activity) {
        super.l(activity, "premium_yearly_7.99", "subs");
    }
}