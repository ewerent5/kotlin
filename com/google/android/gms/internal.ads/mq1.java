package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.util.zzap;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class mq1 {
    public static g93 a(Throwable th) {
        if (th instanceof o31) {
            o31 o31Var = (o31) th;
            return c(o31Var.a(), o31Var.b());
        }
        if (th instanceof tx0) {
            return th.getMessage() == null ? d(((tx0) th).a(), null, null) : d(((tx0) th).a(), th.getMessage(), null);
        }
        if (!(th instanceof zzap)) {
            return d(1, null, null);
        }
        zzap zzapVar = (zzap) th;
        return new g93(zzapVar.zza(), o12.a(zzapVar.getMessage()), MobileAds.ERROR_DOMAIN, null, null);
    }

    public static g93 b(Throwable th, p31 p31Var) {
        g93 g93Var;
        g93 g93VarA = a(th);
        int i2 = g93VarA.f6091e;
        if ((i2 == 3 || i2 == 0) && (g93Var = g93VarA.f6094h) != null && !g93Var.f6093g.equals(MobileAds.ERROR_DOMAIN)) {
            g93VarA.f6094h = null;
        }
        if (((Boolean) c.c().b(w3.x5)).booleanValue() && p31Var != null) {
            g93VarA.f6095i = p31Var.c();
        }
        return g93VarA;
    }

    public static g93 c(int i2, g93 g93Var) {
        if (i2 == 0) {
            throw null;
        }
        if (i2 == 8) {
            if (((Integer) c.c().b(w3.u5)).intValue() > 0) {
                return g93Var;
            }
            i2 = 8;
        }
        return d(i2, null, g93Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.g93 d(int r8, java.lang.String r9, com.google.android.gms.internal.ads.g93 r10) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mq1.d(int, java.lang.String, com.google.android.gms.internal.ads.g93):com.google.android.gms.internal.ads.g93");
    }
}