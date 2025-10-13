package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.y90;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class cm1<RequestComponentT extends y90<AdT>, AdT> implements mm1<RequestComponentT, AdT> {
    private final mm1<RequestComponentT, AdT> a;

    /* renamed from: b, reason: collision with root package name */
    @GuardedBy("this")
    private RequestComponentT f5332b;

    public cm1(mm1<RequestComponentT, AdT> mm1Var) {
        this.a = mm1Var;
    }

    @Override // com.google.android.gms.internal.ads.mm1
    public final synchronized g52<AdT> a(nm1 nm1Var, lm1<RequestComponentT> lm1Var) {
        if (nm1Var.a == null) {
            g52<AdT> g52VarA = this.a.a(nm1Var, lm1Var);
            this.f5332b = (RequestComponentT) ((bm1) this.a).zzc();
            return g52VarA;
        }
        RequestComponentT requestcomponenttZzf = lm1Var.a(nm1Var.f7749b).zzf();
        this.f5332b = requestcomponenttZzf;
        w70<AdT> w70VarZzc = requestcomponenttZzf.zzc();
        return w70VarZzc.c(w70VarZzc.a(y42.a(nm1Var.a)));
    }

    @Override // com.google.android.gms.internal.ads.mm1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized RequestComponentT zzc() {
        return this.f5332b;
    }
}