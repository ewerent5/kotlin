package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class p8 extends UnifiedNativeAd {
    private final o8 a;

    /* renamed from: c, reason: collision with root package name */
    private final u6 f8115c;

    /* renamed from: e, reason: collision with root package name */
    private final NativeAd.AdChoicesInfo f8117e;

    /* renamed from: b, reason: collision with root package name */
    private final List<NativeAd.Image> f8114b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final VideoController f8116d = new VideoController();

    /* renamed from: f, reason: collision with root package name */
    private final List<MuteThisAdReason> f8118f = new ArrayList();

    public p8(o8 o8Var) {
        t6 t6VarZzh;
        t6 r6Var;
        IBinder iBinder;
        this.a = o8Var;
        m6 m6Var = null;
        try {
            List listZzf = o8Var.zzf();
            if (listZzf != null) {
                for (Object obj : listZzf) {
                    if (!(obj instanceof IBinder) || (iBinder = (IBinder) obj) == null) {
                        r6Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        r6Var = iInterfaceQueryLocalInterface instanceof t6 ? (t6) iInterfaceQueryLocalInterface : new r6(iBinder);
                    }
                    if (r6Var != null) {
                        this.f8114b.add(new u6(r6Var));
                    }
                }
            }
        } catch (RemoteException e2) {
            er.zzg("", e2);
        }
        try {
            List listF = this.a.f();
            if (listF != null) {
                for (Object obj2 : listF) {
                    w0 w0VarI4 = obj2 instanceof IBinder ? v0.I4((IBinder) obj2) : null;
                    if (w0VarI4 != null) {
                        this.f8118f.add(new x0(w0VarI4));
                    }
                }
            }
        } catch (RemoteException e3) {
            er.zzg("", e3);
        }
        try {
            t6VarZzh = this.a.zzh();
        } catch (RemoteException e4) {
            er.zzg("", e4);
        }
        u6 u6Var = t6VarZzh != null ? new u6(t6VarZzh) : null;
        this.f8115c = u6Var;
        try {
            if (this.a.zzq() != null) {
                m6Var = new m6(this.a.zzq());
            }
        } catch (RemoteException e5) {
            er.zzg("", e5);
        }
        this.f8117e = m6Var;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void cancelUnconfirmedClick() {
        try {
            this.a.zzy();
        } catch (RemoteException e2) {
            er.zzg("Failed to cancelUnconfirmedClick", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void destroy() {
        try {
            this.a.zzp();
        } catch (RemoteException e2) {
            er.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void enableCustomClickGesture() {
        try {
            this.a.zzD();
        } catch (RemoteException e2) {
            er.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.f8117e;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getAdvertiser() {
        try {
            return this.a.zzj();
        } catch (RemoteException e2) {
            er.zzg("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getBody() {
        try {
            return this.a.zzg();
        } catch (RemoteException e2) {
            er.zzg("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getCallToAction() {
        try {
            return this.a.zzi();
        } catch (RemoteException e2) {
            er.zzg("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Bundle getExtras() {
        try {
            Bundle bundleZzw = this.a.zzw();
            if (bundleZzw != null) {
                return bundleZzw;
            }
        } catch (RemoteException e2) {
            er.zzg("", e2);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getHeadline() {
        try {
            return this.a.zze();
        } catch (RemoteException e2) {
            er.zzg("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final NativeAd.Image getIcon() {
        return this.f8115c;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final List<NativeAd.Image> getImages() {
        return this.f8114b;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final MediaContent getMediaContent() {
        try {
            if (this.a.zzF() != null) {
                return new h2(this.a.zzF());
            }
            return null;
        } catch (RemoteException e2) {
            er.zzg("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getMediationAdapterClassName() {
        try {
            return this.a.a();
        } catch (RemoteException e2) {
            er.zzg("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final List<MuteThisAdReason> getMuteThisAdReasons() {
        return this.f8118f;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getPrice() {
        try {
            return this.a.zzm();
        } catch (RemoteException e2) {
            er.zzg("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final ResponseInfo getResponseInfo() {
        k1 k1VarN;
        try {
            k1VarN = this.a.n();
        } catch (RemoteException e2) {
            er.zzg("", e2);
            k1VarN = null;
        }
        return ResponseInfo.zzb(k1VarN);
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Double getStarRating() {
        try {
            double dZzk = this.a.zzk();
            if (dZzk == -1.0d) {
                return null;
            }
            return Double.valueOf(dZzk);
        } catch (RemoteException e2) {
            er.zzg("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getStore() {
        try {
            return this.a.zzl();
        } catch (RemoteException e2) {
            er.zzg("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final VideoController getVideoController() {
        try {
            if (this.a.zzn() != null) {
                this.f8116d.zza(this.a.zzn());
            }
        } catch (RemoteException e2) {
            er.zzg("Exception occurred while getting video controller", e2);
        }
        return this.f8116d;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean isCustomClickGestureEnabled() {
        try {
            return this.a.q();
        } catch (RemoteException e2) {
            er.zzg("", e2);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.a.zzA();
        } catch (RemoteException e2) {
            er.zzg("", e2);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void muteThisAd(MuteThisAdReason muteThisAdReason) {
        try {
            try {
                if (this.a.zzA()) {
                    if (muteThisAdReason == null) {
                        this.a.A1(null);
                        return;
                    } else if (muteThisAdReason instanceof x0) {
                        this.a.A1(((x0) muteThisAdReason).a());
                        return;
                    } else {
                        er.zzf("Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null");
                        return;
                    }
                }
            } catch (RemoteException e2) {
                er.zzg("", e2);
            }
            er.zzf("Ad is not custom mute enabled");
        } catch (RemoteException e3) {
            er.zzg("", e3);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.a.G3(bundle);
        } catch (RemoteException e2) {
            er.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void recordCustomClickGesture() {
        try {
            this.a.zzE();
        } catch (RemoteException e2) {
            er.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.a.T2(bundle);
        } catch (RemoteException e2) {
            er.zzg("", e2);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.a.l2(bundle);
        } catch (RemoteException e2) {
            er.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void setMuteThisAdListener(MuteThisAdListener muteThisAdListener) {
        try {
            this.a.u3(new t0(muteThisAdListener));
        } catch (RemoteException e2) {
            er.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.a.g3(new w2(onPaidEventListener));
        } catch (RemoteException e2) {
            er.zzg("Failed to setOnPaidEventListener", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void setUnconfirmedClickListener(UnifiedNativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        try {
            this.a.q0(new z8(unconfirmedClickListener));
        } catch (RemoteException e2) {
            er.zzg("Failed to setUnconfirmedClickListener", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Object zza() {
        try {
            e.c.b.b.b.b bVarZzv = this.a.zzv();
            if (bVarZzv != null) {
                return e.c.b.b.b.d.Y(bVarZzv);
            }
            return null;
        } catch (RemoteException e2) {
            er.zzg("", e2);
            return null;
        }
    }
}