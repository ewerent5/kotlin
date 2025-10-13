package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ig1 implements zg1<Bundle> {
    private final String a;

    public ig1(String str) {
        this.a = str;
    }

    @Override // com.google.android.gms.internal.ads.zg1
    public final /* bridge */ /* synthetic */ void a(Bundle bundle) {
        bundle.putString("rtb", this.a);
    }
}