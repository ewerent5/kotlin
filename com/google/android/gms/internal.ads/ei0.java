package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class ei0 implements rf0 {
    static final rf0 a = new ei0();

    private ei0() {
    }

    @Override // com.google.android.gms.internal.ads.rf0
    public final void zza(Object obj) {
        ((VideoController.VideoLifecycleCallbacks) obj).onVideoEnd();
    }
}