package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ji0 implements mo2<ii0> {
    private final wo2<Set<nh0<VideoController.VideoLifecycleCallbacks>>> a;

    public ji0(wo2<Set<nh0<VideoController.VideoLifecycleCallbacks>>> wo2Var) {
        this.a = wo2Var;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new ii0(((uo2) this.a).zzb());
    }
}