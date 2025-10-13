package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.zzb;
import com.google.android.gms.ads.zza;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class tg extends vf {

    /* renamed from: e */
    private final Object f9129e;

    /* renamed from: f */
    private vg f9130f;

    /* renamed from: g */
    private sm f9131g;

    /* renamed from: h */
    private e.c.b.b.b.b f9132h;

    /* renamed from: i */
    private View f9133i;

    /* renamed from: j */
    private MediationInterstitialAd f9134j;

    /* renamed from: k */
    private UnifiedNativeAdMapper f9135k;

    /* renamed from: l */
    private MediationRewardedAd f9136l;

    /* renamed from: m */
    private MediationInterscrollerAd f9137m;
    private final String n = "";

    public tg(Adapter adapter) {
        this.f9129e = adapter;
    }

    private final Bundle L4(String str, m93 m93Var, String str2) throws RemoteException {
        String strValueOf = String.valueOf(str);
        er.zzd(strValueOf.length() != 0 ? "Server parameters: ".concat(strValueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.f9129e instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (m93Var != null) {
                    bundle.putInt("tagForChildDirectedTreatment", m93Var.f7449k);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            er.zzg("", th);
            throw new RemoteException();
        }
    }

    private final Bundle M4(m93 m93Var) {
        Bundle bundle;
        Bundle bundle2 = m93Var.q;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f9129e.getClass().getName())) == null) ? new Bundle() : bundle;
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

    @Override // com.google.android.gms.internal.ads.wf
    public final ig A3() {
        UnifiedNativeAdMapper unifiedNativeAdMapper;
        UnifiedNativeAdMapper unifiedNativeAdMapperA;
        Object obj = this.f9129e;
        if (!(obj instanceof MediationNativeAdapter)) {
            if (!(obj instanceof Adapter) || (unifiedNativeAdMapper = this.f9135k) == null) {
                return null;
            }
            return new dh(unifiedNativeAdMapper);
        }
        vg vgVar = this.f9130f;
        if (vgVar == null || (unifiedNativeAdMapperA = vgVar.a()) == null) {
            return null;
        }
        return new dh(unifiedNativeAdMapperA);
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void B(e.c.b.b.b.b bVar) {
        Context context = (Context) e.c.b.b.b.d.Y(bVar);
        Object obj = this.f9129e;
        if (obj instanceof OnContextChangedListener) {
            ((OnContextChangedListener) obj).onContextChanged(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void B2(e.c.b.b.b.b bVar, r93 r93Var, m93 m93Var, String str, zf zfVar) throws RemoteException {
        K2(bVar, r93Var, m93Var, str, null, zfVar);
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void F4(m93 m93Var, String str) throws RemoteException {
        b1(m93Var, str, null);
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void I3(e.c.b.b.b.b bVar, m93 m93Var, String str, zf zfVar) throws RemoteException {
        if (this.f9129e instanceof Adapter) {
            er.zzd("Requesting rewarded interstitial ad from adapter.");
            try {
                ((Adapter) this.f9129e).loadRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) e.c.b.b.b.d.Y(bVar), "", L4(str, m93Var, null), M4(m93Var), N4(m93Var), m93Var.o, m93Var.f7449k, m93Var.x, O4(str, m93Var), ""), new rg(this, zfVar));
                return;
            } catch (Exception e2) {
                er.zzg("", e2);
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.f9129e.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        er.zzi(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void K2(e.c.b.b.b.b bVar, r93 r93Var, m93 m93Var, String str, String str2, zf zfVar) throws RemoteException {
        RemoteException remoteException;
        Object obj = this.f9129e;
        if (!(obj instanceof MediationBannerAdapter) && !(obj instanceof Adapter)) {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.f9129e.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            er.zzi(sb.toString());
            throw new RemoteException();
        }
        er.zzd("Requesting banner ad from adapter.");
        AdSize adSizeZzb = r93Var.r ? zza.zzb(r93Var.f8619i, r93Var.f8616f) : zza.zza(r93Var.f8619i, r93Var.f8616f, r93Var.f8615e);
        Object obj2 = this.f9129e;
        if (!(obj2 instanceof MediationBannerAdapter)) {
            if (obj2 instanceof Adapter) {
                try {
                    ((Adapter) obj2).loadBannerAd(new MediationBannerAdConfiguration((Context) e.c.b.b.b.d.Y(bVar), "", L4(str, m93Var, str2), M4(m93Var), N4(m93Var), m93Var.o, m93Var.f7449k, m93Var.x, O4(str, m93Var), adSizeZzb, this.n), new og(this, zfVar));
                    return;
                } finally {
                }
            }
            return;
        }
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj2;
            List<String> list = m93Var.f7447i;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j2 = m93Var.f7444f;
            lg lgVar = new lg(j2 == -1 ? null : new Date(j2), m93Var.f7446h, hashSet, m93Var.o, N4(m93Var), m93Var.f7449k, m93Var.v, m93Var.x, O4(str, m93Var));
            Bundle bundle = m93Var.q;
            mediationBannerAdapter.requestBannerAd((Context) e.c.b.b.b.d.Y(bVar), new vg(zfVar), L4(str, m93Var, str2), adSizeZzb, lgVar, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final eg N() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void N0(e.c.b.b.b.b bVar, m93 m93Var, String str, zf zfVar) throws RemoteException {
        if (this.f9129e instanceof Adapter) {
            er.zzd("Requesting rewarded ad from adapter.");
            try {
                ((Adapter) this.f9129e).loadRewardedAd(new MediationRewardedAdConfiguration((Context) e.c.b.b.b.d.Y(bVar), "", L4(str, m93Var, null), M4(m93Var), N4(m93Var), m93Var.o, m93Var.f7449k, m93Var.x, O4(str, m93Var), ""), new rg(this, zfVar));
                return;
            } catch (Exception e2) {
                er.zzg("", e2);
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.f9129e.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        er.zzi(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void Q1(e.c.b.b.b.b bVar, sm smVar, List<String> list) throws RemoteException {
        er.zzi("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void R1(e.c.b.b.b.b bVar, m93 m93Var, String str, sm smVar, String str2) throws RemoteException {
        Object obj = this.f9129e;
        if (obj instanceof Adapter) {
            this.f9132h = bVar;
            this.f9131g = smVar;
            smVar.i(e.c.b.b.b.d.m4(obj));
            return;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.f9129e.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        er.zzi(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void T0(e.c.b.b.b.b bVar) throws RemoteException {
        Object obj = this.f9129e;
        if ((obj instanceof Adapter) || (obj instanceof MediationInterstitialAdapter)) {
            if (obj instanceof MediationInterstitialAdapter) {
                zzh();
                return;
            }
            er.zzd("Show interstitial ad from adapter.");
            MediationInterstitialAd mediationInterstitialAd = this.f9134j;
            if (mediationInterstitialAd != null) {
                mediationInterstitialAd.showAd((Context) e.c.b.b.b.d.Y(bVar));
                return;
            } else {
                er.zzf("Can not show null mediation interstitial ad.");
                throw new RemoteException();
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = Adapter.class.getCanonicalName();
        String canonicalName3 = this.f9129e.getClass().getCanonicalName();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(length + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
        sb.append(canonicalName);
        sb.append(" or ");
        sb.append(canonicalName2);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName3);
        er.zzi(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void U1(e.c.b.b.b.b bVar) throws RemoteException {
        if (this.f9129e instanceof Adapter) {
            er.zzd("Show rewarded ad from adapter.");
            MediationRewardedAd mediationRewardedAd = this.f9136l;
            if (mediationRewardedAd != null) {
                mediationRewardedAd.showAd((Context) e.c.b.b.b.d.Y(bVar));
                return;
            } else {
                er.zzf("Can not show null mediation rewarded ad.");
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.f9129e.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        er.zzi(sb.toString());
        throw new RemoteException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0060  */
    @Override // com.google.android.gms.internal.ads.wf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W0(e.c.b.b.b.b r9, com.google.android.gms.internal.ads.bc r10, java.util.List<com.google.android.gms.internal.ads.hc> r11) throws android.os.RemoteException {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f9129e
            boolean r0 = r0 instanceof com.google.android.gms.ads.mediation.Adapter
            if (r0 == 0) goto L96
            com.google.android.gms.internal.ads.ng r0 = new com.google.android.gms.internal.ads.ng
            r0.<init>(r8, r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r11 = r11.iterator()
        L14:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L88
            java.lang.Object r1 = r11.next()
            com.google.android.gms.internal.ads.hc r1 = (com.google.android.gms.internal.ads.hc) r1
            java.lang.String r2 = r1.f6321e
            int r3 = r2.hashCode()
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            switch(r3) {
                case -1396342996: goto L56;
                case -1052618729: goto L4c;
                case -239580146: goto L42;
                case 604727084: goto L38;
                case 1911491517: goto L2e;
                default: goto L2d;
            }
        L2d:
            goto L60
        L2e:
            java.lang.String r3 = "rewarded_interstitial"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L60
            r2 = 3
            goto L61
        L38:
            java.lang.String r3 = "interstitial"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L60
            r2 = 1
            goto L61
        L42:
            java.lang.String r3 = "rewarded"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L60
            r2 = 2
            goto L61
        L4c:
            java.lang.String r3 = "native"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L60
            r2 = 4
            goto L61
        L56:
            java.lang.String r3 = "banner"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L60
            r2 = 0
            goto L61
        L60:
            r2 = -1
        L61:
            if (r2 == 0) goto L79
            if (r2 == r7) goto L76
            if (r2 == r6) goto L73
            if (r2 == r5) goto L70
            if (r2 == r4) goto L6d
            r2 = 0
            goto L7b
        L6d:
            com.google.android.gms.ads.AdFormat r2 = com.google.android.gms.ads.AdFormat.NATIVE
            goto L7b
        L70:
            com.google.android.gms.ads.AdFormat r2 = com.google.android.gms.ads.AdFormat.REWARDED_INTERSTITIAL
            goto L7b
        L73:
            com.google.android.gms.ads.AdFormat r2 = com.google.android.gms.ads.AdFormat.REWARDED
            goto L7b
        L76:
            com.google.android.gms.ads.AdFormat r2 = com.google.android.gms.ads.AdFormat.INTERSTITIAL
            goto L7b
        L79:
            com.google.android.gms.ads.AdFormat r2 = com.google.android.gms.ads.AdFormat.BANNER
        L7b:
            if (r2 == 0) goto L14
            com.google.android.gms.ads.mediation.MediationConfiguration r3 = new com.google.android.gms.ads.mediation.MediationConfiguration
            android.os.Bundle r1 = r1.f6322f
            r3.<init>(r2, r1)
            r10.add(r3)
            goto L14
        L88:
            java.lang.Object r11 = r8.f9129e
            com.google.android.gms.ads.mediation.Adapter r11 = (com.google.android.gms.ads.mediation.Adapter) r11
            java.lang.Object r9 = e.c.b.b.b.d.Y(r9)
            android.content.Context r9 = (android.content.Context) r9
            r11.initialize(r9, r0, r10)
            return
        L96:
            android.os.RemoteException r9 = new android.os.RemoteException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tg.W0(e.c.b.b.b.b, com.google.android.gms.internal.ads.bc, java.util.List):void");
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final gi X() {
        Object obj = this.f9129e;
        if (obj instanceof Adapter) {
            return gi.c(((Adapter) obj).getSDKVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void X0(e.c.b.b.b.b bVar, m93 m93Var, String str, String str2, zf zfVar, g6 g6Var, List<String> list) throws RemoteException {
        RemoteException remoteException;
        Object obj = this.f9129e;
        if (!(obj instanceof MediationNativeAdapter) && !(obj instanceof Adapter)) {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.f9129e.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            er.zzi(sb.toString());
            throw new RemoteException();
        }
        er.zzd("Requesting native ad from adapter.");
        Object obj2 = this.f9129e;
        if (!(obj2 instanceof MediationNativeAdapter)) {
            if (obj2 instanceof Adapter) {
                try {
                    ((Adapter) obj2).loadNativeAd(new MediationNativeAdConfiguration((Context) e.c.b.b.b.d.Y(bVar), "", L4(str, m93Var, str2), M4(m93Var), N4(m93Var), m93Var.o, m93Var.f7449k, m93Var.x, O4(str, m93Var), this.n, g6Var), new qg(this, zfVar));
                    return;
                } finally {
                }
            }
            return;
        }
        try {
            MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj2;
            List<String> list2 = m93Var.f7447i;
            HashSet hashSet = list2 != null ? new HashSet(list2) : null;
            long j2 = m93Var.f7444f;
            xg xgVar = new xg(j2 == -1 ? null : new Date(j2), m93Var.f7446h, hashSet, m93Var.o, N4(m93Var), m93Var.f7449k, g6Var, list, m93Var.v, m93Var.x, O4(str, m93Var));
            Bundle bundle = m93Var.q;
            Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
            this.f9130f = new vg(zfVar);
            mediationNativeAdapter.requestNativeAd((Context) e.c.b.b.b.d.Y(bVar), this.f9130f, L4(str, m93Var, str2), xgVar, bundle2);
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void b1(m93 m93Var, String str, String str2) throws RemoteException {
        Object obj = this.f9129e;
        if (obj instanceof Adapter) {
            N0(this.f9132h, m93Var, str, new wg((Adapter) obj, this.f9131g));
            return;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.f9129e.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        er.zzi(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final k7 f() {
        vg vgVar = this.f9130f;
        if (vgVar == null) {
            return null;
        }
        NativeCustomTemplateAd nativeCustomTemplateAdB = vgVar.b();
        if (nativeCustomTemplateAdB instanceof l7) {
            return ((l7) nativeCustomTemplateAdB).a();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void i0(e.c.b.b.b.b bVar, m93 m93Var, String str, zf zfVar) throws RemoteException {
        r0(bVar, m93Var, str, null, zfVar);
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final gi n() {
        Object obj = this.f9129e;
        if (obj instanceof Adapter) {
            return gi.c(((Adapter) obj).getVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final fg p() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void r0(e.c.b.b.b.b bVar, m93 m93Var, String str, String str2, zf zfVar) throws RemoteException {
        RemoteException remoteException;
        Object obj = this.f9129e;
        if (!(obj instanceof MediationInterstitialAdapter) && !(obj instanceof Adapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.f9129e.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            er.zzi(sb.toString());
            throw new RemoteException();
        }
        er.zzd("Requesting interstitial ad from adapter.");
        Object obj2 = this.f9129e;
        if (!(obj2 instanceof MediationInterstitialAdapter)) {
            if (obj2 instanceof Adapter) {
                try {
                    ((Adapter) obj2).loadInterstitialAd(new MediationInterstitialAdConfiguration((Context) e.c.b.b.b.d.Y(bVar), "", L4(str, m93Var, str2), M4(m93Var), N4(m93Var), m93Var.o, m93Var.f7449k, m93Var.x, O4(str, m93Var), this.n), new pg(this, zfVar));
                    return;
                } finally {
                }
            }
            return;
        }
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj2;
            List<String> list = m93Var.f7447i;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j2 = m93Var.f7444f;
            lg lgVar = new lg(j2 == -1 ? null : new Date(j2), m93Var.f7446h, hashSet, m93Var.o, N4(m93Var), m93Var.f7449k, m93Var.v, m93Var.x, O4(str, m93Var));
            Bundle bundle = m93Var.q;
            mediationInterstitialAdapter.requestInterstitialAd((Context) e.c.b.b.b.d.Y(bVar), new vg(zfVar), L4(str, m93Var, str2), lgVar, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final cg t() {
        MediationInterscrollerAd mediationInterscrollerAd = this.f9137m;
        if (mediationInterscrollerAd != null) {
            return new ug(mediationInterscrollerAd);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void v1(e.c.b.b.b.b bVar, r93 r93Var, m93 m93Var, String str, String str2, zf zfVar) throws RemoteException {
        if (this.f9129e instanceof Adapter) {
            er.zzd("Requesting interscroller ad from adapter.");
            try {
                Adapter adapter = (Adapter) this.f9129e;
                adapter.loadInterscrollerAd(new MediationBannerAdConfiguration((Context) e.c.b.b.b.d.Y(bVar), "", L4(str, m93Var, str2), M4(m93Var), N4(m93Var), m93Var.o, m93Var.f7449k, m93Var.x, O4(str, m93Var), zza.zzc(r93Var.f8619i, r93Var.f8616f), ""), new mg(this, zfVar, adapter));
                return;
            } catch (Exception e2) {
                er.zzg("", e2);
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.f9129e.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        er.zzi(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void zzA(boolean z) {
        Object obj = this.f9129e;
        if (obj instanceof OnImmersiveModeUpdatedListener) {
            try {
                ((OnImmersiveModeUpdatedListener) obj).onImmersiveModeUpdated(z);
                return;
            } catch (Throwable th) {
                er.zzg("", th);
                return;
            }
        }
        String canonicalName = OnImmersiveModeUpdatedListener.class.getCanonicalName();
        String canonicalName2 = this.f9129e.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        er.zzd(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final n1 zzB() {
        Object obj = this.f9129e;
        if (obj instanceof zzb) {
            try {
                return ((zzb) obj).getVideoController();
            } catch (Throwable th) {
                er.zzg("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final e.c.b.b.b.b zzf() throws RemoteException {
        Object obj = this.f9129e;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return e.c.b.b.b.d.m4(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                er.zzg("", th);
                throw new RemoteException();
            }
        }
        if (obj instanceof Adapter) {
            return e.c.b.b.b.d.m4(this.f9133i);
        }
        String canonicalName = MediationBannerAdapter.class.getCanonicalName();
        String canonicalName2 = Adapter.class.getCanonicalName();
        String canonicalName3 = this.f9129e.getClass().getCanonicalName();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(length + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
        sb.append(canonicalName);
        sb.append(" or ");
        sb.append(canonicalName2);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName3);
        er.zzi(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void zzh() throws RemoteException {
        if (this.f9129e instanceof MediationInterstitialAdapter) {
            er.zzd("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.f9129e).showInterstitial();
                return;
            } catch (Throwable th) {
                er.zzg("", th);
                throw new RemoteException();
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = this.f9129e.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        er.zzi(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void zzi() throws RemoteException {
        Object obj = this.f9129e;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onDestroy();
            } catch (Throwable th) {
                er.zzg("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void zzl() throws RemoteException {
        Object obj = this.f9129e;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onPause();
            } catch (Throwable th) {
                er.zzg("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void zzm() throws RemoteException {
        Object obj = this.f9129e;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onResume();
            } catch (Throwable th) {
                er.zzg("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void zzp() throws RemoteException {
        if (this.f9129e instanceof Adapter) {
            MediationRewardedAd mediationRewardedAd = this.f9136l;
            if (mediationRewardedAd != null) {
                mediationRewardedAd.showAd((Context) e.c.b.b.b.d.Y(this.f9132h));
                return;
            } else {
                er.zzf("Can not show null mediated rewarded ad.");
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.f9129e.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        er.zzi(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final boolean zzq() throws RemoteException {
        if (this.f9129e instanceof Adapter) {
            return this.f9131g != null;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.f9129e.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        er.zzi(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final Bundle zzs() {
        Object obj = this.f9129e;
        if (obj instanceof zzbib) {
            return ((zzbib) obj).zza();
        }
        String canonicalName = zzbib.class.getCanonicalName();
        String canonicalName2 = this.f9129e.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        er.zzi(sb.toString());
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final Bundle zzt() {
        Object obj = this.f9129e;
        if (obj instanceof zzbic) {
            return ((zzbic) obj).getInterstitialAdapterInfo();
        }
        String canonicalName = zzbic.class.getCanonicalName();
        String canonicalName2 = this.f9129e.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        er.zzi(sb.toString());
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final Bundle zzu() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final boolean zzx() {
        return false;
    }

    public tg(MediationAdapter mediationAdapter) {
        this.f9129e = mediationAdapter;
    }
}