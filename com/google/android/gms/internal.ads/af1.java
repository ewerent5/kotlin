package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class af1 implements zg1<Bundle> {
    public final Bundle a;

    public af1(Bundle bundle) {
        this.a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zg1
    public final /* bridge */ /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        Bundle bundleA = cq1.a(bundle2, "device");
        bundleA.putBundle("android_mem_info", this.a);
        bundle2.putBundle("device", bundleA);
    }
}