package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class xz0 implements e42 {
    private final ql a;

    xz0(ql qlVar) {
        this.a = qlVar;
    }

    @Override // com.google.android.gms.internal.ads.e42
    public final g52 zza(Object obj) {
        ql qlVar = this.a;
        qlVar.n = new String(a32.a((InputStream) obj), u02.f9331c);
        return y42.a(qlVar);
    }
}