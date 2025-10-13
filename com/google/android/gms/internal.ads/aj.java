package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class aj extends NativeAd {
    private final o8 a;

    /* renamed from: c, reason: collision with root package name */
    private final zi f4916c;

    /* renamed from: d, reason: collision with root package name */
    private final NativeAd.AdChoicesInfo f4917d;

    /* renamed from: b, reason: collision with root package name */
    private final List<NativeAd.Image> f4915b = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final List<MuteThisAdReason> f4918e = new ArrayList();

    public aj(o8 o8Var) {
        t6 t6VarZzh;
        this.a = o8Var;
        xi xiVar = null;
        try {
            List listZzf = o8Var.zzf();
            if (listZzf != null) {
                for (Object obj : listZzf) {
                    t6 t6VarI4 = obj instanceof IBinder ? s6.I4((IBinder) obj) : null;
                    if (t6VarI4 != null) {
                        this.f4915b.add(new zi(t6VarI4));
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
                        this.f4918e.add(new x0(w0VarI4));
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
        zi ziVar = t6VarZzh != null ? new zi(t6VarZzh) : null;
        this.f4916c = ziVar;
        try {
            if (this.a.zzq() != null) {
                xiVar = new xi(this.a.zzq());
            }
        } catch (RemoteException e5) {
            er.zzg("", e5);
        }
        this.f4917d = xiVar;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void cancelUnconfirmedClick() {
        try {
            this.a.zzy();
        } catch (RemoteException e2) {
            er.zzg("Failed to cancelUnconfirmedClick", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void destroy() {
        try {
            this.a.zzp();
        } catch (RemoteException e2) {
            er.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void enableCustomClickGesture() {
        try {
            this.a.zzD();
        } catch (RemoteException e2) {
            er.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.f4917d;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getAdvertiser() {
        try {
            return this.a.zzj();
        } catch (RemoteException e2) {
            er.zzg("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getBody() {
        try {
            return this.a.zzg();
        } catch (RemoteException e2) {
            er.zzg("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getCallToAction() {
        try {
            return this.a.zzi();
        } catch (RemoteException e2) {
            er.zzg("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
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

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getHeadline() {
        try {
            return this.a.zze();
        } catch (RemoteException e2) {
            er.zzg("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final NativeAd.Image getIcon() {
        return this.f4916c;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final List<NativeAd.Image> getImages() {
        return this.f4915b;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
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

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final List<MuteThisAdReason> getMuteThisAdReasons() {
        return this.f4918e;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getPrice() {
        try {
            return this.a.zzm();
        } catch (RemoteException e2) {
            er.zzg("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
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

    @Override // com.google.android.gms.ads.nativead.NativeAd
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

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getStore() {
        try {
            return this.a.zzl();
        } catch (RemoteException e2) {
            er.zzg("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean isCustomClickGestureEnabled() {
        try {
            return this.a.q();
        } catch (RemoteException e2) {
            er.zzg("", e2);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.a.zzA();
        } catch (RemoteException e2) {
            er.zzg("", e2);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
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

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.a.G3(bundle);
        } catch (RemoteException e2) {
            er.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void recordCustomClickGesture() {
        try {
            this.a.zzE();
        } catch (RemoteException e2) {
            er.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.a.T2(bundle);
        } catch (RemoteException e2) {
            er.zzg("", e2);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.a.l2(bundle);
        } catch (RemoteException e2) {
            er.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setMuteThisAdListener(MuteThisAdListener muteThisAdListener) {
        try {
            this.a.u3(new t0(muteThisAdListener));
        } catch (RemoteException e2) {
            er.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.a.g3(new w2(onPaidEventListener));
        } catch (RemoteException e2) {
            er.zzg("Failed to setOnPaidEventListener", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setUnconfirmedClickListener(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        try {
            this.a.q0(new hj(unconfirmedClickListener));
        } catch (RemoteException e2) {
            er.zzg("Failed to setUnconfirmedClickListener", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    protected final /* bridge */ /* synthetic */ Object zza() {
        try {
            return this.a.zzu();
        } catch (RemoteException e2) {
            er.zzg("", e2);
            return null;
        }
    }
}