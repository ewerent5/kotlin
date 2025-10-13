package com.google.android.gms.internal.ads;

import java.security.Provider;
import javax.crypto.KeyAgreement;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class hg2 implements ng2<KeyAgreement> {
    @Override // com.google.android.gms.internal.ads.ng2
    public final /* bridge */ /* synthetic */ KeyAgreement a(String str, Provider provider) {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }
}