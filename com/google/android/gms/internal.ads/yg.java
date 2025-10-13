package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.e;
import com.google.ads.mediation.f;
import com.google.android.gms.ads.zza;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class yg<NETWORK_EXTRAS extends com.google.ads.mediation.f, SERVER_PARAMETERS extends com.google.ads.mediation.e> extends vf {

    /* renamed from: e, reason: collision with root package name */
    private final com.google.ads.mediation.b<NETWORK_EXTRAS, SERVER_PARAMETERS> f10423e;

    /* renamed from: f, reason: collision with root package name */
    private final NETWORK_EXTRAS f10424f;

    public yg(com.google.ads.mediation.b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar, NETWORK_EXTRAS network_extras) {
        this.f10423e = bVar;
        this.f10424f = network_extras;
    }

    private final SERVER_PARAMETERS I4(String str) throws RemoteException {
        HashMap map;
        try {
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                map = new HashMap(jSONObject.length());
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObject.getString(next));
                }
            } else {
                map = new HashMap(0);
            }
            Class<SERVER_PARAMETERS> serverParametersType = this.f10423e.getServerParametersType();
            if (serverParametersType == null) {
                return null;
            }
            SERVER_PARAMETERS server_parametersNewInstance = serverParametersType.newInstance();
            server_parametersNewInstance.a(map);
            return server_parametersNewInstance;
        } catch (Throwable th) {
            er.zzg("", th);
            throw new RemoteException();
        }
    }

    private static final boolean J4(m93 m93Var) {
        if (m93Var.f7448j) {
            return true;
        }
        ta3.a();
        return xq.m();
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final ig A3() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void B(e.c.b.b.b.b bVar) {
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void B2(e.c.b.b.b.b bVar, r93 r93Var, m93 m93Var, String str, zf zfVar) throws RemoteException {
        K2(bVar, r93Var, m93Var, str, null, zfVar);
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void F4(m93 m93Var, String str) {
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void I3(e.c.b.b.b.b bVar, m93 m93Var, String str, zf zfVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.wf
    public final void K2(e.c.b.b.b.b bVar, r93 r93Var, m93 m93Var, String str, String str2, zf zfVar) throws RemoteException {
        e.c.a.c cVar;
        com.google.ads.mediation.b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar2 = this.f10423e;
        if (!(bVar2 instanceof MediationBannerAdapter)) {
            String strValueOf = String.valueOf(bVar2.getClass().getCanonicalName());
            er.zzi(strValueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(strValueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        er.zzd("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.f10423e;
            bh bhVar = new bh(zfVar);
            Activity activity = (Activity) e.c.b.b.b.d.Y(bVar);
            com.google.ads.mediation.e eVarI4 = I4(str);
            int i2 = 0;
            e.c.a.c[] cVarArr = {e.c.a.c.a, e.c.a.c.f14217b, e.c.a.c.f14218c, e.c.a.c.f14219d, e.c.a.c.f14220e, e.c.a.c.f14221f};
            while (true) {
                if (i2 >= 6) {
                    cVar = new e.c.a.c(zza.zza(r93Var.f8619i, r93Var.f8616f, r93Var.f8615e));
                    break;
                } else {
                    if (cVarArr[i2].b() == r93Var.f8619i && cVarArr[i2].a() == r93Var.f8616f) {
                        cVar = cVarArr[i2];
                        break;
                    }
                    i2++;
                }
            }
            mediationBannerAdapter.requestBannerAd(bhVar, activity, eVarI4, cVar, ch.b(m93Var, J4(m93Var)), this.f10424f);
        } catch (Throwable th) {
            er.zzg("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final eg N() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void N0(e.c.b.b.b.b bVar, m93 m93Var, String str, zf zfVar) {
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void Q1(e.c.b.b.b.b bVar, sm smVar, List<String> list) {
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void R1(e.c.b.b.b.b bVar, m93 m93Var, String str, sm smVar, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void T0(e.c.b.b.b.b bVar) {
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void U1(e.c.b.b.b.b bVar) {
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void W0(e.c.b.b.b.b bVar, bc bcVar, List<hc> list) {
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final gi X() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void X0(e.c.b.b.b.b bVar, m93 m93Var, String str, String str2, zf zfVar, g6 g6Var, List<String> list) {
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void b1(m93 m93Var, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final k7 f() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void i0(e.c.b.b.b.b bVar, m93 m93Var, String str, zf zfVar) throws RemoteException {
        r0(bVar, m93Var, str, null, zfVar);
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final gi n() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final fg p() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.wf
    public final void r0(e.c.b.b.b.b bVar, m93 m93Var, String str, String str2, zf zfVar) throws RemoteException {
        com.google.ads.mediation.b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar2 = this.f10423e;
        if (!(bVar2 instanceof MediationInterstitialAdapter)) {
            String strValueOf = String.valueOf(bVar2.getClass().getCanonicalName());
            er.zzi(strValueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(strValueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        er.zzd("Requesting interstitial ad from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f10423e).requestInterstitialAd(new bh(zfVar), (Activity) e.c.b.b.b.d.Y(bVar), I4(str), ch.b(m93Var, J4(m93Var)), this.f10424f);
        } catch (Throwable th) {
            er.zzg("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final cg t() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void v1(e.c.b.b.b.b bVar, r93 r93Var, m93 m93Var, String str, String str2, zf zfVar) {
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void zzA(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final n1 zzB() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final e.c.b.b.b.b zzf() throws RemoteException {
        com.google.ads.mediation.b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f10423e;
        if (!(bVar instanceof MediationBannerAdapter)) {
            String strValueOf = String.valueOf(bVar.getClass().getCanonicalName());
            er.zzi(strValueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(strValueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        try {
            return e.c.b.b.b.d.m4(((MediationBannerAdapter) bVar).getBannerView());
        } catch (Throwable th) {
            er.zzg("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void zzh() throws RemoteException {
        com.google.ads.mediation.b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f10423e;
        if (!(bVar instanceof MediationInterstitialAdapter)) {
            String strValueOf = String.valueOf(bVar.getClass().getCanonicalName());
            er.zzi(strValueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(strValueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        er.zzd("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f10423e).showInterstitial();
        } catch (Throwable th) {
            er.zzg("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void zzi() throws RemoteException {
        try {
            this.f10423e.destroy();
        } catch (Throwable th) {
            er.zzg("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void zzl() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void zzm() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void zzp() {
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final boolean zzq() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final Bundle zzs() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final Bundle zzt() {
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
}