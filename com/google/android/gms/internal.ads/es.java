package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class es {
    public static final void a(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        new fs(view, onGlobalLayoutListener).c();
    }

    public static final void b(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        new gs(view, onScrollChangedListener).c();
    }
}