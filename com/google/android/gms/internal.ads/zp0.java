package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zp0 extends n8 {

    /* renamed from: e, reason: collision with root package name */
    private final String f10622e;

    /* renamed from: f, reason: collision with root package name */
    private final ol0 f10623f;

    /* renamed from: g, reason: collision with root package name */
    private final tl0 f10624g;

    public zp0(String str, ol0 ol0Var, tl0 tl0Var) {
        this.f10622e = str;
        this.f10623f = ol0Var;
        this.f10624g = tl0Var;
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final void A1(w0 w0Var) {
        this.f10623f.K(w0Var);
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final void G3(Bundle bundle) {
        this.f10623f.y(bundle);
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final boolean T2(Bundle bundle) {
        return this.f10623f.z(bundle);
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final String a() {
        return this.f10622e;
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final List<?> f() {
        return zzA() ? this.f10624g.a() : Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final void g3(h1 h1Var) {
        this.f10623f.m(h1Var);
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final void l2(Bundle bundle) {
        this.f10623f.A(bundle);
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final k1 n() {
        if (((Boolean) c.c().b(w3.P4)).booleanValue()) {
            return this.f10623f.d();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final boolean q() {
        return this.f10623f.O();
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final void q0(l8 l8Var) {
        this.f10623f.I(l8Var);
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final void u3(s0 s0Var) {
        this.f10623f.L(s0Var);
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final boolean zzA() {
        return (this.f10624g.a().isEmpty() || this.f10624g.b() == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final void zzD() {
        this.f10623f.M();
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final void zzE() {
        this.f10623f.N();
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final q6 zzF() {
        return this.f10623f.l().a();
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final String zze() {
        return this.f10624g.b0();
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final List<?> zzf() {
        return this.f10624g.c0();
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final String zzg() {
        return this.f10624g.c();
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final t6 zzh() {
        return this.f10624g.k();
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final String zzi() {
        return this.f10624g.e();
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final String zzj() {
        return this.f10624g.l();
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final double zzk() {
        return this.f10624g.j();
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final String zzl() {
        return this.f10624g.h();
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final String zzm() {
        return this.f10624g.i();
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final n1 zzn() {
        return this.f10624g.Y();
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final void zzp() {
        this.f10623f.b();
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final l6 zzq() {
        return this.f10624g.Z();
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final e.c.b.b.b.b zzu() {
        return e.c.b.b.b.d.m4(this.f10623f);
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final e.c.b.b.b.b zzv() {
        return this.f10624g.g();
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final Bundle zzw() {
        return this.f10624g.d();
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final void zzy() {
        this.f10623f.J();
    }
}