package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzs;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class nw implements p12 {
    private final Context a;

    /* renamed from: b */
    private final vx f7807b;

    /* renamed from: c */
    private final String f7808c;

    /* renamed from: d */
    private final boolean f7809d;

    /* renamed from: e */
    private final boolean f7810e;

    /* renamed from: f */
    private final ip2 f7811f;

    /* renamed from: g */
    private final w4 f7812g;

    /* renamed from: h */
    private final kr f7813h;

    /* renamed from: i */
    private final zzl f7814i;

    /* renamed from: j */
    private final zza f7815j;

    /* renamed from: k */
    private final w43 f7816k;

    /* renamed from: l */
    private final xo1 f7817l;

    /* renamed from: m */
    private final ap1 f7818m;

    nw(Context context, vx vxVar, String str, boolean z, boolean z2, ip2 ip2Var, w4 w4Var, kr krVar, m4 m4Var, zzl zzlVar, zza zzaVar, w43 w43Var, xo1 xo1Var, ap1 ap1Var) {
        this.a = context;
        this.f7807b = vxVar;
        this.f7808c = str;
        this.f7809d = z;
        this.f7810e = z2;
        this.f7811f = ip2Var;
        this.f7812g = w4Var;
        this.f7813h = krVar;
        this.f7814i = zzlVar;
        this.f7815j = zzaVar;
        this.f7816k = w43Var;
        this.f7817l = xo1Var;
        this.f7818m = ap1Var;
    }

    @Override // com.google.android.gms.internal.ads.p12
    public final Object zza() {
        Context context = this.a;
        vx vxVar = this.f7807b;
        String str = this.f7808c;
        boolean z = this.f7809d;
        boolean z2 = this.f7810e;
        ip2 ip2Var = this.f7811f;
        w4 w4Var = this.f7812g;
        kr krVar = this.f7813h;
        zzl zzlVar = this.f7814i;
        zza zzaVar = this.f7815j;
        w43 w43Var = this.f7816k;
        xo1 xo1Var = this.f7817l;
        ap1 ap1Var = this.f7818m;
        try {
            TrafficStats.setThreadStatsTag(264);
            int i2 = xw.f10280e;
            tw twVar = new tw(new xw(new ux(context), vxVar, str, z, z2, ip2Var, w4Var, krVar, null, zzlVar, zzaVar, w43Var, xo1Var, ap1Var));
            twVar.setWebViewClient(zzs.zze().zzl(twVar, w43Var, z2));
            twVar.setWebChromeClient(new dw(twVar));
            return twVar;
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }
}