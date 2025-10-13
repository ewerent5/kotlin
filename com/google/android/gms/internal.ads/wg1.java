package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class wg1 implements zg1 {
    private final Bundle a;

    wg1(Bundle bundle) {
        this.a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zg1
    public final void a(Object obj) {
        ((Bundle) obj).putBundle("shared_pref", this.a);
    }
}