package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class vz0 implements e42 {
    static final e42 a = new vz0();

    private vz0() {
    }

    @Override // com.google.android.gms.internal.ads.e42
    public final g52 zza(Object obj) {
        return y42.b(((ExecutionException) obj).getCause());
    }
}