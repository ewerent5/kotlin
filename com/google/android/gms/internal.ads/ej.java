package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class ej {
    private final NativeCustomFormatAd.OnCustomFormatAdLoadedListener a;

    /* renamed from: b, reason: collision with root package name */
    private final NativeCustomFormatAd.OnCustomClickListener f5649b;

    /* renamed from: c, reason: collision with root package name */
    private NativeCustomFormatAd f5650c;

    public ej(NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
        this.a = onCustomFormatAdLoadedListener;
        this.f5649b = onCustomClickListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized NativeCustomFormatAd f(k7 k7Var) {
        NativeCustomFormatAd nativeCustomFormatAd = this.f5650c;
        if (nativeCustomFormatAd != null) {
            return nativeCustomFormatAd;
        }
        fj fjVar = new fj(k7Var);
        this.f5650c = fjVar;
        return fjVar;
    }

    public final x7 a() {
        return new dj(this, null);
    }

    public final u7 b() {
        bj bjVar = null;
        if (this.f5649b == null) {
            return null;
        }
        return new cj(this, bjVar);
    }
}