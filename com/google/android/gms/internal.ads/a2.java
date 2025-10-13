package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final class a2 extends z0 {
    /* synthetic */ a2(z1 z1Var) {
    }

    @Override // com.google.android.gms.internal.ads.a1
    public final void F(@Nullable g93 g93Var) {
        OnAdInspectorClosedListener onAdInspectorClosedListener = c2.a().f5243g;
        if (onAdInspectorClosedListener != null) {
            onAdInspectorClosedListener.onAdInspectorClosed(g93Var == null ? null : new AdInspectorError(g93Var.f6091e, g93Var.f6092f, g93Var.f6093g));
        }
    }
}