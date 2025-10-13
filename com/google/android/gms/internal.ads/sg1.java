package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class sg1 implements zg1 {
    static final zg1 a = new sg1();

    private sg1() {
    }

    @Override // com.google.android.gms.internal.ads.zg1
    public final void a(Object obj) {
        ((Bundle) obj).putBoolean("sdk_prefetch", true);
    }
}