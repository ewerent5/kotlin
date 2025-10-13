package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zzs;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class l20 implements u42<String> {
    final /* synthetic */ n20 a;

    l20(n20 n20Var) {
        this.a = n20Var;
    }

    @Override // com.google.android.gms.internal.ads.u42
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.u42
    public final /* bridge */ /* synthetic */ void zzb(String str) {
        String str2 = str;
        aq1 aq1Var = this.a.f7634k;
        List<String> listB = this.a.f7633j.b(this.a.f7631h, this.a.f7632i, false, "", str2, this.a.f7632i.f10198c);
        zzs.zzc();
        aq1Var.b(listB, true == zzr.zzH(this.a.f7628e) ? 2 : 1);
    }
}