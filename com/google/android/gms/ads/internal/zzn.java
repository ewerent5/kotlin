package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class zzn implements View.OnTouchListener {
    final /* synthetic */ zzr zza;

    zzn(zzr zzrVar) {
        this.zza = zzrVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.zza.zzh == null) {
            return false;
        }
        this.zza.zzh.d(motionEvent);
        return false;
    }
}