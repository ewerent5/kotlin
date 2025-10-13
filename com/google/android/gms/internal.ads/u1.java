package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class u1 {
    private final Date a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9335b;

    /* renamed from: c, reason: collision with root package name */
    private final List<String> f9336c;

    /* renamed from: d, reason: collision with root package name */
    private final int f9337d;

    /* renamed from: e, reason: collision with root package name */
    private final Set<String> f9338e;

    /* renamed from: f, reason: collision with root package name */
    private final Location f9339f;

    /* renamed from: g, reason: collision with root package name */
    private final Bundle f9340g;

    /* renamed from: h, reason: collision with root package name */
    private final Map<Class<? extends NetworkExtras>, NetworkExtras> f9341h;

    /* renamed from: i, reason: collision with root package name */
    private final String f9342i;

    /* renamed from: j, reason: collision with root package name */
    private final String f9343j;

    /* renamed from: k, reason: collision with root package name */
    @NotOnlyInitialized
    private final SearchAdRequest f9344k;

    /* renamed from: l, reason: collision with root package name */
    private final int f9345l;

    /* renamed from: m, reason: collision with root package name */
    private final Set<String> f9346m;
    private final Bundle n;
    private final Set<String> o;
    private final boolean p;
    private final AdInfo q;
    private final int r;

    public u1(t1 t1Var, SearchAdRequest searchAdRequest) {
        this.a = t1Var.f9052g;
        this.f9335b = t1Var.f9053h;
        this.f9336c = t1Var.f9054i;
        this.f9337d = t1Var.f9055j;
        this.f9338e = Collections.unmodifiableSet(t1Var.a);
        this.f9339f = t1Var.f9056k;
        this.f9340g = t1Var.f9047b;
        this.f9341h = Collections.unmodifiableMap(t1Var.f9048c);
        this.f9342i = t1Var.f9057l;
        this.f9343j = t1Var.f9058m;
        this.f9344k = searchAdRequest;
        this.f9345l = t1Var.n;
        this.f9346m = Collections.unmodifiableSet(t1Var.f9049d);
        this.n = t1Var.f9050e;
        this.o = Collections.unmodifiableSet(t1Var.f9051f);
        this.p = t1Var.o;
        this.q = t1Var.p;
        this.r = t1Var.q;
    }

    @Deprecated
    public final Date a() {
        return this.a;
    }

    public final String b() {
        return this.f9335b;
    }

    public final List<String> c() {
        return new ArrayList(this.f9336c);
    }

    @Deprecated
    public final int d() {
        return this.f9337d;
    }

    public final Set<String> e() {
        return this.f9338e;
    }

    public final Location f() {
        return this.f9339f;
    }

    @Deprecated
    public final <T extends NetworkExtras> T g(Class<T> cls) {
        return (T) this.f9341h.get(cls);
    }

    public final Bundle h(Class<? extends MediationExtrasReceiver> cls) {
        return this.f9340g.getBundle(cls.getName());
    }

    public final Bundle i(Class<? extends CustomEvent> cls) {
        Bundle bundle = this.f9340g.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        if (bundle != null) {
            return bundle.getBundle(cls.getName());
        }
        return null;
    }

    public final String j() {
        return this.f9342i;
    }

    public final String k() {
        return this.f9343j;
    }

    public final SearchAdRequest l() {
        return this.f9344k;
    }

    public final boolean m(Context context) {
        RequestConfiguration requestConfigurationM = c2.a().m();
        ta3.a();
        String strT = xq.t(context);
        return this.f9346m.contains(strT) || requestConfigurationM.getTestDeviceIds().contains(strT);
    }

    public final Map<Class<? extends NetworkExtras>, NetworkExtras> n() {
        return this.f9341h;
    }

    public final Bundle o() {
        return this.f9340g;
    }

    public final int p() {
        return this.f9345l;
    }

    public final Bundle q() {
        return this.n;
    }

    public final Set<String> r() {
        return this.o;
    }

    @Deprecated
    public final boolean s() {
        return this.p;
    }

    public final AdInfo t() {
        return this.q;
    }

    public final int u() {
        return this.r;
    }
}