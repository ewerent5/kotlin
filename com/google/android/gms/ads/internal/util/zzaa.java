package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzaa implements View.OnApplyWindowInsetsListener {
    private final zzab zza;
    private final Activity zzb;

    zzaa(zzab zzabVar, Activity activity) {
        this.zza = zzabVar;
        this.zzb = activity;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return zzab.zzs(this.zzb, view, windowInsets);
    }
}