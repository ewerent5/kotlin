package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zzs;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class yp1 implements u42<String> {
    final /* synthetic */ ew a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ vu1 f10463b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ x21 f10464c;

    yp1(ew ewVar, vu1 vu1Var, x21 x21Var) {
        this.a = ewVar;
        this.f10463b = vu1Var;
        this.f10464c = x21Var;
    }

    @Override // com.google.android.gms.internal.ads.u42
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.u42
    public final /* bridge */ /* synthetic */ void zzb(String str) {
        String str2 = str;
        if (!this.a.zzF().d0) {
            this.f10463b.b(str2);
            return;
        }
        long jA = zzs.zzj().a();
        String str3 = this.a.j().f4967b;
        zzs.zzc();
        this.f10464c.i(new z21(jA, str3, str2, true == zzr.zzH(this.a.getContext()) ? 2 : 1));
    }
}