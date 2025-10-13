package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzs;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class k9 implements x02 {
    private final String a;

    k9(String str) {
        this.a = str;
    }

    @Override // com.google.android.gms.internal.ads.x02
    public final Object apply(Object obj) {
        String str = this.a;
        Throwable th = (Throwable) obj;
        ba<ew> baVar = aa.a;
        if (k5.f6965j.e().booleanValue()) {
            zzs.zzg().g(th, "prepareClickUrl.attestation2");
        }
        return str;
    }
}