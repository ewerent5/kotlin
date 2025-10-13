package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.er;
import com.google.android.gms.internal.ads.ip2;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class zzp extends AsyncTask<Void, Void, String> {
    final /* synthetic */ zzr zza;

    /* synthetic */ zzp(zzr zzrVar, zzm zzmVar) {
        this.zza = zzrVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(String str) {
        String str2 = str;
        if (this.zza.zzf == null || str2 == null) {
            return;
        }
        this.zza.zzf.loadUrl(str2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String doInBackground(Void... voidArr) {
        try {
            zzr zzrVar = this.zza;
            zzrVar.zzh = (ip2) zzrVar.zzc.get(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            e = e2;
            er.zzj("", e);
        } catch (ExecutionException e3) {
            e = e3;
            er.zzj("", e);
        } catch (TimeoutException e4) {
            er.zzj("", e4);
        }
        return this.zza.zzM();
    }
}