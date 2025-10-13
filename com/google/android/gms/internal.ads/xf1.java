package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class xf1 implements zg1<Bundle> {
    private final Bundle a;

    public xf1(Bundle bundle) {
        this.a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zg1
    public final /* bridge */ /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        Bundle bundle3 = this.a;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
    }
}