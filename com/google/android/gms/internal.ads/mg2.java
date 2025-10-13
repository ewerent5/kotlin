package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.security.Signature;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class mg2 implements ng2<Signature> {
    @Override // com.google.android.gms.internal.ads.ng2
    public final /* bridge */ /* synthetic */ Signature a(String str, Provider provider) {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }
}