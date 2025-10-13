package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.AdapterStatus;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class fc implements AdapterStatus {
    private final AdapterStatus.State a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5838b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5839c;

    public fc(AdapterStatus.State state, String str, int i2) {
        this.a = state;
        this.f5838b = str;
        this.f5839c = i2;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final String getDescription() {
        return this.f5838b;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final AdapterStatus.State getInitializationState() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final int getLatency() {
        return this.f5839c;
    }
}