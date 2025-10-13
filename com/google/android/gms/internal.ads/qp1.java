package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.util.zzr;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class qp1 {
    public final d3 a;

    /* renamed from: b, reason: collision with root package name */
    public final jc f8425b;

    /* renamed from: c, reason: collision with root package name */
    public final wa1 f8426c;

    /* renamed from: d, reason: collision with root package name */
    public final m93 f8427d;

    /* renamed from: e, reason: collision with root package name */
    public final r93 f8428e;

    /* renamed from: f, reason: collision with root package name */
    public final String f8429f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList<String> f8430g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList<String> f8431h;

    /* renamed from: i, reason: collision with root package name */
    public final g6 f8432i;

    /* renamed from: j, reason: collision with root package name */
    public final y93 f8433j;

    /* renamed from: k, reason: collision with root package name */
    public final int f8434k;

    /* renamed from: l, reason: collision with root package name */
    public final AdManagerAdViewOptions f8435l;

    /* renamed from: m, reason: collision with root package name */
    public final PublisherAdViewOptions f8436m;
    public final e0 n;
    public final fp1 o;
    public final boolean p;
    public final i0 q;

    /* synthetic */ qp1(pp1 pp1Var, op1 op1Var) {
        this.f8428e = pp1Var.f8218b;
        this.f8429f = pp1Var.f8219c;
        this.q = pp1Var.r;
        int i2 = pp1Var.a.f7443e;
        long j2 = pp1Var.a.f7444f;
        Bundle bundle = pp1Var.a.f7445g;
        int i3 = pp1Var.a.f7446h;
        List<String> list = pp1Var.a.f7447i;
        boolean z = pp1Var.a.f7448j;
        int i4 = pp1Var.a.f7449k;
        boolean z2 = true;
        if (!pp1Var.a.f7450l && !pp1Var.f8221e) {
            z2 = false;
        }
        this.f8427d = new m93(i2, j2, bundle, i3, list, z, i4, z2, pp1Var.a.f7451m, pp1Var.a.n, pp1Var.a.o, pp1Var.a.p, pp1Var.a.q, pp1Var.a.r, pp1Var.a.s, pp1Var.a.t, pp1Var.a.u, pp1Var.a.v, pp1Var.a.w, pp1Var.a.x, pp1Var.a.y, pp1Var.a.z, zzr.zza(pp1Var.a.A));
        this.a = pp1Var.f8220d != null ? pp1Var.f8220d : pp1Var.f8224h != null ? pp1Var.f8224h.f6062j : null;
        this.f8430g = pp1Var.f8222f;
        this.f8431h = pp1Var.f8223g;
        this.f8432i = pp1Var.f8222f == null ? null : pp1Var.f8224h == null ? new g6(new NativeAdOptions.Builder().build()) : pp1Var.f8224h;
        this.f8433j = pp1Var.f8225i;
        this.f8434k = pp1Var.f8229m;
        this.f8435l = pp1Var.f8226j;
        this.f8436m = pp1Var.f8227k;
        this.n = pp1Var.f8228l;
        this.f8425b = pp1Var.n;
        this.o = new fp1(pp1Var.o, null);
        this.p = pp1Var.p;
        this.f8426c = pp1Var.q;
    }

    public final h8 a() {
        PublisherAdViewOptions publisherAdViewOptions = this.f8436m;
        if (publisherAdViewOptions == null && this.f8435l == null) {
            return null;
        }
        return publisherAdViewOptions != null ? publisherAdViewOptions.zzc() : this.f8435l.zza();
    }
}