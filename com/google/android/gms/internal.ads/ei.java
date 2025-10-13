package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.zzb;
import com.google.android.gms.ads.zza;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class ei extends sh {

    /* renamed from: e, reason: collision with root package name */
    private final RtbAdapter f5638e;

    /* renamed from: f, reason: collision with root package name */
    private MediationInterstitialAd f5639f;

    /* renamed from: g, reason: collision with root package name */
    private MediationRewardedAd f5640g;

    /* renamed from: h, reason: collision with root package name */
    private String f5641h = "";

    public ei(RtbAdapter rtbAdapter) {
        this.f5638e = rtbAdapter;
    }

    private final Bundle L4(m93 m93Var) {
        Bundle bundle;
        Bundle bundle2 = m93Var.q;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f5638e.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private static final Bundle M4(String str) throws RemoteException {
        String strValueOf = String.valueOf(str);
        er.zzi(strValueOf.length() != 0 ? "Server parameters: ".concat(strValueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e2) {
            er.zzg("", e2);
            throw new RemoteException();
        }
    }

    private static final boolean N4(m93 m93Var) {
        if (m93Var.f7448j) {
            return true;
        }
        ta3.a();
        return xq.m();
    }

    private static final String O4(String str, m93 m93Var) {
        String str2 = m93Var.y;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.th
    public final void B4(String str, String str2, m93 m93Var, e.c.b.b.b.b bVar, nh nhVar, zf zfVar, g6 g6Var) throws RemoteException {
        try {
            this.f5638e.loadRtbNativeAd(new MediationNativeAdConfiguration((Context) e.c.b.b.b.d.Y(bVar), str, M4(str2), L4(m93Var), N4(m93Var), m93Var.o, m93Var.f7449k, m93Var.x, O4(str2, m93Var), this.f5641h, g6Var), new bi(this, nhVar, zfVar));
        } catch (Throwable th) {
            er.zzg("Adapter failed to render native ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.th
    public final void C3(String str, String str2, m93 m93Var, e.c.b.b.b.b bVar, jh jhVar, zf zfVar) throws RemoteException {
        try {
            this.f5638e.loadRtbInterstitialAd(new MediationInterstitialAdConfiguration((Context) e.c.b.b.b.d.Y(bVar), str, M4(str2), L4(m93Var), N4(m93Var), m93Var.o, m93Var.f7449k, m93Var.x, O4(str2, m93Var), this.f5641h), new ai(this, jhVar, zfVar));
        } catch (Throwable th) {
            er.zzg("Adapter failed to render interstitial ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.th
    public final boolean Q(e.c.b.b.b.b bVar) {
        MediationInterstitialAd mediationInterstitialAd = this.f5639f;
        if (mediationInterstitialAd == null) {
            return false;
        }
        try {
            mediationInterstitialAd.showAd((Context) e.c.b.b.b.d.Y(bVar));
            return true;
        } catch (Throwable th) {
            er.zzg("", th);
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.th
    public final boolean Q3(e.c.b.b.b.b bVar) {
        MediationRewardedAd mediationRewardedAd = this.f5640g;
        if (mediationRewardedAd == null) {
            return false;
        }
        try {
            mediationRewardedAd.showAd((Context) e.c.b.b.b.d.Y(bVar));
            return true;
        } catch (Throwable th) {
            er.zzg("", th);
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.th
    public final void S(String str) {
        this.f5641h = str;
    }

    @Override // com.google.android.gms.internal.ads.th
    public final void U2(String str, String str2, m93 m93Var, e.c.b.b.b.b bVar, gh ghVar, zf zfVar, r93 r93Var) throws RemoteException {
        try {
            this.f5638e.loadRtbBannerAd(new MediationBannerAdConfiguration((Context) e.c.b.b.b.d.Y(bVar), str, M4(str2), L4(m93Var), N4(m93Var), m93Var.o, m93Var.f7449k, m93Var.x, O4(str2, m93Var), zza.zza(r93Var.f8619i, r93Var.f8616f, r93Var.f8615e), this.f5641h), new yh(this, ghVar, zfVar));
        } catch (Throwable th) {
            er.zzg("Adapter failed to render banner ad.", th);
            throw new RemoteException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    @Override // com.google.android.gms.internal.ads.th
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j1(e.c.b.b.b.b r8, java.lang.String r9, android.os.Bundle r10, android.os.Bundle r11, com.google.android.gms.internal.ads.r93 r12, com.google.android.gms.internal.ads.wh r13) throws android.os.RemoteException {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.ci r0 = new com.google.android.gms.internal.ads.ci     // Catch: java.lang.Throwable -> L8c
            r0.<init>(r7, r13)     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.ads.mediation.rtb.RtbAdapter r13 = r7.f5638e     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.ads.mediation.MediationConfiguration r1 = new com.google.android.gms.ads.mediation.MediationConfiguration     // Catch: java.lang.Throwable -> L8c
            int r2 = r9.hashCode()     // Catch: java.lang.Throwable -> L8c
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r2) {
                case -1396342996: goto L3d;
                case -1052618729: goto L33;
                case -239580146: goto L29;
                case 604727084: goto L1f;
                case 1911491517: goto L15;
                default: goto L14;
            }
        L14:
            goto L47
        L15:
            java.lang.String r2 = "rewarded_interstitial"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L47
            r9 = 3
            goto L48
        L1f:
            java.lang.String r2 = "interstitial"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L47
            r9 = 1
            goto L48
        L29:
            java.lang.String r2 = "rewarded"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L47
            r9 = 2
            goto L48
        L33:
            java.lang.String r2 = "native"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L47
            r9 = 4
            goto L48
        L3d:
            java.lang.String r2 = "banner"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L47
            r9 = 0
            goto L48
        L47:
            r9 = -1
        L48:
            if (r9 == 0) goto L66
            if (r9 == r6) goto L63
            if (r9 == r5) goto L60
            if (r9 == r4) goto L5d
            if (r9 != r3) goto L55
            com.google.android.gms.ads.AdFormat r9 = com.google.android.gms.ads.AdFormat.NATIVE     // Catch: java.lang.Throwable -> L8c
            goto L68
        L55:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L8c
            java.lang.String r9 = "Internal Error"
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L8c
            throw r8     // Catch: java.lang.Throwable -> L8c
        L5d:
            com.google.android.gms.ads.AdFormat r9 = com.google.android.gms.ads.AdFormat.REWARDED_INTERSTITIAL     // Catch: java.lang.Throwable -> L8c
            goto L68
        L60:
            com.google.android.gms.ads.AdFormat r9 = com.google.android.gms.ads.AdFormat.REWARDED     // Catch: java.lang.Throwable -> L8c
            goto L68
        L63:
            com.google.android.gms.ads.AdFormat r9 = com.google.android.gms.ads.AdFormat.INTERSTITIAL     // Catch: java.lang.Throwable -> L8c
            goto L68
        L66:
            com.google.android.gms.ads.AdFormat r9 = com.google.android.gms.ads.AdFormat.BANNER     // Catch: java.lang.Throwable -> L8c
        L68:
            r1.<init>(r9, r11)     // Catch: java.lang.Throwable -> L8c
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8c
            r9.<init>()     // Catch: java.lang.Throwable -> L8c
            r9.add(r1)     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.ads.mediation.rtb.RtbSignalData r11 = new com.google.android.gms.ads.mediation.rtb.RtbSignalData     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r8 = e.c.b.b.b.d.Y(r8)     // Catch: java.lang.Throwable -> L8c
            android.content.Context r8 = (android.content.Context) r8     // Catch: java.lang.Throwable -> L8c
            int r1 = r12.f8619i     // Catch: java.lang.Throwable -> L8c
            int r2 = r12.f8616f     // Catch: java.lang.Throwable -> L8c
            java.lang.String r12 = r12.f8615e     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.ads.AdSize r12 = com.google.android.gms.ads.zza.zza(r1, r2, r12)     // Catch: java.lang.Throwable -> L8c
            r11.<init>(r8, r9, r10, r12)     // Catch: java.lang.Throwable -> L8c
            r13.collectSignals(r11, r0)     // Catch: java.lang.Throwable -> L8c
            return
        L8c:
            r8 = move-exception
            java.lang.String r9 = "Error generating signals for RTB"
            com.google.android.gms.internal.ads.er.zzg(r9, r8)
            android.os.RemoteException r8 = new android.os.RemoteException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ei.j1(e.c.b.b.b.b, java.lang.String, android.os.Bundle, android.os.Bundle, com.google.android.gms.internal.ads.r93, com.google.android.gms.internal.ads.wh):void");
    }

    @Override // com.google.android.gms.internal.ads.th
    public final void n0(String str, String str2, m93 m93Var, e.c.b.b.b.b bVar, qh qhVar, zf zfVar) throws RemoteException {
        try {
            this.f5638e.loadRtbRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) e.c.b.b.b.d.Y(bVar), str, M4(str2), L4(m93Var), N4(m93Var), m93Var.o, m93Var.f7449k, m93Var.x, O4(str2, m93Var), this.f5641h), new di(this, qhVar, zfVar));
        } catch (Throwable th) {
            er.zzg("Adapter failed to render rewarded interstitial ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.th
    public final void o2(String str, String str2, m93 m93Var, e.c.b.b.b.b bVar, qh qhVar, zf zfVar) throws RemoteException {
        try {
            this.f5638e.loadRtbRewardedAd(new MediationRewardedAdConfiguration((Context) e.c.b.b.b.d.Y(bVar), str, M4(str2), L4(m93Var), N4(m93Var), m93Var.o, m93Var.f7449k, m93Var.x, O4(str2, m93Var), this.f5641h), new di(this, qhVar, zfVar));
        } catch (Throwable th) {
            er.zzg("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.th
    public final void p3(String str, String str2, m93 m93Var, e.c.b.b.b.b bVar, gh ghVar, zf zfVar, r93 r93Var) throws RemoteException {
        try {
            this.f5638e.loadRtbInterscrollerAd(new MediationBannerAdConfiguration((Context) e.c.b.b.b.d.Y(bVar), str, M4(str2), L4(m93Var), N4(m93Var), m93Var.o, m93Var.f7449k, m93Var.x, O4(str2, m93Var), zza.zza(r93Var.f8619i, r93Var.f8616f, r93Var.f8615e), this.f5641h), new zh(this, ghVar, zfVar));
        } catch (Throwable th) {
            er.zzg("Adapter failed to render interscroller ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.th
    public final void s1(String str, String str2, m93 m93Var, e.c.b.b.b.b bVar, nh nhVar, zf zfVar) throws RemoteException {
        B4(str, str2, m93Var, bVar, nhVar, zfVar, null);
    }

    @Override // com.google.android.gms.internal.ads.th
    public final gi zzf() {
        return gi.c(this.f5638e.getVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.th
    public final gi zzg() {
        return gi.c(this.f5638e.getSDKVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.th
    public final n1 zzh() {
        MediationExtrasReceiver mediationExtrasReceiver = this.f5638e;
        if (mediationExtrasReceiver instanceof zzb) {
            try {
                return ((zzb) mediationExtrasReceiver).getVideoController();
            } catch (Throwable th) {
                er.zzg("", th);
            }
        }
        return null;
    }
}