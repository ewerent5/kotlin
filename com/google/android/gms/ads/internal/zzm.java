package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.er;
import com.google.android.gms.internal.ads.mq1;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class zzm extends WebViewClient {
    final /* synthetic */ zzr zza;

    zzm(zzr zzrVar) {
        this.zza = zzrVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (this.zza.zzg != null) {
            try {
                this.zza.zzg.x(mq1.d(1, null, null));
            } catch (RemoteException e2) {
                er.zzl("#007 Could not call remote method.", e2);
            }
        }
        if (this.zza.zzg != null) {
            try {
                this.zza.zzg.g(0);
            } catch (RemoteException e3) {
                er.zzl("#007 Could not call remote method.", e3);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.zza.zzN())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            if (this.zza.zzg != null) {
                try {
                    this.zza.zzg.x(mq1.d(3, null, null));
                } catch (RemoteException e2) {
                    er.zzl("#007 Could not call remote method.", e2);
                }
            }
            if (this.zza.zzg != null) {
                try {
                    this.zza.zzg.g(3);
                } catch (RemoteException e3) {
                    er.zzl("#007 Could not call remote method.", e3);
                }
            }
            this.zza.zzL(0);
            return true;
        }
        if (str.startsWith("gmsg://scriptLoadFailed")) {
            if (this.zza.zzg != null) {
                try {
                    this.zza.zzg.x(mq1.d(1, null, null));
                } catch (RemoteException e4) {
                    er.zzl("#007 Could not call remote method.", e4);
                }
            }
            if (this.zza.zzg != null) {
                try {
                    this.zza.zzg.g(0);
                } catch (RemoteException e5) {
                    er.zzl("#007 Could not call remote method.", e5);
                }
            }
            this.zza.zzL(0);
            return true;
        }
        if (str.startsWith("gmsg://adResized")) {
            if (this.zza.zzg != null) {
                try {
                    this.zza.zzg.zzf();
                } catch (RemoteException e6) {
                    er.zzl("#007 Could not call remote method.", e6);
                }
            }
            this.zza.zzL(this.zza.zzK(str));
            return true;
        }
        if (str.startsWith("gmsg://")) {
            return true;
        }
        if (this.zza.zzg != null) {
            try {
                this.zza.zzg.zze();
            } catch (RemoteException e7) {
                er.zzl("#007 Could not call remote method.", e7);
            }
        }
        zzr.zzU(this.zza, zzr.zzT(this.zza, str));
        return true;
    }
}