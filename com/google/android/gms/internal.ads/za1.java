package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class za1 implements ad0 {

    /* renamed from: e, reason: collision with root package name */
    private final AtomicReference<h1> f10576e = new AtomicReference<>();

    public final void a(h1 h1Var) {
        this.f10576e.set(h1Var);
    }

    @Override // com.google.android.gms.internal.ads.ad0
    public final void c(final t93 t93Var) {
        am1.a(this.f10576e, new zl1(t93Var) { // from class: com.google.android.gms.internal.ads.ya1
            private final t93 a;

            {
                this.a = t93Var;
            }

            @Override // com.google.android.gms.internal.ads.zl1
            public final void zza(Object obj) {
                ((h1) obj).W2(this.a);
            }
        });
    }
}