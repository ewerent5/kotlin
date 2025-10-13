package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class je1 implements zg1<Bundle> {
    public final Bundle a;

    public je1(Bundle bundle) {
        this.a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zg1
    public final /* bridge */ /* synthetic */ void a(Bundle bundle) {
        bundle.putBundle("content_info", this.a);
    }
}