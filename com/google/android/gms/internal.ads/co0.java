package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class co0 implements mo2<nh0<VideoController.VideoLifecycleCallbacks>> {
    private final un0 a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<sq0> f5341b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<Executor> f5342c;

    public co0(un0 un0Var, wo2<sq0> wo2Var, wo2<Executor> wo2Var2) {
        this.a = un0Var;
        this.f5341b = wo2Var;
        this.f5342c = wo2Var2;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new nh0(((tq0) this.f5341b).zzb(), this.f5342c.zzb());
    }
}