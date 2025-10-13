package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzs;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class sq implements p23 {

    /* renamed from: b, reason: collision with root package name */
    private final zzg f8959b;

    /* renamed from: d, reason: collision with root package name */
    final pq f8961d;
    private final Object a = new Object();

    /* renamed from: e, reason: collision with root package name */
    final HashSet<jq> f8962e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    final HashSet<rq> f8963f = new HashSet<>();

    /* renamed from: g, reason: collision with root package name */
    private boolean f8964g = false;

    /* renamed from: c, reason: collision with root package name */
    private final qq f8960c = new qq();

    public sq(String str, zzg zzgVar) {
        this.f8961d = new pq(str, zzgVar);
        this.f8959b = zzgVar;
    }

    public final void a(jq jqVar) {
        synchronized (this.a) {
            this.f8962e.add(jqVar);
        }
    }

    public final void b(HashSet<jq> hashSet) {
        synchronized (this.a) {
            this.f8962e.addAll(hashSet);
        }
    }

    public final void c() {
        synchronized (this.a) {
            this.f8961d.a();
        }
    }

    public final void d() {
        synchronized (this.a) {
            this.f8961d.b();
        }
    }

    public final void e(m93 m93Var, long j2) {
        synchronized (this.a) {
            this.f8961d.c(m93Var, j2);
        }
    }

    public final void f() {
        synchronized (this.a) {
            this.f8961d.d();
        }
    }

    public final jq g(com.google.android.gms.common.util.f fVar, String str) {
        return new jq(fVar, this, this.f8960c.a(), str);
    }

    public final boolean h() {
        return this.f8964g;
    }

    public final Bundle i(Context context, rq1 rq1Var) {
        HashSet<jq> hashSet = new HashSet<>();
        synchronized (this.a) {
            hashSet.addAll(this.f8962e);
            this.f8962e.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.f8961d.e(context, this.f8960c.b()));
        Bundle bundle2 = new Bundle();
        Iterator<rq> it = this.f8963f.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
        bundle.putBundle("slots", bundle2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator<jq> it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().h());
        }
        bundle.putParcelableArrayList("ads", arrayList);
        rq1Var.a(hashSet);
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.p23
    public final void zza(boolean z) {
        long jA = zzs.zzj().a();
        if (!z) {
            this.f8959b.zzp(jA);
            this.f8959b.zzr(this.f8961d.f8232d);
            return;
        }
        if (jA - this.f8959b.zzq() > ((Long) c.c().b(w3.E0)).longValue()) {
            this.f8961d.f8232d = -1;
        } else {
            this.f8961d.f8232d = this.f8959b.zzs();
        }
        this.f8964g = true;
    }
}