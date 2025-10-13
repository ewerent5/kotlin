package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class dc1 implements zg1 {
    private final String a;

    dc1(String str) {
        this.a = str;
    }

    @Override // com.google.android.gms.internal.ads.zg1
    public final void a(Object obj) {
        ((Bundle) obj).putString("ms", this.a);
    }
}