package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class su1 {
    private final b71 a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8987b;

    /* renamed from: c, reason: collision with root package name */
    private final String f8988c;

    /* renamed from: d, reason: collision with root package name */
    private final String f8989d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f8990e;

    /* renamed from: f, reason: collision with root package name */
    private final lp1 f8991f;

    /* renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f8992g;

    /* renamed from: h, reason: collision with root package name */
    private final ip2 f8993h;

    public su1(b71 b71Var, kr krVar, String str, String str2, Context context, lp1 lp1Var, com.google.android.gms.common.util.f fVar, ip2 ip2Var) {
        this.a = b71Var;
        this.f8987b = krVar.f7054e;
        this.f8988c = str;
        this.f8989d = str2;
        this.f8990e = context;
        this.f8991f = lp1Var;
        this.f8992g = fVar;
        this.f8993h = ip2Var;
    }

    public static final List<String> d(int i2, int i3, List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            StringBuilder sb = new StringBuilder(23);
            sb.append("2.");
            sb.append(i3);
            arrayList.add(e(str, "@gw_mpe@", sb.toString()));
        }
        return arrayList;
    }

    private static String e(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    private static String f(String str) {
        return (TextUtils.isEmpty(str) || !dr.j()) ? str : "fakeForAdDebugLog";
    }

    public final List<String> a(kp1 kp1Var, xo1 xo1Var, List<String> list) {
        return b(kp1Var, xo1Var, false, "", "", list);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<java.lang.String> b(com.google.android.gms.internal.ads.kp1 r8, com.google.android.gms.internal.ads.xo1 r9, boolean r10, java.lang.String r11, java.lang.String r12, java.util.List<java.lang.String> r13) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 1
            if (r1 == r10) goto Lb
            java.lang.String r10 = "0"
            goto Ld
        Lb:
            java.lang.String r10 = "1"
        Ld:
            java.util.Iterator r13 = r13.iterator()
        L11:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto Lca
            java.lang.Object r2 = r13.next()
            java.lang.String r2 = (java.lang.String) r2
            com.google.android.gms.internal.ads.gp1 r3 = r8.a
            com.google.android.gms.internal.ads.qp1 r3 = r3.a
            java.lang.String r3 = r3.f8429f
            java.lang.String r4 = "@gw_adlocid@"
            java.lang.String r2 = e(r2, r4, r3)
            java.lang.String r3 = "@gw_adnetrefresh@"
            java.lang.String r2 = e(r2, r3, r10)
            java.lang.String r3 = r7.f8987b
            java.lang.String r4 = "@gw_sdkver@"
            java.lang.String r2 = e(r2, r4, r3)
            if (r9 == 0) goto L59
            java.lang.String r3 = r9.x
            java.lang.String r4 = "@gw_qdata@"
            java.lang.String r2 = e(r2, r4, r3)
            java.lang.String r3 = r9.w
            java.lang.String r4 = "@gw_adnetid@"
            java.lang.String r2 = e(r2, r4, r3)
            java.lang.String r3 = r9.v
            java.lang.String r4 = "@gw_allocid@"
            java.lang.String r2 = e(r2, r4, r3)
            android.content.Context r3 = r7.f8990e
            boolean r4 = r9.Q
            java.lang.String r2 = com.google.android.gms.internal.ads.mp.a(r2, r3, r4)
        L59:
            com.google.android.gms.internal.ads.b71 r3 = r7.a
            java.lang.String r3 = r3.b()
            java.lang.String r4 = "@gw_adnetstatus@"
            java.lang.String r2 = e(r2, r4, r3)
            java.lang.String r3 = r7.f8988c
            java.lang.String r4 = "@gw_seqnum@"
            java.lang.String r2 = e(r2, r4, r3)
            java.lang.String r3 = r7.f8989d
            java.lang.String r4 = "@gw_sessid@"
            java.lang.String r2 = e(r2, r4, r3)
            com.google.android.gms.internal.ads.o3<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.w3.S1
            com.google.android.gms.internal.ads.u3 r4 = com.google.android.gms.internal.ads.c.c()
            java.lang.Object r3 = r4.b(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = 0
            if (r3 == 0) goto L8f
            boolean r3 = android.text.TextUtils.isEmpty(r11)
            if (r3 != 0) goto L8f
            r4 = 1
        L8f:
            boolean r3 = android.text.TextUtils.isEmpty(r12)
            r3 = r3 ^ r1
            if (r4 != 0) goto L99
            if (r3 == 0) goto Lc5
            r3 = 1
        L99:
            android.net.Uri r5 = android.net.Uri.parse(r2)
            com.google.android.gms.internal.ads.ip2 r6 = r7.f8993h
            boolean r5 = r6.a(r5)
            if (r5 == 0) goto Lc5
            android.net.Uri r2 = android.net.Uri.parse(r2)
            android.net.Uri$Builder r2 = r2.buildUpon()
            if (r4 == 0) goto Lb5
            java.lang.String r4 = "ms"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r4, r11)
        Lb5:
            if (r3 == 0) goto Lbd
            java.lang.String r3 = "attok"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r3, r12)
        Lbd:
            android.net.Uri r2 = r2.build()
            java.lang.String r2 = r2.toString()
        Lc5:
            r0.add(r2)
            goto L11
        Lca:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.su1.b(com.google.android.gms.internal.ads.kp1, com.google.android.gms.internal.ads.xo1, boolean, java.lang.String, java.lang.String, java.util.List):java.util.List");
    }

    public final List<String> c(xo1 xo1Var, List<String> list, gm gmVar) {
        ArrayList arrayList = new ArrayList();
        long jA = this.f8992g.a();
        try {
            String strZzb = gmVar.zzb();
            String string = Integer.toString(gmVar.zzc());
            lp1 lp1Var = this.f8991f;
            String strF = lp1Var == null ? "" : f(lp1Var.a);
            lp1 lp1Var2 = this.f8991f;
            String strF2 = lp1Var2 != null ? f(lp1Var2.f7291b) : "";
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(mp.a(e(e(e(e(e(e(it.next(), "@gw_rwd_userid@", Uri.encode(strF)), "@gw_rwd_custom_data@", Uri.encode(strF2)), "@gw_tmstmp@", Long.toString(jA)), "@gw_rwd_itm@", Uri.encode(strZzb)), "@gw_rwd_amt@", string), "@gw_sdkver@", this.f8987b), this.f8990e, xo1Var.Q));
            }
            return arrayList;
        } catch (RemoteException e2) {
            er.zzg("Unable to determine award type and amount.", e2);
            return arrayList;
        }
    }
}