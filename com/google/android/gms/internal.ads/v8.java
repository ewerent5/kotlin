package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class v8 {
    private final NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener a;

    /* renamed from: b, reason: collision with root package name */
    private final NativeCustomTemplateAd.OnCustomClickListener f9668b;

    /* renamed from: c, reason: collision with root package name */
    private NativeCustomTemplateAd f9669c;

    public v8(NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
        this.a = onCustomTemplateAdLoadedListener;
        this.f9668b = onCustomClickListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized NativeCustomTemplateAd f(k7 k7Var) {
        NativeCustomTemplateAd nativeCustomTemplateAd = this.f9669c;
        if (nativeCustomTemplateAd != null) {
            return nativeCustomTemplateAd;
        }
        l7 l7Var = new l7(k7Var);
        this.f9669c = l7Var;
        return l7Var;
    }

    public final x7 a() {
        return new u8(this, null);
    }

    public final u7 b() {
        s8 s8Var = null;
        if (this.f9668b == null) {
            return null;
        }
        return new t8(this, s8Var);
    }
}