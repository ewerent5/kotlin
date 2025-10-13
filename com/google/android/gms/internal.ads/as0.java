package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class as0 implements jb0 {

    /* renamed from: e, reason: collision with root package name */
    private final ew f4987e;

    as0(ew ewVar) {
        this.f4987e = ewVar;
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final void c(Context context) {
        ew ewVar = this.f4987e;
        if (ewVar != null) {
            ewVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final void u(Context context) {
        ew ewVar = this.f4987e;
        if (ewVar != null) {
            ewVar.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final void x(Context context) {
        ew ewVar = this.f4987e;
        if (ewVar != null) {
            ewVar.onResume();
        }
    }
}