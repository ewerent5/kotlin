package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class wf1 implements ah1<xf1> {
    private final h52 a;

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f9957b;

    public wf1(h52 h52Var, Bundle bundle) {
        this.a = h52Var;
        this.f9957b = bundle;
    }

    final /* synthetic */ xf1 a() {
        return new xf1(this.f9957b);
    }

    @Override // com.google.android.gms.internal.ads.ah1
    public final g52<xf1> zza() {
        return this.a.N(new Callable(this) { // from class: com.google.android.gms.internal.ads.vf1
            private final wf1 a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.a();
            }
        });
    }
}