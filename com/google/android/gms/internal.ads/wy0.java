package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class wy0 implements u42<kp1> {
    final /* synthetic */ xy0 a;

    wy0(xy0 xy0Var) {
        this.a = xy0Var;
    }

    @Override // com.google.android.gms.internal.ads.u42
    public final void zza(Throwable th) {
        if (((Boolean) c.c().b(w3.o4)).booleanValue()) {
            Matcher matcher = xy0.a.matcher(th.getMessage());
            if (matcher.matches()) {
                this.a.f10310f.a(Integer.parseInt(matcher.group(1)));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.u42
    public final /* bridge */ /* synthetic */ void zzb(kp1 kp1Var) {
        kp1 kp1Var2 = kp1Var;
        if (((Boolean) c.c().b(w3.o4)).booleanValue()) {
            this.a.f10310f.a(kp1Var2.f7035b.f6562b.f4970e);
            this.a.f10310f.c(kp1Var2.f7035b.f6562b.f4971f);
        }
    }
}