package com.google.android.gms.ads;

import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.internal.ads.c3;
import com.google.android.gms.internal.ads.er;
import com.google.android.gms.internal.ads.n1;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class VideoController {
    public static final int PLAYBACK_STATE_ENDED = 3;
    public static final int PLAYBACK_STATE_PAUSED = 2;
    public static final int PLAYBACK_STATE_PLAYING = 1;
    public static final int PLAYBACK_STATE_READY = 5;
    public static final int PLAYBACK_STATE_UNKNOWN = 0;
    private final Object zza = new Object();

    @GuardedBy("lock")
    private n1 zzb;

    @GuardedBy("lock")
    private VideoLifecycleCallbacks zzc;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
    public static abstract class VideoLifecycleCallbacks {
        public void onVideoEnd() {
        }

        public void onVideoMute(boolean z) {
        }

        public void onVideoPause() {
        }

        public void onVideoPlay() {
        }

        public void onVideoStart() {
        }
    }

    public int getPlaybackState() {
        synchronized (this.zza) {
            n1 n1Var = this.zzb;
            if (n1Var == null) {
                return 0;
            }
            try {
                return n1Var.zzi();
            } catch (RemoteException e2) {
                er.zzg("Unable to call getPlaybackState on video controller.", e2);
                return 0;
            }
        }
    }

    @RecentlyNullable
    public VideoLifecycleCallbacks getVideoLifecycleCallbacks() {
        VideoLifecycleCallbacks videoLifecycleCallbacks;
        synchronized (this.zza) {
            videoLifecycleCallbacks = this.zzc;
        }
        return videoLifecycleCallbacks;
    }

    public boolean hasVideoContent() {
        boolean z;
        synchronized (this.zza) {
            z = this.zzb != null;
        }
        return z;
    }

    public boolean isClickToExpandEnabled() {
        synchronized (this.zza) {
            n1 n1Var = this.zzb;
            if (n1Var == null) {
                return false;
            }
            try {
                return n1Var.zzp();
            } catch (RemoteException e2) {
                er.zzg("Unable to call isClickToExpandEnabled.", e2);
                return false;
            }
        }
    }

    public boolean isCustomControlsEnabled() {
        synchronized (this.zza) {
            n1 n1Var = this.zzb;
            if (n1Var == null) {
                return false;
            }
            try {
                return n1Var.zzn();
            } catch (RemoteException e2) {
                er.zzg("Unable to call isUsingCustomPlayerControls.", e2);
                return false;
            }
        }
    }

    public boolean isMuted() {
        synchronized (this.zza) {
            n1 n1Var = this.zzb;
            if (n1Var == null) {
                return true;
            }
            try {
                return n1Var.zzh();
            } catch (RemoteException e2) {
                er.zzg("Unable to call isMuted on video controller.", e2);
                return true;
            }
        }
    }

    public void mute(boolean z) {
        synchronized (this.zza) {
            n1 n1Var = this.zzb;
            if (n1Var != null) {
                try {
                    n1Var.zzg(z);
                } catch (RemoteException e2) {
                    er.zzg("Unable to call mute on video controller.", e2);
                }
            }
        }
    }

    public void pause() {
        synchronized (this.zza) {
            n1 n1Var = this.zzb;
            if (n1Var != null) {
                try {
                    n1Var.zzf();
                } catch (RemoteException e2) {
                    er.zzg("Unable to call pause on video controller.", e2);
                }
            }
        }
    }

    public void play() {
        synchronized (this.zza) {
            n1 n1Var = this.zzb;
            if (n1Var != null) {
                try {
                    n1Var.zze();
                } catch (RemoteException e2) {
                    er.zzg("Unable to call play on video controller.", e2);
                }
            }
        }
    }

    public void setVideoLifecycleCallbacks(@RecentlyNonNull VideoLifecycleCallbacks videoLifecycleCallbacks) {
        p.k(videoLifecycleCallbacks, "VideoLifecycleCallbacks may not be null.");
        synchronized (this.zza) {
            this.zzc = videoLifecycleCallbacks;
            n1 n1Var = this.zzb;
            if (n1Var != null) {
                try {
                    n1Var.R2(new c3(videoLifecycleCallbacks));
                } catch (RemoteException e2) {
                    er.zzg("Unable to call setVideoLifecycleCallbacks on video controller.", e2);
                }
            }
        }
    }

    public void stop() {
        synchronized (this.zza) {
            n1 n1Var = this.zzb;
            if (n1Var != null) {
                try {
                    n1Var.zzq();
                } catch (RemoteException e2) {
                    er.zzg("Unable to call stop on video controller.", e2);
                }
            }
        }
    }

    public final void zza(n1 n1Var) {
        synchronized (this.zza) {
            this.zzb = n1Var;
            VideoLifecycleCallbacks videoLifecycleCallbacks = this.zzc;
            if (videoLifecycleCallbacks != null) {
                setVideoLifecycleCallbacks(videoLifecycleCallbacks);
            }
        }
    }

    public final n1 zzb() {
        n1 n1Var;
        synchronized (this.zza) {
            n1Var = this.zzb;
        }
        return n1Var;
    }
}