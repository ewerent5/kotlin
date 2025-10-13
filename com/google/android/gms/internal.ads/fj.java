package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class fj implements NativeCustomFormatAd {
    private final k7 a;

    /* renamed from: b, reason: collision with root package name */
    private final MediaView f5881b;

    /* renamed from: c, reason: collision with root package name */
    private final VideoController f5882c = new VideoController();

    /* renamed from: d, reason: collision with root package name */
    private NativeCustomFormatAd.DisplayOpenMeasurement f5883d;

    public fj(k7 k7Var) {
        Context context;
        this.a = k7Var;
        MediaView mediaView = null;
        try {
            context = (Context) e.c.b.b.b.d.Y(k7Var.zzm());
        } catch (RemoteException | NullPointerException e2) {
            er.zzg("", e2);
            context = null;
        }
        if (context != null) {
            MediaView mediaView2 = new MediaView(context);
            try {
                if (true == this.a.zzn(e.c.b.b.b.d.m4(mediaView2))) {
                    mediaView = mediaView2;
                }
            } catch (RemoteException e3) {
                er.zzg("", e3);
            }
        }
        this.f5881b = mediaView;
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void destroy() {
        try {
            this.a.zzl();
        } catch (RemoteException e2) {
            er.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final List<String> getAvailableAssetNames() {
        try {
            return this.a.zzg();
        } catch (RemoteException e2) {
            er.zzg("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final String getCustomFormatId() {
        try {
            return this.a.zzh();
        } catch (RemoteException e2) {
            er.zzg("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final NativeCustomFormatAd.DisplayOpenMeasurement getDisplayOpenMeasurement() {
        try {
            if (this.f5883d == null && this.a.a()) {
                this.f5883d = new yi(this.a);
            }
        } catch (RemoteException e2) {
            er.zzg("", e2);
        }
        return this.f5883d;
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final NativeAd.Image getImage(String str) {
        try {
            t6 t6VarB = this.a.b(str);
            if (t6VarB != null) {
                return new zi(t6VarB);
            }
            return null;
        } catch (RemoteException e2) {
            er.zzg("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final CharSequence getText(String str) {
        try {
            return this.a.zze(str);
        } catch (RemoteException e2) {
            er.zzg("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final VideoController getVideoController() {
        try {
            n1 n1VarZzk = this.a.zzk();
            if (n1VarZzk != null) {
                this.f5882c.zza(n1VarZzk);
            }
        } catch (RemoteException e2) {
            er.zzg("Exception occurred while getting video controller", e2);
        }
        return this.f5882c;
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final MediaView getVideoMediaView() {
        return this.f5881b;
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void performClick(String str) {
        try {
            this.a.zzi(str);
        } catch (RemoteException e2) {
            er.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void recordImpression() {
        try {
            this.a.zzj();
        } catch (RemoteException e2) {
            er.zzg("", e2);
        }
    }
}