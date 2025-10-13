package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.internal.ads.a0;
import com.google.android.gms.internal.ads.b5;
import com.google.android.gms.internal.ads.d3;
import com.google.android.gms.internal.ads.e0;
import com.google.android.gms.internal.ads.ek;
import com.google.android.gms.internal.ads.er;
import com.google.android.gms.internal.ads.g;
import com.google.android.gms.internal.ads.h1;
import com.google.android.gms.internal.ads.hk;
import com.google.android.gms.internal.ads.i0;
import com.google.android.gms.internal.ads.ip2;
import com.google.android.gms.internal.ads.j;
import com.google.android.gms.internal.ads.jp2;
import com.google.android.gms.internal.ads.k1;
import com.google.android.gms.internal.ads.kr;
import com.google.android.gms.internal.ads.l0;
import com.google.android.gms.internal.ads.m;
import com.google.android.gms.internal.ads.m93;
import com.google.android.gms.internal.ads.mm;
import com.google.android.gms.internal.ads.n1;
import com.google.android.gms.internal.ads.qr;
import com.google.android.gms.internal.ads.r1;
import com.google.android.gms.internal.ads.r93;
import com.google.android.gms.internal.ads.s4;
import com.google.android.gms.internal.ads.t33;
import com.google.android.gms.internal.ads.ta3;
import com.google.android.gms.internal.ads.v;
import com.google.android.gms.internal.ads.xq;
import com.google.android.gms.internal.ads.y93;
import e.c.b.b.b.b;
import e.c.b.b.b.d;
import java.util.Map;
import java.util.concurrent.Future;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzr extends v {
    private final kr zza;
    private final r93 zzb;
    private final Future<ip2> zzc = qr.a.N(new zzo(this));
    private final Context zzd;
    private final zzq zze;
    private WebView zzf;
    private j zzg;
    private ip2 zzh;
    private AsyncTask<Void, Void, String> zzi;

    public zzr(Context context, r93 r93Var, String str, kr krVar) {
        this.zzd = context;
        this.zza = krVar;
        this.zzb = r93Var;
        this.zzf = new WebView(context);
        this.zze = new zzq(context, str);
        zzL(0);
        this.zzf.setVerticalScrollBarEnabled(false);
        this.zzf.getSettings().setJavaScriptEnabled(true);
        this.zzf.setWebViewClient(new zzm(this));
        this.zzf.setOnTouchListener(new zzn(this));
    }

    static /* synthetic */ String zzT(zzr zzrVar, String str) {
        if (zzrVar.zzh == null) {
            return str;
        }
        Uri uriE = Uri.parse(str);
        try {
            uriE = zzrVar.zzh.e(uriE, zzrVar.zzd, null, null);
        } catch (jp2 e2) {
            er.zzj("Unable to process ad data", e2);
        }
        return uriE.toString();
    }

    static /* synthetic */ void zzU(zzr zzrVar, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        zzrVar.zzd.startActivity(intent);
    }

    @Override // com.google.android.gms.internal.ads.w
    public final boolean zzA() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzB(mm mmVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzC(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzD(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.w
    public final n1 zzE() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzF(d3 d3Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzG(r1 r1Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzH(y93 y93Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzI(t33 t33Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzJ(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    final int zzK(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (!TextUtils.isEmpty(queryParameter)) {
            try {
                ta3.a();
                return xq.s(this.zzd, Integer.parseInt(queryParameter));
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    final void zzL(int i2) {
        if (this.zzf == null) {
            return;
        }
        this.zzf.setLayoutParams(new ViewGroup.LayoutParams(-1, i2));
    }

    final String zzM() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath(b5.f5073d.e());
        builder.appendQueryParameter("query", this.zze.zzb());
        builder.appendQueryParameter("pubId", this.zze.zzc());
        Map<String, String> mapZzd = this.zze.zzd();
        for (String str : mapZzd.keySet()) {
            builder.appendQueryParameter(str, mapZzd.get(str));
        }
        Uri uriBuild = builder.build();
        ip2 ip2Var = this.zzh;
        if (ip2Var != null) {
            try {
                uriBuild = ip2Var.c(uriBuild, this.zzd);
            } catch (jp2 e2) {
                er.zzj("Unable to process ad data", e2);
            }
        }
        String strZzN = zzN();
        String encodedQuery = uriBuild.getEncodedQuery();
        StringBuilder sb = new StringBuilder(String.valueOf(strZzN).length() + 1 + String.valueOf(encodedQuery).length());
        sb.append(strZzN);
        sb.append("#");
        sb.append(encodedQuery);
        return sb.toString();
    }

    final String zzN() {
        String strZza = this.zze.zza();
        if (true == TextUtils.isEmpty(strZza)) {
            strZza = "www.google.com";
        }
        String strE = b5.f5073d.e();
        StringBuilder sb = new StringBuilder(String.valueOf(strZza).length() + 8 + String.valueOf(strE).length());
        sb.append("https://");
        sb.append(strZza);
        sb.append(strE);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzO(h1 h1Var) {
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzP(m93 m93Var, m mVar) {
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzQ(b bVar) {
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzR(l0 l0Var) {
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzab(i0 i0Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.w
    public final b zzb() {
        p.e("getAdFrame must be called on the main UI thread.");
        return d.m4(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.w
    public final boolean zzbI() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzc() {
        p.e("destroy must be called on the main UI thread.");
        this.zzi.cancel(true);
        this.zzc.cancel(true);
        this.zzf.destroy();
        this.zzf = null;
    }

    @Override // com.google.android.gms.internal.ads.w
    public final boolean zze(m93 m93Var) {
        p.k(this.zzf, "This Search Ad has already been torn down");
        this.zze.zze(m93Var, this.zza);
        this.zzi = new zzp(this, null).execute(new Void[0]);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzf() {
        p.e("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzg() {
        p.e("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzh(j jVar) {
        this.zzg = jVar;
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzi(e0 e0Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzj(a0 a0Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.w
    public final Bundle zzk() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzl() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzm() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.w
    public final r93 zzn() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzo(r93 r93Var) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzp(ek ekVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzq(hk hkVar, String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.w
    public final String zzr() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.w
    public final String zzs() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.w
    public final k1 zzt() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.w
    public final String zzu() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // com.google.android.gms.internal.ads.w
    public final e0 zzv() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // com.google.android.gms.internal.ads.w
    public final j zzw() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzx(s4 s4Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzy(g gVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzz(boolean z) {
    }
}