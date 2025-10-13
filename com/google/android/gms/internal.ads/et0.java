package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class et0 implements mo2<Set<nh0<tt1>>> {
    private final wo2<Executor> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<wt0> f5693b;

    public et0(wo2<Executor> wo2Var, wo2<wt0> wo2Var2) {
        this.a = wo2Var;
        this.f5693b = wo2Var2;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        Set setSingleton = ((Boolean) c.c().b(w3.c3)).booleanValue() ? Collections.singleton(new nh0(((xt0) this.f5693b).zzb(), h52Var)) : Collections.emptySet();
        ro2.b(setSingleton);
        return setSingleton;
    }
}