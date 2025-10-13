package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.util.zzak;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class zzi extends RelativeLayout {
    final zzak zza;
    boolean zzb;

    public zzi(Context context, String str, String str2, String str3) {
        super(context);
        zzak zzakVar = new zzak(context, str);
        this.zza = zzakVar;
        zzakVar.zzd(str2);
        zzakVar.zzc(str3);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.zzb) {
            return false;
        }
        this.zza.zza(motionEvent);
        return false;
    }
}