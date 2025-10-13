package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class l7 implements NativeCustomTemplateAd {
    private final k7 a;

    /* renamed from: b, reason: collision with root package name */
    private final MediaView f7209b;

    /* renamed from: c, reason: collision with root package name */
    private final VideoController f7210c = new VideoController();

    /* renamed from: d, reason: collision with root package name */
    private NativeCustomTemplateAd.DisplayOpenMeasurement f7211d;

    public l7(k7 k7Var) {
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
        this.f7209b = mediaView;
    }

    public final k7 a() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final void destroy() {
        try {
            this.a.zzl();
        } catch (RemoteException e2) {
            er.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final List<String> getAvailableAssetNames() {
        try {
            return this.a.zzg();
        } catch (RemoteException e2) {
            er.zzg("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final String getCustomTemplateId() {
        try {
            return this.a.zzh();
        } catch (RemoteException e2) {
            er.zzg("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final NativeCustomTemplateAd.DisplayOpenMeasurement getDisplayOpenMeasurement() {
        try {
            if (this.f7211d == null && this.a.a()) {
                this.f7211d = new n6(this.a);
            }
        } catch (RemoteException e2) {
            er.zzg("", e2);
        }
        return this.f7211d;
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final NativeAd.Image getImage(String str) {
        try {
            t6 t6VarB = this.a.b(str);
            if (t6VarB != null) {
                return new u6(t6VarB);
            }
            return null;
        } catch (RemoteException e2) {
            er.zzg("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final CharSequence getText(String str) {
        try {
            return this.a.zze(str);
        } catch (RemoteException e2) {
            er.zzg("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final VideoController getVideoController() {
        try {
            n1 n1VarZzk = this.a.zzk();
            if (n1VarZzk != null) {
                this.f7210c.zza(n1VarZzk);
            }
        } catch (RemoteException e2) {
            er.zzg("Exception occurred while getting video controller", e2);
        }
        return this.f7210c;
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final MediaView getVideoMediaView() {
        return this.f7209b;
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final void performClick(String str) {
        try {
            this.a.zzi(str);
        } catch (RemoteException e2) {
            er.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final void recordImpression() {
        try {
            this.a.zzj();
        } catch (RemoteException e2) {
            er.zzg("", e2);
        }
    }
}