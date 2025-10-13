package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class di0 implements rf0 {
    static final rf0 a = new di0();

    private di0() {
    }

    @Override // com.google.android.gms.internal.ads.rf0
    public final void zza(Object obj) {
        ((VideoController.VideoLifecycleCallbacks) obj).onVideoPause();
    }
}