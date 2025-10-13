package com.google.android.gms.internal.ads;

import java.security.Provider;
import javax.crypto.Mac;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class kg2 implements ng2<Mac> {
    @Override // com.google.android.gms.internal.ads.ng2
    public final /* bridge */ /* synthetic */ Mac a(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }
}