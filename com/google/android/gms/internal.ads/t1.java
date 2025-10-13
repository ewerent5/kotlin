package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.query.AdInfo;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class t1 {

    /* renamed from: g, reason: collision with root package name */
    private Date f9052g;

    /* renamed from: h, reason: collision with root package name */
    private String f9053h;

    /* renamed from: k, reason: collision with root package name */
    private Location f9056k;

    /* renamed from: l, reason: collision with root package name */
    private String f9057l;

    /* renamed from: m, reason: collision with root package name */
    private String f9058m;
    private boolean o;
    private AdInfo p;
    private final HashSet<String> a = new HashSet<>();

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f9047b = new Bundle();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<Class<? extends NetworkExtras>, NetworkExtras> f9048c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<String> f9049d = new HashSet<>();

    /* renamed from: e, reason: collision with root package name */
    private final Bundle f9050e = new Bundle();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet<String> f9051f = new HashSet<>();

    /* renamed from: i, reason: collision with root package name */
    private final List<String> f9054i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private int f9055j = -1;
    private int n = -1;
    private int q = CoreConstants.MILLIS_IN_ONE_MINUTE;

    @Deprecated
    public final void A(boolean z) {
        this.o = z;
    }

    public final void B(AdInfo adInfo) {
        this.p = adInfo;
    }

    public final void C(int i2) {
        this.q = i2;
    }

    public final void k(String str) {
        this.a.add(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public final void l(NetworkExtras networkExtras) {
        if (networkExtras instanceof AdMobExtras) {
            m(AdMobAdapter.class, ((AdMobExtras) networkExtras).getExtras());
        } else {
            this.f9048c.put(networkExtras.getClass(), networkExtras);
        }
    }

    public final void m(Class<? extends MediationExtrasReceiver> cls, Bundle bundle) {
        this.f9047b.putBundle(cls.getName(), bundle);
    }

    public final void n(Class<? extends CustomEvent> cls, Bundle bundle) {
        if (this.f9047b.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
            this.f9047b.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
        }
        Bundle bundle2 = this.f9047b.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        com.google.android.gms.common.internal.p.j(bundle2);
        bundle2.putBundle(cls.getName(), bundle);
    }

    public final void o(String str) {
        this.f9049d.add(str);
    }

    public final void p(String str) {
        this.f9049d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    @Deprecated
    public final void q(Date date) {
        this.f9052g = date;
    }

    public final void r(String str) {
        this.f9053h = str;
    }

    public final void s(List<String> list) {
        this.f9054i.clear();
        for (String str : list) {
            if (TextUtils.isEmpty(str)) {
                er.zzi("neighboring content URL should not be null or empty");
            } else {
                this.f9054i.add(str);
            }
        }
    }

    @Deprecated
    public final void t(int i2) {
        this.f9055j = i2;
    }

    public final void u(Location location) {
        this.f9056k = location;
    }

    public final void v(String str) {
        this.f9057l = str;
    }

    public final void w(String str) {
        this.f9058m = str;
    }

    @Deprecated
    public final void x(boolean z) {
        this.n = z ? 1 : 0;
    }

    public final void y(String str, String str2) {
        this.f9050e.putString(str, str2);
    }

    public final void z(String str) {
        this.f9051f.add(str);
    }
}