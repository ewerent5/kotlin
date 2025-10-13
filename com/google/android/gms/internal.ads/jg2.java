package com.google.android.gms.internal.ads;

import java.security.KeyPairGenerator;
import java.security.Provider;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class jg2 implements ng2<KeyPairGenerator> {
    @Override // com.google.android.gms.internal.ads.ng2
    public final /* bridge */ /* synthetic */ KeyPairGenerator a(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }
}