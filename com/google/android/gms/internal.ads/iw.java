package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class iw implements View.OnAttachStateChangeListener {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ho f6622e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ lw f6623f;

    iw(lw lwVar, ho hoVar) {
        this.f6623f = lwVar;
        this.f6622e = hoVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f6623f.m(view, this.f6622e, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}