package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class oi implements View.OnClickListener {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ pi f7947e;

    oi(pi piVar) {
        this.f7947e = piVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f7947e.i(true);
    }
}