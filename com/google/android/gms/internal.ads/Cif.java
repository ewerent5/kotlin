package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* renamed from: com.google.android.gms.internal.ads.if, reason: invalid class name */
/* loaded from: classes.dex */
public final class Cif extends wx {

    /* renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.measurement.a.a f6530e;

    Cif(com.google.android.gms.measurement.a.a aVar) {
        this.f6530e = aVar;
    }

    @Override // com.google.android.gms.internal.ads.xx
    public final void D(Bundle bundle) {
        this.f6530e.s(bundle);
    }

    @Override // com.google.android.gms.internal.ads.xx
    public final void D1(String str, String str2, Bundle bundle) {
        this.f6530e.b(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.xx
    public final void E(String str, String str2, Bundle bundle) {
        this.f6530e.n(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.xx
    public final void J(String str) {
        this.f6530e.a(str);
    }

    @Override // com.google.android.gms.internal.ads.xx
    public final List M2(String str, String str2) {
        return this.f6530e.g(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.xx
    public final void S(String str) {
        this.f6530e.c(str);
    }

    @Override // com.google.android.gms.internal.ads.xx
    public final void Y2(Bundle bundle) {
        this.f6530e.o(bundle);
    }

    @Override // com.google.android.gms.internal.ads.xx
    public final void f1(String str, String str2, e.c.b.b.b.b bVar) {
        this.f6530e.u(str, str2, bVar != null ? e.c.b.b.b.d.Y(bVar) : null);
    }

    @Override // com.google.android.gms.internal.ads.xx
    public final Map n3(String str, String str2, boolean z) {
        return this.f6530e.m(str, str2, z);
    }

    @Override // com.google.android.gms.internal.ads.xx
    public final Bundle q2(Bundle bundle) {
        return this.f6530e.p(bundle);
    }

    @Override // com.google.android.gms.internal.ads.xx
    public final int u(String str) {
        return this.f6530e.l(str);
    }

    @Override // com.google.android.gms.internal.ads.xx
    public final void z1(e.c.b.b.b.b bVar, String str, String str2) {
        this.f6530e.t(bVar != null ? (Activity) e.c.b.b.b.d.Y(bVar) : null, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.xx
    public final void zzh(Bundle bundle) {
        this.f6530e.r(bundle);
    }

    @Override // com.google.android.gms.internal.ads.xx
    public final String zzk() {
        return this.f6530e.f();
    }

    @Override // com.google.android.gms.internal.ads.xx
    public final String zzl() {
        return this.f6530e.j();
    }

    @Override // com.google.android.gms.internal.ads.xx
    public final long zzm() {
        return this.f6530e.d();
    }

    @Override // com.google.android.gms.internal.ads.xx
    public final String zzr() {
        return this.f6530e.i();
    }

    @Override // com.google.android.gms.internal.ads.xx
    public final String zzs() {
        return this.f6530e.h();
    }

    @Override // com.google.android.gms.internal.ads.xx
    public final String zzt() {
        return this.f6530e.e();
    }
}