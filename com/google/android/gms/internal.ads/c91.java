package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class c91 implements zzf {
    final /* synthetic */ wr a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kp1 f5296b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ xo1 f5297c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ i91 f5298d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ d91 f5299e;

    c91(d91 d91Var, wr wrVar, kp1 kp1Var, xo1 xo1Var, i91 i91Var) {
        this.f5299e = d91Var;
        this.a = wrVar;
        this.f5296b = kp1Var;
        this.f5297c = xo1Var;
        this.f5298d = i91Var;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zza(View view) {
        this.a.zzc(this.f5299e.f5450d.a(this.f5296b, this.f5297c, view, this.f5298d));
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
    }
}