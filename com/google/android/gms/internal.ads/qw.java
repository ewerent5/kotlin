package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzs;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class qw {
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.ew, java.lang.Object] */
    public static final ew a(final Context context, final vx vxVar, final String str, final boolean z, final boolean z2, final ip2 ip2Var, final w4 w4Var, final kr krVar, m4 m4Var, final zzl zzlVar, final zza zzaVar, final w43 w43Var, final xo1 xo1Var, final ap1 ap1Var) throws pw {
        w3.a(context);
        try {
            final m4 m4Var2 = null;
            p12 p12Var = new p12(context, vxVar, str, z, z2, ip2Var, w4Var, krVar, m4Var2, zzlVar, zzaVar, w43Var, xo1Var, ap1Var) { // from class: com.google.android.gms.internal.ads.nw
                private final Context a;

                /* renamed from: b, reason: collision with root package name */
                private final vx f7807b;

                /* renamed from: c, reason: collision with root package name */
                private final String f7808c;

                /* renamed from: d, reason: collision with root package name */
                private final boolean f7809d;

                /* renamed from: e, reason: collision with root package name */
                private final boolean f7810e;

                /* renamed from: f, reason: collision with root package name */
                private final ip2 f7811f;

                /* renamed from: g, reason: collision with root package name */
                private final w4 f7812g;

                /* renamed from: h, reason: collision with root package name */
                private final kr f7813h;

                /* renamed from: i, reason: collision with root package name */
                private final zzl f7814i;

                /* renamed from: j, reason: collision with root package name */
                private final zza f7815j;

                /* renamed from: k, reason: collision with root package name */
                private final w43 f7816k;

                /* renamed from: l, reason: collision with root package name */
                private final xo1 f7817l;

                /* renamed from: m, reason: collision with root package name */
                private final ap1 f7818m;

                {
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
                    Context context2 = this.a;
                    vx vxVar2 = this.f7807b;
                    String str2 = this.f7808c;
                    boolean z3 = this.f7809d;
                    boolean z4 = this.f7810e;
                    ip2 ip2Var2 = this.f7811f;
                    w4 w4Var2 = this.f7812g;
                    kr krVar2 = this.f7813h;
                    zzl zzlVar2 = this.f7814i;
                    zza zzaVar2 = this.f7815j;
                    w43 w43Var2 = this.f7816k;
                    xo1 xo1Var2 = this.f7817l;
                    ap1 ap1Var2 = this.f7818m;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i2 = xw.f10280e;
                        tw twVar = new tw(new xw(new ux(context2), vxVar2, str2, z3, z4, ip2Var2, w4Var2, krVar2, null, zzlVar2, zzaVar2, w43Var2, xo1Var2, ap1Var2));
                        twVar.setWebViewClient(zzs.zze().zzl(twVar, w43Var2, z4));
                        twVar.setWebChromeClient(new dw(twVar));
                        return twVar;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return p12Var.zza();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            throw new pw("Webview initialization failed.", th);
        }
    }

    public static final g52<ew> b(final Context context, final kr krVar, final String str, final ip2 ip2Var, final zza zzaVar) {
        return y42.h(y42.a(null), new e42(context, ip2Var, krVar, zzaVar, str) { // from class: com.google.android.gms.internal.ads.mw
            private final Context a;

            /* renamed from: b, reason: collision with root package name */
            private final ip2 f7567b;

            /* renamed from: c, reason: collision with root package name */
            private final kr f7568c;

            /* renamed from: d, reason: collision with root package name */
            private final zza f7569d;

            /* renamed from: e, reason: collision with root package name */
            private final String f7570e;

            {
                this.a = context;
                this.f7567b = ip2Var;
                this.f7568c = krVar;
                this.f7569d = zzaVar;
                this.f7570e = str;
            }

            @Override // com.google.android.gms.internal.ads.e42
            public final g52 zza(Object obj) throws pw {
                Context context2 = this.a;
                ip2 ip2Var2 = this.f7567b;
                kr krVar2 = this.f7568c;
                zza zzaVar2 = this.f7569d;
                String str2 = this.f7570e;
                zzs.zzd();
                ew ewVarA = qw.a(context2, vx.b(), "", false, false, ip2Var2, null, krVar2, null, null, zzaVar2, w43.a(), null, null);
                final vr vrVarB = vr.b(ewVarA);
                ewVarA.E0().i0(new rx(vrVarB) { // from class: com.google.android.gms.internal.ads.ow

                    /* renamed from: e, reason: collision with root package name */
                    private final vr f8025e;

                    {
                        this.f8025e = vrVarB;
                    }

                    @Override // com.google.android.gms.internal.ads.rx
                    public final void zza(boolean z) {
                        this.f8025e.c();
                    }
                });
                ewVarA.loadUrl(str2);
                return vrVarB;
            }
        }, qr.f8450e);
    }
}