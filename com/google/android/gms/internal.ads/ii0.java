package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Set;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ii0 extends sf0<VideoController.VideoLifecycleCallbacks> {

    /* renamed from: f, reason: collision with root package name */
    @GuardedBy("this")
    private boolean f6533f;

    protected ii0(Set<nh0<VideoController.VideoLifecycleCallbacks>> set) {
        super(set);
    }

    public final void K0() {
        J0(ei0.a);
    }

    public final void zza() {
        J0(di0.a);
    }

    public final synchronized void zzc() {
        J0(fi0.a);
        this.f6533f = true;
    }

    public final synchronized void zzd() {
        if (!this.f6533f) {
            J0(gi0.a);
            this.f6533f = true;
        }
        J0(hi0.a);
    }
}