package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class wp0 implements e6 {
    final /* synthetic */ xp0 a;

    wp0(xp0 xp0Var) {
        this.a = xp0Var;
    }

    @Override // com.google.android.gms.internal.ads.e6
    public final void a(MotionEvent motionEvent) {
    }

    @Override // com.google.android.gms.internal.ads.e6
    public final void zza() {
        if (this.a.f10212h != null) {
            this.a.f10212h.w("_videoMediaView");
        }
    }

    @Override // com.google.android.gms.internal.ads.e6
    public final JSONObject zzc() {
        return null;
    }
}