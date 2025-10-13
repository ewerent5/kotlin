package com.google.android.gms.internal.ads;

import java.security.KeyFactory;
import java.security.Provider;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ig2 implements ng2<KeyFactory> {
    @Override // com.google.android.gms.internal.ads.ng2
    public final /* bridge */ /* synthetic */ KeyFactory a(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}