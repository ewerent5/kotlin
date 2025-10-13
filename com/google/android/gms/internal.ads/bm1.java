package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.y90;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class bm1<RequestComponentT extends y90<AdT>, AdT> implements mm1<RequestComponentT, AdT> {

    @GuardedBy("this")
    private RequestComponentT a;

    @Override // com.google.android.gms.internal.ads.mm1
    public final synchronized g52<AdT> a(nm1 nm1Var, lm1<RequestComponentT> lm1Var) {
        w70<AdT> w70VarZzc;
        RequestComponentT requestcomponenttZzf = lm1Var.a(nm1Var.f7749b).zzf();
        this.a = requestcomponenttZzf;
        w70VarZzc = requestcomponenttZzf.zzc();
        return w70VarZzc.c(w70VarZzc.b());
    }

    @Override // com.google.android.gms.internal.ads.mm1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized RequestComponentT zzc() {
        return this.a;
    }
}