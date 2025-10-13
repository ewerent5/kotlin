package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class qd1 implements ah1<zg1<Bundle>> {
    private final tl1 a;

    qd1(tl1 tl1Var) {
        this.a = tl1Var;
    }

    final /* synthetic */ void a(Bundle bundle) {
        bundle.putString("key_schema", this.a.a());
    }

    @Override // com.google.android.gms.internal.ads.ah1
    public final g52<zg1<Bundle>> zza() {
        tl1 tl1Var = this.a;
        zg1 zg1Var = null;
        if (tl1Var != null && tl1Var.a() != null && !this.a.a().isEmpty()) {
            zg1Var = new zg1(this) { // from class: com.google.android.gms.internal.ads.pd1
                private final qd1 a;

                {
                    this.a = this;
                }

                @Override // com.google.android.gms.internal.ads.zg1
                public final void a(Object obj) {
                    this.a.a((Bundle) obj);
                }
            };
        }
        return y42.a(zg1Var);
    }
}