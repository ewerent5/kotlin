package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class j23 extends d0 {

    /* renamed from: e, reason: collision with root package name */
    private final AppEventListener f6664e;

    public j23(AppEventListener appEventListener) {
        this.f6664e = appEventListener;
    }

    public final AppEventListener J4() {
        return this.f6664e;
    }

    @Override // com.google.android.gms.internal.ads.e0
    public final void o(String str, String str2) {
        this.f6664e.onAppEvent(str, str2);
    }
}