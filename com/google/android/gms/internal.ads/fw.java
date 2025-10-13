package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class fw implements Runnable {

    /* renamed from: e */
    private final lw f5961e;

    /* renamed from: f */
    private final View f5962f;

    /* renamed from: g */
    private final ho f5963g;

    /* renamed from: h */
    private final int f5964h;

    fw(lw lwVar, View view, ho hoVar, int i2) {
        this.f5961e = lwVar;
        this.f5962f = view;
        this.f5963g = hoVar;
        this.f5964h = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5961e.c(this.f5962f, this.f5963g, this.f5964h);
    }
}