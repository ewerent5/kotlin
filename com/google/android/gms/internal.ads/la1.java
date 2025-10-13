package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class la1 implements zl1 {
    private final Pair a;

    la1(Pair pair) {
        this.a = pair;
    }

    @Override // com.google.android.gms.internal.ads.zl1
    public final void zza(Object obj) {
        Pair pair = this.a;
        ((e0) obj).o((String) pair.first, (String) pair.second);
    }
}