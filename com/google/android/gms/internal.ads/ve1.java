package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ve1 implements zg1<Bundle> {
    private final String a;

    public ve1(String str) {
        this.a = str;
    }

    @Override // com.google.android.gms.internal.ads.zg1
    public final /* bridge */ /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (this.a.isEmpty()) {
            return;
        }
        bundle2.putString("inspector_extras", this.a);
    }
}