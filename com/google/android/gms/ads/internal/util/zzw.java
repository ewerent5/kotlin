package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@TargetApi(19)
/* loaded from: classes.dex */
public class zzw extends zzv {
    @Override // com.google.android.gms.ads.internal.util.zzv, com.google.android.gms.ads.internal.util.zzac
    public final boolean zzg(View view) {
        return view.isAttachedToWindow();
    }

    @Override // com.google.android.gms.ads.internal.util.zzac
    public final ViewGroup.LayoutParams zzj() {
        return new ViewGroup.LayoutParams(-1, -1);
    }
}