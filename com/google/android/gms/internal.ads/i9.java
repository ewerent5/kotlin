package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzs;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class i9 implements x02 {
    static final x02 a = new i9();

    private i9() {
    }

    @Override // com.google.android.gms.internal.ads.x02
    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        ba<ew> baVar = aa.a;
        if (!k5.f6965j.e().booleanValue()) {
            return "failure_click_attok";
        }
        zzs.zzg().g(th, "prepareClickUrl.attestation1");
        return "failure_click_attok";
    }
}