package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class pf1 implements zg1<Bundle> {
    public final String a;

    public pf1(String str) {
        this.a = str;
    }

    @Override // com.google.android.gms.internal.ads.zg1
    public final /* bridge */ /* synthetic */ void a(Bundle bundle) {
        cq1.e(bundle, "omid_v", this.a);
    }
}