package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class mh1 implements ah1<kh1> {
    private final h52 a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f7490b;

    public mh1(h52 h52Var, Context context) {
        this.a = h52Var;
        this.f7490b = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ com.google.android.gms.internal.ads.kh1 a() {
        /*
            r9 = this;
            android.content.Context r0 = r9.f7490b
            java.lang.String r1 = "phone"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r2 = r0.getNetworkOperator()
            boolean r1 = com.google.android.gms.common.util.n.l()
            r3 = 0
            if (r1 == 0) goto L29
            com.google.android.gms.internal.ads.o3<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.w3.D5
            com.google.android.gms.internal.ads.u3 r4 = com.google.android.gms.internal.ads.c.c()
            java.lang.Object r1 = r4.b(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L29
            r4 = 0
            goto L2e
        L29:
            int r1 = r0.getNetworkType()
            r4 = r1
        L2e:
            int r5 = r0.getPhoneType()
            com.google.android.gms.ads.internal.zzs.zzc()
            android.content.Context r0 = r9.f7490b
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r0 = com.google.android.gms.ads.internal.util.zzr.zzD(r0, r1)
            r1 = -1
            if (r0 == 0) goto L68
            android.content.Context r0 = r9.f7490b
            java.lang.String r3 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.NetworkInfo r3 = r0.getActiveNetworkInfo()
            if (r3 == 0) goto L60
            int r1 = r3.getType()
            android.net.NetworkInfo$DetailedState r3 = r3.getDetailedState()
            int r3 = r3.ordinal()
            r8 = r3
            r3 = r1
            r1 = r8
            goto L61
        L60:
            r3 = -1
        L61:
            boolean r0 = r0.isActiveNetworkMetered()
            r6 = r0
            r7 = r1
            goto L6c
        L68:
            r0 = -2
            r3 = -2
            r6 = 0
            r7 = -1
        L6c:
            com.google.android.gms.internal.ads.kh1 r0 = new com.google.android.gms.internal.ads.kh1
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mh1.a():com.google.android.gms.internal.ads.kh1");
    }

    @Override // com.google.android.gms.internal.ads.ah1
    public final g52<kh1> zza() {
        return this.a.N(new Callable(this) { // from class: com.google.android.gms.internal.ads.lh1
            private final mh1 a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.a();
            }
        });
    }
}